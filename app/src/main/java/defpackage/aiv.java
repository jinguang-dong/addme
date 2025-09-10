package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aiv extends uhp {
    long a;
    /* synthetic */ Object b;
    final /* synthetic */ aiw c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiv(aiw aiwVar, uhb uhbVar) {
        super(uhbVar);
        this.c = aiwVar;
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.cV(0L, 0L, this);
    }
}
