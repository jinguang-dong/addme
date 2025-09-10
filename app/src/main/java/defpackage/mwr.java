package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum mwr {
    UNKNOWN(0, 0),
    TOP_LEFT(1, 1),
    TOP(1, 2),
    TOP_RIGHT(1, 3),
    LEFT(2, 1),
    CENTER(2, 2),
    RIGHT(2, 3),
    BOTTOM_LEFT(3, 1),
    i(3, 2),
    BOTTOM_RIGHT(3, 3);

    public final int k;
    public final int l;

    mwr(int i2, int i3) {
        this.k = i2;
        this.l = i3;
    }

    public static mwr a(int i2, int i3) {
        for (mwr mwrVar : values()) {
            if (mwrVar.k == i2 && mwrVar.l == i3) {
                return mwrVar;
            }
        }
        return UNKNOWN;
    }
}
