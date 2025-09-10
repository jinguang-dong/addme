package defpackage;

import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bho implements ListIterator, ukd {
    final /* synthetic */ ujy a;
    final /* synthetic */ bhp b;

    public bho(ujy ujyVar, bhp bhpVar) {
        this.a = ujyVar;
        this.b = bhpVar;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        bha.b();
        throw new uer();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.a.a < this.b.a + (-1);
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.a.a >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        ujy ujyVar = this.a;
        int i = ujyVar.a + 1;
        bhp bhpVar = this.b;
        bha.a(i, bhpVar.a);
        ujyVar.a = i;
        return bhpVar.get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a.a + 1;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        ujy ujyVar = this.a;
        bhp bhpVar = this.b;
        int i = ujyVar.a;
        bha.a(i, bhpVar.a);
        ujyVar.a = i - 1;
        return bhpVar.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.a.a;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() {
        bha.b();
        throw new uer();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        bha.b();
        throw new uer();
    }
}
