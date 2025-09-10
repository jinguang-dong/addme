package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aze implements Iterator, ukd {
    private final baw a;
    private final int b;
    private int c;
    private final int d;

    public aze(baw bawVar, int i, int i2) {
        this.a = bawVar;
        this.b = i2;
        this.c = i;
        this.d = bawVar.g;
        if (bawVar.f) {
            bay.g();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c < this.b;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        baw bawVar = this.a;
        int i = bawVar.g;
        int i2 = this.d;
        if (i != i2) {
            bay.g();
        }
        int i3 = this.c;
        this.c = bay.a(bawVar.a, i3) + i3;
        return new bax(bawVar, i3, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.a();
    }
}
