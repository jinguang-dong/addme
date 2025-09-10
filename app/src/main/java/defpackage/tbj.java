package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tbj {
    public static final tbj a;
    public static final tbj b;
    public static final tbj c;
    public static final tbj d;
    public static final tbj e;
    public static final tbj f;
    public static final tbj g;
    private static final tbj[] i;
    public final int h;
    private final String j;

    static {
        tbj tbjVar = new tbj("kUnknown", -1);
        a = tbjVar;
        tbj tbjVar2 = new tbj("kOff", 0);
        b = tbjVar2;
        tbj tbjVar3 = new tbj("kAuto", 1);
        c = tbjVar3;
        tbj tbjVar4 = new tbj("kMacro", 2);
        d = tbjVar4;
        tbj tbjVar5 = new tbj("kContinuousVideo", 3);
        e = tbjVar5;
        tbj tbjVar6 = new tbj("kContinuousPicture", 4);
        f = tbjVar6;
        tbj tbjVar7 = new tbj("kExtendedDepthOfField", 5);
        g = tbjVar7;
        i = new tbj[]{tbjVar, tbjVar2, tbjVar3, tbjVar4, tbjVar5, tbjVar6, tbjVar7};
    }

    private tbj(String str, int i2) {
        this.j = str;
        this.h = i2;
    }

    public static tbj a(int i2) {
        tbj[] tbjVarArr = i;
        if (i2 < 7 && i2 >= 0) {
            tbj tbjVar = tbjVarArr[i2];
            if (tbjVar.h == i2) {
                return tbjVar;
            }
        }
        for (int i3 = 0; i3 < 7; i3++) {
            tbj tbjVar2 = tbjVarArr[i3];
            if (tbjVar2.h == i2) {
                return tbjVar2;
            }
        }
        throw new IllegalArgumentException(tcr.b(i2, tbj.class));
    }

    public final String toString() {
        return this.j;
    }
}
