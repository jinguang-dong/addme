package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class fat {
    private final Map a = new LinkedHashMap(100, 0.75f, true);
    private final long b;
    private long c;

    public fat(long j) {
        this.b = j;
    }

    protected int a(Object obj) {
        return 1;
    }

    public final void e() {
        j(0L);
    }

    public final synchronized long f() {
        return this.b;
    }

    public final synchronized Object g(Object obj) {
        qev qevVar = (qev) this.a.get(obj);
        if (qevVar == null) {
            return null;
        }
        return qevVar.b;
    }

    public final synchronized Object h(Object obj, Object obj2) {
        int iA = a(obj2);
        long j = iA;
        long j2 = this.b;
        if (j >= j2) {
            c(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.c += j;
        }
        qev qevVar = (qev) this.a.put(obj, obj2 == null ? null : new qev(obj2, iA));
        if (qevVar != null) {
            this.c -= qevVar.a;
            Object obj3 = qevVar.b;
            if (!obj3.equals(obj2)) {
                c(obj, obj3);
            }
        }
        j(j2);
        if (qevVar != null) {
            return qevVar.b;
        }
        return null;
    }

    public final synchronized Object i(Object obj) {
        qev qevVar = (qev) this.a.remove(obj);
        if (qevVar == null) {
            return null;
        }
        this.c -= qevVar.a;
        return qevVar.b;
    }

    public final synchronized void j(long j) {
        while (this.c > j) {
            Iterator it = this.a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            qev qevVar = (qev) entry.getValue();
            this.c -= qevVar.a;
            Object key = entry.getKey();
            it.remove();
            c(key, qevVar.b);
        }
    }

    protected void c(Object obj, Object obj2) {
    }
}
