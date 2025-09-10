package j$.util.stream;

import j$.util.OptionalLong;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes3.dex */
public final class W0 implements X0, InterfaceC0076j1 {
    public boolean a;
    public long b;
    public final /* synthetic */ C0077k c;

    public W0(C0077k c0077k) {
        this.c = c0077k;
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public final /* synthetic */ void accept(double d) {
        L0.c();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public final void c(long j) {
        this.a = true;
        this.b = 0L;
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
        return this.a ? OptionalLong.c : new OptionalLong(this.b);
    }

    @Override // j$.util.stream.X0
    public final void k(X0 x0) {
        W0 w0 = (W0) x0;
        if (w0.a) {
            return;
        }
        accept(w0.b);
    }

    @Override // j$.util.stream.InterfaceC0076j1
    public final /* synthetic */ void o(Long l) {
        L0.i(this, l);
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public final /* synthetic */ void accept(int i) {
        L0.k();
        throw null;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.desugar.sun.nio.fs.g.c(this, longConsumer);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        o((Long) obj);
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public final void accept(long j) {
        if (this.a) {
            this.a = false;
            this.b = j;
        } else {
            this.b = this.c.applyAsLong(this.b, j);
        }
    }
}
