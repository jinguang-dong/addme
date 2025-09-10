package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ki {
    public final kj a = new kj();
    public boolean b = false;
    public final int c = 1;

    public abstract int a();

    public int b(int i) {
        return 0;
    }

    public long c(int i) {
        return -1L;
    }

    public abstract lg d(ViewGroup viewGroup, int i);

    public final void e() {
        this.a.a();
    }

    public final void f(int i) {
        this.a.b(i, 1);
    }

    public final void g(int i, Object obj) {
        this.a.c(i, 1, obj);
    }

    public abstract void i(lg lgVar, int i);

    public final void k(boolean z) {
        if (this.a.f()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.b = z;
    }

    public final void m(byi byiVar) {
        this.a.registerObserver(byiVar);
    }

    public final void n(byi byiVar) {
        this.a.unregisterObserver(byiVar);
    }

    public void l() {
    }

    public void h(RecyclerView recyclerView) {
    }

    public void j(lg lgVar) {
    }
}
