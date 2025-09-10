package defpackage;

import android.os.health.HealthStats;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qqb extends qqa {
    public static final qqb a = new qqb();

    private qqb() {
    }

    @Override // defpackage.qqa
    public final /* synthetic */ tqr a(String str, Object obj) {
        HealthStats healthStats = (HealthStats) obj;
        tpc tpcVarM = uxv.a.m();
        int iK = (int) qpt.k(healthStats, 50001);
        if (iK != 0) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxv uxvVar = (uxv) tpcVarM.b;
            uxvVar.b |= 1;
            uxvVar.c = iK;
        }
        int iK2 = (int) qpt.k(healthStats, 50002);
        if (iK2 != 0) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxv uxvVar2 = (uxv) tpcVarM.b;
            uxvVar2.b |= 2;
            uxvVar2.d = iK2;
        }
        if (str != null) {
            uxr uxrVarN = qpt.n(str);
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxv uxvVar3 = (uxv) tpcVarM.b;
            uxrVarN.getClass();
            uxvVar3.e = uxrVarN;
            uxvVar3.b |= 4;
        }
        uxv uxvVar4 = (uxv) tpcVarM.l();
        if (qpt.u(uxvVar4)) {
            return null;
        }
        return uxvVar4;
    }

    @Override // defpackage.qqa
    public final /* synthetic */ tqr b(tqr tqrVar, tqr tqrVar2) {
        int i;
        int i2;
        uxv uxvVar = (uxv) tqrVar;
        uxv uxvVar2 = (uxv) tqrVar2;
        if (uxvVar == null || uxvVar2 == null) {
            return uxvVar;
        }
        tpc tpcVarM = uxv.a.m();
        if ((uxvVar.b & 1) != 0 && (i2 = uxvVar.c - uxvVar2.c) != 0) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxv uxvVar3 = (uxv) tpcVarM.b;
            uxvVar3.b |= 1;
            uxvVar3.c = i2;
        }
        if ((uxvVar.b & 2) != 0 && (i = uxvVar.d - uxvVar2.d) != 0) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxv uxvVar4 = (uxv) tpcVarM.b;
            uxvVar4.b |= 2;
            uxvVar4.d = i;
        }
        uxr uxrVar = uxvVar.e;
        if (uxrVar == null) {
            uxrVar = uxr.a;
        }
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        uxv uxvVar5 = (uxv) tpcVarM.b;
        uxrVar.getClass();
        uxvVar5.e = uxrVar;
        uxvVar5.b |= 4;
        uxv uxvVar6 = (uxv) tpcVarM.l();
        if (qpt.u(uxvVar6)) {
            return null;
        }
        return uxvVar6;
    }

    @Override // defpackage.qqa
    public final /* bridge */ /* synthetic */ String c(tqr tqrVar) {
        uxr uxrVar = ((uxv) tqrVar).e;
        if (uxrVar == null) {
            uxrVar = uxr.a;
        }
        return uxrVar.d;
    }
}
