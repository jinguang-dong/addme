package defpackage;

import com.google.android.apps.camera.ui.zoomlock.Gx.nWEkBGOQPWQp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tcy {
    public static final tcy a;
    public static final tcy b;
    public static final tcy c;
    public static final tcy d;
    public static final tcy e;
    public static final tcy f;
    public static final tcy g;
    public static final tcy h;
    public static final tcy i;
    public static final tcy j;
    public static final tcy k;
    public static final tcy l;
    public static final tcy m;
    public static final tcy n;
    public static final tcy o;
    public static final tcy p;
    public static final tcy q;
    public static final tcy r;
    public static final tcy s;
    public static final tcy t;
    public static final tcy u;
    public static final tcy v;
    private static final tcy[] x;
    public final int w;
    private final String y;

    private tcy(String str, int i2) {
        this.y = str;
        this.w = i2;
    }

    public static tcy a(int i2) {
        tcy[] tcyVarArr = x;
        if (i2 < 22 && i2 >= 0) {
            tcy tcyVar = tcyVarArr[i2];
            if (tcyVar.w == i2) {
                return tcyVar;
            }
        }
        for (int i3 = 0; i3 < 22; i3++) {
            tcy tcyVar2 = tcyVarArr[i3];
            if (tcyVar2.w == i2) {
                return tcyVar2;
            }
        }
        throw new IllegalArgumentException(tcr.b(i2, tcy.class));
    }

    public final String toString() {
        return this.y;
    }

    static {
        tcy tcyVar = new tcy("kInvalid", -1);
        a = tcyVar;
        tcy tcyVar2 = new tcy("kRearRegular", 0);
        b = tcyVar2;
        tcy tcyVar3 = new tcy("kRearRegularBinned", 10);
        c = tcyVar3;
        tcy tcyVar4 = new tcy("kRearRegularRemosaicked", 11);
        d = tcyVar4;
        tcy tcyVar5 = new tcy("kRearRegularMaxRes", 14);
        e = tcyVar5;
        tcy tcyVar6 = new tcy("kRearRegularRoshi", 17);
        f = tcyVar6;
        tcy tcyVar7 = new tcy("kRearTelephoto", 4);
        g = tcyVar7;
        tcy tcyVar8 = new tcy("kRearTelephotoBinned", 7);
        h = tcyVar8;
        tcy tcyVar9 = new tcy("kRearTelephotoRemosaicked", 12);
        i = tcyVar9;
        tcy tcyVar10 = new tcy(nWEkBGOQPWQp.DnqpFYz, 15);
        j = tcyVar10;
        tcy tcyVar11 = new tcy("kRearUltrawide", 8);
        k = tcyVar11;
        tcy tcyVar12 = new tcy("kRearUltrawideBinned", 9);
        l = tcyVar12;
        tcy tcyVar13 = new tcy("kRearUltrawideRemosaicked", 18);
        m = tcyVar13;
        tcy tcyVar14 = new tcy("kRearUltrawideMaxRes", 16);
        n = tcyVar14;
        tcy tcyVar15 = new tcy("kRearUltrawideUnbinnedCrop", 19);
        o = tcyVar15;
        tcy tcyVar16 = new tcy("kRearLogical", 5);
        p = tcyVar16;
        tcy tcyVar17 = new tcy("kFrontRegular", 1);
        q = tcyVar17;
        tcy tcyVar18 = new tcy("kFrontUltrawide", 2);
        r = tcyVar18;
        tcy tcyVar19 = new tcy("kFrontLogical", 3);
        s = tcyVar19;
        tcy tcyVar20 = new tcy("kFrontInfrared", 6);
        t = tcyVar20;
        tcy tcyVar21 = new tcy("kFrontSecondary", 13);
        u = tcyVar21;
        tcy tcyVar22 = new tcy("kCount", 21);
        v = tcyVar22;
        x = new tcy[]{tcyVar, tcyVar2, tcyVar3, tcyVar4, tcyVar5, tcyVar6, tcyVar7, tcyVar8, tcyVar9, tcyVar10, tcyVar11, tcyVar12, tcyVar13, tcyVar14, tcyVar15, tcyVar16, tcyVar17, tcyVar18, tcyVar19, tcyVar20, tcyVar21, tcyVar22};
    }
}
