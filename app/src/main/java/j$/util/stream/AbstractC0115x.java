package j$.util.stream;

import j$.util.C0128x;
import j$.util.OptionalInt;
import j$.util.Spliterator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0115x extends AbstractC0047a implements IntStream {
    @Override // j$.util.stream.IntStream
    public final boolean anyMatch(IntPredicate intPredicate) {
        F f = F.ANY;
        intPredicate.getClass();
        f.getClass();
        return ((Boolean) d(new j$.nio.file.C(F1.INT_VALUE, f, new j$.nio.file.C(6, f, intPredicate)))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final Stream boxed() {
        return new C0106u(this, 0, new C0077k(6), 0);
    }

    @Override // j$.util.stream.AbstractC0047a
    public final T e(AbstractC0047a abstractC0047a, Spliterator spliterator, boolean z, IntFunction intFunction) {
        long jF = abstractC0047a.f(spliterator);
        if (jF >= 0 && spliterator.hasCharacteristics(16384)) {
            if (jF >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            int[] iArr = new int[(int) jF];
            new C0(spliterator, abstractC0047a, iArr).invoke();
            return new C0090o0(iArr);
        }
        O o = (O) new Y(abstractC0047a, spliterator, new C0077k(14), new C0077k(15)).invoke();
        if (!z || o.u() <= 0) {
            return o;
        }
        long jCount = o.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr2 = new int[(int) jCount];
        new I0(o, iArr2, 0).invoke();
        return new C0090o0(iArr2);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream filter(IntPredicate intPredicate) {
        intPredicate.getClass();
        return new C0109v(this, E1.s, intPredicate, 1);
    }

    @Override // j$.util.stream.IntStream
    public final OptionalInt findFirst() {
        return (OptionalInt) d(C0083m.c);
    }

    @Override // j$.util.stream.AbstractC0047a
    public final boolean g(Spliterator spliterator, InterfaceC0079k1 interfaceC0079k1) {
        IntConsumer c0128x;
        boolean zE;
        if (!(spliterator instanceof Spliterator.OfInt)) {
            if (!i2.a) {
                throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
            }
            i2.a(AbstractC0047a.class, "using IntStream.adapt(Spliterator<Integer> s)");
            throw null;
        }
        Spliterator.OfInt ofInt = (Spliterator.OfInt) spliterator;
        if (interfaceC0079k1 instanceof IntConsumer) {
            c0128x = (IntConsumer) interfaceC0079k1;
        } else {
            if (i2.a) {
                i2.a(AbstractC0047a.class, "using IntStream.adapt(Sink<Integer> s)");
                throw null;
            }
            interfaceC0079k1.getClass();
            c0128x = new C0128x(interfaceC0079k1, 1);
        }
        do {
            zE = interfaceC0079k1.e();
            if (zE) {
                break;
            }
        } while (ofInt.tryAdvance(c0128x));
        return zE;
    }

    @Override // j$.util.stream.AbstractC0047a
    public final F1 h() {
        return F1.INT_VALUE;
    }

    @Override // j$.util.stream.AbstractC0047a
    public final Spliterator i(Supplier supplier) {
        return new J1(supplier);
    }

    @Override // j$.util.stream.AbstractC0047a
    public final K j(long j, IntFunction intFunction) {
        return L0.C(j);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream map(IntUnaryOperator intUnaryOperator) {
        intUnaryOperator.getClass();
        return new C0109v(this, E1.o | E1.n, intUnaryOperator, 0);
    }

    @Override // j$.util.stream.IntStream
    public final Stream mapToObj(IntFunction intFunction) {
        intFunction.getClass();
        return new C0106u(this, E1.o | E1.n, intFunction, 0);
    }

    @Override // j$.util.stream.IntStream
    public final OptionalInt min() {
        return (OptionalInt) d(new M0(F1.INT_VALUE, new C0077k(7), 3));
    }

    @Override // j$.util.stream.AbstractC0047a
    public final Spliterator q(AbstractC0047a abstractC0047a, Supplier supplier, boolean z) {
        return new R1(abstractC0047a, supplier, z);
    }

    @Override // j$.util.stream.AbstractC0047a, j$.util.stream.BaseStream
    public final Spliterator<Integer> spliterator() {
        Spliterator spliterator = super.spliterator();
        if (spliterator instanceof Spliterator.OfInt) {
            return (Spliterator.OfInt) spliterator;
        }
        if (!i2.a) {
            throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
        }
        i2.a(AbstractC0047a.class, "using IntStream.adapt(Spliterator<Integer> s)");
        throw null;
    }
}
