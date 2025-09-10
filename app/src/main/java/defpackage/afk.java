package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afk extends uhp {
    /* synthetic */ Object a;
    final /* synthetic */ afl b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afk(afl aflVar, uhb uhbVar) {
        super(uhbVar);
        this.b = aflVar;
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(this);
    }
}
