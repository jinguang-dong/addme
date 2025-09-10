package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class D1 {
    public static final D1 OP;
    public static final D1 SPLITERATOR;
    public static final D1 STREAM;
    public static final D1 TERMINAL_OP;
    public static final D1 UPSTREAM_TERMINAL_OP;
    public static final /* synthetic */ D1[] a;

    static {
        D1 d1 = new D1("SPLITERATOR", 0);
        SPLITERATOR = d1;
        D1 d12 = new D1("STREAM", 1);
        STREAM = d12;
        D1 d13 = new D1("OP", 2);
        OP = d13;
        D1 d14 = new D1("TERMINAL_OP", 3);
        TERMINAL_OP = d14;
        D1 d15 = new D1("UPSTREAM_TERMINAL_OP", 4);
        UPSTREAM_TERMINAL_OP = d15;
        a = new D1[]{d1, d12, d13, d14, d15};
    }

    public static D1 valueOf(String str) {
        return (D1) Enum.valueOf(D1.class, str);
    }

    public static D1[] values() {
        return (D1[]) a.clone();
    }
}
