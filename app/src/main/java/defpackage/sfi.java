package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sfi extends sfk {
    final /* synthetic */ Set a;
    final /* synthetic */ Set b;

    public sfi(Set set, Set set2) {
        this.a = set;
        this.b = set2;
    }

    @Override // defpackage.sfk
    public final int a() {
        return d(this.a);
    }

    @Override // defpackage.sfk
    public final int b() {
        return Math.max(e(this.a) - d(this.b), 0);
    }

    @Override // defpackage.sfk, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: c */
    public final sgj iterator() {
        return new sfh(this.a, this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.contains(obj) && !this.b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.b.containsAll(this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!this.b.contains(it.next())) {
                i++;
            }
        }
        return i;
    }
}
