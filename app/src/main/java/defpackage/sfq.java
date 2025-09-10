package defpackage;

import java.util.Iterator;
import java.util.NavigableSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sfq extends sfp implements NavigableSet {
    public sfq(sfo sfoVar) {
        super(sfoVar);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return sla.b(this.a.s(obj, 2).j());
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new sfq(this.a.n());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return sla.b(this.a.r(obj, 2).k());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return new sfq(this.a.r(obj, rnt.r(z)));
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return sla.b(this.a.s(obj, 1).j());
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return sla.b(this.a.r(obj, 1).k());
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        return sla.b(this.a.l());
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        return sla.b(this.a.m());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        int iR = rnt.r(z2);
        return new sfq(this.a.q(obj, rnt.r(z), obj2, iR));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return new sfq(this.a.s(obj, rnt.r(z)));
    }
}
