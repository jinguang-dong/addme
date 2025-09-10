package j$.util.stream;

import j$.util.OptionalDouble;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes3.dex */
public final class N0 implements X0, InterfaceC0070h1 {
    public boolean a;
    public double b;
    public final /* synthetic */ j$.desugar.sun.nio.fs.n c;

    public N0(j$.desugar.sun.nio.fs.n nVar) {
        this.c = nVar;
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public final /* synthetic */ void accept(int i) {
        L0.k();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public final void c(long j) {
        this.a = true;
        this.b = 0.0d;
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public final /* synthetic */ void end() {
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.a ? OptionalDouble.c : new OptionalDouble(this.b);
    }

    @Override // j$.util.stream.X0
    public final void k(X0 x0) {
        N0 n0 = (N0) x0;
        if (n0.a) {
            return;
        }
        accept(n0.b);
    }

    @Override // j$.util.stream.InterfaceC0070h1
    public final /* synthetic */ void s(Double d) {
        L0.d(this, d);
    }

    @Override // j$.util.stream.InterfaceC0079k1
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

    @Override // j$.util.stream.InterfaceC0079k1
    public final void accept(double d) {
        if (this.a) {
            this.a = false;
            this.b = d;
        } else {
            this.b = this.c.applyAsDouble(this.b, d);
        }
    }
}
