package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0080l implements g2 {
    public final int a;
    public final Object b;
    public final Predicate c;
    public final Supplier d;

    public C0080l(boolean z, F1 f1, Object obj, Predicate predicate, Supplier supplier) {
        this.a = (z ? 0 : E1.q) | E1.t;
        this.b = obj;
        this.c = predicate;
        this.d = supplier;
    }

    @Override // j$.util.stream.g2
    public final Object a(AbstractC0047a abstractC0047a, Spliterator spliterator) {
        h2 h2Var = (h2) this.d.get();
        abstractC0047a.r(spliterator, h2Var);
        Object obj = h2Var.get();
        return obj != null ? obj : this.b;
    }

    @Override // j$.util.stream.g2
    public final Object b(AbstractC0047a abstractC0047a, Spliterator spliterator) {
        return new C0092p(this, E1.ORDERED.s(abstractC0047a.f), abstractC0047a, spliterator).invoke();
    }

    @Override // j$.util.stream.g2
    public final int f() {
        return this.a;
    }
}
