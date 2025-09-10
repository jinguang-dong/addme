package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

/* loaded from: classes3.dex */
public final class G extends AbstractC0050b {
    public final j$.nio.file.C j;

    public G(j$.nio.file.C c, AbstractC0047a abstractC0047a, Spliterator spliterator) {
        super(abstractC0047a, spliterator);
        this.j = c;
    }

    @Override // j$.util.stream.AbstractC0056d
    public final Object a() {
        AbstractC0047a abstractC0047a = this.a;
        E e = (E) ((Supplier) this.j.c).get();
        abstractC0047a.r(this.b, e);
        boolean z = e.b;
        if (z == ((F) this.j.b).b) {
            Boolean boolValueOf = Boolean.valueOf(z);
            AtomicReference atomicReference = this.h;
            while (!atomicReference.compareAndSet(null, boolValueOf) && atomicReference.get() == null) {
            }
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC0056d
    public final AbstractC0056d b(Spliterator spliterator) {
        return new G(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0050b
    public final Object g() {
        return Boolean.valueOf(!((F) this.j.b).b);
    }

    public G(G g, Spliterator spliterator) {
        super(g, spliterator);
        this.j = g.j;
    }
}
