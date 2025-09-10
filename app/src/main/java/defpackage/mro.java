package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mro extends msa {
    final /* synthetic */ msd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mro(msd msdVar) {
        super(msdVar);
        this.a = msdVar;
    }

    @Override // defpackage.msa, defpackage.mry
    public final void c() {
        msd msdVar = this.a;
        mdb mdbVar = msdVar.f;
        mdbVar.e();
        super.c();
        mdbVar.g(msdVar.j);
    }

    @Override // defpackage.msa, defpackage.mry
    public final void e() {
        msd msdVar = this.a;
        mdb mdbVar = msdVar.f;
        mdbVar.e();
        super.e();
        mdbVar.g(msdVar.j);
    }
}
