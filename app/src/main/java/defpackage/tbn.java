package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tbn {
    public static final tbn a;
    public static final tbn b;
    public static final tbn c;
    public static final tbn d;
    public static final tbn e;
    public static final tbn f;
    public static final tbn g;
    public static final tbn h;
    public static final tbn i;
    public static final tbn j;
    private static final tbn[] l;
    public final int k;
    private final String m;

    static {
        tbn tbnVar = new tbn("kUnknown", -1);
        a = tbnVar;
        tbn tbnVar2 = new tbn("kOff", 0);
        b = tbnVar2;
        tbn tbnVar3 = new tbn("kAuto", 1);
        c = tbnVar3;
        tbn tbnVar4 = new tbn("kIncandescent", 2);
        d = tbnVar4;
        tbn tbnVar5 = new tbn("kFluorescent", 3);
        e = tbnVar5;
        tbn tbnVar6 = new tbn("kWarmFluorescent", 4);
        f = tbnVar6;
        tbn tbnVar7 = new tbn("kDaylight", 5);
        g = tbnVar7;
        tbn tbnVar8 = new tbn("kCloudyDaylight", 6);
        h = tbnVar8;
        tbn tbnVar9 = new tbn("kTwilight", 7);
        i = tbnVar9;
        tbn tbnVar10 = new tbn("kShade", 8);
        j = tbnVar10;
        l = new tbn[]{tbnVar, tbnVar2, tbnVar3, tbnVar4, tbnVar5, tbnVar6, tbnVar7, tbnVar8, tbnVar9, tbnVar10};
    }

    private tbn(String str, int i2) {
        this.m = str;
        this.k = i2;
    }

    public static tbn a(int i2) {
        tbn[] tbnVarArr = l;
        if (i2 < 10 && i2 >= 0) {
            tbn tbnVar = tbnVarArr[i2];
            if (tbnVar.k == i2) {
                return tbnVar;
            }
        }
        for (int i3 = 0; i3 < 10; i3++) {
            tbn tbnVar2 = tbnVarArr[i3];
            if (tbnVar2.k == i2) {
                return tbnVar2;
            }
        }
        throw new IllegalArgumentException(tcr.b(i2, tbn.class));
    }

    public final String toString() {
        return this.m;
    }
}
