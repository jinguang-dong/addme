package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sej implements Iterator {
    private final sed a;
    private final Iterator b;
    private sec c;
    private int d;
    private int e;
    private boolean f;

    public sej(sed sedVar, Iterator it) {
        this.a = sedVar;
        this.b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d > 0 || this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int iA = this.d;
        if (iA == 0) {
            sec secVar = (sec) this.b.next();
            this.c = secVar;
            iA = secVar.a();
            this.e = iA;
        }
        this.d = iA - 1;
        this.f = true;
        sec secVar2 = this.c;
        secVar2.getClass();
        return secVar2.b();
    }

    @Override // java.util.Iterator
    public final void remove() {
        ujp.bp(this.f);
        if (this.e == 1) {
            this.b.remove();
        } else {
            sed sedVar = this.a;
            sec secVar = this.c;
            secVar.getClass();
            sedVar.remove(secVar.b());
        }
        this.e--;
        this.f = false;
    }
}
