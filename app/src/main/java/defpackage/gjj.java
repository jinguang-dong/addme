package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gjj extends gjg implements mdc {
    public final owq a;
    public final hie b;
    public kgw c;
    public final mdb d;
    public final mdd e;
    public final mdd f;
    public final qrh g;

    public gjj(hie hieVar, qrh qrhVar, owq owqVar) {
        this.b = hieVar;
        this.g = qrhVar;
        this.a = owqVar;
        mdd mddVar = new mdd(new gik(this), new mcz[0]);
        this.e = mddVar;
        this.f = new mdd(new gil(this), new mcz[0]);
        mdb mdbVar = new mdb(mddVar, false);
        this.d = mdbVar;
        mdbVar.f();
    }

    @Override // defpackage.gjg, defpackage.mcz, defpackage.mda
    public final void a() {
        this.d.c();
    }

    @Override // defpackage.gjg, defpackage.mcz, defpackage.mda
    public final void b() {
        this.d.d();
    }

    @Override // defpackage.gjg
    public final void c(kgw kgwVar) {
        if (this.d.a() == null) {
            return;
        }
        ((gjg) this.d.a().a).c(kgwVar);
    }

    @Override // defpackage.gjg
    public final void d() {
        if (this.d.a() == null) {
            return;
        }
        ((gjg) this.d.a().a).d();
    }

    @Override // defpackage.gjg, defpackage.mcz
    public final void g() {
        jea.z(this);
    }

    @Override // defpackage.mdc
    public final void i() {
        this.d.b();
        this.e.i();
        this.f.i();
    }
}
