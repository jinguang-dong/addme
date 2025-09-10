package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yv implements Set, ukd {
    public final zu a;

    public yv(zu zuVar) {
        this.a = zuVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return a.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        return a.c();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        a.a();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return zu.e(this.a, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!zu.e(this.a, it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.a.c();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return ujp.K(new yu(this, (uhb) null, 0));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return a.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return a.c();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return a.c();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return this.a.e;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return ujj.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return ujj.b(this, objArr);
    }
}
