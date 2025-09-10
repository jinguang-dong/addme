package defpackage;

import android.content.Context;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pzr {
    public static volatile boolean a = false;
    public final Context b;
    public final qbq c;
    public final pzb d;
    public final pzc e;
    public final qag f;
    public final qai g;
    public final pwt h;
    public final qcl i;
    public final rwc j;
    public final Executor k;
    public final rwc l;
    public final puu m;
    public final qbv n;
    public final qbj o;
    public final qav p;
    public final tdy q;
    public final tql r;

    public pzr(Context context, qbq qbqVar, qag qagVar, qai qaiVar, pzb pzbVar, pzc pzcVar, qav qavVar, pwt pwtVar, qcl qclVar, tql tqlVar, tdy tdyVar, rwc rwcVar, Executor executor, rwc rwcVar2, puu puuVar, qbv qbvVar, qbj qbjVar) {
        this.b = context;
        this.c = qbqVar;
        this.f = qagVar;
        this.g = qaiVar;
        this.d = pzbVar;
        this.e = pzcVar;
        this.p = qavVar;
        this.h = pwtVar;
        this.i = qclVar;
        this.r = tqlVar;
        this.q = tdyVar;
        this.j = rwcVar;
        this.k = executor;
        this.l = rwcVar2;
        this.m = puuVar;
        this.n = qbvVar;
        this.o = qbjVar;
    }

    public static sbp a(List list) throws NoSuchAlgorithmException {
        String strA;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int iAq = a.aq(((pva) it.next()).f);
            if (iAq != 0 && iAq == 2) {
                sbk sbkVarE = sbp.e(list.size());
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    pva pvaVar = (pva) it2.next();
                    int iAq2 = a.aq(pvaVar.f);
                    if (iAq2 == 0) {
                        iAq2 = 1;
                    }
                    if (iAq2 - 1 != 0) {
                        tpc tpcVar = (tpc) pvaVar.a(5, null);
                        tpcVar.r(pvaVar);
                        String str = pvaVar.d;
                        MessageDigest messageDigestB = qbc.b();
                        if (messageDigestB == null) {
                            strA = "";
                        } else {
                            byte[] bytes = str.getBytes();
                            messageDigestB.update(bytes, 0, bytes.length);
                            strA = qbc.a(messageDigestB.digest());
                        }
                        if (qsp.ac(pvaVar)) {
                            if (!tpcVar.b.C()) {
                                tpcVar.o();
                            }
                            pva pvaVar2 = (pva) tpcVar.b;
                            pvaVar2.b |= 64;
                            pvaVar2.i = strA;
                        } else {
                            if (!tpcVar.b.C()) {
                                tpcVar.o();
                            }
                            pva pvaVar3 = (pva) tpcVar.b;
                            pvaVar3.b |= 16;
                            pvaVar3.g = strA;
                        }
                        pva pvaVar4 = (pva) tpcVar.b;
                        String str2 = pvaVar4.c;
                        String str3 = pvaVar4.g;
                        int i = qbu.a;
                        sbkVarE.h((pva) tpcVar.l());
                    } else {
                        sbkVarE.h(pvaVar);
                    }
                }
                return sbkVarE.g();
            }
        }
        return sbp.j(list);
    }

    public final syu b() {
        return qsz.n(this.f.a(), new pzl(this, 3), this.k);
    }

    public final syu c(pvc pvcVar) {
        return this.o.b("mdd_" + pvcVar.s);
    }

    public final syu d(boolean z, sxi sxiVar) {
        int i = qbu.a;
        return qsz.n(f(), new pyk(this, z, sxiVar, 3), this.k);
    }

    public final syu e(pvl pvlVar, boolean z) {
        String str = pvlVar.c;
        String str2 = pvlVar.d;
        int i = qbu.a;
        return qsz.n(f(), new pyk(this, pvlVar, z, 4), this.k);
    }

    public final syu f() {
        if (a) {
            return syq.a;
        }
        qdp qdpVarE = qdp.e(syq.a);
        pzl pzlVar = new pzl(this, 8);
        Executor executor = this.k;
        return qdpVarE.g(pzlVar, executor).g(new pzl(this, 9), executor).g(new pzl(this, 10), executor).g(new pzl(this, 11), executor).f(new pzg(7), executor);
    }
}
