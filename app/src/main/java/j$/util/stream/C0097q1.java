package j$.util.stream;

import j$.util.Spliterator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.q1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0097q1 extends AbstractC0064f1 {
    public final Comparator n;

    public C0097q1(AbstractC0067g1 abstractC0067g1, Comparator comparator) {
        super(abstractC0067g1, E1.p | E1.o, 0);
        comparator.getClass();
        this.n = comparator;
    }

    @Override // j$.util.stream.AbstractC0047a
    public final T k(AbstractC0047a abstractC0047a, Spliterator spliterator, IntFunction intFunction) {
        E1.SORTED.s(abstractC0047a.f);
        Object[] objArrQ = abstractC0047a.c(spliterator, true, intFunction).q(intFunction);
        Arrays.sort(objArrQ, this.n);
        return new W(objArrQ);
    }

    @Override // j$.util.stream.AbstractC0047a
    public final InterfaceC0079k1 n(int i, InterfaceC0079k1 interfaceC0079k1) {
        interfaceC0079k1.getClass();
        E1.SORTED.s(i);
        boolean zS = E1.SIZED.s(i);
        Comparator comparator = this.n;
        return zS ? new C0102s1(interfaceC0079k1, comparator) : new C0099r1(interfaceC0079k1, comparator);
    }
}
