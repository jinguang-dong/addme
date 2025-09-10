package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class huo extends uhp {
    /* synthetic */ Object a;
    final /* synthetic */ hup b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public huo(hup hupVar, uhb uhbVar) {
        super(uhbVar);
        this.b = hupVar;
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(this);
    }
}
