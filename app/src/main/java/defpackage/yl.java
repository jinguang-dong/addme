package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class yl implements Iterator, ukd {
    private int a;
    private int b;
    private boolean c;

    public yl(int i) {
        this.a = i;
    }

    protected abstract Object a(int i);

    protected abstract void b(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objA = a(this.b);
        this.b++;
        this.c = true;
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.c) {
            a.bm("Call next() before removing an element.");
        }
        int i = this.b - 1;
        this.b = i;
        b(i);
        this.a--;
        this.c = false;
    }
}
