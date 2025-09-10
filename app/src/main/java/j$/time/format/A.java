package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class A {
    public static final A ALWAYS;
    public static final A EXCEEDS_PAD;
    public static final A NEVER;
    public static final A NORMAL;
    public static final A NOT_NEGATIVE;
    public static final /* synthetic */ A[] a;

    static {
        A a2 = new A("NORMAL", 0);
        NORMAL = a2;
        A a3 = new A("ALWAYS", 1);
        ALWAYS = a3;
        A a4 = new A("NEVER", 2);
        NEVER = a4;
        A a5 = new A("NOT_NEGATIVE", 3);
        NOT_NEGATIVE = a5;
        A a6 = new A("EXCEEDS_PAD", 4);
        EXCEEDS_PAD = a6;
        a = new A[]{a2, a3, a4, a5, a6};
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) a.clone();
    }
}
