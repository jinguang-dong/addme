package j$.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* renamed from: j$.util.Comparator$-CC, reason: invalid class name */
/* loaded from: classes3.dex */
public final /* synthetic */ class Comparator$CC {
    public static <T, U extends Comparable<? super U>> Comparator<T> comparing(Function<? super T, ? extends U> function) {
        function.getClass();
        return new C0030b(2, function);
    }

    public static <T> Comparator<T> comparingDouble(ToDoubleFunction<? super T> toDoubleFunction) {
        toDoubleFunction.getClass();
        return new C0030b(1, toDoubleFunction);
    }

    public static <T> Comparator<T> comparingInt(ToIntFunction<? super T> toIntFunction) {
        toIntFunction.getClass();
        return new C0030b(0, toIntFunction);
    }

    public static <T> Comparator<T> comparingLong(ToLongFunction<? super T> toLongFunction) {
        toLongFunction.getClass();
        return new C0030b(3, toLongFunction);
    }

    public static <T extends Comparable<? super T>> Comparator<T> naturalOrder() {
        return EnumC0032d.INSTANCE;
    }

    public static <T extends Comparable<? super T>> Comparator<T> reverseOrder() {
        return Collections.reverseOrder();
    }

    public static <T, U> Comparator<T> comparing(Function<? super T, ? extends U> function, Comparator<? super U> comparator) {
        function.getClass();
        comparator.getClass();
        return new C0031c(comparator, function, 1);
    }
}
