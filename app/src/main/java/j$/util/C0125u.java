package j$.util;

import java.util.Comparator;

/* renamed from: j$.util.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0125u extends C0124t implements java.util.SortedSet, SortedSet {
    private static final long serialVersionUID = -4929149591599911165L;
    public final java.util.SortedSet b;

    public C0125u(java.util.SortedSet sortedSet) {
        super(sortedSet);
        this.b = sortedSet;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.b.comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return this.b.first();
    }

    @Override // java.util.SortedSet
    public final java.util.SortedSet headSet(Object obj) {
        return new C0125u(this.b.headSet(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return this.b.last();
    }

    @Override // java.util.SortedSet
    public final java.util.SortedSet subSet(Object obj, Object obj2) {
        return new C0125u(this.b.subSet(obj, obj2));
    }

    @Override // java.util.SortedSet
    public final java.util.SortedSet tailSet(Object obj) {
        return new C0125u(this.b.tailSet(obj));
    }
}
