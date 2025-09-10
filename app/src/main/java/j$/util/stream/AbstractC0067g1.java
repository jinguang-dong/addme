package j$.util.stream;

import j$.util.Optional;
import j$.util.Spliterator;
import j$.util.stream.Collector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* renamed from: j$.util.stream.g1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0067g1 extends AbstractC0047a implements Stream {
    @Override // j$.util.stream.Stream
    public final boolean allMatch(Predicate predicate) {
        return ((Boolean) d(L0.E(F.ALL, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean anyMatch(Predicate predicate) {
        return ((Boolean) d(L0.E(F.ANY, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Collector collector) {
        Collector collector2;
        Object objD;
        if (this.a.l && collector.characteristics().contains(Collector.Characteristics.CONCURRENT) && (!E1.ORDERED.s(this.f) || collector.characteristics().contains(Collector.Characteristics.UNORDERED))) {
            objD = collector.supplier().get();
            forEach(new j$.nio.file.C(9, collector.accumulator(), objD));
            collector2 = collector;
        } else {
            collector.getClass();
            Supplier supplier = collector.supplier();
            collector2 = collector;
            objD = d(new R0(F1.REFERENCE, collector.combiner(), collector.accumulator(), supplier, collector2));
        }
        return collector2.characteristics().contains(Collector.Characteristics.IDENTITY_FINISH) ? objD : collector2.finisher().apply(objD);
    }

    @Override // j$.util.stream.Stream
    public final long count() {
        return ((Long) d(new U0())).longValue();
    }

    @Override // j$.util.stream.Stream
    public final Stream distinct() {
        return new C0074j(this, E1.m | E1.s, 0);
    }

    @Override // j$.util.stream.AbstractC0047a
    public final T e(AbstractC0047a abstractC0047a, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return L0.y(abstractC0047a, spliterator, z, intFunction);
    }

    @Override // j$.util.stream.Stream
    public final Stream filter(Predicate predicate) {
        predicate.getClass();
        return new C0106u(this, E1.s, predicate, 2);
    }

    @Override // j$.util.stream.Stream
    public final Optional findAny() {
        return (Optional) d(C0086n.d);
    }

    @Override // j$.util.stream.Stream
    public final Optional findFirst() {
        return (Optional) d(C0086n.c);
    }

    @Override // j$.util.stream.Stream
    public final Stream flatMap(Function function) {
        function.getClass();
        return new C0052b1(this, E1.o | E1.n | E1.s, function, 1);
    }

    public void forEach(Consumer consumer) {
        consumer.getClass();
        d(new C0095q(consumer, false));
    }

    public void forEachOrdered(Consumer consumer) {
        consumer.getClass();
        d(new C0095q(consumer, true));
    }

    @Override // j$.util.stream.AbstractC0047a
    public final boolean g(Spliterator spliterator, InterfaceC0079k1 interfaceC0079k1) {
        boolean zE;
        do {
            zE = interfaceC0079k1.e();
            if (zE) {
                break;
            }
        } while (spliterator.tryAdvance(interfaceC0079k1));
        return zE;
    }

    @Override // j$.util.stream.AbstractC0047a
    public final F1 h() {
        return F1.REFERENCE;
    }

    @Override // j$.util.stream.AbstractC0047a
    public final Spliterator i(Supplier supplier) {
        return new M1(supplier);
    }

    @Override // j$.util.stream.AbstractC0047a
    public final K j(long j, IntFunction intFunction) {
        return L0.x(j, intFunction);
    }

    @Override // j$.util.stream.Stream
    public final Stream map(Function function) {
        function.getClass();
        return new C0052b1(this, E1.o | E1.n, function, 0);
    }

    @Override // j$.util.stream.Stream
    public final DoubleStream mapToDouble(ToDoubleFunction toDoubleFunction) {
        toDoubleFunction.getClass();
        return new C0058d1(this, E1.o | E1.n, toDoubleFunction);
    }

    @Override // j$.util.stream.Stream
    public final IntStream mapToInt(ToIntFunction toIntFunction) {
        toIntFunction.getClass();
        return new C0109v(this, E1.o | E1.n, toIntFunction, 2);
    }

    @Override // j$.util.stream.Stream
    public final LongStream mapToLong(ToLongFunction toLongFunction) {
        toLongFunction.getClass();
        return new C0055c1(this, E1.o | E1.n, toLongFunction);
    }

    @Override // j$.util.stream.Stream
    public final Optional max(Comparator comparator) {
        comparator.getClass();
        return (Optional) d(new M0(F1.REFERENCE, new j$.util.function.b(comparator, 0), 2));
    }

    @Override // j$.util.stream.Stream
    public final Optional min(Comparator comparator) {
        comparator.getClass();
        return (Optional) d(new M0(F1.REFERENCE, new j$.util.function.b(comparator, 1), 2));
    }

    @Override // j$.util.stream.Stream
    public final boolean noneMatch(Predicate predicate) {
        return ((Boolean) d(L0.E(F.NONE, predicate))).booleanValue();
    }

    @Override // j$.util.stream.AbstractC0047a
    public final Spliterator q(AbstractC0047a abstractC0047a, Supplier supplier, boolean z) {
        return new c2(abstractC0047a, supplier, z);
    }

    @Override // j$.util.stream.Stream
    public final Stream skip(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        if (j == 0) {
            return this;
        }
        if (j >= 0) {
            return new C0085m1(this, E1.s, j);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted(Comparator comparator) {
        return new C0097q1(this, comparator);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray(IntFunction intFunction) {
        T tC;
        AbstractC0047a abstractC0047a;
        if (this.i) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.i = true;
        if (this.a.l && (abstractC0047a = this.b) != null && m()) {
            this.e = 0;
            tC = k(abstractC0047a, abstractC0047a.o(0), intFunction);
        } else {
            tC = c(o(0), true, intFunction);
        }
        return L0.B(tC, intFunction).q(intFunction);
    }

    @Override // j$.util.stream.Stream
    public final List toList() {
        return Collections.unmodifiableList(new ArrayList(Arrays.asList(toArray(new C0077k(19)))));
    }
}
