package defpackage;

import android.graphics.PointF;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class jw extends ks {
    private kf b;
    private kf c;

    private final int i(kq kqVar, kf kfVar, int i, int i2) {
        int[] iArrH = h(i, i2);
        int iAn = kqVar.an();
        float f = 1.0f;
        if (iAn != 0) {
            View view = null;
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MIN_VALUE;
            View view2 = null;
            for (int i5 = 0; i5 < iAn; i5++) {
                View viewAz = kqVar.az(i5);
                int iBi = kq.bi(viewAz);
                if (iBi != -1) {
                    int i6 = iBi < i3 ? iBi : i3;
                    if (iBi < i3) {
                        view = viewAz;
                    }
                    if (iBi > i4) {
                        view2 = viewAz;
                        i4 = iBi;
                    }
                    i3 = i6;
                }
            }
            if (view != null && view2 != null) {
                int iMax = Math.max(kfVar.a(view), kfVar.a(view2)) - Math.min(kfVar.d(view), kfVar.d(view2));
                if (iMax != 0) {
                    f = iMax / ((i4 - i3) + 1);
                }
            }
        }
        if (f <= 0.0f) {
            return 0;
        }
        return Math.round(iArrH[Math.abs(iArrH[0]) > Math.abs(iArrH[1]) ? (char) 0 : (char) 1] / f);
    }

    private final kf j(kq kqVar) {
        kf kfVar = this.c;
        if (kfVar == null || kfVar.a != kqVar) {
            this.c = new kd(kqVar);
        }
        return this.c;
    }

    private final kf k(kq kqVar) {
        kf kfVar = this.b;
        if (kfVar == null || kfVar.a != kqVar) {
            this.b = new ke(kqVar);
        }
        return this.b;
    }

    private static final int l(View view, kf kfVar) {
        return (kfVar.d(view) + (kfVar.b(view) / 2)) - (kfVar.j() + (kfVar.k() / 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ks
    public int a(kq kqVar, int i, int i2) {
        int iAp;
        View viewB;
        int iBi;
        int i3;
        PointF pointFL;
        int i4;
        int i5;
        if (!(kqVar instanceof lb) || (iAp = kqVar.ap()) == 0 || (viewB = b(kqVar)) == null || (iBi = kq.bi(viewB)) == -1 || (pointFL = ((lb) kqVar).L(iAp - 1)) == null) {
            return -1;
        }
        if (kqVar.X()) {
            i4 = i(kqVar, j(kqVar), i, 0);
            if (pointFL.x < 0.0f) {
                i4 = -i4;
            }
        } else {
            i4 = 0;
        }
        if (kqVar.Y()) {
            i5 = i(kqVar, k(kqVar), 0, i2);
            if (pointFL.y < 0.0f) {
                i5 = -i5;
            }
        } else {
            i5 = 0;
        }
        if (true == kqVar.Y()) {
            i4 = i5;
        }
        if (i4 == 0) {
            return -1;
        }
        int i6 = iBi + i4;
        int i7 = i6 >= 0 ? i6 : 0;
        return i7 >= iAp ? i3 : i7;
    }

    @Override // defpackage.ks
    public final View b(kq kqVar) {
        if (kqVar.Y()) {
            return kk.e(kqVar, k(kqVar));
        }
        if (kqVar.X()) {
            return kk.e(kqVar, j(kqVar));
        }
        return null;
    }

    @Override // defpackage.ks
    public int[] c(kq kqVar, View view) {
        int[] iArr = new int[2];
        if (kqVar.X()) {
            iArr[0] = l(view, j(kqVar));
        } else {
            iArr[0] = 0;
        }
        if (kqVar.Y()) {
            iArr[1] = l(view, k(kqVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }
}
