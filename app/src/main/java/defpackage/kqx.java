package defpackage;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kqx extends oww {
    private static final sgv b = sgv.g("kqx");
    public final Rect a;
    private final List c;
    private final float d;
    private final double e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final pka j;
    private final Rect k;
    private boolean l;
    private kqw m;

    public kqx(owf owfVar, owf owfVar2, pjo pjoVar, hbj hbjVar, pjp pjpVar) {
        this(owfVar, owfVar2, pjoVar, pae.a, hbjVar, pjpVar, pjoVar.i());
    }

    public static boolean g(pjo pjoVar, hbj hbjVar) {
        return pjoVar.M() && pjoVar.D() && hbjVar.p(gzo.Z);
    }

    public final synchronized kqw a() {
        return d(Float.valueOf(1.0f));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oww
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final synchronized kqw d(Float f) {
        float fFloatValue;
        double d;
        if (!Float.isNaN(f.floatValue()) && f.floatValue() > 0.0f) {
            if (!this.l) {
                float fFloatValue2 = f.floatValue();
                double d2 = this.e;
                boolean z = true;
                boolean z2 = d2 > 0.0d;
                Double dValueOf = Double.valueOf(d2);
                rnt.F(z2, "Invalid sensor size: %s", dValueOf);
                double dAG = qpt.aG(this.d, d2 / fFloatValue2);
                rnt.F(z2, "Diagonal size cannot be zero (%s)", dValueOf);
                if (dAG <= 0.0d || dAG >= 6.283185307179586d) {
                    z = false;
                }
                rnt.F(z, "Invalid AoV: %s", Double.valueOf(dAG));
                double dTan = Math.tan(dAG / 2.0d);
                float f2 = (float) (d2 / (dTan + dTan));
                try {
                    List list = this.c;
                    double d3 = f2;
                    int size = list.size();
                    do {
                        size--;
                        if (size < 0) {
                            throw new IllegalStateException("focal length needed = " + d3);
                        }
                        fFloatValue = ((Float) list.get(size)).floatValue();
                        d = fFloatValue;
                        if (d < d3) {
                            break;
                        }
                    } while (Math.abs(d3 - d) >= 9.999999747378752E-6d);
                } catch (IllegalStateException e) {
                    sgt sgtVar = (sgt) ((sgt) b.b().i(e)).M(3391);
                    List list2 = this.c;
                    sgtVar.O(f2, list2);
                    fFloatValue = ((Float) list2.get(0)).floatValue();
                }
                double dAH = qpt.aH(dAG, fFloatValue) / this.e;
                int i = this.f;
                int i2 = this.g;
                int i3 = this.h;
                int i4 = this.i + i2;
                int i5 = i3 + i;
                int i6 = (int) ((i2 * dAH) + 0.5d);
                int i7 = (int) ((dAH * i) + 0.5d);
                this.m = new kqw(new Rect(i5 - i7, i4 - i6, i5 + i7, i4 + i6), this.k, fFloatValue);
            }
            return this.m;
        }
        ((sgt) b.c().M(3396)).v("Invalid zoom factor: %g", f);
        return this.m;
    }

    public final synchronized void f(pka pkaVar) {
        this.l = pkaVar != this.j;
    }

    public kqx(owf owfVar, owf owfVar2, pjo pjoVar, pae paeVar, hbj hbjVar, pjp pjpVar, Rect rect) {
        List listU;
        float fFloatValue;
        super(owfVar2);
        pjoVar.j();
        if (g(pjoVar, hbjVar)) {
            listU = new ArrayList();
            Iterator it = pjoVar.C().iterator();
            while (it.hasNext()) {
                pjo pjoVarA = pjpVar.a((pjr) it.next());
                pjoVarA.u().get(0);
                listU.add((Float) pjoVarA.u().get(0));
            }
            Collections.sort(listU, new wp(9));
        } else {
            pjoVar.j();
            listU = pjoVar.u();
        }
        this.c = listU;
        rnt.B(!listU.isEmpty(), "Must have at least one focal length.");
        if (g(pjoVar, hbjVar)) {
            fFloatValue = ((Float) listU.get(listU.size() / 2)).floatValue();
        } else {
            fFloatValue = ((Float) Collections.min(listU)).floatValue();
        }
        this.d = fFloatValue;
        rnt.F(fFloatValue > 0.0f, "Reference focal length cannot be zero (%s)", Float.valueOf(fFloatValue));
        double dAJ = qpt.aJ(pjoVar, paeVar);
        this.e = dAJ;
        rnt.F(dAJ > 0.0d, "Invalid sensor size: %s", Double.valueOf(dAJ));
        int iWidth = rect.width();
        int iHeight = rect.height();
        pae paeVar2 = pae.a;
        if (paeVar.d * paeVar2.e < paeVar2.d * paeVar.e) {
            iWidth = (int) ((rect.height() * paeVar.d) / paeVar.e);
        } else {
            iHeight = (int) paeVar.b(rect.width());
        }
        this.f = iWidth / 2;
        this.g = iHeight / 2;
        int iWidth2 = (rect.width() - iWidth) / 2;
        this.h = iWidth2;
        int iHeight2 = (rect.height() - iHeight) / 2;
        this.i = iHeight2;
        this.k = new Rect(iWidth2, iHeight2, iWidth + iWidth2, iHeight + iHeight2);
        this.j = pjoVar.l();
        this.m = d((Float) owfVar.dL());
        this.a = pjoVar.i();
    }
}
