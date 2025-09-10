package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* loaded from: classes3.dex */
public final class B0 extends F0 implements InterfaceC0070h1 {
    public final double[] h;

    public B0(Spliterator spliterator, AbstractC0047a abstractC0047a, double[] dArr) {
        super(spliterator, abstractC0047a, dArr.length);
        this.h = dArr;
    }

    @Override // j$.util.stream.F0
    public final F0 a(Spliterator spliterator, long j, long j2) {
        return new B0(this, spliterator, j, j2);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        s((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.desugar.sun.nio.fs.g.b(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC0070h1
    public final /* synthetic */ void s(Double d) {
        L0.d(this, d);
    }

    @Override // j$.util.stream.F0, j$.util.stream.InterfaceC0079k1
    public final void accept(double d) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        double[] dArr = this.h;
        this.f = i + 1;
        dArr[i] = d;
    }

    public B0(B0 b0, Spliterator spliterator, long j, long j2) {
        super(b0, spliterator, j, j2, b0.h.length);
        this.h = b0.h;
    }
}
