package defpackage;

import java.util.AbstractCollection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ryf extends AbstractCollection {
    final /* synthetic */ ryg a;

    public ryf(ryg rygVar) {
        this.a = rygVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.l();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.t(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.a.h();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.e();
    }
}
