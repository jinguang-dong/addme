package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fwx extends uhp {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ fxa c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fwx(fxa fxaVar, uhb uhbVar) {
        super(uhbVar);
        this.c = fxaVar;
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return fxa.a(this.c, this);
    }
}
