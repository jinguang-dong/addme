package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tbx {
    public static final tbx a;
    public static final tbx b;
    public static final tbx c;
    public static final tbx d;
    public static final tbx[] e;
    public final int f;
    private final String g;

    static {
        tbx tbxVar = new tbx("kUnspecified", -1);
        a = tbxVar;
        tbx tbxVar2 = new tbx("kCat", 0);
        b = tbxVar2;
        tbx tbxVar3 = new tbx("kDog", 1);
        c = tbxVar3;
        tbx tbxVar4 = new tbx("kHuman", 2);
        d = tbxVar4;
        e = new tbx[]{tbxVar, tbxVar2, tbxVar3, tbxVar4};
    }

    private tbx(String str, int i) {
        this.g = str;
        this.f = i;
    }

    public final String toString() {
        return this.g;
    }
}
