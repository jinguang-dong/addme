package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class psl implements uiu {
    final /* synthetic */ arp a;
    final /* synthetic */ uiu b;

    public psl(arp arpVar, uiu uiuVar) {
        this.a = arpVar;
        this.b = uiuVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ayc aycVar = (ayc) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && aycVar.G()) {
            aycVar.r();
        } else {
            bay.L(new bag[]{avf.a.b(psm.a), arq.b.b(this.a), avq.b.b(false)}, this.b, aycVar, 8);
        }
        return ufg.a;
    }
}
