package j$.util;

import j$.util.stream.InterfaceC0079k1;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0127w implements DoubleConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Consumer b;

    public /* synthetic */ C0127w(Consumer consumer, int i) {
        this.a = i;
        this.b = consumer;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        switch (this.a) {
            case 0:
                this.b.accept(Double.valueOf(d));
                break;
            default:
                ((InterfaceC0079k1) this.b).accept(d);
                break;
        }
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        switch (this.a) {
        }
        return j$.desugar.sun.nio.fs.g.b(this, doubleConsumer);
    }
}
