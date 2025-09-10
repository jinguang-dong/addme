package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0121z implements InterfaceC0076j1 {
    public final InterfaceC0079k1 a;
    public final /* synthetic */ C0077k b;

    public C0121z(InterfaceC0079k1 interfaceC0079k1, C0077k c0077k) {
        this.b = c0077k;
        interfaceC0079k1.getClass();
        this.a = interfaceC0079k1;
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
        this.a.c(j);
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public final boolean e() {
        return this.a.e();
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public final void end() {
        this.a.end();
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

    @Override // j$.util.stream.InterfaceC0076j1, j$.util.stream.InterfaceC0079k1
    public final void accept(long j) {
        this.a.d((InterfaceC0079k1) this.b.apply(j));
    }
}
