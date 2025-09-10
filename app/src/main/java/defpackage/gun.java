package defpackage;

import com.google.android.apps.camera.coach.CameraCoachHudView;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gun implements png, lzh, lze {
    public final rwc a;
    public final gup b;
    public rwc c;
    public rwc d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public final ktx i;
    public final gux j;
    private final ScheduledExecutorService k;
    private final owq l;
    private rwc m;

    public gun(rwc rwcVar, gup gupVar, ktx ktxVar, owq owqVar, ScheduledExecutorService scheduledExecutorService, mdy mdyVar) {
        rvk rvkVar = rvk.a;
        this.c = rvkVar;
        this.d = rvkVar;
        this.m = rvkVar;
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = false;
        this.a = rwcVar;
        this.k = scheduledExecutorService;
        this.i = ktxVar;
        this.b = gupVar;
        this.l = owqVar;
        this.j = new gux(4, mdyVar);
    }

    public static final boolean k(float f, float f2) {
        return Math.toDegrees((double) Math.abs(f)) < 0.5d && Math.toDegrees((double) Math.abs(f2)) < 0.5d;
    }

    @Override // defpackage.png
    public final void a(pao paoVar) {
        this.k.execute(new gto(this, 19));
    }

    public final void d() {
        if (this.e) {
            gtn gtnVar = (gtn) this.d.c();
            if (gtnVar.d.h()) {
                Object objC = gtnVar.d.c();
                CameraCoachHudView cameraCoachHudView = (CameraCoachHudView) objC;
                if (cameraCoachHudView.c.h()) {
                    cameraCoachHudView.post(new gto(objC, 2));
                }
            }
            ((imi) this.c.c()).h(imk.SECOND_RUN_TOAST);
            this.e = false;
            this.f = false;
            this.g = false;
            this.j.g();
        }
    }

    @Override // defpackage.lze
    public final void e() {
        if (this.e) {
            boolean z = this.f;
            gux guxVar = this.j;
            if (z) {
                guxVar.c(sqn.HEEDED);
            } else {
                guxVar.c(sqn.NOT_HEEDED);
            }
        }
    }

    @Override // defpackage.lzh
    public final void f() {
        i(false);
        this.k.execute(new gto(this, 18));
    }

    @Override // defpackage.lzh
    public final void fa() {
        i(true);
        this.k.execute(new gto(this, 17));
    }

    public final synchronized void h() {
        if (this.m.h()) {
            ((our) this.m.c()).close();
        }
        our ourVar = new our();
        if (this.d.h()) {
            this.d.c();
            ourVar.d(gtn.f(new gto(this, 16), this.k));
        }
        ourVar.d(this.l.dK(new gmd(this, 14), this.k));
        this.i.c(this);
        ourVar.d(new gge(this, 11));
        gux guxVar = this.j;
        guxVar.a();
        ourVar.d(new gge(guxVar, 12));
        this.m = rwc.j(ourVar);
        this.b.b();
    }

    public final void i(boolean z) {
        this.h = z;
        if (z) {
            return;
        }
        d();
    }

    public final synchronized void j() {
        d();
        if (this.m.h()) {
            ((our) this.m.c()).close();
            this.m = rvk.a;
        }
        this.b.b();
    }

    @Override // defpackage.lzh
    public final void dM() {
    }

    @Override // defpackage.lzh
    public final void eZ(lzm lzmVar) {
    }
}
