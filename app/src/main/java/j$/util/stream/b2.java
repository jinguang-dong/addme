package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class b2 {
    public static final b2 MAYBE_MORE;
    public static final b2 NO_MORE;
    public static final b2 UNLIMITED;
    public static final /* synthetic */ b2[] a;

    static {
        b2 b2Var = new b2("NO_MORE", 0);
        NO_MORE = b2Var;
        b2 b2Var2 = new b2("MAYBE_MORE", 1);
        MAYBE_MORE = b2Var2;
        b2 b2Var3 = new b2("UNLIMITED", 2);
        UNLIMITED = b2Var3;
        a = new b2[]{b2Var, b2Var2, b2Var3};
    }

    public static b2 valueOf(String str) {
        return (b2) Enum.valueOf(b2.class, str);
    }

    public static b2[] values() {
        return (b2[]) a.clone();
    }
}
