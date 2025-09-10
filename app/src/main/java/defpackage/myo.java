package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class myo extends myy {
    final /* synthetic */ myr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public myo(myr myrVar) {
        super(myrVar);
        this.a = myrVar;
    }

    @Override // defpackage.myy, defpackage.myv
    public final void c() {
        myr myrVar = this.a;
        mdb mdbVar = myrVar.a;
        mdbVar.e();
        mdbVar.g(myrVar.b);
    }

    @Override // defpackage.myy, defpackage.myv
    public final void f() {
        myr myrVar = this.a;
        mdb mdbVar = myrVar.a;
        mdbVar.e();
        mdbVar.g(myrVar.e);
    }
}
