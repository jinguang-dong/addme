package j$.util.concurrent.atomic;

import java.util.concurrent.atomic.AtomicReference;
import java.util.function.UnaryOperator;

/* loaded from: classes3.dex */
public class DesugarAtomicReference {
    public static <V> V updateAndGet(AtomicReference<V> atomicReference, UnaryOperator<V> unaryOperator) {
        while (true) {
            V v = atomicReference.get();
            V v2 = (V) unaryOperator.apply(v);
            while (!atomicReference.compareAndSet(v, v2)) {
                if (atomicReference.get() != v) {
                    break;
                }
            }
            return v2;
        }
    }
}
