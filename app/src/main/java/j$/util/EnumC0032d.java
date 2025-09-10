package j$.util;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.util.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC0032d implements Comparator {
    public static final EnumC0032d INSTANCE;
    public static final /* synthetic */ EnumC0032d[] a;

    static {
        EnumC0032d enumC0032d = new EnumC0032d("INSTANCE", 0);
        INSTANCE = enumC0032d;
        a = new EnumC0032d[]{enumC0032d};
    }

    public static EnumC0032d valueOf(String str) {
        return (EnumC0032d) Enum.valueOf(EnumC0032d.class, str);
    }

    public static EnumC0032d[] values() {
        return (EnumC0032d[]) a.clone();
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Comparable) obj).compareTo((Comparable) obj2);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return Comparator$CC.reverseOrder();
    }

    @Override // java.util.Comparator
    public final Comparator thenComparing(Comparator comparator) {
        comparator.getClass();
        return new C0031c(this, comparator, 0);
    }

    @Override // java.util.Comparator
    public final Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        return Comparator$EL.a(this, Comparator$CC.comparingDouble(toDoubleFunction));
    }

    @Override // java.util.Comparator
    public final Comparator thenComparingInt(ToIntFunction toIntFunction) {
        return Comparator$EL.a(this, Comparator$CC.comparingInt(toIntFunction));
    }

    @Override // java.util.Comparator
    public final Comparator thenComparingLong(ToLongFunction toLongFunction) {
        return Comparator$EL.a(this, Comparator$CC.comparingLong(toLongFunction));
    }

    @Override // java.util.Comparator
    public final Comparator thenComparing(Function function, Comparator comparator) {
        return Comparator$EL.a(this, Comparator$CC.comparing(function, comparator));
    }

    @Override // java.util.Comparator
    public final Comparator thenComparing(Function function) {
        return Comparator$EL.a(this, Comparator$CC.comparing(function));
    }
}
