package defpackage;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pmk implements paq {
    private final Object a = new Object();
    private final pml b;
    private Object c;
    private Object d;

    public pmk(pml pmlVar, Object obj, Object obj2) {
        this.b = pmlVar;
        this.c = obj;
        this.d = obj2;
    }

    public final Object a() {
        Object obj;
        synchronized (this.a) {
            obj = this.d;
        }
        return obj;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        Queue linkedList;
        Object objRemoveLast;
        synchronized (this.a) {
            Object obj = this.d;
            if (obj != null) {
                pml pmlVar = this.b;
                Object obj2 = this.c;
                synchronized (pmlVar.b) {
                    pmh pmhVar = pmlVar.a;
                    Object objB = pmlVar.b(obj);
                    obj2.getClass();
                    synchronized (pmhVar.a) {
                        Object obj3 = pmhVar.d;
                        ((LinkedList) obj3).push(obj2);
                        Map map = pmhVar.e;
                        if (((HashMap) map).containsKey(obj2)) {
                            linkedList = (Queue) ((HashMap) map).get(obj2);
                        } else {
                            linkedList = new LinkedList();
                            ((HashMap) map).put(obj2, linkedList);
                        }
                        linkedList.add(objB);
                        int i = pmhVar.c;
                        pmh.a();
                        pmhVar.c = i + 1;
                        int i2 = pmhVar.b;
                        while (pmhVar.c > i2 && !((LinkedList) obj3).isEmpty() && (objRemoveLast = ((LinkedList) obj3).removeLast()) != null) {
                            Queue queue = (Queue) ((HashMap) map).get(objRemoveLast);
                            queue.getClass();
                            queue.remove();
                            if (queue.isEmpty()) {
                                ((HashMap) map).remove(objRemoveLast);
                            }
                            int i3 = pmhVar.c;
                            pmh.a();
                            pmhVar.c = i3 - 1;
                        }
                        if (pmhVar.c < 0 || (((LinkedList) obj3).isEmpty() && pmhVar.c != 0)) {
                            throw new IllegalStateException("LruPool.sizeOf() is reporting inconsistent results!");
                        }
                    }
                }
                this.d = null;
                this.c = null;
            }
        }
    }
}
