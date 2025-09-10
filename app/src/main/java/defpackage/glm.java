package defpackage;

import android.animation.AnimatorInflater;
import android.animation.LayoutTransition;
import android.view.View;
import com.google.android.apps.camera.camcorder.ui.modeslider.recordspeed.RecordSpeedSlider;
import com.google.ar.core.R;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class glm implements mzc {
    public final /* synthetic */ glq a;
    final /* synthetic */ mzd b;
    public final /* synthetic */ gln c;

    public glm(gln glnVar, glq glqVar, mzd mzdVar) {
        this.a = glqVar;
        this.b = mzdVar;
        this.c = glnVar;
    }

    @Override // defpackage.mzc
    public final void a(View view, boolean z) {
        RecordSpeedSlider recordSpeedSlider = (RecordSpeedSlider) view;
        glq glqVar = this.a;
        if (glqVar.d) {
            gln glnVar = this.c;
            AtomicInteger atomicInteger = glnVar.b;
            if (atomicInteger.get() != recordSpeedSlider.b()) {
                glnVar.e(false);
                atomicInteger.set(recordSpeedSlider.b());
            } else {
                glnVar.c.m(true);
                glnVar.f.m(true);
                glnVar.g.M(true);
                glnVar.d.k(1);
            }
            glnVar.h(glqVar.f, recordSpeedSlider.b());
        }
        if (recordSpeedSlider.j()) {
            int iB = recordSpeedSlider.b();
            gln glnVar2 = this.c;
            if (iB == glnVar2.m) {
                glnVar2.b();
                glnVar2.e(false);
                LayoutTransition layoutTransition = recordSpeedSlider.getLayoutTransition();
                layoutTransition.setAnimator(3, AnimatorInflater.loadAnimator(recordSpeedSlider.getContext(), R.animator.anim_options_fade_out));
                layoutTransition.addTransitionListener(new gll(this));
                recordSpeedSlider.removeAllViews();
            }
        }
    }

    @Override // defpackage.mzc
    public final void b(boolean z) {
        gln glnVar = this.c;
        glnVar.b.set(this.b.b());
        if (z && this.a.d) {
            glnVar.b();
        }
    }
}
