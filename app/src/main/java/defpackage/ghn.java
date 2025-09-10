package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ghn extends ghx implements mdc {
    public final mdb a;
    public final mdd b;
    public final mdd c;
    public final mdd d;
    public final mdd e;

    public ghn(mny mnyVar, rwc rwcVar) {
        super(mnyVar, rwcVar);
        this.b = new mdd(new ghj(this), new mcz[0]);
        this.c = new mdd(new ghk(this), new mcz[0]);
        mdd mddVar = new mdd(new ghl(this), new mcz[0]);
        this.d = mddVar;
        this.e = new mdd(new ghm(this), new mcz[0]);
        mdb mdbVar = new mdb(mddVar, false);
        this.a = mdbVar;
        mdbVar.f();
    }

    @Override // defpackage.ghs, defpackage.mcz, defpackage.mda
    public final void a() {
        this.a.c();
    }

    @Override // defpackage.ghs, defpackage.mcz, defpackage.mda
    public final void b() {
        this.a.d();
    }

    @Override // defpackage.ghs
    public final void c() {
        mdb mdbVar = this.a;
        if (mdbVar.a() == null) {
            return;
        }
        ((ghs) mdbVar.a().a).c();
    }

    @Override // defpackage.ghs
    public final void d() {
        mdb mdbVar = this.a;
        if (mdbVar.a() == null) {
            return;
        }
        ((ghs) mdbVar.a().a).d();
    }

    @Override // defpackage.ghs
    public final void e() {
        mdb mdbVar = this.a;
        if (mdbVar.a() == null) {
            return;
        }
        ((ghs) mdbVar.a().a).e();
    }

    @Override // defpackage.ghs
    public final void f() {
        mdb mdbVar = this.a;
        if (mdbVar.a() == null) {
            return;
        }
        ((ghs) mdbVar.a().a).f();
    }

    @Override // defpackage.ghs, defpackage.mcz
    public final void g() {
        jea.z(this);
    }

    @Override // defpackage.mdc
    public final void i() {
        this.a.b();
        this.b.i();
        this.c.i();
        this.d.i();
        this.e.i();
    }
}
