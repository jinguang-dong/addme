package j$.util;

import java.util.function.LongConsumer;

/* loaded from: classes3.dex */
public interface I extends L {
    void forEachRemaining(LongConsumer longConsumer);

    boolean tryAdvance(LongConsumer longConsumer);

    @Override // j$.util.L, j$.util.Spliterator
    I trySplit();
}
