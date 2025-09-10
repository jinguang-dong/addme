package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class scn extends sbe implements Set, j$.util.Set {
    private static final long serialVersionUID = 912559;
    private transient sbp a;

    static int B(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            rnt.B(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (iHighestOneBit * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static scl D(int i) {
        ujp.bq(i, "expectedSize");
        return new scl(i);
    }

    public static scn E(int i, Object... objArr) {
        if (i == 0) {
            return sfd.a;
        }
        if (i == 1) {
            Object obj = objArr[0];
            obj.getClass();
            return new sfm(obj);
        }
        int iB = B(i);
        Object[] objArr2 = new Object[iB];
        int i2 = iB - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            ujp.aq(obj2, i5);
            int iHashCode = obj2.hashCode();
            int iBa = ujp.ba(iHashCode);
            while (true) {
                int i6 = iBa & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    iBa++;
                }
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new sfm(obj4);
        }
        if (B(i4) < iB / 2) {
            return E(i4, objArr);
        }
        if (M(i4, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new sfd(objArr, i3, objArr2, i2, i4);
    }

    public static scn F(Collection collection) {
        if ((collection instanceof scn) && !(collection instanceof SortedSet)) {
            scn scnVar = (scn) collection;
            if (!scnVar.fA()) {
                return scnVar;
            }
        }
        Object[] array = collection.toArray();
        return E(array.length, array);
    }

    public static scn G(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? E(length, (Object[]) objArr.clone()) : new sfm(objArr[0]) : sfd.a;
    }

    public static scn H(Object obj, Object obj2) {
        return E(2, obj, obj2);
    }

    public static scn I(Object obj, Object obj2, Object obj3) {
        return E(3, obj, obj2, obj3);
    }

    public static scn J(Object obj, Object obj2, Object obj3, Object obj4) {
        return E(4, obj, obj2, obj3, obj4);
    }

    public static scn K(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return E(5, obj, obj2, obj3, obj4, obj5);
    }

    @SafeVarargs
    public static scn L(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        rnt.B(true, "the total number of elements must fit in an int");
        int length = objArr.length;
        int i = length + 6;
        Object[] objArr2 = new Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, length);
        return E(i, objArr2);
    }

    public static boolean M(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public sbp C() {
        return sbp.f(toArray());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof scn) && w() && ((scn) obj).w() && hashCode() != obj.hashCode()) {
            return false;
        }
        return ujp.al(this, obj);
    }

    @Override // defpackage.sbe, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: fz, reason: merged with bridge method [inline-methods] */
    public abstract sgj listIterator();

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return ujp.ah(this);
    }

    @Override // defpackage.sbe
    public sbp v() {
        sbp sbpVar = this.a;
        if (sbpVar != null) {
            return sbpVar;
        }
        sbp sbpVarC = C();
        this.a = sbpVarC;
        return sbpVarC;
    }

    public boolean w() {
        return false;
    }

    @Override // defpackage.sbe
    public Object writeReplace() {
        return new scm(toArray());
    }
}
