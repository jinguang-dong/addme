package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class edp extends uhp {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ edq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edp(edq edqVar, uhb uhbVar) {
        super(uhbVar);
        this.c = edqVar;
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
