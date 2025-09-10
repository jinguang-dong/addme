package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.c0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0054c0 extends AbstractC0057d0 implements Q {
    @Override // j$.util.stream.T
    public final /* synthetic */ void forEach(Consumer consumer) {
        L0.s(this, consumer);
    }

    @Override // j$.util.stream.T
    public final /* synthetic */ T l(long j, long j2, IntFunction intFunction) {
        return L0.v(this, j, j2);
    }

    @Override // j$.util.stream.T
    public final /* synthetic */ void m(Object[] objArr, int i) {
        L0.p(this, (Long[]) objArr, i);
    }

    @Override // j$.util.stream.S
    public final Object newArray(int i) {
        return new long[i];
    }

    @Override // j$.util.stream.T
    public final j$.util.L spliterator() {
        return new C0104t0(this);
    }

    @Override // j$.util.stream.T
    public final Spliterator spliterator() {
        return new C0104t0(this);
    }
}
