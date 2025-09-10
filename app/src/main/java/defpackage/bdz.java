package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bdz implements ListIterator, ukd {
    public int a;
    public int b;

    public bdz(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final void a() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        a.i();
    }

    public final void b() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.a > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        return a.f();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.a - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        a.a();
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        a.i();
    }
}
