package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tbh {
    public static final tbh a;
    public static final tbh b;
    public static final tbh c;
    public static final tbh d;
    public static final tbh e;
    public static final tbh f;
    public static final tbh g;
    private static final tbh[] i;
    public final int h;
    private final String j;

    static {
        tbh tbhVar = new tbh("kUnknown", -1);
        a = tbhVar;
        tbh tbhVar2 = new tbh("kInactive", 0);
        b = tbhVar2;
        tbh tbhVar3 = new tbh("kSearching", 1);
        c = tbhVar3;
        tbh tbhVar4 = new tbh("kConverged", 2);
        d = tbhVar4;
        tbh tbhVar5 = new tbh("kLocked", 3);
        e = tbhVar5;
        tbh tbhVar6 = new tbh("kFlashRequired", 4);
        f = tbhVar6;
        tbh tbhVar7 = new tbh("kPrecapture", 5);
        g = tbhVar7;
        i = new tbh[]{tbhVar, tbhVar2, tbhVar3, tbhVar4, tbhVar5, tbhVar6, tbhVar7};
    }

    private tbh(String str, int i2) {
        this.j = str;
        this.h = i2;
    }

    public static tbh a(int i2) {
        tbh[] tbhVarArr = i;
        if (i2 < 7 && i2 >= 0) {
            tbh tbhVar = tbhVarArr[i2];
            if (tbhVar.h == i2) {
                return tbhVar;
            }
        }
        for (int i3 = 0; i3 < 7; i3++) {
            tbh tbhVar2 = tbhVarArr[i3];
            if (tbhVar2.h == i2) {
                return tbhVar2;
            }
        }
        throw new IllegalArgumentException(tcr.b(i2, tbh.class));
    }

    public final String toString() {
        return this.j;
    }
}
