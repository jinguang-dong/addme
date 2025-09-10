package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class alx extends bij implements bve {
    public alv a;

    public alx(alv alvVar) {
        this.a = alvVar;
    }

    @Override // defpackage.bve
    public final bss a(bst bstVar, bsq bsqVar, long j) {
        float fB = this.a.b(bstVar.m());
        float fD = this.a.d();
        float fC = this.a.c(bstVar.m());
        float fA = this.a.a();
        int i = 1;
        if (!((Float.compare(fB, 0.0f) >= 0) & (Float.compare(fD, 0.0f) >= 0) & (Float.compare(fC, 0.0f) >= 0) & (Float.compare(fA, 0.0f) >= 0))) {
            amo.a("Padding must be non-negative");
        }
        int iDo = bstVar.mo0do(fB);
        int iDo2 = bstVar.mo0do(fC) + iDo;
        int iDo3 = bstVar.mo0do(fD);
        int iDo4 = bstVar.mo0do(fA) + iDo3;
        bte bteVarR = bsqVar.r(chp.h(j, -iDo2, -iDo4));
        return bstVar.ds(chp.c(j, bteVarR.a + iDo2), chp.b(j, bteVarR.b + iDo4), ufx.a, new ccv(bteVarR, iDo, iDo3, i));
    }

    @Override // defpackage.bve
    public final /* synthetic */ int c(brv brvVar, bru bruVar, int i) {
        return amo.o(this, brvVar, bruVar, i);
    }

    @Override // defpackage.bve
    public final /* synthetic */ int d(brv brvVar, bru bruVar, int i) {
        return amo.p(this, brvVar, bruVar, i);
    }

    @Override // defpackage.bve
    public final /* synthetic */ int e(brv brvVar, bru bruVar, int i) {
        return amo.q(this, brvVar, bruVar, i);
    }

    @Override // defpackage.bve
    public final /* synthetic */ int f(brv brvVar, bru bruVar, int i) {
        return amo.r(this, brvVar, bruVar, i);
    }
}
