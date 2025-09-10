package defpackage;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ugi implements ListIterator, ukd {
    private int a;
    private int b;
    private int c;
    private final /* synthetic */ int d;
    private final Object e;

    public ugi(bgz bgzVar, int i, int i2) {
        this.d = i2;
        this.e = bgzVar;
        this.c = i - 1;
        this.a = -1;
        this.b = bgzVar.b();
    }

    private final void a() {
        if (((ugj) this.e).d.modCount != this.c) {
            throw new ConcurrentModificationException();
        }
    }

    private final void b() {
        if (((bgz) this.e).b() != this.b) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        if (this.d != 0) {
            b();
            int i = this.c + 1;
            bgz bgzVar = (bgz) this.e;
            bgzVar.add(i, obj);
            this.a = -1;
            this.c++;
            this.b = bgzVar.b();
            return;
        }
        a();
        int i2 = this.a;
        this.a = i2 + 1;
        ugj ugjVar = (ugj) this.e;
        ugjVar.add(i2, obj);
        this.b = -1;
        this.c = ugjVar.modCount;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        if (this.d != 0) {
            return this.c < ((bgz) this.e).a() + (-1);
        }
        return this.a < ((ugj) this.e).c;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.d != 0 ? this.c >= 0 : this.a > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (this.d != 0) {
            b();
            int i = this.c + 1;
            this.a = i;
            bgz bgzVar = (bgz) this.e;
            bha.a(i, bgzVar.a());
            Object obj = bgzVar.get(i);
            this.c = i;
            return obj;
        }
        a();
        Object obj2 = this.e;
        int i2 = this.a;
        ugj ugjVar = (ugj) obj2;
        if (i2 >= ugjVar.c) {
            throw new NoSuchElementException();
        }
        this.a = i2 + 1;
        this.b = i2;
        return ugjVar.a[ugjVar.b + i2];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.d != 0 ? this.c + 1 : this.a;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (this.d != 0) {
            b();
            bgz bgzVar = (bgz) this.e;
            bha.a(this.c, bgzVar.a());
            int i = this.c;
            this.a = i;
            this.c--;
            return bgzVar.get(i);
        }
        a();
        int i2 = this.a;
        if (i2 <= 0) {
            throw new NoSuchElementException();
        }
        int i3 = i2 - 1;
        this.a = i3;
        this.b = i3;
        ugj ugjVar = (ugj) this.e;
        return ugjVar.a[ugjVar.b + i3];
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.d != 0 ? this.c : this.a - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        if (this.d != 0) {
            b();
            int i = this.c;
            bgz bgzVar = (bgz) this.e;
            bgzVar.f(i);
            this.c--;
            this.a = -1;
            this.b = bgzVar.b();
            return;
        }
        a();
        int i2 = this.b;
        if (i2 == -1) {
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
        }
        Object obj = this.e;
        ((ufp) obj).d(i2);
        this.a = this.b;
        this.b = -1;
        this.c = ((ugj) obj).modCount;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        if (this.d == 0) {
            a();
            int i = this.b;
            if (i == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            ((ugj) this.e).set(i, obj);
            return;
        }
        b();
        int i2 = this.a;
        if (i2 < 0) {
            throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
        }
        bgz bgzVar = (bgz) this.e;
        bgzVar.set(i2, obj);
        this.b = bgzVar.b();
    }

    public ugi(ugj ugjVar, int i, int i2) {
        this.d = i2;
        this.e = ugjVar;
        this.a = i;
        this.b = -1;
        this.c = ugjVar.modCount;
    }
}
