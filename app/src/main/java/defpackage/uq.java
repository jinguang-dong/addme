package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.util.Log;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uq implements ta {
    public final Object a = new Object();
    public boolean b;
    private final rm c;

    public uq(rm rmVar) {
        this.c = rmVar;
    }

    @Override // defpackage.ta
    public final CaptureRequest.Builder a(int i) {
        throw null;
    }

    @Override // defpackage.ta
    public final CaptureRequest.Builder b(TotalCaptureResult totalCaptureResult) {
        throw null;
    }

    @Override // defpackage.ri
    public final Object c(ukx ukxVar) {
        return this.c.c(ukxVar);
    }

    @Override // defpackage.ta
    public final String d() {
        return this.c.a;
    }

    @Override // defpackage.sc
    public final void e(int i) {
        this.c.e(i);
    }

    @Override // defpackage.ta
    public final void f() {
        this.c.f();
    }

    @Override // defpackage.ta
    public final boolean g(uo uoVar) {
        boolean zG;
        synchronized (this.a) {
            if (this.b) {
                Log.w("CXCP", "createCaptureSession failed: Virtual device disconnected");
                uoVar.g.g();
                zG = false;
            } else {
                zG = this.c.g(uoVar);
            }
        }
        return zG;
    }

    @Override // defpackage.ta
    public final boolean h(tp tpVar) {
        boolean zH;
        synchronized (this.a) {
            if (this.b) {
                Log.w("CXCP", "createExtensionSession failed: Virtual device disconnected");
                tpVar.d.g();
                zH = false;
            } else {
                zH = this.c.h(tpVar);
            }
        }
        return zH;
    }

    @Override // defpackage.ta
    public final boolean i(List list, tm tmVar) {
        boolean zI;
        synchronized (this.a) {
            if (this.b) {
                Log.w("CXCP", "createCaptureSession failed: Virtual device disconnected");
                tmVar.g();
                zI = false;
            } else {
                zI = this.c.i(list, tmVar);
            }
        }
        return zI;
    }

    @Override // defpackage.ta
    public final boolean j(List list, tm tmVar) {
        boolean zJ;
        synchronized (this.a) {
            if (this.b) {
                Log.w("CXCP", "createCaptureSessionByOutputConfigurations failed: Virtual device disconnected");
                tmVar.g();
                zJ = false;
            } else {
                zJ = this.c.j(list, tmVar);
            }
        }
        return zJ;
    }

    @Override // defpackage.ta
    public final boolean k(List list, tm tmVar) {
        boolean zK;
        synchronized (this.a) {
            if (this.b) {
                Log.w("CXCP", "createConstrainedHighSpeedCaptureSession failed: Virtual device disconnected");
                tmVar.g();
                zK = false;
            } else {
                zK = this.c.k(list, tmVar);
            }
        }
        return zK;
    }

    @Override // defpackage.ta
    public final boolean l(InputConfiguration inputConfiguration, List list, tm tmVar) {
        boolean zL;
        synchronized (this.a) {
            if (this.b) {
                Log.w("CXCP", "createReprocessableCaptureSession failed: Virtual device disconnected");
                tmVar.g();
                zL = false;
            } else {
                zL = this.c.l(inputConfiguration, list, tmVar);
            }
        }
        return zL;
    }

    @Override // defpackage.ta
    public final boolean m(tr trVar, List list, tm tmVar) {
        boolean zM;
        synchronized (this.a) {
            if (this.b) {
                Log.w("CXCP", "createReprocessableCaptureSessionByConfigurations failed: Virtual device disconnected");
                tmVar.g();
                zM = false;
            } else {
                zM = this.c.m(trVar, list, tmVar);
            }
        }
        return zM;
    }
}
