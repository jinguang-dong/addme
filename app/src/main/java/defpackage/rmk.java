package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rmk extends ctm {
    @Override // defpackage.ctm
    public final /* bridge */ /* synthetic */ float a(Object obj) {
        int i = rml.h;
        return ((rml) obj).b() * 10000.0f;
    }

    @Override // defpackage.ctm
    public final /* bridge */ /* synthetic */ void b(Object obj, float f) {
        rml rmlVar = (rml) obj;
        int i = rml.h;
        rmlVar.d(f / 10000.0f);
        if (rmlVar.j.c(true)) {
            if (rmlVar.d == null) {
                Context context = rmlVar.i;
                TimeInterpolator timeInterpolator = rhn.a;
                rmlVar.f = qpt.G(context, R.attr.motionEasingStandardInterpolator, timeInterpolator);
                rmlVar.g = qpt.G(context, R.attr.motionEasingEmphasizedAccelerateInterpolator, timeInterpolator);
                rmlVar.d = new ValueAnimator();
                rmlVar.d.setDuration(500L);
                rmlVar.d.setFloatValues(0.0f, 1.0f);
                rmlVar.d.setInterpolator(null);
                rmlVar.d.addUpdateListener(new nhi(rmlVar, 12));
            }
            float fA = rmlVar.a((int) f);
            if (fA == rmlVar.c) {
                if (rmlVar.d.isRunning()) {
                    return;
                }
                rmlVar.c(fA);
                return;
            }
            if (rmlVar.d.isRunning()) {
                rmlVar.d.cancel();
            }
            rmlVar.c = fA;
            if (fA == 1.0f) {
                rmlVar.e = rmlVar.f;
                rmlVar.d.start();
            } else {
                rmlVar.e = rmlVar.g;
                rmlVar.d.reverse();
            }
        }
    }
}
