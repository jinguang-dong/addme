package defpackage;

import androidx.wear.ambient.AmbientMode;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class djn implements bsr {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public djn(int i) {
        this.c = i;
        this.b = "action";
        this.a = "text";
    }

    @Override // defpackage.bsr
    public final /* synthetic */ int a(brv brvVar, List list, int i) {
        return this.c != 0 ? bqs.h(this, brvVar, list, i) : bqs.h(this, brvVar, list, i);
    }

    @Override // defpackage.bsr
    public final /* synthetic */ int b(brv brvVar, List list, int i) {
        return this.c != 0 ? bqs.i(this, brvVar, list, i) : bqs.i(this, brvVar, list, i);
    }

    @Override // defpackage.bsr
    public final /* synthetic */ int c(brv brvVar, List list, int i) {
        return this.c != 0 ? bqs.j(this, brvVar, list, i) : bqs.j(this, brvVar, list, i);
    }

    @Override // defpackage.bsr
    public final /* synthetic */ int d(brv brvVar, List list, int i) {
        return this.c != 0 ? bqs.k(this, brvVar, list, i) : bqs.k(this, brvVar, list, i);
    }

    @Override // defpackage.bsr
    public final bss e(bst bstVar, List list, long j) {
        int iDo;
        int iMax;
        if (this.c == 0) {
            if (!cho.g(j) && !cho.h(j)) {
                throw new IllegalArgumentException("either height or width should be bounded");
            }
            int iMin = Math.min(cho.h(j) ? cho.b(j) : Integer.MAX_VALUE, cho.g(j) ? cho.a(j) : Integer.MAX_VALUE);
            float f = iMin / 2.0f;
            djo djoVar = new djo(bstVar, (djl) this.a, f);
            Object obj = this.b;
            Iterator it = list.iterator();
            djk djkVar = (djk) obj;
            djkVar.e(djoVar, it);
            if (it.hasNext()) {
                throw new IllegalArgumentException("unused measurable");
            }
            djkVar.l(f);
            djkVar.p(f, djkVar.d);
            float fN = djkVar.n();
            djkVar.k(AmbientMode.AmbientCallback.b(270.0f) - (0.5f * fN), fN, (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
            return bstVar.ds(iMin, iMin, ufx.a, new asj(obj, 16));
        }
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj2 = this.b;
            bsq bsqVar = (bsq) list.get(i2);
            if (a.ao(bqs.f(bsqVar), obj2)) {
                long j2 = j;
                final bte bteVarR = bsqVar.r(j2);
                int iB = (cho.b(j2) - bteVarR.a) - bstVar.mo0do(8.0f);
                int iD = cho.d(j2);
                Object obj3 = this.a;
                int size2 = list.size();
                int i3 = 0;
                while (i3 < size2) {
                    bsq bsqVar2 = (bsq) list.get(i3);
                    if (a.ao(bqs.f(bsqVar2), obj3)) {
                        final bte bteVarR2 = bsqVar2.r(cho.k(j2, 0, ukc.n(iB, iD), 0, 0, 9));
                        brn brnVar = bqy.a;
                        int iDl = bteVarR2.dl(brnVar);
                        int iDl2 = bteVarR2.dl(bqy.b);
                        boolean z = true;
                        boolean z2 = (iDl == Integer.MIN_VALUE || iDl2 == Integer.MIN_VALUE) ? false : true;
                        if (iDl != iDl2 && z2) {
                            z = false;
                        }
                        final int iB2 = cho.b(j) - bteVarR.a;
                        if (z) {
                            iMax = Math.max(bstVar.mo0do(48.0f), bteVarR.b);
                            iDo = (iMax - bteVarR2.b) / 2;
                            int iDl3 = bteVarR.dl(brnVar);
                            if (iDl3 != Integer.MIN_VALUE) {
                                i = (iDl + iDo) - iDl3;
                            }
                        } else {
                            iDo = bstVar.mo0do(30.0f) - iDl;
                            iMax = Math.max(bstVar.mo0do(68.0f), bteVarR2.b + iDo);
                            i = (iMax - bteVarR.b) / 2;
                        }
                        final int i4 = i;
                        final int i5 = iDo;
                        return bstVar.ds(cho.b(j), iMax, ufx.a, new uiq() { // from class: aty
                            @Override // defpackage.uiq
                            public final Object a(Object obj4) {
                                btd btdVar = (btd) obj4;
                                btd.s(btdVar, bteVarR2, 0, i5);
                                btd.s(btdVar, bteVarR, iB2, i4);
                                return ufg.a;
                            }
                        });
                    }
                    i3++;
                    j2 = j;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public djn(djl djlVar, dji djiVar, int i) {
        this.c = i;
        this.a = djlVar;
        this.b = djiVar;
    }
}
