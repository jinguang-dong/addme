package defpackage;

import android.os.SystemClock;
import com.google.android.apps.camera.coach.CameraCoachHudView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class gtq implements Runnable {
    public final /* synthetic */ CameraCoachHudView a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    private final /* synthetic */ int d;

    public /* synthetic */ gtq(CameraCoachHudView cameraCoachHudView, float f, float f2, int i) {
        this.d = i;
        this.a = cameraCoachHudView;
        this.b = f;
        this.c = f2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        if (i == 0) {
            CameraCoachHudView cameraCoachHudView = this.a;
            if (cameraCoachHudView.b.h()) {
                float f = this.c;
                float f2 = this.b;
                guj gujVar = (guj) cameraCoachHudView.b.c();
                gujVar.h = true;
                gujVar.j = new gui(f2, f, SystemClock.uptimeMillis());
                gui guiVar = gujVar.k;
                if (guiVar == null) {
                    gujVar.f.invalidate();
                    return;
                } else {
                    if (ezh.u(f2, guiVar.a) || ezh.u(f, guiVar.b)) {
                        gujVar.f.invalidate();
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (i != 1) {
            CameraCoachHudView cameraCoachHudView2 = this.a;
            if (cameraCoachHudView2.c.h()) {
                float f3 = this.c;
                float f4 = this.b;
                guq guqVar = (guq) cameraCoachHudView2.c.c();
                guqVar.h = true;
                guqVar.i = f3;
                guqVar.j = f4;
                if (ezh.u(guqVar.k, f3) || ezh.u(guqVar.l, f4)) {
                    guqVar.a.invalidate();
                    guqVar.l = f4;
                    guqVar.k = f3;
                    return;
                }
                return;
            }
            return;
        }
        CameraCoachHudView cameraCoachHudView3 = this.a;
        if (cameraCoachHudView3.d.h()) {
            float f5 = this.c;
            float f6 = this.b;
            gua guaVar = (gua) cameraCoachHudView3.d.c();
            guaVar.i = true;
            guaVar.k = f5;
            guaVar.l = f6;
            if (ezh.u(guaVar.m, f5) || ezh.u(guaVar.n, f6)) {
                guaVar.e.invalidate();
                guaVar.n = f6;
                guaVar.m = f5;
            }
        }
    }
}
