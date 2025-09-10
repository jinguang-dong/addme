package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ohb implements Iterator {
    protected final oha a;
    protected int b = -1;

    public ohb(oha ohaVar) {
        this.a = ohaVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.b() + (-1);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            oha ohaVar = this.a;
            int i = this.b + 1;
            this.b = i;
            return ohaVar.c(i);
        }
        throw new NoSuchElementException("Cannot advance the iterator beyond " + this.b);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
