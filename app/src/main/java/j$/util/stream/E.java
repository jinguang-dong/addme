package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public abstract class E implements InterfaceC0079k1 {
    public boolean a;
    public boolean b;

    public E(F f) {
        this.b = !f.b;
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
    public final /* synthetic */ void c(long j) {
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public final boolean e() {
        return this.a;
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public final /* synthetic */ void end() {
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public /* synthetic */ void accept(int i) {
        L0.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public final /* synthetic */ void accept(long j) {
        L0.l();
        throw null;
    }
}
