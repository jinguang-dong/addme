package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.BaseStream;

/* loaded from: classes3.dex */
public interface BaseStream<T, S extends BaseStream<T, S>> extends AutoCloseable {
    @Override // java.lang.AutoCloseable
    void close();

    boolean isParallel();

    S onClose(Runnable runnable);

    AbstractC0047a sequential();

    Spliterator<T> spliterator();
}
