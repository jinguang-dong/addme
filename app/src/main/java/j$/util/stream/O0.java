package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes3.dex */
public final class O0 extends Y0 implements X0, InterfaceC0070h1 {
    public final /* synthetic */ j$.desugar.sun.nio.fs.n b;
    public final /* synthetic */ j$.desugar.sun.nio.fs.n c;
    public final /* synthetic */ j$.desugar.sun.nio.fs.h d;

    public O0(j$.desugar.sun.nio.fs.n nVar, j$.desugar.sun.nio.fs.n nVar2, j$.desugar.sun.nio.fs.h hVar) {
        this.b = nVar;
        this.c = nVar2;
        this.d = hVar;
    }

    @Override // j$.util.stream.Y0, j$.util.stream.InterfaceC0079k1
    public final /* synthetic */ void accept(int i) {
        L0.k();
        throw null;
    }

    @Override // j$.util.stream.Y0
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.Y0, j$.util.stream.InterfaceC0079k1
    public final void c(long j) {
        this.a = this.b.get();
    }

    @Override // j$.util.stream.Y0, j$.util.stream.InterfaceC0079k1
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.Y0, j$.util.stream.InterfaceC0079k1
    public final /* synthetic */ void end() {
    }

    @Override // j$.util.stream.X0
    public final void k(X0 x0) {
        this.a = this.d.apply(this.a, ((O0) x0).a);
    }

    @Override // j$.util.stream.InterfaceC0070h1
    public final /* synthetic */ void s(Double d) {
        L0.d(this, d);
    }

    @Override // j$.util.stream.Y0, j$.util.stream.InterfaceC0079k1
    public final /* synthetic */ void accept(long j) {
        L0.l();
        throw null;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.desugar.sun.nio.fs.g.b(this, doubleConsumer);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        s((Double) obj);
    }

    @Override // j$.util.stream.Y0, j$.util.stream.InterfaceC0079k1
    public final void accept(double d) {
        this.c.accept((j$.desugar.sun.nio.fs.n) this.a, d);
    }
}
