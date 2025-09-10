package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mie extends mki {
    final /* synthetic */ mih a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mie(mih mihVar) {
        super(mihVar);
        this.a = mihVar;
    }

    @Override // defpackage.mki, defpackage.mjn
    public final void f() {
        mih mihVar = this.a;
        mdb mdbVar = mihVar.a;
        mdbVar.e();
        super.f();
        mdbVar.g(mihVar.e);
    }
}
