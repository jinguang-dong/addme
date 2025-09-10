package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mqc extends moq {
    final /* synthetic */ mqe b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mqc(mqe mqeVar) {
        super(mqeVar);
        this.b = mqeVar;
    }

    @Override // defpackage.moq, defpackage.mop
    public final void d() {
        mqe mqeVar = this.b;
        mdb mdbVar = mqeVar.j;
        mdbVar.e();
        mdbVar.g(mqeVar.l);
    }
}
