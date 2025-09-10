package defpackage;

/* loaded from: classes2.dex */
public final class urp extends uhp {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ urq c;
    Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public urp(urq urqVar, uhb uhbVar) {
        super(uhbVar);
        this.c = urqVar;
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.gc(null, this);
    }
}
