package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class rvx implements rvu {
    public static final rvx a;
    private static final /* synthetic */ rvx[] b;

    static {
        rvx rvxVar = new rvx();
        a = rvxVar;
        b = new rvx[]{rvxVar};
    }

    private rvx() {
    }

    public static rvx[] values() {
        return (rvx[]) b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "Functions.identity()";
    }

    @Override // defpackage.rvu
    public final Object apply(Object obj) {
        return obj;
    }
}
