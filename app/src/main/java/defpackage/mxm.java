package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum mxm {
    PORTRAIT(0),
    LANDSCAPE(270),
    REVERSE_LANDSCAPE(90),
    REVERSE_PORTRAIT(180);

    public final int e;

    mxm(int i) {
        this.e = i;
    }

    public static mxm a(int i) {
        if (i == 0) {
            return PORTRAIT;
        }
        if (i == 90) {
            return REVERSE_LANDSCAPE;
        }
        if (i == 180) {
            return REVERSE_PORTRAIT;
        }
        if (i == 270) {
            return LANDSCAPE;
        }
        throw new IllegalArgumentException(a.bv(i, "Unsupported orientation degrees: "));
    }

    public static mxm b(int i) {
        return a((((i + 45) % 360) / 90) * 90);
    }

    public final mxm c() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return REVERSE_PORTRAIT;
        }
        if (iOrdinal == 1) {
            return REVERSE_LANDSCAPE;
        }
        if (iOrdinal == 2) {
            return LANDSCAPE;
        }
        if (iOrdinal == 3) {
            return PORTRAIT;
        }
        throw new RuntimeException(null, null);
    }

    public final boolean d() {
        return equals(PORTRAIT) || equals(REVERSE_PORTRAIT);
    }
}
