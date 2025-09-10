package defpackage;

import com.google.android.apps.camera.stats.timing.CameraActivityTiming;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fpv extends fvj {
    private final uem a;
    private final pbn b;
    private final jgt c;
    private final CameraActivityTiming d;
    private boolean e;

    public fpv(uem uemVar, out outVar, jgt jgtVar, CameraActivityTiming cameraActivityTiming, pbn pbnVar) {
        super(outVar);
        this.a = uemVar;
        this.b = pbnVar;
        this.c = jgtVar;
        this.d = cameraActivityTiming;
        this.e = false;
    }

    public final boolean d() {
        if (this.e) {
            return true;
        }
        pbn pbnVar = this.b;
        pbnVar.f("CameraActivityControllerInitializer#initialize");
        pbnVar.f("CameraActivityController#get");
        this.d.l(mej.ACTIVITY_INITIALIZE_START, CameraActivityTiming.a);
        iyu iyuVar = (iyu) this.a.a();
        pbnVar.h("CameraActivityController#initialize");
        this.e = iyuVar.v();
        pbnVar.g();
        pbnVar.g();
        return this.e;
    }

    @Override // defpackage.fvj
    public final void f() {
        if (d()) {
            return;
        }
        this.c.k(new fpu(this));
    }
}
