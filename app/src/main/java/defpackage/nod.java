package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nod extends noa implements mdc {
    public final uem a;
    public final mdb b;
    public final mdd c;
    public final mdd d;

    public nod(uem uemVar) {
        this.a = uemVar;
        mdd mddVar = new mdd(new noe(this), new mcz[0]);
        this.c = mddVar;
        this.d = new mdd(new nof(this), new mcz[0]);
        mdb mdbVar = new mdb(mddVar, false);
        this.b = mdbVar;
        mdbVar.f();
    }

    @Override // defpackage.noa, defpackage.mcz, defpackage.mda
    public final void a() {
        this.b.c();
    }

    @Override // defpackage.noa, defpackage.mcz, defpackage.mda
    public final void b() {
        this.b.d();
    }

    @Override // defpackage.noa
    public final void c() {
        if (this.b.a() == null) {
            return;
        }
        ((noa) this.b.a().a).c();
    }

    @Override // defpackage.noa
    public final void d() {
        if (this.b.a() == null) {
            return;
        }
        ((noa) this.b.a().a).d();
    }

    @Override // defpackage.noa
    public final void e() {
        if (this.b.a() == null) {
            return;
        }
        ((noa) this.b.a().a).e();
    }

    @Override // defpackage.noa, defpackage.mcz
    public final void g() {
        jea.z(this);
    }

    @Override // defpackage.mdc
    public final void i() {
        this.b.b();
        this.c.i();
        this.d.i();
    }
}
