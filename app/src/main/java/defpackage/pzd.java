package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class pzd implements sxi {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ pzd(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v67, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r8v34, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // defpackage.sxi
    public final syu a(Object obj) {
        int i = 16;
        int i2 = 12;
        int i3 = 10;
        switch (this.c) {
            case 0:
                Object obj2 = this.a;
                pze pzeVar = (pze) obj2;
                return qsz.n(pzeVar.n(pzeVar.a.h((pvl) this.b)), new pzd(obj2, (qcs) obj, 8), pzeVar.b);
            case 1:
                Object obj3 = this.a;
                pze pzeVar2 = (pze) obj3;
                return qsz.n(pzeVar2.n(pzeVar2.a.i((pvl) this.b)), new pzd(obj3, (qcs) obj, 5), pzeVar2.b);
            case 2:
                Object obj4 = this.a;
                return ((pze) this.b).o((qcs) obj4, (qcs) obj, 1099);
            case 3:
                Object obj5 = this.b;
                pze pzeVar3 = (pze) obj5;
                return qsz.n(pzeVar3.n(pzeVar3.a.d()), new pyu(obj5, (qcs) obj, (Comparator) this.a, i3), pzeVar3.b);
            case 4:
                Object obj6 = this.b;
                pze pzeVar4 = (pze) obj6;
                return qsz.n(pzeVar4.n(pzeVar4.a.j(this.a)), new pyn(obj6, (qcs) obj, 14), pzeVar4.b);
            case 5:
                Object obj7 = this.a;
                return ((pze) this.b).o((qcs) obj7, (qcs) obj, 1089);
            case 6:
                Object obj8 = this.a;
                pze pzeVar5 = (pze) obj8;
                return qsz.n(pzeVar5.n(pzeVar5.a.g((pvl) this.b)), new pyn(obj8, (qcs) obj, i2), pzeVar5.b);
            case 7:
                Object obj9 = this.a;
                pze pzeVar6 = (pze) obj9;
                return qsz.n(pzeVar6.n(pzeVar6.a.a((pvc) this.b)), new pyn(obj9, (qcs) obj, i), pzeVar6.b);
            case 8:
                Object obj10 = this.a;
                return ((pze) this.b).o((qcs) obj10, (qcs) obj, 1090);
            case 9:
                Object obj11 = this.a;
                return ((pzh) this.b).i((qcs) obj11, (qcs) obj, 1101);
            case 10:
                Object obj12 = this.a;
                return ((pzh) this.b).i((qcs) obj12, (qcs) obj, 1102);
            case 11:
                Object obj13 = this.a;
                pzh pzhVar = (pzh) obj13;
                return qsz.n(pzhVar.b(pzhVar.c.e((pvp) this.b)), new pzd(obj13, (qcs) obj, i), pzhVar.d);
            case 12:
                List list = (List) obj;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (true) {
                    Object obj14 = this.b;
                    if (!it.hasNext()) {
                        pzh pzhVar2 = (pzh) obj14;
                        return qsp.N(arrayList).g(new pwf(pzhVar2, list, arrayList, (Boolean) this.a, 4), pzhVar2.d);
                    }
                    arrayList.add(((pzh) obj14).b.e((pvp) it.next()));
                }
            case 13:
                Object obj15 = this.b;
                pzh pzhVar3 = (pzh) obj15;
                return qsz.n(pzhVar3.b(pzhVar3.c.f((scn) this.a)), new pzd(obj15, (qcs) obj, 18), pzhVar3.d);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Object obj16 = this.a;
                return ((pzh) this.b).i((qcs) obj16, (qcs) obj, 1104);
            case 15:
                Object obj17 = this.a;
                pzh pzhVar4 = (pzh) obj17;
                return qsz.n(pzhVar4.b(pzhVar4.c.g((pvp) this.b)), new pzd(obj17, (qcs) obj, i3), pzhVar4.d);
            case 16:
                Object obj18 = this.a;
                return ((pzh) this.b).i((qcs) obj18, (qcs) obj, 1100);
            case 17:
                Object obj19 = this.b;
                pzh pzhVar5 = (pzh) obj19;
                return qsz.n(pzhVar5.b(pzhVar5.c.c()), new pyu(obj19, (qcs) obj, (Comparator) this.a, i2), pzhVar5.d);
            case 18:
                Object obj20 = this.a;
                return ((pzh) this.b).i((qcs) obj20, (qcs) obj, 1100);
            case 19:
                pzr pzrVar = (pzr) this.b;
                if (!pzrVar.m.T()) {
                    return syq.a;
                }
                Object obj21 = this.a;
                pzrVar.c.l(1032);
                pzb pzbVar = pzrVar.d;
                return pzbVar.r(pzbVar.d.d(), rsx.c(new pyn(pzbVar, obj21, 9)));
            default:
                if (((pza) obj) == pza.DOWNLOADED) {
                    ?? r8 = this.a;
                    Object obj22 = this.b;
                    pvc pvcVar = (pvc) ske.U(r8);
                    pvcVar.getClass();
                    ((pzr) obj22).c.m(1034, pvcVar.d, pvcVar.f, pvcVar.s, pvcVar.t);
                }
                return syq.a;
        }
    }

    public /* synthetic */ pzd(Object obj, tph tphVar, int i) {
        this.c = i;
        this.a = obj;
        this.b = tphVar;
    }
}
