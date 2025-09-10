package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cfp implements Comparable {
    public static final cfp a;
    public static final cfp b;
    public static final cfp c;
    public static final cfp d;
    public static final cfp e;
    public static final cfp f;
    public static final cfp g;
    private static final cfp i;
    private static final cfp j;
    private static final cfp k;
    private static final cfp l;
    private static final cfp m;
    private static final cfp n;
    public final int h;

    static {
        cfp cfpVar = new cfp(100);
        i = cfpVar;
        cfp cfpVar2 = new cfp(200);
        j = cfpVar2;
        cfp cfpVar3 = new cfp(300);
        k = cfpVar3;
        cfp cfpVar4 = new cfp(400);
        a = cfpVar4;
        cfp cfpVar5 = new cfp(500);
        b = cfpVar5;
        cfp cfpVar6 = new cfp(600);
        c = cfpVar6;
        cfp cfpVar7 = new cfp(700);
        l = cfpVar7;
        cfp cfpVar8 = new cfp(800);
        m = cfpVar8;
        cfp cfpVar9 = new cfp(900);
        n = cfpVar9;
        d = cfpVar3;
        e = cfpVar4;
        f = cfpVar5;
        g = cfpVar7;
        rnt.ae(new cfp[]{cfpVar, cfpVar2, cfpVar3, cfpVar4, cfpVar5, cfpVar6, cfpVar7, cfpVar8, cfpVar9});
    }

    public cfp(int i2) {
        this.h = i2;
        if (i2 <= 0 || i2 >= 1001) {
            cgh.a("Font weight can be in range [1, 1000]. Current value: " + i2);
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(cfp cfpVar) {
        return ujp.a(this.h, cfpVar.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cfp) && this.h == ((cfp) obj).h;
    }

    public final int hashCode() {
        return this.h;
    }

    public final String toString() {
        return "FontWeight(weight=" + this.h + ')';
    }
}
