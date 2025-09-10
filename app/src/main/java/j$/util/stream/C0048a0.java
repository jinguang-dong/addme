package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.a0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0048a0 extends AbstractC0057d0 implements M {
    @Override // j$.util.stream.T
    public final /* synthetic */ void forEach(Consumer consumer) {
        L0.q(this, consumer);
    }

    @Override // j$.util.stream.T
    public final /* synthetic */ T l(long j, long j2, IntFunction intFunction) {
        return L0.t(this, j, j2);
    }

    @Override // j$.util.stream.T
    public final /* synthetic */ void m(Object[] objArr, int i) {
        L0.n(this, (Double[]) objArr, i);
    }

    @Override // j$.util.stream.S
    public final Object newArray(int i) {
        return new double[i];
    }

    @Override // j$.util.stream.T
    public final j$.util.L spliterator() {
        return new C0098r0(this);
    }

    @Override // j$.util.stream.T
    public final Spliterator spliterator() {
        return new C0098r0(this);
    }
}
