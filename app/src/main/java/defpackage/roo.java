package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class roo implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public roo(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.b;
        if (i == 0) {
            ((row) this.a).j.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            return;
        }
        if (i == 1) {
            ((CollapsingToolbarLayout) this.a).e(((Integer) valueAnimator.getAnimatedValue()).intValue());
            return;
        }
        if (i == 2) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            rov rovVar = ((row) this.a).j;
            rovVar.setScaleX(fFloatValue);
            rovVar.setScaleY(fFloatValue);
            return;
        }
        if (i == 3) {
            ((row) this.a).j.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
        } else if (i != 4) {
            ((TabLayout) this.a).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        } else {
            ((row) this.a).j.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }
}
