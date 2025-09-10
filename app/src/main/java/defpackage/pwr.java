package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pwr implements pvu {
    public final Context a;
    public final qbq b;
    public final rwc c;
    public final pzr d;
    public final puu e;
    public final Executor f;
    public final rwc g;
    public final rwc h;
    public final sxi i;
    public final tql j;
    public final tql k;
    public final qaq l = new qaq((byte[]) null);
    public final lat m;
    private final List n;
    private final tdy o;

    public pwr(Context context, qbq qbqVar, pzr pzrVar, Executor executor, List list, rwc rwcVar, lat latVar, rwc rwcVar2, rwc rwcVar3, puu puuVar, tdy tdyVar, rwc rwcVar4) {
        this.a = context;
        this.b = qbqVar;
        this.n = list;
        this.c = rwcVar;
        this.f = executor;
        this.d = pzrVar;
        this.m = latVar;
        this.g = rwcVar2;
        this.h = rwcVar3;
        this.e = puuVar;
        this.o = tdyVar;
        this.i = !rwcVar4.h() ? new kjm(12) : new pwj(puuVar, pzrVar, executor, latVar, rwcVar4, 0);
        this.k = tql.g(executor);
        this.j = new tql(executor, new qcz(rwcVar3, context, 1));
    }

    public static ptr j(String str, long j, long j2, String str2, tnw tnwVar, boolean z, String str3) {
        tpe tpeVar = (tpe) ptr.a.m();
        if (!tpeVar.b.C()) {
            tpeVar.o();
        }
        ptr ptrVar = (ptr) tpeVar.b;
        str.getClass();
        ptrVar.b |= 1;
        ptrVar.c = str;
        int i = (int) j;
        if (!tpeVar.b.C()) {
            tpeVar.o();
        }
        long j3 = i;
        ptr ptrVar2 = (ptr) tpeVar.b;
        ptrVar2.b |= 4;
        ptrVar2.e = j3;
        if (!tpeVar.b.C()) {
            tpeVar.o();
        }
        ptr ptrVar3 = (ptr) tpeVar.b;
        ptrVar3.b |= 32;
        ptrVar3.h = z;
        if (!tpeVar.b.C()) {
            tpeVar.o();
        }
        ptr ptrVar4 = (ptr) tpeVar.b;
        str3.getClass();
        ptrVar4.b |= 64;
        ptrVar4.i = str3;
        if (j2 > 0) {
            if (!tpeVar.b.C()) {
                tpeVar.o();
            }
            ptr ptrVar5 = (ptr) tpeVar.b;
            ptrVar5.b |= 8;
            ptrVar5.f = (int) j2;
        }
        if (j > 2147483647L || j2 > 2147483647L) {
            tql tqlVar = ptt.e;
            tpc tpcVarM = ptt.a.m();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            tph tphVar = tpcVarM.b;
            ptt pttVar = (ptt) tphVar;
            pttVar.b |= 1;
            pttVar.c = j;
            if (!tphVar.C()) {
                tpcVarM.o();
            }
            ptt pttVar2 = (ptt) tpcVarM.b;
            pttVar2.b |= 2;
            pttVar2.d = j2;
            tpeVar.aI(tqlVar, (ptt) tpcVarM.l());
        }
        if (str2 != null) {
            if (!tpeVar.b.C()) {
                tpeVar.o();
            }
            ptr ptrVar6 = (ptr) tpeVar.b;
            ptrVar6.b |= 2;
            ptrVar6.d = str2;
        }
        if (tnwVar != null) {
            if (!tpeVar.b.C()) {
                tpeVar.o();
            }
            ptr ptrVar7 = (ptr) tpeVar.b;
            ptrVar7.g = tnwVar;
            ptrVar7.b |= 16;
        }
        return (ptr) tpeVar.l();
    }

    public static rwc k(pvl pvlVar, pvc pvcVar, puu puuVar) {
        return puuVar.I() ? (pvlVar.b & 16) != 0 ? rwc.j(pvlVar.g) : rvk.a : pvcVar != null ? rwc.j(pvcVar.t) : rvk.a;
    }

    public static suv l(pts ptsVar) {
        tpc tpcVarM = suv.a.m();
        String str = ptsVar.c;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        suv suvVar = (suv) tphVar;
        str.getClass();
        suvVar.b |= 1;
        suvVar.c = str;
        String str2 = ptsVar.d;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        tph tphVar2 = tpcVarM.b;
        suv suvVar2 = (suv) tphVar2;
        str2.getClass();
        suvVar2.b |= 4;
        suvVar2.e = str2;
        int i = ptsVar.f;
        if (!tphVar2.C()) {
            tpcVarM.o();
        }
        suv suvVar3 = (suv) tpcVarM.b;
        suvVar3.b |= 2;
        suvVar3.d = i;
        int size = ptsVar.h.size();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar3 = tpcVarM.b;
        suv suvVar4 = (suv) tphVar3;
        suvVar4.b |= 8;
        suvVar4.f = size;
        String str3 = ptsVar.j;
        if (!tphVar3.C()) {
            tpcVarM.o();
        }
        tph tphVar4 = tpcVarM.b;
        suv suvVar5 = (suv) tphVar4;
        str3.getClass();
        suvVar5.b |= 128;
        suvVar5.j = str3;
        long j = ptsVar.i;
        if (!tphVar4.C()) {
            tpcVarM.o();
        }
        suv suvVar6 = (suv) tpcVarM.b;
        suvVar6.b |= 64;
        suvVar6.i = j;
        return (suv) tpcVarM.l();
    }

    public static final rwc n(Map map, String str) {
        return rwc.i((pwv) map.get(str));
    }

    public static List o(lat latVar, Uri uri, String str) {
        ArrayList arrayList = new ArrayList();
        for (Uri uri2 : latVar.l(uri)) {
            if (latVar.s(uri2)) {
                arrayList.addAll(o(latVar, uri2, str));
            } else {
                String path = uri2.getPath();
                if (path != null) {
                    long jK = latVar.k(uri2);
                    tpe tpeVar = (tpe) ptr.a.m();
                    String strReplaceFirst = path.replaceFirst(str, "");
                    if (!tpeVar.b.C()) {
                        tpeVar.o();
                    }
                    ptr ptrVar = (ptr) tpeVar.b;
                    strReplaceFirst.getClass();
                    ptrVar.b |= 1;
                    ptrVar.c = strReplaceFirst;
                    int i = (int) jK;
                    if (!tpeVar.b.C()) {
                        tpeVar.o();
                    }
                    long j = i;
                    ptr ptrVar2 = (ptr) tpeVar.b;
                    ptrVar2.b |= 4;
                    ptrVar2.e = j;
                    String string = uri2.toString();
                    if (!tpeVar.b.C()) {
                        tpeVar.o();
                    }
                    ptr ptrVar3 = (ptr) tpeVar.b;
                    string.getClass();
                    ptrVar3.b |= 2;
                    ptrVar3.d = string;
                    if (jK > 2147483647L) {
                        tql tqlVar = ptt.e;
                        tpc tpcVarM = ptt.a.m();
                        if (!tpcVarM.b.C()) {
                            tpcVarM.o();
                        }
                        ptt pttVar = (ptt) tpcVarM.b;
                        pttVar.b |= 1;
                        pttVar.c = jK;
                        tpeVar.aI(tqlVar, (ptt) tpcVarM.l());
                    }
                    arrayList.add((ptr) tpeVar.l());
                }
            }
        }
        return arrayList;
    }

    public static syu p(final pvc pvcVar, rwc rwcVar, String str, int i, final boolean z, final pzr pzrVar, Executor executor, lat latVar) {
        tpc tpcVar;
        qdp qdpVarG;
        byte[] bArr = null;
        if (pvcVar == null) {
            return ske.M(null);
        }
        tpc tpcVarM = pts.a.m();
        String str2 = pvcVar.d;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        pts ptsVar = (pts) tphVar;
        str2.getClass();
        int i2 = 1;
        ptsVar.b |= 1;
        ptsVar.c = str2;
        String str3 = pvcVar.e;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        tph tphVar2 = tpcVarM.b;
        pts ptsVar2 = (pts) tphVar2;
        str3.getClass();
        ptsVar2.b |= 2;
        ptsVar2.d = str3;
        int i3 = pvcVar.f;
        if (!tphVar2.C()) {
            tpcVarM.o();
        }
        pts ptsVar3 = (pts) tpcVarM.b;
        ptsVar3.b |= 8;
        ptsVar3.f = i3;
        tnw tnwVar = pvcVar.g;
        if (tnwVar == null) {
            tnwVar = tnw.a;
        }
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar3 = tpcVarM.b;
        pts ptsVar4 = (pts) tphVar3;
        tnwVar.getClass();
        ptsVar4.l = tnwVar;
        ptsVar4.b |= 128;
        long j = pvcVar.s;
        if (!tphVar3.C()) {
            tpcVarM.o();
        }
        tph tphVar4 = tpcVarM.b;
        pts ptsVar5 = (pts) tphVar4;
        ptsVar5.b |= 32;
        ptsVar5.i = j;
        if (!tphVar4.C()) {
            tpcVarM.o();
        }
        tph tphVar5 = tpcVarM.b;
        pts ptsVar6 = (pts) tphVar5;
        ptsVar6.g = i - 1;
        ptsVar6.b |= 16;
        tpw tpwVar = pvcVar.u;
        if (!tphVar5.C()) {
            tpcVarM.o();
        }
        pts ptsVar7 = (pts) tpcVarM.b;
        tpw tpwVar2 = ptsVar7.k;
        if (!tpwVar2.c()) {
            ptsVar7.k = tph.v(tpwVar2);
        }
        tnq.e(tpwVar, ptsVar7.k);
        if (rwcVar.h()) {
            Object objC = rwcVar.c();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            pts ptsVar8 = (pts) tpcVarM.b;
            ptsVar8.b |= 64;
            ptsVar8.j = (String) objC;
        }
        if (str != null) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            pts ptsVar9 = (pts) tpcVarM.b;
            ptsVar9.b |= 4;
            ptsVar9.e = str;
        }
        if ((pvcVar.b & 32) != 0) {
            tnw tnwVar2 = pvcVar.h;
            if (tnwVar2 == null) {
                tnwVar2 = tnw.a;
            }
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            pts ptsVar10 = (pts) tpcVarM.b;
            tnwVar2.getClass();
            ptsVar10.m = tnwVar2;
            ptsVar10.b |= 256;
        }
        tpw tpwVar3 = pvcVar.o;
        syu syuVar = syq.a;
        int i4 = 10;
        if (i == 2 || i == 4) {
            if (pvcVar.n) {
                a.I(true);
                String string = qsp.Z(pzrVar.b, pzrVar.j, pvcVar).toString();
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                pts ptsVar11 = (pts) tpcVarM.b;
                string.getClass();
                ptsVar11.b |= 1024;
                ptsVar11.n = string;
            }
            int i5 = qbu.a;
            final boolean z2 = false;
            if (i != 4 && qsp.af(pvcVar)) {
                z2 = true;
            }
            sbr sbrVar = new sbr();
            if (z2) {
                sbrVar.j(pzrVar.d.b(pvcVar));
            }
            final sbv sbvVarE = sbrVar.e();
            qdp qdpVarE = qdp.e(pzrVar.f());
            sxi sxiVar = new sxi() { // from class: pzq
                @Override // defpackage.sxi
                public final syu a(Object obj) {
                    if (z2 && !z) {
                        return ske.M(sfc.a);
                    }
                    return pzrVar.d.k(pvcVar);
                }
            };
            Executor executor2 = pzrVar.k;
            tpcVar = tpcVarM;
            qdpVarG = qdp.e(qdpVarE.g(sxiVar, executor2).f(new rvu() { // from class: pzk
                @Override // defpackage.rvu
                public final Object apply(Object obj) {
                    sbv sbvVar = (sbv) obj;
                    if (!z2) {
                        return sbvVar;
                    }
                    sbv sbvVar2 = sbvVarE;
                    return !z ? sbvVar2 : pzrVar.d.c(sbvVar2, sbvVar);
                }
            }, executor2).f(new pyb(pzrVar, i4), executor2)).g(new nzm(tpwVar3, latVar, tpcVarM, 7, (char[]) null), executor);
        } else {
            pzb pzbVar = pzrVar.d;
            qdp qdpVarE2 = qdp.e(ske.M(pvcVar.o));
            pyb pybVar = new pyb(pvcVar, 6);
            Executor executor3 = pzbVar.g;
            qdp qdpVarF = qdpVarE2.f(pybVar, executor3);
            qdpVarG = qdp.e(qdpVarF.g(new pyg(pzbVar, 9), executor3).g(new pyg(qdpVarF, i4), executor3)).g(new kjl(tpwVar3, tpcVarM, 12, bArr), executor);
            tpcVar = tpcVarM;
        }
        return qdp.e(qdpVarG).f(new pyb(tpcVar, i2), executor).b(pul.class, new mdv(14), executor);
    }

    private final syu q(final boolean z) {
        qdp qdpVarE = qdp.e(m());
        final int i = 1;
        sxi sxiVar = new sxi(this) { // from class: pvy
            public final /* synthetic */ pwr a;

            {
                this.a = this;
            }

            @Override // defpackage.sxi
            public final syu a(Object obj) {
                if (i != 0) {
                    pwr pwrVar = this.a;
                    return pwrVar.d.d(z, pwrVar.i);
                }
                pwr pwrVar2 = this.a;
                return pwrVar2.d.d(z, pwrVar2.i);
            }
        };
        Executor executor = this.f;
        final int i2 = 0;
        return qdpVarE.g(sxiVar, executor).g(new jmx(this, 10), executor).g(new sxi(this) { // from class: pvy
            public final /* synthetic */ pwr a;

            {
                this.a = this;
            }

            @Override // defpackage.sxi
            public final syu a(Object obj) {
                if (i2 != 0) {
                    pwr pwrVar = this.a;
                    return pwrVar.d.d(z, pwrVar.i);
                }
                pwr pwrVar2 = this.a;
                return pwrVar2.d.d(z, pwrVar2.i);
            }
        }, executor);
    }

    private final void r(int i, syu syuVar, long j, suv suvVar, pwq pwqVar, pwp pwpVar) {
        syuVar.c(rsx.e(new pwc(this, j, suvVar, syuVar, pwpVar, pwqVar, i, 1)), sxo.a);
    }

    @Override // defpackage.pvu
    public final syu a(ptu ptuVar) {
        long jAw = qpt.aw();
        syu syuVarI = this.l.i(new pwe(this, ptuVar, 2, null), this.f);
        tpc tpcVarM = suv.a.m();
        pud pudVar = ptuVar.a;
        String str = pudVar.c;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        suv suvVar = (suv) tphVar;
        str.getClass();
        suvVar.b |= 1;
        suvVar.c = str;
        long j = pudVar.g;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        tph tphVar2 = tpcVarM.b;
        suv suvVar2 = (suv) tphVar2;
        suvVar2.b |= 64;
        suvVar2.i = j;
        String str2 = pudVar.h;
        if (!tphVar2.C()) {
            tpcVarM.o();
        }
        suv suvVar3 = (suv) tpcVarM.b;
        str2.getClass();
        suvVar3.b |= 128;
        suvVar3.j = str2;
        boolean zH = ptuVar.b.h();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar3 = tpcVarM.b;
        suv suvVar4 = (suv) tphVar3;
        suvVar4.b |= 32;
        suvVar4.h = zH;
        if (!tphVar3.C()) {
            tpcVarM.o();
        }
        tph tphVar4 = tpcVarM.b;
        suv suvVar5 = (suv) tphVar4;
        suvVar5.b |= 256;
        suvVar5.k = false;
        int i = pudVar.e;
        if (!tphVar4.C()) {
            tpcVarM.o();
        }
        tph tphVar5 = tpcVarM.b;
        suv suvVar6 = (suv) tphVar5;
        suvVar6.b = 2 | suvVar6.b;
        suvVar6.d = i;
        String str3 = pudVar.d;
        if (!tphVar5.C()) {
            tpcVarM.o();
        }
        suv suvVar7 = (suv) tpcVarM.b;
        str3.getClass();
        suvVar7.b |= 4;
        suvVar7.e = str3;
        int size = pudVar.f.size();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        suv suvVar8 = (suv) tpcVarM.b;
        suvVar8.b |= 8;
        suvVar8.f = size;
        final suv suvVar9 = (suv) tpcVarM.l();
        r(3, syuVarI, jAw, suvVar9, new pwq() { // from class: pwh
            @Override // defpackage.pwq
            public final suv a(Object obj) {
                return suvVar9;
            }
        }, new pwi(0));
        return syuVarI;
    }

    @Override // defpackage.pvu
    public final syu b(pun punVar) {
        this.a.getPackageName();
        int i = qbu.a;
        if (!this.h.h()) {
            return ske.L(new IllegalArgumentException("downloadFileGroupWithForegroundService: ForegroundDownloadService is not provided!"));
        }
        if (this.g.h()) {
            return qsz.l(new pwe(this, punVar, 3, null), this.f);
        }
        tfm tfmVarA = pul.a();
        tfmVarA.b = puk.DOWNLOAD_MONITOR_NOT_PROVIDED_ERROR;
        tfmVarA.c = "downloadFileGroupWithForegroundService: Download Monitor is not provided!";
        return ske.L(tfmVarA.c());
    }

    @Override // defpackage.pvu
    public final syu c(puv puvVar) {
        long jAw = qpt.aw();
        syu syuVarI = this.l.i(new pwe(this, puvVar, 1, null), this.f);
        tpc tpcVarM = suv.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        String str = puvVar.a;
        tph tphVar = tpcVarM.b;
        suv suvVar = (suv) tphVar;
        str.getClass();
        suvVar.b |= 1;
        suvVar.c = str;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        tph tphVar2 = tpcVarM.b;
        suv suvVar2 = (suv) tphVar2;
        suvVar2.b |= 32;
        suvVar2.h = false;
        if (!tphVar2.C()) {
            tpcVarM.o();
        }
        tph tphVar3 = tpcVarM.b;
        suv suvVar3 = (suv) tphVar3;
        suvVar3.b |= 2;
        suvVar3.d = -1;
        if (!tphVar3.C()) {
            tpcVarM.o();
        }
        suv suvVar4 = (suv) tpcVarM.b;
        suvVar4.b |= 64;
        suvVar4.i = -1L;
        r(4, syuVarI, jAw, (suv) tpcVarM.l(), new pwq() { // from class: pvz
            @Override // defpackage.pwq
            public final suv a(Object obj) {
                return pwr.l((pts) obj);
            }
        }, new pwi(1));
        return syuVarI;
    }

    @Override // defpackage.pvu
    public final syu d(puw puwVar) {
        tpc tpcVarM = pvl.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        String str = puwVar.a;
        pvl pvlVar = (pvl) tpcVarM.b;
        str.getClass();
        int i = 1;
        pvlVar.b |= 1;
        pvlVar.c = str;
        String packageName = this.a.getPackageName();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        pvl pvlVar2 = (pvl) tpcVarM.b;
        packageName.getClass();
        pvlVar2.b |= 2;
        pvlVar2.d = packageName;
        rwc rwcVar = puwVar.g;
        if (rwcVar.h()) {
            String strW = prh.w((Account) rwcVar.c());
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            pvl pvlVar3 = (pvl) tpcVarM.b;
            pvlVar3.b |= 4;
            pvlVar3.e = strW;
        }
        pvl pvlVar4 = (pvl) tpcVarM.l();
        sbp sbpVar = puwVar.e;
        int i2 = ((sex) sbpVar).c;
        sbk sbkVarE = sbp.e(i2);
        int i3 = 0;
        while (i3 < i2) {
            puc pucVar = (puc) sbpVar.get(i3);
            tpc tpcVarM2 = pva.a.m();
            String str2 = pucVar.c;
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            tph tphVar = tpcVarM2.b;
            pva pvaVar = (pva) tphVar;
            str2.getClass();
            pvaVar.b |= i;
            pvaVar.c = str2;
            String str3 = pucVar.d;
            if (!tphVar.C()) {
                tpcVarM2.o();
            }
            tph tphVar2 = tpcVarM2.b;
            pva pvaVar2 = (pva) tphVar2;
            str3.getClass();
            pvaVar2.b |= 2;
            pvaVar2.d = str3;
            long j = pucVar.e;
            if (!tphVar2.C()) {
                tpcVarM2.o();
            }
            tph tphVar3 = tpcVarM2.b;
            pva pvaVar3 = (pva) tphVar3;
            pvaVar3.b |= 4;
            pvaVar3.e = j;
            int iAx = a.ax(pucVar.f);
            if (iAx == 0) {
                iAx = i;
            }
            if (!tphVar3.C()) {
                tpcVarM2.o();
            }
            tph tphVar4 = tpcVarM2.b;
            pva pvaVar4 = (pva) tphVar4;
            int iAq = a.aq(iAx - 1);
            int i4 = iAq - 1;
            if (iAq == 0) {
                throw null;
            }
            pvaVar4.f = i4;
            pvaVar4.b |= 8;
            String str4 = pucVar.g;
            if (!tphVar4.C()) {
                tpcVarM2.o();
            }
            tph tphVar5 = tpcVarM2.b;
            pva pvaVar5 = (pva) tphVar5;
            str4.getClass();
            pvaVar5.b |= 16;
            pvaVar5.g = str4;
            String str5 = pucVar.i;
            if (!tphVar5.C()) {
                tpcVarM2.o();
            }
            tph tphVar6 = tpcVarM2.b;
            pva pvaVar6 = (pva) tphVar6;
            str5.getClass();
            pvaVar6.b |= 64;
            pvaVar6.i = str5;
            long j2 = pucVar.j;
            if (!tphVar6.C()) {
                tpcVarM2.o();
            }
            tph tphVar7 = tpcVarM2.b;
            pva pvaVar7 = (pva) tphVar7;
            pvaVar7.b |= 128;
            pvaVar7.j = j2;
            int iAq2 = a.aq(pucVar.m);
            if (iAq2 == 0) {
                iAq2 = i;
            }
            int i5 = iAq2 - 1;
            if (!tphVar7.C()) {
                tpcVarM2.o();
            }
            int iAq3 = a.aq(i5);
            tph tphVar8 = tpcVarM2.b;
            pva pvaVar8 = (pva) tphVar8;
            int i6 = iAq3 - 1;
            if (iAq3 == 0) {
                throw null;
            }
            pvaVar8.m = i6;
            pvaVar8.b |= 512;
            int iAq4 = a.aq(pucVar.n);
            if (iAq4 == 0) {
                iAq4 = i;
            }
            int i7 = iAq4 - 1;
            if (!tphVar8.C()) {
                tpcVarM2.o();
            }
            int iAq5 = a.aq(i7);
            tph tphVar9 = tpcVarM2.b;
            pva pvaVar9 = (pva) tphVar9;
            int i8 = iAq5 - 1;
            if (iAq5 == 0) {
                throw null;
            }
            pvaVar9.n = i8;
            pvaVar9.b |= 1024;
            String str6 = pucVar.o;
            if (!tphVar9.C()) {
                tpcVarM2.o();
            }
            tph tphVar10 = tpcVarM2.b;
            pva pvaVar10 = (pva) tphVar10;
            str6.getClass();
            pvaVar10.b |= 2048;
            pvaVar10.o = str6;
            String str7 = pucVar.p;
            if (!tphVar10.C()) {
                tpcVarM2.o();
            }
            pva pvaVar11 = (pva) tpcVarM2.b;
            str7.getClass();
            pvaVar11.b |= 4096;
            pvaVar11.p = str7;
            if ((pucVar.b & 8192) != 0) {
                tnw tnwVar = pucVar.q;
                if (tnwVar == null) {
                    tnwVar = tnw.a;
                }
                if (!tpcVarM2.b.C()) {
                    tpcVarM2.o();
                }
                pva pvaVar12 = (pva) tpcVarM2.b;
                tnwVar.getClass();
                pvaVar12.q = tnwVar;
                pvaVar12.b |= 8192;
            }
            if ((pucVar.b & 32) != 0) {
                tvy tvyVar = pucVar.h;
                if (tvyVar == null) {
                    tvyVar = tvy.a;
                }
                if (!tpcVarM2.b.C()) {
                    tpcVarM2.o();
                }
                pva pvaVar13 = (pva) tpcVarM2.b;
                tvyVar.getClass();
                pvaVar13.h = tvyVar;
                pvaVar13.b |= 32;
            }
            if ((pucVar.b & 256) != 0) {
                tvy tvyVar2 = pucVar.k;
                if (tvyVar2 == null) {
                    tvyVar2 = tvy.a;
                }
                if (!tpcVarM2.b.C()) {
                    tpcVarM2.o();
                }
                pva pvaVar14 = (pva) tpcVarM2.b;
                tvyVar2.getClass();
                pvaVar14.k = tvyVar2;
                pvaVar14.b |= 256;
            }
            for (pue pueVar : pucVar.l) {
                tpc tpcVarM3 = pvd.a.m();
                String str8 = pueVar.c;
                if (!tpcVarM3.b.C()) {
                    tpcVarM3.o();
                }
                tph tphVar11 = tpcVarM3.b;
                pvd pvdVar = (pvd) tphVar11;
                str8.getClass();
                int i9 = i;
                pvdVar.b |= 1;
                pvdVar.c = str8;
                long j3 = pueVar.d;
                if (!tphVar11.C()) {
                    tpcVarM3.o();
                }
                tph tphVar12 = tpcVarM3.b;
                pvd pvdVar2 = (pvd) tphVar12;
                pvdVar2.b |= 2;
                pvdVar2.d = j3;
                String str9 = pueVar.e;
                if (!tphVar12.C()) {
                    tpcVarM3.o();
                }
                tph tphVar13 = tpcVarM3.b;
                pvd pvdVar3 = (pvd) tphVar13;
                str9.getClass();
                pvdVar3.b |= 4;
                pvdVar3.e = str9;
                int iAq6 = a.aq(pueVar.f);
                if (iAq6 == 0) {
                    iAq6 = i9;
                }
                int i10 = iAq6 - 1;
                if (!tphVar13.C()) {
                    tpcVarM3.o();
                }
                int iAq7 = a.aq(i10);
                pvd pvdVar4 = (pvd) tpcVarM3.b;
                int i11 = iAq7 - 1;
                if (iAq7 == 0) {
                    throw null;
                }
                pvdVar4.f = i11;
                pvdVar4.b |= 8;
                tpc tpcVarM4 = puz.a.m();
                pub pubVar = pueVar.g;
                if (pubVar == null) {
                    pubVar = pub.a;
                }
                String str10 = pubVar.b;
                if (!tpcVarM4.b.C()) {
                    tpcVarM4.o();
                }
                puz puzVar = (puz) tpcVarM4.b;
                str10.getClass();
                puzVar.b |= 1;
                puzVar.c = str10;
                puz puzVar2 = (puz) tpcVarM4.l();
                if (!tpcVarM3.b.C()) {
                    tpcVarM3.o();
                }
                pvd pvdVar5 = (pvd) tpcVarM3.b;
                puzVar2.getClass();
                pvdVar5.g = puzVar2;
                pvdVar5.b |= 16;
                pvd pvdVar6 = (pvd) tpcVarM3.l();
                if (!tpcVarM2.b.C()) {
                    tpcVarM2.o();
                }
                pva pvaVar15 = (pva) tpcVarM2.b;
                pvdVar6.getClass();
                tpw tpwVar = pvaVar15.l;
                if (!tpwVar.c()) {
                    pvaVar15.l = tph.v(tpwVar);
                }
                pvaVar15.l.add(pvdVar6);
                i = i9;
            }
            sbkVarE.h((pva) tpcVarM2.l());
            i3++;
            i = i;
        }
        return this.l.i(new pwf(this, pvlVar4, puwVar, sbkVarE, 0), this.f);
    }

    @Override // defpackage.pvu
    public final syu e(pws pwsVar) {
        long jAw = qpt.aw();
        int i = qbu.a;
        pzr pzrVar = this.d;
        syu syuVarN = qsz.n(pzrVar.f(), new pzl(pzrVar, 13), pzrVar.k);
        kve kveVar = new kve(pwsVar, 18);
        Executor executor = this.f;
        syu syuVarM = qsz.m(syuVarN, kveVar, executor);
        syu syuVarI = this.l.i(new pwe(this, syuVarM, 0), executor);
        syuVarI.c(rsx.e(new jzz(this, jAw, syuVarI, syuVarM, 2)), sxo.a);
        return syuVarI;
    }

    @Override // defpackage.pvu
    public final syu f() {
        return this.l.h(new ozi(this, 7), this.f);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.pvu
    public final void g(String str) {
        int i = qbu.a;
        qsz.n(this.j.e(str), new kjm(11), this.f);
        tdy tdyVar = this.o;
        syu syuVarD = ((tql) tdyVar.c).d(str);
        pzn pznVar = new pzn(tdyVar, str, 14);
        ?? r3 = tdyVar.a;
        qsz.n(qsz.n(syuVarD, pznVar, r3), new qci(2), r3);
    }

    @Override // defpackage.pvu
    public final void h() {
        this.l.i(new gea(this.d, 7), this.f);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    @Override // defpackage.pvu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.syu i(java.lang.String r10, defpackage.rwc r11) {
        /*
            r9 = this;
            int r0 = r10.hashCode()
            r1 = 0
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -2105562759: goto L2a;
                case -1202768674: goto L20;
                case -69128772: goto L16;
                case 437964371: goto Lc;
                default: goto Lb;
            }
        Lb:
            goto L34
        Lc:
            java.lang.String r0 = "MDD.WIFI.CHARGING.PERIODIC.TASK"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L34
            r0 = r2
            goto L35
        L16:
            java.lang.String r0 = "MDD.CHARGING.PERIODIC.TASK"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L34
            r0 = r4
            goto L35
        L20:
            java.lang.String r0 = "MDD.CELLULAR.CHARGING.PERIODIC.TASK"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L34
            r0 = r3
            goto L35
        L2a:
            java.lang.String r0 = "MDD.MAINTENANCE.PERIODIC.GCM.TASK"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L34
            r0 = r1
            goto L35
        L34:
            r0 = -1
        L35:
            if (r0 == 0) goto L6f
            if (r0 == r4) goto L59
            if (r0 == r3) goto L54
            if (r0 == r2) goto L4f
            int r0 = defpackage.qbu.a
            java.lang.String r0 = "Unknown task tag sent to MDD.handleTask() "
            java.lang.String r0 = r0.concat(r10)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            syu r0 = defpackage.ske.L(r1)
            goto L80
        L4f:
            syu r0 = r9.q(r4)
            goto L80
        L54:
            syu r0 = r9.q(r1)
            goto L80
        L59:
            syu r0 = r9.m()
            jmx r1 = new jmx
            r2 = 11
            r1.<init>(r9, r2)
            sxi r1 = defpackage.rsx.c(r1)
            java.util.concurrent.Executor r2 = r9.f
            syu r0 = defpackage.qsz.n(r0, r1, r2)
            goto L80
        L6f:
            qaq r0 = r9.l
            pzr r1 = r9.d
            gea r2 = new gea
            r3 = 8
            r2.<init>(r1, r3)
            java.util.concurrent.Executor r1 = r9.f
            syu r0 = r0.i(r2, r1)
        L80:
            mdv r1 = new mdv
            r2 = 13
            r1.<init>(r2)
            rwc r6 = r11.b(r1)
            qdp r11 = defpackage.qdp.e(r0)
            nzm r3 = new nzm
            r7 = 4
            r8 = 0
            r4 = r9
            r5 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            java.util.concurrent.Executor r9 = r4.f
            qdp r10 = r11.g(r3, r9)
            nzm r3 = new nzm
            r7 = 5
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Class<java.lang.Exception> r11 = java.lang.Exception.class
            qdp r9 = r10.d(r11, r3, r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pwr.i(java.lang.String, rwc):syu");
    }

    public final syu m() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            arrayList.add(((puq) it.next()).a(this));
        }
        return qsp.N(arrayList).f(new ire(8), this.f);
    }
}
