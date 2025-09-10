package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.z0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0122z0 extends C0123z1 implements Q, J {
    @Override // j$.util.stream.T
    public final /* bridge */ /* synthetic */ T a(int i) {
        a(i);
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public final /* synthetic */ void accept(double d) {
        L0.c();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.B1, j$.util.stream.S
    public final Object b() {
        return (long[]) super.b();
    }

    @Override // j$.util.stream.J, j$.util.stream.K
    public final Q build() {
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
        super.f(i, (long[]) obj);
    }

    @Override // j$.util.stream.B1, j$.util.stream.S
    public final void h(Object obj) {
        super.h((LongConsumer) obj);
    }

    @Override // j$.util.stream.T
    public final /* synthetic */ T l(long j, long j2, IntFunction intFunction) {
        return L0.v(this, j, j2);
    }

    @Override // j$.util.stream.T
    public final /* synthetic */ void m(Object[] objArr, int i) {
        L0.p(this, (Long[]) objArr, i);
    }

    @Override // j$.util.stream.InterfaceC0076j1
    public final /* synthetic */ void o(Long l) {
        L0.i(this, l);
    }

    @Override // j$.util.stream.T
    public final /* synthetic */ Object[] q(IntFunction intFunction) {
        return L0.m(this, intFunction);
    }

    @Override // j$.util.stream.C0123z1, java.lang.Iterable, j$.lang.a, j$.util.Collection
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
    public final /* synthetic */ void accept(int i) {
        L0.k();
        throw null;
    }

    @Override // j$.util.stream.K
    public final T build() {
        return this;
    }

    @Override // j$.util.stream.C0123z1, java.lang.Iterable, j$.lang.a, j$.util.Collection
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        o((Long) obj);
    }
}
