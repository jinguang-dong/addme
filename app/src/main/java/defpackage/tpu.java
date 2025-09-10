package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tpu extends AbstractSet {
    final /* synthetic */ tpv a;
    private final Set b;

    public tpu(tpv tpvVar, Set set) {
        this.a = tpvVar;
        this.b = set;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new tpt(this.a, this.b.iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.b.size();
    }
}
