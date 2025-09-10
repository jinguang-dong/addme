package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nsh implements uiw {
    final /* synthetic */ nrx a;
    final /* synthetic */ nsk b;
    final /* synthetic */ dme c;
    final /* synthetic */ Integer d;

    public nsh(nrx nrxVar, nsk nskVar, dme dmeVar, Integer num) {
        this.a = nrxVar;
        this.b = nskVar;
        this.c = dmeVar;
        this.d = num;
    }

    @Override // defpackage.uiw
    public final /* bridge */ /* synthetic */ Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        ayc aycVar = (ayc) obj3;
        int iIntValue = ((Number) obj4).intValue();
        ((akx) obj).getClass();
        ((alv) obj2).getClass();
        if ((iIntValue & 129) == 128 && aycVar.G()) {
            aycVar.r();
        } else {
            nrx nrxVar = this.a;
            nsk nskVar = this.b;
            dme dmeVar = this.c;
            Integer num = this.d;
            num.getClass();
            jsv.s(nrxVar, nskVar, dmeVar, num.intValue(), aycVar, 0);
        }
        return ufg.a;
    }
}
