package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tcm {
    public static final tcm a = new tcm();
    public static final tcm b;
    private static int d;
    public final int c;
    private final String e;

    static {
        new tcm("kSabre");
        new tcm("kSpatialBayer");
        b = new tcm("kSpatialRgb");
        new tcm("kMultiresRgb");
        new tcm("kInvalid");
        d = 0;
    }

    private tcm() {
        this.e = "kWienerFilter";
        this.c = 0;
        d = 1;
    }

    public final String toString() {
        return this.e;
    }

    private tcm(String str) {
        this.e = str;
        int i = d;
        d = i + 1;
        this.c = i;
    }
}
