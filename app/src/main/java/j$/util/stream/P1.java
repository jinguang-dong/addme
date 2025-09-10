package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes3.dex */
public final class P1 extends G1 implements j$.util.C {
    @Override // j$.util.stream.G1
    public final void d() {
        C0111v1 c0111v1 = new C0111v1();
        this.h = c0111v1;
        this.e = this.b.s(new O1(c0111v1, 1));
        this.f = new j$.desugar.sun.nio.fs.h(16, this);
    }

    @Override // j$.util.stream.G1
    public final G1 e(Spliterator spliterator) {
        return new P1(this.b, spliterator, this.a);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.desugar.sun.nio.fs.g.h(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.desugar.sun.nio.fs.g.v(this, consumer);
    }

    @Override // j$.util.stream.G1, j$.util.Spliterator
    public final j$.util.C trySplit() {
        return (j$.util.C) super.trySplit();
    }

    @Override // j$.util.L
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        boolean zA = a();
        if (zA) {
            C0111v1 c0111v1 = (C0111v1) this.h;
            long j = this.g;
            int iX = c0111v1.x(j);
            doubleConsumer.accept((c0111v1.b == 0 && iX == 0) ? ((double[]) c0111v1.d)[(int) j] : ((double[][]) c0111v1.e)[iX][(int) (j - c0111v1.c[iX])]);
        }
        return zA;
    }

    @Override // j$.util.stream.G1, j$.util.Spliterator
    public final j$.util.L trySplit() {
        return (j$.util.C) super.trySplit();
    }

    @Override // j$.util.L
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        if (this.h == null && !this.i) {
            doubleConsumer.getClass();
            c();
            O1 o1 = new O1(doubleConsumer, 0);
            this.b.r(this.d, o1);
            this.i = true;
            return;
        }
        while (tryAdvance(doubleConsumer)) {
        }
    }

    @Override // j$.util.stream.G1, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.C) super.trySplit();
    }
}
