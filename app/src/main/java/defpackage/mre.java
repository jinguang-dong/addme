package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mre extends mpz {
    final /* synthetic */ mrg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mre(mrg mrgVar) {
        super(mrgVar);
        this.b = mrgVar;
    }

    @Override // defpackage.mpz, defpackage.mpy
    public final void c() {
        mrg mrgVar = this.b;
        mdb mdbVar = mrgVar.n;
        mdbVar.e();
        super.c();
        mdbVar.g(mrgVar.p);
    }

    @Override // defpackage.mpz, defpackage.mpy
    public final void e() {
        mrg mrgVar = this.b;
        mdb mdbVar = mrgVar.n;
        mdbVar.e();
        super.e();
        mdbVar.g(mrgVar.p);
    }
}
