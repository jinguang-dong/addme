package defpackage;

/* loaded from: classes2.dex */
public final class urv extends uhp {
    /* synthetic */ Object a;
    int b;
    Object c;
    Object d;
    long e;
    final /* synthetic */ urq f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public urv(urq urqVar, uhb uhbVar) {
        super(uhbVar);
        this.f = urqVar;
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.f.gc(null, this);
    }
}
