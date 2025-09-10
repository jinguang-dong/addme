package j$.util.stream;

import j$.util.C0127w;
import j$.util.OptionalDouble;
import j$.util.Spliterator;
import java.util.Set;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;

/* renamed from: j$.util.stream.d1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0058d1 extends AbstractC0047a implements DoubleStream {
    public final /* synthetic */ ToDoubleFunction m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0058d1(AbstractC0067g1 abstractC0067g1, int i, ToDoubleFunction toDoubleFunction) {
        super(abstractC0067g1, i);
        this.m = toDoubleFunction;
    }

    @Override // j$.util.stream.DoubleStream
    public final OptionalDouble average() {
        j$.desugar.sun.nio.fs.n nVar = new j$.desugar.sun.nio.fs.n(28);
        j$.desugar.sun.nio.fs.n nVar2 = new j$.desugar.sun.nio.fs.n(29);
        double[] dArr = (double[]) d(new P0(F1.DOUBLE_VALUE, new j$.desugar.sun.nio.fs.h(11, new C0077k(0)), nVar2, nVar, 0));
        if (dArr[2] <= 0.0d) {
            return OptionalDouble.c;
        }
        Set set = Collectors.a;
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        if (Double.isNaN(d) && Double.isInfinite(d2)) {
            d = d2;
        }
        return new OptionalDouble(d / dArr[2]);
    }

    @Override // j$.util.stream.AbstractC0047a
    public final T e(AbstractC0047a abstractC0047a, Spliterator spliterator, boolean z, IntFunction intFunction) {
        long jF = abstractC0047a.f(spliterator);
        if (jF >= 0 && spliterator.hasCharacteristics(16384)) {
            if (jF >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            double[] dArr = new double[(int) jF];
            new B0(spliterator, abstractC0047a, dArr).invoke();
            return new C0063f0(dArr);
        }
        M m = (M) new Y(abstractC0047a, spliterator, new C0077k(12), new C0077k(13)).invoke();
        if (!z || m.u() <= 0) {
            return m;
        }
        long jCount = m.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr2 = new double[(int) jCount];
        new H0(m, dArr2, 0).invoke();
        return new C0063f0(dArr2);
    }

    @Override // j$.util.stream.AbstractC0047a
    public final boolean g(Spliterator spliterator, InterfaceC0079k1 interfaceC0079k1) {
        DoubleConsumer c0127w;
        boolean zE;
        if (!(spliterator instanceof j$.util.C)) {
            if (!i2.a) {
                throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
            }
            i2.a(AbstractC0047a.class, "using DoubleStream.adapt(Spliterator<Double> s)");
            throw null;
        }
        j$.util.C c = (j$.util.C) spliterator;
        if (interfaceC0079k1 instanceof DoubleConsumer) {
            c0127w = (DoubleConsumer) interfaceC0079k1;
        } else {
            if (i2.a) {
                i2.a(AbstractC0047a.class, "using DoubleStream.adapt(Sink<Double> s)");
                throw null;
            }
            interfaceC0079k1.getClass();
            c0127w = new C0127w(interfaceC0079k1, 1);
        }
        do {
            zE = interfaceC0079k1.e();
            if (zE) {
                break;
            }
        } while (c.tryAdvance(c0127w));
        return zE;
    }

    @Override // j$.util.stream.AbstractC0047a
    public final F1 h() {
        return F1.DOUBLE_VALUE;
    }

    @Override // j$.util.stream.AbstractC0047a
    public final Spliterator i(Supplier supplier) {
        return new I1(supplier);
    }

    @Override // j$.util.stream.AbstractC0047a
    public final K j(long j, IntFunction intFunction) {
        return L0.A(j);
    }

    @Override // j$.util.stream.AbstractC0047a
    public final boolean m() {
        return false;
    }

    @Override // j$.util.stream.DoubleStream
    public final OptionalDouble min() {
        return (OptionalDouble) d(new M0(F1.DOUBLE_VALUE, new j$.desugar.sun.nio.fs.n(27), 1));
    }

    @Override // j$.util.stream.AbstractC0047a
    public final InterfaceC0079k1 n(int i, InterfaceC0079k1 interfaceC0079k1) {
        return new C0071i(interfaceC0079k1, this.m, 5);
    }

    @Override // j$.util.stream.AbstractC0047a
    public final Spliterator q(AbstractC0047a abstractC0047a, Supplier supplier, boolean z) {
        return new P1(abstractC0047a, supplier, z);
    }

    @Override // j$.util.stream.AbstractC0047a, j$.util.stream.BaseStream
    public final Spliterator<Double> spliterator() {
        Spliterator spliterator = super.spliterator();
        if (spliterator instanceof j$.util.C) {
            return (j$.util.C) spliterator;
        }
        if (!i2.a) {
            throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
        }
        i2.a(AbstractC0047a.class, "using DoubleStream.adapt(Spliterator<Double> s)");
        throw null;
    }
}
