package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tbo {
    public static final tbo a;
    public static final tbo b;
    public static final tbo c;
    public static final tbo d;
    public static final tbo e;
    private static final tbo[] g;
    public final int f;
    private final String h;

    static {
        tbo tboVar = new tbo("kUnknown", -1);
        a = tboVar;
        tbo tboVar2 = new tbo("kInactive", 0);
        b = tboVar2;
        tbo tboVar3 = new tbo("kSearching", 1);
        c = tboVar3;
        tbo tboVar4 = new tbo("kConverged", 2);
        d = tboVar4;
        tbo tboVar5 = new tbo("kLocked", 3);
        e = tboVar5;
        g = new tbo[]{tboVar, tboVar2, tboVar3, tboVar4, tboVar5};
    }

    private tbo(String str, int i) {
        this.h = str;
        this.f = i;
    }

    public static tbo a(int i) {
        tbo[] tboVarArr = g;
        if (i < 5 && i >= 0) {
            tbo tboVar = tboVarArr[i];
            if (tboVar.f == i) {
                return tboVar;
            }
        }
        for (int i2 = 0; i2 < 5; i2++) {
            tbo tboVar2 = tboVarArr[i2];
            if (tboVar2.f == i) {
                return tboVar2;
            }
        }
        throw new IllegalArgumentException(tcr.b(i, tbo.class));
    }

    public final String toString() {
        return this.h;
    }
}
