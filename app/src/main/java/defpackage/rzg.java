package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rzg implements Iterator {
    int a;
    int b;
    int c = -1;
    final /* synthetic */ rzh d;

    public rzg(rzh rzhVar) {
        this.d = rzhVar;
        this.a = rzhVar.b;
        this.b = rzhVar.a();
    }

    private final void a() {
        if (this.d.b != this.a) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.b;
        this.c = i;
        rzh rzhVar = this.d;
        Object objC = rzhVar.c(i);
        this.b = rzhVar.b(this.b);
        return objC;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        ujp.bp(this.c >= 0);
        this.a += 32;
        int i = this.c;
        rzh rzhVar = this.d;
        rzhVar.remove(rzhVar.c(i));
        this.b--;
        this.c = -1;
    }
}
