package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dci extends uhp {
    public /* synthetic */ Object a;
    public int b;
    final /* synthetic */ cxb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dci(cxb cxbVar, uhb uhbVar) {
        super(uhbVar);
        this.c = cxbVar;
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.f(null, this);
    }
}
