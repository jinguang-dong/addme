package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes3.dex */
public final class U0 extends L0 {
    @Override // j$.util.stream.L0
    public final X0 F() {
        return new Z0();
    }

    @Override // j$.util.stream.L0, j$.util.stream.g2
    public final Object a(AbstractC0047a abstractC0047a, Spliterator spliterator) {
        return E1.SIZED.s(abstractC0047a.f) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.a(abstractC0047a, spliterator);
    }

    @Override // j$.util.stream.L0, j$.util.stream.g2
    public final Object b(AbstractC0047a abstractC0047a, Spliterator spliterator) {
        return E1.SIZED.s(abstractC0047a.f) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.b(abstractC0047a, spliterator);
    }

    @Override // j$.util.stream.L0, j$.util.stream.g2
    public final int f() {
        return E1.q;
    }
}
