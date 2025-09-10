package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tbl {
    public static final tbl a;
    public static final tbl b;
    public static final tbl c;
    public static final tbl d;
    private static final tbl[] f;
    public final int e;
    private final String g;

    static {
        tbl tblVar = new tbl("kUnknown", -1);
        a = tblVar;
        tbl tblVar2 = new tbl("kIdle", 0);
        b = tblVar2;
        tbl tblVar3 = new tbl("kStart", 1);
        c = tblVar3;
        tbl tblVar4 = new tbl("kCancel", 2);
        d = tblVar4;
        f = new tbl[]{tblVar, tblVar2, tblVar3, tblVar4};
    }

    private tbl(String str, int i) {
        this.g = str;
        this.e = i;
    }

    public static tbl a(int i) {
        tbl[] tblVarArr = f;
        if (i < 4 && i >= 0) {
            tbl tblVar = tblVarArr[i];
            if (tblVar.e == i) {
                return tblVar;
            }
        }
        for (int i2 = 0; i2 < 4; i2++) {
            tbl tblVar2 = tblVarArr[i2];
            if (tblVar2.e == i) {
                return tblVar2;
            }
        }
        throw new IllegalArgumentException(tcr.b(i, tbl.class));
    }

    public final String toString() {
        return this.g;
    }
}
