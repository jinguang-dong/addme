package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tcg {
    public static final tcg a = new tcg();
    public static final tcg b;
    public static final tcg c;
    private static int e;
    public final String d;

    static {
        new tcg("kMeteringFrame");
        b = new tcg("kPayloadFrame");
        new tcg("kPayloadAuxFrame");
        c = new tcg("kViewfinderFrame");
        e = 0;
    }

    private tcg() {
        this.d = "kUnknownFrameType";
        e = 1;
    }

    public final String toString() {
        return this.d;
    }

    private tcg(String str) {
        this.d = str;
        e++;
    }
}
