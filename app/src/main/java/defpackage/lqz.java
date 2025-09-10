package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class lqz extends lqt {
    final /* synthetic */ lra b;

    public lqz(lra lraVar) {
        this.b = lraVar;
    }

    @Override // defpackage.lqt, defpackage.mcz, defpackage.mda
    public final void a() {
        lra lraVar = this.b;
        lraVar.h();
        lraVar.g.E(2, true);
    }

    @Override // defpackage.lqt, defpackage.mcz, defpackage.mda
    public final void b() {
        lra lraVar = this.b;
        lraVar.j();
        lraVar.g.E(3, false);
    }

    @Override // defpackage.lqt
    public void f() {
        this.b.g.E(3, true);
    }

    @Override // defpackage.lqt
    public void e() {
    }
}
