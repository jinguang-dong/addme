package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tcd {
    public static final tcd a;
    public static final tcd b;
    public static final tcd c;
    public static final tcd d;
    public static final tcd e;
    public static final tcd f;
    public static final tcd g;
    public static final tcd h;
    public static final tcd i;
    private static final tcd[] k;
    private static int l;
    public final int j;
    private final String m;

    static {
        tcd tcdVar = new tcd();
        a = tcdVar;
        tcd tcdVar2 = new tcd("kNone");
        b = tcdVar2;
        tcd tcdVar3 = new tcd("kFlipHorizontal");
        c = tcdVar3;
        tcd tcdVar4 = new tcd("kRotate180");
        d = tcdVar4;
        tcd tcdVar5 = new tcd("kFlipVertical");
        e = tcdVar5;
        tcd tcdVar6 = new tcd("kTranspose");
        f = tcdVar6;
        tcd tcdVar7 = new tcd("kRotateCw");
        g = tcdVar7;
        tcd tcdVar8 = new tcd("kTranspose180");
        h = tcdVar8;
        tcd tcdVar9 = new tcd("kRotateCcw");
        i = tcdVar9;
        k = new tcd[]{tcdVar, tcdVar2, tcdVar3, tcdVar4, tcdVar5, tcdVar6, tcdVar7, tcdVar8, tcdVar9};
        l = 0;
    }

    private tcd() {
        this.m = "kInvalid";
        this.j = 0;
        l = 1;
    }

    public static tcd a(int i2) {
        tcd[] tcdVarArr = k;
        if (i2 < 9 && i2 >= 0) {
            tcd tcdVar = tcdVarArr[i2];
            if (tcdVar.j == i2) {
                return tcdVar;
            }
        }
        for (int i3 = 0; i3 < 9; i3++) {
            tcd tcdVar2 = tcdVarArr[i3];
            if (tcdVar2.j == i2) {
                return tcdVar2;
            }
        }
        throw new IllegalArgumentException(tcr.b(i2, tcd.class));
    }

    public final String toString() {
        return this.m;
    }

    private tcd(String str) {
        this.m = str;
        int i2 = l;
        l = i2 + 1;
        this.j = i2;
    }
}
