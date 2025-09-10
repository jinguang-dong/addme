package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sfe extends scv {
    public static final sfe a;
    final transient sbp d;

    static {
        int i = sbp.d;
        a = new sfe(sex.a, sel.a);
    }

    public sfe(sbp sbpVar, Comparator comparator) {
        super(comparator);
        this.d = sbpVar;
    }

    @Override // defpackage.sbe
    public final Object[] A() {
        return this.d.A();
    }

    @Override // defpackage.scv, java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int iF = f(obj, true);
        if (iF == size()) {
            return null;
        }
        return this.d.get(iF);
    }

    @Override // defpackage.sbe, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.d, obj, this.b) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof sed) {
            collection = ((sed) collection).f();
        }
        if (!sla.d(this.b, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        sgj sgjVarListIterator = listIterator();
        Iterator it = collection.iterator();
        if (!sgjVarListIterator.hasNext()) {
            return false;
        }
        Object next = it.next();
        Object next2 = sgjVarListIterator.next();
        while (true) {
            try {
                int iN = N(next2, next);
                if (iN >= 0) {
                    if (iN != 0) {
                        break;
                    }
                    if (!it.hasNext()) {
                        return true;
                    }
                    next = it.next();
                } else {
                    if (!sgjVarListIterator.hasNext()) {
                        return false;
                    }
                    next2 = sgjVarListIterator.next();
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    final int e(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.d, obj, this.b);
        return iBinarySearch >= 0 ? z ? iBinarySearch + 1 : iBinarySearch : ~iBinarySearch;
    }

    @Override // defpackage.scn, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!sla.d(this.b, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            sgj sgjVarListIterator = listIterator();
            while (sgjVarListIterator.hasNext()) {
                Object next = sgjVarListIterator.next();
                Object next2 = it.next();
                if (next2 == null || N(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    final int f(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.d, obj, this.b);
        return iBinarySearch >= 0 ? z ? iBinarySearch : iBinarySearch + 1 : ~iBinarySearch;
    }

    @Override // defpackage.sbe
    public final boolean fA() {
        return this.d.fA();
    }

    @Override // defpackage.scv, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.d.get(0);
    }

    @Override // defpackage.scv, java.util.NavigableSet
    public final Object floor(Object obj) {
        int iE = e(obj, true) - 1;
        if (iE == -1) {
            return null;
        }
        return this.d.get(iE);
    }

    @Override // defpackage.scv, java.util.NavigableSet
    /* renamed from: fy */
    public final sgj descendingIterator() {
        return this.d.fB().iterator();
    }

    @Override // defpackage.scv, defpackage.scn, defpackage.sbe, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: fz */
    public final sgj listIterator() {
        return this.d.iterator();
    }

    final sfe g(int i, int i2) {
        if (i == 0) {
            if (i2 == size()) {
                return this;
            }
            i = 0;
        }
        if (i >= i2) {
            return P(this.b);
        }
        sbp sbpVar = this.d;
        return new sfe(sbpVar.subList(i, i2), this.b);
    }

    @Override // defpackage.scv, java.util.NavigableSet
    public final Object higher(Object obj) {
        int iF = f(obj, false);
        if (iF == size()) {
            return null;
        }
        return this.d.get(iF);
    }

    @Override // defpackage.scv
    public final scv k() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.b);
        return isEmpty() ? P(comparatorReverseOrder) : new sfe(this.d.fB(), comparatorReverseOrder);
    }

    @Override // defpackage.scv, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.d.get(size() - 1);
    }

    @Override // defpackage.scv, java.util.NavigableSet
    public final Object lower(Object obj) {
        int iE = e(obj, false) - 1;
        if (iE == -1) {
            return null;
        }
        return this.d.get(iE);
    }

    @Override // defpackage.scv
    public final scv n(Object obj, boolean z) {
        return g(0, e(obj, z));
    }

    @Override // defpackage.scv
    public final scv q(Object obj, boolean z, Object obj2, boolean z2) {
        return t(obj, z).n(obj2, z2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.d.size();
    }

    @Override // defpackage.scv
    public final scv t(Object obj, boolean z) {
        return g(f(obj, z), size());
    }

    @Override // defpackage.scn, defpackage.sbe
    public final sbp v() {
        return this.d;
    }

    @Override // defpackage.scv, defpackage.scn, defpackage.sbe
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // defpackage.sbe
    public final int x(Object[] objArr, int i) {
        return this.d.x(objArr, i);
    }

    @Override // defpackage.sbe
    public final int y() {
        return this.d.y();
    }

    @Override // defpackage.sbe
    public final int z() {
        return this.d.z();
    }
}
