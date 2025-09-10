package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class etl {
    private final eth a;
    private final etk b;
    private final Map c;
    private final Map d;
    private final int e;
    private int f;

    public etl() {
        this.a = new eth();
        this.b = new etk();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = 4194304;
    }

    private final etc f(Class cls) {
        eti etiVar;
        Map map = this.d;
        etc etcVar = (etc) map.get(cls);
        if (etcVar != null) {
            return etcVar;
        }
        if (cls.equals(int[].class)) {
            etiVar = new eti(0);
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: ".concat(String.valueOf(cls.getSimpleName())));
            }
            etiVar = new eti(1);
        }
        map.put(cls, etiVar);
        return etiVar;
    }

    private final Object g(etj etjVar, Class cls) {
        eth ethVar = this.a;
        etc etcVarF = f(cls);
        Object objA = ethVar.a(etjVar);
        if (objA != null) {
            this.f -= etcVarF.a(objA) * etcVarF.b();
            i(etcVarF.a(objA), cls);
        }
        return objA == null ? etcVarF.c(etjVar.a) : objA;
    }

    private final NavigableMap h(Class cls) {
        Map map = this.c;
        NavigableMap navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    private final void i(int i, Class cls) {
        NavigableMap navigableMapH = h(cls);
        Integer numValueOf = Integer.valueOf(i);
        Integer num = (Integer) navigableMapH.get(numValueOf);
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapH.remove(numValueOf);
                return;
            } else {
                navigableMapH.put(numValueOf, Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + toString());
    }

    private final void j(int i) {
        while (this.f > i) {
            Object objB = this.a.b();
            eoz.k(objB);
            etc etcVarF = f(objB.getClass());
            this.f -= etcVarF.a(objB) * etcVarF.b();
            i(etcVarF.a(objB), objB.getClass());
        }
    }

    public final synchronized Object a(int i, Class cls) {
        Integer num;
        int i2;
        num = (Integer) h(cls).ceilingKey(Integer.valueOf(i));
        return g((num == null || ((i2 = this.f) != 0 && this.e / i2 < 2 && num.intValue() > i * 8)) ? this.b.d(i, cls) : this.b.d(num.intValue(), cls), cls);
    }

    public final synchronized void b() {
        j(0);
    }

    public final synchronized void c(Object obj) {
        Class<?> cls = obj.getClass();
        etc etcVarF = f(cls);
        int iA = etcVarF.a(obj);
        int iB = etcVarF.b() * iA;
        int i = this.e;
        if (iB <= (i >> 1)) {
            etj etjVarD = this.b.d(iA, cls);
            this.a.c(etjVarD, obj);
            NavigableMap navigableMapH = h(cls);
            Integer num = (Integer) navigableMapH.get(Integer.valueOf(etjVarD.a));
            Integer numValueOf = Integer.valueOf(etjVarD.a);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapH.put(numValueOf, Integer.valueOf(iIntValue));
            this.f += iB;
            j(i);
        }
    }

    public final synchronized void d(int i) {
        if (i >= 40) {
            b();
        } else if (i >= 20 || i == 15) {
            j(this.e >> 1);
        }
    }

    public final synchronized Object e(Class cls) {
        return g(this.b.d(8, cls), cls);
    }

    public etl(int i) {
        this.a = new eth();
        this.b = new etk();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = i;
    }
}
