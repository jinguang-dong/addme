package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mif extends mkj {
    final /* synthetic */ mih a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mif(mih mihVar) {
        super(mihVar);
        this.a = mihVar;
    }

    @Override // defpackage.mkj, defpackage.mjn
    public final void h() {
        mih mihVar = this.a;
        mdb mdbVar = mihVar.a;
        mdbVar.e();
        super.h();
        mdbVar.g(mihVar.c);
    }
}
