package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byk extends ujq implements uiu {
    final /* synthetic */ bxv a;
    final /* synthetic */ uiu b;
    final /* synthetic */ byx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public byk(bxv bxvVar, byx byxVar, uiu uiuVar) {
        super(2);
        this.a = bxvVar;
        this.c = byxVar;
        this.b = uiuVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ayc aycVar = (ayc) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (aycVar.H(i != 2, iIntValue & 1)) {
            bze.b(this.a, this.c, this.b, aycVar, 0);
        } else {
            aycVar.r();
        }
        return ufg.a;
    }
}
