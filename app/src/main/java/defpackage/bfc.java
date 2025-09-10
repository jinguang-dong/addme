package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bfc implements Iterator, ukd {
    private Object a;
    private final Map b;
    private int c;

    public bfc(Object obj, Map map) {
        this.a = obj;
        this.b = map;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c < this.b.size();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = this.a;
        this.c++;
        Object obj2 = this.b.get(obj);
        if (obj2 == null) {
            throw new ConcurrentModificationException(a.bz(obj, "Hash code of an element (", ") has changed after it was added to the persistent set."));
        }
        this.a = ((byz) obj2).a;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.a();
    }
}
