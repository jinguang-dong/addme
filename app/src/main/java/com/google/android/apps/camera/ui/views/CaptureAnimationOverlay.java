package com.google.android.apps.camera.ui.views;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import defpackage.fve;
import defpackage.nhg;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CaptureAnimationOverlay extends View {
    public final Paint a;
    public final Interpolator b;
    public final ValueAnimator.AnimatorUpdateListener c;
    public AnimatorSet d;
    public int e;
    private final RectF f;
    private final Interpolator g;
    private final Interpolator h;

    public CaptureAnimationOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = 1;
        this.f = new RectF();
        Paint paint = new Paint();
        this.a = paint;
        paint.setColor(-16777216);
        this.b = new LinearInterpolator();
        this.g = AnimationUtils.loadInterpolator(getContext(), R.interpolator.fast_out_slow_in);
        this.h = AnimationUtils.loadInterpolator(getContext(), R.interpolator.fast_out_linear_in);
        this.c = new fve(this, 19, null);
    }

    public final void a(boolean z) {
        ValueAnimator valueAnimatorOfFloat;
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.d.cancel();
        }
        if (z) {
            valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 0.6f);
            valueAnimatorOfFloat.setDuration(167L);
            valueAnimatorOfFloat.setInterpolator(this.g);
        } else {
            valueAnimatorOfFloat = ValueAnimator.ofFloat(0.6f, 0.0f);
            valueAnimatorOfFloat.setDuration(133L);
            valueAnimatorOfFloat.setInterpolator(this.h);
        }
        valueAnimatorOfFloat.addUpdateListener(this.c);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.d = animatorSet2;
        animatorSet2.play(valueAnimatorOfFloat);
        this.d.addListener(new nhg(this, z));
        this.d.start();
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        this.f.set(new Rect(i, i2, i3, i4));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.e != 1) {
            RectF rectF = this.f;
            canvas.drawRect(rectF, this.a);
            canvas.clipRect(rectF);
        }
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f.set(i, i2, i3, i4);
    }
}
