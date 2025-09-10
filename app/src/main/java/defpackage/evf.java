package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class evf {
    private static final Queue a;
    private int b;
    private int c;
    private Object d;

    static {
        char[] cArr = fax.a;
        a = new ArrayDeque(0);
    }

    private evf() {
    }

    public static evf b(Object obj) {
        evf evfVar;
        Queue queue = a;
        synchronized (queue) {
            evfVar = (evf) queue.poll();
        }
        if (evfVar == null) {
            evfVar = new evf();
        }
        evfVar.d = obj;
        evfVar.c = 0;
        evfVar.b = 0;
        return evfVar;
    }

    public final void a() {
        Queue queue = a;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof evf) {
            evf evfVar = (evf) obj;
            int i = evfVar.c;
            int i2 = evfVar.b;
            if (this.d.equals(evfVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
