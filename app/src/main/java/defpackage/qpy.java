package defpackage;

import android.os.health.HealthStats;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qpy extends qqa {
    public static final qpy a = new qpy();

    private qpy() {
    }

    @Override // defpackage.qqa
    public final /* synthetic */ tqr a(String str, Object obj) {
        HealthStats healthStats = (HealthStats) obj;
        tpc tpcVarM = uxs.a.m();
        tpcVarM.Z(qqb.a.d(qpt.m(healthStats, 40001)));
        tpcVarM.aa(qpx.a.d((healthStats == null || !healthStats.hasMeasurements(40002)) ? Collections.EMPTY_MAP : healthStats.getMeasurements(40002)));
        if (str != null) {
            uxr uxrVarN = qpt.n(str);
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxs uxsVar = (uxs) tpcVarM.b;
            uxrVarN.getClass();
            uxsVar.e = uxrVarN;
            uxsVar.b |= 1;
        }
        uxs uxsVar2 = (uxs) tpcVarM.l();
        if (qpt.s(uxsVar2)) {
            return null;
        }
        return uxsVar2;
    }

    @Override // defpackage.qqa
    public final /* synthetic */ tqr b(tqr tqrVar, tqr tqrVar2) {
        uxs uxsVar = (uxs) tqrVar;
        uxs uxsVar2 = (uxs) tqrVar2;
        if (uxsVar == null || uxsVar2 == null) {
            return uxsVar;
        }
        tpc tpcVarM = uxs.a.m();
        tpcVarM.Z(qqb.a.e(uxsVar.c, uxsVar2.c));
        tpcVarM.aa(qpx.a.e(uxsVar.d, uxsVar2.d));
        uxr uxrVar = uxsVar.e;
        if (uxrVar == null) {
            uxrVar = uxr.a;
        }
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        uxs uxsVar3 = (uxs) tpcVarM.b;
        uxrVar.getClass();
        uxsVar3.e = uxrVar;
        uxsVar3.b |= 1;
        uxs uxsVar4 = (uxs) tpcVarM.l();
        if (qpt.s(uxsVar4)) {
            return null;
        }
        return uxsVar4;
    }

    @Override // defpackage.qqa
    public final /* bridge */ /* synthetic */ String c(tqr tqrVar) {
        uxr uxrVar = ((uxs) tqrVar).e;
        if (uxrVar == null) {
            uxrVar = uxr.a;
        }
        return uxrVar.d;
    }
}
