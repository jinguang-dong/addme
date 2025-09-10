package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class myr extends mzb implements mdc {
    public final mdb a;
    public final mdd b;
    public final mdd c;
    public final mdd d;
    public final mdd e;
    private final mdd j;

    public myr() {
        mdd mddVar = new mdd(new mym(this), new mcz[0]);
        this.j = mddVar;
        this.b = new mdd(new myn(this), new mcz[0]);
        this.c = new mdd(new myo(this), new mcz[0]);
        this.d = new mdd(new myp(this), new mcz[0]);
        this.e = new mdd(new myq(this), new mcz[0]);
        mdb mdbVar = new mdb(mddVar, false);
        this.a = mdbVar;
        mdbVar.f();
    }

    @Override // defpackage.myv, defpackage.mcz, defpackage.mda
    public final void a() {
        this.a.c();
    }

    @Override // defpackage.myv, defpackage.mcz, defpackage.mda
    public final void b() {
        this.a.d();
    }

    @Override // defpackage.myv
    public final void c() {
        mdb mdbVar = this.a;
        if (mdbVar.a() == null) {
            return;
        }
        ((myv) mdbVar.a().a).c();
    }

    @Override // defpackage.myv
    public final void d() {
        mdb mdbVar = this.a;
        if (mdbVar.a() == null) {
            return;
        }
        ((myv) mdbVar.a().a).d();
    }

    @Override // defpackage.myv
    public final void e() {
        mdb mdbVar = this.a;
        if (mdbVar.a() == null) {
            return;
        }
        ((myv) mdbVar.a().a).e();
    }

    @Override // defpackage.myv
    public final void f() {
        mdb mdbVar = this.a;
        if (mdbVar.a() == null) {
            return;
        }
        ((myv) mdbVar.a().a).f();
    }

    @Override // defpackage.myv, defpackage.mcz
    public final void g() {
        jea.z(this);
    }

    @Override // defpackage.mdc
    public final void i() {
        this.a.b();
        this.j.i();
        this.b.i();
        this.c.i();
        this.d.i();
        this.e.i();
    }
}
