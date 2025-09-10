package j$.nio.file;

import j$.util.C0043o;
import j$.util.function.Consumer$CC;
import j$.util.stream.InterfaceC0079k1;
import j$.util.stream.L0;
import java.util.Map;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class u implements Consumer, InterfaceC0079k1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Consumer b;

    public /* synthetic */ u(Consumer consumer, int i) {
        this.a = i;
        this.b = consumer;
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public /* synthetic */ void accept(double d) {
        L0.c();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public /* synthetic */ boolean e() {
        return false;
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

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                this.b.accept(D.b(obj));
                break;
            case 1:
                this.b.accept(D.b(obj));
                break;
            case 2:
                this.b.accept(new C0043o((Map.Entry) obj));
                break;
            default:
                this.b.accept(obj);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public /* synthetic */ void c(long j) {
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public /* synthetic */ void end() {
    }
}
