package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final class T0 extends Y0 implements X0 {
    public final /* synthetic */ j$.desugar.sun.nio.fs.n b;
    public final /* synthetic */ j$.desugar.sun.nio.fs.n c;
    public final /* synthetic */ j$.desugar.sun.nio.fs.n d;

    public T0(j$.desugar.sun.nio.fs.n nVar, j$.desugar.sun.nio.fs.n nVar2, j$.desugar.sun.nio.fs.n nVar3) {
        this.b = nVar;
        this.c = nVar2;
        this.d = nVar3;
    }

    @Override // j$.util.stream.Y0, j$.util.stream.InterfaceC0079k1
    public final /* synthetic */ void accept(double d) {
        L0.c();
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
        this.d.accept((j$.desugar.sun.nio.fs.n) this.a, ((T0) x0).a);
    }

    @Override // j$.util.stream.Y0, j$.util.stream.InterfaceC0079k1
    public final /* synthetic */ void accept(int i) {
        L0.k();
        throw null;
    }

    @Override // j$.util.stream.Y0, j$.util.stream.InterfaceC0079k1
    public final /* synthetic */ void accept(long j) {
        L0.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void d(Object obj) {
        this.c.accept((j$.desugar.sun.nio.fs.n) this.a, obj);
    }
}
