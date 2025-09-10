package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bax implements Iterable, bht, ukd {
    private final baw a;
    private final int b;
    private final int c;

    public bax(baw bawVar, int i, int i2) {
        this.a = bawVar;
        this.b = i;
        this.c = i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        baw bawVar = this.a;
        if (bawVar.g != this.c) {
            bay.g();
        }
        int i = this.b;
        return bawVar.h(i) != null ? new bbm() : new aze(bawVar, i + 1, i + bay.a(bawVar.a, i));
    }
}
