package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bpc extends uhp {
    long a;
    long b;
    /* synthetic */ Object c;
    final /* synthetic */ bpe d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpc(bpe bpeVar, uhb uhbVar) {
        super(uhbVar);
        this.d = bpeVar;
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.cV(0L, 0L, this);
    }
}
