package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qmt implements Iterator {
    final /* synthetic */ qmu a;
    private int b = 0;

    public qmt(qmu qmuVar) {
        this.a = qmuVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.a.length;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.b;
        this.b = i + 1;
        return Integer.valueOf(this.a.a[i]);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("IntSets are immutable!");
    }
}
