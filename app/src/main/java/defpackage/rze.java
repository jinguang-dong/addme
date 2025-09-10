package defpackage;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rze extends AbstractCollection {
    final /* synthetic */ rzf a;

    public rze(rzf rzfVar) {
        this.a = rzfVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        rzf rzfVar = this.a;
        Map mapJ = rzfVar.j();
        return mapJ != null ? mapJ.values().iterator() : new ryz(rzfVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size();
    }
}
