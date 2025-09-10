package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cqz extends uhp {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ csh c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqz(csh cshVar, uhb uhbVar) {
        super(uhbVar);
        this.c = cshVar;
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.b(this);
    }
}
