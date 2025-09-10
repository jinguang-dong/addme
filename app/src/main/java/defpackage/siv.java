package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class siv implements Iterator {
    final /* synthetic */ siw a;
    private int b = 0;

    public siv(siw siwVar) {
        this.a = siwVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.a.b;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.b;
        this.b = i + 1;
        siy siyVar = this.a.a;
        return siyVar.e(siyVar.a[i] & 31);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
