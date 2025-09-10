package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qbo implements qbj {
    public final pup a;
    public final Executor b;
    private final puu c;
    private final pzc d;

    public qbo(puu puuVar, pup pupVar, pzc pzcVar, Executor executor) {
        this.c = puuVar;
        this.a = pupVar;
        this.d = pzcVar;
        this.b = executor;
    }

    public static final Set f(Map map, qbn qbnVar) {
        if (!map.containsKey(qbnVar)) {
            map.put(qbnVar, new HashSet());
        }
        return (Set) map.get(qbnVar);
    }

    public static boolean h(pvc pvcVar, String str) {
        return str.equals(pvcVar.d) && (pvcVar.b & 131072) != 0;
    }

    public static final qbn i(pvc pvcVar) {
        return new qbn(Long.valueOf(pvcVar.s));
    }

    private final sbp j() {
        int i = sbp.d;
        sbk sbkVar = new sbk();
        pup pupVar = this.a;
        if (pupVar.a().h()) {
            sbkVar.h((String) pupVar.a().c());
        }
        if (pupVar.b().h()) {
            sbkVar.h((String) pupVar.b().c());
        }
        sbkVar.h("ICING");
        return sbkVar.g();
    }

    @Override // defpackage.qbj
    public final syu a(Collection collection) {
        pzu pzuVar = new pzu(this, 9);
        collection.getClass();
        return qsp.N(new scz(collection, pzuVar)).f(new qbl(0), this.b);
    }

    @Override // defpackage.qbj
    public final syu b(String str) {
        pup pupVar = this.a;
        sbp sbpVarJ = j();
        int[] iArr = new int[0];
        qqe qqeVarC = pupVar.c();
        ArrayList arrayList = new ArrayList();
        int i = ((sex) sbpVarJ).c;
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(qqeVarC.c(iArr, str, (String) sbpVarJ.get(i2)));
        }
        return qsp.N(arrayList).f(new qbl(2), this.b);
    }

    @Override // defpackage.qbj
    public final syu c(String str) {
        if (!g()) {
            return syq.a;
        }
        syu syuVarD = d(str);
        pzw pzwVar = new pzw(6);
        Executor executor = this.b;
        int i = 8;
        return qsp.O(qsz.n(qsz.m(syuVarD, pzwVar, executor), new qaz(this, i), executor), qsz.n(qsz.m(qsz.m(this.d.e(), new pzu(str, 11), executor), new pzw(5), executor), new qaz(this, i), executor)).f(new ire(20), executor);
    }

    public final syu d(String str) {
        return qsz.m(this.d.c(), new pzu(str, 10), this.b);
    }

    public final syu e(Map map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            qbn qbnVar = (qbn) entry.getKey();
            qbo qboVar = this;
            arrayList.addAll(ujp.aG(this.j(), new irm(qboVar, ske.ai((Set) entry.getValue()), qbnVar, 6, null)));
            this = qboVar;
        }
        return qsp.P(arrayList).f(new qbl(1), sxo.a);
    }

    public final boolean g() {
        return this.c.F();
    }
}
