package j$.util.stream;

import j$.util.OptionalInt;
import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0083m extends AbstractC0089o implements InterfaceC0073i1 {
    public static final C0080l c;

    static {
        F1 f1 = F1.INT_VALUE;
        c = new C0080l(true, f1, OptionalInt.empty(), new C0077k(1), new C0077k(2));
        new C0080l(false, f1, OptionalInt.empty(), new C0077k(1), new C0077k(2));
    }

    @Override // j$.util.stream.AbstractC0089o, j$.util.stream.InterfaceC0079k1
    public final void accept(int i) {
        d(Integer.valueOf(i));
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return OptionalInt.of(((Integer) this.b).intValue());
        }
        return null;
    }
}
