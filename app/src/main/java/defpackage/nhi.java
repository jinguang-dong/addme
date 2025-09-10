package defpackage;

import android.animation.ValueAnimator;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButtonProgressOverlay;
import com.google.android.apps.camera.ui.views.FrontLensIndicatorOverlay;
import com.google.android.clockwork.common.wearable.wearmaterial.list.FadingWearableRecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class nhi implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public nhi(FrontLensIndicatorOverlay frontLensIndicatorOverlay, int i) {
        this.b = i;
        this.a = frontLensIndicatorOverlay;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nhm nhmVar = (nhm) this.a;
                nhmVar.e = fFloatValue;
                nhmVar.invalidate();
                break;
            case 1:
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ShutterButtonProgressOverlay shutterButtonProgressOverlay = (ShutterButtonProgressOverlay) this.a;
                shutterButtonProgressOverlay.g(iIntValue);
                if (shutterButtonProgressOverlay.j && shutterButtonProgressOverlay.c == 360) {
                    shutterButtonProgressOverlay.d();
                }
                shutterButtonProgressOverlay.invalidate();
                break;
            case 2:
                ((nhm) this.a).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                int iIntValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                nhm nhmVar2 = (nhm) this.a;
                nhmVar2.d = iIntValue2;
                nhmVar2.invalidate();
                break;
            case 4:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nhm nhmVar3 = (nhm) this.a;
                nhmVar3.e = fFloatValue2;
                nhmVar3.a.setStrokeWidth(fFloatValue2);
                nhmVar3.invalidate();
                break;
            case 5:
                ((nhm) this.a).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 6:
                int iIntValue3 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                FrontLensIndicatorOverlay frontLensIndicatorOverlay = (FrontLensIndicatorOverlay) this.a;
                frontLensIndicatorOverlay.h = iIntValue3;
                frontLensIndicatorOverlay.invalidate();
                if (frontLensIndicatorOverlay.h == 360) {
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                    valueAnimatorOfFloat.setDuration(500L);
                    valueAnimatorOfFloat.setInterpolator(frontLensIndicatorOverlay.f);
                    valueAnimatorOfFloat.addListener(new nho(frontLensIndicatorOverlay));
                    valueAnimatorOfFloat.addUpdateListener(new nhi(frontLensIndicatorOverlay, 8));
                    valueAnimatorOfFloat.start();
                    break;
                }
                break;
            case 7:
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FrontLensIndicatorOverlay frontLensIndicatorOverlay2 = (FrontLensIndicatorOverlay) this.a;
                frontLensIndicatorOverlay2.n = fFloatValue3;
                frontLensIndicatorOverlay2.d.setStrokeWidth(fFloatValue3);
                frontLensIndicatorOverlay2.invalidate();
                break;
            case 8:
                float fFloatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FrontLensIndicatorOverlay frontLensIndicatorOverlay3 = (FrontLensIndicatorOverlay) this.a;
                frontLensIndicatorOverlay3.m = fFloatValue4;
                frontLensIndicatorOverlay3.e.setAlpha((int) (fFloatValue4 * 255.0f));
                frontLensIndicatorOverlay3.invalidate();
                break;
            case 9:
                int i = nwm.a;
                ((nwt) this.a).e();
                break;
            case 10:
                ((FadingWearableRecyclerView) this.a).ah.e();
                break;
            case 11:
                float fFloatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rjr rjrVar = (rjr) this.a;
                rjrVar.j.setAlpha((int) (255.0f * fFloatValue5));
                rjrVar.s = fFloatValue5;
                break;
            default:
                rml rmlVar = (rml) this.a;
                rmlVar.b.e = rmlVar.e.getInterpolation(rmlVar.d.getAnimatedFraction());
                break;
        }
    }

    public /* synthetic */ nhi(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
