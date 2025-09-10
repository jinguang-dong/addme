package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqc implements bsr {
    private final /* synthetic */ int d;
    public static final aqc c = new aqc(2);
    public static final aqc b = new aqc(1);
    public static final aqc a = new aqc(0);

    public aqc(int i) {
        this.d = i;
    }

    @Override // defpackage.bsr
    public final /* synthetic */ int a(brv brvVar, List list, int i) {
        int i2 = this.d;
        return i2 != 0 ? i2 != 1 ? bqs.h(this, brvVar, list, i) : bqs.h(this, brvVar, list, i) : bqs.h(this, brvVar, list, i);
    }

    @Override // defpackage.bsr
    public final /* synthetic */ int b(brv brvVar, List list, int i) {
        int i2 = this.d;
        return i2 != 0 ? i2 != 1 ? bqs.i(this, brvVar, list, i) : bqs.i(this, brvVar, list, i) : bqs.i(this, brvVar, list, i);
    }

    @Override // defpackage.bsr
    public final /* synthetic */ int c(brv brvVar, List list, int i) {
        int i2 = this.d;
        return i2 != 0 ? i2 != 1 ? bqs.j(this, brvVar, list, i) : bqs.j(this, brvVar, list, i) : bqs.j(this, brvVar, list, i);
    }

    @Override // defpackage.bsr
    public final /* synthetic */ int d(brv brvVar, List list, int i) {
        int i2 = this.d;
        return i2 != 0 ? i2 != 1 ? bqs.k(this, brvVar, list, i) : bqs.k(this, brvVar, list, i) : bqs.k(this, brvVar, list, i);
    }

    @Override // defpackage.bsr
    public final bss e(bst bstVar, List list, long j) {
        int i = this.d;
        int i2 = 0;
        if (i == 0) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            while (i2 < size) {
                arrayList.add(((bsq) list.get(i2)).r(j));
                i2++;
            }
            return bstVar.ds(cho.b(j), cho.a(j), ufx.a, new sh(arrayList, 14));
        }
        int i3 = 1;
        if (i == 1) {
            return bstVar.ds(cho.d(j), cho.c(j), ufx.a, new add(3));
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        int i4 = Integer.MIN_VALUE;
        int iMax = 0;
        int iDl = Integer.MIN_VALUE;
        int iDl2 = Integer.MIN_VALUE;
        for (int i5 = 0; i5 < size2; i5++) {
            bte bteVarR = ((bsq) list.get(i5)).r(j);
            arrayList2.add(bteVarR);
            brn brnVar = bqy.a;
            if (bteVarR.dl(brnVar) != Integer.MIN_VALUE && (iDl == Integer.MIN_VALUE || bteVarR.dl(brnVar) < iDl)) {
                iDl = bteVarR.dl(brnVar);
            }
            brn brnVar2 = bqy.b;
            if (bteVarR.dl(brnVar2) != Integer.MIN_VALUE && (iDl2 == Integer.MIN_VALUE || bteVarR.dl(brnVar2) > iDl2)) {
                iDl2 = bteVarR.dl(brnVar2);
            }
            iMax = Math.max(iMax, bteVarR.b);
        }
        if (iDl != Integer.MIN_VALUE) {
            if (iDl2 != Integer.MIN_VALUE) {
                i2 = 1;
            } else {
                iDl2 = Integer.MIN_VALUE;
            }
            i4 = iDl;
        }
        int iMax2 = Math.max(bstVar.mo0do((i4 == iDl2 || i2 == 0) ? 48.0f : 68.0f), iMax);
        return bstVar.ds(cho.b(j), iMax2, ufx.a, new bgx(arrayList2, iMax2, i3));
    }
}
