package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class S1 implements InterfaceC0076j1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LongConsumer b;

    public /* synthetic */ S1(LongConsumer longConsumer, int i) {
        this.a = i;
        this.b = longConsumer;
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public final /* synthetic */ void accept(double d) {
        switch (this.a) {
            case 0:
                L0.c();
                throw null;
            default:
                L0.c();
                throw null;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public final /* synthetic */ void c(long j) {
        int i = this.a;
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public final /* synthetic */ boolean e() {
        switch (this.a) {
        }
        return false;
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public final /* synthetic */ void end() {
        int i = this.a;
    }

    @Override // j$.util.stream.InterfaceC0076j1
    public final /* synthetic */ void o(Long l) {
        switch (this.a) {
            case 0:
                L0.i(this, l);
                break;
            default:
                L0.i(this, l);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public final /* synthetic */ void accept(int i) {
        switch (this.a) {
            case 0:
                L0.k();
                throw null;
            default:
                L0.k();
                throw null;
        }
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        switch (this.a) {
        }
        return j$.desugar.sun.nio.fs.g.c(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC0076j1, j$.util.stream.InterfaceC0079k1
    public final void accept(long j) {
        switch (this.a) {
            case 0:
                this.b.accept(j);
                break;
            default:
                ((C0123z1) this.b).accept(j);
                break;
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        switch (this.a) {
            case 0:
                o((Long) obj);
                break;
            default:
                o((Long) obj);
                break;
        }
    }

    private final /* synthetic */ void a(long j) {
    }

    private final /* synthetic */ void b(long j) {
    }

    private final /* synthetic */ void f() {
    }

    private final /* synthetic */ void g() {
    }
}
