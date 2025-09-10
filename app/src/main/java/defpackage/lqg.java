package defpackage;

import android.graphics.Point;
import android.os.Handler;
import com.google.android.apps.camera.ui.views.CutoutBar;
import com.google.android.apps.camera.ui.views.FrontLensIndicatorOverlay;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lqg implements mxl {
    public boolean a;
    public final out c;
    public final owf e;
    public final owf f;
    public CutoutBar g;
    public FrontLensIndicatorOverlay h;
    public Runnable i;
    public final fdq j;
    public final lqo k;
    public final Object d = new Object();
    public final Handler b = new Handler();

    public lqg(fdq fdqVar, owq owqVar, owf owfVar, out outVar, lqo lqoVar) {
        this.e = owqVar;
        this.f = owfVar;
        this.j = fdqVar;
        this.c = outVar;
        this.k = lqoVar;
    }

    public final void a() {
        this.c.c(new lac(this, 4));
    }

    @Override // defpackage.mxl
    public final void eR(mxj mxjVar, mxm mxmVar) {
        CutoutBar cutoutBar = this.g;
        if (cutoutBar != null) {
            if (mxjVar.equals(mxj.PHONE_LAYOUT) || mxjVar.equals(mxj.SIMPLIFIED_LAYOUT)) {
                Point pointE = nlj.e(cutoutBar);
                if (mxmVar.d()) {
                    cutoutBar.c = pointE.x;
                    cutoutBar.d = pointE.y;
                } else {
                    cutoutBar.c = pointE.y;
                    cutoutBar.d = pointE.x;
                }
            } else {
                cutoutBar.c = nlj.d(cutoutBar).x;
                cutoutBar.d = cutoutBar.getHeight() / 2.0f;
            }
            a();
        }
        FrontLensIndicatorOverlay frontLensIndicatorOverlay = this.h;
        if (frontLensIndicatorOverlay != null) {
            if (!mxjVar.equals(mxj.PHONE_LAYOUT) && !mxjVar.equals(mxj.SIMPLIFIED_LAYOUT)) {
                frontLensIndicatorOverlay.j = nlj.d(frontLensIndicatorOverlay).x;
                frontLensIndicatorOverlay.k = frontLensIndicatorOverlay.getHeight() / 2.0f;
                return;
            }
            Point pointE2 = nlj.e(frontLensIndicatorOverlay);
            if (mxmVar.d()) {
                frontLensIndicatorOverlay.j = pointE2.x;
                frontLensIndicatorOverlay.k = pointE2.y;
            } else {
                frontLensIndicatorOverlay.j = pointE2.y;
                frontLensIndicatorOverlay.k = pointE2.x;
            }
        }
    }

    @Override // defpackage.mxl
    public final /* synthetic */ void eH(mxm mxmVar) {
    }
}
