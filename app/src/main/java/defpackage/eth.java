package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class eth {
    private final etg a = new etg(null);
    private final Map b = new HashMap();

    private static void d(etg etgVar) {
        etg etgVar2 = etgVar.d;
        etgVar2.c = etgVar.c;
        etgVar.c.d = etgVar2;
    }

    private static void e(etg etgVar) {
        etgVar.c.d = etgVar;
        etgVar.d.c = etgVar;
    }

    public final Object a(eto etoVar) {
        Map map = this.b;
        etg etgVar = (etg) map.get(etoVar);
        if (etgVar == null) {
            etgVar = new etg(etoVar);
            map.put(etoVar, etgVar);
        } else {
            etoVar.a();
        }
        d(etgVar);
        etg etgVar2 = this.a;
        etgVar.d = etgVar2;
        etgVar.c = etgVar2.c;
        e(etgVar);
        return etgVar.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [eto, java.lang.Object] */
    public final Object b() {
        etg etgVar = this.a;
        for (etg etgVar2 = etgVar.d; !etgVar2.equals(etgVar); etgVar2 = etgVar2.d) {
            Object objB = etgVar2.b();
            if (objB != null) {
                return objB;
            }
            d(etgVar2);
            Map map = this.b;
            ?? r3 = etgVar2.a;
            map.remove(r3);
            r3.a();
        }
        return null;
    }

    public final void c(eto etoVar, Object obj) {
        Map map = this.b;
        etg etgVar = (etg) map.get(etoVar);
        if (etgVar == null) {
            etgVar = new etg(etoVar);
            d(etgVar);
            etg etgVar2 = this.a;
            etgVar.d = etgVar2.d;
            etgVar.c = etgVar2;
            e(etgVar);
            map.put(etoVar, etgVar);
        } else {
            etoVar.a();
        }
        if (etgVar.b == null) {
            etgVar.b = new ArrayList();
        }
        etgVar.b.add(obj);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        etg etgVar = this.a;
        etg etgVar2 = etgVar.c;
        boolean z = false;
        while (!etgVar2.equals(etgVar)) {
            sb.append('{');
            sb.append(etgVar2.a);
            sb.append(':');
            sb.append(etgVar2.a());
            sb.append("}, ");
            etgVar2 = etgVar2.c;
            z = true;
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
