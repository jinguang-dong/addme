package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ufu extends ufp {
    private static final Object[] d = new Object[0];
    public int a;
    public Object[] b = d;
    public int c;

    private final int g(int i) {
        return i == 0 ? rnt.aj(this.b) : i - 1;
    }

    private final int h(int i) {
        if (i == rnt.aj(this.b)) {
            return 0;
        }
        return i + 1;
    }

    private final int i(int i) {
        return i < 0 ? i + this.b.length : i;
    }

    private final int j(int i) {
        int length = this.b.length;
        return i >= length ? i - length : i;
    }

    private final void k(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.b.length;
        while (i < length && it.hasNext()) {
            this.b[i] = it.next();
            i++;
        }
        int i2 = this.a;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.b[i3] = it.next();
        }
        this.c += collection.size();
    }

    private final void l(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.b;
        int length = objArr.length;
        if (i <= length) {
            return;
        }
        if (objArr == d) {
            this.b = new Object[ukc.n(i, 10)];
            return;
        }
        Object[] objArr2 = new Object[rnt.aK(length, i)];
        rnt.ay(objArr, objArr2, 0, this.a, length);
        Object[] objArr3 = this.b;
        int length2 = objArr3.length;
        int i2 = this.a;
        rnt.ay(objArr3, objArr2, length2 - i2, 0, i2);
        this.a = 0;
        this.b = objArr2;
    }

    private final void m(int i, int i2) {
        if (i < i2) {
            rnt.af(this.b, null, i, i2);
            return;
        }
        Object[] objArr = this.b;
        rnt.af(objArr, null, i, objArr.length);
        rnt.af(this.b, null, 0, i2);
    }

    private final void n() {
        this.modCount++;
    }

    public final Object a() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.b[this.a];
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        a.aj(i, this.c);
        if (i == this.c) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        n();
        l(this.c + 1);
        int iJ = j(this.a + i);
        int i2 = this.c;
        if (i < ((i2 + 1) >> 1)) {
            int iG = g(iJ);
            int iG2 = g(this.a);
            int i3 = this.a;
            if (iG >= i3) {
                Object[] objArr = this.b;
                objArr[iG2] = objArr[i3];
                rnt.ay(objArr, objArr, i3, i3 + 1, iG + 1);
            } else {
                Object[] objArr2 = this.b;
                rnt.ay(objArr2, objArr2, i3 - 1, i3, objArr2.length);
                Object[] objArr3 = this.b;
                objArr3[objArr3.length - 1] = objArr3[0];
                rnt.ay(objArr3, objArr3, 0, 1, iG + 1);
            }
            this.b[iG] = obj;
            this.a = iG2;
        } else {
            int iJ2 = j(this.a + i2);
            if (iJ < iJ2) {
                Object[] objArr4 = this.b;
                rnt.ay(objArr4, objArr4, iJ + 1, iJ, iJ2);
            } else {
                Object[] objArr5 = this.b;
                rnt.ay(objArr5, objArr5, 1, 0, iJ2);
                Object[] objArr6 = this.b;
                int length = objArr6.length - 1;
                objArr6[0] = objArr6[length];
                rnt.ay(objArr6, objArr6, iJ + 1, iJ, length);
            }
            this.b[iJ] = obj;
        }
        this.c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        a.aj(i, this.c);
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.c) {
            return addAll(collection);
        }
        n();
        l(this.c + collection.size());
        int iJ = j(this.a + this.c);
        int iJ2 = j(this.a + i);
        int size = collection.size();
        if (i < ((this.c + 1) >> 1)) {
            int i2 = this.a;
            int i3 = i2 - size;
            if (iJ2 < i2) {
                Object[] objArr = this.b;
                rnt.ay(objArr, objArr, i3, i2, objArr.length);
                if (size >= iJ2) {
                    Object[] objArr2 = this.b;
                    rnt.ay(objArr2, objArr2, objArr2.length - size, 0, iJ2);
                } else {
                    Object[] objArr3 = this.b;
                    rnt.ay(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.b;
                    rnt.ay(objArr4, objArr4, 0, size, iJ2);
                }
            } else if (i3 >= 0) {
                Object[] objArr5 = this.b;
                rnt.ay(objArr5, objArr5, i3, i2, iJ2);
            } else {
                Object[] objArr6 = this.b;
                int length = objArr6.length;
                i3 += length;
                int i4 = length - i3;
                if (i4 >= iJ2 - i2) {
                    rnt.ay(objArr6, objArr6, i3, i2, iJ2);
                } else {
                    rnt.ay(objArr6, objArr6, i3, i2, i2 + i4);
                    Object[] objArr7 = this.b;
                    rnt.ay(objArr7, objArr7, 0, this.a + i4, iJ2);
                }
            }
            this.a = i3;
            k(i(iJ2 - size), collection);
        } else {
            int i5 = iJ2 + size;
            if (iJ2 < iJ) {
                int i6 = size + iJ;
                Object[] objArr8 = this.b;
                int length2 = objArr8.length;
                if (i6 <= length2) {
                    rnt.ay(objArr8, objArr8, i5, iJ2, iJ);
                } else if (i5 >= length2) {
                    rnt.ay(objArr8, objArr8, i5 - length2, iJ2, iJ);
                } else {
                    int i7 = iJ - (i6 - length2);
                    rnt.ay(objArr8, objArr8, 0, i7, iJ);
                    Object[] objArr9 = this.b;
                    rnt.ay(objArr9, objArr9, i5, iJ2, i7);
                }
            } else {
                Object[] objArr10 = this.b;
                rnt.ay(objArr10, objArr10, size, 0, iJ);
                Object[] objArr11 = this.b;
                int length3 = objArr11.length;
                if (i5 >= length3) {
                    rnt.ay(objArr11, objArr11, i5 - length3, iJ2, length3);
                } else {
                    rnt.ay(objArr11, objArr11, 0, length3 - size, length3);
                    Object[] objArr12 = this.b;
                    rnt.ay(objArr12, objArr12, i5, iJ2, objArr12.length - size);
                }
            }
            k(iJ2, collection);
        }
        return true;
    }

    public final void addFirst(Object obj) {
        n();
        l(this.c + 1);
        int iG = g(this.a);
        this.a = iG;
        this.b[iG] = obj;
        this.c++;
    }

    public final void addLast(Object obj) {
        n();
        l(this.c + 1);
        this.b[j(this.a + this.c)] = obj;
        this.c++;
    }

    @Override // defpackage.ufp
    public final int b() {
        return this.c;
    }

    public final Object c() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.b[j(this.a + ske.bk(this))];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            n();
            m(this.a, j(this.a + this.c));
        }
        this.a = 0;
        this.c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.ufp
    public final Object d(int i) {
        a.ai(i, this.c);
        if (i == ske.bk(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        n();
        int iJ = j(this.a + i);
        Object[] objArr = this.b;
        Object obj = objArr[iJ];
        if (i < (this.c >> 1)) {
            int i2 = this.a;
            if (iJ >= i2) {
                rnt.ay(objArr, objArr, i2 + 1, i2, iJ);
            } else {
                rnt.ay(objArr, objArr, 1, 0, iJ);
                Object[] objArr2 = this.b;
                int length = objArr2.length - 1;
                objArr2[0] = objArr2[length];
                int i3 = this.a;
                rnt.ay(objArr2, objArr2, i3 + 1, i3, length);
            }
            Object[] objArr3 = this.b;
            int i4 = this.a;
            objArr3[i4] = null;
            this.a = h(i4);
        } else {
            int iJ2 = j(this.a + ske.bk(this));
            if (iJ <= iJ2) {
                Object[] objArr4 = this.b;
                rnt.ay(objArr4, objArr4, iJ, iJ + 1, iJ2 + 1);
            } else {
                Object[] objArr5 = this.b;
                rnt.ay(objArr5, objArr5, iJ, iJ + 1, objArr5.length);
                Object[] objArr6 = this.b;
                objArr6[objArr6.length - 1] = objArr6[0];
                rnt.ay(objArr6, objArr6, 0, 1, iJ2 + 1);
            }
            this.b[iJ2] = null;
        }
        this.c--;
        return obj;
    }

    public final Object e() {
        if (isEmpty()) {
            return null;
        }
        return this.b[j(this.a + ske.bk(this))];
    }

    public final Object f() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        a.ai(i, this.c);
        return this.b[j(this.a + i)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iJ = j(this.a + this.c);
        int length = this.a;
        if (length < iJ) {
            while (length < iJ) {
                if (!a.ao(obj, this.b[length])) {
                    length++;
                }
            }
            return -1;
        }
        if (length < iJ) {
            return -1;
        }
        int length2 = this.b.length;
        while (length < length2) {
            if (!a.ao(obj, this.b[length])) {
                length++;
            }
        }
        for (int i2 = 0; i2 < iJ; i2++) {
            if (a.ao(obj, this.b[i2])) {
                length = i2 + this.b.length;
                i = this.a;
                return length - i;
            }
        }
        return -1;
        i = this.a;
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.c == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int iAj;
        int i;
        int iJ = j(this.a + this.c);
        int i2 = this.a;
        if (i2 < iJ) {
            iAj = iJ - 1;
            if (i2 <= iAj) {
                while (!a.ao(obj, this.b[iAj])) {
                    if (iAj != i2) {
                        iAj--;
                    }
                }
                i = this.a;
            }
            return -1;
        }
        if (i2 > iJ) {
            for (int i3 = iJ - 1; i3 >= 0; i3--) {
                if (a.ao(obj, this.b[i3])) {
                    iAj = i3 + this.b.length;
                    i = this.a;
                    break;
                }
            }
            iAj = rnt.aj(this.b);
            int i4 = this.a;
            if (i4 <= iAj) {
                while (!a.ao(obj, this.b[iAj])) {
                    if (iAj != i4) {
                        iAj--;
                    }
                }
                i = this.a;
            }
        }
        return -1;
        return iAj - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        d(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iJ;
        collection.getClass();
        boolean z = false;
        if (isEmpty() || this.b.length == 0) {
            return false;
        }
        int iJ2 = j(this.a + this.c);
        int i = this.a;
        if (i < iJ2) {
            iJ = i;
            while (i < iJ2) {
                Object obj = this.b[i];
                if (collection.contains(obj)) {
                    z = true;
                } else {
                    this.b[iJ] = obj;
                    iJ++;
                }
                i++;
            }
            rnt.af(this.b, null, iJ, iJ2);
        } else {
            int length = this.b.length;
            boolean z2 = false;
            int i2 = i;
            while (i < length) {
                Object[] objArr = this.b;
                Object obj2 = objArr[i];
                objArr[i] = null;
                if (collection.contains(obj2)) {
                    z2 = true;
                } else {
                    this.b[i2] = obj2;
                    i2++;
                }
                i++;
            }
            iJ = j(i2);
            for (int i3 = 0; i3 < iJ2; i3++) {
                Object[] objArr2 = this.b;
                Object obj3 = objArr2[i3];
                objArr2[i3] = null;
                if (collection.contains(obj3)) {
                    z2 = true;
                } else {
                    this.b[iJ] = obj3;
                    iJ = h(iJ);
                }
            }
            z = z2;
        }
        if (!z) {
            return z;
        }
        n();
        this.c = i(iJ - this.a);
        return true;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        n();
        Object[] objArr = this.b;
        int i = this.a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.a = h(i);
        this.c--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        n();
        int iJ = j(this.a + ske.bk(this));
        Object[] objArr = this.b;
        Object obj = objArr[iJ];
        objArr[iJ] = null;
        this.c--;
        return obj;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        a.ak(i, i2, this.c);
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 == this.c) {
                clear();
                return;
            }
            if (i3 == 1) {
                d(i);
                return;
            }
            n();
            if (i < this.c - i2) {
                int iJ = j(this.a + (i - 1));
                int iJ2 = j(this.a + (i2 - 1));
                while (i > 0) {
                    int i4 = iJ + 1;
                    int iMin = Math.min(i, Math.min(i4, iJ2 + 1));
                    Object[] objArr = this.b;
                    int i5 = iJ2 - iMin;
                    int i6 = iJ - iMin;
                    rnt.ay(objArr, objArr, i5 + 1, i6 + 1, i4);
                    iJ = i(i6);
                    iJ2 = i(i5);
                    i -= iMin;
                }
                int iJ3 = j(this.a + i3);
                m(this.a, iJ3);
                this.a = iJ3;
            } else {
                int iJ4 = j(this.a + i2);
                int iJ5 = j(this.a + i);
                int i7 = this.c;
                while (true) {
                    i7 -= i2;
                    if (i7 <= 0) {
                        break;
                    }
                    int length = this.b.length;
                    i2 = Math.min(i7, Math.min(length - iJ4, length - iJ5));
                    Object[] objArr2 = this.b;
                    int i8 = iJ4 + i2;
                    rnt.ay(objArr2, objArr2, iJ5, iJ4, i8);
                    iJ4 = j(i8);
                    iJ5 = j(iJ5 + i2);
                }
                int iJ6 = j(this.a + this.c);
                m(i(iJ6 - i3), iJ6);
            }
            this.c -= i3;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iJ;
        collection.getClass();
        boolean z = false;
        if (isEmpty() || this.b.length == 0) {
            return false;
        }
        int iJ2 = j(this.a + this.c);
        int i = this.a;
        if (i < iJ2) {
            iJ = i;
            while (i < iJ2) {
                Object obj = this.b[i];
                if (collection.contains(obj)) {
                    this.b[iJ] = obj;
                    iJ++;
                } else {
                    z = true;
                }
                i++;
            }
            rnt.af(this.b, null, iJ, iJ2);
        } else {
            int length = this.b.length;
            boolean z2 = false;
            int i2 = i;
            while (i < length) {
                Object[] objArr = this.b;
                Object obj2 = objArr[i];
                objArr[i] = null;
                if (collection.contains(obj2)) {
                    this.b[i2] = obj2;
                    i2++;
                } else {
                    z2 = true;
                }
                i++;
            }
            iJ = j(i2);
            for (int i3 = 0; i3 < iJ2; i3++) {
                Object[] objArr2 = this.b;
                Object obj3 = objArr2[i3];
                objArr2[i3] = null;
                if (collection.contains(obj3)) {
                    this.b[iJ] = obj3;
                    iJ = h(iJ);
                } else {
                    z2 = true;
                }
            }
            z = z2;
        }
        if (!z) {
            return z;
        }
        n();
        this.c = i(iJ - this.a);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a.ai(i, this.c);
        int iJ = j(this.a + i);
        Object[] objArr = this.b;
        Object obj2 = objArr[iJ];
        objArr[iJ] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.c]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) throws NegativeArraySizeException {
        objArr.getClass();
        int length = objArr.length;
        int i = this.c;
        if (length < i) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            objNewInstance.getClass();
            objArr = (Object[]) objNewInstance;
        }
        int iJ = j(this.a + this.c);
        int i2 = this.a;
        if (i2 < iJ) {
            rnt.aJ(this.b, objArr, i2, iJ, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.b;
            rnt.ay(objArr2, objArr, 0, i2, objArr2.length);
            Object[] objArr3 = this.b;
            rnt.ay(objArr3, objArr, objArr3.length - this.a, 0, iJ);
        }
        ske.bX(this.c, objArr);
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        n();
        l(this.c + collection.size());
        k(j(this.a + this.c), collection);
        return true;
    }
}
