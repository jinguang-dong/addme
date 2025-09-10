package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.m1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0085m1 extends AbstractC0064f1 {
    public final /* synthetic */ long n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0085m1(AbstractC0067g1 abstractC0067g1, int i, long j) {
        super(abstractC0067g1, i, 0);
        this.n = j;
    }

    @Override // j$.util.stream.AbstractC0047a
    public final T k(AbstractC0047a abstractC0047a, Spliterator spliterator, IntFunction intFunction) {
        long j;
        long j2;
        Spliterator y1;
        long jF = abstractC0047a.f(spliterator);
        if (jF <= 0 || !spliterator.hasCharacteristics(16384)) {
            if (E1.ORDERED.s(abstractC0047a.f)) {
                return (T) new C0091o1(this, abstractC0047a, spliterator, intFunction, this.n).invoke();
            }
            Spliterator spliteratorT = abstractC0047a.t(spliterator);
            long j3 = this.n;
            if (j3 <= jF) {
                j = jF - j3;
                j2 = 0;
            } else {
                j = -1;
                j2 = j3;
            }
            return L0.y(this, new a2(spliteratorT, j2, j), true, intFunction);
        }
        AbstractC0047a abstractC0047a2 = abstractC0047a;
        while (abstractC0047a2.e > 0) {
            abstractC0047a2 = abstractC0047a2.b;
        }
        F1 f1H = abstractC0047a2.h();
        int i = AbstractC0088n1.a[f1H.ordinal()];
        long j4 = this.n;
        if (i == 1) {
            y1 = new Y1(spliterator, j4, Long.MAX_VALUE);
        } else if (i == 2) {
            y1 = new V1((Spliterator.OfInt) spliterator, j4, Long.MAX_VALUE);
        } else if (i == 3) {
            y1 = new W1((j$.util.I) spliterator, j4, Long.MAX_VALUE);
        } else {
            if (i != 4) {
                throw new IllegalStateException("Unknown shape ".concat(String.valueOf(f1H)));
            }
            y1 = new U1((j$.util.C) spliterator, j4, Long.MAX_VALUE);
        }
        return L0.y(abstractC0047a, y1, true, intFunction);
    }

    @Override // j$.util.stream.AbstractC0047a
    public final Spliterator l(AbstractC0047a abstractC0047a, Spliterator spliterator) {
        long j;
        long j2;
        long jF = abstractC0047a.f(spliterator);
        if (jF > 0 && spliterator.hasCharacteristics(16384)) {
            return new Y1(abstractC0047a.t(spliterator), this.n, Long.MAX_VALUE);
        }
        if (E1.ORDERED.s(abstractC0047a.f)) {
            return ((T) new C0091o1(this, abstractC0047a, spliterator, new C0077k(11), this.n).invoke()).spliterator();
        }
        Spliterator spliteratorT = abstractC0047a.t(spliterator);
        long j3 = this.n;
        if (j3 <= jF) {
            j = jF - j3;
            j2 = 0;
        } else {
            j = -1;
            j2 = j3;
        }
        return new a2(spliteratorT, j2, j);
    }

    @Override // j$.util.stream.AbstractC0047a
    public final InterfaceC0079k1 n(int i, InterfaceC0079k1 interfaceC0079k1) {
        return new C0082l1(interfaceC0079k1, this.n);
    }
}
