package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tbg {
    public static final tbg a;
    public static final tbg b;
    public static final tbg c;
    public static final tbg d;
    private static final tbg[] f;
    public final int e;
    private final String g;

    static {
        tbg tbgVar = new tbg("kUnknown", -1);
        a = tbgVar;
        tbg tbgVar2 = new tbg("kIdle", 0);
        b = tbgVar2;
        tbg tbgVar3 = new tbg("kStart", 1);
        c = tbgVar3;
        tbg tbgVar4 = new tbg("kCancel", 2);
        d = tbgVar4;
        f = new tbg[]{tbgVar, tbgVar2, tbgVar3, tbgVar4};
    }

    private tbg(String str, int i) {
        this.g = str;
        this.e = i;
    }

    public static tbg a(int i) {
        tbg[] tbgVarArr = f;
        if (i < 4 && i >= 0) {
            tbg tbgVar = tbgVarArr[i];
            if (tbgVar.e == i) {
                return tbgVar;
            }
        }
        for (int i2 = 0; i2 < 4; i2++) {
            tbg tbgVar2 = tbgVarArr[i2];
            if (tbgVar2.e == i) {
                return tbgVar2;
            }
        }
        throw new IllegalArgumentException(tcr.b(i, tbg.class));
    }

    public final String toString() {
        return this.g;
    }
}
