package j$.util.function;

import java.util.function.LongUnaryOperator;

/* loaded from: classes3.dex */
public final /* synthetic */ class j implements LongUnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ LongUnaryOperator b;
    public final /* synthetic */ LongUnaryOperator c;

    public /* synthetic */ j(LongUnaryOperator longUnaryOperator, LongUnaryOperator longUnaryOperator2, int i) {
        this.a = i;
        this.b = longUnaryOperator;
        this.c = longUnaryOperator2;
    }

    public final /* synthetic */ LongUnaryOperator andThen(LongUnaryOperator longUnaryOperator) {
        switch (this.a) {
        }
        return LongUnaryOperator$CC.$default$andThen(this, longUnaryOperator);
    }

    @Override // java.util.function.LongUnaryOperator
    public final long applyAsLong(long j) {
        switch (this.a) {
            case 0:
                return this.c.applyAsLong(this.b.applyAsLong(j));
            default:
                return this.b.applyAsLong(this.c.applyAsLong(j));
        }
    }

    public final /* synthetic */ LongUnaryOperator compose(LongUnaryOperator longUnaryOperator) {
        switch (this.a) {
        }
        return LongUnaryOperator$CC.$default$compose(this, longUnaryOperator);
    }
}
