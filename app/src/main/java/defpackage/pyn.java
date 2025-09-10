package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class pyn implements sxi {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ pyn(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v42, types: [java.lang.Object, sxi] */
    /* JADX WARN: Type inference failed for: r8v58, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r8v70, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // defpackage.sxi
    public final syu a(Object obj) {
        int i = 20;
        switch (this.c) {
            case 0:
                pvc pvcVar = (pvc) obj;
                if (pvcVar == null) {
                    return syq.a;
                }
                Object obj2 = this.b;
                Object obj3 = this.a;
                pvl pvlVar = (pvl) obj2;
                String str = pvlVar.c;
                String str2 = pvlVar.d;
                int i2 = qbu.a;
                pzb pzbVar = (pzb) obj3;
                pzb.B(1050, pzbVar.b, pvcVar);
                return pzbVar.r(pzbVar.d.i(pvlVar), new pyn(obj3, (tph) pvcVar, 10));
            case 1:
                if (((pvc) obj) == null) {
                    return syq.a;
                }
                Object obj4 = this.b;
                Object obj5 = this.a;
                pvl pvlVar2 = (pvl) obj4;
                String str3 = pvlVar2.c;
                String str4 = pvlVar2.d;
                int i3 = qbu.a;
                pzb pzbVar2 = (pzb) obj5;
                pzbVar2.b.l(1049);
                return pzbVar2.r(pzbVar2.d.i(pvlVar2), new pyg(obj5, 2));
            case 2:
                return ((pzb) this.a).j.c(((pvc) this.b).d);
            case 3:
                pvc pvcVar2 = (pvc) ske.U(this.a);
                if (pvcVar2 == null) {
                    return syq.a;
                }
                Object obj6 = this.b;
                suv suvVarW = pzb.w(pvcVar2);
                pvb pvbVar = pvcVar2.c;
                if (pvbVar == null) {
                    pvbVar = pvb.a;
                }
                pzb pzbVar3 = (pzb) obj6;
                pzbVar3.b.i(suvVarW, pvbVar.g);
                return pzbVar3.j.a(sbp.l(pvcVar2));
            case 4:
                pvc pvcVar3 = (pvc) obj;
                if (pvcVar3 != null) {
                    ((AtomicReference) this.a).set(pvcVar3);
                    return ske.M(pvcVar3);
                }
                Object obj7 = this.b;
                tfm tfmVarA = pul.a();
                tfmVarA.b = puk.GROUP_NOT_FOUND_ERROR;
                tfmVarA.c = "Nothing to download for file group: ".concat(String.valueOf(((pvl) obj7).c));
                return ske.L(tfmVarA.c());
            case 5:
                pvc pvcVar4 = (pvc) this.b;
                return qsp.af(pvcVar4) ? ((pzb) this.a).d(pvcVar4) : syq.a;
            case 6:
                if (((Boolean) obj).booleanValue()) {
                    tfm tfmVarA2 = pul.a();
                    puk pukVar = puk.CUSTOM_FILEGROUP_VALIDATION_FAILED;
                    tfmVarA2.b = pukVar;
                    tfmVarA2.c = pukVar.name();
                    return ske.L(tfmVarA2.c());
                }
                Object obj8 = this.b;
                Object obj9 = this.a;
                pvl pvlVar3 = (pvl) obj8;
                qbu.e("%s: Failed to remove pending version for group: '%s'; account: '%s'", "FileGroupManager", pvlVar3.c, pvlVar3.e);
                ((pzb) obj9).b.l(1036);
                return ske.L(new IOException("Failed to remove pending group: ".concat(String.valueOf(pvlVar3.c))));
            case 7:
                String str5 = ((pvc) this.b).d;
                pzb pzbVar4 = (pzb) this.a;
                return pzbVar4.q(pzbVar4.j.c(str5), new pyb((pza) obj, 4));
            case 8:
                pvc pvcVar5 = (pvc) obj;
                if (pvcVar5 != null) {
                    return this.a.a(new qao((pvl) this.b, pvcVar5));
                }
                return syq.a;
            case 9:
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) obj).iterator();
                while (true) {
                    Object obj10 = this.b;
                    if (!it.hasNext()) {
                        return qsp.N(arrayList).f(new ire(13), ((pzb) obj10).g);
                    }
                    pvl pvlVar4 = (pvl) it.next();
                    if (!pvlVar4.f) {
                        pzb pzbVar5 = (pzb) obj10;
                        arrayList.add(pzbVar5.r(pzbVar5.g(pvlVar4, false), new pyu(obj10, pvlVar4, this.a, 6)));
                    }
                }
            case 10:
                if (!((Boolean) obj).booleanValue()) {
                    pzb.B(1036, ((pzb) this.a).b, (pvc) this.b);
                }
                return syq.a;
            case 11:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Object obj11 = this.b;
                Object obj12 = this.a;
                if (zBooleanValue) {
                    ((pzb) obj12).b.p(pzb.w((pvc) obj11), 3);
                    return syq.a;
                }
                qdp qdpVarE = qdp.e(((pzb) obj12).d((pvc) obj11));
                byte[] bArr = null;
                kjl kjlVar = new kjl(obj12, obj11, 19, bArr);
                sxo sxoVar = sxo.a;
                return qdpVarE.d(pul.class, kjlVar, sxoVar).g(new kjl(obj12, obj11, i, bArr), sxoVar);
            case 12:
                return ((pze) this.b).o((qcs) this.a, (qcs) obj, 1087);
            case 13:
                Object obj13 = this.b;
                pze pzeVar = (pze) obj13;
                return qsz.n(pzeVar.n(pzeVar.a.c()), new pyu(obj13, (qcs) obj, (Comparator) this.a, 8), pzeVar.b);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return ((pze) this.b).o((qcs) this.a, (qcs) obj, 1094);
            case 15:
                return ((pze) this.b).o((qcs) this.a, (qcs) obj, 1098);
            case 16:
                return ((pze) this.b).o((qcs) this.a, (qcs) obj, 1096);
            case 17:
                Object obj14 = this.b;
                pze pzeVar2 = (pze) obj14;
                return qsz.n(pzeVar2.n(pzeVar2.a.m(this.a)), new pyn(obj14, (qcs) obj, i), pzeVar2.b);
            case 18:
                return ((pze) this.b).o((qcs) this.a, (qcs) obj, 1095);
            case 19:
                return ((pze) this.b).o((qcs) this.a, (qcs) obj, 1088);
            default:
                return ((pze) this.b).o((qcs) this.a, (qcs) obj, 1097);
        }
    }

    public /* synthetic */ pyn(Object obj, tph tphVar, int i) {
        this.c = i;
        this.a = obj;
        this.b = tphVar;
    }
}
