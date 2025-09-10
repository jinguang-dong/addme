package defpackage;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
class sfp extends seg implements SortedSet {
    public final sfo a;

    public sfp(sfo sfoVar) {
        this.a = sfoVar;
    }

    @Override // defpackage.seg
    public final /* synthetic */ sed a() {
        return this.a;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.a.comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return sla.c(this.a.j());
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return this.a.r(obj, 1).f();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new see(this.a.g().iterator());
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return sla.c(this.a.k());
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return this.a.q(obj, 2, obj2, 1).f();
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return this.a.s(obj, 2).f();
    }
}
