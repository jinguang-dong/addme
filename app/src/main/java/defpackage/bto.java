package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bto extends ujq implements uiu {
    final /* synthetic */ bik a;
    final /* synthetic */ uiu b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bto(bik bikVar, uiu uiuVar, int i, int i2) {
        super(2);
        this.a = bikVar;
        this.b = uiuVar;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iJ = bay.j(this.c | 1);
        int i = this.d;
        btq.a(this.a, this.b, (ayc) obj, iJ, i);
        return ufg.a;
    }
}
