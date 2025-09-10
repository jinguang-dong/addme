package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class giv extends gjt {
    final /* synthetic */ gix a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public giv(gix gixVar) {
        super(gixVar);
        this.a = gixVar;
    }

    @Override // defpackage.gjt, defpackage.gjy, defpackage.gjw
    public final void f() {
        gix gixVar = this.a;
        mdb mdbVar = gixVar.a;
        mdbVar.e();
        super.f();
        mdbVar.g(gixVar.d);
    }
}
