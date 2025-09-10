package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tbz {
    public static final tbz a = new tbz();
    public static final tbz b = new tbz("kOn");
    public static final tbz c = new tbz("kOff");
    private static int e;
    public final int d;
    private final String f;

    static {
        new tbz("kInvalid");
        e = 0;
    }

    private tbz() {
        this.f = "kAuto";
        this.d = 0;
        e = 1;
    }

    public final String toString() {
        return this.f;
    }

    private tbz(String str) {
        this.f = str;
        int i = e;
        e = i + 1;
        this.d = i;
    }
}
