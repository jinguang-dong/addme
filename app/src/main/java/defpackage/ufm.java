package defpackage;

import j$.util.List;
import j$.util.Spliterator;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ufm extends ufi implements List, j$.util.List, ukd {
    protected ufm() {
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        a.h();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return a.l();
    }

    public final void addFirst(Object obj) {
        a.i();
    }

    public final void addLast(Object obj) {
        a.i();
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        collection.getClass();
        if (size() != collection.size()) {
            return false;
        }
        Iterator it = collection.iterator();
        Iterator<E> it2 = iterator();
        while (it2.hasNext()) {
            if (!a.ao(it2.next(), it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract Object get(int i);

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        Iterator<E> it = iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
        }
        return iHashCode;
    }

    public int indexOf(Object obj) {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            if (a.ao(it.next(), obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new ufj(this);
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (a.ao(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return new ufk(this, 0);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        return a.e();
    }

    public final Object removeFirst() {
        return a.f();
    }

    public final Object removeLast() {
        return a.f();
    }

    @Override // java.util.List, j$.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        a.j();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        return a.g();
    }

    @Override // java.util.List, j$.util.List
    public final void sort(Comparator comparator) {
        a.k();
    }

    @Override // defpackage.ufi, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ Spliterator spliterator() {
        return List.CC.$default$spliterator(this);
    }

    public java.util.List subList(int i, int i2) {
        return new ufl(this, i, i2);
    }

    public ListIterator listIterator(int i) {
        return new ufk(this, i);
    }
}
