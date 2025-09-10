package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tbv {
    public static final tbv a;
    public static final tbv b;
    public static final tbv c;
    public static final tbv d;
    public static final tbv e;
    public static final tbv[] f;
    public final int g;
    private final String h;

    static {
        tbv tbvVar = new tbv("kUnknown", -1);
        a = tbvVar;
        tbv tbvVar2 = new tbv("kAuto", 0);
        b = tbvVar2;
        tbv tbvVar3 = new tbv("kShutter", 1);
        c = tbvVar3;
        tbv tbvVar4 = new tbv("kIso", 2);
        d = tbvVar4;
        tbv tbvVar5 = new tbv("kManual", 3);
        e = tbvVar5;
        f = new tbv[]{tbvVar, tbvVar2, tbvVar3, tbvVar4, tbvVar5};
    }

    private tbv(String str, int i) {
        this.h = str;
        this.g = i;
    }

    public final String toString() {
        return this.h;
    }
}
