package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dqs extends bij implements bve {
    public dkf a;
    public uif b;
    public final abr c = abs.a(0.0f);
    public final abr d = abs.a(1.0f);

    public dqs(dkf dkfVar, uif uifVar) {
        this.a = dkfVar;
        this.b = uifVar;
    }

    @Override // defpackage.bve
    public final bss a(bst bstVar, bsq bsqVar, long j) {
        bte bteVarR = bsqVar.r(j);
        return bstVar.ds(bteVarR.a, bteVarR.b, ufx.a, new dql(bteVarR, this, 2, null));
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
