package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public abstract class Y0 implements InterfaceC0079k1 {
    public Object a;

    public Y0(InterfaceC0079k1 interfaceC0079k1) {
        interfaceC0079k1.getClass();
        this.a = interfaceC0079k1;
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public /* synthetic */ void accept(double d) {
        L0.c();
        throw null;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public void c(long j) {
        ((InterfaceC0079k1) this.a).c(j);
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public boolean e() {
        return ((InterfaceC0079k1) this.a).e();
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public void end() {
        ((InterfaceC0079k1) this.a).end();
    }

    public Object get() {
        return this.a;
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public /* synthetic */ void accept(int i) {
        L0.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public /* synthetic */ void accept(long j) {
        L0.l();
        throw null;
    }
}
