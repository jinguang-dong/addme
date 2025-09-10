package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class csa extends uhp {
    Object a;
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ csb d;
    int e;
    crx f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csa(csb csbVar, uhb uhbVar) {
        super(uhbVar);
        this.d = csbVar;
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(null, this);
    }
}
