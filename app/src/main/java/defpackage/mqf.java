package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mqf extends mou implements mdc {
    private final mdb a;
    private final mdd b;

    public mqf(mpf mpfVar, moy moyVar, gjj gjjVar) {
        mdd mddVar = new mdd(new mot(), mpfVar, moyVar, gjjVar);
        this.b = mddVar;
        mdb mdbVar = new mdb(mddVar, false);
        this.a = mdbVar;
        mdbVar.f();
    }

    @Override // defpackage.mou, defpackage.mcz, defpackage.mda
    public final void a() {
        this.a.c();
    }

    @Override // defpackage.mou, defpackage.mcz, defpackage.mda
    public final void b() {
        this.a.d();
    }

    @Override // defpackage.mou, defpackage.mcz
    public final void g() {
        jea.z(this);
    }

    @Override // defpackage.mdc
    public final void i() {
        this.a.b();
        this.b.i();
    }
}
