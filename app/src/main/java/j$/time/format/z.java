package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class z {
    public static final z LENIENT;
    public static final z SMART;
    public static final z STRICT;
    public static final /* synthetic */ z[] a;

    static {
        z zVar = new z("STRICT", 0);
        STRICT = zVar;
        z zVar2 = new z("SMART", 1);
        SMART = zVar2;
        z zVar3 = new z("LENIENT", 2);
        LENIENT = zVar3;
        a = new z[]{zVar, zVar2, zVar3};
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) a.clone();
    }
}
