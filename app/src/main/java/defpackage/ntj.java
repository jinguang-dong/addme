package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ntj extends ntu {
    final /* synthetic */ ntn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ntj(ntn ntnVar) {
        super(ntnVar);
        this.a = ntnVar;
    }

    @Override // defpackage.ntu, defpackage.ntt
    public final void c(boolean z) {
        ntn ntnVar = this.a;
        mdb mdbVar = ntnVar.a;
        mdbVar.e();
        super.c(z);
        mdbVar.g(ntnVar.d);
    }

    @Override // defpackage.ntu, defpackage.ntt
    public final void d(boolean z) {
        ntn ntnVar = this.a;
        mdb mdbVar = ntnVar.a;
        mdbVar.e();
        super.d(z);
        mdbVar.g(ntnVar.d);
    }
}
