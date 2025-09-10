package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.w1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0114w1 extends A1 implements Spliterator.OfInt {
    public final /* synthetic */ C0117x1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0114w1(C0117x1 c0117x1, int i, int i2, int i3, int i4) {
        super(c0117x1, i, i2, i3, i4);
        this.g = c0117x1;
    }

    @Override // j$.util.stream.A1
    public final void a(int i, Object obj, Object obj2) {
        ((IntConsumer) obj2).accept(((int[]) obj)[i]);
    }

    @Override // j$.util.stream.A1
    public final j$.util.L b(Object obj, int i, int i2) {
        return Spliterators.spliterator((int[]) obj, i, i2 + i, 1040);
    }

    @Override // j$.util.stream.A1
    public final j$.util.L c(int i, int i2, int i3, int i4) {
        return new C0114w1(this.g, i, i2, i3, i4);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.desugar.sun.nio.fs.g.i(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.desugar.sun.nio.fs.g.w(this, consumer);
    }
}
