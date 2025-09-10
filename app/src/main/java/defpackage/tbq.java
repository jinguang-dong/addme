package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tbq {
    public static final tbq a;
    public static final tbq b;
    public static final tbq c;
    public static final tbq d;
    public static final tbq e;
    public static final tbq f;
    public static final tbq g;
    public static final tbq h;
    public static final tbq i;
    public static final tbq[] j;
    private static int l;
    public final int k;
    private final String m;

    static {
        tbq tbqVar = new tbq("kUnknown", -1);
        a = tbqVar;
        tbq tbqVar2 = new tbq("kDeprecatedSingleExp", 0);
        b = tbqVar2;
        tbq tbqVar3 = new tbq("kShortExp");
        c = tbqVar3;
        tbq tbqVar4 = new tbq("kDeprecatedLongExp");
        d = tbqVar4;
        tbq tbqVar5 = new tbq("kBracketedExp");
        e = tbqVar5;
        tbq tbqVar6 = new tbq("kPostShutterAf");
        f = tbqVar6;
        tbq tbqVar7 = new tbq("kUltraShortExp");
        g = tbqVar7;
        tbq tbqVar8 = new tbq("kEdof");
        h = tbqVar8;
        tbq tbqVar9 = new tbq("kInvalidBurstFrameType");
        i = tbqVar9;
        j = new tbq[]{tbqVar, tbqVar2, tbqVar3, tbqVar4, tbqVar5, tbqVar6, tbqVar7, tbqVar8, tbqVar9};
        l = 0;
    }

    private tbq(String str) {
        this.m = str;
        int i2 = l;
        l = i2 + 1;
        this.k = i2;
    }

    public final String toString() {
        return this.m;
    }

    private tbq(String str, int i2) {
        this.m = str;
        this.k = i2;
        l = i2 + 1;
    }
}
