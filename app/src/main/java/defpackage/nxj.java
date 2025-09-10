package defpackage;

import android.graphics.Point;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nxj extends jw {
    boolean b = true;
    public int c = 0;
    private final float d;
    private final float e;
    private RecyclerView f;

    public nxj(float f, float f2) {
        this.d = f;
        this.e = f2;
    }

    @Override // defpackage.jw, defpackage.ks
    public final int a(kq kqVar, int i, int i2) {
        View viewB;
        int iBi;
        int iA = super.a(kqVar, i, i2);
        RecyclerView recyclerView = this.f;
        int iAp = kqVar.ap();
        if (recyclerView != null && iAp != 0 && (viewB = b(kqVar)) != null && (iBi = kq.bi(viewB)) != -1) {
            this.c = ((kqVar.Y() ? recyclerView.computeVerticalScrollRange() : kqVar.X() ? recyclerView.computeHorizontalScrollRange() : 0) / iAp) * Math.abs(iA - iBi);
        }
        return iA;
    }

    @Override // defpackage.jw, defpackage.ks
    public final int[] c(kq kqVar, View view) {
        int[] iArrC = super.c(kqVar, view);
        Point pointA = nwj.a(kqVar, view);
        iArrC[0] = iArrC[0] + pointA.x;
        iArrC[1] = iArrC[1] + pointA.y;
        return iArrC;
    }

    @Override // defpackage.ks
    protected final lc d(kq kqVar) {
        RecyclerView recyclerView = this.f;
        byte[] bArr = null;
        if (recyclerView == null) {
            return null;
        }
        return new nxr(recyclerView.getContext(), this.d, this.e, new hve(this, kqVar, 10, bArr), new nxi(this, 0));
    }

    @Override // defpackage.ks
    public final void e(RecyclerView recyclerView) {
        super.e(recyclerView);
        this.f = recyclerView;
    }

    @Override // defpackage.ks
    public final boolean g(int i, int i2) {
        this.b = false;
        return super.g(i, i2);
    }

    @Override // defpackage.ks
    public final int[] h(int i, int i2) {
        int i3;
        int[] iArrH = super.h(i, i2);
        RecyclerView recyclerView = this.f;
        if (recyclerView != null) {
            ki kiVar = recyclerView.l;
            if (kiVar == null) {
                i3 = 0;
            } else {
                DisplayMetrics displayMetrics = recyclerView.getResources().getDisplayMetrics();
                int i4 = displayMetrics.widthPixels + displayMetrics.heightPixels;
                int iA = kiVar.a();
                i3 = (i4 / 2) * (iA <= 10 ? 4 : iA >= 100 ? 8 : (int) ((((iA - 10) / 90.0f) * 4.0f) + 4.0f));
            }
            int iMin = Math.min(i3, recyclerView.computeHorizontalScrollRange());
            int iMin2 = Math.min(i3, recyclerView.computeVerticalScrollRange());
            iArrH[0] = clc.D(iArrH[0], -iMin, iMin);
            iArrH[1] = clc.D(iArrH[1], -iMin2, iMin2);
        }
        this.c = Math.max(Math.abs(iArrH[0]), Math.abs(iArrH[1]));
        return iArrH;
    }
}
