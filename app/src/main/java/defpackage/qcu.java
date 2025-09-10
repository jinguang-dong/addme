package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class qcu implements reg {
    public final /* synthetic */ qbq a;
    private final /* synthetic */ int b;

    public /* synthetic */ qcu(qbq qbqVar, int i) {
        this.b = i;
        this.a = qbqVar;
    }

    @Override // defpackage.reg
    public final tqr a(qaq qaqVar, tqr tqrVar) {
        if (this.b != 0) {
            tpc tpcVarM = pvj.a.m();
            sgj sgjVarListIterator = qaqVar.j().entrySet().listIterator();
            qbq qbqVar = this.a;
            while (sgjVarListIterator.hasNext()) {
                Map.Entry entry = (Map.Entry) sgjVarListIterator.next();
                try {
                    String str = (String) entry.getValue();
                    str.getClass();
                    try {
                        tpcVarM.C((String) entry.getKey(), (pvc) qsp.y(str, (tqy) pvc.a.a(7, null)));
                    } catch (tpz e) {
                        qbu.c("SharedPreferences file groups metadata had unexpected format: %s", e);
                        qbqVar.l(1084);
                    }
                } catch (ClassCastException | NullPointerException e2) {
                    qbu.c("SharedPreferences file groups metadata key wasn't a string: %s", e2);
                    qbqVar.l(1083);
                }
            }
            return (pvj) tpcVarM.l();
        }
        tpc tpcVarM2 = pvt.a.m();
        sgj sgjVarListIterator2 = qaqVar.j().entrySet().listIterator();
        qbq qbqVar2 = this.a;
        while (sgjVarListIterator2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) sgjVarListIterator2.next();
            try {
                String str2 = (String) entry2.getValue();
                str2.getClass();
                try {
                    tpcVarM2.E((String) entry2.getKey(), (pvr) qsp.y(str2, (tqy) pvr.a.a(7, null)));
                } catch (tpz e3) {
                    qbu.c("SharedPreferences shared files metadata had unexpected format: %s", e3);
                    qbqVar2.l(1084);
                }
            } catch (ClassCastException | NullPointerException e4) {
                qbu.c("SharedPreferences shared files metadata key wasn't a string: %s", e4);
                qbqVar2.l(1083);
            }
        }
        return (pvt) tpcVarM2.l();
    }
}
