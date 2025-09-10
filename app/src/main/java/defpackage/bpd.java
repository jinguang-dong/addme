package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bpd extends uhp {
    long a;
    /* synthetic */ Object b;
    final /* synthetic */ bpe c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpd(bpe bpeVar, uhb uhbVar) {
        super(uhbVar);
        this.c = bpeVar;
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.d(0L, this);
    }
}
