package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zg implements List, uke {
    private final zo a;

    public zg(zo zoVar) {
        this.a = zoVar;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        zo zoVar = this.a;
        if (i < 0 || i > zoVar.b) {
            zoVar.m(i);
        }
        int i2 = zoVar.b + 1;
        Object[] objArr = zoVar.a;
        if (objArr.length < i2) {
            zoVar.l(i2, objArr);
        }
        Object[] objArr2 = zoVar.a;
        int i3 = zoVar.b;
        if (i != i3) {
            rnt.ay(objArr2, objArr2, i + 1, i, i3);
        }
        objArr2[i] = obj;
        zoVar.b++;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        zo zoVar = this.a;
        if (i < 0 || i > zoVar.b) {
            zoVar.m(i);
        }
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = zoVar.b + collection.size();
        Object[] objArr = zoVar.a;
        if (objArr.length < size) {
            zoVar.l(size, objArr);
        }
        Object[] objArr2 = zoVar.a;
        if (i != zoVar.b) {
            rnt.ay(objArr2, objArr2, collection.size() + i, i, zoVar.b);
        }
        for (Object obj : collection) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                ske.bp();
            }
            objArr2[i2 + i] = obj;
            i2 = i3;
        }
        zoVar.b += collection.size();
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.a.j();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.e(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.a.e(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zp.a(this, i);
        return this.a.c(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.a.a(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.a.f();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new bdo(this, 0, 1, null);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zo zoVar = this.a;
        if (obj == null) {
            Object[] objArr = zoVar.a;
            for (int i = zoVar.b - 1; i >= 0; i--) {
                if (objArr[i] == null) {
                    return i;
                }
            }
            return -1;
        }
        Object[] objArr2 = zoVar.a;
        for (int i2 = zoVar.b - 1; i2 >= 0; i2--) {
            if (obj.equals(objArr2[i2])) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new bdo(this, 0, 1, null);
    }

    @Override // java.util.List
    public final /* bridge */ Object remove(int i) {
        zp.a(this, i);
        return this.a.h(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        zo zoVar = this.a;
        int i = zoVar.b;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zoVar.n(it.next());
        }
        return i != zoVar.b;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        zo zoVar = this.a;
        int i = zoVar.b;
        Object[] objArr = zoVar.a;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(objArr[i2])) {
                zoVar.h(i2);
            }
        }
        return i != zoVar.b;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        zp.a(this, i);
        return this.a.i(i, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return this.a.b;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        zp.b(this, i, i2);
        return new bdn(this, i, i2, 1);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return ujj.a(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new bdo(this, i, 1, null);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return ujj.b(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.a.n(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.a.o(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        zo zoVar = this.a;
        int i = zoVar.b;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zoVar.o(it.next());
        }
        return i != zoVar.b;
    }
}
