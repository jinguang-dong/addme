package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pto extends uhp {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ ptq c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pto(ptq ptqVar, uhb uhbVar) {
        super(uhbVar);
        this.c = ptqVar;
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, null, this);
    }
}
