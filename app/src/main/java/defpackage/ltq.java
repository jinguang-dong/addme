package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum ltq {
    ON(0),
    ON_LOCKED(1),
    OFF_NEAR(2),
    OFF_FAR(3),
    OFF_INFINITY(4);

    public final int f;

    ltq(int i) {
        this.f = i;
    }

    public static ltq a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? ON : OFF_INFINITY : OFF_FAR : OFF_NEAR : ON_LOCKED;
    }

    public final int b() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return 2;
        }
        if (iOrdinal == 1) {
            return 3;
        }
        if (iOrdinal == 2) {
            return 4;
        }
        if (iOrdinal == 3) {
            return 5;
        }
        if (iOrdinal == 4) {
            return 6;
        }
        throw new RuntimeException(null, null);
    }
}
