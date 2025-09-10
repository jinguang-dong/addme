package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class urw extends uhp {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ urx c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public urw(urx urxVar, uhb uhbVar) {
        super(uhbVar);
        this.c = urxVar;
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
