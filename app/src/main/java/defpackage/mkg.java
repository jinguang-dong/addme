package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class mkg implements mjn {
    final /* synthetic */ mkl b;

    public mkg(mkl mklVar) {
        this.b = mklVar;
    }

    @Override // defpackage.mcz, defpackage.mda
    public final void a() {
        mkl mklVar = this.b;
        mklVar.g.i();
        mklVar.j.z();
        mkr mkrVar = mklVar.k;
        if (mkrVar.y.h()) {
            ((gdm) mkrVar.y.c()).e();
        }
        mkrVar.a.a(false);
        mkrVar.b.a(fyx.PAUSED);
        mkrVar.r.set(true);
    }

    @Override // defpackage.mcz, defpackage.mda
    public final void b() {
        mkl mklVar = this.b;
        mklVar.g.k();
        mklVar.j.D();
    }

    @Override // defpackage.mjn
    public void c() {
        mkl mklVar = this.b;
        mkr mkrVar = mklVar.k;
        mkrVar.i();
        if (mkrVar.y.h()) {
            ((gdm) mkrVar.y.c()).f();
        }
        mkrVar.a.a(true);
        mkrVar.b.a(fyx.RECORDING);
        mkrVar.r.set(false);
        mklVar.o.c();
    }

    @Override // defpackage.mjn
    public void d() {
        this.b.j();
    }

    @Override // defpackage.mjn
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.mjn
    public final /* synthetic */ void eU() {
    }

    @Override // defpackage.mjn
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.mcz
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.mjn
    public final /* synthetic */ void h() {
    }
}
