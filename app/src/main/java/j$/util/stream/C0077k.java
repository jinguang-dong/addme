package j$.util.stream;

import j$.util.Optional;
import j$.util.OptionalInt;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Consumer$CC;
import j$.util.function.Predicate$CC;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.chromium.net.UrlRequest;

/* renamed from: j$.util.stream.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0077k implements BiConsumer, Predicate, Supplier, IntFunction, IntBinaryOperator, LongFunction, LongBinaryOperator, Consumer, BinaryOperator {
    public final /* synthetic */ int a;

    public /* synthetic */ C0077k(int i) {
        this.a = i;
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        int i = this.a;
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.a) {
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        switch (this.a) {
            case 8:
                return Long.valueOf(j);
            case 12:
                return L0.A(j);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return L0.C(j);
            default:
                return L0.D(j);
        }
    }

    @Override // java.util.function.IntBinaryOperator
    public int applyAsInt(int i, int i2) {
        return Math.min(i, i2);
    }

    @Override // java.util.function.LongBinaryOperator
    public long applyAsLong(long j, long j2) {
        return Math.max(j, j2);
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.a) {
            case 2:
                return new C0083m();
            default:
                return new C0086n();
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
            case 1:
                return ((OptionalInt) obj).isPresent();
            default:
                return ((Optional) obj).isPresent();
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        double[] dArr = (double[]) obj;
        double[] dArr2 = (double[]) obj2;
        Collectors.a(dArr, dArr2[0]);
        Collectors.a(dArr, dArr2[1]);
        dArr[2] = dArr[2] + dArr2[2];
        dArr[3] = dArr[3] + dArr2[3];
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (this.a) {
        }
        return BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        switch (this.a) {
            case 5:
                return new Object[i];
            case 6:
                return Integer.valueOf(i);
            case 11:
                return new Object[i];
            default:
                return new Object[i];
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 10:
                break;
            case 20:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 13:
                return new C0048a0((M) obj, (M) obj2);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 16:
            default:
                return new C0060e0((T) obj, (T) obj2);
            case 15:
                return new C0051b0((O) obj, (O) obj2);
            case 17:
                return new C0054c0((Q) obj, (Q) obj2);
        }
    }

    private final void accept$j$$util$stream$Node$$ExternalSyntheticLambda0(Object obj) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda0(Object obj) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda1(Object obj) {
    }
}
