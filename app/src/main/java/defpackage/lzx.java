package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lzx extends mar {
    final /* synthetic */ maa a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lzx(maa maaVar) {
        super(maaVar);
        this.a = maaVar;
    }

    @Override // defpackage.mar, defpackage.mam
    public final void d() {
        maa maaVar = this.a;
        mdb mdbVar = maaVar.a;
        mdbVar.e();
        super.d();
        mdbVar.g(maaVar.c);
    }

    @Override // defpackage.mar, defpackage.mam
    public final void k() {
        maa maaVar = this.a;
        mdb mdbVar = maaVar.a;
        mdbVar.e();
        mdbVar.g(maaVar.b);
    }

    @Override // defpackage.mar, defpackage.mam, defpackage.jfs
    public final boolean r() {
        maa maaVar = this.a;
        mdb mdbVar = maaVar.a;
        mdbVar.e();
        mdbVar.g(maaVar.b);
        return true;
    }
}
