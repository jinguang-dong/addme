package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tbp {
    public static final tbp a;
    public static final tbp b;
    public static final tbp c;
    public static final tbp d;
    public static final tbp e;
    public static final tbp f;
    public static final tbp g;
    public static final tbp h;
    public static final tbp i;
    public static final tbp j;
    private static final tbp[] l;
    private static int m;
    public final int k;
    private final String n;

    static {
        tbp tbpVar = new tbp();
        a = tbpVar;
        tbp tbpVar2 = new tbp("kRGGB");
        b = tbpVar2;
        tbp tbpVar3 = new tbp("kBGGR");
        c = tbpVar3;
        tbp tbpVar4 = new tbp("kGRBG");
        d = tbpVar4;
        tbp tbpVar5 = new tbp("kGBRG");
        e = tbpVar5;
        tbp tbpVar6 = new tbp("kQuadRGGB");
        f = tbpVar6;
        tbp tbpVar7 = new tbp("kQuadBGGR");
        g = tbpVar7;
        tbp tbpVar8 = new tbp("kQuadGRBG");
        h = tbpVar8;
        tbp tbpVar9 = new tbp("kQuadGBRG");
        i = tbpVar9;
        tbp tbpVar10 = new tbp("kNone");
        j = tbpVar10;
        l = new tbp[]{tbpVar, tbpVar2, tbpVar3, tbpVar4, tbpVar5, tbpVar6, tbpVar7, tbpVar8, tbpVar9, tbpVar10};
        m = 0;
    }

    private tbp() {
        this.n = "kInvalid";
        this.k = 0;
        m = 1;
    }

    public static tbp a(int i2) {
        tbp[] tbpVarArr = l;
        if (i2 < 10 && i2 >= 0) {
            tbp tbpVar = tbpVarArr[i2];
            if (tbpVar.k == i2) {
                return tbpVar;
            }
        }
        for (int i3 = 0; i3 < 10; i3++) {
            tbp tbpVar2 = tbpVarArr[i3];
            if (tbpVar2.k == i2) {
                return tbpVar2;
            }
        }
        throw new IllegalArgumentException(tcr.b(i2, tbp.class));
    }

    public final String toString() {
        return this.n;
    }

    private tbp(String str) {
        this.n = str;
        int i2 = m;
        m = i2 + 1;
        this.k = i2;
    }
}
