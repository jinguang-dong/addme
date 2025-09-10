package j$.util.stream;

import j$.util.Map;
import j$.util.Objects;
import j$.util.function.BiConsumer$CC;
import j$.util.stream.Collector;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* loaded from: classes3.dex */
public final class Collectors {
    public static final Set a;
    public static final Set b;

    static {
        Collector.Characteristics characteristics = Collector.Characteristics.CONCURRENT;
        Collector.Characteristics characteristics2 = Collector.Characteristics.UNORDERED;
        Collector.Characteristics characteristics3 = Collector.Characteristics.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(characteristics, characteristics2, characteristics3));
        Collections.unmodifiableSet(EnumSet.of(characteristics, characteristics2));
        a = Collections.unmodifiableSet(EnumSet.of(characteristics3));
        Collections.unmodifiableSet(EnumSet.of(characteristics2, characteristics3));
        b = Collections.EMPTY_SET;
        Collections.unmodifiableSet(EnumSet.of(characteristics2));
    }

    public static void a(double[] dArr, double d) {
        double d2 = d - dArr[1];
        double d3 = dArr[0];
        double d4 = d3 + d2;
        dArr[1] = (d4 - d3) - d2;
        dArr[0] = d4;
    }

    public static <T, K> Collector<T, ?, Map<K, List<T>>> groupingBy(final Function<? super T, ? extends K> function) {
        Collector list = toList();
        j$.desugar.sun.nio.fs.n nVar = new j$.desugar.sun.nio.fs.n(23);
        final Supplier supplier = list.supplier();
        final BiConsumer biConsumerAccumulator = list.accumulator();
        BiConsumer biConsumer = new BiConsumer() { // from class: j$.util.stream.f
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                Set set = Collectors.a;
                Object objApply = function.apply(obj2);
                Objects.a(objApply, "element cannot be mapped to a null key");
                biConsumerAccumulator.accept(Map.EL.computeIfAbsent((java.util.Map) obj, objApply, new j$.desugar.sun.nio.fs.h(8, supplier)), obj2);
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer2) {
                return BiConsumer$CC.$default$andThen(this, biConsumer2);
            }
        };
        j$.desugar.sun.nio.fs.h hVar = new j$.desugar.sun.nio.fs.h(10, list.combiner());
        return list.characteristics().contains(Collector.Characteristics.IDENTITY_FINISH) ? new C0065g(nVar, biConsumer, hVar, a) : new C0065g(nVar, biConsumer, hVar, new C0059e(list.finisher()), b);
    }

    public static Collector<CharSequence, ?, String> joining(CharSequence charSequence) {
        return new C0065g(new j$.desugar.sun.nio.fs.h(9, charSequence), new j$.desugar.sun.nio.fs.n(20), new j$.desugar.sun.nio.fs.n(21), new j$.desugar.sun.nio.fs.n(22), b);
    }

    public static <T, C extends Collection<T>> Collector<T, ?, C> toCollection(Supplier<C> supplier) {
        return new C0065g(supplier, new j$.desugar.sun.nio.fs.n(12), new j$.desugar.sun.nio.fs.n(13), a);
    }

    public static <T> Collector<T, ?, List<T>> toList() {
        return new C0065g(new j$.desugar.sun.nio.fs.n(14), new j$.desugar.sun.nio.fs.n(15), new j$.desugar.sun.nio.fs.n(18), a);
    }
}
