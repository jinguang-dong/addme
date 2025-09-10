package defpackage;

import j$.util.function.BiFunction$CC;
import j$.util.stream.Collector;
import java.util.Iterator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ryv {
    public static final Collector a;
    public static final Collector b;

    static {
        int i = 0;
        int i2 = 6;
        a = Collector.CC.of(new ier(3), new ryt(i), new ryu(1), new qoi(i2), new Collector.Characteristics[0]);
        int i3 = 7;
        b = Collector.CC.of(new mae(i2), new ldw(5), new ryu(i), new qoi(i3), new Collector.Characteristics[0]);
        Collector.CC.of(new mae(i3), new ldw(i2), new BinaryOperator() { // from class: rys
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Iterable, java.lang.Object] */
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                rtl rtlVar = (rtl) obj;
                Iterator it = ((rtl) obj2).a.iterator();
                while (it.hasNext()) {
                    rtlVar.c((seo) it.next());
                }
                return rtlVar;
            }
        }, new mcx(10), new Collector.Characteristics[0]);
    }

    public static Collector a(Function function, Function function2) {
        int i = 8;
        int i2 = 2;
        return Collector.CC.of(new mae(i), new ljx(function, function2, i2), new ryu(i2), new qoi(i), new Collector.Characteristics[0]);
    }
}
