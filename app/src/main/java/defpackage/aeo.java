package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aeo extends uhp {
    long a;
    /* synthetic */ Object b;
    final /* synthetic */ aeq c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeo(aeq aeqVar, uhb uhbVar) {
        super(uhbVar);
        this.c = aeqVar;
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.e(0L, null, this);
    }
}
