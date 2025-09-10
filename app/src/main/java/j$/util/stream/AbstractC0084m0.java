package j$.util.stream;

import java.util.function.IntFunction;

/* renamed from: j$.util.stream.m0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0084m0 implements T {
    @Override // j$.util.stream.T
    public T a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.T
    public final long count() {
        return 0L;
    }

    public final void h(Object obj) {
    }

    @Override // j$.util.stream.T
    public /* synthetic */ T l(long j, long j2, IntFunction intFunction) {
        return L0.w(this, j, j2, intFunction);
    }

    @Override // j$.util.stream.T
    public final Object[] q(IntFunction intFunction) {
        return (Object[]) intFunction.apply(0);
    }

    @Override // j$.util.stream.T
    public final /* synthetic */ int u() {
        return 0;
    }

    public final void f(int i, Object obj) {
    }
}
