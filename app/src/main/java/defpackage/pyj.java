package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.wear.ambient.AmbientModeSupport;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class pyj implements sxi {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ pyj(Object obj, Object obj2, Object obj3, tph tphVar, int i) {
        this.e = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = tphVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, sxi] */
    /* JADX WARN: Type inference failed for: r1v40, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v49, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v76, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v43, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r5v26, types: [pzb] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object, sxi] */
    @Override // defpackage.sxi
    public final syu a(Object obj) throws pul {
        int i;
        byte[] bArrAm = null;
        bArrAm = null;
        switch (this.e) {
            case 0:
                Object obj2 = this.d;
                Object obj3 = this.c;
                Object obj4 = this.b;
                Object obj5 = this.a;
                break;
            case 1:
                pvr pvrVar = (pvr) obj;
                Object obj6 = this.b;
                if (pvrVar != null && pvrVar.e) {
                    this.d.add(qsp.ak((Context) ((qav) obj6).i, pvrVar.g));
                }
                Object obj7 = this.a;
                Object obj8 = this.c;
                qav qavVar = (qav) obj6;
                Object obj9 = qavVar.e;
                qag qagVar = (qag) obj9;
                break;
            case 2:
                int i2 = ((qco) obj).a;
                pzb pzbVar = (pzb) this.a;
                qbq qbqVar = pzbVar.b;
                Object obj10 = this.c;
                pvc pvcVar = (pvc) this.b;
                pva pvaVar = (pva) obj10;
                pzb.C(qbqVar, pvcVar, pvaVar, i2);
                String str = pvaVar.c;
                String str2 = pvcVar.d;
                int i3 = qbu.a;
                break;
            case 3:
                pvc pvcVar2 = (pvc) this.b;
                break;
            case 4:
                pvc pvcVar3 = (pvc) this.b;
                break;
            case 5:
                Object obj11 = this.c;
                pvc pvcVar4 = (pvc) obj;
                Object obj12 = obj11;
                if (obj11 == null) {
                    pve pveVar = pvcVar4.m;
                    obj12 = pveVar;
                    if (pveVar == null) {
                        obj12 = pve.a;
                    }
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = pvcVar4.o.iterator();
                while (true) {
                    Object obj13 = this.b;
                    Object obj14 = this.d;
                    if (!it.hasNext()) {
                        pzb pzbVar2 = (pzb) obj14;
                        break;
                    } else {
                        pva pvaVar2 = (pva) it.next();
                        if (!qsp.ag(pvaVar2)) {
                            int iAx = a.ax(pvcVar4.j);
                            if (iAx == 0) {
                                iAx = 1;
                            }
                            pvp pvpVarAt = qsp.at(pvaVar2, iAx);
                            pzb pzbVar3 = (pzb) obj14;
                            syu syuVarL = pzbVar3.l(pvcVar4, pvaVar2, pvpVarAt);
                            qdp qdpVarE = qdp.e(syuVarL);
                            nzm nzmVar = new nzm(obj14, pvaVar2, pvcVar4, 13, (char[]) null);
                            Executor executor = pzbVar3.g;
                            arrayList.add(pzbVar3.r(qdpVarE.g(nzmVar, executor).g(new pwj(pzbVar3, pvaVar2, pvcVar4, syuVarL, pvpVarAt, 4), executor).d(qco.class, new nzm(obj14, pvaVar2, pvcVar4, 14, (char[]) null), executor), new pyi(pzbVar3, (pvl) obj13, pvcVar4, pvaVar2, pvpVarAt, (pve) obj12, 0)));
                        }
                    }
                }
            case 6:
                qbu.d("%s: Shared file not found, newFileKey = %s", "FileGroupManager", this.d);
                pzb pzbVar4 = (pzb) this.a;
                pzbVar4.c.a();
                pzb.C(pzbVar4.b, (pvc) this.b, (pva) this.c, 26);
                break;
            case 7:
                pza pzaVar = (pza) obj;
                Object obj15 = this.b;
                if (pzaVar != pza.DOWNLOADED) {
                    pzb.x(this.a, (pvl) obj15);
                }
                Object obj16 = this.d;
                tpc tpcVarM = suv.a.m();
                pvl pvlVar = (pvl) obj15;
                String str3 = pvlVar.c;
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                tph tphVar = tpcVarM.b;
                suv suvVar = (suv) tphVar;
                str3.getClass();
                suvVar.b = 1 | suvVar.b;
                suvVar.c = str3;
                String str4 = pvlVar.d;
                if (!tphVar.C()) {
                    tpcVarM.o();
                }
                Object obj17 = this.c;
                tph tphVar2 = tpcVarM.b;
                suv suvVar2 = (suv) tphVar2;
                str4.getClass();
                suvVar2.b |= 4;
                suvVar2.e = str4;
                pvc pvcVar5 = (pvc) obj17;
                int i4 = pvcVar5.f;
                if (!tphVar2.C()) {
                    tpcVarM.o();
                }
                tph tphVar3 = tpcVarM.b;
                suv suvVar3 = (suv) tphVar3;
                suvVar3.b |= 2;
                suvVar3.d = i4;
                long j = pvcVar5.s;
                if (!tphVar3.C()) {
                    tpcVarM.o();
                }
                tph tphVar4 = tpcVarM.b;
                suv suvVar4 = (suv) tphVar4;
                suvVar4.b |= 64;
                suvVar4.i = j;
                String str5 = pvcVar5.t;
                if (!tphVar4.C()) {
                    tpcVarM.o();
                }
                qbq qbqVar2 = ((pzb) obj16).b;
                suv suvVar5 = (suv) tpcVarM.b;
                str5.getClass();
                suvVar5.b |= 128;
                suvVar5.j = str5;
                qbqVar2.q(3, (suv) tpcVarM.l(), 2);
                break;
            case 8:
                pvr pvrVar2 = (pvr) obj;
                pvk pvkVarB = pvk.b(pvrVar2.d);
                if (pvkVarB == null) {
                    pvkVarB = pvk.NONE;
                }
                if (pvkVarB == pvk.DOWNLOAD_COMPLETE) {
                    Object obj18 = this.d;
                    Object obj19 = this.c;
                    Object obj20 = this.b;
                    Object obj21 = this.a;
                    pzb pzbVar5 = (pzb) obj21;
                    pvc pvcVar6 = (pvc) obj20;
                    pva pvaVar3 = (pva) obj19;
                    qdp qdpVarE2 = qdp.e(pzbVar5.f(pvrVar2, pvaVar3, pvcVar6));
                    pwj pwjVar = new pwj(pzbVar5, pvaVar3, pvcVar6, pvrVar2, (pvp) obj18, 3);
                    Executor executor2 = pzbVar5.g;
                    break;
                } else {
                    break;
                }
            case 9:
                qap qapVar = (qap) obj;
                pvc pvcVar7 = qapVar.a;
                if (pvcVar7 == null) {
                    pvcVar7 = qapVar.b;
                }
                pvc pvcVar8 = pvcVar7;
                ?? r1 = this.a;
                Object obj22 = this.c;
                if (pvcVar8 == null) {
                    pzb.x(r1, (pvl) obj22);
                    break;
                } else {
                    ?? r9 = this.d;
                    ?? r5 = (pzb) this.b;
                    pvl pvlVar2 = (pvl) obj22;
                    break;
                }
            case 10:
                pvr pvrVar3 = (pvr) obj;
                Object obj23 = this.b;
                Object obj24 = this.c;
                Object obj25 = this.a;
                if (pvrVar3 != null) {
                    pvk pvkVarB2 = pvk.b(pvrVar3.d);
                    if (pvkVarB2 == null) {
                        pvkVarB2 = pvk.NONE;
                    }
                    if (pvkVarB2 == pvk.DOWNLOAD_COMPLETE) {
                        qba qbaVar = (qba) obj25;
                        bArrAm = qsp.am(qbaVar.a, qbaVar.n, pvrVar3.c, ((pvp) this.d).e, qbaVar.c, qbaVar.l, false);
                    }
                }
                if (bArrAm == null) {
                    tfm tfmVarA = pul.a();
                    tfmVarA.b = puk.DELTA_DOWNLOAD_BASE_FILE_NOT_FOUND_ERROR;
                    break;
                } else {
                    try {
                        lat latVar = ((qba) obj25).o;
                        if (latVar.r((Uri) obj24)) {
                            latVar.p((Uri) obj24);
                        }
                        ((qba) obj25).e.a();
                        latVar.p((Uri) obj23);
                        tpc tpcVarM2 = suv.a.m();
                        qba qbaVar2 = (qba) obj25;
                        pvl pvlVar3 = qbaVar2.h;
                        String str6 = pvlVar3.c;
                        if (!tpcVarM2.b.C()) {
                            tpcVarM2.o();
                        }
                        tph tphVar5 = tpcVarM2.b;
                        suv suvVar6 = (suv) tphVar5;
                        str6.getClass();
                        suvVar6.b = 1 | suvVar6.b;
                        suvVar6.c = str6;
                        int i5 = qbaVar2.i;
                        if (!tphVar5.C()) {
                            tpcVarM2.o();
                        }
                        tph tphVar6 = tpcVarM2.b;
                        suv suvVar7 = (suv) tphVar6;
                        suvVar7.b = 2 | suvVar7.b;
                        suvVar7.d = i5;
                        String str7 = pvlVar3.d;
                        if (!tphVar6.C()) {
                            tpcVarM2.o();
                        }
                        tph tphVar7 = tpcVarM2.b;
                        suv suvVar8 = (suv) tphVar7;
                        str7.getClass();
                        suvVar8.b |= 4;
                        suvVar8.e = str7;
                        long j2 = qbaVar2.j;
                        if (!tphVar7.C()) {
                            tpcVarM2.o();
                        }
                        tph tphVar8 = tpcVarM2.b;
                        suv suvVar9 = (suv) tphVar8;
                        suvVar9.b |= 64;
                        suvVar9.i = j2;
                        String str8 = qbaVar2.k;
                        if (!tphVar8.C()) {
                            tpcVarM2.o();
                        }
                        suv suvVar10 = (suv) tpcVarM2.b;
                        str8.getClass();
                        suvVar10.b |= 128;
                        suvVar10.j = str8;
                        suv suvVar11 = (suv) tpcVarM2.l();
                        qbq qbqVar3 = qbaVar2.g;
                        pva pvaVar4 = qbaVar2.d;
                        pvd pvdVar = qbaVar2.f;
                        long j3 = pvaVar4.e;
                        long j4 = pvdVar.d;
                        String str9 = pvaVar4.c;
                        int i6 = 0;
                        while (true) {
                            if (i6 < pvaVar4.l.size()) {
                                int i7 = i6 + 1;
                                if (rup.e(((pvd) pvaVar4.l.get(i6)).e, pvdVar.e)) {
                                    i = i7;
                                } else {
                                    i6 = i7;
                                }
                            } else {
                                i = 0;
                            }
                        }
                        qbqVar3.o(suvVar11, 4, j3, j4, str9, i);
                        break;
                    } catch (IOException e) {
                        qba qbaVar3 = (qba) obj25;
                        qbu.g(e, "%s: Failed to decode delta file with url = %s failed. checksum = %s ", "DeltaFileDownloaderCallbackImpl", qbaVar3.f.c, qbaVar3.d.g);
                        qbaVar3.c.a();
                        tfm tfmVarA2 = pul.a();
                        tfmVarA2.b = puk.DELTA_DOWNLOAD_DECODE_IO_ERROR;
                        tfmVarA2.d = e;
                        return ske.L(tfmVarA2.c());
                    }
                }
            case 11:
                rai raiVar = (rai) ske.U(this.d);
                if (!raiVar.c.isEmpty()) {
                    Object obj26 = this.a;
                    Object obj27 = this.b;
                    Object obj28 = this.c;
                    qxf qxfVar = (qxf) obj28;
                    break;
                } else {
                    break;
                }
            default:
                Object obj29 = this.a;
                if (!((String) obj).equals(obj29)) {
                    break;
                } else {
                    AmbientModeSupport.AmbientController ambientController = qzz.b;
                    if (ambientController != null && ambientController.f(((qzs) this.b).a, (String) obj29)) {
                        break;
                    } else {
                        break;
                    }
                }
                break;
        }
        return syq.a;
    }

    public /* synthetic */ pyj(Object obj, tph tphVar, Object obj2, Object obj3, int i) {
        this.e = i;
        this.a = obj;
        this.d = tphVar;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ pyj(pzb pzbVar, List list, pvc pvcVar, pvl pvlVar, int i) {
        this.e = i;
        this.d = pzbVar;
        this.a = list;
        this.c = pvcVar;
        this.b = pvlVar;
    }

    public /* synthetic */ pyj(pzb pzbVar, pve pveVar, pvl pvlVar, sxi sxiVar, int i) {
        this.e = i;
        this.d = pzbVar;
        this.c = pveVar;
        this.b = pvlVar;
        this.a = sxiVar;
    }

    public /* synthetic */ pyj(pzb pzbVar, pvl pvlVar, sxi sxiVar, List list, int i) {
        this.e = i;
        this.b = pzbVar;
        this.c = pvlVar;
        this.d = sxiVar;
        this.a = list;
    }

    public /* synthetic */ pyj(pzb pzbVar, pvp pvpVar, pvc pvcVar, pva pvaVar, int i) {
        this.e = i;
        this.a = pzbVar;
        this.d = pvpVar;
        this.b = pvcVar;
        this.c = pvaVar;
    }

    public /* synthetic */ pyj(qav qavVar, List list, pvp pvpVar, AtomicInteger atomicInteger, int i) {
        this.e = i;
        this.b = qavVar;
        this.d = list;
        this.c = pvpVar;
        this.a = atomicInteger;
    }

    public /* synthetic */ pyj(qxf qxfVar, syu syuVar, qzs qzsVar, String str, int i) {
        this.e = i;
        this.c = qxfVar;
        this.d = syuVar;
        this.b = qzsVar;
        this.a = str;
    }
}
