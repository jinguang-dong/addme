package j$.nio.file;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Consumer$CC;
import j$.util.stream.AbstractC0047a;
import j$.util.stream.E1;
import j$.util.stream.F1;
import j$.util.stream.N1;
import j$.util.stream.g2;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* loaded from: classes3.dex */
public final class C implements G, BiConsumer, BiFunction, Consumer, Supplier, g2 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ C(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // j$.util.stream.g2
    public Object a(AbstractC0047a abstractC0047a, Spliterator spliterator) {
        j$.util.stream.E e = (j$.util.stream.E) ((Supplier) this.c).get();
        abstractC0047a.r(spliterator, e);
        return Boolean.valueOf(e.b);
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 1:
                ConcurrentMap concurrentMap = (ConcurrentMap) this.b;
                BiFunction biFunction = (BiFunction) this.c;
                while (!concurrentMap.replace(obj, obj2, biFunction.apply(obj, obj2)) && (obj2 = concurrentMap.get(obj)) != null) {
                }
            default:
                BiConsumer biConsumer = (BiConsumer) this.b;
                BiConsumer biConsumer2 = (BiConsumer) this.c;
                biConsumer.accept(obj, obj2);
                biConsumer2.accept(obj, obj2);
                break;
        }
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
        }
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        return ((Function) this.c).apply(((BiFunction) this.b).apply(obj, obj2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j$.util.stream.g2
    public Object b(AbstractC0047a abstractC0047a, Spliterator spliterator) {
        return (Boolean) new j$.util.stream.G(this, abstractC0047a, spliterator).invoke();
    }

    @Override // j$.util.stream.g2
    public int f() {
        return E1.t | E1.q;
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.a) {
            case 6:
                return new j$.util.stream.D((j$.util.stream.F) this.b, (IntPredicate) this.c);
            default:
                return new j$.util.stream.C((j$.util.stream.F) this.b, (Predicate) this.c);
        }
    }

    @Override // j$.nio.file.G
    public String name() {
        return (String) this.b;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return (String) this.b;
            default:
                return super.toString();
        }
    }

    @Override // j$.nio.file.G
    public Class type() {
        return (Class) this.c;
    }

    public C(F1 f1, j$.util.stream.F f, Supplier supplier) {
        this.a = 8;
        this.b = f;
        this.c = supplier;
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction$CC.$default$andThen(this, function);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 4:
                break;
            case 5:
                break;
            case 9:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public void d(Object obj) {
        switch (this.a) {
            case 4:
                Consumer consumer = (Consumer) this.b;
                Consumer consumer2 = (Consumer) this.c;
                consumer.d(obj);
                consumer2.d(obj);
                break;
            case 5:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.c;
                if (obj == null) {
                    atomicBoolean.set(true);
                    break;
                } else {
                    concurrentHashMap.putIfAbsent(obj, Boolean.TRUE);
                    break;
                }
            case 9:
                ((BiConsumer) this.b).accept(this.c, obj);
                break;
            default:
                N1 n1 = (N1) this.b;
                Consumer consumer3 = (Consumer) this.c;
                if (n1.b.putIfAbsent(obj != null ? obj : N1.d, Boolean.TRUE) == null) {
                    consumer3.d(obj);
                    break;
                }
                break;
        }
    }
}
