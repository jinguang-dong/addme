package defpackage;

import android.net.Uri;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class pzu implements rvu {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ pzu(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rvu
    public final Object apply(Object obj) {
        final int i = 2;
        final int i2 = 0;
        final int i3 = 1;
        byte[] bArr = null;
        switch (this.b) {
            case 0:
                return (pvr) ((sbv) obj).get(this.a);
            case 1:
                qbu.b("Failed to commit migration metadata to disk");
                new Exception("Migration to DownloadTransform failed.", (IOException) obj);
                ((pzx) this.a).b.a();
                return false;
            case 2:
                pvt pvtVar = (pvt) obj;
                tpc tpcVar = (tpc) pvtVar.a(5, null);
                tpcVar.r(pvtVar);
                tpcVar.F((String) this.a);
                return (pvt) tpcVar.l();
            case 3:
                pvt pvtVar2 = (pvt) obj;
                int i4 = qbu.a;
                tpc tpcVar2 = (tpc) pvtVar2.a(5, null);
                tpcVar2.r(pvtVar2);
                Object obj2 = this.a;
                for (String str : DesugarCollections.unmodifiableMap(pvtVar2.b).keySet()) {
                    try {
                        pvp pvpVarG = qsp.G(str, ((pzx) obj2).a, ((pzx) obj2).b);
                        str.getClass();
                        tqm tqmVar = pvtVar2.b;
                        pvr pvrVar = tqmVar.containsKey(str) ? (pvr) tqmVar.get(str) : null;
                        tpcVar2.F(str);
                        if (pvrVar == null) {
                            qbu.c("%s: Unable to read sharedFile from ProtoDataStore.", "ProtoDataStoreSharedFilesMetadata");
                        } else {
                            tpcVar2.E(qsp.J(pvpVarG), pvrVar);
                        }
                    } catch (qcv unused) {
                        qbu.d("%s Failed to deserialize file key %s, remove and continue.", "ProtoDataStoreSharedFilesMetadata", str);
                        ((pzx) obj2).b.a();
                        tpcVar2.F(str);
                    }
                }
                return (pvt) tpcVar2.l();
            case 4:
                qbu.b("Failed to commit migration metadata to disk");
                new Exception("Migration to ChecksumOnly failed.", (IOException) obj);
                ((pzx) this.a).b.a();
                return false;
            case 5:
                return (List) ((AtomicReference) this.a).get();
            case 6:
                pvt pvtVar3 = (pvt) obj;
                int i5 = qbu.a;
                tpc tpcVar3 = (tpc) pvtVar3.a(5, null);
                tpcVar3.r(pvtVar3);
                Object obj3 = this.a;
                for (String str2 : DesugarCollections.unmodifiableMap(pvtVar3.b).keySet()) {
                    try {
                        pvp pvpVarG2 = qsp.G(str2, ((pzx) obj3).a, ((pzx) obj3).b);
                        str2.getClass();
                        tqm tqmVar2 = pvtVar3.b;
                        pvr pvrVar2 = tqmVar2.containsKey(str2) ? (pvr) tqmVar2.get(str2) : null;
                        tpcVar3.F(str2);
                        if (pvrVar2 == null) {
                            qbu.c("%s: Unable to read sharedFile from ProtoDataStore.", "ProtoDataStoreSharedFilesMetadata");
                        } else {
                            tpcVar3.E(qsp.K(pvpVarG2), pvrVar2);
                        }
                    } catch (qcv unused2) {
                        qbu.d("%s Failed to deserialize file key %s, remove and continue.", "ProtoDataStoreSharedFilesMetadata", str2);
                        ((pzx) obj3).b.a();
                        tpcVar3.F(str2);
                    }
                }
                return (pvt) tpcVar3.l();
            case 7:
                return (Uri) ((sbv) obj).get(this.a);
            case 8:
                return (pvr) ((sbv) obj).get(this.a);
            case 9:
                pvc pvcVar = (pvc) obj;
                qbn qbnVarI = qbo.i(pvcVar);
                String str3 = pvcVar.d;
                Object obj4 = this.a;
                qbo qboVar = (qbo) obj4;
                if (!qboVar.g()) {
                    return syq.a;
                }
                syu syuVarD = qboVar.d(str3);
                pzw pzwVar = new pzw(6);
                Executor executor = qboVar.b;
                return qsz.n(qsz.m(syuVarD, pzwVar, executor), new pzn(obj4, qbnVarI, 13, bArr), executor);
            case 10:
                final Object obj5 = this.a;
                return ujp.aP((List) obj, new rwe() { // from class: qbm
                    @Override // defpackage.rwe
                    public final boolean a(Object obj6) {
                        int i6 = i2;
                        if (i6 == 0) {
                            return qbo.h(((qao) obj6).b, (String) obj5);
                        }
                        if (i6 == 1) {
                            return qbo.h((pvc) obj6, (String) obj5);
                        }
                        pvg pvgVar = (pvg) obj6;
                        int i7 = qcd.d;
                        pvg pvgVar2 = (pvg) obj5;
                        pvl pvlVar = pvgVar2.c;
                        if (pvlVar == null) {
                            pvlVar = pvl.a;
                        }
                        pvl pvlVar2 = pvgVar.c;
                        if (pvlVar2 == null) {
                            pvlVar2 = pvl.a;
                        }
                        return pvlVar.equals(pvlVar2) && pvgVar2.f == pvgVar.f && pvgVar2.d == pvgVar.d;
                    }
                });
            case 11:
                final Object obj6 = this.a;
                return ujp.aP((List) obj, new rwe() { // from class: qbm
                    @Override // defpackage.rwe
                    public final boolean a(Object obj62) {
                        int i6 = i3;
                        if (i6 == 0) {
                            return qbo.h(((qao) obj62).b, (String) obj6);
                        }
                        if (i6 == 1) {
                            return qbo.h((pvc) obj62, (String) obj6);
                        }
                        pvg pvgVar = (pvg) obj62;
                        int i7 = qcd.d;
                        pvg pvgVar2 = (pvg) obj6;
                        pvl pvlVar = pvgVar2.c;
                        if (pvlVar == null) {
                            pvlVar = pvl.a;
                        }
                        pvl pvlVar2 = pvgVar.c;
                        if (pvlVar2 == null) {
                            pvlVar2 = pvl.a;
                        }
                        return pvlVar.equals(pvlVar2) && pvgVar2.f == pvgVar.f && pvgVar2.d == pvgVar.d;
                    }
                });
            case 12:
                return new qbp((svd) obj, (suv) this.a);
            case 13:
                pza pzaVar = (pza) obj;
                Object obj7 = this.a;
                if (pzaVar == pza.DOWNLOADED || pzaVar == pza.PENDING) {
                    tpc tpcVar4 = (tpc) obj7;
                    if (!tpcVar4.b.C()) {
                        tpcVar4.o();
                    }
                    svd svdVar = (svd) tpcVar4.b;
                    svd svdVar2 = svd.a;
                    svdVar.c = a.at(4);
                    svdVar.b |= 1;
                } else {
                    tpc tpcVar5 = (tpc) obj7;
                    if (!tpcVar5.b.C()) {
                        tpcVar5.o();
                    }
                    svd svdVar3 = (svd) tpcVar5.b;
                    svd svdVar4 = svd.a;
                    svdVar3.c = a.at(5);
                    svdVar3.b |= 1;
                }
                return (svd) ((tpc) obj7).l();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                suz suzVar = (suz) obj;
                tpc tpcVarM = sux.a.m();
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                Object obj8 = this.a;
                sux suxVar = (sux) tpcVarM.b;
                suzVar.getClass();
                suxVar.w = suzVar;
                suxVar.d |= 32768;
                ((qbz) obj8).s(1120, tpcVarM, r12.a.k());
                return null;
            case 15:
                int i6 = qcd.d;
                return (List) ((AtomicReference) this.a).get();
            case 16:
                pvo pvoVar = (pvo) obj;
                int i7 = qcd.d;
                tpw tpwVar = pvoVar.d;
                final Object obj9 = this.a;
                rwe rweVar = new rwe() { // from class: qbm
                    @Override // defpackage.rwe
                    public final boolean a(Object obj62) {
                        int i62 = i;
                        if (i62 == 0) {
                            return qbo.h(((qao) obj62).b, (String) obj9);
                        }
                        if (i62 == 1) {
                            return qbo.h((pvc) obj62, (String) obj9);
                        }
                        pvg pvgVar = (pvg) obj62;
                        int i72 = qcd.d;
                        pvg pvgVar2 = (pvg) obj9;
                        pvl pvlVar = pvgVar2.c;
                        if (pvlVar == null) {
                            pvlVar = pvl.a;
                        }
                        pvl pvlVar2 = pvgVar.c;
                        if (pvlVar2 == null) {
                            pvlVar2 = pvl.a;
                        }
                        return pvlVar.equals(pvlVar2) && pvgVar2.f == pvgVar.f && pvgVar2.d == pvgVar.d;
                    }
                };
                Iterator<E> it = tpwVar.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                    } else if (!rweVar.a(it.next())) {
                        i2++;
                    }
                }
                if (i2 == -1) {
                    tpc tpcVar6 = (tpc) pvoVar.a(5, null);
                    tpcVar6.r(pvoVar);
                    if (!tpcVar6.b.C()) {
                        tpcVar6.o();
                    }
                    pvo pvoVar2 = (pvo) tpcVar6.b;
                    obj9.getClass();
                    pvoVar2.b();
                    pvoVar2.d.add(obj9);
                    return (pvo) tpcVar6.l();
                }
                pvg pvgVar = (pvg) pvoVar.d.get(i2);
                tpc tpcVar7 = (tpc) pvgVar.a(5, null);
                tpcVar7.r(pvgVar);
                pvg pvgVar2 = (pvg) obj9;
                long j = pvgVar.g + pvgVar2.g;
                if (!tpcVar7.b.C()) {
                    tpcVar7.o();
                }
                tph tphVar = tpcVar7.b;
                pvg pvgVar3 = (pvg) tphVar;
                pvgVar3.b |= 16;
                pvgVar3.g = j;
                long j2 = pvgVar.h + pvgVar2.h;
                if (!tphVar.C()) {
                    tpcVar7.o();
                }
                pvg pvgVar4 = (pvg) tpcVar7.b;
                pvgVar4.b |= 32;
                pvgVar4.h = j2;
                pvg pvgVar5 = (pvg) tpcVar7.l();
                tpc tpcVar8 = (tpc) pvoVar.a(5, null);
                tpcVar8.r(pvoVar);
                if (!tpcVar8.b.C()) {
                    tpcVar8.o();
                }
                pvo pvoVar3 = (pvo) tpcVar8.b;
                pvgVar5.getClass();
                pvoVar3.b();
                pvoVar3.d.set(i2, pvgVar5);
                return (pvo) tpcVar8.l();
            case 17:
                int i8 = qcd.d;
                return (rwc) ((AtomicReference) this.a).get();
            case 18:
                pvo pvoVar4 = (pvo) obj;
                pvq pvqVar = pvoVar4.f;
                if (pvqVar == null) {
                    pvqVar = pvq.a;
                }
                if ((pvqVar.b & 1) != 0) {
                    return pvoVar4;
                }
                long jNextLong = ((qcd) this.a).b.nextLong();
                tpc tpcVar9 = (tpc) pvoVar4.a(5, null);
                tpcVar9.r(pvoVar4);
                pvq pvqVar2 = pvoVar4.f;
                if (pvqVar2 == null) {
                    pvqVar2 = pvq.a;
                }
                tpc tpcVar10 = (tpc) pvqVar2.a(5, null);
                tpcVar10.r(pvqVar2);
                if (!tpcVar10.b.C()) {
                    tpcVar10.o();
                }
                pvq pvqVar3 = (pvq) tpcVar10.b;
                pvqVar3.b |= 1;
                pvqVar3.c = jNextLong;
                trn trnVarB = tsi.b(prh.q());
                if (!tpcVar10.b.C()) {
                    tpcVar10.o();
                }
                pvq pvqVar4 = (pvq) tpcVar10.b;
                trnVarB.getClass();
                pvqVar4.d = trnVarB;
                pvqVar4.b |= 2;
                if (!tpcVar9.b.C()) {
                    tpcVar9.o();
                }
                pvo pvoVar5 = (pvo) tpcVar9.b;
                pvq pvqVar5 = (pvq) tpcVar10.l();
                pvqVar5.getClass();
                pvoVar5.f = pvqVar5;
                pvoVar5.b |= 4;
                return (pvo) tpcVar9.l();
            case 19:
                pvo pvoVar6 = (pvo) obj;
                long jQ = prh.q();
                Long lValueOf = Long.valueOf(jQ);
                trn trnVar = pvoVar6.c;
                if (trnVar == null) {
                    trnVar = trn.a;
                }
                long jA = tsi.a(trnVar);
                Long lValueOf2 = Long.valueOf(jA);
                tpc tpcVar11 = (tpc) pvoVar6.a(5, null);
                tpcVar11.r(pvoVar6);
                lValueOf.getClass();
                trn trnVarB2 = tsi.b(jQ);
                if (!tpcVar11.b.C()) {
                    tpcVar11.o();
                }
                pvo pvoVar7 = (pvo) tpcVar11.b;
                trnVarB2.getClass();
                pvoVar7.c = trnVarB2;
                pvoVar7.b |= 1;
                pvo pvoVar8 = (pvo) tpcVar11.l();
                if ((pvoVar6.b & 1) != 0) {
                    Object obj10 = this.a;
                    lValueOf.getClass();
                    long jF = qcd.f(jQ);
                    lValueOf2.getClass();
                    ((AtomicReference) obj10).set(rwc.j(Integer.valueOf(ske.af(TimeUnit.MILLISECONDS.toDays(jF - qcd.f(jA))))));
                }
                return pvoVar8;
            default:
                int i9 = qcd.d;
                return (rwc) ((AtomicReference) this.a).get();
        }
    }
}
