package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tcc {
    public static final tcc a = new tcc(null);
    public static final tcc b = new tcc();
    private static int d = 0;
    public final int c;
    private final String e;

    private tcc() {
        this.e = "kHigh";
        int i = d;
        d = i + 1;
        this.c = i;
    }

    public final String toString() {
        return this.e;
    }

    private tcc(byte[] bArr) {
        this.e = "kStandard";
        this.c = 0;
        d = 1;
    }
}
