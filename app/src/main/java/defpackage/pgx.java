package defpackage;

import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.rectiface.Iqz.mPfBwqXsnpXI;
import j$.util.Collection;
import j$.util.Comparator$CC;
import j$.util.List;
import j$.util.Map;
import j$.util.Optional;
import j$.util.stream.Collector;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pgx {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public pgx(uem uemVar, uem uemVar2, uem uemVar3, uem uemVar4, uem uemVar5, uem uemVar6, uem uemVar7, uem uemVar8) {
        this.a = uemVar;
        this.b = uemVar2;
        this.c = uemVar3;
        this.d = uemVar4;
        this.e = uemVar5;
        this.f = uemVar6;
        this.g = uemVar7;
        this.h = uemVar8;
    }

    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, tzj] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    private final synchronized int f(List list) {
        ArrayList arrayList;
        int size = list.size() - ((jzq) this.d).b();
        int i = 0;
        if (size <= 0) {
            return 0;
        }
        ArrayList arrayList2 = new ArrayList(list.subList(0, size));
        List list2 = (List) Collection.EL.stream(arrayList2).map(new idh(this, 11)).collect(Collectors.toList());
        AmbientMode.AmbientController ambientController = (AmbientMode.AmbientController) this.b.a();
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            pdo pdoVarB = ((phc) arrayList2.get(i2)).b();
            if (pdoVarB != null) {
                Long lValueOf = Long.valueOf(pdoVarB.b);
                if (!ambientController.e(seo.e(lValueOf, lValueOf))) {
                    list2.remove(i2);
                    this.g.addAll(list2);
                    return i2;
                }
                if (ambientController.f(seo.e(lValueOf, lValueOf))) {
                    list2.remove(i2);
                    this.g.addAll(list2);
                    return i2;
                }
            }
        }
        Stream map = Collection.EL.stream(list2).map(new kwj(1));
        int i3 = sbp.d;
        Collector collector = ryv.a;
        List list3 = (List) map.collect(collector);
        Object obj = this.a;
        ArrayList arrayList3 = new ArrayList();
        ?? r7 = ((mwq) obj).a;
        if (r7.isEmpty()) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList((java.util.Collection) r7);
        }
        arrayList.addAll(list3);
        Map mapQ = mwq.q(arrayList);
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            Map mapQ2 = mwq.q((sbp) Collection.EL.stream(arrayList).filter(new jjj((lnx) it.next(), 17)).collect(collector));
            int i4 = i;
            float fFloatValue = 0.0f;
            for (Long l : mapQ.keySet()) {
                i4++;
                fFloatValue += ((Float) mapQ.get(l)).floatValue() - ((Float) Map.EL.getOrDefault(mapQ2, l, Float.valueOf(0.0f))).floatValue();
            }
            arrayList3.add(Float.valueOf(fFloatValue / i4));
            i = 0;
        }
        int iIndexOf = arrayList3.indexOf(Collections.min(arrayList3));
        Object obj2 = ((mwq) obj).b;
        if (!((Optional) obj2).isEmpty()) {
            HashSet hashSet = new HashSet();
            for (int i5 = 0; i5 < list3.size(); i5++) {
                if (i5 != iIndexOf) {
                    rwc rwcVar = ((lnx) list3.get(i5)).p;
                    if (rwcVar.h()) {
                        sbp sbpVarA = ((loi) rwcVar.c()).a();
                        int i6 = ((sex) sbpVarA).c;
                        for (int i7 = 0; i7 < i6; i7++) {
                            loh lohVar = (loh) sbpVarA.get(i7);
                            if (lohVar.a() > 0.3f) {
                                hashSet.add(Long.valueOf(lohVar.a));
                            }
                        }
                    }
                }
            }
            ((owq) ((Optional) obj2).get()).a(hashSet);
        }
        int iIndexOf2 = arrayList3.indexOf(Collections.min(arrayList3));
        arrayList3.toArray();
        list2.remove(iIndexOf2);
        this.g.addAll(list2);
        return iIndexOf2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Queue] */
    private final synchronized rwc g(List list) {
        ?? r0 = this.h;
        if (!r0.isEmpty()) {
            long jLongValue = ((Long) r0.remove()).longValue();
            for (int i = 0; i < list.size(); i++) {
                pdo pdoVarB = ((phc) list.get(i)).b();
                if (pdoVarB != null && pdoVarB.b == jLongValue) {
                    return rwc.j(Integer.valueOf(i));
                }
            }
        }
        return rvk.a;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, pbn] */
    public final synchronized int a(List list) {
        int iB;
        pbm pbmVar = new pbm(this.f, toString().concat("#select"));
        try {
            iB = b(list);
            pbmVar.close();
        } finally {
        }
        return iB;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, lny] */
    public final jyf c(long j) {
        lnx lnxVarA = this.c.a(j);
        if (lnxVarA == null) {
            rvk rvkVar = rvk.a;
            lnxVarA = new lnx(j, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, false, rvkVar, rvkVar, rvkVar);
        }
        return new jyf(lnxVarA);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public final synchronized List d() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            arrayList.add(new jye((jyf) it.next(), 0));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Queue] */
    public final synchronized void e(long j) {
        this.h.add(Long.valueOf(j));
    }

    public pgx(lny lnyVar, pbn pbnVar, tzj tzjVar, kan kanVar, jzq jzqVar, mwq mwqVar) {
        this.g = new ArrayList();
        this.h = new ArrayDeque();
        this.e = kanVar;
        this.b = tzjVar;
        this.c = lnyVar;
        this.d = jzqVar;
        this.a = mwqVar;
        gzi gziVar = gzq.a;
        this.f = pbnVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, pbn] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, tzj] */
    public final synchronized int b(List list) {
        ?? r0 = this.f;
        r0.f("selectToFlush#selectForceFlush");
        rwc rwcVarG = g(list);
        r0.g();
        if (rwcVarG.h()) {
            return ((Integer) rwcVarG.c()).intValue();
        }
        ?? r2 = this.g;
        r2.clear();
        ArrayList arrayList = new ArrayList(list);
        List.EL.sort(arrayList, Comparator$CC.comparingLong(new jyd(0)));
        sbp sbpVarJ = sbp.j(arrayList);
        r0.f("selectToFlush#statusCheck");
        int iA = ((kan) this.e).a();
        r0.g();
        if (iA == 1) {
            return 0;
        }
        int size = sbpVarJ.size();
        Object obj = this.d;
        int iB = ((jzq) obj).b() + ((jzq) obj).a();
        AtomicReference atomicReference = ((jzq) obj).a;
        int iB2 = ((jzq) obj).b();
        if (((kbl) atomicReference.get()) == kbl.GROUPSHOT_MODE) {
            r0.f("selectToFLush#forGroupPhotoMode");
            int iF = f(list);
            r0.g();
            return iF;
        }
        if (size < iB) {
            iB2 = Math.max(1, size - ((jzq) obj).a());
        }
        pdo pdoVarB = ((phc) sbpVarJ.get(sbpVarJ.size() - 1)).b();
        pdoVarB.getClass();
        int iMax = Math.max(sbpVarJ.size() - iB2, 0);
        pdo pdoVarB2 = ((phc) sbpVarJ.get(iMax)).b();
        pdoVarB2.getClass();
        seo seoVarE = seo.e(Long.valueOf(pdoVarB2.b), Long.valueOf(pdoVarB.b));
        HashMap map = new HashMap();
        r0.f("selectToFlush#qualityScores");
        for (int i = 0; i < sbpVarJ.size(); i++) {
            pdo pdoVarB3 = ((phc) sbpVarJ.get(i)).b();
            pdoVarB3.getClass();
            jyf jyfVarC = c(pdoVarB3.b);
            map.put((phc) sbpVarJ.get(i), jyfVarC);
            r2.add(jyfVarC);
        }
        r0.h("selectToFlush#diversityScores");
        ArrayList<lnx> arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = r2.iterator();
        while (it.hasNext()) {
            lnx lnxVar = ((jyf) it.next()).a;
            if (seoVarE.a(Long.valueOf(lnxVar.a))) {
                arrayList3.add(Float.valueOf(0.0f));
            } else {
                arrayList2.add(lnxVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (lnx lnxVar2 : arrayList2) {
            float fBJ = qpt.bJ(lnxVar2, arrayList2) * 5.0E-4f;
            long j = lnxVar2.a;
            arrayList4.add(new lnw(fBJ, fBJ));
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            arrayList5.add(Float.valueOf(((lnw) it2.next()).b));
        }
        arrayList5.addAll(arrayList3);
        r0.h("selectToFlush#getMomentsProcessingStatus");
        AmbientMode.AmbientController ambientController = (AmbientMode.AmbientController) this.b.a();
        r0.h("selectToFlush#keepAroundScoring");
        for (int i2 = 0; i2 < r2.size(); i2++) {
            jyf jyfVar = (jyf) r2.get(i2);
            Long lValueOf = Long.valueOf(jyfVar.a.a);
            float f = true != ambientController.f(seo.e(lValueOf, lValueOf)) ? 0.0f : -1000.0f;
            if (!ambientController.e(seo.e(lValueOf, lValueOf))) {
                f -= 1000.0f;
            }
            jyfVar.b += ((Float) arrayList5.get(i2)).floatValue() + f;
            jyfVar.c += f;
        }
        r0.h(mPfBwqXsnpXI.hhaeCjJfJRKW);
        while (iMax < sbpVarJ.size()) {
            phc phcVar = (phc) sbpVarJ.get(iMax);
            if (map.containsKey(phcVar)) {
                ((jyf) map.get(phcVar)).b += 10000.0f;
            }
            iMax++;
        }
        r0.g();
        float f2 = Float.MAX_VALUE;
        int i3 = 0;
        for (int i4 = 0; i4 < sbpVarJ.size(); i4++) {
            jyf jyfVar2 = (jyf) map.get(sbpVarJ.get(i4));
            jyfVar2.getClass();
            float f3 = jyfVar2.b;
            if (f3 < f2) {
                i3 = i4;
            }
            if (f3 < f2) {
                f2 = f3;
            }
        }
        r2.remove(i3);
        return i3;
    }

    public pgx(uem uemVar, uem uemVar2, uem uemVar3, uem uemVar4, uem uemVar5, uem uemVar6, uem uemVar7, uem uemVar8, byte[] bArr) {
        uemVar.getClass();
        this.f = uemVar;
        uemVar2.getClass();
        this.c = uemVar2;
        uemVar3.getClass();
        this.e = uemVar3;
        uemVar4.getClass();
        this.b = uemVar4;
        uemVar5.getClass();
        this.g = uemVar5;
        uemVar6.getClass();
        this.a = uemVar6;
        uemVar7.getClass();
        this.d = uemVar7;
        uemVar8.getClass();
        this.h = uemVar8;
    }
}
