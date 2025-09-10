package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asy extends bij implements bun, bve {
    @Override // defpackage.bve
    public final bss a(bst bstVar, bsq bsqVar, long j) {
        int i = 1;
        boolean z = false;
        if (this.w && ((Boolean) bko.H(this, asw.b)).booleanValue()) {
            z = true;
        }
        long j2 = asw.a;
        bte bteVarR = bsqVar.r(j);
        int iMax = z ? Math.max(bteVarR.a, bstVar.mo0do(Float.intBitsToFloat((int) (j2 >> 32)))) : bteVarR.a;
        int iMax2 = z ? Math.max(bteVarR.b, bstVar.mo0do(Float.intBitsToFloat((int) (j2 & 4294967295L)))) : bteVarR.b;
        return bstVar.ds(iMax, iMax2, ufx.a, new awe(iMax, bteVarR, iMax2, i));
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
