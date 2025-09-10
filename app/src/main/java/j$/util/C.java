package j$.util;

import java.util.function.DoubleConsumer;

/* loaded from: classes3.dex */
public interface C extends L {
    void forEachRemaining(DoubleConsumer doubleConsumer);

    boolean tryAdvance(DoubleConsumer doubleConsumer);

    @Override // j$.util.L, j$.util.Spliterator
    C trySplit();
}
