package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nol extends nou {
    final /* synthetic */ nom a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nol(nom nomVar) {
        super(nomVar);
        this.a = nomVar;
    }

    @Override // defpackage.nou, defpackage.nor
    public final void fb() {
        nom nomVar = this.a;
        mdb mdbVar = nomVar.a;
        mdbVar.e();
        super.fb();
        mdbVar.g(nomVar.c);
    }

    @Override // defpackage.nou, defpackage.nor
    public final void h() {
        nom nomVar = this.a;
        mdb mdbVar = nomVar.a;
        mdbVar.e();
        super.h();
        mdbVar.g(nomVar.b);
    }
}
