package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xh implements AutoCloseable {
    private final xm a;
    private boolean c;
    private final Object b = new Object();
    private long d = 1;
    private long e = Long.MIN_VALUE;
    private long f = Long.MIN_VALUE;
    private long g = Long.MIN_VALUE;
    private long h = Long.MIN_VALUE;
    private final List i = new ArrayList();
    private final Map j = new LinkedHashMap();

    public /* synthetic */ xh(xm xmVar) {
        this.a = xmVar;
    }

    private final List d(boolean z, long j, long j2) {
        ArrayList arrayList = new ArrayList();
        List list = this.i;
        for (Object obj : list) {
            xg xgVar = (xg) obj;
            if (xgVar.a == z && xgVar.c < j && xgVar.d < j2) {
                arrayList.add(obj);
            }
        }
        list.removeAll(arrayList);
        return arrayList;
    }

    public final void a(long j) {
        synchronized (this.b) {
            if (this.c) {
                return;
            }
            this.g = j;
            List list = this.i;
            Iterator it = list.iterator();
            xg xgVar = null;
            boolean z = false;
            Object obj = null;
            while (true) {
                if (!it.hasNext()) {
                    if (!z) {
                        break;
                    }
                } else {
                    Object next = it.next();
                    if (a.q(((xg) next).b, j)) {
                        if (z) {
                            break;
                        }
                        z = true;
                        obj = next;
                    }
                }
            }
            obj = null;
            xg xgVar2 = (xg) obj;
            if (xgVar2 != null) {
                this.h = xgVar2.d;
                list.remove(xgVar2);
                xgVar = xgVar2;
            }
            if (xgVar != null) {
                xgVar.b(10);
            }
        }
    }

    public final void b(long j, Object obj) {
        xh xhVar;
        Object xiVar;
        List list;
        Object next;
        synchronized (this.b) {
            if (this.c || this.h == j) {
                xhVar = this;
                xiVar = new xi(obj);
            } else {
                List list2 = this.i;
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (((xg) next).d == j) {
                            break;
                        }
                    }
                }
                xg xgVar = (xg) next;
                if (xgVar != null) {
                    xhVar = this;
                    List listD = xhVar.d(xgVar.a, xgVar.c, xgVar.d);
                    xgVar.a(obj);
                    list2.remove(xgVar);
                    list = listD;
                    xiVar = null;
                } else {
                    xhVar = this;
                    Long lValueOf = Long.valueOf(j);
                    xi xiVar2 = new xi(obj);
                    Map map = xhVar.j;
                    map.put(lValueOf, xiVar2);
                    if (map.size() > 3) {
                        xiVar = map.remove(Long.valueOf(((Number) ske.bA(map.keySet())).longValue()));
                    } else {
                        xiVar = null;
                        list = null;
                    }
                }
            }
            list = null;
        }
        xi xiVar3 = (xi) xiVar;
        if (xiVar3 != null) {
            Object obj2 = xiVar3.a;
            Object obj3 = true == xi.a(obj2) ? obj2 : null;
            if (obj3 != null) {
                xhVar.a.a(obj3);
            }
        }
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((xg) it2.next()).a(new qp(12));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(long r18, long r20, long r22, defpackage.xf r24) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xh.c(long, long, long, xf):void");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.b) {
            if (this.c) {
                return;
            }
            this.c = true;
            Map map = this.j;
            List listBP = ske.bP(map.values());
            map.clear();
            List list = this.i;
            List listBP2 = ske.bP(list);
            list.clear();
            Iterator it = listBP.iterator();
            while (it.hasNext()) {
                Object obj = ((xi) it.next()).a;
                xm xmVar = this.a;
                if (true != xi.a(obj)) {
                    obj = null;
                }
                xmVar.a(obj);
            }
            Iterator it2 = listBP2.iterator();
            while (it2.hasNext()) {
                ((xg) it2.next()).b(11);
            }
        }
    }
}
