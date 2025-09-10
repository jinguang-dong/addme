package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mrp extends msb {
    final /* synthetic */ msd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mrp(msd msdVar) {
        super(msdVar);
        this.a = msdVar;
    }

    @Override // defpackage.msb, defpackage.mry
    public final void f() {
        msd msdVar = this.a;
        mdb mdbVar = msdVar.f;
        mdbVar.e();
        super.f();
        mdbVar.g(msdVar.g);
    }
}
