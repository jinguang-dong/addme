package j$.util;

import java.util.RandomAccess;

/* renamed from: j$.util.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0046s extends C0042n implements RandomAccess {
    private static final long serialVersionUID = -2542308836966382001L;

    private Object writeReplace() {
        return new C0042n(this.b);
    }

    @Override // j$.util.C0042n, java.util.List
    public final java.util.List subList(int i, int i2) {
        return new C0046s(this.b.subList(i, i2));
    }
}
