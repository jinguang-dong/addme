package defpackage;

import android.net.Uri;
import com.google.ar.core.ImageMetadata;
import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class pyu implements sxi {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ pyu(Object obj, qcs qcsVar, Comparator comparator, int i) {
        this.d = i;
        this.a = obj;
        this.c = qcsVar;
        this.b = comparator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v33, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r2v36, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r2v43, types: [java.lang.Object, sxi] */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.lang.Object, sxi] */
    /* JADX WARN: Type inference failed for: r5v31, types: [java.lang.Object, sxi] */
    @Override // defpackage.sxi
    public final syu a(Object obj) throws pul, IOException {
        int i = 20;
        int i2 = 19;
        int i3 = 4;
        int i4 = 8;
        int i5 = 2;
        int i6 = 0;
        int i7 = 1;
        switch (this.d) {
            case 0:
                pvc pvcVar = ((qao) obj).b;
                tpc tpcVar = (tpc) pvcVar.a(5, null);
                tpcVar.r(pvcVar);
                if (!tpcVar.b.C()) {
                    tpcVar.o();
                }
                ((pvc) tpcVar.b).o = trb.a;
                HashMap map = new HashMap();
                for (pva pvaVar : pvcVar.o) {
                    map.put(pvaVar.c, pvaVar);
                }
                ?? r1 = this.b;
                int size = r1.size();
                for (int i8 = 0; i8 < size; i8++) {
                    pva pvaVar2 = (pva) r1.get(i8);
                    map.put(pvaVar2.c, pvaVar2);
                }
                Object obj2 = this.c;
                Object obj3 = this.a;
                tpcVar.B(map.values());
                pvc pvcVar2 = (pvc) tpcVar.l();
                ((qev) obj2).b(pvcVar2);
                pzb pzbVar = (pzb) obj3;
                return pzbVar.r(pzbVar.o(pvcVar2), new pyg(pvcVar2, i6));
            case 1:
                rwc rwcVar = (rwc) obj;
                boolean zH = rwcVar.h();
                Object obj4 = this.c;
                if (!zH) {
                    String str = ((pvl) obj4).c;
                    int i9 = qbu.a;
                    return ske.M(false);
                }
                Object obj5 = this.a;
                pvc pvcVar3 = (pvc) obj5;
                if (qsp.af(pvcVar3)) {
                    int i10 = slm.a;
                    slk slkVarE = sll.a.e();
                    slkVarE.e(pvcVar3.t);
                    slkVarE.e("|");
                    slkVarE.e(((pvl) obj4).e);
                    slkVarE.e("|");
                    slc slcVar = (slc) slkVarE;
                    slcVar.a.putLong(pvcVar3.s);
                    slcVar.b(8);
                    String str2 = String.format("%s_%s", pvcVar3.d, slkVarE.m().toString());
                    tph tphVar = (tph) obj5;
                    tpc tpcVar2 = (tpc) tphVar.a(5, null);
                    tpcVar2.r(tphVar);
                    if (!tpcVar2.b.C()) {
                        tpcVar2.o();
                    }
                    pvc pvcVar4 = (pvc) tpcVar2.b;
                    str2.getClass();
                    pvcVar4.b |= ImageMetadata.LENS_APERTURE;
                    pvcVar4.w = str2;
                    obj5 = (pvc) tpcVar2.l();
                }
                tph tphVar2 = (tph) obj4;
                tpc tpcVar3 = (tpc) tphVar2.a(5, null);
                tpcVar3.r(tphVar2);
                if (!tpcVar3.b.C()) {
                    tpcVar3.o();
                }
                Object obj6 = this.b;
                pvl pvlVar = (pvl) tpcVar3.b;
                pvl pvlVar2 = pvl.a;
                pvlVar.b = 8 | pvlVar.b;
                pvlVar.f = false;
                pzb pzbVar2 = (pzb) obj6;
                return pzbVar2.r(pzbVar2.r(pzbVar2.d.g((pvl) tpcVar3.l()), new pyg(obj5, i7)), new pyu(obj6, tphVar2, rwcVar, i5));
            case 2:
                pvc pvcVar5 = (pvc) obj;
                Object obj7 = this.a;
                String str3 = ((pvl) obj7).c;
                int i11 = qbu.a;
                tpc tpcVarM = suv.a.m();
                String str4 = pvcVar5.d;
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                tph tphVar3 = tpcVarM.b;
                suv suvVar = (suv) tphVar3;
                str4.getClass();
                suvVar.b |= 1;
                suvVar.c = str4;
                String str5 = pvcVar5.e;
                if (!tphVar3.C()) {
                    tpcVarM.o();
                }
                tph tphVar4 = tpcVarM.b;
                suv suvVar2 = (suv) tphVar4;
                str5.getClass();
                suvVar2.b |= 4;
                suvVar2.e = str5;
                int i12 = pvcVar5.f;
                if (!tphVar4.C()) {
                    tpcVarM.o();
                }
                tph tphVar5 = tpcVarM.b;
                suv suvVar3 = (suv) tphVar5;
                suvVar3.b = 2 | suvVar3.b;
                suvVar3.d = i12;
                long j = pvcVar5.s;
                if (!tphVar5.C()) {
                    tpcVarM.o();
                }
                tph tphVar6 = tpcVarM.b;
                suv suvVar4 = (suv) tphVar6;
                suvVar4.b |= 64;
                suvVar4.i = j;
                String str6 = pvcVar5.t;
                if (!tphVar6.C()) {
                    tpcVarM.o();
                }
                Object obj8 = this.b;
                suv suvVar5 = (suv) tpcVarM.b;
                str6.getClass();
                suvVar5.b |= 128;
                suvVar5.j = str6;
                suv suvVar6 = (suv) tpcVarM.l();
                tpc tpcVarM2 = svn.a.m();
                svq svqVar = (svq) ((rwc) obj8).c();
                if (!tpcVarM2.b.C()) {
                    tpcVarM2.o();
                }
                Object obj9 = this.c;
                svn svnVar = (svn) tpcVarM2.b;
                svnVar.c = svqVar.a();
                svnVar.b |= 1;
                pzb pzbVar3 = (pzb) obj9;
                pzbVar3.b.j(suvVar6, (svn) tpcVarM2.l());
                return pzbVar3.r(pzbVar3.o(pvcVar5), new pyu(obj9, (tph) obj7, (tph) pvcVar5, i3));
            case 3:
                Iterator it = ((List) obj).iterator();
                while (true) {
                    ?? r2 = this.b;
                    Object obj10 = this.a;
                    if (!it.hasNext()) {
                        return qsp.N(r2).f(new ire(11), ((pzb) obj10).g);
                    }
                    Object obj11 = this.c;
                    pvl pvlVar3 = (pvl) it.next();
                    pzb pzbVar4 = (pzb) obj10;
                    r2.add(pzbVar4.r(pzbVar4.d.g(pvlVar3), new pyn(obj11, (tph) pvlVar3, i4)));
                }
            case 4:
                if (!((Boolean) obj).booleanValue()) {
                    throw new IOException("Subscribing to group failed");
                }
                Object obj12 = this.c;
                tph tphVar7 = (tph) obj12;
                tpc tpcVar4 = (tpc) tphVar7.a(5, null);
                tpcVar4.r(tphVar7);
                if (!tpcVar4.b.C()) {
                    tpcVar4.o();
                }
                Object obj13 = this.a;
                Object obj14 = this.b;
                pvl pvlVar4 = (pvl) tpcVar4.b;
                pvl pvlVar5 = pvl.a;
                pvlVar4.b |= 8;
                pvlVar4.f = false;
                pvl pvlVar6 = (pvl) tpcVar4.l();
                pzb pzbVar5 = (pzb) obj14;
                syu syuVarG = pzbVar5.d.g(pvlVar6);
                qdp qdpVarE = qdp.e(syuVarG);
                nzm nzmVar = new nzm(obj14, pvlVar6, obj13, 15);
                Executor executor = pzbVar5.g;
                return pzbVar5.r(qdpVarE.g(nzmVar, executor).g(new pyg(obj14, i3), executor).g(new pyn(obj14, (tph) obj13, i5), executor).g(new pyn(obj14, syuVarG, 3), executor), new nzm(obj14, obj13, obj12, 10, (char[]) null));
            case 5:
                qbu.c("%s: Missing file. Logging and deleting file group.", "FileGroupManager");
                Object obj15 = this.a;
                pzb pzbVar6 = (pzb) this.c;
                pzb.B(1062, pzbVar6.b, (pvc) obj15);
                if (!pzbVar6.k.z()) {
                    return syq.a;
                }
                return pzbVar6.r(pzbVar6.d.i(((qao) this.b).a), new kjm(14));
            case 6:
                pvc pvcVar6 = (pvc) obj;
                if (pvcVar6 == null) {
                    return ske.M(pza.PENDING);
                }
                ?? r5 = this.b;
                Object obj16 = this.a;
                pzb pzbVar7 = (pzb) this.c;
                return pzbVar7.D((pvl) obj16, pvcVar6, true, r5, new qev(pzbVar7.b, 1));
            case 7:
                return ((pzb) this.b).d.l((pvl) this.c, (pvc) this.a);
            case 8:
                return ((pze) this.a).p((qcs) this.c, (qcs) obj, this.b, 1093);
            case 9:
                Object obj17 = this.b;
                pze pzeVar = (pze) obj17;
                return qsz.n(pzeVar.n(pzeVar.a.l((pvl) this.c, (pvc) this.a)), new pyn(obj17, (qcs) obj, i2), pzeVar.b);
            case 10:
                return ((pze) this.a).p((qcs) this.c, (qcs) obj, this.b, 1092);
            case 11:
                pzh pzhVar = (pzh) this.b;
                return qsz.m(pzhVar.c.h((pvp) this.a, (pvr) this.c), new pyb((Boolean) obj, 7), pzhVar.d);
            case 12:
                pzh pzhVar2 = (pzh) this.a;
                qcs qcsVar = (qcs) obj;
                int iN = pzhVar2.e.n();
                Object obj18 = this.c;
                if (qbu.a(iN)) {
                    if (qcs.d((qcs) obj18, qcsVar, this.b)) {
                        pzhVar2.a.k(1106, iN);
                    } else {
                        pzhVar2.a.k(1103, iN);
                    }
                }
                qcs qcsVar2 = (qcs) obj18;
                if (qcsVar2.a) {
                    List list = (List) qcsVar2.a();
                    list.getClass();
                    return ske.M(list);
                }
                Object objB = qcsVar2.b();
                objB.getClass();
                return ske.L((Throwable) objB);
            case 13:
                Object obj19 = this.b;
                pzh pzhVar3 = (pzh) obj19;
                return qsz.n(pzhVar3.b(pzhVar3.c.h((pvp) this.a, (pvr) this.c)), new pzd(obj19, (qcs) obj, 9), pzhVar3.d);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                if (!((Boolean) obj).booleanValue()) {
                    return syq.a;
                }
                Object obj20 = this.b;
                Object obj21 = this.a;
                Object obj22 = this.c;
                pzr pzrVar = (pzr) obj22;
                syu syuVarG2 = pzrVar.d.g((pvl) obj21, false);
                qdp qdpVarE2 = qdp.e(syuVarG2);
                pyu pyuVar = new pyu(obj22, (tph) obj21, obj20, 16);
                Executor executor2 = pzrVar.k;
                return qdpVarE2.g(pyuVar, executor2).g(new pzd(obj22, syuVarG2, i), executor2);
            case 15:
                return ((pzr) this.c).d.e((pvl) this.a, null, this.b);
            case 16:
                pvc pvcVar7 = (pvc) obj;
                if (pvcVar7 == null) {
                    return ske.M(pza.PENDING);
                }
                ?? r52 = this.b;
                Object obj23 = this.a;
                pzr pzrVar2 = (pzr) this.c;
                return pzrVar2.d.D((pvl) obj23, pvcVar7, true, r52, new qev(pzrVar2.c, 1));
            case 17:
                pvr pvrVar = (pvr) obj;
                pvk pvkVarB = pvk.b(pvrVar.d);
                if (pvkVarB == null) {
                    pvkVarB = pvk.NONE;
                }
                if (pvkVarB != pvk.DOWNLOAD_COMPLETE) {
                    return syq.a;
                }
                Object obj24 = this.a;
                Object obj25 = this.c;
                Object obj26 = this.b;
                qag qagVar = (qag) obj26;
                qdp qdpVarE3 = qdp.e(qagVar.d((pvp) obj25));
                pyu pyuVar2 = new pyu(obj26, (tph) pvrVar, (tph) obj24, i2);
                Executor executor3 = qagVar.k;
                return qdpVarE3.g(pyuVar2, executor3).d(pul.class, new pyu(obj26, (tph) pvrVar, (tph) obj25, i), executor3);
            case 18:
                Object obj27 = this.b;
                pvk pvkVar = pvk.DOWNLOAD_IN_PROGRESS;
                tpc tpcVar5 = (tpc) obj27;
                if (!tpcVar5.b.C()) {
                    tpcVar5.o();
                }
                Object obj28 = this.a;
                Object obj29 = this.c;
                pvr pvrVar2 = (pvr) tpcVar5.b;
                pvr pvrVar3 = pvr.a;
                pvrVar2.d = pvkVar.h;
                pvrVar2.b |= 2;
                return ((qag) obj29).c.h((pvp) obj28, (pvr) tpcVar5.l());
            case 19:
                Uri uri = (Uri) obj;
                if (uri == null) {
                    tfm tfmVarA = pul.a();
                    tfmVarA.b = puk.DOWNLOADED_FILE_NOT_FOUND_ERROR;
                    throw tfmVarA.c();
                }
                Object obj30 = this.c;
                Object obj31 = this.b;
                if (!((pvr) obj30).e) {
                    pva pvaVar3 = (pva) this.a;
                    qbc.c(((qag) obj31).l, pvaVar3, uri, pvaVar3.g);
                } else if (!((qag) obj31).l.r(uri)) {
                    tfm tfmVarA2 = pul.a();
                    tfmVarA2.b = puk.DOWNLOADED_FILE_NOT_FOUND_ERROR;
                    throw tfmVarA2.c();
                }
                return syq.a;
            default:
                qbu.d("%s: reVerifyFile lost or corrupted code %s", "SharedFileManager", ((pul) obj).a);
                tph tphVar8 = (tph) this.c;
                tpc tpcVar6 = (tpc) tphVar8.a(5, null);
                tpcVar6.r(tphVar8);
                pvk pvkVar2 = pvk.CORRUPTED;
                if (!tpcVar6.b.C()) {
                    tpcVar6.o();
                }
                Object obj32 = this.a;
                Object obj33 = this.b;
                pvr pvrVar4 = (pvr) tpcVar6.b;
                pvr pvrVar5 = pvr.a;
                pvrVar4.d = pvkVar2.h;
                pvrVar4.b |= 2;
                qag qagVar2 = (qag) obj33;
                return qdp.e(qagVar2.c.h((pvp) obj32, (pvr) tpcVar6.l())).g(new qci(1), qagVar2.k);
        }
    }

    public /* synthetic */ pyu(Object obj, tph tphVar, Object obj2, int i) {
        this.d = i;
        this.c = obj;
        this.a = tphVar;
        this.b = obj2;
    }

    public /* synthetic */ pyu(Object obj, tph tphVar, tph tphVar2, int i) {
        this.d = i;
        this.b = obj;
        this.c = tphVar;
        this.a = tphVar2;
    }

    public /* synthetic */ pyu(pzb pzbVar, List list, Object obj, int i) {
        this.d = i;
        this.a = pzbVar;
        this.b = list;
        this.c = obj;
    }

    public /* synthetic */ pyu(pzh pzhVar, pvp pvpVar, pvr pvrVar, int i) {
        this.d = i;
        this.b = pzhVar;
        this.a = pvpVar;
        this.c = pvrVar;
    }

    public /* synthetic */ pyu(qag qagVar, tpc tpcVar, pvp pvpVar, int i) {
        this.d = i;
        this.c = qagVar;
        this.b = tpcVar;
        this.a = pvpVar;
    }
}
