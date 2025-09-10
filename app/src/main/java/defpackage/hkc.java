package defpackage;

import android.util.Range;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hkc implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final /* synthetic */ int d;

    public hkc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i) {
        this.d = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        int i = this.d;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? b() : b() : b() : b() : b();
    }

    public final owf b() {
        int i = this.d;
        if (i == 0) {
            owf owfVarH = owl.h(((lxh) this.a).b(), new hjz(((Boolean) this.b.a()).booleanValue(), ((Boolean) this.c.a()).booleanValue(), 0));
            owfVarH.getClass();
            return owfVarH;
        }
        int i2 = 5;
        if (i == 1) {
            owf owiVar = !((hbj) this.a.a()).p(gyj.a) ? new owi(false) : owl.h(owl.a((owf) this.c.a(), ((ims) this.b).b()), new fhy(i2));
            owiVar.getClass();
            return owiVar;
        }
        int i3 = 9;
        if (i == 2) {
            tzx tzxVar = this.b;
            kgw kgwVarA = ((kiu) this.c).a();
            owq owqVar = (owq) tzxVar.a();
            owq owqVar2 = (owq) this.a.a();
            if (kgwVarA.l() == pka.FRONT) {
                owqVar = owqVar2;
            }
            owf owfVarH2 = owl.h(owqVar, new jku(i3));
            owfVarH2.getClass();
            return owfVarH2;
        }
        if (i != 3) {
            owf owfVarH3 = owl.h(owl.a((owf) this.c.a(), (owf) this.a.a()), new kou((hbj) this.b.a(), i3));
            owfVarH3.getClass();
            return owfVarH3;
        }
        owf owfVar = (owf) this.b.a();
        tzx tzxVar2 = this.c;
        pjp pjpVarA = ((pab) this.a).a();
        pnq pnqVar = (pnq) tzxVar2.a();
        Range range = lil.a;
        owf owfVarH4 = owl.h(owfVar, new iaz(pjpVarA, pnqVar, i2));
        owfVarH4.getClass();
        return owfVarH4;
    }

    public hkc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, byte[] bArr) {
        this.d = i;
        this.a = tzxVar;
        this.c = tzxVar2;
        this.b = tzxVar3;
    }

    public hkc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, char[] cArr) {
        this.d = i;
        this.c = tzxVar;
        this.b = tzxVar2;
        this.a = tzxVar3;
    }

    public hkc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, int[] iArr) {
        this.d = i;
        this.c = tzxVar;
        this.a = tzxVar2;
        this.b = tzxVar3;
    }

    public hkc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, short[] sArr) {
        this.d = i;
        this.b = tzxVar;
        this.a = tzxVar2;
        this.c = tzxVar3;
    }
}
