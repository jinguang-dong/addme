package j$.desugar.sun.nio.fs;

import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalUnit;
import j$.util.concurrent.ConcurrentLinkedQueue;
import j$.util.f0;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.chromium.net.UrlRequest;

/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Predicate, Function, IntFunction, BiConsumer, BinaryOperator, Supplier, DoubleBinaryOperator, ObjDoubleConsumer {
    public final /* synthetic */ int a;

    public /* synthetic */ n(int i) {
        this.a = i;
    }

    public Object a(TemporalAccessor temporalAccessor) {
        switch (this.a) {
            case 1:
                ZoneId zoneId = (ZoneId) temporalAccessor.N(j$.time.temporal.m.a);
                if (zoneId == null || (zoneId instanceof ZoneOffset)) {
                    return null;
                }
                return zoneId;
            case 2:
                return (ZoneId) temporalAccessor.N(j$.time.temporal.m.a);
            case 3:
                return (j$.time.chrono.l) temporalAccessor.N(j$.time.temporal.m.b);
            case 4:
                return (TemporalUnit) temporalAccessor.N(j$.time.temporal.m.c);
            case 5:
                j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
                if (temporalAccessor.c(aVar)) {
                    return ZoneOffset.X(temporalAccessor.h(aVar));
                }
                return null;
            case 6:
                ZoneId zoneId2 = (ZoneId) temporalAccessor.N(j$.time.temporal.m.a);
                return zoneId2 != null ? zoneId2 : (ZoneId) temporalAccessor.N(j$.time.temporal.m.d);
            case 7:
                j$.time.temporal.a aVar2 = j$.time.temporal.a.EPOCH_DAY;
                if (temporalAccessor.c(aVar2)) {
                    return j$.time.h.a0(temporalAccessor.D(aVar2));
                }
                return null;
            default:
                j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_DAY;
                if (temporalAccessor.c(aVar3)) {
                    return LocalTime.S(temporalAccessor.D(aVar3));
                }
                return null;
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 12:
                ((Collection) obj).add(obj2);
                break;
            case 15:
                ((List) obj).add(obj2);
                break;
            case 20:
                ((f0) obj).a((CharSequence) obj2);
                break;
            case 25:
                ((LinkedHashSet) obj).add(obj2);
                break;
            default:
                ((LinkedHashSet) obj).addAll((LinkedHashSet) obj2);
                break;
        }
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.a) {
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
            case 12:
                break;
            case 15:
                break;
            case 20:
                break;
            case 25:
                break;
        }
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        switch (this.a) {
            case 10:
                return obj;
            case 17:
                Set set = Collectors.a;
                return g.H(((List) obj).toArray());
            case 19:
                Set set2 = Collectors.a;
                return obj;
            default:
                return ((f0) obj).toString();
        }
    }

    @Override // java.util.function.DoubleBinaryOperator
    public double applyAsDouble(double d, double d2) {
        return Math.min(d, d2);
    }

    public /* synthetic */ Function compose(Function function) {
        switch (this.a) {
            case 10:
                break;
            case 17:
                break;
            case 19:
                break;
        }
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.a) {
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new ArrayList();
            case 23:
                return new HashMap();
            case 24:
                return new LinkedHashSet();
            default:
                return new double[4];
        }
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public /* synthetic */ Predicate mo32negate() {
        switch (this.a) {
        }
        return Predicate$CC.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.a) {
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return !((String) obj).isEmpty();
            default:
                j$.com.android.tools.r8.b bVar = ConcurrentLinkedQueue.a;
                return true;
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "ZoneId";
            case 3:
                return "Chronology";
            case 4:
                return "Precision";
            case 5:
                return "ZoneOffset";
            case 6:
                return "Zone";
            case 7:
                return "LocalDate";
            case 8:
                return "LocalTime";
            default:
                return super.toString();
        }
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 13:
                Collection collection = (Collection) obj;
                Set set = Collectors.a;
                collection.addAll((Collection) obj2);
                return collection;
            case 16:
                List list = (List) obj;
                Set set2 = Collectors.a;
                list.addAll((List) obj2);
                return list;
            case 18:
                List list2 = (List) obj;
                Set set3 = Collectors.a;
                list2.addAll((List) obj2);
                return list2;
            default:
                f0 f0Var = (f0) obj;
                f0 f0Var2 = (f0) obj2;
                f0Var.getClass();
                f0Var2.getClass();
                if (f0Var2.d != null) {
                    f0Var2.b();
                    f0Var.a(f0Var2.d[0]);
                }
                return f0Var;
        }
    }

    @Override // java.util.function.ObjDoubleConsumer
    public void accept(Object obj, double d) {
        double[] dArr = (double[]) obj;
        dArr[2] = dArr[2] + 1.0d;
        Collectors.a(dArr, d);
        dArr[3] = dArr[3] + d;
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (this.a) {
            case 13:
                break;
            case 16:
                break;
            case 18:
                break;
        }
        return BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public /* synthetic */ Function mo30andThen(Function function) {
        switch (this.a) {
            case 10:
                break;
            case 17:
                break;
            case 19:
                break;
        }
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        return new Object[i];
    }
}
