package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum ltw {
    OFF(0),
    THREE(3),
    FIVE(5),
    TEN(10),
    AUTO(-1);

    public final int h;
    public static final ltw f = OFF;
    public static final int[] g = new int[values().length];

    static {
        int i2 = 0;
        ltw[] ltwVarArrValues = values();
        int length = ltwVarArrValues.length;
        int i3 = 0;
        while (i2 < length) {
            g[i3] = ltwVarArrValues[i2].h;
            i2++;
            i3++;
        }
    }

    ltw(int i2) {
        this.h = i2;
    }

    public static ltw a(int i2) {
        return i2 != -1 ? i2 != 0 ? i2 != 3 ? i2 != 5 ? i2 != 10 ? f : TEN : FIVE : THREE : OFF : AUTO;
    }
}
