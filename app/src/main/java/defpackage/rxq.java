package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rxq implements Iterator {
    final Iterator a;
    Collection b;
    final /* synthetic */ rxr c;

    public rxq(rxr rxrVar) {
        this.c = rxrVar;
        this.a = rxrVar.a.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.a.next();
        this.b = (Collection) entry.getValue();
        Object key = entry.getKey();
        return new sbf(key, this.c.b.c(key, (Collection) entry.getValue()));
    }

    @Override // java.util.Iterator
    public final void remove() {
        rnt.M(this.b != null, "no calls to next() since the last call to remove()");
        this.a.remove();
        this.c.b.b -= this.b.size();
        this.b.clear();
        this.b = null;
    }
}
