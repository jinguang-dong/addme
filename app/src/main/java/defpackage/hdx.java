package defpackage;

import j$.util.function.Predicate$CC;
import java.util.Map;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class hdx implements Predicate {
    public final /* synthetic */ long a;
    private final /* synthetic */ int b;

    public /* synthetic */ hdx(long j, int i) {
        this.b = i;
        this.a = j;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        int i = this.b;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? Predicate$CC.$default$and(this, predicate) : Predicate$CC.$default$and(this, predicate) : Predicate$CC.$default$and(this, predicate) : Predicate$CC.$default$and(this, predicate) : Predicate$CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public final /* synthetic */ Predicate mo32negate() {
        int i = this.b;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? Predicate$CC.$default$negate(this) : Predicate$CC.$default$negate(this) : Predicate$CC.$default$negate(this) : Predicate$CC.$default$negate(this) : Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        int i = this.b;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? Predicate$CC.$default$or(this, predicate) : Predicate$CC.$default$or(this, predicate) : Predicate$CC.$default$or(this, predicate) : Predicate$CC.$default$or(this, predicate) : Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i = this.b;
        if (i == 0) {
            int i2 = heb.k;
            return ((Long) obj).longValue() < this.a;
        }
        if (i == 1) {
            return this.a - ((Long) ((Map.Entry) obj).getValue()).longValue() > 3000;
        }
        if (i == 2) {
            return ((kcr) obj).c == this.a;
        }
        if (i == 3) {
            return ((kcr) obj).b == this.a;
        }
        scn scnVar = lks.a;
        return ((Long) obj).longValue() >= this.a;
    }
}
