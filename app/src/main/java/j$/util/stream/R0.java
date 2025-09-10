package j$.util.stream;

import j$.util.stream.Collector;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

/* loaded from: classes3.dex */
public final class R0 extends L0 {
    public final /* synthetic */ BinaryOperator h;
    public final /* synthetic */ BiConsumer i;
    public final /* synthetic */ Supplier j;
    public final /* synthetic */ Collector k;

    public R0(F1 f1, BinaryOperator binaryOperator, BiConsumer biConsumer, Supplier supplier, Collector collector) {
        this.h = binaryOperator;
        this.i = biConsumer;
        this.j = supplier;
        this.k = collector;
    }

    @Override // j$.util.stream.L0
    public final X0 F() {
        return new S0(this.j, this.i, this.h);
    }

    @Override // j$.util.stream.L0, j$.util.stream.g2
    public final int f() {
        if (this.k.characteristics().contains(Collector.Characteristics.UNORDERED)) {
            return E1.q;
        }
        return 0;
    }
}
