package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class btp extends ujq implements uiu {
    final /* synthetic */ bik a;
    final /* synthetic */ uiu b;
    final /* synthetic */ int c;
    final /* synthetic */ hls d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btp(hls hlsVar, bik bikVar, uiu uiuVar, int i) {
        super(2);
        this.d = hlsVar;
        this.a = bikVar;
        this.b = uiuVar;
        this.c = i;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iJ = bay.j(this.c | 1);
        btq.b(this.d, this.a, this.b, (ayc) obj, iJ);
        return ufg.a;
    }
}
