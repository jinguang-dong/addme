package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bpa extends uhp {
    /* synthetic */ Object a;
    final /* synthetic */ bpb b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpa(bpb bpbVar, uhb uhbVar) {
        super(uhbVar);
        this.b = bpbVar;
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.e(0L, this);
    }
}
