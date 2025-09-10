package defpackage;

import android.graphics.PointF;
import com.google.android.apps.camera.ui.hotshot.HotshotView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mwh extends elq {
    final /* synthetic */ HotshotView a;

    public mwh(HotshotView hotshotView) {
        this.a = hotshotView;
    }

    @Override // defpackage.elq
    public final /* bridge */ /* synthetic */ Object a(elp elpVar) {
        float f = (((PointF) elpVar.d).x - ((PointF) elpVar.c).x) * elpVar.f;
        float f2 = (((PointF) elpVar.d).y - ((PointF) elpVar.c).y) * elpVar.f;
        HotshotView hotshotView = this.a;
        return new PointF((hotshotView.p.width() * hotshotView.getResources().getDisplayMetrics().density) + f, (hotshotView.p.height() * hotshotView.getResources().getDisplayMetrics().density) + f2);
    }
}
