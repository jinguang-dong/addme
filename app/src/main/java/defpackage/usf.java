package defpackage;

/* loaded from: classes.dex */
public final class usf extends uhp {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ usg c;
    Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public usf(usg usgVar, uhb uhbVar) {
        super(uhbVar);
        this.c = usgVar;
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
