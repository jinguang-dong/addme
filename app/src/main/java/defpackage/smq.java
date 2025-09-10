package defpackage;

import j$.util.function.BiPredicate$CC;
import java.util.function.BiPredicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class smq implements BiPredicate {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ smq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    public final /* synthetic */ BiPredicate and(BiPredicate biPredicate) {
        int i = this.b;
        return i != 0 ? i != 1 ? BiPredicate$CC.$default$and(this, biPredicate) : BiPredicate$CC.$default$and(this, biPredicate) : BiPredicate$CC.$default$and(this, biPredicate);
    }

    public final /* synthetic */ BiPredicate negate() {
        int i = this.b;
        return i != 0 ? i != 1 ? BiPredicate$CC.$default$negate(this) : BiPredicate$CC.$default$negate(this) : BiPredicate$CC.$default$negate(this);
    }

    public final /* synthetic */ BiPredicate or(BiPredicate biPredicate) {
        int i = this.b;
        return i != 0 ? i != 1 ? BiPredicate$CC.$default$or(this, biPredicate) : BiPredicate$CC.$default$or(this, biPredicate) : BiPredicate$CC.$default$or(this, biPredicate);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.function.Predicate] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, java.util.function.Predicate] */
    @Override // java.util.function.BiPredicate
    public final boolean test(Object obj, Object obj2) {
        int i = this.b;
        if (i == 0) {
            return this.a.test(obj);
        }
        if (i != 1) {
            return this.a.test(obj2);
        }
        Integer num = (Integer) obj;
        int i2 = ((idj) obj2).b;
        if (i2 != 1) {
            return ((idk) this.a).b && num.intValue() == idz.ZOOM.ordinal() && i2 == 2;
        }
        return true;
    }
}
