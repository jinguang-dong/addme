package defpackage;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.camera.ui.modeswitcher.ModeSwitcher;
import com.google.android.apps.camera.ui.views.CountdownSnapSlider;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class mzh implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ mzh(Object obj, int i, int i2) {
        this.c = i2;
        this.b = obj;
        this.a = i;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) throws Resources.NotFoundException {
        if (this.c != 0) {
            double dFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            int i = this.a;
            Object obj = this.b;
            if (i == 1) {
                double dMin = 1.0d - Math.min(valueAnimator.getCurrentPlayTime() / 200.0d, 1.0d);
                mtm mtmVar = (mtm) obj;
                CountdownSnapSlider countdownSnapSlider = mtmVar.k;
                countdownSnapSlider.g = dMin;
                mtmVar.j.o(countdownSnapSlider.a(dFloatValue), valueAnimator.getAnimatedFraction());
            } else {
                mtm mtmVar2 = (mtm) obj;
                mtmVar2.j.n(mtmVar2.k.a(dFloatValue));
            }
            ((mtm) obj).k.e(dFloatValue);
            return;
        }
        qqq qqqVar = ((mzk) this.b).l;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        Object obj2 = qqqVar.b;
        try {
            nae naeVar = ((ModeSwitcher) obj2).b;
            int left = 0;
            a.I(animatedFraction <= 1.0f);
            View view = naeVar.g;
            view.getClass();
            int iIndexOfChild = naeVar.indexOfChild(view);
            if (iIndexOfChild >= 0) {
                TextView textView = (TextView) naeVar.getChildAt(iIndexOfChild + (this.a != 1 ? 1 : -1));
                left = (view.getLeft() + view.getRight()) / 2;
                if (textView != null) {
                    left += Math.round((((textView.getLeft() + textView.getRight()) / 2) - left) * animatedFraction);
                }
            }
            ((ModeSwitcher) obj2).f(left, true);
        } catch (Throwable th) {
            ((sgt) ModeSwitcher.a.b().M(5265)).v("Working around b/110351942: %s", th);
        }
    }
}
