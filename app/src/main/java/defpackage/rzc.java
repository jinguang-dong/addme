package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rzc extends AbstractSet {
    final /* synthetic */ rzf a;

    public rzc(rzf rzfVar) {
        this.a = rzfVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        rzf rzfVar = this.a;
        Map mapJ = rzfVar.j();
        return mapJ != null ? mapJ.keySet().iterator() : new ryx(rzfVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        rzf rzfVar = this.a;
        Map mapJ = rzfVar.j();
        return mapJ != null ? mapJ.keySet().remove(obj) : rzfVar.f(obj) != rzf.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }
}
