package defpackage;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rzh extends AbstractSet implements Serializable {
    transient Object[] a;
    public transient int b;
    private transient Object c;
    private transient int[] d;
    private transient int e;

    rzh() {
        f(3);
    }

    private final int h() {
        return (1 << (this.b & 31)) - 1;
    }

    private final int i(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object objBj = ujp.bj(i2);
        if (i4 != 0) {
            ujp.bl(objBj, i3 & i5, i4 + 1);
        }
        Object objJ = j();
        int[] iArrL = l();
        for (int i6 = 0; i6 <= i; i6++) {
            int iBh = ujp.bh(objJ, i6);
            while (iBh != 0) {
                int i7 = iBh - 1;
                int i8 = iArrL[i7];
                int iBd = ujp.bd(i8, i) | i6;
                int i9 = iBd & i5;
                int iBh2 = ujp.bh(objBj, i9);
                ujp.bl(objBj, i9, iBh);
                iArrL[i7] = ujp.be(iBd, iBh2, i5);
                iBh = i8 & i;
            }
        }
        this.c = objBj;
        k(i5);
        return i5;
    }

    private final Object j() {
        Object obj = this.c;
        obj.getClass();
        return obj;
    }

    private final void k(int i) {
        this.b = ujp.be(this.b, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    private final int[] l() {
        int[] iArr = this.d;
        iArr.getClass();
        return iArr;
    }

    private final Object[] m() {
        Object[] objArr = this.a;
        objArr.getClass();
        return objArr;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(a.bv(i, "Invalid size: "));
        }
        f(i);
        for (int i2 = 0; i2 < i; i2++) {
            add(objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    final int a() {
        return isEmpty() ? -1 : 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int iMin;
        if (g()) {
            rnt.M(g(), "Arrays already allocated");
            int i = this.b;
            int iBi = ujp.bi(i);
            this.c = ujp.bj(iBi);
            k(iBi - 1);
            this.d = new int[i];
            this.a = new Object[i];
        }
        Set setD = d();
        if (setD != null) {
            return setD.add(obj);
        }
        int[] iArrL = l();
        Object[] objArrM = m();
        int i2 = this.e;
        int i3 = i2 + 1;
        int iBb = ujp.bb(obj);
        int iH = h();
        int i4 = iBb & iH;
        int iBh = ujp.bh(j(), i4);
        if (iBh != 0) {
            int iBd = ujp.bd(iBb, iH);
            int i5 = 0;
            while (true) {
                int i6 = iBh - 1;
                int i7 = iArrL[i6];
                if (ujp.bd(i7, iH) == iBd && a.K(obj, objArrM[i6])) {
                    return false;
                }
                int i8 = i7 & iH;
                i5++;
                if (i8 != 0) {
                    iBh = i8;
                } else {
                    if (i5 >= 9) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet(h() + 1, 1.0f);
                        int iA = a();
                        while (iA >= 0) {
                            linkedHashSet.add(c(iA));
                            iA = b(iA);
                        }
                        this.c = linkedHashSet;
                        this.d = null;
                        this.a = null;
                        e();
                        return linkedHashSet.add(obj);
                    }
                    if (i3 > iH) {
                        iH = i(iH, ujp.bf(iH), iBb, i2);
                    } else {
                        iArrL[i6] = ujp.be(i7, i3, iH);
                    }
                }
            }
        } else if (i3 > iH) {
            iH = i(iH, ujp.bf(iH), iBb, i2);
        } else {
            ujp.bl(j(), i4, i3);
        }
        int length = l().length;
        if (i3 > length && (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.d = Arrays.copyOf(l(), iMin);
            this.a = Arrays.copyOf(m(), iMin);
        }
        l()[i2] = ujp.be(iBb, 0, iH);
        m()[i2] = obj;
        this.e = i3;
        e();
        return true;
    }

    final int b(int i) {
        int i2 = i + 1;
        if (i2 < this.e) {
            return i2;
        }
        return -1;
    }

    public final Object c(int i) {
        return m()[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (g()) {
            return;
        }
        e();
        Set setD = d();
        if (setD != null) {
            this.b = ske.Z(size(), 3, 1073741823);
            setD.clear();
            this.c = null;
            this.e = 0;
            return;
        }
        Arrays.fill(m(), 0, this.e, (Object) null);
        ujp.bk(j());
        Arrays.fill(l(), 0, this.e, 0);
        this.e = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (g()) {
            return false;
        }
        Set setD = d();
        if (setD != null) {
            return setD.contains(obj);
        }
        int iBb = ujp.bb(obj);
        int iH = h();
        int iBh = ujp.bh(j(), iBb & iH);
        if (iBh == 0) {
            return false;
        }
        int iBd = ujp.bd(iBb, iH);
        do {
            int i = iBh - 1;
            int i2 = l()[i];
            if (ujp.bd(i2, iH) == iBd && a.K(obj, c(i))) {
                return true;
            }
            iBh = i2 & iH;
        } while (iBh != 0);
        return false;
    }

    final Set d() {
        Object obj = this.c;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    final void e() {
        this.b += 32;
    }

    final void f(int i) {
        rnt.B(true, "Expected size must be >= 0");
        this.b = ske.Z(i, 1, 1073741823);
    }

    final boolean g() {
        return this.c == null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Set setD = d();
        return setD != null ? setD.iterator() : new rzg(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i;
        int i2;
        if (!g()) {
            Set setD = d();
            if (setD != null) {
                return setD.remove(obj);
            }
            int iH = h();
            int iBg = ujp.bg(obj, null, iH, j(), l(), m(), null);
            if (iBg != -1) {
                Object objJ = j();
                int[] iArrL = l();
                Object[] objArrM = m();
                int size = size();
                int i3 = size - 1;
                if (iBg < i3) {
                    int i4 = iBg + 1;
                    Object obj2 = objArrM[i3];
                    objArrM[iBg] = obj2;
                    objArrM[i3] = null;
                    iArrL[iBg] = iArrL[i3];
                    iArrL[i3] = 0;
                    int iBb = ujp.bb(obj2) & iH;
                    int iBh = ujp.bh(objJ, iBb);
                    if (iBh == size) {
                        ujp.bl(objJ, iBb, i4);
                    } else {
                        while (true) {
                            i = iBh - 1;
                            i2 = iArrL[i];
                            int i5 = i2 & iH;
                            if (i5 == size) {
                                break;
                            }
                            iBh = i5;
                        }
                        iArrL[i] = ujp.be(i2, i4, iH);
                    }
                } else {
                    objArrM[iBg] = null;
                    iArrL[iBg] = 0;
                }
                this.e--;
                e();
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Set setD = d();
        return setD != null ? setD.size() : this.e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        if (g()) {
            return new Object[0];
        }
        Set setD = d();
        return setD != null ? setD.toArray() : Arrays.copyOf(m(), this.e);
    }

    public rzh(int i) {
        f(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (g()) {
            if (objArr.length > 0) {
                objArr[0] = null;
            }
            return objArr;
        }
        Set setD = d();
        if (setD != null) {
            return setD.toArray(objArr);
        }
        Object[] objArrM = m();
        int i = this.e;
        rnt.K(0, i, objArrM.length);
        int length = objArr.length;
        if (length < i) {
            objArr = ujp.ao(objArr, i);
        } else if (length > i) {
            objArr[i] = null;
        }
        System.arraycopy(objArrM, 0, objArr, 0, i);
        return objArr;
    }
}
