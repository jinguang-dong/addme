package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class gio extends gjm {
    final /* synthetic */ gip a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gio(gip gipVar) {
        super(gipVar);
        this.a = gipVar;
    }

    @Override // defpackage.gjm, defpackage.gjy, defpackage.gjw
    public final void k() {
        gip gipVar = this.a;
        mdb mdbVar = gipVar.a;
        mdbVar.e();
        super.k();
        mdbVar.g(gipVar.b);
    }
}
