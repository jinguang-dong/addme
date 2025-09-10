package defpackage;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.google.android.apps.camera.autotimer.ui.AutoTimerIndicatorView;
import com.google.android.apps.camera.bottombar.ThumbnailView;
import com.google.android.apps.camera.filmstrip.transition.FilmstripTransitionLayout;
import com.google.android.apps.camera.focusindicator.FocusIndicatorAccessoryView;
import com.google.android.apps.camera.focusindicator.FocusIndicatorRingView;
import com.google.android.apps.camera.optionsbar.view.HighlightBarIndicator;
import com.google.android.apps.camera.optionsbar.view.HighlightableIndicator;
import com.google.android.apps.camera.ui.views.CaptureAnimationOverlay;
import com.google.android.apps.camera.ui.zoomlock.ZoomLockView;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fve implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ fve(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [hnn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [hnq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [hnn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [hnq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [hnn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [hnq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [hnn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [hnq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [hns, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [hns, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [hnq, java.lang.Object] */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                ((AutoTimerIndicatorView) this.a).invalidate();
                break;
            case 1:
                efs efsVar = (efs) this.a;
                eji ejiVar = efsVar.k;
                if (ejiVar != null) {
                    ejiVar.m(efsVar.b.c());
                    break;
                }
                break;
            case 2:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ThumbnailView thumbnailView = (ThumbnailView) this.a;
                thumbnailView.o = fFloatValue;
                thumbnailView.invalidate();
                break;
            case 3:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hks hksVar = (hks) this.a;
                hksVar.f = hksVar.c.a * fFloatValue2;
                hksVar.g = (int) (valueAnimator.getAnimatedFraction() * 204.0f);
                break;
            case 4:
                ((hks) this.a).g = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                break;
            case 5:
                float animatedFraction = 1.0f - valueAnimator.getAnimatedFraction();
                FilmstripTransitionLayout filmstripTransitionLayout = (FilmstripTransitionLayout) this.a;
                hnh hnhVar = filmstripTransitionLayout.f;
                hnhVar.getClass();
                float fB = hnhVar.b(animatedFraction);
                filmstripTransitionLayout.c.setScaleX(fB);
                filmstripTransitionLayout.c.setScaleY(fB);
                PointF pointFC = filmstripTransitionLayout.f.c(animatedFraction);
                filmstripTransitionLayout.c.setTranslationX(pointFC.x);
                filmstripTransitionLayout.c.setTranslationY(pointFC.y);
                filmstripTransitionLayout.c.b(filmstripTransitionLayout.f.a(animatedFraction));
                filmstripTransitionLayout.b(hnh.d(animatedFraction));
                filmstripTransitionLayout.invalidate();
                break;
            case 6:
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qqq qqqVar = (qqq) this.a;
                qqqVar.d.c(fFloatValue3);
                ((FocusIndicatorRingView) qqqVar.b).invalidate();
                break;
            case 7:
                float fFloatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qqq qqqVar2 = (qqq) this.a;
                qqqVar2.d.d(fFloatValue4);
                ((FocusIndicatorRingView) qqqVar2.b).invalidate();
                break;
            case 8:
                float fFloatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qqq qqqVar3 = (qqq) this.a;
                qqqVar3.a.l(fFloatValue5);
                qqqVar3.e.c(fFloatValue5);
                ((FocusIndicatorRingView) qqqVar3.b).invalidate();
                break;
            case 9:
                float fFloatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qqq qqqVar4 = (qqq) this.a;
                qqqVar4.a.m(fFloatValue6);
                qqqVar4.e.d(fFloatValue6);
                ((FocusIndicatorRingView) qqqVar4.b).invalidate();
                break;
            case 10:
                float fFloatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qqq qqqVar5 = (qqq) this.a;
                qqqVar5.a.n(fFloatValue7);
                qqqVar5.e.b(fFloatValue7);
                ((FocusIndicatorRingView) qqqVar5.b).invalidate();
                break;
            case 11:
                float fFloatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qqq qqqVar6 = (qqq) this.a;
                rwc rwcVar = (rwc) qqqVar6.c;
                if (rwcVar.h()) {
                    ((FocusIndicatorAccessoryView) rwcVar.c()).d(fFloatValue8);
                    ((FocusIndicatorAccessoryView) rwcVar.c()).invalidate();
                }
                qqqVar6.a.m(fFloatValue8);
                qqqVar6.e.d(fFloatValue8);
                ((FocusIndicatorRingView) qqqVar6.b).invalidate();
                break;
            case 12:
                float fFloatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qqq qqqVar7 = (qqq) this.a;
                qqqVar7.a.m(fFloatValue9);
                ((FocusIndicatorRingView) qqqVar7.b).invalidate();
                break;
            case 13:
                HighlightBarIndicator highlightBarIndicator = (HighlightBarIndicator) this.a;
                Drawable drawable = highlightBarIndicator.a;
                if (drawable != null) {
                    drawable.setTint(((Integer) valueAnimator.getAnimatedValue()).intValue());
                }
                highlightBarIndicator.invalidate();
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                HighlightableIndicator highlightableIndicator = (HighlightableIndicator) this.a;
                highlightableIndicator.a.setColor(iIntValue);
                highlightableIndicator.invalidate();
                break;
            case 15:
                int iIntValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                HighlightableIndicator highlightableIndicator2 = (HighlightableIndicator) this.a;
                highlightableIndicator2.b.setTint(iIntValue2);
                highlightableIndicator2.invalidate();
                break;
            case 16:
                ((View) this.a).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 17:
                int iIntValue3 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                mzy mzyVar = (mzy) this.a;
                mzyVar.n = iIntValue3;
                mzyVar.i();
                break;
            case 18:
                ((ndc) this.a).b.invalidate();
                break;
            case 19:
                float fFloatValue10 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f;
                CaptureAnimationOverlay captureAnimationOverlay = (CaptureAnimationOverlay) this.a;
                captureAnimationOverlay.a.setAlpha((int) fFloatValue10);
                captureAnimationOverlay.invalidate();
                break;
            default:
                ((GradientDrawable) ((ZoomLockView) this.a).c.getBackground()).setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
        }
    }

    public fve(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
