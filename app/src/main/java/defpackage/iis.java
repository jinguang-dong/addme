package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iis extends ikm implements mdc {
    public final mdb a;
    public final mdd b;
    public final mdd c;

    public iis(ndj ndjVar, fvu fvuVar, krj krjVar, ijj ijjVar, mzz mzzVar) {
        super(ndjVar, fvuVar, krjVar, ijjVar, mzzVar);
        mdd mddVar = new mdd(new iiq(this), new mcz[0]);
        this.b = mddVar;
        this.c = new mdd(new iir(this), new mcz[0]);
        mdb mdbVar = new mdb(mddVar, false);
        this.a = mdbVar;
        mdbVar.f();
    }

    @Override // defpackage.ikm, defpackage.ikj, defpackage.mcz, defpackage.mda
    public final void a() {
        super.a();
        this.a.c();
    }

    @Override // defpackage.ikm, defpackage.ikj, defpackage.mcz, defpackage.mda
    public final void b() {
        super.b();
        this.a.d();
    }

    @Override // defpackage.ikj
    public final void c() {
        mdb mdbVar = this.a;
        if (mdbVar.a() == null) {
            return;
        }
        ((ikj) mdbVar.a().a).c();
    }

    @Override // defpackage.ikj
    public final void d() {
        mdb mdbVar = this.a;
        if (mdbVar.a() == null) {
            return;
        }
        ((ikj) mdbVar.a().a).d();
    }

    @Override // defpackage.ikj, defpackage.mcz
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
