package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
class zt implements Set, ukd {
    public final zq b;

    public zt(zq zqVar) {
        this.b = zqVar;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(Object obj) {
        return a.b();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        return a.c();
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        a.a();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.b.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.b.a(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return a.ao(this.b, ((zt) obj).b);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.b.b();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return ujp.K(new zs(this, null));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return a.b();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        return a.c();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        return a.c();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return this.b.g;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return ujj.a(this);
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return ujj.b(this, objArr);
    }
}
