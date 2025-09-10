package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bdn implements List, uke {
    private final List a;
    private final int b;
    private int c;
    private final /* synthetic */ int d;

    public bdn(List list, int i, int i2, int i3) {
        this.d = i3;
        this.a = list;
        this.b = i;
        this.c = i2;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        if (this.d != 0) {
            this.a.add(i + this.b, obj);
            this.c++;
        } else {
            this.a.add(i + this.b, obj);
            this.c++;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (this.d != 0) {
            collection.getClass();
            this.a.addAll(this.c, collection);
            this.c += collection.size();
            return collection.size() > 0;
        }
        this.a.addAll(this.c, collection);
        int size = collection.size();
        this.c += size;
        return size > 0;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.d != 0) {
            int i = this.c - 1;
            int i2 = this.b;
            if (i2 <= i) {
                while (true) {
                    this.a.remove(i);
                    if (i == i2) {
                        break;
                    } else {
                        i--;
                    }
                }
            }
            this.c = i2;
            return;
        }
        int i3 = this.c - 1;
        int i4 = this.b;
        if (i4 <= i3) {
            while (true) {
                this.a.remove(i3);
                if (i3 == i4) {
                    break;
                } else {
                    i3--;
                }
            }
        }
        this.c = i4;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (this.d != 0) {
            int i = this.c;
            for (int i2 = this.b; i2 < i; i2++) {
                if (a.ao(this.a.get(i2), obj)) {
                    return true;
                }
            }
            return false;
        }
        int i3 = this.c;
        for (int i4 = this.b; i4 < i3; i4++) {
            if (a.ao(this.a.get(i4), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        if (this.d == 0) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }
        collection.getClass();
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!contains(it2.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        if (this.d == 0) {
            bdq.a(this, i);
            return this.a.get(i + this.b);
        }
        zp.a(this, i);
        return this.a.get(i + this.b);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (this.d != 0) {
            int i = this.c;
            int i2 = this.b;
            for (int i3 = i2; i3 < i; i3++) {
                if (a.ao(this.a.get(i3), obj)) {
                    return i3 - i2;
                }
            }
            return -1;
        }
        int i4 = this.c;
        int i5 = this.b;
        for (int i6 = i5; i6 < i4; i6++) {
            if (a.ao(this.a.get(i6), obj)) {
                return i6 - i5;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.d != 0 ? this.c == this.b : this.c == this.b;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.d != 0 ? new bdo(this, 0, 1, null) : new bdo(this, 0, 0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (this.d != 0) {
            int i = this.c - 1;
            int i2 = this.b;
            if (i2 <= i) {
                while (!a.ao(this.a.get(i), obj)) {
                    if (i != i2) {
                        i--;
                    }
                }
                return i - i2;
            }
            return -1;
        }
        int i3 = this.c - 1;
        int i4 = this.b;
        if (i4 <= i3) {
            while (!a.ao(this.a.get(i3), obj)) {
                if (i3 != i4) {
                    i3--;
                }
            }
            return i3 - i4;
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.d != 0 ? new bdo(this, 0, 1, null) : new bdo(this, 0, 0);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        if (this.d == 0) {
            bdq.a(this, i);
            this.c--;
            return this.a.remove(i + this.b);
        }
        zp.a(this, i);
        this.c--;
        return this.a.remove(i + this.b);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (this.d == 0) {
            int i = this.c;
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i != this.c;
        }
        collection.getClass();
        int i2 = this.c;
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            remove(it2.next());
        }
        return i2 != this.c;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        if (this.d == 0) {
            int i = this.c;
            int i2 = i - 1;
            int i3 = this.b;
            if (i3 <= i2) {
                while (true) {
                    List list = this.a;
                    if (!collection.contains(list.get(i2))) {
                        list.remove(i2);
                        this.c--;
                    }
                    if (i2 == i3) {
                        break;
                    }
                    i2--;
                }
            }
            return i != this.c;
        }
        collection.getClass();
        int i4 = this.c;
        int i5 = i4 - 1;
        int i6 = this.b;
        if (i6 <= i5) {
            while (true) {
                List list2 = this.a;
                if (!collection.contains(list2.get(i5))) {
                    list2.remove(i5);
                    this.c--;
                }
                if (i5 == i6) {
                    break;
                }
                i5--;
            }
        }
        return i4 != this.c;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        if (this.d == 0) {
            bdq.a(this, i);
            return this.a.set(i + this.b, obj);
        }
        zp.a(this, i);
        return this.a.set(i + this.b, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i = this.d;
        return this.c - this.b;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (this.d != 0) {
            zp.b(this, i, i2);
            return new bdn(this, i, i2, 1);
        }
        bdq.b(this, i, i2);
        return new bdn(this, i, i2, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return this.d != 0 ? ujj.a(this) : ujj.a(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return this.d != 0 ? new bdo(this, i, 1, null) : new bdo(this, i, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        if (this.d != 0) {
            int i = this.c;
            this.c = i + 1;
            this.a.add(i, obj);
            return true;
        }
        int i2 = this.c;
        this.c = i2 + 1;
        this.a.add(i2, obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        if (this.d != 0) {
            objArr.getClass();
            return ujj.b(this, objArr);
        }
        return ujj.b(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        if (this.d != 0) {
            int i = this.c;
            for (int i2 = this.b; i2 < i; i2++) {
                List list = this.a;
                if (a.ao(list.get(i2), obj)) {
                    list.remove(i2);
                    this.c--;
                    return true;
                }
            }
            return false;
        }
        int i3 = this.c;
        for (int i4 = this.b; i4 < i3; i4++) {
            List list2 = this.a;
            if (a.ao(list2.get(i4), obj)) {
                list2.remove(i4);
                this.c--;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (this.d != 0) {
            collection.getClass();
            this.a.addAll(i + this.b, collection);
            this.c += collection.size();
            return collection.size() > 0;
        }
        this.a.addAll(i + this.b, collection);
        int size = collection.size();
        this.c += size;
        return size > 0;
    }
}
