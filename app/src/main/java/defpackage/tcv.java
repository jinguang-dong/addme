package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tcv {
    public static final tcv a;
    public static final tcv b;
    public static final tcv c;
    public static final tcv[] d;
    public final int e;
    private final String f;

    static {
        tcv tcvVar = new tcv("RELIGHTING_NONE", 0);
        a = tcvVar;
        tcv tcvVar2 = new tcv("RELIGHTING_PR_DEFAULT", 1);
        b = tcvVar2;
        tcv tcvVar3 = new tcv("RELIGHTING_PR_OPT_IN", 2);
        c = tcvVar3;
        d = new tcv[]{tcvVar, tcvVar2, tcvVar3};
    }

    private tcv(String str, int i) {
        this.f = str;
        this.e = i;
    }

    public final String toString() {
        return this.f;
    }
}
