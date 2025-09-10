package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hxx implements mcw {
    private static final sgv a = sgv.g("hxx");
    private final tzj b;
    private final uem c;
    private final hfw d;
    private final pbn e;

    public hxx(tzj tzjVar, uem uemVar, hfw hfwVar, pbn pbnVar) {
        this.b = tzjVar;
        this.c = uemVar;
        this.d = hfwVar;
        this.e = pbnVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws CameraAccessException {
        if (((Context) this.b.a()).checkSelfPermission("android.permission.CAMERA") != 0) {
            ((sgt) a.c().M(1695)).s("CAMERA permission is missing. Cannot prewarm Gcam.");
            return;
        }
        hfv hfvVarA = this.d.a();
        if (hfvVarA == null || !hfvVarA.a) {
            ((sgt) a.c().M(1693)).s("Cameras aren't available yet. Cannot prewarm Gcam.");
            return;
        }
        pbn pbnVar = this.e;
        uem uemVar = this.c;
        uemVar.getClass();
        pbnVar.e("Gcam.prewarm", new hjp(uemVar, 8));
    }
}
