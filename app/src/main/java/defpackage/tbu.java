package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tbu {
    public static final tbu a;
    public static final tbu b;
    public static final tbu c;
    public static final tbu d;
    private static final tbu[] f;
    private static int g;
    public final int e;
    private final String h;

    static {
        tbu tbuVar = new tbu();
        a = tbuVar;
        tbu tbuVar2 = new tbu("kCpu");
        b = tbuVar2;
        tbu tbuVar3 = new tbu("kHexagon");
        c = tbuVar3;
        tbu tbuVar4 = new tbu("kGxp");
        d = tbuVar4;
        f = new tbu[]{tbuVar, tbuVar2, tbuVar3, tbuVar4};
        g = 0;
    }

    private tbu() {
        this.h = "kInvalid";
        this.e = 0;
        g = 1;
    }

    public static tbu a(int i) {
        tbu[] tbuVarArr = f;
        if (i < 4 && i >= 0) {
            tbu tbuVar = tbuVarArr[i];
            if (tbuVar.e == i) {
                return tbuVar;
            }
        }
        for (int i2 = 0; i2 < 4; i2++) {
            tbu tbuVar2 = tbuVarArr[i2];
            if (tbuVar2.e == i) {
                return tbuVar2;
            }
        }
        throw new IllegalArgumentException(tcr.b(i, tbu.class));
    }

    public final String toString() {
        return this.h;
    }

    private tbu(String str) {
        this.h = str;
        int i = g;
        g = i + 1;
        this.e = i;
    }
}
