package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aax extends ujq implements uiq {
    final /* synthetic */ bte a;
    final /* synthetic */ long b;
    final /* synthetic */ long c = 0;
    final /* synthetic */ uiq d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aax(bte bteVar, long j, long j2, uiq uiqVar) {
        super(1);
        this.a = bteVar;
        this.b = j;
        this.d = uiqVar;
    }

    @Override // defpackage.uiq
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        long j = this.b;
        int iB = chy.b(j);
        int iB2 = chy.b(0L);
        ((btd) obj).u(this.a, chy.a(j) + chy.a(0L), iB + iB2, this.d);
        return ufg.a;
    }
}
