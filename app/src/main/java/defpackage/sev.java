package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes.dex */
final class sev extends rzm {
    private static final long serialVersionUID = 0;
    private final seo d;

    public sev(seo seoVar, rzw rzwVar) {
        super(rzwVar);
        this.d = seoVar;
    }

    public static boolean S(Comparable comparable, Comparable comparable2) {
        return seo.b(comparable, comparable2) == 0;
    }

    private final rzm T(seo seoVar) {
        seo seoVar2 = this.d;
        return seoVar2.m(seoVar) ? rzm.a(seoVar2.g(seoVar), this.a) : new rzy(this.a);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.scn
    public final sbp C() {
        boolean z = this.a.b;
        return new set(this);
    }

    @Override // defpackage.scv, java.util.SortedSet
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final Comparable first() {
        Comparable comparableD = this.d.b.d(this.a);
        comparableD.getClass();
        return comparableD;
    }

    @Override // defpackage.scv, java.util.SortedSet
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public final Comparable last() {
        Comparable comparableC = this.d.c.c(this.a);
        comparableC.getClass();
        return comparableC;
    }

    @Override // defpackage.sbe, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return this.d.a((Comparable) obj);
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return ujp.bn(this, collection);
    }

    @Override // defpackage.rzm, defpackage.scv
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final rzm n(Comparable comparable, boolean z) {
        seo seoVar = seo.a;
        return T(rnt.r(z) + (-1) != 0 ? seo.d(comparable) : new seo(rzp.a, new rzq(comparable)));
    }

    @Override // defpackage.scn, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sev) {
            sev sevVar = (sev) obj;
            if (this.a.equals(sevVar.a)) {
                return first().equals(sevVar.first()) && last().equals(sevVar.last());
            }
        }
        return super.equals(obj);
    }

    @Override // defpackage.sbe
    public final boolean fA() {
        return false;
    }

    @Override // defpackage.scv, java.util.NavigableSet
    /* renamed from: fy */
    public final sgj descendingIterator() {
        return new ses(this, last());
    }

    @Override // defpackage.scv, defpackage.scn, defpackage.sbe, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: fz */
    public final sgj listIterator() {
        return new ser(this, first());
    }

    @Override // defpackage.rzm, defpackage.scv
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final rzm q(Comparable comparable, boolean z, Comparable comparable2, boolean z2) {
        if (comparable.compareTo(comparable2) == 0 && !z && !z2) {
            return new rzy(this.a);
        }
        int iR = rnt.r(z);
        seo seoVar = seo.a;
        return T(new seo(iR == 1 ? new rzo(comparable) : new rzq(comparable), rnt.r(z2) == 1 ? new rzq(comparable2) : new rzo(comparable2)));
    }

    @Override // defpackage.scn, java.util.Collection, java.util.Set
    public final int hashCode() {
        return ujp.ah(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return false;
    }

    @Override // defpackage.rzm, defpackage.scv
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final rzm t(Comparable comparable, boolean z) {
        seo seoVar = seo.a;
        return T(rnt.r(z) + (-1) != 0 ? seo.c(comparable) : new seo(new rzo(comparable), rzn.a));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        long jA = this.a.a(first(), last());
        if (jA >= 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return ((int) jA) + 1;
    }

    @Override // defpackage.rzm
    public final seo u() {
        seo seoVar = this.d;
        rzr rzrVar = seoVar.b;
        rzw rzwVar = this.a;
        return new seo(rzrVar.h(rzwVar), seoVar.c.i(rzwVar));
    }

    @Override // defpackage.rzm, defpackage.scv, defpackage.scn, defpackage.sbe
    public Object writeReplace() {
        return new seu(this.d, this.a);
    }
}
