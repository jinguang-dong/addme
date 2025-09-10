package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes3.dex */
public interface T {
    T a(int i);

    long count();

    void forEach(Consumer consumer);

    T l(long j, long j2, IntFunction intFunction);

    void m(Object[] objArr, int i);

    Object[] q(IntFunction intFunction);

    Spliterator spliterator();

    int u();
}
