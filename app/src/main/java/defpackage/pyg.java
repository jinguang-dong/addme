package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class pyg implements sxi {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ pyg(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r12v50, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // defpackage.sxi
    public final syu a(Object obj) throws Throwable {
        long jQ;
        int iW;
        int i = 15;
        byte[] bArr = null;
        int i2 = 5;
        int i3 = 12;
        int i4 = 2;
        int i5 = 1;
        switch (this.b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Object obj2 = this.a;
                if (zBooleanValue) {
                    return ske.M(obj2);
                }
                tfm tfmVarA = pul.a();
                tfmVarA.b = puk.UNABLE_TO_RESERVE_FILE_ENTRY;
                tfmVarA.c = "Failed to reserve new file entries for group: ".concat(String.valueOf(((pvc) obj2).d));
                return ske.L(tfmVarA.c());
            case 1:
                pvc pvcVar = (pvc) obj;
                Object obj3 = this.a;
                if (pvcVar == null || !pzb.t((pvc) obj3, pvcVar)) {
                    jQ = prh.q();
                } else {
                    pvb pvbVar = pvcVar.c;
                    if (pvbVar == null) {
                        pvbVar = pvb.a;
                    }
                    jQ = pvbVar.d;
                }
                pvb pvbVar2 = ((pvc) obj3).c;
                if (pvbVar2 == null) {
                    pvbVar2 = pvb.a;
                }
                tpc tpcVar = (tpc) pvbVar2.a(5, null);
                tpcVar.r(pvbVar2);
                if (!tpcVar.b.C()) {
                    tpcVar.o();
                }
                pvb pvbVar3 = (pvb) tpcVar.b;
                pvbVar3.b = 2 | pvbVar3.b;
                pvbVar3.d = jQ;
                pvb pvbVar4 = (pvb) tpcVar.l();
                tph tphVar = (tph) obj3;
                tpc tpcVar2 = (tpc) tphVar.a(5, null);
                tpcVar2.r(tphVar);
                if (!tpcVar2.b.C()) {
                    tpcVar2.o();
                }
                pvc pvcVar2 = (pvc) tpcVar2.b;
                pvbVar4.getClass();
                pvcVar2.c = pvbVar4;
                pvcVar2.b |= 1;
                return ske.M((pvc) tpcVar2.l());
            case 2:
                if (!((Boolean) obj).booleanValue()) {
                    ((pzb) this.a).b.l(1036);
                }
                return syq.a;
            case 3:
                pvc pvcVar3 = (pvc) obj;
                return ske.M(pvcVar3 == null ? rwc.j(svq.GROUP_NOT_FOUND) : pzb.a((pvc) this.a, pvcVar3));
            case 4:
                if (((Boolean) obj).booleanValue()) {
                    return syq.a;
                }
                ((pzb) this.a).b.l(1036);
                return ske.L(new IOException("Failed to commit new group metadata to disk."));
            case 5:
                throw ((Throwable) this.a);
            case 6:
                rwc rwcVar = (rwc) obj;
                if (!rwcVar.h()) {
                    return syq.a;
                }
                Object obj4 = this.a;
                pzb pzbVar = (pzb) obj4;
                return pzbVar.r(pzbVar.d.a((pvc) rwcVar.c()), new pyg(obj4, i3));
            case 7:
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) obj).iterator();
                while (true) {
                    Object obj5 = this.a;
                    if (!it.hasNext()) {
                        return qsp.N(arrayList).f(new ire(9), ((pzb) obj5).g);
                    }
                    pvl pvlVar = (pvl) it.next();
                    pzb pzbVar2 = (pzb) obj5;
                    if (!pzbVar2.u(pvlVar.d)) {
                        arrayList.add(pzbVar2.r(pzbVar2.d.g(pvlVar), new pyn(obj5, (tph) pvlVar, i5)));
                    }
                }
            case 8:
                return ske.L((Throwable) this.a);
            case 9:
                return ((pzb) this.a).e.c.f(scn.F(((sbv) obj).values()));
            case 10:
                sbv sbvVar = (sbv) obj;
                sbv sbvVar2 = (sbv) ske.U(this.a);
                HashMap map = new HashMap();
                sgj sgjVarListIterator = sbvVar2.entrySet().listIterator();
                while (sgjVarListIterator.hasNext()) {
                    Map.Entry entry = (Map.Entry) sgjVarListIterator.next();
                    if (sbvVar.containsKey(entry.getValue())) {
                        pva pvaVar = (pva) entry.getKey();
                        pvk pvkVarB = pvk.b(((pvr) sbvVar.get(entry.getValue())).d);
                        if (pvkVarB == null) {
                            pvkVarB = pvk.NONE;
                        }
                        map.put(pvaVar, pvkVarB);
                    }
                }
                return ske.M(sbv.m(map));
            case 11:
                if (((Boolean) obj).booleanValue()) {
                    return syq.a;
                }
                ((pzb) this.a).b.l(1036);
                tfm tfmVarA2 = pul.a();
                tfmVarA2.c = "File Import(s) succeeded, but failed to save MDD state.";
                tfmVarA2.b = puk.UNABLE_TO_UPDATE_GROUP_METADATA_ERROR;
                return ske.L(tfmVarA2.c());
            case 12:
                if (!((Boolean) obj).booleanValue()) {
                    ((pzb) this.a).b.l(1036);
                }
                return syq.a;
            case 13:
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = ((List) obj).iterator();
                while (true) {
                    Object obj6 = this.a;
                    if (!it2.hasNext()) {
                        return qsp.N(arrayList2).f(new ire(14), ((pzb) obj6).g);
                    }
                    pvl pvlVar2 = (pvl) it2.next();
                    if (!pvlVar2.f) {
                        pzb pzbVar3 = (pzb) obj6;
                        arrayList2.add(pzbVar3.r(pzbVar3.d.g(pvlVar2), new pyg(obj6, i)));
                    }
                }
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                qao qaoVar = (qao) obj;
                pvl pvlVar3 = qaoVar.a;
                pvc pvcVar4 = qaoVar.b;
                boolean z = pvlVar3.f;
                Object obj7 = this.a;
                if (z && qsp.af(pvcVar4)) {
                    pzb pzbVar4 = (pzb) obj7;
                    return pzbVar4.r((pzbVar4.k.H() && qsp.af(pvcVar4)) ? qdp.e(pzbVar4.k(pvcVar4)).f(new hve(obj7, pvcVar4, i3, bArr), pzbVar4.g) : ske.M(true), new pyn(obj7, (tph) pvcVar4, 11));
                }
                ((pzb) obj7).b.p(pzb.w(pvcVar4), 2);
                return syq.a;
            case 15:
                pvc pvcVar5 = (pvc) obj;
                return (pvcVar5 == null || (iW = qsp.w(pvcVar5.r)) == 0 || iW == 1) ? ske.M(true) : ((qdt) ((rww) ((pzb) this.a).i.c()).fr()).a();
            case 16:
                qao qaoVar2 = (qao) obj;
                pvc pvcVar6 = qaoVar2.b;
                for (pva pvaVar2 : pvcVar6.o) {
                    int iAx = a.ax(pvcVar6.j);
                    if (iAx == 0) {
                        iAx = 1;
                    }
                    Object obj8 = this.a;
                    pvp pvpVarAt = qsp.at(pvaVar2, iAx);
                    pzb pzbVar5 = (pzb) obj8;
                    qag qagVar = pzbVar5.e;
                    qsz.k(qdp.e(qagVar.f(pvpVarAt)).g(new pyu((Object) qagVar, (tph) pvpVarAt, (tph) pvaVar2, 17), qagVar.k), qah.class, new pyu(obj8, pvcVar6, qaoVar2, i2), pzbVar5.g);
                }
                return syq.a;
            case 17:
                Object obj9 = this.a;
                pze pzeVar = (pze) obj9;
                return qsz.n(pzeVar.n(pzeVar.a.b()), new pzd(obj9, (qcs) obj, i4), pzeVar.b);
            case 18:
                Object obj10 = this.a;
                pze pzeVar2 = (pze) obj10;
                return qsz.n(pzeVar2.n(pzeVar2.a.k()), new pyn(obj10, (qcs) obj, i), pzeVar2.b);
            case 19:
                Object obj11 = this.a;
                pze pzeVar3 = (pze) obj11;
                return qsz.n(pzeVar3.n(pzeVar3.a.e()), new pyn(obj11, (qcs) obj, 18), pzeVar3.b);
            default:
                Object obj12 = this.a;
                pzh pzhVar = (pzh) obj12;
                return qsz.n(pzhVar.b.c(), new pzd(obj12, (Boolean) obj, i3), pzhVar.d);
        }
    }
}
