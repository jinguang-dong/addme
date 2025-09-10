package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* loaded from: classes3.dex */
public final class S0 extends Y0 implements X0 {
    public final /* synthetic */ Supplier b;
    public final /* synthetic */ BiConsumer c;
    public final /* synthetic */ BinaryOperator d;

    public S0(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator) {
        this.b = supplier;
        this.c = biConsumer;
        this.d = binaryOperator;
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
        this.a = this.d.apply(this.a, ((S0) x0).a);
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
        this.c.accept(this.a, obj);
    }
}
