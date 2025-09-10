package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dpm extends bij implements bve {
    @Override // defpackage.bve
    public final bss a(bst bstVar, bsq bsqVar, long j) {
        bte bteVarR = bsqVar.r(j);
        boolean z = this.w;
        int iDo = bstVar.mo0do(48.0f);
        int iMax = z ? Math.max(bteVarR.a, iDo) : bteVarR.a;
        int iMax2 = z ? Math.max(bteVarR.b, iDo) : bteVarR.b;
        return bstVar.ds(iMax, iMax2, ufx.a, new ccv(iMax, bteVarR, iMax2, 3));
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
