package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sdk implements ListIterator {
    boolean a;
    final /* synthetic */ ListIterator b;
    final /* synthetic */ sdl c;

    public sdk(sdl sdlVar, ListIterator listIterator) {
        this.b = listIterator;
        this.c = sdlVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        ListIterator listIterator = this.b;
        listIterator.add(obj);
        listIterator.previous();
        this.a = false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = true;
        return this.b.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.c.a(this.b.nextIndex());
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.a = true;
        return this.b.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return nextIndex() - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        ujp.bp(this.a);
        this.b.remove();
        this.a = false;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        rnt.L(this.a);
        this.b.set(obj);
    }
}
