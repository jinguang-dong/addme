package j$.util.function;

import java.util.function.LongUnaryOperator;

/* renamed from: j$.util.function.LongUnaryOperator$-CC, reason: invalid class name */
/* loaded from: classes3.dex */
public final /* synthetic */ class LongUnaryOperator$CC {
    public static LongUnaryOperator $default$andThen(LongUnaryOperator longUnaryOperator, LongUnaryOperator longUnaryOperator2) {
        longUnaryOperator2.getClass();
        return new j(longUnaryOperator, longUnaryOperator2, 0);
    }

    public static LongUnaryOperator $default$compose(LongUnaryOperator longUnaryOperator, LongUnaryOperator longUnaryOperator2) {
        longUnaryOperator2.getClass();
        return new j(longUnaryOperator, longUnaryOperator2, 1);
    }
}
