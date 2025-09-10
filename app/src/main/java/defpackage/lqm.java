package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lqm extends lqz {
    final /* synthetic */ lra a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lqm(lra lraVar) {
        super(lraVar);
        this.a = lraVar;
    }

    @Override // defpackage.lqz, defpackage.lqt
    public final void e() {
        lra lraVar = this.a;
        lraVar.b.e();
        lraVar.b.g(lraVar.e);
    }

    @Override // defpackage.lqz, defpackage.lqt
    public final void f() {
        lra lraVar = this.a;
        lraVar.b.e();
        super.f();
        lraVar.b.g(lraVar.c);
    }
}
