package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum ltr {
    OFF(0),
    ON_LIGHT(1),
    ON_STRONG(2),
    DEBUG_MAX(3),
    ON_ADAPTIVE(4);

    public final int f;

    ltr(int i) {
        this.f = i;
    }

    public static ltr a(int i) {
        if (i == 0) {
            return OFF;
        }
        if (i == 1) {
            return ON_LIGHT;
        }
        if (i == 2) {
            return ON_STRONG;
        }
        if (i == 3) {
            return DEBUG_MAX;
        }
        if (i == 4) {
            return ON_ADAPTIVE;
        }
        throw new IllegalArgumentException("Unknown beautification level");
    }

    public final boolean b() {
        return this != OFF;
    }
}
