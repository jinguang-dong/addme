package defpackage;

import android.graphics.PointF;
import com.google.android.apps.camera.ui.hotshot.HotshotView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mwg extends elq {
    final /* synthetic */ HotshotView a;

    public mwg(HotshotView hotshotView) {
        this.a = hotshotView;
    }

    @Override // defpackage.elq
    public final /* bridge */ /* synthetic */ Object a(elp elpVar) {
        HotshotView hotshotView = this.a;
        return new PointF(hotshotView.p.width() * hotshotView.getResources().getDisplayMetrics().density, hotshotView.p.height() * hotshotView.getResources().getDisplayMetrics().density);
    }
}
