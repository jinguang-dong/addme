package defpackage;

import com.google.android.libraries.vision.visionkit.pipeline.NativePipelineImpl;

/* compiled from: PG */
/* loaded from: classes.dex */
public class rgt {
    public final rgr a;
    public long b;
    private final long c;
    private final long d;
    private final long e;
    private final long f;
    private final ocq g;

    public rgt(rgu rguVar) {
        tow towVarA = tow.a();
        if (towVarA == null) {
            tra traVar = tra.a;
            towVarA = tow.a;
        }
        if (rguVar.c == 5 && ((Boolean) rguVar.d).booleanValue()) {
            this.a = new rgs();
        } else if (rguVar.c == 6 && ((Boolean) rguVar.d).booleanValue()) {
            this.a = new NativePipelineImpl(this, this, towVarA);
        } else {
            this.a = new NativePipelineImpl(this, this, towVarA, null);
        }
        if ((rguVar.b & 32) != 0) {
            this.g = new ocq((char[]) null, (byte[]) null);
        } else {
            this.g = new ocq((char[]) null, (byte[]) null);
        }
        long jInitializeFrameManager = this.a.initializeFrameManager();
        this.c = jInitializeFrameManager;
        long jInitializeFrameBufferReleaseCallback = this.a.initializeFrameBufferReleaseCallback(jInitializeFrameManager);
        this.d = jInitializeFrameBufferReleaseCallback;
        long jInitializeResultsCallback = this.a.initializeResultsCallback();
        this.e = jInitializeResultsCallback;
        long jInitializeIsolationCallback = this.a.initializeIsolationCallback();
        this.f = jInitializeIsolationCallback;
        this.b = this.a.initialize(rguVar.h(), jInitializeFrameBufferReleaseCallback, jInitializeResultsCallback, jInitializeIsolationCallback, 0L, 0L);
    }

    public void a(long j) {
        this.g.U(j);
    }

    public void b(rgw rgwVar) {
        rge rgeVar = rge.a;
        String strValueOf = String.valueOf(String.valueOf(rgwVar));
        Object[] objArr = new Object[0];
        if (rgeVar.d(4)) {
            rgeVar.b(this, "Pipeline received results: ".concat(strValueOf), objArr);
        }
    }

    public final synchronized void c() {
        long j = this.b;
        if (j != 0) {
            rgr rgrVar = this.a;
            rgrVar.stop(j);
            rgrVar.close(this.b, this.c, this.d, this.e, this.f);
            this.b = 0L;
            rgrVar.a();
        }
    }
}
