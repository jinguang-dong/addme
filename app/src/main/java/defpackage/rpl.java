package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rpl implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ View a;
    final /* synthetic */ Object b;
    final /* synthetic */ LinearLayout c;
    private final /* synthetic */ int d;

    public rpl(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
        this.d = i;
        this.a = coordinatorLayout;
        this.c = appBarLayout;
        this.b = baseBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.d == 0) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            Object obj = this.b;
            ((rpm) this.c).c(this.a, (View) obj, animatedFraction);
            return;
        }
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        Object obj2 = this.b;
        ric ricVar = (ric) obj2;
        ricVar.as((CoordinatorLayout) this.a, this.c, iIntValue);
    }

    public rpl(rpm rpmVar, View view, View view2, int i) {
        this.d = i;
        this.a = view;
        this.b = view2;
        this.c = rpmVar;
    }
}
