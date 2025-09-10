package j$.desugar.sun.nio.fs;

import j$.nio.file.A;
import j$.nio.file.D;
import j$.nio.file.Path;
import j$.nio.file.attribute.FileAttribute;
import j$.util.Map;
import j$.util.Spliterator;
import j$.util.f0;
import j$.util.function.BiFunction$CC;
import j$.util.function.BiPredicate$CC;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.IntPredicate$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.AbstractC0047a;
import j$.util.stream.C0077k;
import j$.util.stream.C1;
import j$.util.stream.Collectors;
import j$.util.stream.D1;
import j$.util.stream.InterfaceC0079k1;
import j$.util.stream.L0;
import j$.util.stream.P1;
import j$.util.stream.R1;
import j$.util.stream.T1;
import j$.util.stream.c2;
import java.nio.file.DirectoryStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.LongFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import org.chromium.net.UrlRequest;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements A, DirectoryStream.Filter, FileAttribute, BiPredicate, IntPredicate, Predicate, Supplier, Function, BinaryOperator, LongFunction, Consumer, BooleanSupplier, InterfaceC0079k1 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ h(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // j$.nio.file.A
    public boolean a(Path path) {
        return ((Pattern) this.b).matcher(path.toString()).matches();
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public /* synthetic */ void accept(double d) {
        L0.c();
        throw null;
    }

    public /* synthetic */ BiPredicate and(BiPredicate biPredicate) {
        return BiPredicate$CC.$default$and(this, biPredicate);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (this.a) {
        }
        return BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 10:
                BinaryOperator binaryOperator = (BinaryOperator) obj3;
                Map map = (Map) obj;
                Set set = Collectors.a;
                for (Map.Entry entry : ((Map) obj2).entrySet()) {
                    Map.EL.a(map, entry.getKey(), entry.getValue(), binaryOperator);
                }
                return map;
            default:
                ((C0077k) obj3).accept(obj, obj2);
                return obj;
        }
    }

    public void b(D1 d1) {
        ((EnumMap) this.b).put((EnumMap) d1, (D1) 1);
    }

    public /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public /* synthetic */ boolean e() {
        return false;
    }

    @Override // java.util.function.Supplier
    public Object get() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 6:
                return ((AbstractC0047a) obj).o(0);
            case 7:
                return (Spliterator) obj;
            default:
                Set set = Collectors.a;
                return new f0((CharSequence) obj);
        }
    }

    @Override // java.util.function.BooleanSupplier
    public boolean getAsBoolean() {
        switch (this.a) {
            case 16:
                P1 p1 = (P1) this.b;
                return p1.d.tryAdvance(p1.e);
            case 17:
                R1 r1 = (R1) this.b;
                return r1.d.tryAdvance(r1.e);
            case 18:
                T1 t1 = (T1) this.b;
                return t1.d.tryAdvance(t1.e);
            default:
                c2 c2Var = (c2) this.b;
                return c2Var.d.tryAdvance(c2Var.e);
        }
    }

    @Override // j$.nio.file.attribute.FileAttribute
    public String name() {
        return "posix:permissions";
    }

    public /* synthetic */ BiPredicate negate() {
        return BiPredicate$CC.$default$negate(this);
    }

    public /* synthetic */ BiPredicate or(BiPredicate biPredicate) {
        return BiPredicate$CC.$default$or(this, biPredicate);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        return !((Predicate) this.b).test(obj);
    }

    @Override // j$.nio.file.attribute.FileAttribute
    public Object value() {
        return Collections.unmodifiableSet(D.h((Set) ((java.nio.file.attribute.FileAttribute) this.b).value()));
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public /* synthetic */ void accept(int i) {
        L0.k();
        throw null;
    }

    public /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        return IntPredicate$CC.$default$and(this, intPredicate);
    }

    /* renamed from: negate, reason: collision with other method in class */
    public /* synthetic */ IntPredicate m31negate() {
        return IntPredicate$CC.$default$negate(this);
    }

    public /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
        return IntPredicate$CC.$default$or(this, intPredicate);
    }

    @Override // java.util.function.IntPredicate
    public boolean test(int i) {
        return !((IntPredicate) this.b).test(i);
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public /* synthetic */ void accept(long j) {
        L0.l();
        throw null;
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate$CC.$default$and(this, predicate);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate, reason: collision with other method in class */
    public /* synthetic */ Predicate mo32negate() {
        return Predicate$CC.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.BiPredicate
    public boolean test(Object obj, Object obj2) {
        return !((BiPredicate) this.b).test(obj, obj2);
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        switch (this.a) {
            case 13:
                ((InterfaceC0079k1) this.b).accept((InterfaceC0079k1) obj);
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((ArrayList) this.b).add(obj);
                break;
            default:
                ((C1) this.b).accept(obj);
                break;
        }
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        Supplier supplier = (Supplier) this.b;
        Set set = Collectors.a;
        return supplier.get();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen, reason: collision with other method in class */
    public /* synthetic */ Function mo30andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        return L0.x(j, (IntFunction) this.b);
    }

    @Override // java.nio.file.DirectoryStream.Filter
    /* renamed from: accept, reason: collision with other method in class */
    public boolean mo29accept(Object obj) {
        return ((DirectoryStream.Filter) this.b).mo29accept(D.b(obj));
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public /* synthetic */ void c(long j) {
    }

    @Override // j$.util.stream.InterfaceC0079k1
    public /* synthetic */ void end() {
    }
}
