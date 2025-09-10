package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ibb extends oww {
    public final iao a;
    public final hyd b;
    public final fuf c;
    public final hyh d;
    public final nkw e;
    private final owf f;
    private final owf g;
    private final owf h;
    private final boolean i;

    public ibb(iao iaoVar, hyh hyhVar, hyd hydVar, owf owfVar, fuf fufVar, nkw nkwVar, owf owfVar2, owf owfVar3, owf owfVar4, boolean z) {
        super(owl.a(owfVar, hyhVar.b, owfVar4, owfVar2, owfVar3));
        this.a = iaoVar;
        this.b = hydVar;
        this.c = fufVar;
        this.d = hyhVar;
        this.e = nkwVar;
        this.f = owfVar4;
        this.g = owfVar2;
        this.h = owfVar3;
        this.i = z;
    }

    private static final boolean p(owf owfVar) {
        return ((ixq) owfVar.dL()).equals(ixq.NIGHT_SIGHT);
    }

    public final owf a() {
        return owl.h(this, new fdz(this, 15));
    }

    @Override // defpackage.oww
    protected final /* bridge */ /* synthetic */ Object d(Object obj) {
        List list = (List) obj;
        fug fugVar = (fug) list.get(0);
        boolean zBooleanValue = ((Boolean) list.get(1)).booleanValue();
        Object obj2 = list.get(2);
        ixq ixqVar = ixq.NIGHT_SIGHT;
        if (obj2.equals(ixqVar) || list.get(3).equals(ixqVar) || list.get(4).equals(ixqVar)) {
            return iba.V1;
        }
        if (!this.a.equals(iao.NIGHT_SIGHT) && !zBooleanValue) {
            return iba.INACTIVE;
        }
        hyd hydVar = this.b;
        boolean zP = hydVar.j.p(hac.r);
        boolean zEquals = fugVar.equals(fug.AUTO);
        if (!hydVar.h ? zP : !(!zEquals || !zP)) {
            if (!this.i) {
                return iba.V2;
            }
        }
        return iba.V1;
    }

    public final boolean e() {
        return !((iba) dL()).equals(iba.INACTIVE);
    }

    public final boolean f() {
        return p(this.f);
    }

    public final boolean g() {
        return e() && this.b.h && !h() && this.e != nkw.TIME_LAPSE;
    }

    public final boolean h() {
        return f() || k() || l();
    }

    public final boolean i() {
        return ((Boolean) a().dL()).booleanValue();
    }

    public final boolean j() {
        return e();
    }

    public final boolean k() {
        return p(this.g);
    }

    public final boolean l() {
        return p(this.h);
    }

    public final boolean m() {
        return ((iba) dL()).equals(iba.V2);
    }

    public final void n() {
        nkw nkwVar = this.e;
        if (nkwVar.equals(nkw.NIGHT_SIGHT) || !i()) {
            return;
        }
        nkwVar.equals(nkw.PHOTO);
    }
}
