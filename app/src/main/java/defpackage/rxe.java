package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rxe implements Iterator {
    Map.Entry a;
    final /* synthetic */ Iterator b;
    final /* synthetic */ rxk c;

    public rxe(rxk rxkVar, Iterator it) {
        this.b = it;
        this.c = rxkVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.a = (Map.Entry) this.b.next();
        return new rxf(this.c, this.a);
    }

    @Override // java.util.Iterator
    public final void remove() {
        Map.Entry entry = this.a;
        if (entry == null) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        Iterator it = this.b;
        Object value = entry.getValue();
        it.remove();
        this.c.h(value);
        this.a = null;
    }
}
