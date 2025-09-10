package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.bottombar.ThumbnailView;
import com.google.android.apps.camera.gesturecapture.ui.CatcherView;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButtonProgressOverlay;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class cot implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public cot(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                ((View) ((ez) ((AmbientMode.AmbientController) this.a).a).c.getParent()).invalidate();
                break;
            case 1:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f;
                jk jkVar = (jk) this.a;
                int i = (int) fFloatValue;
                jkVar.b.setAlpha(i);
                jkVar.c.setAlpha(i);
                jkVar.a();
                break;
            case 2:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ThumbnailView thumbnailView = (ThumbnailView) this.a;
                thumbnailView.e = fFloatValue2;
                thumbnailView.f = (valueAnimator.getAnimatedFraction() * (-0.5f)) + 0.5f;
                thumbnailView.invalidate();
                break;
            case 3:
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ThumbnailView thumbnailView2 = (ThumbnailView) this.a;
                thumbnailView2.e = fFloatValue3;
                thumbnailView2.invalidate();
                break;
            case 4:
                float fFloatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ThumbnailView thumbnailView3 = (ThumbnailView) this.a;
                thumbnailView3.l = fFloatValue4;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                float f = thumbnailView3.i;
                thumbnailView3.m = f + ((thumbnailView3.j - f) * animatedFraction);
                thumbnailView3.n = (animatedFraction * (-0.4f)) + 0.4f;
                thumbnailView3.invalidate();
                break;
            case 5:
                valueAnimator.getClass();
                gwv gwvVar = (gwv) this.a;
                if (gwvVar.G || !((Boolean) gwvVar.f.dL()).booleanValue()) {
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    animatedValue.getClass();
                    gwvVar.v(((Float) animatedValue).floatValue(), null, niz.f);
                    break;
                }
                break;
            case 6:
                valueAnimator.getClass();
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                animatedValue2.getClass();
                Float f2 = (Float) animatedValue2;
                f2.floatValue();
                ((gwv) this.a).g.a(f2);
                break;
            case 7:
                float fFloatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CatcherView catcherView = (CatcherView) this.a;
                catcherView.l = fFloatValue5;
                if (fFloatValue5 > 0.0f) {
                    catcherView.invalidate();
                    break;
                }
                break;
            case 8:
                float fFloatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CatcherView catcherView2 = (CatcherView) this.a;
                catcherView2.n = fFloatValue6;
                if (fFloatValue6 > 0.95f) {
                    catcherView2.invalidate();
                    break;
                }
                break;
            case 9:
                ((kdh) this.a).b.setImageAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 10:
                ViewGroup viewGroup = (ViewGroup) this.a;
                viewGroup.setVisibility(0);
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                layoutParams.getClass();
                layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                viewGroup.setLayoutParams(layoutParams);
                break;
            case 11:
                ((nae) this.a).invalidate();
                break;
            case 12:
                ((View) ((nae) this.a).getParent()).invalidate();
                break;
            case 13:
                ((nay) this.a).b.invalidate();
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                float fFloatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ShutterButton shutterButton = (ShutterButton) this.a;
                shutterButton.i = fFloatValue7;
                shutterButton.p();
                shutterButton.invalidateOutline();
                shutterButton.invalidate();
                break;
            case 15:
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ShutterButton shutterButton2 = (ShutterButton) this.a;
                shutterButton2.r = iIntValue;
                shutterButton2.invalidate();
                break;
            case 16:
                float fFloatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ShutterButtonProgressOverlay shutterButtonProgressOverlay = (ShutterButtonProgressOverlay) this.a;
                shutterButtonProgressOverlay.h(fFloatValue8);
                shutterButtonProgressOverlay.invalidate();
                break;
            case 17:
                CircularProgressIndicator circularProgressIndicator = ((ShutterButtonProgressOverlay) this.a).n;
                if (circularProgressIndicator != null) {
                    circularProgressIndicator.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    break;
                }
                break;
            case 18:
                int iIntValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ShutterButtonProgressOverlay shutterButtonProgressOverlay2 = (ShutterButtonProgressOverlay) this.a;
                shutterButtonProgressOverlay2.a = iIntValue2;
                shutterButtonProgressOverlay2.invalidate();
                break;
            case 19:
                float fFloatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ShutterButtonProgressOverlay shutterButtonProgressOverlay3 = (ShutterButtonProgressOverlay) this.a;
                shutterButtonProgressOverlay3.h(fFloatValue9);
                shutterButtonProgressOverlay3.invalidate();
                break;
            default:
                CircularProgressIndicator circularProgressIndicator2 = ((ShutterButtonProgressOverlay) this.a).n;
                if (circularProgressIndicator2 != null) {
                    circularProgressIndicator2.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    break;
                }
                break;
        }
    }

    public /* synthetic */ cot(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
