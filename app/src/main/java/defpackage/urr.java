package defpackage;

/* loaded from: classes2.dex */
public final class urr extends uhp {
    /* synthetic */ Object a;
    int b;
    Object c;
    uun d;
    final /* synthetic */ urq e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public urr(urq urqVar, uhb uhbVar) {
        super(uhbVar);
        this.e = urqVar;
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.e.gc(null, this);
    }
}
