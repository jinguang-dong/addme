package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alu extends bij implements bve {
    public float a;
    public float b;
    public float c;
    public float d;
    public boolean e = true;

    public alu(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // defpackage.bve
    public final bss a(bst bstVar, bsq bsqVar, long j) {
        int iDo = bstVar.mo0do(this.a) + bstVar.mo0do(this.c);
        int iDo2 = bstVar.mo0do(this.b) + bstVar.mo0do(this.d);
        bte bteVarR = bsqVar.r(chp.h(j, -iDo, -iDo2));
        int i = bteVarR.a + iDo;
        int i2 = bteVarR.b + iDo2;
        return bstVar.ds(chp.c(j, i), chp.b(j, i2), ufx.a, new adp(this, bteVarR, 5));
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
