package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mih extends mkl implements mdc {
    public final mdb a;
    public final mdd b;
    public final mdd c;
    public final mdd d;
    public final mdd e;
    public final mdd f;

    public mih(fvu fvuVar, mts mtsVar, mzz mzzVar, krj krjVar, ndj ndjVar, mkr mkrVar, itl itlVar, hbj hbjVar, ree reeVar) {
        super(fvuVar, mtsVar, mzzVar, krjVar, ndjVar, mkrVar, itlVar, hbjVar, reeVar);
        this.b = new mdd(new mic(this), new mcz[0]);
        this.c = new mdd(new mid(this), new mcz[0]);
        this.d = new mdd(new mie(this), new mcz[0]);
        mdd mddVar = new mdd(new mif(this), new mcz[0]);
        this.e = mddVar;
        this.f = new mdd(new mig(this), new mcz[0]);
        mdb mdbVar = new mdb(mddVar, false);
        this.a = mdbVar;
        mdbVar.f();
    }

    @Override // defpackage.mkl, defpackage.mcz, defpackage.mda
    public final void a() {
        mkr mkrVar = this.k;
        mkrVar.c.set(0L);
        mkrVar.a.a(false);
        mkrVar.b.a(fyx.READY);
        if (!mkrVar.H.p(gzo.by)) {
            mkrVar.C.h(false);
        }
        mkrVar.C.g(true);
        this.g.m(true);
        this.i.m(true);
        this.l.k(1);
        nql.c();
        this.a.c();
    }

    @Override // defpackage.mkl, defpackage.mcz, defpackage.mda
    public final void b() {
        this.k.a();
        this.a.d();
    }

    @Override // defpackage.mkl, defpackage.mjn
    public final void c() {
        mdb mdbVar = this.a;
        if (mdbVar.a() == null) {
            return;
        }
        ((mjn) mdbVar.a().a).c();
    }

    @Override // defpackage.mkl, defpackage.mjn
    public final void d() {
        mdb mdbVar = this.a;
        if (mdbVar.a() == null) {
            return;
        }
        ((mjn) mdbVar.a().a).d();
    }

    @Override // defpackage.mkl, defpackage.mjn
    public final void e() {
        mdb mdbVar = this.a;
        if (mdbVar.a() == null) {
            return;
        }
        ((mjn) mdbVar.a().a).e();
    }

    @Override // defpackage.mkl, defpackage.mjn
    public final void eU() {
        mdb mdbVar = this.a;
        if (mdbVar.a() == null) {
            return;
        }
        ((mjn) mdbVar.a().a).eU();
    }

    @Override // defpackage.mkl, defpackage.mjn
    public final void f() {
        mdb mdbVar = this.a;
        if (mdbVar.a() == null) {
            return;
        }
        ((mjn) mdbVar.a().a).f();
    }

    @Override // defpackage.mkl, defpackage.mcz
    public final void g() {
        jea.z(this);
    }

    @Override // defpackage.mkl, defpackage.mjn
    public final void h() {
        mdb mdbVar = this.a;
        if (mdbVar.a() == null) {
            return;
        }
        ((mjn) mdbVar.a().a).h();
    }

    @Override // defpackage.mdc
    public final void i() {
        this.a.b();
        this.b.i();
        this.c.i();
        this.d.i();
        this.e.i();
        this.f.i();
    }
}
