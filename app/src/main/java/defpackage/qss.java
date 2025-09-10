package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.os.Trace;
import android.util.ArrayMap;
import com.google.android.apps.camera.debug.metrics.CYLp.GdpuLBytnYW;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qss extends qsy implements qov, qqs {
    private final qpf a;
    private final qtg b;
    private final qso c;
    private final qsr d;
    private final ArrayMap e;
    private final Executor f;
    private final qqp g;
    private final uem h;
    private final qtb i;
    private final rwc j;
    private final uem k;

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, tzj] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, uem] */
    public qss(qqq qqqVar, Context context, qpf qpfVar, tzj tzjVar, qso qsoVar, uem uemVar, uem uemVar2, Executor executor, qth qthVar, uem uemVar3, qsz qszVar, qtb qtbVar, rwc rwcVar, uem uemVar4) {
        ArrayMap arrayMap = new ArrayMap();
        this.e = arrayMap;
        rnt.L(true);
        this.f = executor;
        this.g = qqqVar.a(executor, tzjVar, uemVar2);
        this.a = qpfVar;
        this.h = uemVar;
        this.c = qsoVar;
        qsr qsrVar = new qsr(arrayMap, uemVar3);
        this.d = qsrVar;
        ?? A = qthVar.a.a();
        A.getClass();
        syx syxVar = (syx) qthVar.b.a();
        syxVar.getClass();
        this.b = new qtg(A, syxVar, qsrVar);
        this.i = qtbVar;
        this.j = rwcVar;
        this.k = uemVar4;
    }

    public static /* synthetic */ uzm c(qss qssVar, uzl uzlVar) {
        uem uemVar = qssVar.k;
        int iIntValue = ((Long) uemVar.a()).intValue();
        if (iIntValue == 0 || iIntValue == 1) {
            uzlVar.aH(uxz.d);
            return (uzm) uzlVar.l();
        }
        if (iIntValue != 2) {
            if (iIntValue == 3) {
                return (uzm) uzlVar.l();
            }
            ((sgt) ((sgt) qnj.a.c().g(1, TimeUnit.HOURS)).M(5744)).v("Unsupported experimental jank collection configuration: %s", new qos(((Long) uemVar.a()).longValue()));
            uzlVar.aH(uxz.d);
            return (uzm) uzlVar.l();
        }
        tql tqlVar = uxz.d;
        tpf tpfVar = (tpf) uzlVar.b;
        tpfVar.i(tqlVar);
        Object objK = tpfVar.r.k((tpg) tqlVar.c);
        if (objK == null) {
            objK = tqlVar.b;
        } else {
            tqlVar.b(objK);
        }
        uxz uxzVar = (uxz) objK;
        if (uxzVar.b.size() != uxzVar.c.size()) {
            ((sgt) ((sgt) qnj.a.c().g(1, TimeUnit.HOURS)).M(5743)).E("Experimental jank data is invalid, clearing extension. Deadline count %s != Total Duration count %s.", new qos(uxzVar.b.size()), new qos(uxzVar.c.size()));
            uzlVar.aH(tqlVar);
            return (uzm) uzlVar.l();
        }
        tpc tpcVarM = uxz.a.m();
        for (int i = 0; i < uxzVar.b.size(); i++) {
            long jA = uxzVar.b.a(i);
            long jA2 = uxzVar.c.a(i);
            if (jA2 >= jA) {
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                uxz uxzVar2 = (uxz) tpcVarM.b;
                uxzVar2.c();
                uxzVar2.b.f(jA);
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                uxz uxzVar3 = (uxz) tpcVarM.b;
                uxzVar3.i();
                uxzVar3.c.f(jA2);
            }
        }
        uzlVar.aI(tqlVar, (uxz) tpcVarM.l());
        return (uzm) uzlVar.l();
    }

    public syu b(Activity activity) {
        qsu qsuVar;
        uzr uzrVar;
        int i;
        qtd qtdVarA = qtd.a(activity);
        rvk rvkVar = rvk.a;
        qsw qswVar = new qsw(qtdVarA, rvkVar, rvkVar);
        qvr qvrVar = this.g.c;
        boolean z = qvrVar.b;
        qvv qvvVar = qvrVar.a;
        if (!z || !qvvVar.d()) {
            return syq.a;
        }
        ArrayMap arrayMap = this.e;
        synchronized (arrayMap) {
            qsuVar = (qsu) arrayMap.remove(qswVar.a);
            if (arrayMap.isEmpty()) {
                this.b.j();
            }
        }
        if (qsuVar == null) {
            return syq.a;
        }
        qtb qtbVar = this.i;
        String strB = qswVar.a.b();
        int i2 = 0;
        if (Trace.isEnabled()) {
            Trace.endAsyncSection(String.format("J<%s>", strB), 352691800);
            for (qte qteVar : ((qtf) qtbVar.b.a()).c) {
                int iAz = a.az(qteVar.b);
                if (iAz == 0) {
                    iAz = 1;
                }
                switch (iAz - 1) {
                    case 1:
                        i = 0;
                        break;
                    case 2:
                        i = qsuVar.f;
                        break;
                    case 3:
                        i = qsuVar.h;
                        break;
                    case 4:
                        i = qsuVar.i;
                        break;
                    case 5:
                        i = qsuVar.j;
                        break;
                    case 6:
                        i = qsuVar.k;
                        break;
                    case 7:
                        i = qsuVar.m;
                        break;
                    default:
                        String str = qteVar.c;
                        continue;
                }
                Trace.setCounter(qteVar.c.replace("%EVENT_NAME%", strB), i);
            }
        }
        if (qsuVar.h == 0) {
            return syq.a;
        }
        uem uemVar = qtbVar.b;
        if (((qtf) uemVar.a()).d) {
            long millis = TimeUnit.SECONDS.toMillis(9L);
            Long.valueOf(millis).getClass();
            if (qsuVar.m <= millis && qsuVar.f != 0) {
                qqy qqyVar = (qqy) qtbVar.a.a();
                String strReplace = ((qtf) uemVar.a()).b.replace("%PACKAGE_NAME%", qtbVar.d.getPackageName());
                strReplace.getClass();
                qqyVar.a(strReplace);
            }
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - qsuVar.c;
        uzl uzlVar = (uzl) uzm.a.m();
        if (!uzlVar.b.C()) {
            uzlVar.o();
        }
        uzm uzmVar = (uzm) uzlVar.b;
        uzmVar.b |= 16;
        uzmVar.g = ((int) jElapsedRealtime) + 1;
        int i3 = qsuVar.f;
        if (!uzlVar.b.C()) {
            uzlVar.o();
        }
        uzm uzmVar2 = (uzm) uzlVar.b;
        uzmVar2.b |= 1;
        uzmVar2.c = i3;
        int i4 = qsuVar.h;
        if (!uzlVar.b.C()) {
            uzlVar.o();
        }
        uzm uzmVar3 = (uzm) uzlVar.b;
        uzmVar3.b |= 2;
        uzmVar3.d = i4;
        int i5 = qsuVar.i;
        if (!uzlVar.b.C()) {
            uzlVar.o();
        }
        uzm uzmVar4 = (uzm) uzlVar.b;
        uzmVar4.b |= 4;
        uzmVar4.e = i5;
        int i6 = qsuVar.k;
        if (!uzlVar.b.C()) {
            uzlVar.o();
        }
        uzm uzmVar5 = (uzm) uzlVar.b;
        uzmVar5.b |= 32;
        uzmVar5.h = i6;
        int i7 = qsuVar.m;
        if (!uzlVar.b.C()) {
            uzlVar.o();
        }
        uzm uzmVar6 = (uzm) uzlVar.b;
        uzmVar6.b |= 64;
        uzmVar6.i = i7;
        int i8 = qsuVar.j;
        if (!uzlVar.b.C()) {
            uzlVar.o();
        }
        uzm uzmVar7 = (uzm) uzlVar.b;
        uzmVar7.b |= 8;
        uzmVar7.f = i8;
        if (qsuVar.o) {
            tql tqlVar = uxz.d;
            tpc tpcVarM = uxz.a.m();
            List list = qsuVar.p;
            list.getClass();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxz uxzVar = (uxz) tpcVarM.b;
            uxzVar.c();
            tnq.e(list, uxzVar.b);
            List list2 = qsuVar.q;
            list2.getClass();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxz uxzVar2 = (uxz) tpcVarM.b;
            uxzVar2.i();
            tnq.e(list2, uxzVar2.c);
            uzlVar.aI(tqlVar, (uxz) tpcVarM.l());
        }
        int i9 = qsuVar.n;
        if (i9 != Integer.MIN_VALUE) {
            int[] iArr = qsuVar.e;
            int[] iArr2 = qsu.b;
            tpc tpcVarM2 = uzr.a.m();
            int i10 = 0;
            while (true) {
                if (i10 >= 52) {
                    if (iArr[51] > 0) {
                        tpcVarM2.ay(i9 + 1);
                        tpcVarM2.az(0);
                    }
                    uzrVar = (uzr) tpcVarM2.l();
                } else if (iArr2[i10] > i9) {
                    tpcVarM2.az(0);
                    tpcVarM2.ay(i9 + 1);
                    uzrVar = (uzr) tpcVarM2.l();
                } else {
                    int i11 = iArr[i10];
                    if (i11 > 0 || (i10 > 0 && iArr[i10 - 1] > 0)) {
                        tpcVarM2.az(i11);
                        tpcVarM2.ay(iArr2[i10]);
                    }
                    i10++;
                }
            }
            if (!uzlVar.b.C()) {
                uzlVar.o();
            }
            uzm uzmVar8 = (uzm) uzlVar.b;
            uzrVar.getClass();
            uzmVar8.n = uzrVar;
            uzmVar8.b |= 2048;
            int i12 = qsuVar.g;
            if (!uzlVar.b.C()) {
                uzlVar.o();
            }
            uzm uzmVar9 = (uzm) uzlVar.b;
            uzmVar9.b |= 512;
            uzmVar9.l = i12;
            int i13 = qsuVar.l;
            if (!uzlVar.b.C()) {
                uzlVar.o();
            }
            uzm uzmVar10 = (uzm) uzlVar.b;
            uzmVar10.b |= 1024;
            uzmVar10.m = i13;
        }
        while (i2 < 29) {
            int i14 = i2 + 1;
            int[] iArr3 = qsuVar.d;
            if (iArr3[i2] > 0) {
                tpc tpcVarM3 = uzk.a.m();
                int i15 = iArr3[i2];
                if (!tpcVarM3.b.C()) {
                    tpcVarM3.o();
                }
                tph tphVar = tpcVarM3.b;
                uzk uzkVar = (uzk) tphVar;
                uzkVar.b |= 1;
                uzkVar.c = i15;
                int[] iArr4 = qsu.a;
                int i16 = iArr4[i2];
                if (!tphVar.C()) {
                    tpcVarM3.o();
                }
                tph tphVar2 = tpcVarM3.b;
                uzk uzkVar2 = (uzk) tphVar2;
                uzkVar2.b |= 2;
                uzkVar2.d = i16;
                if (i14 < 29) {
                    int i17 = iArr4[i14] - 1;
                    if (!tphVar2.C()) {
                        tpcVarM3.o();
                    }
                    uzk uzkVar3 = (uzk) tpcVarM3.b;
                    uzkVar3.b |= 4;
                    uzkVar3.e = i17;
                }
                if (!uzlVar.b.C()) {
                    uzlVar.o();
                }
                uzm uzmVar11 = (uzm) uzlVar.b;
                uzk uzkVar4 = (uzk) tpcVarM3.l();
                uzkVar4.getClass();
                tpw tpwVar = uzmVar11.k;
                if (!tpwVar.c()) {
                    uzmVar11.k = tph.v(tpwVar);
                }
                uzmVar11.k.add(uzkVar4);
            }
            i2 = i14;
        }
        uzm uzmVar12 = (uzm) uzlVar.l();
        byte[] bArr = null;
        tpc tpcVar = (tpc) uzmVar12.a(5, null);
        tpcVar.r(uzmVar12);
        uzl uzlVar2 = (uzl) tpcVar;
        tql tqlVar2 = uxz.d;
        tpf tpfVar = (tpf) uzlVar2.b;
        tpfVar.i(tqlVar2);
        return !tpfVar.r.m((tpg) tqlVar2.c) ? this.g.b(r((uzm) uzlVar2.l(), qswVar)) : swz.j(ske.Q(new fsu(this, uzlVar2, 11, bArr), this.f), new pzn(this, qswVar, 17), sxo.a);
    }

    @Override // defpackage.qqs
    public void cA() {
        qpf qpfVar = this.a;
        qpfVar.a(this.b);
        qpfVar.a(this.c);
    }

    public void d(Activity activity) {
        qtd qtdVarA = qtd.a(activity);
        if (this.g.c(qtdVarA.b())) {
            ArrayMap arrayMap = this.e;
            synchronized (arrayMap) {
                if (arrayMap.size() >= 25) {
                    ((sgt) qnj.a.c().M(5746)).v("Too many concurrent measurements, ignoring %s", qtdVarA);
                    return;
                }
                qsu qsuVarB = ((qsv) this.h).a();
                qsu qsuVar = (qsu) arrayMap.put(qtdVarA, qsuVarB);
                if (qsuVar != null) {
                    arrayMap.put(qtdVarA, qsuVar);
                    ((sgt) qnj.a.c().M(5745)).v("measurement already started: %s", qtdVarA);
                    return;
                }
                rwc rwcVar = this.j;
                if (rwcVar.h() && ((qsq) rwcVar.c()).a() && !qsuVarB.o) {
                    qsuVarB.p = new ArrayList();
                    qsuVarB.q = new ArrayList();
                    qsuVarB.o = true;
                }
                if (arrayMap.size() == 1) {
                    this.b.i();
                }
                String strB = qtdVarA.b();
                if (Trace.isEnabled()) {
                    Trace.beginAsyncSection(String.format("J<%s>", strB), 352691800);
                }
            }
        }
    }

    @Override // defpackage.qov
    public void i(qna qnaVar) {
        ArrayMap arrayMap = this.e;
        synchronized (arrayMap) {
            arrayMap.clear();
        }
    }

    @Override // defpackage.qov
    public /* synthetic */ void j(qna qnaVar) {
    }

    private static qqm r(uzm uzmVar, qsw qswVar) {
        qql qqlVarA = qqm.a();
        tpc tpcVarM = uzu.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        uzu uzuVar = (uzu) tpcVarM.b;
        uzmVar.getClass();
        uzuVar.k = uzmVar;
        uzuVar.b |= 1024;
        qqlVarA.f((uzu) tpcVarM.l());
        qqlVarA.b = null;
        qtd qtdVar = qswVar.a;
        qqlVarA.c = GdpuLBytnYW.dvuqsGfV;
        qqlVarA.a = qtdVar.b();
        qqlVarA.c(true);
        return qqlVarA.a();
    }
}
