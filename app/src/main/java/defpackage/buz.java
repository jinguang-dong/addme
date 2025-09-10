package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class buz extends bvu {
    public buz(bva bvaVar) {
        super(bvaVar);
    }

    @Override // defpackage.bvu, defpackage.bru
    public final int c(int i) {
        ebn ebnVarAA = H().aA();
        bsr bsrVarK = ebnVarAA.k();
        bvm bvmVar = (bvm) ebnVarAA.a;
        return bsrVarK.a(bvmVar.o(), bvmVar.r(), i);
    }

    @Override // defpackage.bvu, defpackage.bru
    public final int d(int i) {
        ebn ebnVarAA = H().aA();
        bsr bsrVarK = ebnVarAA.k();
        bvm bvmVar = (bvm) ebnVarAA.a;
        return bsrVarK.b(bvmVar.o(), bvmVar.r(), i);
    }

    @Override // defpackage.bvu, defpackage.bru
    public final int e(int i) {
        ebn ebnVarAA = H().aA();
        bsr bsrVarK = ebnVarAA.k();
        bvm bvmVar = (bvm) ebnVarAA.a;
        return bsrVarK.c(bvmVar.o(), bvmVar.r(), i);
    }

    @Override // defpackage.bvu, defpackage.bru
    public final int f(int i) {
        ebn ebnVarAA = H().aA();
        bsr bsrVarK = ebnVarAA.k();
        bvm bvmVar = (bvm) ebnVarAA.a;
        return bsrVarK.d(bvmVar.o(), bvmVar.r(), i);
    }

    @Override // defpackage.bvt
    public final int p(bqv bqvVar) {
        bvx bvxVar = (bvx) y();
        if (!bvxVar.j) {
            if (bvxVar.G() == 2) {
                buf bufVar = bvxVar.p;
                bufVar.f = true;
                if (bufVar.b) {
                    bvxVar.f.e();
                }
            } else {
                bvxVar.p.g = true;
            }
        }
        bvu bvuVar = ((bva) bvxVar.j()).g;
        if (bvuVar != null) {
            bvuVar.k = true;
        }
        bvxVar.l();
        bvu bvuVar2 = ((bva) bvxVar.j()).g;
        if (bvuVar2 != null) {
            bvuVar2.k = false;
        }
        Integer num = (Integer) bvxVar.p.h.get(bqvVar);
        int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.p.g(bqvVar, iIntValue);
        return iIntValue;
    }

    @Override // defpackage.bvu
    protected final void q() {
        bvx bvxVarL = H().l();
        bvxVarL.getClass();
        bvxVarL.A();
    }

    @Override // defpackage.bsq
    public final bte r(long j) {
        v(j);
        bdp bdpVarI = H().i();
        Object[] objArr = bdpVarI.a;
        int i = bdpVarI.b;
        for (int i2 = 0; i2 < i; i2++) {
            bvx bvxVarL = ((bvm) objArr[i2]).l();
            bvxVarL.getClass();
            bvxVarL.w = 3;
        }
        super.A(H().n.e(this, H().r(), j));
        return this;
    }
}
