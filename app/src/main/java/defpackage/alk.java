package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class alk extends bij implements bve {
    public float a = 1.0f;
    public int b;

    public alk(int i) {
        this.b = i;
    }

    @Override // defpackage.bve
    public final bss a(bst bstVar, bsq bsqVar, long j) {
        int iD;
        int iB;
        int iA;
        int i;
        if (!cho.h(j) || this.b == 1) {
            iD = cho.d(j);
            iB = cho.b(j);
        } else {
            float fB = cho.b(j) * this.a;
            int iD2 = cho.d(j);
            iD = cho.b(j);
            int iRound = Math.round(fB);
            if (iRound >= iD2) {
                iD2 = iRound;
            }
            if (iD2 <= iD) {
                iD = iD2;
            }
            iB = iD;
        }
        if (!cho.g(j) || this.b == 2) {
            int iC = cho.c(j);
            int iA2 = cho.a(j);
            iA = iC;
            i = iA2;
        } else {
            float fA = cho.a(j) * this.a;
            int iC2 = cho.c(j);
            iA = cho.a(j);
            int iRound2 = Math.round(fA);
            if (iRound2 >= iC2) {
                iC2 = iRound2;
            }
            if (iC2 <= iA) {
                iA = iC2;
            }
            i = iA;
        }
        bte bteVarR = bsqVar.r(chp.d(iD, iB, iA, i));
        return bstVar.ds(bteVarR.a, bteVarR.b, ufx.a, new sh(bteVarR, 10));
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
