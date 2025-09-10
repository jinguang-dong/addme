package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class uri extends uhp {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ urx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uri(urx urxVar, uhb uhbVar) {
        super(uhbVar);
        this.c = urxVar;
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
