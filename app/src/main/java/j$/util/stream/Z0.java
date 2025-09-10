package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final class Z0 extends Y0 implements X0 {
    public long b;

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
        this.b = 0L;
    }

    @Override // j$.util.stream.Y0, j$.util.stream.InterfaceC0079k1
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.Y0, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.b);
    }

    @Override // j$.util.stream.X0
    public final void k(X0 x0) {
        this.b += ((Z0) x0).b;
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
        this.b++;
    }

    @Override // j$.util.stream.Y0, j$.util.stream.InterfaceC0079k1
    public final /* synthetic */ void end() {
    }
}
