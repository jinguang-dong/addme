package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hxv {
    public final boolean a;
    private final owf b;
    private final owf c;
    private final owf d;
    private final owq e;
    private final owf f;
    private final owf g;
    private final owf h;
    private final kow i;
    private final ibb j;
    private final hbj k;

    public hxv(owf owfVar, owf owfVar2, owq owqVar, owf owfVar3, owf owfVar4, owf owfVar5, owf owfVar6, boolean z, hbj hbjVar, kow kowVar, ibb ibbVar) {
        this.b = owfVar;
        this.d = owfVar2;
        this.e = owqVar;
        this.g = owfVar3;
        this.c = owfVar4;
        this.f = owfVar5;
        this.h = owfVar6;
        this.k = hbjVar;
        this.i = kowVar;
        this.j = ibbVar;
        this.a = z;
    }

    public final hxu a() {
        ltr ltrVar = (ltr) this.b.dL();
        boolean zBooleanValue = ((Boolean) this.d.dL()).booleanValue();
        boolean zBooleanValue2 = ((Boolean) this.e.dL()).booleanValue();
        hbj hbjVar = this.k;
        int iIntValue = ((Integer) hbjVar.a(ham.a).get()).intValue();
        boolean zP = hbjVar.p(gzo.bg);
        kox koxVar = (kox) this.i.dL();
        ((Boolean) this.c.dL()).booleanValue();
        ibb ibbVar = this.j;
        boolean z = ibbVar.e() && !ibbVar.d.k();
        boolean z2 = z && ibbVar.m();
        boolean z3 = ibbVar.e() && ibbVar.e.equals(nkw.NIGHT_SIGHT);
        boolean z4 = iIntValue != 0;
        owf owfVar = this.f;
        boolean zE = ibbVar.e();
        boolean zG = ibbVar.g();
        boolean zBooleanValue3 = ((Boolean) owfVar.dL()).booleanValue();
        owf owfVar2 = this.h;
        return new hxu(this, ltrVar, zBooleanValue, ((ick) owfVar2.dL()).c, ((ick) owfVar2.dL()).d, ibbVar.k(), ((ick) owfVar2.dL()).e, ibbVar.f(), zBooleanValue2, z4, zP, koxVar, z, z2, z3, zG, zBooleanValue3, zE);
    }
}
