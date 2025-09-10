package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final class V1 extends X1 implements Spliterator.OfInt {
    @Override // j$.util.stream.Z1
    public final Spliterator a(Spliterator spliterator, long j, long j2, long j3, long j4) {
        return new V1((Spliterator.OfInt) spliterator, j, j2, j3, j4);
    }

    @Override // j$.util.stream.X1
    public final Object b() {
        return new N(1);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.desugar.sun.nio.fs.g.i(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.desugar.sun.nio.fs.g.w(this, consumer);
    }
}
