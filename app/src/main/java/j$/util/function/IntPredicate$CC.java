package j$.util.function;

import java.util.function.IntPredicate;

/* renamed from: j$.util.function.IntPredicate$-CC, reason: invalid class name */
/* loaded from: classes3.dex */
public final /* synthetic */ class IntPredicate$CC {
    public static IntPredicate $default$and(IntPredicate intPredicate, IntPredicate intPredicate2) {
        intPredicate2.getClass();
        return new g(intPredicate, intPredicate2, 1);
    }

    public static IntPredicate $default$negate(IntPredicate intPredicate) {
        return new j$.desugar.sun.nio.fs.h(4, intPredicate);
    }

    public static IntPredicate $default$or(IntPredicate intPredicate, IntPredicate intPredicate2) {
        intPredicate2.getClass();
        return new g(intPredicate, intPredicate2, 0);
    }
}
