package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fwy extends uhp {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ fxa c;
    int d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fwy(fxa fxaVar, uhb uhbVar) {
        super(uhbVar);
        this.c = fxaVar;
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return fxa.i(this.c, false, 0, this);
    }
}
