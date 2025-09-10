package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fzh implements gae {
    public final plx a;
    public final List b = new CopyOnWriteArrayList();
    private final Object c = new Object();
    private int d = 1;

    public fzh(plx plxVar) {
        this.a = plxVar;
    }

    private final void d(int i) {
        synchronized (this.c) {
            this.d = i;
        }
    }

    public final paq a(gaa gaaVar) {
        this.b.add(gaaVar);
        return new fid(this, gaaVar, 7, null);
    }

    @Override // defpackage.gae
    public final void b() {
        synchronized (this.c) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((gaa) it.next()).d();
            }
            d(2);
        }
    }

    @Override // defpackage.gae
    public final void c() {
        synchronized (this.c) {
            int i = this.d;
            if (i == 0) {
                throw null;
            }
            if (i != 2) {
                return;
            }
            d(3);
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((gaa) it.next()).e();
            }
            d(4);
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.c) {
            int i = this.d;
            if (i == 0) {
                throw null;
            }
            if (i != 5) {
                c();
            }
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((gaa) it.next()).c();
            }
            d(5);
        }
    }
}
