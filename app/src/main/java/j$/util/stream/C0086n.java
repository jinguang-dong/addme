package j$.util.stream;

import j$.util.Optional;

/* renamed from: j$.util.stream.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0086n extends AbstractC0089o {
    public static final C0080l c;
    public static final C0080l d;

    static {
        F1 f1 = F1.REFERENCE;
        c = new C0080l(true, f1, Optional.empty(), new C0077k(3), new C0077k(4));
        d = new C0080l(false, f1, Optional.empty(), new C0077k(3), new C0077k(4));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return Optional.of(this.b);
        }
        return null;
    }
}
