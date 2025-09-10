package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tbw {
    public static final tbw a = new tbw("kDefault");
    private static int c;
    public final int b;
    private final String d;

    static {
        new tbw("kExternalOnly");
        new tbw("kForceInternal");
        c = 0;
    }

    private tbw(String str) {
        this.d = str;
        int i = c;
        c = i + 1;
        this.b = i;
    }

    public final String toString() {
        return this.d;
    }
}
