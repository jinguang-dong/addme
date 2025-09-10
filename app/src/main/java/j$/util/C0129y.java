package j$.util;

import j$.util.stream.InterfaceC0079k1;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0129y implements LongConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Consumer b;

    public /* synthetic */ C0129y(Consumer consumer, int i) {
        this.a = i;
        this.b = consumer;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        switch (this.a) {
            case 0:
                this.b.accept(Long.valueOf(j));
                break;
            default:
                ((InterfaceC0079k1) this.b).accept(j);
                break;
        }
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        switch (this.a) {
        }
        return j$.desugar.sun.nio.fs.g.c(this, longConsumer);
    }
}
