package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.h0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0069h0 extends C0111v1 implements M, H {
    @Override // j$.util.stream.T
    public final /* bridge */ /* synthetic */ T a(int i) {
        a(i);
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public final /* synthetic */ void accept(int i) {
        L0.k();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.B1, j$.util.stream.S
    public final Object b() {
        return (double[]) super.b();
    }

    @Override // j$.util.stream.H, j$.util.stream.K
    public final M build() {
        return this;
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public final void c(long j) {
        clear();
        y(j);
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public final void end() {
    }

    @Override // j$.util.stream.B1, j$.util.stream.S
    public final void f(int i, Object obj) {
        super.f(i, (double[]) obj);
    }

    @Override // j$.util.stream.B1, j$.util.stream.S
    public final void h(Object obj) {
        super.h((DoubleConsumer) obj);
    }

    @Override // j$.util.stream.T
    public final /* synthetic */ T l(long j, long j2, IntFunction intFunction) {
        return L0.t(this, j, j2);
    }

    @Override // j$.util.stream.T
    public final /* synthetic */ void m(Object[] objArr, int i) {
        L0.n(this, (Double[]) objArr, i);
    }

    @Override // j$.util.stream.T
    public final /* synthetic */ Object[] q(IntFunction intFunction) {
        return L0.m(this, intFunction);
    }

    @Override // j$.util.stream.InterfaceC0070h1
    public final /* synthetic */ void s(Double d) {
        L0.d(this, d);
    }

    @Override // j$.util.stream.C0111v1, java.lang.Iterable, j$.lang.a, j$.util.Collection
    public final j$.util.L spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.T
    public final /* synthetic */ int u() {
        return 0;
    }

    @Override // j$.util.stream.S, j$.util.stream.T
    public final S a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public final /* synthetic */ void accept(long j) {
        L0.l();
        throw null;
    }

    @Override // j$.util.stream.K
    public final T build() {
        return this;
    }

    @Override // j$.util.stream.C0111v1, java.lang.Iterable, j$.lang.a, j$.util.Collection
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        s((Double) obj);
    }
}
