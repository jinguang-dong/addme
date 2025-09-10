package defpackage;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
class rxw implements Iterator {
    final Iterator a;
    final Collection b;
    final /* synthetic */ rxx c;

    public rxw(rxx rxxVar, Iterator it) {
        this.c = rxxVar;
        this.b = rxxVar.b;
        this.a = it;
    }

    final void a() {
        rxx rxxVar = this.c;
        rxxVar.b();
        if (rxxVar.b != this.b) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        return this.a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
        rxx rxxVar = this.c;
        ryb rybVar = rxxVar.e;
        rybVar.b--;
        rxxVar.c();
    }

    public rxw(rxx rxxVar) {
        this.c = rxxVar;
        this.b = rxxVar.b;
        Collection collection = rxxVar.b;
        this.a = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }
}
