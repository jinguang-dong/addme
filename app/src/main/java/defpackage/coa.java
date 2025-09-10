package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class coa implements Iterator, ukd {
    private final uiq a;
    private final List b = new ArrayList();
    private Iterator c;

    public coa(Iterator it, uiq uiqVar) {
        this.a = uiqVar;
        this.c = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c.hasNext();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Iterator] */
    @Override // java.util.Iterator
    public final Object next() {
        Object next = this.c.next();
        ?? A = this.a.a(next);
        if (A != 0 && A.hasNext()) {
            this.b.add(this.c);
            this.c = A;
            return next;
        }
        while (!this.c.hasNext()) {
            List list = this.b;
            if (list.isEmpty()) {
                break;
            }
            this.c = (Iterator) ske.bF(list);
            ske.bt(list);
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.a();
    }
}
