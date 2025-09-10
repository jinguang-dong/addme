package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class flt extends flm {
    final /* synthetic */ flu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public flt(flu fluVar) {
        super(fluVar);
        this.b = fluVar;
    }

    @Override // defpackage.flm, defpackage.flg
    public final void c() {
        flu fluVar = this.b;
        mdb mdbVar = fluVar.q;
        mdbVar.e();
        mdbVar.g(fluVar.s);
    }

    @Override // defpackage.flm, defpackage.flg
    public final void d() {
        flu fluVar = this.b;
        mdb mdbVar = fluVar.q;
        mdbVar.e();
        super.d();
        mdbVar.g(fluVar.t);
    }

    @Override // defpackage.flm, defpackage.flg
    public final void e() {
        flu fluVar = this.b;
        mdb mdbVar = fluVar.q;
        mdbVar.e();
        super.e();
        mdbVar.g(fluVar.r);
    }
}
