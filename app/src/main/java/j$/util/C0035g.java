package j$.util;

import j$.util.List;
import java.io.Serializable;
import java.util.Comparator;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* renamed from: j$.util.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0035g extends C0034f implements java.util.List, List {
    private static final long serialVersionUID = -7754090372962971524L;
    public final java.util.List c;

    public C0035g(java.util.List list) {
        super(list);
        this.c = list;
    }

    private Object readResolve() {
        java.util.List list = this.c;
        return list instanceof RandomAccess ? new C0037i(list) : this;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        synchronized (this.b) {
            this.c.add(i, obj);
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, java.util.Collection collection) {
        boolean zAddAll;
        synchronized (this.b) {
            zAddAll = this.c.addAll(i, collection);
        }
        return zAddAll;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        synchronized (this.b) {
            zEquals = this.c.equals(obj);
        }
        return zEquals;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object obj;
        synchronized (this.b) {
            obj = this.c.get(i);
        }
        return obj;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int iHashCode;
        synchronized (this.b) {
            iHashCode = this.c.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int iIndexOf;
        synchronized (this.b) {
            iIndexOf = this.c.indexOf(obj);
        }
        return iIndexOf;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int iLastIndexOf;
        synchronized (this.b) {
            iLastIndexOf = this.c.lastIndexOf(obj);
        }
        return iLastIndexOf;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.c.listIterator();
    }

    @Override // java.util.List
    public final Object remove(int i) {
        Object objRemove;
        synchronized (this.b) {
            objRemove = this.c.remove(i);
        }
        return objRemove;
    }

    @Override // java.util.List, j$.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        synchronized (this.b) {
            List.EL.replaceAll(this.c, unaryOperator);
        }
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        Object obj2;
        synchronized (this.b) {
            obj2 = this.c.set(i, obj);
        }
        return obj2;
    }

    @Override // java.util.List, j$.util.List
    public final void sort(Comparator comparator) {
        synchronized (this.b) {
            List.EL.sort(this.c, comparator);
        }
    }

    @Override // java.util.List
    public java.util.List subList(int i, int i2) {
        C0035g c0035g;
        synchronized (this.b) {
            c0035g = new C0035g(this.c.subList(i, i2), this.b);
        }
        return c0035g;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return this.c.listIterator(i);
    }

    public C0035g(java.util.List list, Serializable serializable) {
        super(list, serializable);
        this.c = list;
    }
}
