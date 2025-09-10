package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hir extends hii {
    final /* synthetic */ hiu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hir(hiu hiuVar) {
        super(hiuVar);
        this.b = hiuVar;
    }

    @Override // defpackage.hii, defpackage.hig
    public final void d(int i, int i2, float f) {
        hiu hiuVar = this.b;
        mdb mdbVar = hiuVar.f;
        mdbVar.e();
        super.d(i, i2, f);
        mdbVar.g(hiuVar.h);
    }
}
