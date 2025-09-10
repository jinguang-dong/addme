package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tcw {
    public static final tcw a = new tcw();
    public static final tcw b = new tcw("kLanczos");
    public static final tcw c;
    public static final tcw d;
    private static int f;
    public final int e;
    private final String g;

    static {
        new tcw("kRaisr");
        c = new tcw("kLancet");
        new tcw("kKeplerIldm");
        d = new tcw("kKeplerGan");
        new tcw("kInvalid");
        f = 0;
    }

    private tcw() {
        this.g = "kNone";
        this.e = 0;
        f = 1;
    }

    public final String toString() {
        return this.g;
    }

    private tcw(String str) {
        this.g = str;
        int i = f;
        f = i + 1;
        this.e = i;
    }
}
