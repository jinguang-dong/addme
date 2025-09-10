package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.k0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0078k0 extends AbstractC0084m0 implements Q {
    @Override // j$.util.stream.AbstractC0084m0, j$.util.stream.T
    public final /* bridge */ /* synthetic */ T a(int i) {
        a(i);
        throw null;
    }

    @Override // j$.util.stream.S
    public final /* bridge */ /* synthetic */ Object b() {
        return L0.f;
    }

    @Override // j$.util.stream.T
    public final /* synthetic */ void forEach(Consumer consumer) {
        L0.s(this, consumer);
    }

    @Override // j$.util.stream.AbstractC0084m0, j$.util.stream.T
    public final /* synthetic */ T l(long j, long j2, IntFunction intFunction) {
        return L0.v(this, j, j2);
    }

    @Override // j$.util.stream.T
    public final /* synthetic */ void m(Object[] objArr, int i) {
        L0.p(this, (Long[]) objArr, i);
    }

    @Override // j$.util.stream.T
    public final /* bridge */ /* synthetic */ j$.util.L spliterator() {
        return Spliterators.c;
    }

    @Override // j$.util.stream.AbstractC0084m0, j$.util.stream.T
    public final S a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.T
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return Spliterators.c;
    }
}
