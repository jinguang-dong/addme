package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rxu extends sdv {
    final /* synthetic */ ryb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rxu(ryb rybVar, Map map) {
        super(map);
        this.a = rybVar;
    }

    @Override // defpackage.sdv, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        ujp.aL(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.b.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.b.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.b.keySet().hashCode();
    }

    @Override // defpackage.sdv, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new rxt(this, this.b.entrySet().iterator());
    }

    @Override // defpackage.sdv, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.b.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        this.a.b -= size;
        return size > 0;
    }
}
