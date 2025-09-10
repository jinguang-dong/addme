package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes3.dex */
public final class T1 extends G1 implements j$.util.I {
    @Override // j$.util.stream.G1
    public final void d() {
        C0123z1 c0123z1 = new C0123z1();
        this.h = c0123z1;
        this.e = this.b.s(new S1(c0123z1, 1));
        this.f = new j$.desugar.sun.nio.fs.h(18, this);
    }

    @Override // j$.util.stream.G1
    public final G1 e(Spliterator spliterator) {
        return new T1(this.b, spliterator, this.a);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.desugar.sun.nio.fs.g.j(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.desugar.sun.nio.fs.g.x(this, consumer);
    }

    @Override // j$.util.stream.G1, j$.util.Spliterator
    public final j$.util.I trySplit() {
        return (j$.util.I) super.trySplit();
    }

    @Override // j$.util.L
    public final boolean tryAdvance(LongConsumer longConsumer) {
        longConsumer.getClass();
        boolean zA = a();
        if (zA) {
            C0123z1 c0123z1 = (C0123z1) this.h;
            long j = this.g;
            int iX = c0123z1.x(j);
            longConsumer.accept((c0123z1.b == 0 && iX == 0) ? ((long[]) c0123z1.d)[(int) j] : ((long[][]) c0123z1.e)[iX][(int) (j - c0123z1.c[iX])]);
        }
        return zA;
    }

    @Override // j$.util.stream.G1, j$.util.Spliterator
    public final j$.util.L trySplit() {
        return (j$.util.I) super.trySplit();
    }

    @Override // j$.util.L
    public final void forEachRemaining(LongConsumer longConsumer) {
        if (this.h == null && !this.i) {
            longConsumer.getClass();
            c();
            S1 s1 = new S1(longConsumer, 0);
            this.b.r(this.d, s1);
            this.i = true;
            return;
        }
        while (tryAdvance(longConsumer)) {
        }
    }

    @Override // j$.util.stream.G1, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.I) super.trySplit();
    }
}
