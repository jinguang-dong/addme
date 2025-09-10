package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ntk extends ntv {
    final /* synthetic */ ntn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ntk(ntn ntnVar) {
        super(ntnVar);
        this.a = ntnVar;
    }

    @Override // defpackage.ntv, defpackage.ntt
    public final void e() {
        ntn ntnVar = this.a;
        mdb mdbVar = ntnVar.a;
        mdbVar.e();
        super.e();
        mdbVar.g(ntnVar.d);
    }

    @Override // defpackage.ntv, defpackage.ntt
    public final void f(boolean z) {
        ntn ntnVar = this.a;
        mdb mdbVar = ntnVar.a;
        mdbVar.e();
        super.f(z);
        mdbVar.g(ntnVar.b);
    }

    @Override // defpackage.ntv, defpackage.ntt
    public final void h() {
        ntn ntnVar = this.a;
        mdb mdbVar = ntnVar.a;
        mdbVar.e();
        mdbVar.g(ntnVar.e);
    }
}
