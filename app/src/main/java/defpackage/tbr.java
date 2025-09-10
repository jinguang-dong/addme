package defpackage;

import com.google.android.apps.camera.imax.cyclops.audio.xcIh.cdVQ;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tbr {
    public static final tbr a;
    public static final tbr b;
    public static final tbr c;
    public static final tbr d;
    public static final tbr e;
    public static final tbr f;
    private static final tbr[] h;
    public final int g;
    private final String i;

    private tbr(String str, int i) {
        this.i = str;
        this.g = i;
    }

    public static tbr a(int i) {
        tbr[] tbrVarArr = h;
        if (i < 6 && i >= 0) {
            tbr tbrVar = tbrVarArr[i];
            if (tbrVar.g == i) {
                return tbrVar;
            }
        }
        for (int i2 = 0; i2 < 6; i2++) {
            tbr tbrVar2 = tbrVarArr[i2];
            if (tbrVar2.g == i) {
                return tbrVar2;
            }
        }
        throw new IllegalArgumentException(tcr.b(i, tbr.class));
    }

    public final String toString() {
        return this.i;
    }

    static {
        tbr tbrVar = new tbr("kUnknown", -1);
        a = tbrVar;
        tbr tbrVar2 = new tbr("kOff", 0);
        b = tbrVar2;
        tbr tbrVar3 = new tbr("kAuto", 1);
        c = tbrVar3;
        tbr tbrVar4 = new tbr("kUseSceneMode", 2);
        d = tbrVar4;
        tbr tbrVar5 = new tbr("kOffKeepState", 3);
        e = tbrVar5;
        tbr tbrVar6 = new tbr(cdVQ.NDIDgIe, 4);
        f = tbrVar6;
        h = new tbr[]{tbrVar, tbrVar2, tbrVar3, tbrVar4, tbrVar5, tbrVar6};
    }
}
