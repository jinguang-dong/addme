package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
public final class R1 extends G1 implements Spliterator.OfInt {
    @Override // j$.util.stream.G1
    public final void d() {
        C0117x1 c0117x1 = new C0117x1();
        this.h = c0117x1;
        this.e = this.b.s(new Q1(c0117x1, 1));
        this.f = new j$.desugar.sun.nio.fs.h(17, this);
    }

    @Override // j$.util.stream.G1
    public final G1 e(Spliterator spliterator) {
        return new R1(this.b, spliterator, this.a);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.desugar.sun.nio.fs.g.i(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.desugar.sun.nio.fs.g.w(this, consumer);
    }

    @Override // j$.util.stream.G1, j$.util.Spliterator
    public final Spliterator.OfInt trySplit() {
        return (Spliterator.OfInt) super.trySplit();
    }

    @Override // j$.util.L
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        boolean zA = a();
        if (zA) {
            C0117x1 c0117x1 = (C0117x1) this.h;
            long j = this.g;
            int iX = c0117x1.x(j);
            intConsumer.accept((c0117x1.b == 0 && iX == 0) ? ((int[]) c0117x1.d)[(int) j] : ((int[][]) c0117x1.e)[iX][(int) (j - c0117x1.c[iX])]);
        }
        return zA;
    }

    @Override // j$.util.stream.G1, j$.util.Spliterator
    public final j$.util.L trySplit() {
        return (Spliterator.OfInt) super.trySplit();
    }

    @Override // j$.util.L
    public final void forEachRemaining(IntConsumer intConsumer) {
        if (this.h == null && !this.i) {
            intConsumer.getClass();
            c();
            Q1 q1 = new Q1(intConsumer, 0);
            this.b.r(this.d, q1);
            this.i = true;
            return;
        }
        while (tryAdvance(intConsumer)) {
        }
    }

    @Override // j$.util.stream.G1, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (Spliterator.OfInt) super.trySplit();
    }
}
