package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tco {
    public static final tco a;
    public static final tco b;
    public static final tco c;
    public static final tco[] d;
    private static int g;
    public final int e;
    public final String f;

    static {
        tco tcoVar = new tco();
        a = tcoVar;
        tco tcoVar2 = new tco("kDisplayP3");
        b = tcoVar2;
        tco tcoVar3 = new tco("kInvalid");
        c = tcoVar3;
        d = new tco[]{tcoVar, tcoVar2, tcoVar3};
        g = 0;
    }

    private tco() {
        this.f = "kSrgb";
        this.e = 0;
        g = 1;
    }

    public final String toString() {
        return this.f;
    }

    private tco(String str) {
        this.f = str;
        int i = g;
        g = i + 1;
        this.e = i;
    }
}
