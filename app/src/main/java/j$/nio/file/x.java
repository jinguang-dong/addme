package j$.nio.file;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class x implements Iterator {
    public final Iterator a;

    public x(Iterator it) {
        this.a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return D.b(this.a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
    }
}
