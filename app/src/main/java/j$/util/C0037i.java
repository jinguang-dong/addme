package j$.util;

import java.util.RandomAccess;

/* renamed from: j$.util.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0037i extends C0035g implements RandomAccess {
    private static final long serialVersionUID = 1530674583602358482L;

    private Object writeReplace() {
        return new C0035g(this.c);
    }

    @Override // j$.util.C0035g, java.util.List
    public final java.util.List subList(int i, int i2) {
        C0037i c0037i;
        synchronized (this.b) {
            c0037i = new C0037i(this.c.subList(i, i2), this.b);
        }
        return c0037i;
    }
}
