package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class n implements e {
    public static final n INSENSITIVE;
    public static final n LENIENT;
    public static final n SENSITIVE;
    public static final n STRICT;
    public static final /* synthetic */ n[] a;

    static {
        n nVar = new n("SENSITIVE", 0);
        SENSITIVE = nVar;
        n nVar2 = new n("INSENSITIVE", 1);
        INSENSITIVE = nVar2;
        n nVar3 = new n("STRICT", 2);
        STRICT = nVar3;
        n nVar4 = new n("LENIENT", 3);
        LENIENT = nVar4;
        a = new n[]{nVar, nVar2, nVar3, nVar4};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) a.clone();
    }

    @Override // j$.time.format.e
    public final boolean h(u uVar, StringBuilder sb) {
        return true;
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "ParseCaseSensitive(true)";
        }
        if (iOrdinal == 1) {
            return "ParseCaseSensitive(false)";
        }
        if (iOrdinal == 2) {
            return "ParseStrict(true)";
        }
        if (iOrdinal == 3) {
            return "ParseStrict(false)";
        }
        throw new IllegalStateException("Unreachable");
    }
}
