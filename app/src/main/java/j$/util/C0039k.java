package j$.util;

import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

/* renamed from: j$.util.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0039k implements Iterator, InterfaceC0126v {
    public final /* synthetic */ int a = 0;
    public final Iterator b;

    public C0039k(C0040l c0040l) {
        this.b = c0040l.a.iterator();
    }

    @Override // java.util.Iterator, j$.util.InterfaceC0126v
    public final void forEachRemaining(Consumer consumer) {
        switch (this.a) {
            case 0:
                j$.desugar.sun.nio.fs.g.C(this.b, consumer);
                break;
            default:
                j$.desugar.sun.nio.fs.g.C(this.b, new j$.nio.file.u(consumer, 2));
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                return this.b.next();
            default:
                return new C0043o((Map.Entry) this.b.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public C0039k(C0045q c0045q) {
        this.b = c0045q.a.iterator();
    }
}
