package defpackage;

import com.google.android.apps.camera.coach.CameraCoachHudView;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class gue implements png, lzh, lze {
    public static final sgv a = sgv.g("gue");
    public static final long b = (long) (TimeUnit.SECONDS.toMillis(1) / 30.0d);
    public final rwc c;
    public final guh d;
    public final owf e;
    public rwc f;
    public rwc g;
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;
    public rwc k;
    public long l;
    public boolean m;
    public final gux n;
    public final ktx o;
    private final ScheduledExecutorService p;
    private final owq q;
    private rwc r;

    public gue(rwc rwcVar, guh guhVar, ktx ktxVar, owq owqVar, ScheduledExecutorService scheduledExecutorService, mdy mdyVar, owf owfVar) {
        rvk rvkVar = rvk.a;
        this.k = rvkVar;
        this.r = rvkVar;
        this.m = false;
        this.p = scheduledExecutorService;
        this.c = rwcVar;
        this.d = guhVar;
        this.q = owqVar;
        this.o = ktxVar;
        this.n = new gux(3, mdyVar);
        this.e = owfVar;
    }

    @Override // defpackage.png
    public final void a(pao paoVar) {
        this.p.execute(new gto(this, 8));
    }

    public final synchronized void d() {
        this.i = false;
        this.j = false;
        if (this.h) {
            Object obj = ((rwg) this.f).a;
            if (((gtn) obj).d.h()) {
                Object objC = ((gtn) obj).d.c();
                if (((CameraCoachHudView) objC).b.h()) {
                    ((CameraCoachHudView) objC).post(new gto(objC, 4));
                }
            }
            ((imi) ((rwg) this.g).a).h(imk.SECOND_RUN_TOAST);
            this.h = false;
        }
    }

    @Override // defpackage.lze
    public final void e() {
        if (this.h) {
            boolean z = this.j;
            gux guxVar = this.n;
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
        this.p.execute(new gto(this, 10));
    }

    @Override // defpackage.lzh
    public final void fa() {
        i(true);
        this.p.execute(new gto(this, 11));
    }

    final synchronized void h() {
        rnt.L(true);
        if (this.r.h()) {
            ((our) this.r.c()).close();
        }
        our ourVar = new our();
        Object obj = ((rwg) this.f).a;
        gto gtoVar = new gto(this, 9);
        ScheduledExecutorService scheduledExecutorService = this.p;
        ourVar.d(gtn.f(gtoVar, scheduledExecutorService));
        ourVar.d(this.q.dK(new gmd(this, 12), scheduledExecutorService));
        ourVar.d(this.e.dK(new gmd(this, 13), scheduledExecutorService));
        this.o.c(this);
        ourVar.d(new gge(this, 10));
        this.n.a();
        this.r = rwc.j(ourVar);
        this.d.b();
    }

    public final void i(boolean z) {
        this.m = z;
        if (z) {
            return;
        }
        d();
    }

    public final synchronized void j() {
        d();
        if (this.r.h()) {
            ((our) this.r.c()).close();
            this.r = rvk.a;
        }
        this.n.b();
        this.d.b();
    }

    @Override // defpackage.lzh
    public final void dM() {
    }

    @Override // defpackage.lzh
    public final void eZ(lzm lzmVar) {
    }
}
