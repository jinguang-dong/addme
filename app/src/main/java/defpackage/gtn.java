package defpackage;

import com.google.android.apps.camera.coach.CameraCoachHudView;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gtn implements png {
    public final owf a;
    public boolean b = false;
    public boolean c = true;
    public rwc d = rvk.a;
    public final ktx e;
    public final fdq f;

    public gtn(ktx ktxVar, fdq fdqVar, owf owfVar) {
        this.f = fdqVar;
        this.e = ktxVar;
        this.a = owfVar;
    }

    static final paq f(Runnable runnable, ScheduledExecutorService scheduledExecutorService) {
        return new gge(scheduledExecutorService.scheduleAtFixedRate(runnable, 0L, 33L, TimeUnit.MILLISECONDS), 7);
    }

    @Override // defpackage.png
    public final void a(pao paoVar) {
        if (this.d.h()) {
            ((CameraCoachHudView) this.d.c()).a = paoVar.e;
        }
    }

    public final void b() {
        int i = 0;
        this.c = false;
        if (this.d.h()) {
            Object objC = this.d.c();
            CameraCoachHudView cameraCoachHudView = (CameraCoachHudView) objC;
            if (cameraCoachHudView.b.h()) {
                cameraCoachHudView.post(new gpk(objC, 20));
            }
            if (cameraCoachHudView.c.h()) {
                cameraCoachHudView.post(new gto(objC, 1));
            }
            if (cameraCoachHudView.d.h()) {
                cameraCoachHudView.post(new gto(objC, i));
            }
        }
    }

    public final void c() {
        this.c = true;
    }

    public final void d(boolean z) {
        if (this.d.h()) {
            ((CameraCoachHudView) this.d.c()).e = z;
        }
    }

    public final void e() {
        this.b = true;
    }
}
