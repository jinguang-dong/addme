package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.camera.ui.modeslider.ModeSlider;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class glg implements mzc {
    final /* synthetic */ gli a;

    public glg(gli gliVar) {
        this.a = gliVar;
    }

    @Override // defpackage.mzc
    public final void a(View view, boolean z) throws Resources.NotFoundException {
        ModeSlider modeSlider = (ModeSlider) view;
        Object obj = ((myu) modeSlider.d.get(modeSlider.b())).a;
        obj.getClass();
        gli gliVar = this.a;
        nkw nkwVar = (nkw) obj;
        if (gliVar.l(nkwVar)) {
            gliVar.i(nkwVar);
        } else if (z) {
            gliVar.e();
        }
    }

    @Override // defpackage.mzc
    public final void b(boolean z) {
        if (z) {
            gli gliVar = this.a;
            gliVar.b.m(false);
            gliVar.f.m(false);
            gliVar.g.M(false);
            gliVar.d.k(2);
        }
    }
}
