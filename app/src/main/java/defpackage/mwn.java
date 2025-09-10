package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.ViewStub;
import com.google.android.apps.camera.ui.hotshot.HotshotView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mwn {
    public static final sgv a = sgv.g("mwn");
    public final rwc b;
    public boolean c = false;
    public owq d = new ovx(new mwl[0]);
    public final hbj e;

    public mwn(ViewStub viewStub, hbj hbjVar) {
        this.e = hbjVar;
        this.b = hbjVar.p(gzt.a) ? rwc.j((HotshotView) viewStub.inflate()) : rvk.a;
    }

    public final void a(Rect rect) {
        rwc rwcVar = this.b;
        if (rwcVar.h() && this.c && rect != null) {
            Object objC = rwcVar.c();
            if (rect.height() == 0 || rect.width() == 0) {
                return;
            }
            HotshotView hotshotView = (HotshotView) objC;
            if (!hotshotView.h.equals(rect)) {
                hotshotView.h = rect;
                hotshotView.m.clear();
            }
            hotshotView.q = Math.abs((((float) rect.width()) / ((float) rect.height())) + (-1.7777778f)) < 0.025f;
            pbu pbuVar = ((hfo) objC).e;
            pbuVar.g(rect);
            if (pbuVar.f()) {
                Matrix matrixA = pbuVar.a();
                RectF rectF = hotshotView.b;
                matrixA.mapRect(rectF, new RectF(rect));
                if (hotshotView.d) {
                    float fMin = Math.min(rectF.width(), rectF.height());
                    hotshotView.f = fMin;
                    if (fMin == 0.0f) {
                        ((sgt) HotshotView.a.c().M(5103)).s("lengthOfScreenShortSide should not be zero.");
                        hotshotView.f = 1.0f;
                    }
                }
            }
        }
    }

    public final void b(int i) {
        rwc rwcVar = this.b;
        if (rwcVar.h()) {
            ((hfo) rwcVar.c()).e.d(i);
        } else {
            ((sgt) a.b().M(5109)).s("setSensorOrientation, view is not present.");
        }
    }

    public final void c(boolean z) {
        rwc rwcVar = this.b;
        if (rwcVar.h()) {
            int i = true != z ? 4 : 0;
            if (((HotshotView) rwcVar.c()).getVisibility() != i) {
                ((HotshotView) rwcVar.c()).setVisibility(i);
            }
        }
    }
}
