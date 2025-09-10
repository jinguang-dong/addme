package defpackage;

import j$.time.Instant;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qoh implements qny {
    final /* synthetic */ rcg a;

    public qoh(rcg rcgVar) {
        this.a = rcgVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r3v29, types: [java.lang.Object, uem] */
    @Override // defpackage.qny
    public final boolean a(tpc tpcVar) {
        rcg rcgVar = this.a;
        int i = 0;
        if (((Boolean) rcgVar.e.a()).booleanValue()) {
            rwc rwcVar = (rwc) rcgVar.b;
            if (rwcVar.h()) {
                int i2 = 0;
                while (true) {
                    if (i2 >= ((qnu) tpcVar.b).e.size()) {
                        i2 = -1;
                        break;
                    }
                    if (((qnq) ((qnu) tpcVar.b).e.get(i2)).b == 3) {
                        break;
                    }
                    i2++;
                }
                if (i2 != -1) {
                    if (!tpcVar.b.C()) {
                        tpcVar.o();
                    }
                    qnu qnuVar = (qnu) tpcVar.b;
                    qnuVar.b();
                    qnuVar.e.remove(i2);
                }
                tpc tpcVarM = qns.a.m();
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                qns qnsVar = (qns) tpcVarM.b;
                int i3 = 1;
                qnsVar.e = 1;
                qnsVar.b |= 2;
                Instant instantNow = Instant.now();
                trn trnVarC = tsi.c(instantNow.getEpochSecond(), instantNow.getNano());
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                qns qnsVar2 = (qns) tpcVarM.b;
                trnVarC.getClass();
                qnsVar2.d = trnVarC;
                qnsVar2.b |= 1;
                if (((Boolean) rcgVar.f.a()).booleanValue()) {
                    sbp sbpVarA = ((qva) rwcVar.c()).a();
                    long jLongValue = ((Long) rcgVar.c.a()).longValue();
                    long jLongValue2 = ((Long) rcgVar.a.a()).longValue();
                    Stream map = Collection.EL.stream(sbpVarA).map(new qoi(i3));
                    int i4 = sbp.d;
                    sbp sbpVarA2 = qom.a((List) map.collect(ryv.a), jLongValue, jLongValue2);
                    int size = sbpVarA2.size();
                    while (i < size) {
                        vaa vaaVar = (vaa) sbpVarA2.get(i);
                        tpc tpcVarM2 = uzx.a.m();
                        if (!tpcVarM2.b.C()) {
                            tpcVarM2.o();
                        }
                        uzx uzxVar = (uzx) tpcVarM2.b;
                        vaaVar.getClass();
                        uzxVar.d = vaaVar;
                        uzxVar.c = 3;
                        tpc tpcVarM3 = uzw.a.m();
                        if (!tpcVarM3.b.C()) {
                            tpcVarM3.o();
                        }
                        uzw.c((uzw) tpcVarM3.b);
                        uzw uzwVar = (uzw) tpcVarM3.l();
                        if (!tpcVarM2.b.C()) {
                            tpcVarM2.o();
                        }
                        uzx uzxVar2 = (uzx) tpcVarM2.b;
                        uzwVar.getClass();
                        uzxVar2.e = uzwVar;
                        uzxVar2.b |= 1;
                        tpcVarM.aE(tpcVarM2);
                        i++;
                    }
                } else {
                    sbp sbpVarB = ((qva) rwcVar.c()).b();
                    long jLongValue3 = ((Long) rcgVar.c.a()).longValue();
                    long jLongValue4 = ((Long) rcgVar.a.a()).longValue();
                    Stream map2 = Collection.EL.stream(sbpVarB).map(new ndu(20));
                    int i5 = sbp.d;
                    sbp sbpVarA3 = qom.a((List) map2.collect(ryv.a), jLongValue3, jLongValue4);
                    int size2 = sbpVarA3.size();
                    while (i < size2) {
                        uys uysVar = (uys) sbpVarA3.get(i);
                        tpc tpcVarM4 = uzx.a.m();
                        if (!tpcVarM4.b.C()) {
                            tpcVarM4.o();
                        }
                        uzx uzxVar3 = (uzx) tpcVarM4.b;
                        uysVar.getClass();
                        uzxVar3.d = uysVar;
                        uzxVar3.c = 1;
                        tpc tpcVarM5 = uzw.a.m();
                        if (!tpcVarM5.b.C()) {
                            tpcVarM5.o();
                        }
                        uzw.c((uzw) tpcVarM5.b);
                        uzw uzwVar2 = (uzw) tpcVarM5.l();
                        if (!tpcVarM4.b.C()) {
                            tpcVarM4.o();
                        }
                        uzx uzxVar4 = (uzx) tpcVarM4.b;
                        uzwVar2.getClass();
                        uzxVar4.e = uzwVar2;
                        uzxVar4.b |= 1;
                        tpcVarM.aE(tpcVarM4);
                        i++;
                    }
                }
                tpc tpcVarM6 = qnq.a.m();
                qns qnsVar3 = (qns) tpcVarM.l();
                if (!tpcVarM6.b.C()) {
                    tpcVarM6.o();
                }
                qnq qnqVar = (qnq) tpcVarM6.b;
                qnsVar3.getClass();
                qnqVar.c = qnsVar3;
                qnqVar.b = 3;
                tpcVar.aD(tpcVarM6);
                return true;
            }
        }
        return false;
    }
}
