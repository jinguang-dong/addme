package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class alp extends bij implements bve {
    @Override // defpackage.bve
    public final bss a(bst bstVar, bsq bsqVar, long j) {
        long jK = k(bsqVar, j);
        if (h()) {
            jK = chp.f(j, jK);
        }
        bte bteVarR = bsqVar.r(jK);
        return bstVar.ds(bteVarR.a, bteVarR.b, ufx.a, new sh(bteVarR, 11));
    }

    @Override // defpackage.bve
    public final int c(brv brvVar, bru bruVar, int i) {
        return bruVar.c(i);
    }

    @Override // defpackage.bve
    public int d(brv brvVar, bru bruVar, int i) {
        throw null;
    }

    @Override // defpackage.bve
    public final int e(brv brvVar, bru bruVar, int i) {
        return bruVar.e(i);
    }

    @Override // defpackage.bve
    public int f(brv brvVar, bru bruVar, int i) {
        throw null;
    }

    public abstract boolean h();

    public abstract long k(bsq bsqVar, long j);
}
