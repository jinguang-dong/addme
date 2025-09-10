package j$.util.concurrent.atomic;

import java.util.concurrent.atomic.AtomicLong;
import java.util.function.LongUnaryOperator;

/* loaded from: classes3.dex */
public class DesugarAtomicLong {
    public static long updateAndGet(AtomicLong atomicLong, LongUnaryOperator longUnaryOperator) {
        long j;
        long jApplyAsLong;
        do {
            j = atomicLong.get();
            jApplyAsLong = longUnaryOperator.applyAsLong(j);
        } while (!atomicLong.compareAndSet(j, jApplyAsLong));
        return jApplyAsLong;
    }
}
