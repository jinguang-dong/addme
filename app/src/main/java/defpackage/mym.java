package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mym extends myw {
    final /* synthetic */ myr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mym(myr myrVar) {
        super(myrVar);
        this.a = myrVar;
    }

    @Override // defpackage.myw, defpackage.myv
    public final void c() {
        myr myrVar = this.a;
        mdb mdbVar = myrVar.a;
        mdbVar.e();
        mdbVar.g(myrVar.b);
    }

    @Override // defpackage.myw, defpackage.myv
    public final void d() {
        myr myrVar = this.a;
        mdb mdbVar = myrVar.a;
        mdbVar.e();
        mdbVar.g(myrVar.c);
    }
}
