package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tcn {
    public static final tcn a;
    public static final tcn b;
    private static int d;
    public final int c;
    private final String e;

    static {
        new tcn();
        a = new tcn("kImageBasedMotionProcessing");
        b = new tcn("kMotionMetadataProcessing");
        d = 0;
    }

    private tcn() {
        this.e = "kNone";
        this.c = 0;
        d = 1;
    }

    public final String toString() {
        return this.e;
    }

    private tcn(String str) {
        this.e = str;
        int i = d;
        d = i + 1;
        this.c = i;
    }
}
