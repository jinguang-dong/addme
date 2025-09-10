package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class vo extends uhp {
    /* synthetic */ Object a;
    final /* synthetic */ vp b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo(vp vpVar, uhb uhbVar) {
        super(uhbVar);
        this.b = vpVar;
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
