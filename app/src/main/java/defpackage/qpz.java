package defpackage;

import android.os.health.HealthStats;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qpz extends qqa {
    public static final qpz a = new qpz();

    private qpz() {
    }

    @Override // defpackage.qqa
    public final /* synthetic */ tqr a(String str, Object obj) {
        HealthStats healthStats = (HealthStats) obj;
        tpc tpcVarM = uxu.a.m();
        long jK = qpt.k(healthStats, 30001);
        if (jK != 0) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxu uxuVar = (uxu) tpcVarM.b;
            uxuVar.b |= 1;
            uxuVar.c = jK;
        }
        long jK2 = qpt.k(healthStats, 30002);
        if (jK2 != 0) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxu uxuVar2 = (uxu) tpcVarM.b;
            uxuVar2.b |= 2;
            uxuVar2.d = jK2;
        }
        long jK3 = qpt.k(healthStats, 30003);
        if (jK3 != 0) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxu uxuVar3 = (uxu) tpcVarM.b;
            uxuVar3.b |= 4;
            uxuVar3.e = jK3;
        }
        long jK4 = qpt.k(healthStats, 30004);
        if (jK4 != 0) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxu uxuVar4 = (uxu) tpcVarM.b;
            uxuVar4.b |= 8;
            uxuVar4.f = jK4;
        }
        long jK5 = qpt.k(healthStats, 30005);
        if (jK5 != 0) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxu uxuVar5 = (uxu) tpcVarM.b;
            uxuVar5.b |= 16;
            uxuVar5.g = jK5;
        }
        long jK6 = qpt.k(healthStats, 30006);
        if (jK6 != 0) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxu uxuVar6 = (uxu) tpcVarM.b;
            uxuVar6.b |= 32;
            uxuVar6.h = jK6;
        }
        if (str != null) {
            uxr uxrVarN = qpt.n(str);
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxu uxuVar7 = (uxu) tpcVarM.b;
            uxrVarN.getClass();
            uxuVar7.i = uxrVarN;
            uxuVar7.b |= 64;
        }
        uxu uxuVar8 = (uxu) tpcVarM.l();
        if (qpt.t(uxuVar8)) {
            return null;
        }
        return uxuVar8;
    }

    @Override // defpackage.qqa
    public final /* synthetic */ tqr b(tqr tqrVar, tqr tqrVar2) {
        uxu uxuVar = (uxu) tqrVar;
        uxu uxuVar2 = (uxu) tqrVar2;
        if (uxuVar == null || uxuVar2 == null) {
            return uxuVar;
        }
        tpc tpcVarM = uxu.a.m();
        if ((uxuVar.b & 1) != 0) {
            long j = uxuVar.c - uxuVar2.c;
            if (j != 0) {
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                uxu uxuVar3 = (uxu) tpcVarM.b;
                uxuVar3.b |= 1;
                uxuVar3.c = j;
            }
        }
        if ((uxuVar.b & 2) != 0) {
            long j2 = uxuVar.d - uxuVar2.d;
            if (j2 != 0) {
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                uxu uxuVar4 = (uxu) tpcVarM.b;
                uxuVar4.b |= 2;
                uxuVar4.d = j2;
            }
        }
        if ((uxuVar.b & 4) != 0) {
            long j3 = uxuVar.e - uxuVar2.e;
            if (j3 != 0) {
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                uxu uxuVar5 = (uxu) tpcVarM.b;
                uxuVar5.b |= 4;
                uxuVar5.e = j3;
            }
        }
        if ((uxuVar.b & 8) != 0) {
            long j4 = uxuVar.f - uxuVar2.f;
            if (j4 != 0) {
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                uxu uxuVar6 = (uxu) tpcVarM.b;
                uxuVar6.b |= 8;
                uxuVar6.f = j4;
            }
        }
        if ((uxuVar.b & 16) != 0) {
            long j5 = uxuVar.g - uxuVar2.g;
            if (j5 != 0) {
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                uxu uxuVar7 = (uxu) tpcVarM.b;
                uxuVar7.b |= 16;
                uxuVar7.g = j5;
            }
        }
        if ((uxuVar.b & 32) != 0) {
            long j6 = uxuVar.h - uxuVar2.h;
            if (j6 != 0) {
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                uxu uxuVar8 = (uxu) tpcVarM.b;
                uxuVar8.b |= 32;
                uxuVar8.h = j6;
            }
        }
        uxr uxrVar = uxuVar.i;
        if (uxrVar == null) {
            uxrVar = uxr.a;
        }
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        uxu uxuVar9 = (uxu) tpcVarM.b;
        uxrVar.getClass();
        uxuVar9.i = uxrVar;
        uxuVar9.b |= 64;
        uxu uxuVar10 = (uxu) tpcVarM.l();
        if (qpt.t(uxuVar10)) {
            return null;
        }
        return uxuVar10;
    }

    @Override // defpackage.qqa
    public final /* bridge */ /* synthetic */ String c(tqr tqrVar) {
        uxr uxrVar = ((uxu) tqrVar).i;
        if (uxrVar == null) {
            uxrVar = uxr.a;
        }
        return uxrVar.d;
    }
}
