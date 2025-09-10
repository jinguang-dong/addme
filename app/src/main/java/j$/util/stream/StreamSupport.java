package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Supplier;

/* loaded from: classes3.dex */
public final class StreamSupport {
    public static <T> Stream<T> stream(Spliterator<T> spliterator, boolean z) {
        spliterator.getClass();
        return new C0061e1(spliterator, E1.l(spliterator), z);
    }

    public static <T> Stream<T> stream(Supplier<? extends Spliterator<T>> supplier, int i, boolean z) {
        supplier.getClass();
        return new C0061e1(supplier, i & E1.f, z);
    }
}
