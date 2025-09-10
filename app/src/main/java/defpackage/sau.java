package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sau implements Iterator {
    final /* synthetic */ sav a;
    private int b;
    private int c;
    private int d;
    private int e;

    public sau(sav savVar) {
        this.a = savVar;
        saw sawVar = savVar.b;
        this.b = sawVar.e;
        this.c = -1;
        this.d = sawVar.d;
        this.e = sawVar.c;
    }

    private final void a() {
        if (this.a.b.d != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.b != -2 && this.e > 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        sav savVar = this.a;
        Object objA = savVar.a(this.b);
        int i = this.b;
        this.c = i;
        this.b = savVar.b.f[i];
        this.e--;
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        ujp.bp(this.c != -1);
        saw sawVar = this.a.b;
        int i = this.c;
        sawVar.i(i, ujp.bb(sawVar.a[i]));
        if (this.b == sawVar.c) {
            this.b = this.c;
        }
        this.c = -1;
        this.d = sawVar.d;
    }
}
