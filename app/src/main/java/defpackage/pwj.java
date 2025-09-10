package defpackage;

import android.accounts.Account;
import android.net.Uri;
import com.google.android.apps.camera.jni.gxp.Caan.yoGAhrpjU;
import com.google.android.gms.wearable.aXYS.zflNUOOzDfM;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class pwj implements sxi {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ pwj(jng jngVar, mfo mfoVar, lsu lsuVar, rwc rwcVar, mdm mdmVar, int i) {
        this.f = i;
        this.a = jngVar;
        this.e = mfoVar;
        this.b = lsuVar;
        this.c = rwcVar;
        this.d = mdmVar;
    }

    public /* synthetic */ pwj(puu puuVar, String str, qbq qbqVar, lat latVar, Uri uri, int i) {
        this.f = i;
        this.b = puuVar;
        this.c = str;
        this.d = qbqVar;
        this.e = latVar;
        this.a = uri;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v77, types: [java.lang.Object, qbq] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, sxi] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, pvu] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, puu] */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v31, types: [java.lang.Object, puu] */
    /* JADX WARN: Type inference failed for: r2v45, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object, pvu] */
    /* JADX WARN: Type inference failed for: r4v23, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, mdm] */
    @Override // defpackage.sxi
    public final syu a(Object obj) {
        int iAq;
        int iAq2;
        String str;
        int i = 16;
        int i2 = 4;
        Object obj2 = null;
        int i3 = 5;
        int i4 = 2;
        int i5 = 1;
        switch (this.f) {
            case 0:
                qao qaoVar = (qao) obj;
                pvc pvcVar = qaoVar.b;
                pvl pvlVar = qaoVar.a;
                rwc rwcVarK = pwr.k(pvlVar, pvcVar, this.a);
                Object obj3 = this.b;
                ?? r13 = this.c;
                pzr pzrVar = (pzr) obj3;
                syu syuVarP = pwr.p(pvcVar, rwcVarK, null, 4, false, pzrVar, r13, (lat) this.d);
                qdp qdpVarG = qdp.e(pzrVar.e(pvlVar, true)).g(new kjm(9), r13);
                return qsp.Q(syuVarP, qdpVarG).g(new pwf(syuVarP, qdpVarG, (rwc) this.e, qaoVar, 1), r13);
            case 1:
                final jnl jnlVar = (jnl) obj;
                final szh szhVar = new szh();
                final jnm jnmVar = ((jng) this.a).a;
                final ?? r5 = this.d;
                Object obj4 = this.c;
                Object obj5 = this.b;
                final mfo mfoVar = (mfo) this.e;
                final lsu lsuVar = (lsu) obj5;
                final rwc rwcVar = (rwc) obj4;
                jnmVar.b.execute(new Runnable() { // from class: jmy
                    @Override // java.lang.Runnable
                    public final void run() {
                        mfo mfoVar2 = mfoVar;
                        jnk jnkVar = new jnk(mfoVar2, rwcVar, r5, null, lsuVar);
                        jnl jnlVar2 = jnlVar;
                        jnlVar2.h.e(Long.valueOf(jnlVar2.e));
                        jnlVar2.m.e(mfoVar2.c);
                        syu syuVarB = jnlVar2.o.b();
                        jnm jnmVar2 = jnmVar;
                        ske.W(syuVarB, new jnj(jnmVar2, jnlVar2, jnkVar), jnmVar2.c);
                        szhVar.f(jnlVar2.n);
                    }
                });
                return szhVar;
            case 2:
                pvc pvcVar2 = (pvc) obj;
                Object obj6 = this.c;
                Object obj7 = this.b;
                Object obj8 = this.d;
                if (pvcVar2 == null) {
                    pzb pzbVar = (pzb) obj8;
                    return pzbVar.r(pzbVar.g((pvl) obj7, true), new pyn(obj7, obj6, i2));
                }
                ((AtomicReference) obj6).set(pvcVar2);
                pvb pvbVar = pvcVar2.c;
                if (pvbVar == null) {
                    pvbVar = pvb.a;
                }
                int i6 = pvbVar.g + 1;
                tpc tpcVar = (tpc) pvcVar2.a(5, null);
                tpcVar.r(pvcVar2);
                tpc tpcVar2 = (tpc) pvbVar.a(5, null);
                tpcVar2.r(pvbVar);
                if (!tpcVar2.b.C()) {
                    tpcVar2.o();
                }
                pvb pvbVar2 = (pvb) tpcVar2.b;
                pvbVar2.b = 16 | pvbVar2.b;
                pvbVar2.g = i6;
                if (!tpcVar.b.C()) {
                    tpcVar.o();
                }
                pvc pvcVar3 = (pvc) tpcVar.b;
                pvb pvbVar3 = (pvb) tpcVar2.l();
                pvbVar3.getClass();
                pvcVar3.c = pvbVar3;
                pvcVar3.b |= 1;
                pvc pvcVar4 = (pvc) tpcVar.l();
                boolean z = (pvbVar.b & 8) != 0;
                boolean z2 = !z;
                if (!z) {
                    long jQ = prh.q();
                    pvb pvbVar4 = pvcVar4.c;
                    if (pvbVar4 == null) {
                        pvbVar4 = pvb.a;
                    }
                    tpc tpcVar3 = (tpc) pvbVar4.a(5, null);
                    tpcVar3.r(pvbVar4);
                    if (!tpcVar3.b.C()) {
                        tpcVar3.o();
                    }
                    pvb pvbVar5 = (pvb) tpcVar3.b;
                    pvbVar5.b |= 8;
                    pvbVar5.f = jQ;
                    pvb pvbVar6 = (pvb) tpcVar3.l();
                    tpc tpcVar4 = (tpc) pvcVar4.a(5, null);
                    tpcVar4.r(pvcVar4);
                    if (!tpcVar4.b.C()) {
                        tpcVar4.o();
                    }
                    pvc pvcVar5 = (pvc) tpcVar4.b;
                    pvbVar6.getClass();
                    pvcVar5.c = pvbVar6;
                    pvcVar5.b |= 1;
                    pvcVar4 = (pvc) tpcVar4.l();
                }
                syu syuVarM = ske.M(pvcVar4);
                if (!z) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = pvcVar4.o.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((pzb) obj8).j((pva) it.next(), pvcVar4));
                    }
                    qaq qaqVarP = qsp.P(arrayList);
                    ozi oziVar = new ozi(arrayList, 8);
                    Executor executor = ((pzb) obj8).g;
                    syuVarM = qdp.e(qaqVarP.f(oziVar, executor)).f(new pyb(pvcVar4, i3), executor);
                }
                ?? r12 = this.e;
                Object obj9 = this.a;
                qdp qdpVarE = qdp.e(syuVarM);
                kjl kjlVar = new kjl(obj8, obj7, 18, null);
                pzb pzbVar2 = (pzb) obj8;
                Executor executor2 = pzbVar2.g;
                return qdp.e(qdpVarE.g(kjlVar, executor2).g(new pyk(obj8, z2, syuVarM, 1), executor2)).d(IOException.class, new kjm(15), executor2).g(new pyj(pzbVar2, (pve) obj9, (pvl) obj7, (sxi) r12, 5), executor2);
            case 3:
                pyz pyzVar = (pyz) obj;
                pyzVar.name();
                pva pvaVar = (pva) this.a;
                String str2 = pvaVar.c;
                pvc pvcVar6 = (pvc) this.b;
                String str3 = pvcVar6.d;
                int i7 = qbu.a;
                int iOrdinal = pyzVar.ordinal();
                Object obj10 = this.c;
                Object obj11 = this.e;
                Object obj12 = this.d;
                if (iOrdinal == 1) {
                    long j = pvcVar6.l;
                    pvr pvrVar = (pvr) obj11;
                    if (!pzb.v(pvrVar, j)) {
                        return syq.a;
                    }
                    String str4 = pvaVar.c;
                    String str5 = pvcVar6.d;
                    pvp pvpVar = (pvp) obj12;
                    pzb pzbVar3 = (pzb) obj10;
                    return pzbVar3.r(pzbVar3.A(pvcVar6, pvaVar, pvrVar, pvpVar, pvrVar.g, j, 27), new pys(pzbVar3, pvcVar6, pvaVar, pvpVar, j, 1));
                }
                if (iOrdinal == 3) {
                    return ((pzb) obj10).y(pvcVar6, pvaVar, (pvp) obj12, (pvr) obj11, 5);
                }
                if (iOrdinal == 4 && (iAq = a.aq(pvaVar.m)) != 0 && iAq == 2) {
                    return ((pzb) obj10).z(pvcVar6, pvaVar, (pvp) obj12, (pvr) obj11, 7);
                }
                int iAq3 = a.aq(pvaVar.m);
                if (iAq3 != 0 && iAq3 == 2) {
                    pzb.C(((pzb) obj10).b, pvcVar6, pvaVar, 16);
                }
                String str6 = pvaVar.c;
                String str7 = pvcVar6.d;
                return ((pzb) obj10).s(pvcVar6, pvaVar, (pvp) obj12, pvcVar6.l);
            case 4:
                pyz pyzVar2 = (pyz) obj;
                pyzVar2.name();
                pva pvaVar2 = (pva) this.a;
                String str8 = pvaVar2.c;
                pvc pvcVar7 = (pvc) this.b;
                String str9 = pvcVar7.d;
                int i8 = qbu.a;
                pvr pvrVar2 = (pvr) ske.U(this.c);
                int iOrdinal2 = pyzVar2.ordinal();
                Object obj13 = this.e;
                Object obj14 = this.d;
                if (iOrdinal2 == 1) {
                    pzb pzbVar4 = (pzb) obj13;
                    return pzbVar4.r(pzbVar4.A(pvcVar7, pvaVar2, pvrVar2, (pvp) obj14, pvrVar2.g, pvcVar7.l, 3), new kjm(i));
                }
                if (iOrdinal2 == 3) {
                    return ((pzb) obj13).y(pvcVar7, pvaVar2, (pvp) obj14, pvrVar2, 4);
                }
                if (iOrdinal2 == 4) {
                    pvk pvkVarB = pvk.b(pvrVar2.d);
                    if (pvkVarB == null) {
                        pvkVarB = pvk.NONE;
                    }
                    if (pvkVarB == pvk.DOWNLOAD_COMPLETE && (iAq2 = a.aq(pvaVar2.m)) != 0 && iAq2 == 2) {
                        return ((pzb) obj13).z(pvcVar7, pvaVar2, (pvp) obj14, pvrVar2, 6);
                    }
                }
                String str10 = pvaVar2.c;
                String str11 = pvcVar7.d;
                return syq.a;
            case 5:
                int i9 = ((pvr) obj).h;
                ?? r2 = this.b;
                Object obj15 = this.a;
                Object obj16 = this.e;
                if (i9 >= r2.f()) {
                    ?? r0 = this.d;
                    int i10 = qbu.a;
                    r0.l(1115);
                } else {
                    int i11 = qbu.a;
                    try {
                        ((lat) obj16).p((Uri) obj15);
                    } catch (IOException e) {
                        qbu.g(e, "%s: Failed to remove corrupted file %s", "DownloaderCallbackImpl", this.c);
                        return ske.L(e);
                    }
                }
                return syq.a;
            case 6:
                Object obj17 = this.b;
                Object obj18 = this.d;
                ?? r132 = this.a;
                Object obj19 = this.e;
                ?? r1 = this.c;
                List<pud> list = (List) obj;
                try {
                    int i12 = sbp.d;
                    sbk sbkVar = new sbk();
                    for (pud pudVar : list) {
                        tpc tpcVar5 = (tpc) pudVar.a(5, obj2);
                        tpcVar5.r(pudVar);
                        if (!tpcVar5.b.C()) {
                            tpcVar5.o();
                        }
                        pud pudVar2 = (pud) tpcVar5.b;
                        pud pudVar3 = pud.a;
                        pudVar2.f = trb.a;
                        for (puc pucVar : pudVar.f) {
                            int i13 = pucVar.f;
                            int iAx = a.ax(i13);
                            if (iAx == 0) {
                                iAx = i5;
                            }
                            int i14 = iAx - 1;
                            if (i14 == 0) {
                                str = "sha1";
                            } else {
                                if (i14 != i4) {
                                    int iAx2 = a.ax(i13);
                                    throw new IllegalArgumentException("unsupported checksum type: ".concat((iAx2 == 0 || iAx2 == i5) ? zflNUOOzDfM.VkTDj : iAx2 != i4 ? yoGAhrpjU.gtDOExdXVonaMfq : "NONE"));
                                }
                                str = "sha256";
                            }
                            int i15 = i4;
                            Uri uri = Uri.parse("inlinefile:" + str + ":" + pucVar.g);
                            tpc tpcVar6 = (tpc) pucVar.a(5, null);
                            tpcVar6.r(pucVar);
                            tpe tpeVar = (tpe) tpcVar6;
                            String string = uri.toString();
                            if (!tpeVar.b.C()) {
                                tpeVar.o();
                            }
                            puc pucVar2 = (puc) tpeVar.b;
                            string.getClass();
                            pucVar2.b |= 2;
                            pucVar2.d = string;
                            tpcVar5.aB(tpeVar);
                            i4 = i15;
                            i5 = 1;
                        }
                        sbkVar.h((pud) tpcVar5.l());
                        i4 = i4;
                        obj2 = null;
                        i5 = 1;
                    }
                    syu syuVarA = ((qay) obj18).a(sbkVar.g());
                    qaz qazVar = new qaz(puk.EMBEDDED_ASSET_MANIFEST_POPULATOR_FAIL_TO_ADD_GROUP_ERROR, 12);
                    Executor executor3 = ((qdi) obj17).c;
                    return qsz.n(qsz.k(syuVarA, Exception.class, qazVar, executor3), new pwj((qdi) obj17, (pvu) r132, list, (rwc) obj19, (List) r1, 7), executor3);
                } catch (RuntimeException e2) {
                    puk pukVar = puk.EMBEDDED_ASSET_MANIFEST_POPULATOR_REWRITE_DOWNLOAD_URLS_ERROR;
                    tfm tfmVarA = pul.a();
                    tfmVarA.d = e2;
                    tfmVarA.b = pukVar;
                    return ske.L(tfmVarA.c());
                }
            default:
                ArrayList arrayList2 = new ArrayList();
                ?? r22 = this.e;
                ?? r3 = this.a;
                arrayList2.add(qdi.b(r22, r3, rvk.a));
                Iterator it2 = this.c.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(qdi.b(r22, r3, rwc.j((Account) it2.next())));
                }
                return qsz.k(qsp.P(arrayList2).f(new qbl(4), sxo.a), Exception.class, new qaz(puk.EMBEDDED_ASSET_MANIFEST_POPULATOR_FAIL_TO_IMPORT_GROUP_ERROR, 12), ((qdi) this.b).c);
        }
    }

    public /* synthetic */ pwj(puu puuVar, pzr pzrVar, Executor executor, lat latVar, rwc rwcVar, int i) {
        this.f = i;
        this.a = puuVar;
        this.b = pzrVar;
        this.c = executor;
        this.d = latVar;
        this.e = rwcVar;
    }

    public /* synthetic */ pwj(pzb pzbVar, pva pvaVar, pvc pvcVar, pvr pvrVar, pvp pvpVar, int i) {
        this.f = i;
        this.c = pzbVar;
        this.a = pvaVar;
        this.b = pvcVar;
        this.e = pvrVar;
        this.d = pvpVar;
    }

    public /* synthetic */ pwj(pzb pzbVar, pva pvaVar, pvc pvcVar, syu syuVar, pvp pvpVar, int i) {
        this.f = i;
        this.e = pzbVar;
        this.a = pvaVar;
        this.b = pvcVar;
        this.c = syuVar;
        this.d = pvpVar;
    }

    public /* synthetic */ pwj(pzb pzbVar, pvl pvlVar, AtomicReference atomicReference, pve pveVar, sxi sxiVar, int i) {
        this.f = i;
        this.d = pzbVar;
        this.b = pvlVar;
        this.c = atomicReference;
        this.a = pveVar;
        this.e = sxiVar;
    }

    public /* synthetic */ pwj(qdi qdiVar, pvu pvuVar, List list, rwc rwcVar, List list2, int i) {
        this.f = i;
        this.b = qdiVar;
        this.a = pvuVar;
        this.e = list;
        this.d = rwcVar;
        this.c = list2;
    }

    public /* synthetic */ pwj(qdi qdiVar, qay qayVar, pvu pvuVar, rwc rwcVar, List list, int i) {
        this.f = i;
        this.b = qdiVar;
        this.d = qayVar;
        this.a = pvuVar;
        this.e = rwcVar;
        this.c = list;
    }
}
