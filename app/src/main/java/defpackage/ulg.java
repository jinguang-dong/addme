package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ulg implements Iterator, ukd {
    final /* synthetic */ ulh a;
    private Object b;
    private int c = -2;

    public ulg(ulh ulhVar) {
        this.a = ulhVar;
    }

    private final void a() {
        Object objA;
        if (this.c == -2) {
            objA = this.a.a.a();
        } else {
            ulh ulhVar = this.a;
            Object obj = this.b;
            obj.getClass();
            objA = ulhVar.b.a(obj);
        }
        this.b = objA;
        this.c = objA == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c < 0) {
            a();
        }
        return this.c == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.c < 0) {
            a();
        }
        if (this.c == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.b;
        obj.getClass();
        this.c = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.a();
    }
}
