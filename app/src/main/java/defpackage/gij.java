package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gij extends gjf implements mdc {
    public final mdb a;
    public final mdd b;
    public final mdd c;
    public final mdd d;

    public gij(fvu fvuVar, ndj ndjVar, mzz mzzVar, gtm gtmVar, gln glnVar, hbj hbjVar) {
        super(fvuVar, ndjVar, mzzVar, gtmVar, glnVar, hbjVar);
        this.b = new mdd(new gig(this), new mcz[0]);
        mdd mddVar = new mdd(new gih(this), new mcz[0]);
        this.c = mddVar;
        this.d = new mdd(new gii(this), new mcz[0]);
        mdb mdbVar = new mdb(mddVar, false);
        this.a = mdbVar;
        mdbVar.f();
    }

    @Override // defpackage.gjy, defpackage.mcz, defpackage.mda
    public final void a() {
        this.a.c();
    }

    @Override // defpackage.gjy, defpackage.mcz, defpackage.mda
    public final void b() {
        this.a.d();
    }

    @Override // defpackage.gjy, defpackage.gjw
    public final void c() {
        mdb mdbVar = this.a;
        if (mdbVar.a() == null) {
            return;
        }
        ((gjy) mdbVar.a().a).c();
    }

    @Override // defpackage.gjy, defpackage.gjw
    public final void d() {
        mdb mdbVar = this.a;
        if (mdbVar.a() == null) {
            return;
        }
        ((gjy) mdbVar.a().a).d();
    }

    @Override // defpackage.gjy, defpackage.gjw
    public final void f() {
        mdb mdbVar = this.a;
        if (mdbVar.a() == null) {
            return;
        }
        ((gjy) mdbVar.a().a).f();
    }

    @Override // defpackage.gjy, defpackage.mcz
    public final void g() {
        jea.z(this);
    }

    @Override // defpackage.gjy, defpackage.gjw
    public final void h() {
        mdb mdbVar = this.a;
        if (mdbVar.a() == null) {
            return;
        }
        ((gjy) mdbVar.a().a).h();
    }

    @Override // defpackage.mdc
    public final void i() {
        this.a.b();
        this.b.i();
        this.c.i();
        this.d.i();
    }

    @Override // defpackage.gjy, defpackage.gjw
    public final void k() {
        mdb mdbVar = this.a;
        if (mdbVar.a() == null) {
            return;
        }
        ((gjy) mdbVar.a().a).k();
    }

    @Override // defpackage.gjy, defpackage.gjw
    public final void l(gaw gawVar) {
        mdb mdbVar = this.a;
        if (mdbVar.a() == null) {
            return;
        }
        ((gjy) mdbVar.a().a).l(gawVar);
    }
}
