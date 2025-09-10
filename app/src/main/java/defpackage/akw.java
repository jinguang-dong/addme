package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akw implements bsr {
    public final bie a;
    private final boolean b;

    public akw(bie bieVar, boolean z) {
        this.a = bieVar;
        this.b = z;
    }

    @Override // defpackage.bsr
    public final /* synthetic */ int a(brv brvVar, List list, int i) {
        return bqs.h(this, brvVar, list, i);
    }

    @Override // defpackage.bsr
    public final /* synthetic */ int b(brv brvVar, List list, int i) {
        return bqs.i(this, brvVar, list, i);
    }

    @Override // defpackage.bsr
    public final /* synthetic */ int c(brv brvVar, List list, int i) {
        return bqs.j(this, brvVar, list, i);
    }

    @Override // defpackage.bsr
    public final /* synthetic */ int d(brv brvVar, List list, int i) {
        return bqs.k(this, brvVar, list, i);
    }

    @Override // defpackage.bsr
    public final bss e(final bst bstVar, List list, long j) {
        if (list.isEmpty()) {
            return bstVar.ds(cho.d(j), cho.c(j), ufx.a, new aks(2));
        }
        long j2 = this.b ? j : (-8589934589L) & j;
        if (list.size() == 1) {
            final bsq bsqVar = (bsq) list.get(0);
            aku.a(bsqVar);
            final bte bteVarR = bsqVar.r(j2);
            final int iMax = Math.max(cho.d(j), bteVarR.a);
            final int iMax2 = Math.max(cho.c(j), bteVarR.b);
            return bstVar.ds(iMax, iMax2, ufx.a, new uiq() { // from class: akv
                @Override // defpackage.uiq
                public final Object a(Object obj) {
                    aku.d((btd) obj, bteVarR, bsqVar, bstVar.m(), iMax, iMax2, this.a);
                    return ufg.a;
                }
            });
        }
        bte[] bteVarArr = new bte[list.size()];
        ujy ujyVar = new ujy();
        ujyVar.a = cho.d(j);
        ujy ujyVar2 = new ujy();
        ujyVar2.a = cho.c(j);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            bsq bsqVar2 = (bsq) list.get(i);
            aku.a(bsqVar2);
            bte bteVarR2 = bsqVar2.r(j2);
            bteVarArr[i] = bteVarR2;
            ujyVar.a = Math.max(ujyVar.a, bteVarR2.a);
            ujyVar2.a = Math.max(ujyVar2.a, bteVarR2.b);
        }
        return bstVar.ds(ujyVar.a, ujyVar2.a, ufx.a, new htq(bteVarArr, list, bstVar, ujyVar, ujyVar2, this, 1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akw)) {
            return false;
        }
        akw akwVar = (akw) obj;
        return a.ao(this.a, akwVar.a) && this.b == akwVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.o(this.b);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.a + ", propagateMinConstraints=" + this.b + ')';
    }
}
