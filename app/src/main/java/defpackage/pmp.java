package defpackage;

import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pmp implements pmx {
    private long a = 0;

    @Override // defpackage.pmx
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        this.a += ((Long) obj).longValue();
    }

    @Override // defpackage.pmx
    public final void b(sxy sxyVar, Object[] objArr) {
        long j = this.a;
        Object obj = sxyVar.b;
        obj.getClass();
        pmr pmrVarA = pmr.a(objArr);
        TreeMap treeMap = (TreeMap) ((qas) obj).a;
        Object pndVar = (pnf) treeMap.get(pmrVarA);
        if (pndVar == null) {
            pndVar = new pnd();
            treeMap.put(pmrVarA, pndVar);
        }
        ((pnd) pndVar).a += j;
    }
}
