package defpackage;

import j$.util.function.IntUnaryOperator$CC;
import java.util.function.IntUnaryOperator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class sna implements IntUnaryOperator {
    private final /* synthetic */ int a;

    public /* synthetic */ sna(int i) {
        this.a = i;
    }

    public final /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
        return this.a != 0 ? IntUnaryOperator$CC.$default$andThen(this, intUnaryOperator) : IntUnaryOperator$CC.$default$andThen(this, intUnaryOperator);
    }

    @Override // java.util.function.IntUnaryOperator
    public final int applyAsInt(int i) {
        if (this.a == 0) {
            return i + 1;
        }
        int i2 = jkx.n;
        return i + 1;
    }

    public final /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
        return this.a != 0 ? IntUnaryOperator$CC.$default$compose(this, intUnaryOperator) : IntUnaryOperator$CC.$default$compose(this, intUnaryOperator);
    }
}
