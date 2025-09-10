package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cwv implements cwf {
    final /* synthetic */ cwa a;
    final /* synthetic */ uka b;
    final /* synthetic */ und c;
    final /* synthetic */ cwa d;
    final /* synthetic */ umk e;
    final /* synthetic */ uiu f;
    final /* synthetic */ uxa g;

    public cwv(cwa cwaVar, uka ukaVar, und undVar, cwa cwaVar2, umk umkVar, uxa uxaVar, uiu uiuVar) {
        this.a = cwaVar;
        this.b = ukaVar;
        this.c = undVar;
        this.d = cwaVar2;
        this.e = umkVar;
        this.g = uxaVar;
        this.f = uiuVar;
    }

    @Override // defpackage.cwf
    public final void a(cwh cwhVar, cwa cwaVar) {
        if (cwaVar == this.a) {
            this.b.a = ukc.C(this.c, null, 0, new cwu(this.g, this.f, null), 3);
            return;
        }
        if (cwaVar == this.d) {
            uka ukaVar = this.b;
            uol uolVar = (uol) ukaVar.a;
            if (uolVar != null) {
                uolVar.s(null);
            }
            ukaVar.a = null;
        }
        if (cwaVar == cwa.ON_DESTROY) {
            this.e.fW(ufg.a);
        }
    }
}
