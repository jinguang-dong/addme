package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tcf {
    public static final tcf a;
    private static int c;
    public final int b;
    private final String d;

    static {
        new tcf();
        a = new tcf("kSpatialMerge");
        new tcf("kSpatialMergeCpu");
        c = 0;
    }

    private tcf() {
        this.d = "kSabre";
        this.b = 1;
        c = 2;
    }

    public final String toString() {
        return this.d;
    }

    private tcf(String str) {
        this.d = str;
        int i = c;
        c = i + 1;
        this.b = i;
    }
}
