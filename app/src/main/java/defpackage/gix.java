package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gix extends gjv implements mdc {
    public final mdb a;
    public final mdd b;
    public final mdd c;
    public final mdd d;

    public gix(fvu fvuVar, ndj ndjVar, mts mtsVar, mzz mzzVar, gtm gtmVar, gkv gkvVar) {
        super(fvuVar, ndjVar, mtsVar, mzzVar, gtmVar, gkvVar);
        this.b = new mdd(new giu(this), new mcz[0]);
        mdd mddVar = new mdd(new giv(this), new mcz[0]);
        this.c = mddVar;
        this.d = new mdd(new giw(this), new mcz[0]);
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
