package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bdm implements List, uke {
    private final bdp a;

    public bdm(bdp bdpVar) {
        this.a = bdpVar;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.a.f(i, obj);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return this.a.k(i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.a.g();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.l(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.a.l(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        bdq.a(this, i);
        return this.a.a[i];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.a.a(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.a.b == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new bdo(this, 0, 0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        bdp bdpVar = this.a;
        Object[] objArr = bdpVar.a;
        for (int i = bdpVar.b - 1; i >= 0; i--) {
            if (a.ao(obj, objArr[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new bdo(this, 0, 0);
    }

    @Override // java.util.List
    public final /* bridge */ Object remove(int i) {
        bdq.a(this, i);
        return this.a.c(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        bdp bdpVar = this.a;
        int i = bdpVar.b;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            bdpVar.m(it.next());
        }
        return i != bdpVar.b;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        bdp bdpVar = this.a;
        int i = bdpVar.b;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(bdpVar.a[i2])) {
                bdpVar.c(i2);
            }
        }
        return i != bdpVar.b;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        bdq.a(this, i);
        return this.a.d(i, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return this.a.b;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        bdq.b(this, i, i2);
        return new bdn(this, i, i2, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return ujj.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.a.n(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        bdp bdpVar = this.a;
        return bdpVar.k(bdpVar.b, collection);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new bdo(this, i, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return ujj.b(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.a.m(obj);
    }
}
