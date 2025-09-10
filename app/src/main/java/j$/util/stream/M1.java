package j$.util.stream;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* loaded from: classes3.dex */
public class M1 implements Spliterator {
    public final Supplier a;
    public Spliterator b;

    public M1(Supplier supplier) {
        this.a = supplier;
    }

    public final Spliterator a() {
        if (this.b == null) {
            this.b = (Spliterator) this.a.get();
        }
        return this.b;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return a().characteristics();
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return a().estimateSize();
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        a().forEachRemaining(consumer);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        return a().getComparator();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        return a().getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    public final String toString() {
        return getClass().getName() + "[" + String.valueOf(a()) + "]";
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        return a().tryAdvance(consumer);
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        return a().trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.L trySplit() {
        return (j$.util.L) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator.OfInt trySplit() {
        return (Spliterator.OfInt) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.I trySplit() {
        return (j$.util.I) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.C trySplit() {
        return (j$.util.C) trySplit();
    }
}
