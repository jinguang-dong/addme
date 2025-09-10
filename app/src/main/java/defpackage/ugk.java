package defpackage;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ugk implements ListIterator, ukd {
    private final ugl a;
    private int b;
    private int c = -1;
    private int d;

    public ugk(ugl uglVar, int i) {
        this.a = uglVar;
        this.b = i;
        this.d = uglVar.modCount;
    }

    private final void a() {
        if (this.a.modCount != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i = this.b;
        this.b = i + 1;
        ugl uglVar = this.a;
        uglVar.add(i, obj);
        this.c = -1;
        this.d = uglVar.modCount;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.c;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        int i = this.b;
        ugl uglVar = this.a;
        if (i >= uglVar.c) {
            throw new NoSuchElementException();
        }
        this.b = i + 1;
        this.c = i;
        return uglVar.b[i];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        int i = this.b;
        if (i <= 0) {
            throw new NoSuchElementException();
        }
        int i2 = i - 1;
        this.b = i2;
        this.c = i2;
        return this.a.b[i2];
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i = this.c;
        if (i == -1) {
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
        }
        ugl uglVar = this.a;
        uglVar.d(i);
        this.b = this.c;
        this.c = -1;
        this.d = uglVar.modCount;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i = this.c;
        if (i == -1) {
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
        }
        this.a.set(i, obj);
    }
}
