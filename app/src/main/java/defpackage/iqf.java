package defpackage;

/* loaded from: classes2.dex */
public final class iqf extends uhp {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ iqb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iqf(iqb iqbVar, uhb uhbVar) {
        super(uhbVar);
        this.c = iqbVar;
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
