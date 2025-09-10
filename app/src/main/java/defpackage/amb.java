package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amb implements bsr, aly {
    public final bid a;
    private final akk b;

    public amb(akk akkVar, bid bidVar) {
        this.b = akkVar;
        this.a = bidVar;
    }

    @Override // defpackage.bsr
    public final int a(brv brvVar, List list, int i) {
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
                int iMin2 = Math.min(bruVar.d(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, bruVar.c(iMin2));
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
                iMax = Math.max(iMax, bruVar2.c(iRound != Integer.MAX_VALUE ? Math.round(iRound * fAA2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // defpackage.bsr
    public final int b(brv brvVar, List list, int i) {
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
            int iD = bruVar.d(i);
            if (fAA == 0.0f) {
                i2 += iD;
            } else if (fAA > 0.0f) {
                f += fAA;
                iMax = Math.max(iMax, Math.round(iD / fAA));
            }
        }
        return Math.round(iMax * f) + i2 + ((list.size() - 1) * iDo);
    }

    @Override // defpackage.bsr
    public final int c(brv brvVar, List list, int i) {
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
                int iMin2 = Math.min(bruVar.d(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, bruVar.e(iMin2));
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
                iMax = Math.max(iMax, bruVar2.e(iRound != Integer.MAX_VALUE ? Math.round(iRound * fAA2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // defpackage.bsr
    public final int d(brv brvVar, List list, int i) {
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
            int iF = bruVar.f(i);
            if (fAA == 0.0f) {
                i2 += iF;
            } else if (fAA > 0.0f) {
                f += fAA;
                iMax = Math.max(iMax, Math.round(iF / fAA));
            }
        }
        return Math.round(iMax * f) + i2 + ((list.size() - 1) * iDo);
    }

    @Override // defpackage.bsr
    public final bss e(bst bstVar, List list, long j) {
        return byi.az(this, cho.d(j), cho.c(j), cho.b(j), cho.a(j), bstVar.mo0do(this.b.a()), bstVar, list, new bte[list.size()], list.size());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amb)) {
            return false;
        }
        amb ambVar = (amb) obj;
        return a.ao(this.b, ambVar.b) && a.ao(this.a, ambVar.a);
    }

    @Override // defpackage.aly
    public final int f(bte bteVar) {
        return bteVar.b;
    }

    @Override // defpackage.aly
    public final int g(bte bteVar) {
        return bteVar.a;
    }

    @Override // defpackage.aly
    public final void h(int i, int[] iArr, int[] iArr2, bst bstVar) {
        this.b.c(bstVar, i, iArr, bstVar.m(), iArr2);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // defpackage.aly
    public final long i(int i, int i2, int i3, boolean z) {
        return !z ? chp.d(i, i2, 0, i3) : chp.m(i, i2, 0, i3);
    }

    @Override // defpackage.aly
    public final bss j(bte[] bteVarArr, bst bstVar, int[] iArr, int i, int i2) {
        return bstVar.ds(i, i2, ufx.a, new ayt(bteVarArr, this, i2, iArr, 1));
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.b + ", verticalAlignment=" + this.a + ')';
    }
}
