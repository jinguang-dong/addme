package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class flp extends fli {
    final /* synthetic */ flu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public flp(flu fluVar) {
        super(fluVar);
        this.b = fluVar;
    }

    @Override // defpackage.fli, defpackage.flg
    public final void c() {
        flu fluVar = this.b;
        mdb mdbVar = fluVar.q;
        mdbVar.e();
        mdbVar.g(fluVar.s);
    }

    @Override // defpackage.fli, defpackage.flg
    public final void d() {
        flu fluVar = this.b;
        mdb mdbVar = fluVar.q;
        mdbVar.e();
        super.d();
        mdbVar.g(fluVar.t);
    }
}
