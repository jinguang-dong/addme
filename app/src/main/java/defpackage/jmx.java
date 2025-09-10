package defpackage;

import android.content.Context;
import java.io.IOException;
import java.net.HttpCookie;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jmx implements sxi {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ jmx(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, sxi] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, oun] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, oun] */
    /* JADX WARN: Type inference failed for: r0v63, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v67, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v72, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v83, types: [java.lang.Object, qbq] */
    /* JADX WARN: Type inference failed for: r1v42, types: [java.lang.Object, pzc] */
    /* JADX WARN: Type inference failed for: r1v47, types: [java.lang.Object, pzc] */
    /* JADX WARN: Type inference failed for: r1v53, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v59, types: [java.lang.Object, pzc] */
    /* JADX WARN: Type inference failed for: r1v65, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v2, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.Object, pzc] */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.Object, qai] */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.lang.Object, pzc] */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.lang.Object, qbq] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, qbq] */
    @Override // defpackage.sxi
    public final syu a(Object obj) throws Throwable {
        syu syuVarA;
        syu syuVar;
        pul pulVarC;
        int i = 5;
        int i2 = 4;
        int i3 = 14;
        int i4 = 15;
        int i5 = 19;
        int i6 = 0;
        switch (this.b) {
            case 0:
                RuntimeException runtimeException = (RuntimeException) obj;
                ((sgt) ((sgt) jnm.a.c().i(runtimeException)).M((char) 2873)).s("Could not finish microvideo session as it previously failed with cause:");
                return this.a.a(runtimeException);
            case 1:
                fxy fxyVar = (fxy) this.a;
                fxyVar.j();
                lte lteVar = fxyVar.A;
                lteVar.getClass();
                fxyVar.t.k(lteVar.b);
                return ske.L((Throwable) obj);
            case 2:
                kjo kjoVar = ((kjn) this.a).d;
                lmg lmgVar = (lmg) obj;
                synchronized (kjoVar.d) {
                    lmgVar.getClass();
                    kjoVar.g = 4;
                    syuVarA = kjoVar.b.a(lmgVar);
                    poj pojVar = lmgVar.a;
                    pojVar.getClass();
                    syuVarA.c(new kdx(pojVar, 5), sxo.a);
                }
                return syuVarA;
            case 3:
                lmg lmgVar2 = (lmg) obj;
                if (!ezh.ah(lmgVar2.g, lmgVar2.f) || (syuVar = lmgVar2.c) == null || lmgVar2.i == null) {
                    return ske.M(lmgVar2);
                }
                Object obj2 = this.a;
                syn synVarV = syn.v(syuVar);
                kjl kjlVar = new kjl(obj2, lmgVar2, i6);
                sxo sxoVar = sxo.a;
                return swz.i(swz.j(synVarV, kjlVar, sxoVar), new fym(lmgVar2, 20), sxoVar);
            case 4:
                nzd nzdVar = (nzd) obj;
                nzdVar.getClass();
                Object obj3 = this.a;
                nzo nzoVar = (nzo) obj3;
                nzoVar.g.a(nzdVar);
                nzl nzlVar = nzoVar.d;
                sbv sbvVar = nzlVar.b.map;
                syu syuVarA2 = syq.a;
                boolean zContainsKey = sbvVar.containsKey("Range");
                rdf rdfVar = nzlVar.f;
                if (zContainsKey && nzdVar.a() != 206) {
                    syuVarA2 = rdfVar.a();
                }
                syn synVarV2 = syn.v(syuVarA2);
                kjl kjlVar2 = new kjl(nzdVar, rdfVar, i2);
                Executor executor = nzoVar.e;
                return swf.j(swz.j(swz.j(synVarV2, kjlVar2, executor), new kjl(obj3, nzdVar, i, null), executor), IOException.class, new kjm(3), sxo.a);
            case 5:
                ((nzo) this.a).g.close();
                return ske.L((Throwable) obj);
            case 6:
                Long l = (Long) obj;
                l.getClass();
                ((nzo) this.a).g.close();
                return ske.M(new nzp(l.longValue()));
            case 7:
                nzo nzoVar2 = (nzo) this.a;
                nzd nzdVar2 = (nzd) obj;
                nzb nzbVar = nzoVar2.d.e;
                if (nzbVar == null) {
                    return syq.a;
                }
                Map mapB = nzdVar2.b();
                scl sclVar = new scl();
                scl sclVar2 = new scl();
                for (Map.Entry entry : mapB.entrySet()) {
                    if (entry.getKey() != null && (rup.e((CharSequence) entry.getKey(), "Set-Cookie") || rup.e((CharSequence) entry.getKey(), "Set-Cookie2"))) {
                        sclVar.j((Iterable) entry.getValue());
                    }
                }
                sgj sgjVarListIterator = sclVar.g().listIterator();
                while (sgjVarListIterator.hasNext()) {
                    String str = (String) sgjVarListIterator.next();
                    try {
                        sclVar2.j(HttpCookie.parse(str));
                    } catch (IllegalArgumentException | NullPointerException e) {
                        nzoVar2.i.a(e, "Failed to parse cookie (%s) as HttpCookie, skipping...", str);
                    }
                }
                sclVar2.g();
                return nzbVar.b();
            case 8:
                List list = (List) obj;
                list.getClass();
                return this.a.a(list.get(0), list.get(1));
            case 9:
                List list2 = (List) obj;
                list2.getClass();
                return this.a.a(list2.get(0), list2.get(1));
            case 10:
                return ((pwr) this.a).m();
            case 11:
                int i7 = qbu.a;
                pwr pwrVar = (pwr) this.a;
                pzr pzrVar = pwrVar.d;
                return qsz.n(pzrVar.f(), new pzd(pzrVar, pwrVar.i, i5), pzrVar.k);
            case 12:
                return ske.L((Throwable) this.a);
            case 13:
                Exception exc = (Exception) obj;
                exc.getMessage();
                int i8 = qbu.a;
                if (exc instanceof pul) {
                    pulVarC = (pul) exc;
                } else {
                    puk pukVarN = ((pxr) this.a).c.n(exc, 0);
                    tfm tfmVarA = pul.a();
                    tfmVarA.c = "failure in download!";
                    tfmVarA.b = pukVarN;
                    tfmVarA.d = exc;
                    pulVarC = tfmVarA.c();
                }
                return ske.L(pulVarC);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                final HashSet hashSet = new HashSet();
                final ArrayList arrayList = new ArrayList();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    arrayList.add(((qao) it.next()).b);
                }
                final qav qavVar = (qav) this.a;
                return qsz.m(qavVar.h.e(), new rvu() { // from class: pyc
                    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, pwt] */
                    @Override // defpackage.rvu
                    public final Object apply(Object obj4) {
                        List list3 = arrayList;
                        list3.addAll((List) obj4);
                        Iterator it2 = list3.iterator();
                        while (true) {
                            Set set = hashSet;
                            if (!it2.hasNext()) {
                                return set;
                            }
                            pvc pvcVar = (pvc) it2.next();
                            for (pva pvaVar : pvcVar.o) {
                                qav qavVar2 = qavVar;
                                int iAx = a.ax(pvcVar.j);
                                if (iAx == 0) {
                                    iAx = 1;
                                }
                                Object obj5 = qavVar2.i;
                                ?? r3 = qavVar2.c;
                                tpc tpcVarM = pvp.a.m();
                                String strAb = qsp.ab(pvaVar);
                                int iOrdinal = prh.j((Context) obj5, r3).ordinal();
                                if (iOrdinal == 0) {
                                    int i9 = iAx - 1;
                                    String str2 = pvaVar.d;
                                    if (!tpcVarM.b.C()) {
                                        tpcVarM.o();
                                    }
                                    tph tphVar = tpcVarM.b;
                                    pvp pvpVar = (pvp) tphVar;
                                    str2.getClass();
                                    pvpVar.b = 1 | pvpVar.b;
                                    pvpVar.c = str2;
                                    long j = pvaVar.e;
                                    if (!tphVar.C()) {
                                        tpcVarM.o();
                                    }
                                    tph tphVar2 = tpcVarM.b;
                                    pvp pvpVar2 = (pvp) tphVar2;
                                    pvpVar2.b = 2 | pvpVar2.b;
                                    pvpVar2.d = j;
                                    if (!tphVar2.C()) {
                                        tpcVarM.o();
                                    }
                                    tph tphVar3 = tpcVarM.b;
                                    pvp pvpVar3 = (pvp) tphVar3;
                                    strAb.getClass();
                                    pvpVar3.b |= 4;
                                    pvpVar3.e = strAb;
                                    if (!tphVar3.C()) {
                                        tpcVarM.o();
                                    }
                                    pvp pvpVar4 = (pvp) tpcVarM.b;
                                    pvpVar4.f = i9;
                                    pvpVar4.b |= 8;
                                } else if (iOrdinal == 1) {
                                    int i10 = iAx - 1;
                                    String str3 = pvaVar.d;
                                    if (!tpcVarM.b.C()) {
                                        tpcVarM.o();
                                    }
                                    tph tphVar4 = tpcVarM.b;
                                    pvp pvpVar5 = (pvp) tphVar4;
                                    str3.getClass();
                                    pvpVar5.b = 1 | pvpVar5.b;
                                    pvpVar5.c = str3;
                                    long j2 = pvaVar.e;
                                    if (!tphVar4.C()) {
                                        tpcVarM.o();
                                    }
                                    tph tphVar5 = tpcVarM.b;
                                    pvp pvpVar6 = (pvp) tphVar5;
                                    pvpVar6.b = 2 | pvpVar6.b;
                                    pvpVar6.d = j2;
                                    if (!tphVar5.C()) {
                                        tpcVarM.o();
                                    }
                                    tph tphVar6 = tpcVarM.b;
                                    pvp pvpVar7 = (pvp) tphVar6;
                                    strAb.getClass();
                                    pvpVar7.b |= 4;
                                    pvpVar7.e = strAb;
                                    if (!tphVar6.C()) {
                                        tpcVarM.o();
                                    }
                                    pvp pvpVar8 = (pvp) tpcVarM.b;
                                    pvpVar8.f = i10;
                                    pvpVar8.b |= 8;
                                    if ((pvaVar.b & 32) != 0) {
                                        tvy tvyVar = pvaVar.h;
                                        if (tvyVar == null) {
                                            tvyVar = tvy.a;
                                        }
                                        if (!tpcVarM.b.C()) {
                                            tpcVarM.o();
                                        }
                                        pvp pvpVar9 = (pvp) tpcVarM.b;
                                        tvyVar.getClass();
                                        pvpVar9.g = tvyVar;
                                        pvpVar9.b |= 16;
                                    }
                                } else if (iOrdinal == 2) {
                                    int i11 = iAx - 1;
                                    if (!tpcVarM.b.C()) {
                                        tpcVarM.o();
                                    }
                                    tph tphVar7 = tpcVarM.b;
                                    pvp pvpVar10 = (pvp) tphVar7;
                                    strAb.getClass();
                                    pvpVar10.b |= 4;
                                    pvpVar10.e = strAb;
                                    if (!tphVar7.C()) {
                                        tpcVarM.o();
                                    }
                                    pvp pvpVar11 = (pvp) tpcVarM.b;
                                    pvpVar11.f = i11;
                                    pvpVar11.b |= 8;
                                }
                                set.add((pvp) tpcVarM.l());
                            }
                        }
                    }
                }, qavVar.g);
            case 15:
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = ((List) obj).iterator();
                while (true) {
                    Object obj4 = this.a;
                    if (!it2.hasNext()) {
                        qav qavVar2 = (qav) obj4;
                        return qsz.m(qavVar2.h.j(arrayList2), new pyb(obj4, i6), qavVar2.g);
                    }
                    qao qaoVar = (qao) it2.next();
                    pvl pvlVar = qaoVar.a;
                    pvc pvcVar = qaoVar.b;
                    long jX = qsp.X(pvcVar);
                    Long lValueOf = Long.valueOf(jX);
                    int i9 = qbu.a;
                    lValueOf.getClass();
                    if (qsp.ah(jX)) {
                        qav qavVar3 = (qav) obj4;
                        qavVar3.k.m(1051, pvcVar.d, pvcVar.f, pvcVar.s, pvcVar.t);
                        arrayList2.add(pvlVar);
                        if (qsp.af(pvcVar)) {
                            qsp.au((Context) qavVar3.i, qavVar3.a, pvcVar, (lat) qavVar3.f);
                        }
                    }
                }
            case 16:
                Object obj5 = this.a;
                qav qavVar4 = (qav) obj5;
                syu syuVarC = qavVar4.h.c();
                jmx jmxVar = new jmx(obj5, i4);
                ?? r1 = qavVar4.g;
                return qsz.n(qsz.n(syuVarC, jmxVar, r1), new jmx(obj5, i5), r1);
            case 17:
                Object obj6 = this.a;
                qav qavVar5 = (qav) obj6;
                return qsz.n(qavVar5.j.c(), new kjl(obj6, (Set) obj, i3), qavVar5.g);
            case 18:
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = ((List) obj).iterator();
                while (true) {
                    Object obj7 = this.a;
                    if (!it3.hasNext()) {
                        qav qavVar6 = (qav) obj7;
                        return qsz.n(qavVar6.h.k(), new kjl(obj7, arrayList3, i4), qavVar6.g);
                    }
                    pvc pvcVar2 = (pvc) it3.next();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    pvb pvbVar = pvcVar2.c;
                    if (pvbVar == null) {
                        pvbVar = pvb.a;
                    }
                    if (qsp.ah(Math.min(timeUnit.toMillis(pvbVar.c), qsp.X(pvcVar2)))) {
                        qav qavVar7 = (qav) obj7;
                        qavVar7.k.m(1052, pvcVar2.d, pvcVar2.f, pvcVar2.s, pvcVar2.t);
                        if (qsp.af(pvcVar2)) {
                            qsp.au((Context) qavVar7.i, qavVar7.a, pvcVar2, (lat) qavVar7.f);
                        }
                    } else {
                        arrayList3.add(pvcVar2);
                    }
                }
            case 19:
                Object obj8 = this.a;
                qav qavVar8 = (qav) obj8;
                syu syuVarC2 = qavVar8.h.c();
                jmx jmxVar2 = new jmx(obj8, i3);
                ?? r12 = qavVar8.g;
                return qsz.n(qsz.n(syuVarC2, jmxVar2, r12), new jmx(obj8, 17), r12);
            default:
                if (!((Boolean) obj).booleanValue()) {
                    ((qav) this.a).k.l(1036);
                    qbu.c("%s: Failed to write back stale groups!", "ExpirationHandler");
                }
                return syq.a;
        }
    }
}
