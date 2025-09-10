package defpackage;

import com.google.android.apps.camera.toast.vvJ.CGlJpiVWrCQOq;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tbf {
    public static final tbf a;
    public static final tbf b;
    public static final tbf c;
    public static final tbf d;
    public static final tbf e;
    public static final tbf f;
    public static final tbf g;
    private static final tbf[] i;
    public final int h;
    private final String j;

    private tbf(String str, int i2) {
        this.j = str;
        this.h = i2;
    }

    public static tbf a(int i2) {
        tbf[] tbfVarArr = i;
        if (i2 < 7 && i2 >= 0) {
            tbf tbfVar = tbfVarArr[i2];
            if (tbfVar.h == i2) {
                return tbfVar;
            }
        }
        for (int i3 = 0; i3 < 7; i3++) {
            tbf tbfVar2 = tbfVarArr[i3];
            if (tbfVar2.h == i2) {
                return tbfVar2;
            }
        }
        throw new IllegalArgumentException(tcr.b(i2, tbf.class));
    }

    public final String toString() {
        return this.j;
    }

    static {
        tbf tbfVar = new tbf("kUnknown", -1);
        a = tbfVar;
        tbf tbfVar2 = new tbf("kOff", 0);
        b = tbfVar2;
        tbf tbfVar3 = new tbf("kOn", 1);
        c = tbfVar3;
        tbf tbfVar4 = new tbf(CGlJpiVWrCQOq.zCeuXWbu, 2);
        d = tbfVar4;
        tbf tbfVar5 = new tbf("kOnAlwaysFlash", 3);
        e = tbfVar5;
        tbf tbfVar6 = new tbf("kOnAutoFlashRedeye", 4);
        f = tbfVar6;
        tbf tbfVar7 = new tbf("kOnExternalFlash", 5);
        g = tbfVar7;
        i = new tbf[]{tbfVar, tbfVar2, tbfVar3, tbfVar4, tbfVar5, tbfVar6, tbfVar7};
    }
}
