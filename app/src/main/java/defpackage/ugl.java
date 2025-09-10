package defpackage;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ugl extends ufp implements List, RandomAccess, Serializable, uke {
    public static final ugl a;
    public Object[] b;
    public int c;
    public boolean d;

    static {
        ugl uglVar = new ugl(0);
        uglVar.d = true;
        a = uglVar;
    }

    public ugl() {
        this((byte[]) null);
    }

    private final void j(int i, int i2) {
        int i3 = this.c + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.b;
        int length = objArr.length;
        if (i3 > length) {
            this.b = ske.aT(objArr, rnt.aK(length, i3));
        }
        Object[] objArr2 = this.b;
        rnt.ay(objArr2, objArr2, i + i2, i, this.c);
        this.c += i2;
    }

    private final void k() {
        this.modCount++;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.d) {
            return new ugu(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        h();
        a.aj(i, this.c);
        g(i, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        h();
        a.aj(i, this.c);
        int size = collection.size();
        f(i, collection, size);
        return size > 0;
    }

    @Override // defpackage.ufp
    public final int b() {
        return this.c;
    }

    public final int c(int i, int i2, Collection collection, boolean z) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i3 + 1;
            int i6 = i3 + i;
            if (collection.contains(this.b[i6]) == z) {
                Object[] objArr = this.b;
                objArr[i + i4] = objArr[i6];
                i4++;
            }
            i3 = i5;
        }
        int i7 = i2 - i4;
        Object[] objArr2 = this.b;
        rnt.ay(objArr2, objArr2, i + i4, i + i2, this.c);
        Object[] objArr3 = this.b;
        int i8 = this.c;
        ske.aQ(objArr3, i8 - i7, i8);
        if (i7 > 0) {
            k();
        }
        this.c -= i7;
        return i7;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        h();
        i(0, this.c);
    }

    @Override // defpackage.ufp
    public final Object d(int i) {
        h();
        a.ai(i, this.c);
        return e(i);
    }

    public final Object e(int i) {
        k();
        Object[] objArr = this.b;
        Object obj = objArr[i];
        rnt.ay(objArr, objArr, i, i + 1, this.c);
        ske.aP(this.b, this.c - 1);
        this.c--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            if (ske.aR(this.b, 0, this.c, (List) obj)) {
                return true;
            }
        }
        return false;
    }

    public final void f(int i, Collection collection, int i2) {
        k();
        j(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.b[i + i3] = it.next();
        }
    }

    public final void g(int i, Object obj) {
        k();
        j(i, 1);
        this.b[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        a.ai(i, this.c);
        return this.b[i];
    }

    public final void h() {
        if (this.d) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        return ske.aN(this.b, 0, this.c);
    }

    public final void i(int i, int i2) {
        if (i2 > 0) {
            k();
        }
        Object[] objArr = this.b;
        rnt.ay(objArr, objArr, i, i + i2, this.c);
        Object[] objArr2 = this.b;
        int i3 = this.c;
        ske.aQ(objArr2, i3 - i2, i3);
        this.c -= i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.c; i++) {
            if (a.ao(this.b[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.c - 1; i >= 0; i--) {
            if (a.ao(this.b[i], obj)) {
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
        h();
        return c(0, this.c, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        h();
        return c(0, this.c, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        h();
        a.ai(i, this.c);
        Object[] objArr = this.b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        a.ak(i, i2, this.c);
        return new ugj(this.b, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return rnt.ah(this.b, 0, this.c);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return ske.aO(this.b, 0, this.c, this);
    }

    public ugl(int i) {
        this.b = ske.aS(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        a.aj(i, this.c);
        return new ugk(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.c;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.b, 0, i, objArr.getClass());
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        rnt.ay(this.b, objArr, 0, 0, i);
        ske.bX(this.c, objArr);
        return objArr;
    }

    public /* synthetic */ ugl(byte[] bArr) {
        this(10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        h();
        g(this.c, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        h();
        int size = collection.size();
        f(this.c, collection, size);
        return size > 0;
    }
}
