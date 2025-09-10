package defpackage;

import androidx.compose.foundation.text.modifiers.Yk.LmJPKwPBa;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tbk {
    public static final tbk a;
    public static final tbk b;
    public static final tbk c;
    public static final tbk d;
    public static final tbk e;
    public static final tbk f;
    public static final tbk g;
    public static final tbk h;
    private static final tbk[] j;
    public final int i;
    private final String k;

    private tbk(String str, int i) {
        this.k = str;
        this.i = i;
    }

    public static tbk a(int i) {
        tbk[] tbkVarArr = j;
        if (i < 8 && i >= 0) {
            tbk tbkVar = tbkVarArr[i];
            if (tbkVar.i == i) {
                return tbkVar;
            }
        }
        for (int i2 = 0; i2 < 8; i2++) {
            tbk tbkVar2 = tbkVarArr[i2];
            if (tbkVar2.i == i) {
                return tbkVar2;
            }
        }
        throw new IllegalArgumentException(tcr.b(i, tbk.class));
    }

    public final String toString() {
        return this.k;
    }

    static {
        tbk tbkVar = new tbk("kUnknown", -1);
        a = tbkVar;
        tbk tbkVar2 = new tbk("kInactive", 0);
        b = tbkVar2;
        tbk tbkVar3 = new tbk(LmJPKwPBa.lFv, 1);
        c = tbkVar3;
        tbk tbkVar4 = new tbk("kPassiveFocused", 2);
        d = tbkVar4;
        tbk tbkVar5 = new tbk("kActiveScan", 3);
        e = tbkVar5;
        tbk tbkVar6 = new tbk("kFocusedLocked", 4);
        f = tbkVar6;
        tbk tbkVar7 = new tbk("kNotFocusedLocked", 5);
        g = tbkVar7;
        tbk tbkVar8 = new tbk("kPassiveUnfocused", 6);
        h = tbkVar8;
        j = new tbk[]{tbkVar, tbkVar2, tbkVar3, tbkVar4, tbkVar5, tbkVar6, tbkVar7, tbkVar8};
    }
}
