package defpackage;

import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qof implements qny {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public qof(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.qny
    public final boolean a(tpc tpcVar) {
        if (this.b != 0) {
            tpc tpcVarM = qnq.a.m();
            tpc tpcVarM2 = qnr.a.m();
            trn trnVarB = tsi.b(Instant.now().toEpochMilli() - (SystemClock.elapsedRealtime() - Process.getStartElapsedRealtime()));
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            qnr qnrVar = (qnr) tpcVarM2.b;
            trnVarB.getClass();
            qnrVar.c = trnVarB;
            qnrVar.b |= 1;
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            Object obj = this.a;
            qnq qnqVar = (qnq) tpcVarM.b;
            qnr qnrVar2 = (qnr) tpcVarM2.l();
            qnrVar2.getClass();
            qnqVar.c = qnrVar2;
            qnqVar.b = 2;
            tpcVar.aD(tpcVarM);
            if (!((Boolean) ((qob) obj).a.a()).booleanValue()) {
                long jMyPid = Process.myPid();
                if (!tpcVar.b.C()) {
                    tpcVar.o();
                }
                qnu qnuVar = (qnu) tpcVar.b;
                qnu qnuVar2 = qnu.a;
                qnuVar.b |= 1;
                qnuVar.c = jMyPid;
                trn trnVarB2 = tsi.b(Instant.now().toEpochMilli());
                if (!tpcVar.b.C()) {
                    tpcVar.o();
                }
                qnu qnuVar3 = (qnu) tpcVar.b;
                trnVarB2.getClass();
                qnuVar3.d = trnVarB2;
                qnuVar3.b |= 2;
            }
            return true;
        }
        qog qogVar = (qog) this.a;
        if (!((Boolean) qogVar.d.a()).booleanValue()) {
            return false;
        }
        tpc tpcVarM3 = qnt.a.m();
        qqw qqwVar = (qqw) qogVar.a;
        if (qqwVar.a() != null) {
            String strA = qqwVar.a();
            if (!tpcVarM3.b.C()) {
                tpcVarM3.o();
            }
            qnt qntVar = (qnt) tpcVarM3.b;
            strA.getClass();
            qntVar.b |= 1;
            qntVar.c = strA;
        }
        hzb hzbVar = (hzb) qogVar.b;
        if (hzbVar.b().intValue() > 0) {
            int iIntValue = hzbVar.b().intValue();
            if (!tpcVarM3.b.C()) {
                tpcVarM3.o();
            }
            qnt qntVar2 = (qnt) tpcVarM3.b;
            qntVar2.b = 2 | qntVar2.b;
            qntVar2.d = iIntValue;
        }
        uem uemVar = qogVar.c;
        if (((Integer) uemVar.a()).intValue() > 0) {
            int iIntValue2 = ((Integer) uemVar.a()).intValue();
            if (!tpcVarM3.b.C()) {
                tpcVarM3.o();
            }
            qnt qntVar3 = (qnt) tpcVarM3.b;
            qntVar3.b |= 4;
            qntVar3.e = iIntValue2;
        }
        int i = Build.VERSION.SDK_INT;
        if (!tpcVarM3.b.C()) {
            tpcVarM3.o();
        }
        qnt qntVar4 = (qnt) tpcVarM3.b;
        qntVar4.b |= 8;
        qntVar4.f = i;
        tpc tpcVarM4 = qnq.a.m();
        if (!tpcVarM4.b.C()) {
            tpcVarM4.o();
        }
        qnq qnqVar2 = (qnq) tpcVarM4.b;
        qnt qntVar5 = (qnt) tpcVarM3.l();
        qntVar5.getClass();
        qnqVar2.c = qntVar5;
        qnqVar2.b = 4;
        qnq qnqVar3 = (qnq) tpcVarM4.l();
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        qnu qnuVar4 = (qnu) tpcVar.b;
        qnu qnuVar5 = qnu.a;
        qnqVar3.getClass();
        qnuVar4.b();
        qnuVar4.e.add(qnqVar3);
        return true;
    }
}
