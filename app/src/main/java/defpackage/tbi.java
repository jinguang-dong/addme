package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tbi {
    public static final tbi a = new tbi();
    public static final tbi b = new tbi("kHdrLong");
    private static int d;
    public final int c;
    private final String e;

    static {
        new tbi("kAeTypeCount");
        d = 0;
    }

    private tbi() {
        this.e = "kHdrShort";
        this.c = 0;
        d = 1;
    }

    public final String toString() {
        return this.e;
    }

    private tbi(String str) {
        this.e = str;
        int i = d;
        d = i + 1;
        this.c = i;
    }
}
