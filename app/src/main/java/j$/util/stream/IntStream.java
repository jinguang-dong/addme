package j$.util.stream;

import j$.util.OptionalInt;
import j$.util.Spliterators;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;

/* loaded from: classes3.dex */
public interface IntStream extends BaseStream<Integer, IntStream> {

    /* renamed from: j$.util.stream.IntStream$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static IntStream iterate(int i, IntUnaryOperator intUnaryOperator) {
            intUnaryOperator.getClass();
            C0118y c0118y = new C0118y(i, intUnaryOperator);
            return new C0112w(c0118y, E1.l(c0118y), false);
        }

        public static IntStream range(int i, int i2) {
            if (i >= i2) {
                j$.util.Z z = Spliterators.b;
                return new C0112w(z, E1.l(z), false);
            }
            f2 f2Var = new f2(i, i2);
            return new C0112w(f2Var, E1.l(f2Var), false);
        }
    }

    boolean anyMatch(IntPredicate intPredicate);

    Stream<Integer> boxed();

    IntStream filter(IntPredicate intPredicate);

    OptionalInt findFirst();

    IntStream map(IntUnaryOperator intUnaryOperator);

    <U> Stream<U> mapToObj(IntFunction<? extends U> intFunction);

    OptionalInt min();
}
