package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mrn extends mrz {
    final /* synthetic */ msd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mrn(msd msdVar) {
        super(msdVar);
        this.a = msdVar;
    }

    @Override // defpackage.mrz, defpackage.mry
    public final void c() {
        msd msdVar = this.a;
        mdb mdbVar = msdVar.f;
        mdbVar.e();
        super.c();
        mdbVar.g(msdVar.j);
    }

    @Override // defpackage.mrz, defpackage.mry
    public final void d() {
        msd msdVar = this.a;
        mdb mdbVar = msdVar.f;
        mdbVar.e();
        super.d();
        mdbVar.g(msdVar.h);
    }
}
