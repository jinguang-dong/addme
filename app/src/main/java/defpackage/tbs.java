package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tbs {
    public static final tbs a;
    public static final tbs b;
    public static final tbs c;
    public static final tbs d;
    public static final tbs e;
    public static final tbs f;
    public static final tbs g;
    public static final tbs[] h;
    private static int j;
    public final int i;
    private final String k;

    static {
        tbs tbsVar = new tbs("kSegmentation");
        a = tbsVar;
        tbs tbsVar2 = new tbs("kPdTraditional");
        b = tbsVar2;
        tbs tbsVar3 = new tbs("kPdLearned");
        c = tbsVar3;
        tbs tbsVar4 = new tbs("kPdStereo");
        d = tbsVar4;
        tbs tbsVar5 = new tbs("kMonocular");
        e = tbsVar5;
        tbs tbsVar6 = new tbs("kRgbPd");
        f = tbsVar6;
        tbs tbsVar7 = new tbs("kStereoRgb");
        g = tbsVar7;
        h = new tbs[]{tbsVar, tbsVar2, tbsVar3, tbsVar4, tbsVar5, tbsVar6, tbsVar7};
        j = 0;
    }

    private tbs(String str) {
        this.k = str;
        int i = j;
        j = i + 1;
        this.i = i;
    }

    public final String toString() {
        return this.k;
    }
}
