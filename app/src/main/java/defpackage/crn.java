package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class crn extends uhp {
    boolean a;
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ cru d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crn(cru cruVar, uhb uhbVar) {
        super(uhbVar);
        this.d = cruVar;
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.d(false, this);
    }
}
