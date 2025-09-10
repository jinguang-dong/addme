package defpackage;

import com.google.android.apps.camera.backup.cNHl.ibINv;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tcq {
    public static final tcq a;
    public static final tcq b;
    public static final tcq c;
    public static final tcq d;
    public static final tcq e;
    public static final tcq f;
    public static final tcq g;
    public static final tcq h;
    public static final tcq i;
    public static final tcq j;
    private static final tcq[] l;
    private static int m;
    public final int k;
    private final String n;

    static {
        tcq tcqVar = new tcq();
        a = tcqVar;
        tcq tcqVar2 = new tcq("kNv12");
        b = tcqVar2;
        tcq tcqVar3 = new tcq("kNv21");
        c = tcqVar3;
        tcq tcqVar4 = new tcq("kRgb");
        d = tcqVar4;
        tcq tcqVar5 = new tcq("kBgr");
        e = tcqVar5;
        tcq tcqVar6 = new tcq("kRgba");
        f = tcqVar6;
        tcq tcqVar7 = new tcq("kBgra");
        g = tcqVar7;
        tcq tcqVar8 = new tcq("kArgb");
        h = tcqVar8;
        tcq tcqVar9 = new tcq("kAbgr");
        i = tcqVar9;
        tcq tcqVar10 = new tcq("kRgb16");
        j = tcqVar10;
        l = new tcq[]{tcqVar, tcqVar2, tcqVar3, tcqVar4, tcqVar5, tcqVar6, tcqVar7, tcqVar8, tcqVar9, tcqVar10};
        m = 0;
    }

    private tcq() {
        this.n = ibINv.pyJI;
        this.k = 0;
        m = 1;
    }

    public static tcq a(int i2) {
        tcq[] tcqVarArr = l;
        if (i2 < 10 && i2 >= 0) {
            tcq tcqVar = tcqVarArr[i2];
            if (tcqVar.k == i2) {
                return tcqVar;
            }
        }
        for (int i3 = 0; i3 < 10; i3++) {
            tcq tcqVar2 = tcqVarArr[i3];
            if (tcqVar2.k == i2) {
                return tcqVar2;
            }
        }
        throw new IllegalArgumentException(tcr.b(i2, tcq.class));
    }

    public final String toString() {
        return this.n;
    }

    private tcq(String str) {
        this.n = str;
        int i2 = m;
        m = i2 + 1;
        this.k = i2;
    }
}
