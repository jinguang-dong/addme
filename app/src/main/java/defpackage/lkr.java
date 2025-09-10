package defpackage;

import j$.util.function.BiPredicate$CC;
import java.util.function.BiPredicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class lkr implements BiPredicate {
    private final /* synthetic */ int a;

    public final /* synthetic */ BiPredicate and(BiPredicate biPredicate) {
        return this.a != 0 ? BiPredicate$CC.$default$and(this, biPredicate) : BiPredicate$CC.$default$and(this, biPredicate);
    }

    public final /* synthetic */ BiPredicate negate() {
        return this.a != 0 ? BiPredicate$CC.$default$negate(this) : BiPredicate$CC.$default$negate(this);
    }

    public final /* synthetic */ BiPredicate or(BiPredicate biPredicate) {
        return this.a != 0 ? BiPredicate$CC.$default$or(this, biPredicate) : BiPredicate$CC.$default$or(this, biPredicate);
    }

    @Override // java.util.function.BiPredicate
    public final boolean test(Object obj, Object obj2) {
        if (this.a != 0) {
            Integer num = (Integer) obj2;
            scn scnVar = ljo.a;
            return ((Integer) obj).intValue() == 0 || ljo.a.contains(num);
        }
        Long l = (Long) obj2;
        scn scnVar2 = lks.a;
        return ((Integer) obj).intValue() == 0 || lks.a.contains(l);
    }
}
