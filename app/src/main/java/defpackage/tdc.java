package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tdc {
    public static final tdc a = new tdc();
    public static final tdc b = new tdc("kManual");
    private static int d;
    public final int c;
    private final String e;

    static {
        new tdc("kUnknown");
        d = 0;
    }

    private tdc() {
        this.e = "kAuto";
        this.c = 0;
        d = 1;
    }

    public final String toString() {
        return this.e;
    }

    private tdc(String str) {
        this.e = str;
        int i = d;
        d = i + 1;
        this.c = i;
    }
}
