package j$.util;

import j$.util.Spliterator;
import j$.util.stream.C0118y;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
public abstract class U implements Spliterator.OfInt {
    public long a;
    public int b;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 1296;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.a;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.desugar.sun.nio.fs.g.i(this, consumer);
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
        return j$.desugar.sun.nio.fs.g.w(this, consumer);
    }

    @Override // j$.util.L
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        forEachRemaining((IntConsumer) obj);
        throw null;
    }

    @Override // j$.util.Spliterator.OfInt
    public final void forEachRemaining(IntConsumer intConsumer) {
        while (true) {
            ((C0118y) this).tryAdvance(intConsumer);
        }
    }

    @Override // j$.util.Spliterator
    public final Spliterator.OfInt trySplit() {
        T t = new T();
        long j = this.a;
        if (j <= 1) {
            return null;
        }
        C0118y c0118y = (C0118y) this;
        c0118y.tryAdvance((IntConsumer) t);
        int i = this.b + 1024;
        if (i > j) {
            i = (int) j;
        }
        if (i > 33554432) {
            i = 33554432;
        }
        int[] iArr = new int[i];
        int i2 = 0;
        while (true) {
            iArr[i2] = t.a;
            i2++;
            if (i2 >= i) {
                break;
            }
            c0118y.tryAdvance((IntConsumer) t);
        }
        this.b = i2;
        long j2 = this.a;
        if (j2 != Long.MAX_VALUE) {
            this.a = j2 - i2;
        }
        return new c0(iArr, 0, i2, 1296);
    }
}
