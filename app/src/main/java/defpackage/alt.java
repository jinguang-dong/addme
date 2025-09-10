package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alt extends bij implements bve {
    public uiq a;
    public boolean b = true;

    public alt(uiq uiqVar) {
        this.a = uiqVar;
    }

    @Override // defpackage.bve
    public final bss a(bst bstVar, bsq bsqVar, long j) {
        bte bteVarR = bsqVar.r(j);
        return bstVar.ds(bteVarR.a, bteVarR.b, ufx.a, new adp(this, bteVarR, 4));
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
}
