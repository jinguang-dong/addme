package defpackage;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class pml implements pmi {
    public final pmh a;
    public final Object b;

    public pml(int i) {
        a.I(true);
        this.b = new Object();
        this.a = new pmh(i);
    }

    protected abstract Object a(Object obj);

    protected Object b(Object obj) {
        throw null;
    }

    @Override // defpackage.pmi
    public final pmk c(Object obj) {
        Object objA;
        synchronized (this.b) {
            pmh pmhVar = this.a;
            synchronized (pmhVar.a) {
                if (((LinkedList) pmhVar.d).removeLastOccurrence(obj)) {
                    Queue queue = (Queue) ((HashMap) pmhVar.e).get(obj);
                    queue.getClass();
                    objA = queue.remove();
                    int i = pmhVar.c;
                    pmh.a();
                    pmhVar.c = i - 1;
                } else {
                    objA = null;
                }
            }
        }
        if (objA == null) {
            objA = a(obj);
        }
        return new pmk(this, obj, objA);
    }
}
