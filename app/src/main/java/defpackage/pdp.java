package defpackage;

import j$.util.Map;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pdp extends ojl {
    private final sbp a;
    private final pbn b;
    private final String c;
    private final Map d;

    public pdp(sbp sbpVar, pbn pbnVar, String str) {
        sbv sbvVarB;
        super((short[]) null);
        this.a = sbpVar;
        this.b = pbnVar;
        this.c = str;
        if (pbnVar instanceof pbl) {
            sbvVarB = sfc.a;
        } else {
            sbr sbrVar = new sbr();
            int size = sbpVar.size();
            for (int i = 0; i < size; i++) {
                ojl ojlVar = (ojl) sbpVar.get(i);
                sbrVar.f(ojlVar, ojl.bJ(ojlVar.getClass()));
            }
            sbvVarB = sbrVar.b();
        }
        this.d = sbvVarB;
    }

    private final String cm(ojl ojlVar) {
        return (String) Map.EL.getOrDefault(this.d, ojlVar, "FrameListener");
    }

    @Override // defpackage.ojl
    public final void a(poe poeVar) {
        String str = this.c;
        pbn pbnVar = this.b;
        pbnVar.f(str.concat("#onCompleted"));
        sbp sbpVar = this.a;
        int size = sbpVar.size();
        for (int i = 0; i < size; i++) {
            ojl ojlVar = (ojl) sbpVar.get(i);
            pbnVar.f(cm(ojlVar));
            ojlVar.a(poeVar);
            pbnVar.g();
        }
        pbnVar.g();
    }

    @Override // defpackage.ojl
    public final void dG(peo peoVar, long j) {
        sbp sbpVar = this.a;
        int size = sbpVar.size();
        for (int i = 0; i < size; i++) {
            ((ojl) sbpVar.get(i)).dG(peoVar, j);
        }
    }

    @Override // defpackage.ojl
    public final void dH(piw piwVar) {
        sbp sbpVar = this.a;
        int size = sbpVar.size();
        for (int i = 0; i < size; i++) {
            ((ojl) sbpVar.get(i)).dH(piwVar);
        }
    }

    @Override // defpackage.ojl
    public final void dT(pnx pnxVar) {
        sbp sbpVar = this.a;
        int size = sbpVar.size();
        for (int i = 0; i < size; i++) {
            ((ojl) sbpVar.get(i)).dT(pnxVar);
        }
    }

    @Override // defpackage.ojl
    public final void dV(Set set) {
        sbp sbpVar = this.a;
        int size = sbpVar.size();
        for (int i = 0; i < size; i++) {
            ((ojl) sbpVar.get(i)).dV(set);
        }
    }

    @Override // defpackage.ojl
    public final void dW() {
        sbp sbpVar = this.a;
        int size = sbpVar.size();
        for (int i = 0; i < size; i++) {
            ((ojl) sbpVar.get(i)).dW();
        }
    }

    @Override // defpackage.ojl
    public final void l(pdo pdoVar) {
        String str = this.c;
        pbn pbnVar = this.b;
        pbnVar.f(str.concat("#onStarted"));
        sbp sbpVar = this.a;
        int size = sbpVar.size();
        for (int i = 0; i < size; i++) {
            ojl ojlVar = (ojl) sbpVar.get(i);
            pbnVar.f(cm(ojlVar));
            ojlVar.l(pdoVar);
            pbnVar.g();
        }
        pbnVar.g();
    }

    @Override // defpackage.ojl
    public final void m(long j) {
        sbp sbpVar = this.a;
        int size = sbpVar.size();
        for (int i = 0; i < size; i++) {
            ((ojl) sbpVar.get(i)).m(j);
        }
    }

    @Override // defpackage.ojl
    public final void n() {
        sbp sbpVar = this.a;
        int size = sbpVar.size();
        for (int i = 0; i < size; i++) {
            ((ojl) sbpVar.get(i)).n();
        }
    }
}
