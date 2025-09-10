package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.b0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0051b0 extends AbstractC0057d0 implements O {
    @Override // j$.util.stream.T
    public final /* synthetic */ void forEach(Consumer consumer) {
        L0.r(this, consumer);
    }

    @Override // j$.util.stream.T
    public final /* synthetic */ T l(long j, long j2, IntFunction intFunction) {
        return L0.u(this, j, j2);
    }

    @Override // j$.util.stream.T
    public final /* synthetic */ void m(Object[] objArr, int i) {
        L0.o(this, (Integer[]) objArr, i);
    }

    @Override // j$.util.stream.S
    public final Object newArray(int i) {
        return new int[i];
    }

    @Override // j$.util.stream.T
    public final j$.util.L spliterator() {
        return new C0101s0(this);
    }

    @Override // j$.util.stream.T
    public final Spliterator spliterator() {
        return new C0101s0(this);
    }
}
