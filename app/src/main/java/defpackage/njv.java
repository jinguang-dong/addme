package defpackage;

import android.graphics.PointF;
import android.view.MotionEvent;
import com.google.android.apps.camera.ui.layout.MainActivityLayout;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class njv extends qpt {
    final /* synthetic */ uem a;
    final /* synthetic */ krj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public njv(krj krjVar, uem uemVar) {
        super((char[]) null);
        this.b = krjVar;
        this.a = uemVar;
    }

    @Override // defpackage.qpt
    public final boolean fm(obu obuVar) {
        krj krjVar = this.b;
        if (!krjVar.t()) {
            return false;
        }
        PointF pointFH = obuVar.h();
        return (krjVar.u(pointFH) || ojl.bk(pointFH, ((MainActivityLayout) ((ngx) this.a).a().c).findViewById(R.id.creative_button))) ? false : true;
    }

    @Override // defpackage.qpt
    public final void fn(obu obuVar) {
        if (((MotionEvent) obuVar.b).getActionMasked() == 1) {
            krj krjVar = this.b;
            if (krjVar.u(obuVar.h())) {
                return;
            }
            krjVar.v(4);
        }
    }
}
