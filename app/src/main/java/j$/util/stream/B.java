package j$.util.stream;

import j$.util.C0129y;
import j$.util.OptionalLong;
import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
import java.util.function.Supplier;

/* loaded from: classes3.dex */
public abstract class B extends AbstractC0047a implements LongStream {
    @Override // j$.util.stream.LongStream
    public final Stream boxed() {
        return new C0106u(this, new C0077k(8));
    }

    @Override // j$.util.stream.AbstractC0047a
    public final T e(AbstractC0047a abstractC0047a, Spliterator spliterator, boolean z, IntFunction intFunction) {
        long jF = abstractC0047a.f(spliterator);
        if (jF >= 0 && spliterator.hasCharacteristics(16384)) {
            if (jF >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            long[] jArr = new long[(int) jF];
            new D0(spliterator, abstractC0047a, jArr).invoke();
            return new C0116x0(jArr);
        }
        Q q = (Q) new Y(abstractC0047a, spliterator, new C0077k(16), new C0077k(17)).invoke();
        if (!z || q.u() <= 0) {
            return q;
        }
        long jCount = q.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr2 = new long[(int) jCount];
        new H0(q, jArr2, 0).invoke();
        return new C0116x0(jArr2);
    }

    @Override // j$.util.stream.AbstractC0047a
    public final boolean g(Spliterator spliterator, InterfaceC0079k1 interfaceC0079k1) {
        LongConsumer c0129y;
        boolean zE;
        if (!(spliterator instanceof j$.util.I)) {
            if (!i2.a) {
                throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
            }
            i2.a(AbstractC0047a.class, "using LongStream.adapt(Spliterator<Long> s)");
            throw null;
        }
        j$.util.I i = (j$.util.I) spliterator;
        if (interfaceC0079k1 instanceof LongConsumer) {
            c0129y = (LongConsumer) interfaceC0079k1;
        } else {
            if (i2.a) {
                i2.a(AbstractC0047a.class, "using LongStream.adapt(Sink<Long> s)");
                throw null;
            }
            interfaceC0079k1.getClass();
            c0129y = new C0129y(interfaceC0079k1, 1);
        }
        do {
            zE = interfaceC0079k1.e();
            if (zE) {
                break;
            }
        } while (i.tryAdvance(c0129y));
        return zE;
    }

    @Override // j$.util.stream.AbstractC0047a
    public final F1 h() {
        return F1.LONG_VALUE;
    }

    @Override // j$.util.stream.AbstractC0047a
    public final Spliterator i(Supplier supplier) {
        return new K1(supplier);
    }

    @Override // j$.util.stream.AbstractC0047a
    public final K j(long j, IntFunction intFunction) {
        return L0.D(j);
    }

    @Override // j$.util.stream.LongStream
    public final OptionalLong max() {
        return (OptionalLong) d(new M0(F1.LONG_VALUE, new C0077k(9), 0));
    }

    @Override // j$.util.stream.AbstractC0047a
    public final Spliterator q(AbstractC0047a abstractC0047a, Supplier supplier, boolean z) {
        return new T1(abstractC0047a, supplier, z);
    }

    @Override // j$.util.stream.AbstractC0047a, j$.util.stream.BaseStream
    public final Spliterator<Long> spliterator() {
        Spliterator spliterator = super.spliterator();
        if (spliterator instanceof j$.util.I) {
            return (j$.util.I) spliterator;
        }
        if (!i2.a) {
            throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
        }
        i2.a(AbstractC0047a.class, "using LongStream.adapt(Spliterator<Long> s)");
        throw null;
    }
}
