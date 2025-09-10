package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bzd extends ujq implements uiu {
    final /* synthetic */ bws a;
    final /* synthetic */ uiu b;
    final /* synthetic */ int c;
    final /* synthetic */ byx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzd(bws bwsVar, byx byxVar, uiu uiuVar, int i) {
        super(2);
        this.a = bwsVar;
        this.d = byxVar;
        this.b = uiuVar;
        this.c = i;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iJ = bay.j(this.c | 1);
        bze.b(this.a, this.d, this.b, (ayc) obj, iJ);
        return ufg.a;
    }
}
