package defpackage;

import j$.util.List;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class sbp extends sbe implements List, RandomAccess, j$.util.List {
    private static final sgk a = new sbl(sex.a, 0);
    public static final /* synthetic */ int d = 0;
    private static final long serialVersionUID = -889275714;

    public static sbk e(int i) {
        ujp.bq(i, "expectedSize");
        return new sbk(i);
    }

    static sbp f(Object[] objArr) {
        return g(objArr, objArr.length);
    }

    static sbp g(Object[] objArr, int i) {
        return i == 0 ? sex.a : new sex(objArr, i);
    }

    public static sbp h(Object... objArr) {
        ujp.ar(objArr);
        return f(objArr);
    }

    public static sbp i(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return j((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return sex.a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return l(next);
        }
        sbk sbkVar = new sbk();
        sbkVar.h(next);
        sbkVar.k(it);
        return sbkVar.g();
    }

    public static sbp j(Collection collection) {
        if (!(collection instanceof sbe)) {
            return h(collection.toArray());
        }
        sbp sbpVarV = ((sbe) collection).v();
        return sbpVarV.fA() ? f(sbpVarV.toArray()) : sbpVarV;
    }

    public static sbp k(Object[] objArr) {
        return objArr.length == 0 ? sex.a : h((Object[]) objArr.clone());
    }

    public static sbp l(Object obj) {
        return h(obj);
    }

    public static sbp m(Object obj, Object obj2) {
        return h(obj, obj2);
    }

    public static sbp n(Object obj, Object obj2, Object obj3) {
        return h(obj, obj2, obj3);
    }

    public static sbp o(Object obj, Object obj2, Object obj3, Object obj4) {
        return h(obj, obj2, obj3, obj4);
    }

    public static sbp p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return h(obj, obj2, obj3, obj4, obj5);
    }

    public static sbp q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return h(obj, obj2, obj3, obj4, obj5, obj6);
    }

    public static sbp r(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return h(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @SafeVarargs
    public static sbp s(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        rnt.B(true, "the total number of elements must fit in an int");
        int length = objArr.length;
        Object[] objArr2 = new Object[length + 12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, length);
        return h(objArr2);
    }

    public static sbp t(Comparator comparator, Iterable iterable) {
        comparator.getClass();
        Object[] objArrAU = ujp.aU(iterable);
        ujp.ar(objArrAU);
        Arrays.sort(objArrAU, comparator);
        return f(objArrAU);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public sbp subList(int i, int i2) {
        rnt.K(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? sex.a : new sbo(this, i, i3);
    }

    @Override // defpackage.sbe, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        return ujp.aH(this, obj);
    }

    public sbp fB() {
        return size() <= 1 ? this : new sbm(this);
    }

    @Override // defpackage.sbe
    /* renamed from: fz */
    public final sgj listIterator() {
        return iterator();
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final /* synthetic */ void sort(Comparator comparator) {
        List.CC.$default$sort(this, comparator);
    }

    @Override // java.util.List
    /* renamed from: u, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final sgk listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final sgk listIterator(int i) {
        rnt.T(i, size());
        return isEmpty() ? a : new sbl(this, i);
    }

    @Override // defpackage.sbe
    public Object writeReplace() {
        return new sbn(toArray());
    }

    @Override // defpackage.sbe
    public int x(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // defpackage.sbe
    @Deprecated
    public final sbp v() {
        return this;
    }
}
