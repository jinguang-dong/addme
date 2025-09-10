package j$.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;

/* renamed from: j$.util.Comparator$-EL, reason: invalid class name */
/* loaded from: classes3.dex */
public final /* synthetic */ class Comparator$EL {
    public static C0031c a(Comparator comparator, Comparator comparator2) {
        if (!(comparator instanceof EnumC0032d)) {
            comparator2.getClass();
            return new C0031c(comparator, comparator2, 0);
        }
        EnumC0032d enumC0032d = (EnumC0032d) comparator;
        enumC0032d.getClass();
        comparator2.getClass();
        return new C0031c(enumC0032d, comparator2, 0);
    }

    public static Comparator reversed(Comparator comparator) {
        if (!(comparator instanceof EnumC0032d)) {
            return Collections.reverseOrder(comparator);
        }
        ((EnumC0032d) comparator).getClass();
        return Comparator$CC.reverseOrder();
    }

    public static Comparator thenComparing(Comparator comparator, Function function) {
        if (!(comparator instanceof EnumC0032d)) {
            return a(comparator, Comparator$CC.comparing(function));
        }
        EnumC0032d enumC0032d = (EnumC0032d) comparator;
        enumC0032d.getClass();
        return a(enumC0032d, Comparator$CC.comparing(function));
    }
}
