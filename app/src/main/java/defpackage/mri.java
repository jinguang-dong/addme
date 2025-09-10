package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mri extends mrt implements mdc {
    private final mdb a;
    private final mdd b;

    public mri(mrx mrxVar, moy moyVar) {
        mdd mddVar = new mdd(new mrs(), mrxVar, moyVar);
        this.b = mddVar;
        mdb mdbVar = new mdb(mddVar, false);
        this.a = mdbVar;
        mdbVar.f();
    }

    @Override // defpackage.mrt, defpackage.mcz, defpackage.mda
    public final void a() {
        this.a.c();
    }

    @Override // defpackage.mrt, defpackage.mcz, defpackage.mda
    public final void b() {
        this.a.d();
    }

    @Override // defpackage.mrt, defpackage.mcz
    public final void g() {
        jea.z(this);
    }

    @Override // defpackage.mdc
    public final void i() {
        this.a.b();
        this.b.i();
    }
}
