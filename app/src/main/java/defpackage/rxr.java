package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rxr extends sdx {
    final transient Map a;
    final /* synthetic */ ryb b;

    public rxr(ryb rybVar, Map map) {
        this.b = rybVar;
        this.a = map;
    }

    @Override // defpackage.sdx
    public final Set a() {
        return new rxp(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map = this.a;
        ryb rybVar = this.b;
        if (map == rybVar.a) {
            rybVar.l();
        } else {
            ujp.aL(new rxq(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.a;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.a.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) ujp.ay(this.a, obj);
        if (collection == null) {
            return null;
        }
        return this.b.c(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.sdx, java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.b.r();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.a.remove(obj);
        if (collection == null) {
            return null;
        }
        ryb rybVar = this.b;
        Collection collectionA = rybVar.a();
        collectionA.addAll(collection);
        rybVar.b -= collection.size();
        collection.clear();
        return collectionA;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.a.toString();
    }
}
