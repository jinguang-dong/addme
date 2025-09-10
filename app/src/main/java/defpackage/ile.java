package defpackage;

import com.google.android.apps.camera.imax.cyclops.capture.TrackerStats;
import com.google.android.libraries.vision.opengl.Texture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ile implements AutoCloseable, ilb {
    public static final sgv a = sgv.g("ile");
    public final ilg b;
    public final ilc c;
    public final ikr d;
    public ilf e;
    public boolean f;
    public boolean g;
    public ila h;
    public Texture i;
    public double j;
    public int k;
    public iiu l;
    private final float[] m;
    private final float[] n;
    private final TrackerStats o;

    public ile() {
        ilc ilcVar = new ilc();
        ilg ilgVar = new ilg();
        this.m = new float[]{0.0f, 0.0f, 0.0f};
        this.n = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        this.o = new TrackerStats();
        this.d = ((iks) ilh.a(iks.class)).a();
        this.e = null;
        this.f = false;
        this.g = false;
        this.h = null;
        this.i = null;
        this.l = null;
        this.j = 3.4028234663852886E38d;
        this.k = 0;
        this.c = ilcVar;
        this.b = ilgVar;
    }

    @Override // defpackage.ilb
    public final synchronized void a(float[] fArr, long j) {
        if (this.f && !this.g) {
            ilf ilfVar = this.e;
            float[] fArr2 = this.n;
            ilfVar.e(fArr2);
            double dA = this.e.a();
            if (Math.abs(dA - this.j) < 0.5d) {
                this.k++;
                return;
            }
            this.j = dA;
            ikr ikrVar = this.d;
            ikrVar.trackTexture(this.m, fArr2);
            TrackerStats trackerStats = this.o;
            ikrVar.getTrackerStats(trackerStats);
            this.b.a(trackerStats);
            this.c.a(fArr, j);
        }
    }

    @Override // defpackage.ilb
    public final void c(Texture texture, ila ilaVar) {
        this.i = texture;
        this.h = ilaVar;
        this.c.c(texture, ilaVar);
        int i = ilaVar.a;
        float f = ilaVar.d;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.d.release();
    }

    @Override // defpackage.ilb
    public final synchronized void d() {
        if (this.f && !this.g) {
            this.c.d();
        }
    }

    @Override // defpackage.ilb
    public final void e(iiu iiuVar) {
        this.l = iiuVar;
        this.c.g = iiuVar;
    }

    public final void f() {
        this.c.f = 24000000;
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [sgt, shi] */
    public final void g(String str) {
        int i;
        synchronized (this) {
            if (this.f) {
                int iA = 0;
                this.f = false;
                this.g = false;
                ilc ilcVar = this.c;
                ilx ilxVar = ilcVar.b;
                if (ilxVar != null) {
                    ilxVar.f = false;
                    ilw ilwVar = ilxVar.e;
                    ilwVar.sendMessage(ilwVar.obtainMessage(2));
                    ilwVar.sendMessage(ilwVar.obtainMessage(3));
                    try {
                        ilxVar.d.getThread().join();
                    } catch (InterruptedException e) {
                        ((sgt) ((sgt) ilx.a.b().i(e)).M((char) 2162)).v("%s", e.getMessage());
                    }
                }
                iky ikyVar = ilcVar.d;
                if (ikyVar != null) {
                    ikyVar.a();
                }
                ilcVar.g.a(new hvm(ilcVar, 20));
                ilx ilxVar2 = ilcVar.b;
                if (ilxVar2 != null) {
                    iA = ilxVar2.a();
                    i = ilcVar.b.c.k;
                } else {
                    i = 0;
                }
                ilcVar.b = null;
                ilcVar.d = null;
                int iStopCapture = this.d.stopCapture(str);
                this.l.a(new ild(this, 1));
                if (iA != iStopCapture || i > 0) {
                    ((sgt) ((sgt) a.b().h(shx.a, "ImaxCaptureModule")).M(2120)).G("Recorded video stream is out-of-sync with tracking\n%d frames recorded with %d packets dropped, but %d frames tracked", Integer.valueOf(iA), Integer.valueOf(i), Integer.valueOf(iStopCapture));
                } else if (this.k > 0) {
                    shl shlVar = shx.a;
                }
            }
        }
    }

    @Override // defpackage.ilb
    public final void b(int i, int i2) {
    }
}
