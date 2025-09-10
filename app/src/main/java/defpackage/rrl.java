package defpackage;

import android.net.Uri;
import com.google.android.apps.camera.autotimer.analysis.jni.wVCD.HHdu;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class rrl implements sxi {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ rrl(Object obj, int i, int i2) {
        this.c = i2;
        this.b = obj;
        this.a = i;
    }

    @Override // defpackage.sxi
    public final syu a(Object obj) {
        if (this.c == 0) {
            return ((rrp) this.b).d(this.a);
        }
        final qcl qclVar = (qcl) this.b;
        pzc pzcVar = qclVar.a;
        final List list = (List) obj;
        final int i = this.a;
        return qsz.n(pzcVar.e(), new sxi() { // from class: qcf
            @Override // defpackage.sxi
            public final syu a(Object obj2) {
                HashMap map;
                Set setB;
                List<pvc> list2 = (List) obj2;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((qao) it.next());
                }
                for (pvc pvcVar : list2) {
                    tpc tpcVarM = pvl.a.m();
                    String str = pvcVar.d;
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    pvl pvlVar = (pvl) tpcVarM.b;
                    str.getClass();
                    pvlVar.b = 1 | pvlVar.b;
                    pvlVar.c = str;
                    if (pvcVar.e.isEmpty()) {
                        if (!tpcVarM.b.C()) {
                            tpcVarM.o();
                        }
                        pvl pvlVar2 = (pvl) tpcVarM.b;
                        pvlVar2.b |= 2;
                        pvlVar2.d = HHdu.qNDObXX;
                    } else {
                        String str2 = pvcVar.e;
                        if (!tpcVarM.b.C()) {
                            tpcVarM.o();
                        }
                        pvl pvlVar3 = (pvl) tpcVarM.b;
                        str2.getClass();
                        pvlVar3.b |= 2;
                        pvlVar3.d = str2;
                    }
                    arrayList.add(new qao((pvl) tpcVarM.l(), pvcVar));
                }
                final HashMap map2 = new HashMap();
                HashMap map3 = new HashMap();
                HashMap map4 = new HashMap();
                final HashMap map5 = new HashMap();
                final HashSet hashSet = new HashSet();
                final AtomicLong atomicLong = new AtomicLong(0L);
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i2 = 0;
                while (true) {
                    final qcl qclVar2 = qclVar;
                    if (i2 >= size) {
                        final int i3 = i;
                        return qsp.N(arrayList2).f(new Callable() { // from class: qch
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                tpc tpcVarM2 = svk.a.m();
                                Map map6 = map2;
                                qcl qclVar3 = qclVar2;
                                for (String str3 : map6.keySet()) {
                                    qck qckVar = (qck) map6.get(str3);
                                    List listF = rwr.c("|").f(str3);
                                    tpc tpcVarM3 = suv.a.m();
                                    String str4 = (String) listF.get(0);
                                    if (!tpcVarM3.b.C()) {
                                        tpcVarM3.o();
                                    }
                                    suv suvVar = (suv) tpcVarM3.b;
                                    str4.getClass();
                                    suvVar.b |= 1;
                                    suvVar.c = str4;
                                    String str5 = (String) listF.get(1);
                                    if (!tpcVarM3.b.C()) {
                                        tpcVarM3.o();
                                    }
                                    tph tphVar = tpcVarM3.b;
                                    suv suvVar2 = (suv) tphVar;
                                    str5.getClass();
                                    suvVar2.b |= 4;
                                    suvVar2.e = str5;
                                    int i4 = qckVar.e;
                                    if (!tphVar.C()) {
                                        tpcVarM3.o();
                                    }
                                    tph tphVar2 = tpcVarM3.b;
                                    suv suvVar3 = (suv) tphVar2;
                                    suvVar3.b |= 8;
                                    suvVar3.f = i4;
                                    int i5 = qckVar.f;
                                    if (!tphVar2.C()) {
                                        tpcVarM3.o();
                                    }
                                    Map map7 = map5;
                                    suv suvVar4 = (suv) tpcVarM3.b;
                                    suvVar4.b |= 16;
                                    suvVar4.g = i5;
                                    pvc pvcVar2 = (pvc) map7.get(str3);
                                    if (pvcVar2 == null) {
                                        if (!tpcVarM3.b.C()) {
                                            tpcVarM3.o();
                                        }
                                        suv suvVar5 = (suv) tpcVarM3.b;
                                        suvVar5.b |= 2;
                                        suvVar5.d = -1;
                                    } else {
                                        int i6 = pvcVar2.f;
                                        if (!tpcVarM3.b.C()) {
                                            tpcVarM3.o();
                                        }
                                        tph tphVar3 = tpcVarM3.b;
                                        suv suvVar6 = (suv) tphVar3;
                                        suvVar6.b = 2 | suvVar6.b;
                                        suvVar6.d = i6;
                                        long j = pvcVar2.s;
                                        if (!tphVar3.C()) {
                                            tpcVarM3.o();
                                        }
                                        tph tphVar4 = tpcVarM3.b;
                                        suv suvVar7 = (suv) tphVar4;
                                        suvVar7.b |= 64;
                                        suvVar7.i = j;
                                        String str6 = pvcVar2.t;
                                        if (!tphVar4.C()) {
                                            tpcVarM3.o();
                                        }
                                        suv suvVar8 = (suv) tpcVarM3.b;
                                        str6.getClass();
                                        suvVar8.b |= 128;
                                        suvVar8.j = str6;
                                    }
                                    suv suvVar9 = (suv) tpcVarM3.l();
                                    if (!tpcVarM2.b.C()) {
                                        tpcVarM2.o();
                                    }
                                    svk svkVar = (svk) tpcVarM2.b;
                                    suvVar9.getClass();
                                    tpw tpwVar = svkVar.c;
                                    if (!tpwVar.c()) {
                                        svkVar.c = tph.v(tpwVar);
                                    }
                                    svkVar.c.add(suvVar9);
                                    long j2 = qckVar.a;
                                    if (!tpcVarM2.b.C()) {
                                        tpcVarM2.o();
                                    }
                                    svk svkVar2 = (svk) tpcVarM2.b;
                                    tpq tpqVar = svkVar2.d;
                                    if (!tpqVar.c()) {
                                        svkVar2.d = tph.u(tpqVar);
                                    }
                                    svkVar2.d.f(j2);
                                    long j3 = qckVar.b;
                                    if (!tpcVarM2.b.C()) {
                                        tpcVarM2.o();
                                    }
                                    svk svkVar3 = (svk) tpcVarM2.b;
                                    tpq tpqVar2 = svkVar3.e;
                                    if (!tpqVar2.c()) {
                                        svkVar3.e = tph.u(tpqVar2);
                                    }
                                    svkVar3.e.f(j3);
                                    long j4 = qckVar.c;
                                    if (!tpcVarM2.b.C()) {
                                        tpcVarM2.o();
                                    }
                                    svk svkVar4 = (svk) tpcVarM2.b;
                                    tpq tpqVar3 = svkVar4.f;
                                    if (!tpqVar3.c()) {
                                        svkVar4.f = tph.u(tpqVar3);
                                    }
                                    svkVar4.f.f(j4);
                                    long j5 = qckVar.d;
                                    if (!tpcVarM2.b.C()) {
                                        tpcVarM2.o();
                                    }
                                    svk svkVar5 = (svk) tpcVarM2.b;
                                    tpq tpqVar4 = svkVar5.g;
                                    if (!tpqVar4.c()) {
                                        svkVar5.g = tph.u(tpqVar4);
                                    }
                                    svkVar5.g.f(j5);
                                }
                                long j6 = atomicLong.get();
                                if (!tpcVarM2.b.C()) {
                                    tpcVarM2.o();
                                }
                                svk svkVar6 = (svk) tpcVarM2.b;
                                svkVar6.b = 1 | svkVar6.b;
                                svkVar6.h = j6;
                                long jLongValue = 0;
                                try {
                                    Uri uriAi = qsp.ai(qclVar3.d, qclVar3.f);
                                    lat latVar = qclVar3.h;
                                    if (latVar.r(uriAi)) {
                                        jLongValue = ((Long) latVar.m(uriAi, new rdk(2))).longValue();
                                    }
                                } catch (IOException e) {
                                    qbu.g(e, "%s: Failed to call Mobstore to compute MDD Directory bytes used!", "StorageLogger");
                                    qclVar3.e.a();
                                }
                                if (!tpcVarM2.b.C()) {
                                    tpcVarM2.o();
                                }
                                tph tphVar5 = tpcVarM2.b;
                                svk svkVar7 = (svk) tphVar5;
                                svkVar7.b |= 2;
                                svkVar7.i = jLongValue;
                                if (!tphVar5.C()) {
                                    tpcVarM2.o();
                                }
                                int i7 = i3;
                                svk svkVar8 = (svk) tpcVarM2.b;
                                svkVar8.b |= 4;
                                svkVar8.j = i7;
                                return (svk) tpcVarM2.l();
                            }
                        }, qclVar2.g);
                    }
                    qao qaoVar = (qao) arrayList.get(i2);
                    pvl pvlVar4 = qaoVar.a;
                    Set setB2 = qcl.b(map3, qcl.a(pvlVar4));
                    String strA = qcl.a(pvlVar4);
                    final qck qckVar = (qck) map2.get(strA);
                    if (qckVar == null) {
                        map = map3;
                        map2.put(strA, new qck());
                        qckVar = (qck) map2.get(strA);
                    } else {
                        map = map3;
                    }
                    if (pvlVar4.f) {
                        setB = qcl.b(map4, qcl.a(pvlVar4));
                        map5.put(qcl.a(pvlVar4), qaoVar.b);
                    } else {
                        setB = null;
                    }
                    final Set set = setB;
                    pvc pvcVar2 = qaoVar.b;
                    int size2 = pvcVar2.o.size();
                    for (pva pvaVar : pvcVar2.o) {
                        final boolean zAe = qsp.ae(pvaVar);
                        ArrayList arrayList3 = arrayList;
                        int iAx = a.ax(pvcVar2.j);
                        if (iAx == 0) {
                            iAx = 1;
                        }
                        final pvp pvpVarAt = qsp.at(pvaVar, iAx);
                        qdp qdpVarE = qdp.e(qclVar2.b.d(pvpVarAt));
                        pvc pvcVar3 = pvcVar2;
                        qci qciVar = new qci(0);
                        Executor executor = qclVar2.g;
                        HashMap map6 = map4;
                        qdp qdpVarF = qdpVarE.d(qah.class, qciVar, executor).f(new qcj(qclVar2, 0), executor);
                        qcl qclVar3 = qclVar2;
                        final AtomicLong atomicLong2 = atomicLong;
                        final qao qaoVar2 = qaoVar;
                        final Set set2 = setB2;
                        arrayList2.add(qsz.m(qdpVarF, new rvu() { // from class: qcg
                            @Override // defpackage.rvu
                            public final Object apply(Object obj3) {
                                Long l = (Long) obj3;
                                Set set3 = hashSet;
                                pvp pvpVar = pvpVarAt;
                                if (!set3.contains(pvpVar)) {
                                    atomicLong2.getAndAdd(l.longValue());
                                    set3.add(pvpVar);
                                }
                                qck qckVar2 = qckVar;
                                boolean z = zAe;
                                Set set4 = set2;
                                if (!set4.contains(pvpVar)) {
                                    if (z) {
                                        qckVar2.b += l.longValue();
                                    }
                                    qckVar2.a += l.longValue();
                                    set4.add(pvpVar);
                                }
                                if (!qaoVar2.a.f) {
                                    return null;
                                }
                                Set set5 = set;
                                set5.getClass();
                                if (set5.contains(pvpVar)) {
                                    return null;
                                }
                                if (z) {
                                    qckVar2.d += l.longValue();
                                    qckVar2.f++;
                                }
                                qckVar2.c += l.longValue();
                                set5.add(pvpVar);
                                return null;
                            }
                        }, executor));
                        atomicLong = atomicLong2;
                        arrayList = arrayList3;
                        pvcVar2 = pvcVar3;
                        qclVar2 = qclVar3;
                        i2 = i2;
                        setB2 = set2;
                        qaoVar = qaoVar2;
                        map4 = map6;
                    }
                    qckVar.e = size2;
                    i2++;
                    map3 = map;
                }
            }
        }, qclVar.g);
    }
}
