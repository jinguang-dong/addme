package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum mxn {
    LEFT(6, 4, 3),
    RIGHT(7, 3, 4),
    TOP(3, 6, 7),
    BOTTOM(4, 7, 6);

    private final int f;
    private final int g;
    private final int h;

    mxn(int i, int i2, int i3) {
        this.f = i;
        this.g = i2;
        this.h = i3;
    }

    public final int a(mxm mxmVar) {
        int iOrdinal = mxmVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return this.g;
            }
            if (iOrdinal == 2) {
                return this.h;
            }
            if (iOrdinal != 3) {
                throw new RuntimeException(null, null);
            }
        }
        return this.f;
    }
}
