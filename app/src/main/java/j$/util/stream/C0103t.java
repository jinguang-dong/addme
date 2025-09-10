package j$.util.stream;

import j$.util.function.Consumer$CC;
import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;

/* renamed from: j$.util.stream.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0103t implements InterfaceC0073i1 {
    public final InterfaceC0079k1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public C0103t(InterfaceC0079k1 interfaceC0079k1, Object obj, int i) {
        this.b = i;
        this.c = obj;
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
    public void c(long j) {
        switch (this.b) {
            case 2:
                this.a.c(-1L);
                break;
            default:
                this.a.c(j);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC0073i1
    public final /* synthetic */ void d(Integer num) {
        L0.g(this, num);
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public final boolean e() {
        return this.a.e();
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public final void end() {
        this.a.end();
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public final /* synthetic */ void accept(long j) {
        L0.l();
        throw null;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        d((Integer) obj);
    }

    @Override // j$.util.stream.InterfaceC0073i1, j$.util.stream.InterfaceC0079k1
    public final void accept(int i) {
        switch (this.b) {
            case 0:
                this.a.accept((InterfaceC0079k1) ((IntFunction) this.c).apply(i));
                break;
            case 1:
                this.a.accept(((IntUnaryOperator) this.c).applyAsInt(i));
                break;
            default:
                if (((IntPredicate) this.c).test(i)) {
                    this.a.accept(i);
                    break;
                }
                break;
        }
    }
}
