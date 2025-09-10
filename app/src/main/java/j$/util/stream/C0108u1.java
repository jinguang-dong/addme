package j$.util.stream;

import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.u1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0108u1 extends A1 implements j$.util.C {
    public final /* synthetic */ C0111v1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0108u1(C0111v1 c0111v1, int i, int i2, int i3, int i4) {
        super(c0111v1, i, i2, i3, i4);
        this.g = c0111v1;
    }

    @Override // j$.util.stream.A1
    public final void a(int i, Object obj, Object obj2) {
        ((DoubleConsumer) obj2).accept(((double[]) obj)[i]);
    }

    @Override // j$.util.stream.A1
    public final j$.util.L b(Object obj, int i, int i2) {
        double[] dArr = (double[]) obj;
        int i3 = i2 + i;
        dArr.getClass();
        Spliterators.a(dArr.length, i, i3);
        return new j$.util.X(dArr, i, i3, 1040);
    }

    @Override // j$.util.stream.A1
    public final j$.util.L c(int i, int i2, int i3, int i4) {
        return new C0108u1(this.g, i, i2, i3, i4);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.desugar.sun.nio.fs.g.h(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.desugar.sun.nio.fs.g.v(this, consumer);
    }
}
