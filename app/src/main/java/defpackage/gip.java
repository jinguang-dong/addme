package defpackage;

import android.view.Window;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gip extends gjn implements mdc {
    public final mdb a;
    public final mdd b;
    public final mdd c;
    public final mdd d;

    public gip(fvu fvuVar, ndj ndjVar, Window window, mts mtsVar, pfl pflVar, mzz mzzVar, gtm gtmVar, mte mteVar) {
        super(fvuVar, ndjVar, window, mtsVar, pflVar, mzzVar, gtmVar, mteVar);
        mdd mddVar = new mdd(new gim(this), new mcz[0]);
        this.b = mddVar;
        this.c = new mdd(new gin(this), new mcz[0]);
        this.d = new mdd(new gio(this), new mcz[0]);
        mdb mdbVar = new mdb(mddVar, false);
        this.a = mdbVar;
        mdbVar.f();
    }

    @Override // defpackage.gjn, defpackage.gjy, defpackage.mcz, defpackage.mda
    public final void a() {
        super.a();
        this.a.c();
    }

    @Override // defpackage.gjn, defpackage.gjy, defpackage.mcz, defpackage.mda
    public final void b() {
        super.b();
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
