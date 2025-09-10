package j$.util.stream;

import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.y1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0120y1 extends A1 implements j$.util.I {
    public final /* synthetic */ C0123z1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0120y1(C0123z1 c0123z1, int i, int i2, int i3, int i4) {
        super(c0123z1, i, i2, i3, i4);
        this.g = c0123z1;
    }

    @Override // j$.util.stream.A1
    public final void a(int i, Object obj, Object obj2) {
        ((LongConsumer) obj2).accept(((long[]) obj)[i]);
    }

    @Override // j$.util.stream.A1
    public final j$.util.L b(Object obj, int i, int i2) {
        long[] jArr = (long[]) obj;
        int i3 = i2 + i;
        jArr.getClass();
        Spliterators.a(jArr.length, i, i3);
        return new j$.util.e0(jArr, i, i3, 1040);
    }

    @Override // j$.util.stream.A1
    public final j$.util.L c(int i, int i2, int i3, int i4) {
        return new C0120y1(this.g, i, i2, i3, i4);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.desugar.sun.nio.fs.g.j(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.desugar.sun.nio.fs.g.x(this, consumer);
    }
}
