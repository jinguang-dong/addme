package defpackage;

import j$.util.SortedSet;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.NavigableSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class scv extends scn implements NavigableSet, SortedSet, sfn {
    private static final long serialVersionUID = 912559;
    final transient Comparator b;
    transient scv c;

    public scv(Comparator comparator) {
        this.b = comparator;
    }

    public static scv O(Comparator comparator, int i, Object... objArr) {
        if (i == 0) {
            return P(comparator);
        }
        ujp.as(objArr, i);
        Arrays.sort(objArr, 0, i, comparator);
        int i2 = 1;
        for (int i3 = 1; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (comparator.compare(obj, objArr[i2 - 1]) != 0) {
                objArr[i2] = obj;
                i2++;
            }
        }
        Arrays.fill(objArr, i2, i, (Object) null);
        if (i2 < (objArr.length >> 1)) {
            objArr = Arrays.copyOf(objArr, i2);
        }
        return new sfe(sbp.g(objArr, i2), comparator);
    }

    static sfe P(Comparator comparator) {
        if (sel.a.equals(comparator)) {
            return sfe.a;
        }
        int i = sbp.d;
        return new sfe(sex.a, comparator);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    final int N(Object obj, Object obj2) {
        return this.b.compare(obj, obj2);
    }

    @Deprecated
    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Object ceiling(Object obj) {
        return ujp.aX(tailSet(obj, true));
    }

    @Override // java.util.SortedSet, defpackage.sfn
    public final Comparator comparator() {
        return this.b;
    }

    public Object first() {
        return listIterator().next();
    }

    public Object floor(Object obj) {
        return ujp.aN(m(obj, true).descendingIterator());
    }

    @Override // java.util.NavigableSet
    /* renamed from: fx, reason: merged with bridge method [inline-methods] */
    public scv descendingSet() {
        scv scvVar = this.c;
        if (scvVar != null) {
            return scvVar;
        }
        scv scvVarK = k();
        this.c = scvVarK;
        scvVarK.c = this;
        return scvVarK;
    }

    @Override // java.util.NavigableSet
    /* renamed from: fy, reason: merged with bridge method [inline-methods] */
    public abstract sgj descendingIterator();

    @Override // defpackage.scn, defpackage.sbe, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: fz */
    public abstract sgj listIterator();

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    public Object higher(Object obj) {
        return ujp.aX(tailSet(obj, false));
    }

    public abstract scv k();

    @Override // java.util.NavigableSet, java.util.SortedSet
    public scv l(Object obj) {
        return m(obj, false);
    }

    public Object last() {
        return descendingIterator().next();
    }

    public Object lower(Object obj) {
        return ujp.aN(m(obj, false).descendingIterator());
    }

    @Override // java.util.NavigableSet
    public scv m(Object obj, boolean z) {
        obj.getClass();
        return n(obj, z);
    }

    public abstract scv n(Object obj, boolean z);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: o */
    public scv subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet
    /* renamed from: p */
    public scv subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        a.I(this.b.compare(obj, obj2) <= 0);
        return q(obj, z, obj2, z2);
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    public abstract scv q(Object obj, boolean z, Object obj2, boolean z2);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: r */
    public scv tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Deprecated
    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    /* renamed from: s */
    public scv tailSet(Object obj, boolean z) {
        obj.getClass();
        return t(obj, z);
    }

    public abstract scv t(Object obj, boolean z);

    @Override // defpackage.scn, defpackage.sbe
    public Object writeReplace() {
        return new scu(this.b, toArray());
    }
}
