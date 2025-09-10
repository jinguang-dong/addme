package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lpd {
    public boolean b;
    public boolean a = false;
    public int c = Integer.MIN_VALUE;
    public float d = Float.MIN_VALUE;
    public long e = 0;
    public float f = Float.MIN_VALUE;
    public long g = 0;
    public final ConcurrentLinkedQueue h = new ConcurrentLinkedQueue();

    public final void a(lpc lpcVar) {
        this.h.add(lpcVar);
    }

    public final void b(lpc lpcVar) {
        this.h.remove(lpcVar);
    }

    public final void c(boolean z) {
        this.a = z;
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((lpc) it.next()).b(z);
        }
    }

    public final boolean d() {
        return System.currentTimeMillis() <= this.e + 5000;
    }
}
