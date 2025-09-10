package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class ryi extends AbstractCollection implements sed {
    public transient Set a;
    private transient Set b;

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.sed
    public final boolean add(Object obj) {
        h(obj, 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (!(collection instanceof sed)) {
            if (collection.isEmpty()) {
                return false;
            }
            return ujp.aM(this, collection.iterator());
        }
        sed sedVar = (sed) collection;
        if (sedVar instanceof ryc) {
            if (((ryc) sedVar).isEmpty()) {
                return false;
            }
            throw null;
        }
        if (sedVar.isEmpty()) {
            return false;
        }
        for (sec secVar : sedVar.g()) {
            h(secVar.b(), secVar.a());
        }
        return true;
    }

    public abstract int b();

    public abstract Iterator c();

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.sed
    public final boolean contains(Object obj) {
        return fw(obj) > 0;
    }

    @Override // defpackage.sed
    public int d(Object obj, int i) {
        throw null;
    }

    public Set e() {
        throw null;
    }

    @Override // java.util.Collection, defpackage.sed
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sed) {
            sed sedVar = (sed) obj;
            if (size() != sedVar.size() || g().size() != sedVar.g().size()) {
                return false;
            }
            for (sec secVar : sedVar.g()) {
                if (fw(secVar.b()) != secVar.a()) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.sed
    public Set f() {
        throw null;
    }

    @Override // defpackage.sed
    public final Set g() {
        Set set = this.b;
        if (set != null) {
            return set;
        }
        ryh ryhVar = new ryh(this);
        this.b = ryhVar;
        return ryhVar;
    }

    @Override // defpackage.sed
    public void h(Object obj, int i) {
        throw null;
    }

    @Override // java.util.Collection, defpackage.sed
    public final int hashCode() {
        return g().hashCode();
    }

    @Override // defpackage.sed
    public boolean i(Object obj, int i) {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return g().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.sed
    public final boolean remove(Object obj) {
        return d(obj, 1) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection instanceof sed) {
            collection = ((sed) collection).f();
        }
        return f().removeAll(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        if (collection instanceof sed) {
            collection = ((sed) collection).f();
        }
        return f().retainAll(collection);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return g().toString();
    }
}
