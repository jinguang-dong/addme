package j$.util;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes3.dex */
public final class a0 extends j$.desugar.sun.nio.fs.g implements I {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.desugar.sun.nio.fs.g.j(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return Spliterator.CC.$default$getComparator(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.desugar.sun.nio.fs.g.x(this, consumer);
    }

    @Override // j$.desugar.sun.nio.fs.g, j$.util.C, j$.util.L, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ I trySplit() {
        return null;
    }

    @Override // j$.util.I
    public final void forEachRemaining(LongConsumer longConsumer) {
        longConsumer.getClass();
    }

    @Override // j$.util.I
    public final boolean tryAdvance(LongConsumer longConsumer) {
        longConsumer.getClass();
        return false;
    }

    @Override // j$.desugar.sun.nio.fs.g, j$.util.C, j$.util.L, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ L trySplit() {
        return null;
    }
}
