package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tdb {
    public static final tdb a;
    public static final tdb b;
    private static int d;
    public final int c;
    private final String e;

    static {
        new tdb();
        a = new tdb("kHeuristic");
        b = new tdb("kMl");
        d = 0;
    }

    private tdb() {
        this.e = "kNone";
        this.c = 0;
        d = 1;
    }

    public final String toString() {
        return this.e;
    }

    private tdb(String str) {
        this.e = str;
        int i = d;
        d = i + 1;
        this.c = i;
    }
}
