package defpackage;

import com.google.android.apps.camera.whitebalance.ManualWhiteBalanceUi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ntn extends nty implements mdc {
    public final mdb a;
    public final mdd b;
    public final mdd c;
    public final mdd d;
    public final mdd e;

    public ntn(ManualWhiteBalanceUi manualWhiteBalanceUi, out outVar, mwq mwqVar) {
        super(manualWhiteBalanceUi, outVar, mwqVar);
        mdd mddVar = new mdd(new ntj(this), new mcz[0]);
        this.b = mddVar;
        this.c = new mdd(new ntk(this), new mcz[0]);
        this.d = new mdd(new ntl(this), new mcz[0]);
        this.e = new mdd(new ntm(this), new mcz[0]);
        mdb mdbVar = new mdb(mddVar, false);
        this.a = mdbVar;
        mdbVar.f();
    }

    @Override // defpackage.ntt, defpackage.mcz, defpackage.mda
    public final void a() {
        this.a.c();
    }

    @Override // defpackage.ntt, defpackage.mcz, defpackage.mda
    public final void b() {
        this.a.d();
    }

    @Override // defpackage.ntt
    public final void c(boolean z) {
        mdb mdbVar = this.a;
        if (mdbVar.a() == null) {
            return;
        }
        ((ntt) mdbVar.a().a).c(z);
    }

    @Override // defpackage.ntt
    public final void d(boolean z) {
        mdb mdbVar = this.a;
        if (mdbVar.a() == null) {
            return;
        }
        ((ntt) mdbVar.a().a).d(z);
    }

    @Override // defpackage.ntt
    public final void e() {
        mdb mdbVar = this.a;
        if (mdbVar.a() == null) {
            return;
        }
        ((ntt) mdbVar.a().a).e();
    }

    @Override // defpackage.ntt
    public final void f(boolean z) {
        mdb mdbVar = this.a;
        if (mdbVar.a() == null) {
            return;
        }
        ((ntt) mdbVar.a().a).f(z);
    }

    @Override // defpackage.ntt
    public final void fg(boolean z) {
        mdb mdbVar = this.a;
        if (mdbVar.a() == null) {
            return;
        }
        ((ntt) mdbVar.a().a).fg(z);
    }

    @Override // defpackage.ntt, defpackage.mcz
    public final void g() {
        jea.z(this);
    }

    @Override // defpackage.ntt
    public final void h() {
        mdb mdbVar = this.a;
        if (mdbVar.a() == null) {
            return;
        }
        ((ntt) mdbVar.a().a).h();
    }

    @Override // defpackage.mdc
    public final void i() {
        this.a.b();
        this.b.i();
        this.c.i();
        this.d.i();
        this.e.i();
    }

    @Override // defpackage.ntt
    public final void j() {
        mdb mdbVar = this.a;
        if (mdbVar.a() == null) {
            return;
        }
        ((ntt) mdbVar.a().a).j();
    }
}
