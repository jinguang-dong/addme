package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* loaded from: classes3.dex */
public final class D0 extends F0 implements InterfaceC0076j1 {
    public final long[] h;

    public D0(Spliterator spliterator, AbstractC0047a abstractC0047a, long[] jArr) {
        super(spliterator, abstractC0047a, jArr.length);
        this.h = jArr;
    }

    @Override // j$.util.stream.F0
    public final F0 a(Spliterator spliterator, long j, long j2) {
        return new D0(this, spliterator, j, j2);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        o((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.desugar.sun.nio.fs.g.c(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC0076j1
    public final /* synthetic */ void o(Long l) {
        L0.i(this, l);
    }

    @Override // j$.util.stream.F0, j$.util.stream.InterfaceC0079k1
    public final void accept(long j) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        long[] jArr = this.h;
        this.f = i + 1;
        jArr[i] = j;
    }

    public D0(D0 d0, Spliterator spliterator, long j, long j2) {
        super(d0, spliterator, j, j2, d0.h.length);
        this.h = d0.h;
    }
}
