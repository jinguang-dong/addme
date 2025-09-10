package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dqh extends bij implements bve {
    public float a = 70.0f;

    @Override // defpackage.bve
    public final bss a(bst bstVar, bsq bsqVar, long j) {
        final bte bteVarR = bsqVar.r(chp.k(0, 0, 15));
        final int iP = ukc.p(bteVarR.a, cho.d(j), cho.b(j));
        final int iP2 = ukc.p(bteVarR.b, cho.c(j), cho.a(j));
        int iN = ukc.n(bteVarR.a, 1);
        uev uevVar = new uev(new cht(6.0f), new cht(8.0f));
        final int iDo = bstVar.mo0do(((cht) uevVar.a).a);
        final int iDo2 = bstVar.mo0do(((cht) uevVar.b).a);
        final float fL = ukc.l(iP / iN, 1.0f);
        return bstVar.ds(iP, iP2, ufx.a, new uiq() { // from class: dqf
            @Override // defpackage.uiq
            public final Object a(Object obj) {
                int i = iP;
                btd btdVar = (btd) obj;
                bte bteVar = bteVarR;
                int i2 = i - bteVar.a;
                float f = bteVar.b;
                float f2 = iP2;
                int i3 = iDo2;
                int i4 = iDo;
                float f3 = fL;
                btd.y(btdVar, bteVar, ((i2 / 2) << 32) | (ukc.n(ukj.x((((f2 - (f * f3)) + i4) - i3) / 2.0f), i4) & 4294967295L), new dqg(f3, 0), 2);
                return ufg.a;
            }
        });
    }

    @Override // defpackage.bve
    public final int c(brv brvVar, bru bruVar, int i) {
        return brvVar.mo0do(this.a + 6.0f);
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
