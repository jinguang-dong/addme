package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Color;
import com.google.android.apps.camera.ui.captureframe.CaptureFrameUi;
import java.util.function.BiFunction;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ncx implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ncx(mny mnyVar, CaptureFrameUi captureFrameUi, int i) {
        this.c = i;
        this.b = mnyVar;
        this.a = captureFrameUi;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.function.BiFunction] */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iArgb;
        if (this.c == 0) {
            ndv ndvVar = ((ndc) this.a).b.j;
            Integer num = (Integer) valueAnimator.getAnimatedValue();
            num.intValue();
            return;
        }
        Object obj = this.b;
        Object obj2 = ((mny) obj).d;
        Object obj3 = this.a;
        synchronized (obj2) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            int iA = ((mny) obj).b.a();
            moa moaVar = ((mny) obj).b;
            int iArgb2 = Color.argb(iA, moaVar.e, moaVar.f, moaVar.g);
            if (((mny) obj).c.equals(moa.HIDDEN)) {
                int iA2 = ((mny) obj).c.a();
                moa moaVar2 = ((mny) obj).b;
                iArgb = Color.argb(iA2, moaVar2.e, moaVar2.f, moaVar2.g);
            } else {
                int iA3 = ((mny) obj).c.a();
                moa moaVar3 = ((mny) obj).c;
                iArgb = Color.argb(iA3, moaVar3.e, moaVar3.f, moaVar3.g);
            }
            ((CaptureFrameUi) obj3).b.setColor(cmg.c(iArgb2, iArgb, fFloatValue));
            ((CaptureFrameUi) obj3).invalidate();
        }
    }

    public /* synthetic */ ncx(ndc ndcVar, BiFunction biFunction, int i) {
        this.c = i;
        this.a = ndcVar;
        this.b = biFunction;
    }
}
