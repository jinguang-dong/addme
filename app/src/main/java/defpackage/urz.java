package defpackage;

/* loaded from: classes.dex */
public final class urz extends uhp {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ usa c;
    Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public urz(usa usaVar, uhb uhbVar) {
        super(uhbVar);
        this.c = usaVar;
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.gc(null, this);
    }
}
