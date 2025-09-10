package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nxr extends nxq {
    private final nxs a;
    private final Interpolator n;
    private final rvu o;
    private final rww p;

    public nxr(Context context, float f, float f2, rvu rvuVar, rww rwwVar) {
        super(context, f);
        float fMax = Math.max(f2, 0.5f);
        this.a = new nxs(fMax + fMax);
        this.n = new DecelerateInterpolator();
        this.o = rvuVar;
        this.p = rwwVar;
    }

    private final PointF p() {
        PointF pointFD;
        if (this.k == null && (pointFD = d(this.b)) != null && (pointFD.x != 0.0f || pointFD.y != 0.0f)) {
            o(pointFD);
            this.k = pointFD;
        }
        return this.k;
    }

    @Override // defpackage.lc
    protected final void c(View view, la laVar) {
        PointF pointFP = p();
        if (pointFP != null) {
            if (pointFP.x == 0.0f && pointFP.y == 0.0f) {
                return;
            }
            int[] iArr = (int[]) this.o.apply(view);
            int i = iArr[0];
            int i2 = iArr[1];
            int iJ = j(Math.max(Math.abs(i), Math.abs(i2)));
            if (iJ > 0) {
                laVar.b(i, i2, iJ, this.n);
            }
        }
    }

    @Override // defpackage.lc
    protected final int j(int i) {
        nxs nxsVar = this.a;
        float f = 1.0f - nxsVar.b;
        return (int) (i / (((float) (nxsVar.a * Math.pow(f, (-1.0f) + r7))) * 0.5f));
    }

    @Override // defpackage.lc
    protected final void m(la laVar) {
        this.k = null;
        PointF pointFP = p();
        if (pointFP == null) {
            laVar.a = this.b;
            f();
            return;
        }
        int iIntValue = ((Integer) this.p.fr()).intValue();
        if (iIntValue == 0) {
            iIntValue = 10000;
        }
        float f = iIntValue;
        this.l = (int) (pointFP.x * f);
        this.m = (int) (f * pointFP.y);
        laVar.b(this.l, this.m, b(Math.max(Math.abs(this.l), Math.abs(this.m))), this.a);
    }
}
