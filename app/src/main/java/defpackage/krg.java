package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class krg implements rpj {
    final /* synthetic */ krj a;

    public krg(krj krjVar) {
        this.a = krjVar;
    }

    @Override // defpackage.rpi
    public final void a(rpn rpnVar) {
        krj krjVar = this.a;
        krjVar.q.h(rpnVar.d);
        if (rpnVar.d == 1) {
            ksc kscVar = krjVar.v;
            tpc tpcVarM = sod.a.m();
            soc socVar = soc.OPTIONS_MENU_PRO_TAB_OPENED_EVENT;
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            sod sodVar = (sod) tpcVarM.b;
            sodVar.f = socVar.aJ;
            sodVar.b = 1 | sodVar.b;
            ((mdy) kscVar).I(tpcVarM);
        }
    }

    @Override // defpackage.rpi
    public final void b() {
    }

    @Override // defpackage.rpi
    public final void c() {
    }
}
