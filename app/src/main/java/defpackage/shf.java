package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class shf {
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    protected shf() {
    }

    protected abstract Object a();

    public final Object b(she sheVar, sij sijVar) {
        ConcurrentHashMap concurrentHashMap = this.a;
        Object obj = concurrentHashMap.get(sheVar);
        if (obj != null) {
            return obj;
        }
        Object objA = a();
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(sheVar, objA);
        if (objPutIfAbsent != null) {
            return objPutIfAbsent;
        }
        int i = ((sgz) sijVar).b;
        pev pevVar = null;
        for (int i2 = 0; i2 < i; i2++) {
            if (sgy.f.equals(sijVar.c(i2))) {
                Object objE = sijVar.e(i2);
                if (objE instanceof shj) {
                    if (pevVar == null) {
                        pevVar = new pev(this, sheVar, 18);
                    }
                    ((shj) objE).a();
                }
            }
        }
        return objA;
    }
}
