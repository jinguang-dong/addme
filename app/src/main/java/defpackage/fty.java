package defpackage;

import com.google.ar.core.R;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fty {
    public final kdb a;
    public final rwc b;
    public final rwc c;
    private final msh d;
    private final hyh e;
    private final kez f;
    private final ndj g;
    private final out h;
    private final tzj i;
    private final gtx j;
    private final hyd k;
    private final pbn l;
    private nkw m = nkw.UNINITIALIZED;
    private final nqp n;
    private final owf o;
    private final owf p;
    private our q;
    private final icd r;
    private final owf s;
    private final imi t;
    private final mbj u;
    private final jho v;
    private final hbj w;
    private final obu x;

    public fty(msh mshVar, hyh hyhVar, kez kezVar, kdb kdbVar, ndj ndjVar, out outVar, imi imiVar, tzj tzjVar, mbj mbjVar, rwc rwcVar, gtx gtxVar, obu obuVar, hyd hydVar, hbj hbjVar, pbn pbnVar, jho jhoVar, nqp nqpVar, rwc rwcVar2, owf owfVar, owf owfVar2, icd icdVar, owf owfVar3) {
        this.d = mshVar;
        this.e = hyhVar;
        this.f = kezVar;
        this.a = kdbVar;
        this.g = ndjVar;
        this.h = outVar;
        this.t = imiVar;
        this.i = tzjVar;
        this.u = mbjVar;
        this.b = rwcVar;
        this.j = gtxVar;
        this.x = obuVar;
        this.k = hydVar;
        this.w = hbjVar;
        this.l = pbnVar;
        this.v = jhoVar;
        this.n = nqpVar;
        this.c = rwcVar2;
        this.o = owfVar;
        this.p = owfVar2;
        this.r = icdVar;
        this.s = owfVar3;
    }

    private final void m() {
        our ourVar = this.q;
        if (ourVar == null || ourVar.b()) {
            return;
        }
        this.q.close();
    }

    private final void n() {
        nkw nkwVar = nkw.UNINITIALIZED;
        int iOrdinal = this.m.ordinal();
        if (iOrdinal == 1) {
            this.g.v();
        } else {
            if (iOrdinal != 6) {
                throw new IllegalArgumentException("Finishing Auto Night Sight shutter is not supported in mode ".concat(String.valueOf(String.valueOf(this.m))));
            }
            this.g.w();
        }
    }

    public final void a(boolean z) {
        this.a.f();
        this.g.x();
        this.j.h();
        rwc rwcVar = this.b;
        if (rwcVar.h()) {
            ((ftv) rwcVar.c()).c(!z);
        }
        if (z || !((Boolean) this.e.b.dL()).booleanValue()) {
            return;
        }
        n();
        this.n.D(-1);
    }

    public final void b(boolean z) {
        if (z) {
            out outVar = this.h;
            kez kezVar = this.f;
            kezVar.getClass();
            outVar.execute(new foh(kezVar, 7));
        }
    }

    public final void c() {
        this.f.c();
    }

    public final void d() {
        if ((this.m.equals(nkw.PHOTO) && ((jms) this.i.a()).k) || ((Boolean) this.o.dL()).booleanValue() || ((Boolean) this.p.dL()).booleanValue()) {
            return;
        }
        if (!((Boolean) this.e.b.dL()).booleanValue()) {
            if (this.d.d()) {
                return;
            }
            this.g.aw(this.m);
            this.n.s();
            return;
        }
        int iOrdinal = this.m.ordinal();
        if (iOrdinal == 1) {
            this.g.j();
        } else {
            if (iOrdinal != 6) {
                throw new IllegalArgumentException("Auto Night Sight shutter is not supported in mode ".concat(String.valueOf(String.valueOf(this.m))));
            }
            this.g.k();
        }
        this.n.i();
    }

    public final void e(nkw nkwVar, our ourVar) {
        this.m = nkwVar;
        kez kezVar = this.f;
        kezVar.a();
        kdb kdbVar = this.a;
        kdbVar.c(this.t);
        ourVar.d(kdbVar);
        ourVar.d(this.e.b.dK(new fcs(this, ourVar, 7), this.h));
        kezVar.getClass();
        ourVar.d(new fis(kezVar, 11));
        ftx ftxVar = new ftx(this);
        rwc rwcVar = this.c;
        if (rwcVar.h()) {
            ((mac) rwcVar.c()).a(ftxVar);
        }
        ourVar.d(new fid(this, ftxVar, 5, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, owf] */
    public final void f(kfg kfgVar, our ourVar) {
        rwc rwcVar = this.b;
        if (rwcVar.h()) {
            ourVar.d(((ftv) rwcVar.c()).b(this.m, (kow) kfgVar.i().f, kfgVar.i().b));
            hyh hyhVar = this.e;
            boolean z = true;
            if (((Boolean) this.s.dL()).booleanValue() && !this.v.c) {
                z = false;
            }
            hyhVar.i(z);
        }
    }

    public final void g() {
        pbn pbnVar = this.l;
        pbnVar.f("lockViewfinderProcessing");
        m();
        our ourVar = new our();
        this.q = ourVar;
        ourVar.d(this.r.a());
        pbnVar.g();
    }

    public final void h() {
        this.e.i(false);
    }

    public final void i(float f, long j) {
        if (this.w.p(gyp.m) && this.m.equals(nkw.PHOTO)) {
            if (f == 0.0f) {
                this.j.i(new jbv(this, 1));
            }
            if (this.j.n()) {
                this.a.g(f);
            }
        } else {
            this.a.g(f);
        }
        int i = (int) (100.0f * f);
        if (i == 0) {
            this.n.C(j);
            i = 0;
        }
        this.g.K(i, j, false);
        this.n.D(i);
        rwc rwcVar = this.b;
        if (rwcVar.h()) {
            ((ftv) rwcVar.c()).m(Duration.ofMillis(j), i);
        }
        if (f == 1.0f) {
            this.x.u(j);
            n();
            this.j.h();
        }
    }

    public final void j(boolean z, Duration duration) {
        pbn pbnVar = this.l;
        pbnVar.f("soundPlayer#play");
        this.u.c(R.raw.longexposure_start);
        rwc rwcVar = this.b;
        if (rwcVar.h()) {
            ((ftv) rwcVar.c()).s(duration);
        }
        pbnVar.h("stateChart#takePicture");
        if (z) {
            this.f.f();
        } else {
            this.f.eG();
        }
        pbnVar.g();
    }

    public final void k() {
        rwc rwcVar = this.b;
        if (rwcVar.h()) {
            ((ftv) rwcVar.c()).g();
        }
        m();
    }

    public final boolean l(uh uhVar, jub jubVar) {
        if (!this.k.h) {
            return false;
        }
        hyh hyhVar = this.e;
        if (!((Boolean) hyhVar.b.dL()).booleanValue() || !((Boolean) ((ovx) uhVar.a).d).booleanValue()) {
            return false;
        }
        jubVar.f(uhVar);
        if (hyhVar.m()) {
            this.f.eF();
            return true;
        }
        this.f.c();
        return true;
    }
}
