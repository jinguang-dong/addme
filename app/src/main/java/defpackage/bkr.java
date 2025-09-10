package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bkr extends bij implements bve {
    public uiq a;

    public bkr(uiq uiqVar) {
        this.a = uiqVar;
    }

    @Override // defpackage.bve
    public final bss a(bst bstVar, bsq bsqVar, long j) {
        bte bteVarR = bsqVar.r(j);
        return bstVar.ds(bteVarR.a, bteVarR.b, ufx.a, new aat(bteVarR, this, 2, null));
    }

    @Override // defpackage.bve
    public final /* synthetic */ int c(brv brvVar, bru bruVar, int i) {
        return amo.o(this, brvVar, bruVar, i);
    }

    @Override // defpackage.bve
    public final /* synthetic */ int d(brv brvVar, bru bruVar, int i) {
        return amo.p(this, brvVar, bruVar, i);
    }

    @Override // defpackage.bij
    public final boolean db() {
        return false;
    }

    @Override // defpackage.bve
    public final /* synthetic */ int e(brv brvVar, bru bruVar, int i) {
        return amo.q(this, brvVar, bruVar, i);
    }

    @Override // defpackage.bve
    public final /* synthetic */ int f(brv brvVar, bru bruVar, int i) {
        return amo.r(this, brvVar, bruVar, i);
    }

    public final void h() {
        bwi bwiVar = bko.C(this, 2).v;
        if (bwiVar != null) {
            bwiVar.ao(this.a, true);
        }
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.a + ')';
    }
}
