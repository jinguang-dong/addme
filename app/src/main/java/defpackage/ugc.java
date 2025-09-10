package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ugc implements Iterator, ukd {
    private final Iterator a;
    private int b;

    public ugc(Iterator it) {
        this.a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.b;
        this.b = i + 1;
        if (i < 0) {
            ske.bp();
        }
        return new uga(i, this.a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.a();
    }
}
