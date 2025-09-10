package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rbt {
    public static final rbt a;
    public static final rbt b;
    public final boolean c;
    public final boolean d;
    public final sbp e;
    public final sbp f;

    static {
        rbs rbsVar = new rbs();
        rbsVar.c();
        a = rbsVar.a();
        rbs rbsVar2 = new rbs();
        rbsVar2.c();
        rbsVar2.b(new rbr());
        rbsVar2.a();
        rbs rbsVar3 = new rbs();
        rnt.M(rbsVar3.a == null, "A SourcePolicy can only set internal() or external() once.");
        rbsVar3.a = true;
        b = rbsVar3.a();
    }

    public rbt(boolean z, boolean z2, sbp sbpVar, sbp sbpVar2) {
        this.c = z;
        this.d = z2;
        this.e = sbpVar;
        this.f = sbpVar2;
    }

    public static rbt a(String str) {
        rbs rbsVar = new rbs();
        rbsVar.c();
        rbsVar.b = true;
        rbsVar.b(new rbq(str));
        return rbsVar.a();
    }
}
