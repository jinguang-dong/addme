package defpackage;

import j$.util.Collection;
import j$.util.Map$Entry$CC;
import j$.util.stream.Stream;
import j$.util.stream.StreamSupport;
import java.util.Comparator;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class smz implements AutoCloseable {
    public static smz j(Map map) {
        return k(Collection.EL.stream(map.entrySet()));
    }

    public static smz k(Stream stream) {
        return new smr(stream, new qoi(12), new mcx(11), stream);
    }

    public static smz m(Iterable iterable, Iterable iterable2) {
        return new smy(n(iterable), n(iterable2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Stream n(Iterable iterable) {
        return iterable instanceof java.util.Collection ? Collection.EL.stream(iterable) : StreamSupport.stream(new sms(iterable.iterator()), false);
    }

    public Stream a() {
        return d(new jge(12));
    }

    public abstract smz b(Function function);

    public abstract smz c(Function function);

    public abstract Stream d(BiFunction biFunction);

    public abstract Object e();

    public final sbp g(BiFunction biFunction) {
        Stream streamD = d(biFunction);
        int i = sbp.d;
        return (sbp) streamD.collect(ryv.a);
    }

    public final smz h(BiPredicate biPredicate) {
        return k(a().filter(new nhh(biPredicate, 3)));
    }

    public final smz i(Predicate predicate) {
        return h(new smq(predicate, 2));
    }

    public final smz l(Comparator comparator) {
        return k(a().sorted(Map$Entry$CC.comparingByValue(comparator)));
    }

    public final Stream o() {
        return d(new jge(13));
    }
}
