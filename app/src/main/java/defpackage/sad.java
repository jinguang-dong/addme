package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class sad extends sai implements Collection {
    protected sad() {
    }

    @Override // defpackage.sai
    protected /* bridge */ /* synthetic */ Object a() {
        throw null;
    }

    public boolean add(Object obj) {
        return b().add(obj);
    }

    public boolean addAll(Collection collection) {
        return b().addAll(collection);
    }

    protected abstract Collection b();

    public void clear() {
        b().clear();
    }

    public boolean contains(Object obj) {
        return b().contains(obj);
    }

    public boolean containsAll(Collection collection) {
        return b().containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return b().isEmpty();
    }

    public Iterator iterator() {
        return b().iterator();
    }

    public boolean remove(Object obj) {
        return b().remove(obj);
    }

    public boolean removeAll(Collection collection) {
        return b().removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        return b().retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return b().size();
    }

    protected final boolean t(Collection collection) {
        Iterator it = iterator();
        collection.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public Object[] toArray() {
        return b().toArray();
    }

    protected final Object[] u() {
        return toArray(new Object[size()]);
    }

    public Object[] toArray(Object[] objArr) {
        return b().toArray(objArr);
    }
}
