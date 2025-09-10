package defpackage;

import android.graphics.PointF;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class kh extends ks {
    private kf b;
    private kf c;

    private final kf i(kq kqVar) {
        kf kfVar = this.c;
        if (kfVar == null || kfVar.a != kqVar) {
            this.c = new kd(kqVar);
        }
        return this.c;
    }

    private final kf j(kq kqVar) {
        kf kfVar = this.b;
        if (kfVar == null || kfVar.a != kqVar) {
            this.b = new ke(kqVar);
        }
        return this.b;
    }

    private static final int k(View view, kf kfVar) {
        return (kfVar.d(view) + (kfVar.b(view) / 2)) - (kfVar.j() + (kfVar.k() / 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ks
    public final int a(kq kqVar, int i, int i2) {
        PointF pointFL;
        int iAp = kqVar.ap();
        if (iAp != 0) {
            View view = null;
            kf kfVarJ = kqVar.Y() ? j(kqVar) : kqVar.X() ? i(kqVar) : null;
            if (kfVarJ != null) {
                int iAn = kqVar.an();
                boolean z = false;
                int i3 = Integer.MIN_VALUE;
                int i4 = Integer.MAX_VALUE;
                View view2 = null;
                for (int i5 = 0; i5 < iAn; i5++) {
                    View viewAz = kqVar.az(i5);
                    if (viewAz != null) {
                        int iK = k(viewAz, kfVarJ);
                        if (iK <= 0 && iK > i3) {
                            view2 = viewAz;
                            i3 = iK;
                        }
                        if (iK >= 0 && iK < i4) {
                            view = viewAz;
                            i4 = iK;
                        }
                    }
                }
                if (true != kqVar.X()) {
                    i = i2;
                }
                boolean z2 = i > 0;
                if (z2 && view != null) {
                    return kq.bi(view);
                }
                if (!z2 && view2 != null) {
                    return kq.bi(view2);
                }
                if (true == z2) {
                    view = view2;
                }
                if (view != null) {
                    int iBi = kq.bi(view);
                    int iAp2 = kqVar.ap();
                    if ((kqVar instanceof lb) && (pointFL = ((lb) kqVar).L(iAp2 - 1)) != null && (pointFL.x < 0.0f || pointFL.y < 0.0f)) {
                        z = true;
                    }
                    int i6 = iBi + (z == z2 ? -1 : 1);
                    if (i6 >= 0 && i6 < iAp) {
                        return i6;
                    }
                }
            }
        }
        return -1;
    }

    @Override // defpackage.ks
    public View b(kq kqVar) {
        if (kqVar.Y()) {
            return kk.e(kqVar, j(kqVar));
        }
        if (kqVar.X()) {
            return kk.e(kqVar, i(kqVar));
        }
        return null;
    }

    @Override // defpackage.ks
    public final int[] c(kq kqVar, View view) {
        int[] iArr = new int[2];
        if (kqVar.X()) {
            iArr[0] = k(view, i(kqVar));
        } else {
            iArr[0] = 0;
        }
        if (kqVar.Y()) {
            iArr[1] = k(view, j(kqVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // defpackage.ks
    protected final lc d(kq kqVar) {
        if (kqVar instanceof lb) {
            return new kg(this, this.a.getContext());
        }
        return null;
    }
}
