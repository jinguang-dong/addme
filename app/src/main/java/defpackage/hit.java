package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hit extends hik {
    final /* synthetic */ hiu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hit(hiu hiuVar) {
        super(hiuVar);
        this.b = hiuVar;
    }

    @Override // defpackage.hik, defpackage.hig
    public final void c() {
        hiu hiuVar = this.b;
        mdb mdbVar = hiuVar.f;
        mdbVar.e();
        super.c();
        mdbVar.g(hiuVar.g);
    }

    @Override // defpackage.hik, defpackage.hig
    public final void e(boolean z) {
        hiu hiuVar = this.b;
        mdb mdbVar = hiuVar.f;
        mdbVar.e();
        super.e(z);
        mdbVar.g(hiuVar.h);
    }

    @Override // defpackage.hik, defpackage.hig
    public final void f(boolean z, boolean z2) {
        hiu hiuVar = this.b;
        mdb mdbVar = hiuVar.f;
        mdbVar.e();
        super.f(z, z2);
        mdbVar.g(hiuVar.i);
    }
}
