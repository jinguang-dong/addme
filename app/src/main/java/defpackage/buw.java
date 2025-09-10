package defpackage;

import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class buw implements ListIterator, ukd {
    final /* synthetic */ buy a;
    private int b;
    private final int c;
    private final int d;

    public buw(buy buyVar, int i, int i2, int i3) {
        this.a = buyVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        a.i();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.d;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b > this.c;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.b;
        this.b = i + 1;
        Object objC = this.a.b.c(i);
        objC.getClass();
        return (bij) objC;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b - this.c;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        int i = this.b - 1;
        this.b = i;
        Object objC = this.a.b.c(i);
        objC.getClass();
        return (bij) objC;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return (this.b - this.c) - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a.a();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        a.i();
    }

    public /* synthetic */ buw(buy buyVar, int i, int i2) {
        this(buyVar, 1 == (i2 & 1) ? 0 : i, 0, buyVar.a());
    }
}
