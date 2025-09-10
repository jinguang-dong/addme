package j$.util.function;

import java.util.function.Predicate;

/* renamed from: j$.util.function.Predicate$-CC, reason: invalid class name */
/* loaded from: classes3.dex */
public final /* synthetic */ class Predicate$CC {
    public static Predicate $default$and(Predicate predicate, Predicate predicate2) {
        predicate2.getClass();
        return new k(predicate, predicate2, 0);
    }

    public static Predicate $default$negate(Predicate predicate) {
        return new j$.desugar.sun.nio.fs.h(5, predicate);
    }

    public static Predicate $default$or(Predicate predicate, Predicate predicate2) {
        predicate2.getClass();
        return new k(predicate, predicate2, 1);
    }

    public static <T> Predicate<T> not(Predicate<? super T> predicate) {
        predicate.getClass();
        return predicate.mo32negate();
    }
}
