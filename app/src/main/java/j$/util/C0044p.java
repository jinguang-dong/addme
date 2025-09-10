package j$.util;

import java.util.Comparator;
import java.util.function.Consumer;

/* renamed from: j$.util.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0044p implements Spliterator {
    public final Spliterator a;

    public C0044p(Spliterator spliterator) {
        this.a = spliterator;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.a.characteristics();
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        this.a.forEachRemaining(new j$.nio.file.u(consumer, 2));
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        return this.a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        return this.a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final boolean hasCharacteristics(int i) {
        return this.a.hasCharacteristics(i);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        return this.a.tryAdvance(new j$.nio.file.u(consumer, 2));
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        Spliterator spliteratorTrySplit = this.a.trySplit();
        if (spliteratorTrySplit == null) {
            return null;
        }
        return new C0044p(spliteratorTrySplit);
    }
}
