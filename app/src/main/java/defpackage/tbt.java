package defpackage;

import androidx.compose.foundation.text.modifiers.Yk.LmJPKwPBa;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tbt {
    public static final tbt a;
    public static final tbt b;
    public static final tbt c;
    public static final tbt d;
    public static final tbt e;
    public static final tbt f;
    public static final tbt g;
    public static final tbt h;
    public static final tbt i;
    public static final tbt j;
    public static final tbt k;
    public static final tbt l;
    public static final tbt m;
    public static final tbt n;
    public static final tbt o;
    public static final tbt p;
    public static final tbt q;
    public static final tbt r;
    public static final tbt s;
    public static final tbt t;
    public static final tbt u;
    public static final tbt v;
    private static final tbt[] x;
    public final int w;
    private final String y;

    private tbt(String str, int i2) {
        this.y = str;
        this.w = i2;
    }

    public static tbt a(int i2) {
        tbt[] tbtVarArr = x;
        if (i2 < 22 && i2 >= 0) {
            tbt tbtVar = tbtVarArr[i2];
            if (tbtVar.w == i2) {
                return tbtVar;
            }
        }
        for (int i3 = 0; i3 < 22; i3++) {
            tbt tbtVar2 = tbtVarArr[i3];
            if (tbtVar2.w == i2) {
                return tbtVar2;
            }
        }
        throw new IllegalArgumentException(tcr.b(i2, tbt.class));
    }

    public final String toString() {
        return this.y;
    }

    static {
        tbt tbtVar = new tbt("kUnknown", 0);
        a = tbtVar;
        tbt tbtVar2 = new tbt("kDaylight", 1);
        b = tbtVar2;
        tbt tbtVar3 = new tbt("kFluorescent", 2);
        c = tbtVar3;
        tbt tbtVar4 = new tbt("kTungsten", 3);
        d = tbtVar4;
        tbt tbtVar5 = new tbt("kFlash", 4);
        e = tbtVar5;
        tbt tbtVar6 = new tbt("kFineWeather", 5);
        f = tbtVar6;
        tbt tbtVar7 = new tbt("kCloudyWeather", 10);
        g = tbtVar7;
        tbt tbtVar8 = new tbt("kShade", 11);
        h = tbtVar8;
        tbt tbtVar9 = new tbt("kDaylightFluorescent", 12);
        i = tbtVar9;
        tbt tbtVar10 = new tbt("kDayWhiteFluorescent", 13);
        j = tbtVar10;
        tbt tbtVar11 = new tbt("kCoolWhiteFluorescent", 14);
        k = tbtVar11;
        tbt tbtVar12 = new tbt("kWhiteFluorescent", 15);
        l = tbtVar12;
        tbt tbtVar13 = new tbt("kWarmWhiteFluorescent", 16);
        m = tbtVar13;
        tbt tbtVar14 = new tbt("kStandardLightA", 17);
        n = tbtVar14;
        tbt tbtVar15 = new tbt("kStandardLightB", 18);
        o = tbtVar15;
        tbt tbtVar16 = new tbt("kStandardLightC", 19);
        p = tbtVar16;
        tbt tbtVar17 = new tbt("kD55", 20);
        q = tbtVar17;
        tbt tbtVar18 = new tbt("kD65", 21);
        r = tbtVar18;
        tbt tbtVar19 = new tbt("kD75", 22);
        s = tbtVar19;
        tbt tbtVar20 = new tbt(LmJPKwPBa.EztXs, 23);
        t = tbtVar20;
        tbt tbtVar21 = new tbt("kISOStudioTungsten", 24);
        u = tbtVar21;
        tbt tbtVar22 = new tbt("kOther", 255);
        v = tbtVar22;
        x = new tbt[]{tbtVar, tbtVar2, tbtVar3, tbtVar4, tbtVar5, tbtVar6, tbtVar7, tbtVar8, tbtVar9, tbtVar10, tbtVar11, tbtVar12, tbtVar13, tbtVar14, tbtVar15, tbtVar16, tbtVar17, tbtVar18, tbtVar19, tbtVar20, tbtVar21, tbtVar22};
    }
}
