package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqq implements bsr {
    private final uif a;
    private final uif b;

    public aqq(uif uifVar, uif uifVar2) {
        this.a = uifVar;
        this.b = uifVar2;
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
    public final bss e(bst bstVar, List list, long j) {
        uev uevVar;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (!(((bsq) obj).g() instanceof aqr)) {
                arrayList.add(obj);
            }
        }
        List list2 = (List) this.b.a();
        ArrayList arrayList2 = null;
        if (list2 != null) {
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                bkg bkgVar = (bkg) list2.get(i2);
                if (bkgVar != null) {
                    bsq bsqVar = (bsq) arrayList.get(i2);
                    float f = bkgVar.d;
                    float f2 = bkgVar.b;
                    float fFloor = (float) Math.floor(f - f2);
                    float f3 = bkgVar.e;
                    float f4 = bkgVar.c;
                    uevVar = new uev(bsqVar.r(chp.k((int) fFloor, (int) Math.floor(f3 - f4), 5)), new chy((Math.round(f2) << 32) | (Math.round(f4) & 4294967295L)));
                } else {
                    uevVar = null;
                }
                if (uevVar != null) {
                    arrayList3.add(uevVar);
                }
            }
            arrayList2 = arrayList3;
        }
        ArrayList arrayList4 = new ArrayList(list.size());
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            Object obj2 = list.get(i3);
            if (((bsq) obj2).g() instanceof aqr) {
                arrayList4.add(obj2);
            }
        }
        return bstVar.ds(cho.b(j), cho.a(j), ufx.a, new aff(arrayList2, bay.Z(arrayList4, this.a), 11));
    }
}
