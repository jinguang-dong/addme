package defpackage;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ugj extends ufp implements List, RandomAccess, Serializable, uke {
    public Object[] a;
    public final int b;
    public int c;
    public final ugl d;
    private final ugj e;

    public ugj(Object[] objArr, int i, int i2, ugj ugjVar, ugl uglVar) {
        objArr.getClass();
        uglVar.getClass();
        this.a = objArr;
        this.b = i;
        this.c = i2;
        this.e = ugjVar;
        this.d = uglVar;
        this.modCount = uglVar.modCount;
    }

    private final int c(int i, int i2, Collection collection, boolean z) {
        int iC;
        ugj ugjVar = this.e;
        if (ugjVar != null) {
            iC = ugjVar.c(i, i2, collection, z);
        } else {
            ugl uglVar = this.d;
            ugl uglVar2 = ugl.a;
            iC = uglVar.c(i, i2, collection, z);
        }
        if (iC > 0) {
            j();
        }
        this.c -= iC;
        return iC;
    }

    private final Object e(int i) {
        Object objE;
        j();
        ugj ugjVar = this.e;
        if (ugjVar != null) {
            objE = ugjVar.e(i);
        } else {
            ugl uglVar = this.d;
            ugl uglVar2 = ugl.a;
            objE = uglVar.e(i);
        }
        this.c--;
        return objE;
    }

    private final void f(int i, Collection collection, int i2) {
        j();
        ugj ugjVar = this.e;
        if (ugjVar != null) {
            ugjVar.f(i, collection, i2);
        } else {
            ugl uglVar = this.d;
            ugl uglVar2 = ugl.a;
            uglVar.f(i, collection, i2);
        }
        ugl uglVar3 = this.d;
        ugl uglVar4 = ugl.a;
        this.a = uglVar3.b;
        this.c += i2;
    }

    private final void g(int i, Object obj) {
        j();
        ugj ugjVar = this.e;
        if (ugjVar != null) {
            ugjVar.g(i, obj);
        } else {
            ugl uglVar = this.d;
            ugl uglVar2 = ugl.a;
            uglVar.g(i, obj);
        }
        ugl uglVar3 = this.d;
        ugl uglVar4 = ugl.a;
        this.a = uglVar3.b;
        this.c++;
    }

    private final void h() {
        ugl uglVar = ugl.a;
        if (this.d.modCount != this.modCount) {
            throw new ConcurrentModificationException();
        }
    }

    private final void i() {
        if (l()) {
            throw new UnsupportedOperationException();
        }
    }

    private final void j() {
        this.modCount++;
    }

    private final void k(int i, int i2) {
        if (i2 > 0) {
            j();
        }
        ugj ugjVar = this.e;
        if (ugjVar != null) {
            ugjVar.k(i, i2);
        } else {
            ugl uglVar = this.d;
            ugl uglVar2 = ugl.a;
            uglVar.i(i, i2);
        }
        this.c -= i2;
    }

    private final boolean l() {
        ugl uglVar = ugl.a;
        return this.d.d;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (l()) {
            return new ugu(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        i();
        h();
        a.aj(i, this.c);
        g(this.b + i, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        i();
        h();
        a.aj(i, this.c);
        int size = collection.size();
        f(this.b + i, collection, size);
        return size > 0;
    }

    @Override // defpackage.ufp
    public final int b() {
        h();
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        i();
        h();
        k(this.b, this.c);
    }

    @Override // defpackage.ufp
    public final Object d(int i) {
        i();
        h();
        a.ai(i, this.c);
        return e(this.b + i);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        h();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            if (ske.aR(this.a, this.b, this.c, (List) obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        h();
        a.ai(i, this.c);
        return this.a[this.b + i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        h();
        return ske.aN(this.a, this.b, this.c);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        h();
        for (int i = 0; i < this.c; i++) {
            if (a.ao(this.a[this.b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        h();
        return this.c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        h();
        for (int i = this.c - 1; i >= 0; i--) {
            if (a.ao(this.a[this.b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        i();
        h();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            d(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        i();
        h();
        return c(this.b, this.c, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        i();
        h();
        return c(this.b, this.c, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        i();
        h();
        a.ai(i, this.c);
        Object[] objArr = this.a;
        int i2 = this.b + i;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        a.ak(i, i2, this.c);
        return new ugj(this.a, this.b + i, i2 - i, this, this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        h();
        Object[] objArr = this.a;
        int i = this.b;
        return rnt.ah(objArr, i, this.c + i);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        h();
        return ske.aO(this.a, this.b, this.c, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        h();
        a.aj(i, this.c);
        return new ugi(this, i, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        h();
        int length = objArr.length;
        int i = this.c;
        if (length < i) {
            Object[] objArr2 = this.a;
            int i2 = this.b;
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        Object[] objArr3 = this.a;
        int i3 = this.b;
        rnt.ay(objArr3, objArr, 0, i3, i + i3);
        ske.bX(this.c, objArr);
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        i();
        h();
        g(this.b + this.c, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        i();
        h();
        int size = collection.size();
        f(this.b + this.c, collection, size);
        return size > 0;
    }
}
