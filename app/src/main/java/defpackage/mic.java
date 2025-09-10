package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mic extends mkg {
    final /* synthetic */ mih a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mic(mih mihVar) {
        super(mihVar);
        this.a = mihVar;
    }

    @Override // defpackage.mkg, defpackage.mjn
    public final void c() {
        mih mihVar = this.a;
        mdb mdbVar = mihVar.a;
        mdbVar.e();
        super.c();
        mdbVar.g(mihVar.f);
    }

    @Override // defpackage.mkg, defpackage.mjn
    public final void d() {
        mih mihVar = this.a;
        mdb mdbVar = mihVar.a;
        mdbVar.e();
        super.d();
        mdbVar.g(mihVar.d);
    }
}
