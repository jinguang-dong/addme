package defpackage;

import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hsj implements Predicate {
    private final /* synthetic */ int a;

    public /* synthetic */ hsj(int i) {
        this.a = i;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.a) {
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public final /* synthetic */ Predicate mo32negate() {
        switch (this.a) {
        }
        return Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.a) {
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00e0 A[RETURN] */
    @Override // java.util.function.Predicate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean test(java.lang.Object r4) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hsj.test(java.lang.Object):boolean");
    }
}
