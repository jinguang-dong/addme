package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class crm extends uhp {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ cru c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crm(cru cruVar, uhb uhbVar) {
        super(uhbVar);
        this.c = cruVar;
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(this);
    }
}
