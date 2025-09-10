package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gig extends gjc {
    final /* synthetic */ gij a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gig(gij gijVar) {
        super(gijVar);
        this.a = gijVar;
    }

    @Override // defpackage.gjc, defpackage.gjy, defpackage.gjw
    public final void c() {
        gij gijVar = this.a;
        mdb mdbVar = gijVar.a;
        mdbVar.e();
        super.c();
        mdbVar.g(gijVar.d);
    }

    @Override // defpackage.gjc, defpackage.gjy, defpackage.gjw
    public final void d() {
        gij gijVar = this.a;
        mdb mdbVar = gijVar.a;
        mdbVar.e();
        super.d();
        mdbVar.g(gijVar.c);
    }
}
