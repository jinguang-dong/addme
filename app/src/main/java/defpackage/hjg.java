package defpackage;

import com.google.android.apps.camera.jni.facebeautification.FaceBeautificationNative;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
class hjg implements hke {
    public static final sgv a = sgv.g("hjg");
    public final int b;
    public final Executor c;
    public final long d;
    public final boolean e;
    private final kjc f;

    public hjg(pnq pnqVar, kjc kjcVar, Executor executor, int i, hbj hbjVar) {
        this.f = kjcVar;
        this.c = executor;
        this.b = i;
        boolean zP = hbjVar.p(gyw.j);
        this.e = zP;
        boolean zP2 = hbjVar.p(gyw.d);
        boolean zP3 = hbjVar.p(gyw.l);
        boolean zP4 = hbjVar.p(gyw.k);
        int i2 = 0;
        if (!pnqVar.d && !pnqVar.c && !pnqVar.e && !pnqVar.f && !pnqVar.g() && !pnqVar.g && !pnqVar.h && !pnqVar.i && !pnqVar.h()) {
            i2 = 1;
        }
        this.d = FaceBeautificationNative.createHandle(i2, i, zP, zP2, zP3, zP4);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, poj] */
    @Override // defpackage.hke
    public final syu a(hkk hkkVar) {
        return !((ltr) hkkVar.d).b() ? ske.M(new hjt(hkkVar.a)) : this.f.a(new hje(this, hkkVar));
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        this.c.execute(new Runnable() { // from class: hjd
            @Override // java.lang.Runnable
            public final void run() {
                FaceBeautificationNative.releaseHandle(this.a.d);
            }
        });
    }
}
