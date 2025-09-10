package j$.util.concurrent.atomic;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntUnaryOperator;

/* loaded from: classes3.dex */
public class DesugarAtomicInteger {
    public static int getAndUpdate(AtomicInteger atomicInteger, IntUnaryOperator intUnaryOperator) {
        int i;
        do {
            i = atomicInteger.get();
        } while (!atomicInteger.compareAndSet(i, intUnaryOperator.applyAsInt(i)));
        return i;
    }
}
