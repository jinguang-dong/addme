package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tce {
    public static final tce a;
    private static int c;
    public final int b;
    private final String d;

    static {
        new tce();
        a = new tce("kF16");
        new tce("kF32");
        c = 0;
    }

    private tce() {
        this.d = "kU16";
        this.b = 1;
        c = 2;
    }

    public final String toString() {
        return this.d;
    }

    private tce(String str) {
        this.d = str;
        int i = c;
        c = i + 1;
        this.b = i;
    }
}
