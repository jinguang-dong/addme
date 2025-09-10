package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class amg extends bij implements bve {
    public float a;
    public float b;

    public amg(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.bve
    public final bss a(bst bstVar, bsq bsqVar, long j) {
        int iD;
        int iC;
        if (Float.isNaN(this.a) || cho.d(j) != 0) {
            iD = cho.d(j);
        } else {
            int iDo = bstVar.mo0do(this.a);
            iD = cho.b(j);
            if (iDo < 0) {
                iDo = 0;
            }
            if (iDo <= iD) {
                iD = iDo;
            }
        }
        int iB = cho.b(j);
        if (Float.isNaN(this.b) || cho.c(j) != 0) {
            iC = cho.c(j);
        } else {
            int iDo2 = bstVar.mo0do(this.b);
            iC = cho.a(j);
            int i = iDo2 >= 0 ? iDo2 : 0;
            if (i <= iC) {
                iC = i;
            }
        }
        bte bteVarR = bsqVar.r(chp.d(iD, iB, iC, cho.a(j)));
        return bstVar.ds(bteVarR.a, bteVarR.b, ufx.a, new sh(bteVarR, 12));
    }

    @Override // defpackage.bve
    public final int c(brv brvVar, bru bruVar, int i) {
        int iC = bruVar.c(i);
        int iDo = !Float.isNaN(this.b) ? brvVar.mo0do(this.b) : 0;
        return iC < iDo ? iDo : iC;
    }

    @Override // defpackage.bve
    public final int d(brv brvVar, bru bruVar, int i) {
        int iD = bruVar.d(i);
        int iDo = !Float.isNaN(this.a) ? brvVar.mo0do(this.a) : 0;
        return iD < iDo ? iDo : iD;
    }

    @Override // defpackage.bve
    public final int e(brv brvVar, bru bruVar, int i) {
        int iE = bruVar.e(i);
        int iDo = !Float.isNaN(this.b) ? brvVar.mo0do(this.b) : 0;
        return iE < iDo ? iDo : iE;
    }

    @Override // defpackage.bve
    public final int f(brv brvVar, bru bruVar, int i) {
        int iF = bruVar.f(i);
        int iDo = !Float.isNaN(this.a) ? brvVar.mo0do(this.a) : 0;
        return iF < iDo ? iDo : iF;
    }
}
