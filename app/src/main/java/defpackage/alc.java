package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class alc implements bsr, aly {
    public final bic a;
    private final akp b;

    public alc(akp akpVar, bic bicVar) {
        this.b = akpVar;
        this.a = bicVar;
    }

    @Override // defpackage.bsr
    public final int a(brv brvVar, List list, int i) {
        int iDo = brvVar.mo0do(this.b.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            bru bruVar = (bru) list.get(i3);
            float fAA = byi.aA(byi.aB(bruVar));
            int iC = bruVar.c(i);
            if (fAA == 0.0f) {
                i2 += iC;
            } else if (fAA > 0.0f) {
                f += fAA;
                iMax = Math.max(iMax, Math.round(iC / fAA));
            }
        }
        return Math.round(iMax * f) + i2 + ((list.size() - 1) * iDo);
    }

    @Override // defpackage.bsr
    public final int b(brv brvVar, List list, int i) {
        int iDo = brvVar.mo0do(this.b.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iDo, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            bru bruVar = (bru) list.get(i2);
            float fAA = byi.aA(byi.aB(bruVar));
            if (fAA == 0.0f) {
                int iMin2 = Math.min(bruVar.c(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, bruVar.d(iMin2));
            } else if (fAA > 0.0f) {
                f += fAA;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            bru bruVar2 = (bru) list.get(i3);
            float fAA2 = byi.aA(byi.aB(bruVar2));
            if (fAA2 > 0.0f) {
                iMax = Math.max(iMax, bruVar2.d(iRound != Integer.MAX_VALUE ? Math.round(iRound * fAA2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // defpackage.bsr
    public final int c(brv brvVar, List list, int i) {
        int iDo = brvVar.mo0do(this.b.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            bru bruVar = (bru) list.get(i3);
            float fAA = byi.aA(byi.aB(bruVar));
            int iE = bruVar.e(i);
            if (fAA == 0.0f) {
                i2 += iE;
            } else if (fAA > 0.0f) {
                f += fAA;
                iMax = Math.max(iMax, Math.round(iE / fAA));
            }
        }
        return Math.round(iMax * f) + i2 + ((list.size() - 1) * iDo);
    }

    @Override // defpackage.bsr
    public final int d(brv brvVar, List list, int i) {
        int iDo = brvVar.mo0do(this.b.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iDo, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            bru bruVar = (bru) list.get(i2);
            float fAA = byi.aA(byi.aB(bruVar));
            if (fAA == 0.0f) {
                int iMin2 = Math.min(bruVar.c(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, bruVar.f(iMin2));
            } else if (fAA > 0.0f) {
                f += fAA;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            bru bruVar2 = (bru) list.get(i3);
            float fAA2 = byi.aA(byi.aB(bruVar2));
            if (fAA2 > 0.0f) {
                iMax = Math.max(iMax, bruVar2.f(iRound != Integer.MAX_VALUE ? Math.round(iRound * fAA2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // defpackage.bsr
    public final bss e(bst bstVar, List list, long j) {
        return byi.az(this, cho.c(j), cho.d(j), cho.a(j), cho.b(j), bstVar.mo0do(this.b.a()), bstVar, list, new bte[list.size()], list.size());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof alc)) {
            return false;
        }
        alc alcVar = (alc) obj;
        return a.ao(this.b, alcVar.b) && a.ao(this.a, alcVar.a);
    }

    @Override // defpackage.aly
    public final int f(bte bteVar) {
        return bteVar.a;
    }

    @Override // defpackage.aly
    public final int g(bte bteVar) {
        return bteVar.b;
    }

    @Override // defpackage.aly
    public final void h(int i, int[] iArr, int[] iArr2, bst bstVar) {
        this.b.b(bstVar, i, iArr, iArr2);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // defpackage.aly
    public final long i(int i, int i2, int i3, boolean z) {
        return !z ? chp.d(0, i3, i, i2) : chp.l(0, i3, i, i2);
    }

    @Override // defpackage.aly
    public final bss j(final bte[] bteVarArr, final bst bstVar, final int[] iArr, int i, final int i2) {
        return bstVar.ds(i2, i, ufx.a, new uiq() { // from class: alb
            @Override // defpackage.uiq
            public final Object a(Object obj) {
                int iA;
                btd btdVar = (btd) obj;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    bte[] bteVarArr2 = bteVarArr;
                    if (i3 >= bteVarArr2.length) {
                        return ufg.a;
                    }
                    bst bstVar2 = bstVar;
                    bte bteVar = bteVarArr2[i3];
                    int i5 = i4 + 1;
                    bteVar.getClass();
                    alz alzVarAC = byi.aC(bteVar);
                    cib cibVarM = bstVar2.m();
                    ali aliVar = alzVarAC != null ? alzVarAC.c : null;
                    int i6 = i2;
                    if (aliVar != null) {
                        iA = aliVar.a(i6 - bteVar.a);
                    } else {
                        iA = this.a.a(0, i6 - bteVar.a, cibVarM);
                    }
                    btd.q(btdVar, bteVar, iA, iArr[i4]);
                    i3++;
                    i4 = i5;
                }
            }
        });
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.b + ", horizontalAlignment=" + this.a + ')';
    }
}
