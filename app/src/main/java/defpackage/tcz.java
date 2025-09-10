package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tcz {
    public static final tcz a;
    public static final tcz b;
    public static final tcz c;
    public static final tcz d;
    public static final tcz e;
    private static final tcz[] g;
    private static int h;
    public final int f;
    private final String i;

    static {
        tcz tczVar = new tcz();
        a = tczVar;
        tcz tczVar2 = new tcz("kUserTouch");
        b = tczVar2;
        tcz tczVar3 = new tcz("kAutoTouchMoon");
        c = tczVar3;
        tcz tczVar4 = new tcz("kAutoTouchSaliency");
        d = tczVar4;
        tcz tczVar5 = new tcz("kAutoTouchFamiliarFace");
        e = tczVar5;
        g = new tcz[]{tczVar, tczVar2, tczVar3, tczVar4, tczVar5};
        h = 0;
    }

    private tcz() {
        this.i = "kNone";
        this.f = 0;
        h = 1;
    }

    public static tcz a(int i) {
        tcz[] tczVarArr = g;
        if (i < 5 && i >= 0) {
            tcz tczVar = tczVarArr[i];
            if (tczVar.f == i) {
                return tczVar;
            }
        }
        for (int i2 = 0; i2 < 5; i2++) {
            tcz tczVar2 = tczVarArr[i2];
            if (tczVar2.f == i) {
                return tczVar2;
            }
        }
        throw new IllegalArgumentException(tcr.b(i, tcz.class));
    }

    public final String toString() {
        return this.i;
    }

    private tcz(String str) {
        this.i = str;
        int i = h;
        h = i + 1;
        this.f = i;
    }
}
