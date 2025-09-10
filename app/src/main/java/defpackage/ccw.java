package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ccw {
    public final ccx a;
    public final boolean b;
    public final float c;
    public final float d;
    public final int e;
    public final List f;
    public final List g;
    private final int h;

    public ccw(ccx ccxVar, long j, int i, int i2) {
        boolean z;
        this.a = ccxVar;
        this.h = i;
        if (cho.d(j) != 0 || cho.c(j) != 0) {
            cgh.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        List list = ccxVar.d;
        int size = list.size();
        int i3 = 0;
        float f = 0.0f;
        int i4 = 0;
        while (i4 < size) {
            ccz cczVar = (ccz) list.get(i4);
            cch cchVar = new cch((cgo) cczVar.a, this.h - i3, i2, chp.k(cho.b(j), cho.g(j) ? ukc.n(cho.a(j) - byx.l(f), 0) : cho.a(j), 5));
            float fB = cchVar.b() + f;
            int iF = i3 + cchVar.f();
            arrayList.add(new ccy(cchVar, cczVar.b, cczVar.c, i3, iF, f, fB));
            z = true;
            if (cchVar.h() || (iF == this.h && i4 != ske.bk(this.a.d))) {
                i3 = iF;
                f = fB;
                break;
            } else {
                i4++;
                i3 = iF;
                f = fB;
            }
        }
        z = false;
        this.d = f;
        this.e = i3;
        this.b = z;
        this.g = arrayList;
        this.c = cho.b(j);
        List arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i5 = 0; i5 < size2; i5++) {
            ccy ccyVar = (ccy) arrayList.get(i5);
            List list2 = ccyVar.g.d;
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size3 = list2.size();
            for (int i6 = 0; i6 < size3; i6++) {
                bkg bkgVar = (bkg) list2.get(i6);
                arrayList3.add(bkgVar != null ? ccyVar.f(bkgVar) : null);
            }
            ske.bT(arrayList2, arrayList3);
        }
        if (arrayList2.size() < this.a.b.size()) {
            int size4 = this.a.b.size() - arrayList2.size();
            ArrayList arrayList4 = new ArrayList(size4);
            for (int i7 = 0; i7 < size4; i7++) {
                arrayList4.add(null);
            }
            arrayList2 = ske.bJ(arrayList2, arrayList4);
        }
        this.f = arrayList2;
    }

    public final ccm a() {
        return this.a.a;
    }

    public final void b(int i) {
        if (i < 0 || i >= this.e) {
            cgh.a("lineIndex(" + i + ") is out of bounds [0, " + this.e + ')');
        }
    }

    public final void c(bku bkuVar, long j, blo bloVar, chd chdVar, byi byiVar) {
        bkuVar.f();
        List list = this.g;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            cch cchVar = ((ccy) list.get(i)).g;
            cchVar.k(bkuVar, j, bloVar, chdVar, byiVar);
            bkuVar.h(0.0f, cchVar.b());
        }
        bkuVar.d();
    }
}
