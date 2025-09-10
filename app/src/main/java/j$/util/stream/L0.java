package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
import java.util.function.Predicate;

/* loaded from: classes3.dex */
public abstract class L0 implements g2 {
    public static final C0081l0 a = new C0081l0();
    public static final C0075j0 b = new C0075j0();
    public static final C0078k0 c = new C0078k0();
    public static final C0072i0 d = new C0072i0();
    public static final int[] e = new int[0];
    public static final long[] f = new long[0];
    public static final double[] g = new double[0];

    public static H A(long j) {
        return (j < 0 || j >= 2147483639) ? new C0069h0() : new C0066g0(j);
    }

    public static T B(T t, IntFunction intFunction) {
        if (t.u() <= 0) {
            return t;
        }
        long jCount = t.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jCount);
        new J0(t, objArr, 1).invoke();
        return new W(objArr);
    }

    public static I C(long j) {
        return (j < 0 || j >= 2147483639) ? new C0096q0() : new C0093p0(j);
    }

    public static J D(long j) {
        return (j < 0 || j >= 2147483639) ? new C0122z0() : new C0119y0(j);
    }

    public static j$.nio.file.C E(F f2, Predicate predicate) {
        predicate.getClass();
        f2.getClass();
        return new j$.nio.file.C(F1.REFERENCE, f2, new j$.nio.file.C(7, f2, predicate));
    }

    public static void c() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void d(InterfaceC0070h1 interfaceC0070h1, Double d2) {
        if (i2.a) {
            i2.a(interfaceC0070h1.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
        interfaceC0070h1.accept(d2.doubleValue());
    }

    public static void g(InterfaceC0073i1 interfaceC0073i1, Integer num) {
        if (i2.a) {
            i2.a(interfaceC0073i1.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        }
        interfaceC0073i1.accept(num.intValue());
    }

    public static void i(InterfaceC0076j1 interfaceC0076j1, Long l) {
        if (i2.a) {
            i2.a(interfaceC0076j1.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        }
        interfaceC0076j1.accept(l.longValue());
    }

    public static void k() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void l() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static Object[] m(S s, IntFunction intFunction) {
        if (i2.a) {
            i2.a(s.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        }
        if (s.count() >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) s.count());
        s.m(objArr, 0);
        return objArr;
    }

    public static void n(M m, Double[] dArr, int i) {
        if (i2.a) {
            i2.a(m.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
            throw null;
        }
        double[] dArr2 = (double[]) m.b();
        for (int i2 = 0; i2 < dArr2.length; i2++) {
            dArr[i + i2] = Double.valueOf(dArr2[i2]);
        }
    }

    public static void o(O o, Integer[] numArr, int i) {
        if (i2.a) {
            i2.a(o.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
            throw null;
        }
        int[] iArr = (int[]) o.b();
        for (int i2 = 0; i2 < iArr.length; i2++) {
            numArr[i + i2] = Integer.valueOf(iArr[i2]);
        }
    }

    public static void p(Q q, Long[] lArr, int i) {
        if (i2.a) {
            i2.a(q.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
            throw null;
        }
        long[] jArr = (long[]) q.b();
        for (int i2 = 0; i2 < jArr.length; i2++) {
            lArr[i + i2] = Long.valueOf(jArr[i2]);
        }
    }

    public static void q(M m, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            m.h((DoubleConsumer) consumer);
        } else {
            if (i2.a) {
                i2.a(m.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.C) m.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void r(O o, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            o.h((IntConsumer) consumer);
        } else {
            if (i2.a) {
                i2.a(o.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
                throw null;
            }
            ((Spliterator.OfInt) o.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void s(Q q, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            q.h((LongConsumer) consumer);
        } else {
            if (i2.a) {
                i2.a(q.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.I) q.spliterator()).forEachRemaining(consumer);
        }
    }

    public static M t(M m, long j, long j2) {
        if (j == 0 && j2 == m.count()) {
            return m;
        }
        long j3 = j2 - j;
        j$.util.C c2 = (j$.util.C) m.spliterator();
        H hA = A(j3);
        hA.c(j3);
        for (int i = 0; i < j && c2.tryAdvance((DoubleConsumer) new L(0)); i++) {
        }
        if (j2 == m.count()) {
            c2.forEachRemaining((DoubleConsumer) hA);
        } else {
            for (int i2 = 0; i2 < j3 && c2.tryAdvance((DoubleConsumer) hA); i2++) {
            }
        }
        hA.end();
        return hA.build();
    }

    public static O u(O o, long j, long j2) {
        if (j == 0 && j2 == o.count()) {
            return o;
        }
        long j3 = j2 - j;
        Spliterator.OfInt ofInt = (Spliterator.OfInt) o.spliterator();
        I iC = C(j3);
        iC.c(j3);
        for (int i = 0; i < j && ofInt.tryAdvance((IntConsumer) new N(0)); i++) {
        }
        if (j2 == o.count()) {
            ofInt.forEachRemaining((IntConsumer) iC);
        } else {
            for (int i2 = 0; i2 < j3 && ofInt.tryAdvance((IntConsumer) iC); i2++) {
            }
        }
        iC.end();
        return iC.build();
    }

    public static Q v(Q q, long j, long j2) {
        if (j == 0 && j2 == q.count()) {
            return q;
        }
        long j3 = j2 - j;
        j$.util.I i = (j$.util.I) q.spliterator();
        J jD = D(j3);
        jD.c(j3);
        for (int i2 = 0; i2 < j && i.tryAdvance((LongConsumer) new P(0)); i2++) {
        }
        if (j2 == q.count()) {
            i.forEachRemaining((LongConsumer) jD);
        } else {
            for (int i3 = 0; i3 < j3 && i.tryAdvance((LongConsumer) jD); i3++) {
            }
        }
        jD.end();
        return jD.build();
    }

    public static T w(T t, long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == t.count()) {
            return t;
        }
        Spliterator spliterator = t.spliterator();
        long j3 = j2 - j;
        K kX = x(j3, intFunction);
        kX.c(j3);
        for (int i = 0; i < j && spliterator.tryAdvance(new C0077k(10)); i++) {
        }
        if (j2 == t.count()) {
            spliterator.forEachRemaining(kX);
        } else {
            for (int i2 = 0; i2 < j3 && spliterator.tryAdvance(kX); i2++) {
            }
        }
        kX.end();
        return kX.build();
    }

    public static K x(long j, IntFunction intFunction) {
        return (j < 0 || j >= 2147483639) ? new G0() : new C0087n0(j, intFunction);
    }

    public static T y(AbstractC0047a abstractC0047a, Spliterator spliterator, boolean z, IntFunction intFunction) {
        long jF = abstractC0047a.f(spliterator);
        if (jF < 0 || !spliterator.hasCharacteristics(16384)) {
            T t = (T) new Y(abstractC0047a, spliterator, new j$.desugar.sun.nio.fs.h(12, intFunction), new C0077k(18)).invoke();
            return z ? B(t, intFunction) : t;
        }
        if (jF >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jF);
        new E0(spliterator, abstractC0047a, objArr).invoke();
        return new W(objArr);
    }

    public static V z(F1 f1, T t, T t2) {
        int i = U.a[f1.ordinal()];
        if (i == 1) {
            return new C0060e0(t, t2);
        }
        if (i == 2) {
            return new C0051b0((O) t, (O) t2);
        }
        if (i == 3) {
            return new C0054c0((Q) t, (Q) t2);
        }
        if (i == 4) {
            return new C0048a0((M) t, (M) t2);
        }
        throw new IllegalStateException("Unknown shape ".concat(String.valueOf(f1)));
    }

    public abstract X0 F();

    @Override // j$.util.stream.g2
    public Object a(AbstractC0047a abstractC0047a, Spliterator spliterator) {
        X0 x0F = F();
        abstractC0047a.r(spliterator, x0F);
        return x0F.get();
    }

    @Override // j$.util.stream.g2
    public Object b(AbstractC0047a abstractC0047a, Spliterator spliterator) {
        return ((X0) new C0049a1(this, abstractC0047a, spliterator).invoke()).get();
    }

    @Override // j$.util.stream.g2
    public /* synthetic */ int f() {
        return 0;
    }
}
