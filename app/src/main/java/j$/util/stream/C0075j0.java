package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.j0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0075j0 extends AbstractC0084m0 implements O {
    @Override // j$.util.stream.AbstractC0084m0, j$.util.stream.T
    public final /* bridge */ /* synthetic */ T a(int i) {
        a(i);
        throw null;
    }

    @Override // j$.util.stream.S
    public final /* bridge */ /* synthetic */ Object b() {
        return L0.e;
    }

    @Override // j$.util.stream.T
    public final /* synthetic */ void forEach(Consumer consumer) {
        L0.r(this, consumer);
    }

    @Override // j$.util.stream.AbstractC0084m0, j$.util.stream.T
    public final /* synthetic */ T l(long j, long j2, IntFunction intFunction) {
        return L0.u(this, j, j2);
    }

    @Override // j$.util.stream.T
    public final /* synthetic */ void m(Object[] objArr, int i) {
        L0.o(this, (Integer[]) objArr, i);
    }

    @Override // j$.util.stream.T
    public final /* bridge */ /* synthetic */ j$.util.L spliterator() {
        return Spliterators.b;
    }

    @Override // j$.util.stream.AbstractC0084m0, j$.util.stream.T
    public final S a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.T
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return Spliterators.b;
    }
}
