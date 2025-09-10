package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class noi extends noq implements mdc {
    public final mdb a;
    public final mdd b;
    public final mdd c;

    public noi() {
        mdd mddVar = new mdd(new nog(this), new mcz[0]);
        this.b = mddVar;
        this.c = new mdd(new noh(this), new mcz[0]);
        mdb mdbVar = new mdb(mddVar, false);
        this.a = mdbVar;
        mdbVar.f();
    }

    @Override // defpackage.non, defpackage.mcz, defpackage.mda
    public final void a() {
        this.a.c();
    }

    @Override // defpackage.non, defpackage.mcz, defpackage.mda
    public final void b() {
        this.a.d();
    }

    @Override // defpackage.non
    public final void c() {
        mdb mdbVar = this.a;
        if (mdbVar.a() == null) {
            return;
        }
        ((non) mdbVar.a().a).c();
    }

    @Override // defpackage.non
    public final void d() {
        mdb mdbVar = this.a;
        if (mdbVar.a() == null) {
            return;
        }
        ((non) mdbVar.a().a).d();
    }

    @Override // defpackage.noq, defpackage.non
    public final void e(nox noxVar, nyr nyrVar) {
        mdb mdbVar = this.a;
        if (mdbVar.a() != null) {
            ((non) mdbVar.a().a).e(noxVar, nyrVar);
        } else {
            this.d = noxVar.f;
            this.e = nyrVar;
        }
    }

    @Override // defpackage.non, defpackage.mcz
    public final void g() {
        jea.z(this);
    }

    @Override // defpackage.mdc
    public final void i() {
        this.a.b();
        this.b.i();
        this.c.i();
    }
}
