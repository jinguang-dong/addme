package defpackage;

import android.view.ViewStub;
import com.google.android.apps.camera.faceindicator.FaceIndicatorView;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qqv {
    public final int a;
    public final Object b;

    public qqv(String str, int i) {
        this.b = str;
        this.a = i;
    }

    public qqv(ocq ocqVar, int i) {
        this.b = ocqVar;
        this.a = i;
    }

    public qqv(ps psVar) {
        this.b = psVar;
        this.a = Math.max(4, Runtime.getRuntime().availableProcessors() - 2);
    }

    public qqv(ViewStub viewStub, hbj hbjVar) {
        if (hbjVar.p(gzj.f)) {
            FaceIndicatorView faceIndicatorView = (FaceIndicatorView) viewStub.inflate();
            this.b = rwc.j(faceIndicatorView);
            Object obj = faceIndicatorView.k;
            if ((obj instanceof fdi) && ((fdi) obj).b().p(gzo.aX)) {
                faceIndicatorView.setBackground(faceIndicatorView.getResources().getDrawable(R.drawable.viewfinder_rounded_background, null));
                faceIndicatorView.setClipToOutline(true);
            }
        } else {
            this.b = rvk.a;
        }
        this.a = ((Integer) hbjVar.a(gzj.e).get()).intValue();
    }
}
