package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class F1 {
    public static final F1 DOUBLE_VALUE;
    public static final F1 INT_VALUE;
    public static final F1 LONG_VALUE;
    public static final F1 REFERENCE;
    public static final /* synthetic */ F1[] a;

    static {
        F1 f1 = new F1("REFERENCE", 0);
        REFERENCE = f1;
        F1 f12 = new F1("INT_VALUE", 1);
        INT_VALUE = f12;
        F1 f13 = new F1("LONG_VALUE", 2);
        LONG_VALUE = f13;
        F1 f14 = new F1("DOUBLE_VALUE", 3);
        DOUBLE_VALUE = f14;
        a = new F1[]{f1, f12, f13, f14};
    }

    public static F1 valueOf(String str) {
        return (F1) Enum.valueOf(F1.class, str);
    }

    public static F1[] values() {
        return (F1[]) a.clone();
    }
}
