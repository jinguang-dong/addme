package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uln implements Iterator, ukd {
    final /* synthetic */ ulq a;
    private final Iterator b;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, uli] */
    public uln(ulq ulqVar) {
        this.a = ulqVar;
        this.b = ulqVar.b.a();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, uiq] */
    @Override // java.util.Iterator
    public final Object next() {
        return this.a.a.a(this.b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.a();
    }
}
