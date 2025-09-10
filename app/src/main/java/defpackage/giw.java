package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class giw extends gju {
    final /* synthetic */ gix a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public giw(gix gixVar) {
        super(gixVar);
        this.a = gixVar;
    }

    @Override // defpackage.gju, defpackage.gjy, defpackage.gjw
    public final void d() {
        gix gixVar = this.a;
        mdb mdbVar = gixVar.a;
        mdbVar.e();
        super.d();
        mdbVar.g(gixVar.c);
    }

    @Override // defpackage.gju, defpackage.gjy, defpackage.gjw
    public final void h() {
        gix gixVar = this.a;
        mdb mdbVar = gixVar.a;
        mdbVar.e();
        super.h();
        mdbVar.g(gixVar.b);
    }
}
