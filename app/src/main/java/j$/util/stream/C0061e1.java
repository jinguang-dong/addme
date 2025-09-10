package j$.util.stream;

import java.util.function.Consumer;

/* renamed from: j$.util.stream.e1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0061e1 extends AbstractC0067g1 {
    @Override // j$.util.stream.AbstractC0067g1, j$.util.stream.Stream
    public final void forEach(Consumer consumer) {
        if (this.a.l) {
            super.forEach(consumer);
        } else {
            p().forEachRemaining(consumer);
        }
    }

    @Override // j$.util.stream.AbstractC0067g1, j$.util.stream.Stream
    public final void forEachOrdered(Consumer consumer) {
        if (this.a.l) {
            super.forEachOrdered(consumer);
        } else {
            p().forEachRemaining(consumer);
        }
    }

    @Override // j$.util.stream.AbstractC0047a
    public final boolean m() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC0047a
    public final InterfaceC0079k1 n(int i, InterfaceC0079k1 interfaceC0079k1) {
        throw new UnsupportedOperationException();
    }
}
