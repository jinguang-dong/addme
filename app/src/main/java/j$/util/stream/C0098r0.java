package j$.util.stream;

import java.util.function.Consumer;

/* renamed from: j$.util.stream.r0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0098r0 extends AbstractC0107u0 implements j$.util.C {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.desugar.sun.nio.fs.g.h(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.desugar.sun.nio.fs.g.v(this, consumer);
    }
}
