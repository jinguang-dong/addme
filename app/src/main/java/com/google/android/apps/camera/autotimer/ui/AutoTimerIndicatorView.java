package com.google.android.apps.camera.autotimer.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import com.google.ar.core.R;
import defpackage.fve;
import defpackage.fvf;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AutoTimerIndicatorView extends View {
    public static final Duration a = Duration.ofMillis(250);
    static final Duration b = Duration.ofMillis(100);
    public final View.OnLayoutChangeListener c;
    final Paint d;
    final ValueAnimator e;
    public ViewPropertyAnimator f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final float l;
    private final float m;
    private final float n;
    private final Matrix o;
    private final Paint p;
    private final Paint q;
    private final RectF r;
    private final RectF s;
    private final RectF t;
    private final RectF u;
    private int v;
    private float w;

    public AutoTimerIndicatorView(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        setLayerType(2, null);
        Resources resources = getResources();
        this.h = resources.getDimensionPixelSize(R.dimen.autotimer_indicator_height);
        this.k = resources.getDimensionPixelSize(R.dimen.autotimer_indicator_rounded_corner);
        this.j = resources.getDimensionPixelSize(R.dimen.autotimer_indicator_min_width);
        this.i = resources.getDimensionPixelSize(R.dimen.autotimer_indicator_margin);
        int color = resources.getColor(R.color.autotimer_indicator_foreground);
        this.g = color;
        float dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.autotimer_indicator_border_width);
        this.l = dimensionPixelSize;
        this.o = new Matrix();
        this.r = new RectF();
        this.u = new RectF();
        this.s = new RectF();
        this.t = new RectF();
        Paint paint = new Paint();
        this.d = paint;
        paint.setColor(color);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.p = paint2;
        paint2.setColor(resources.getColor(R.color.autotimer_indicator_background));
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.q = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setColor(resources.getColor(R.color.autotimer_indicator_background_stroke));
        paint3.setAntiAlias(true);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        paint3.setStrokeWidth(dimensionPixelSize);
        int i = 0;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f);
        this.e = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new fve(this, i));
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        float integer = resources.getInteger(R.integer.autotimer_indicator_foreground_alpha_min);
        float integer2 = resources.getInteger(R.integer.autotimer_indicator_foreground_alpha_max);
        this.m = integer / integer2;
        this.n = (integer2 - integer) / integer2;
        this.c = new fvf(this, i);
    }

    private static RectF c(int i, int i2, int i3, int i4, int i5) {
        float f = i2;
        float f2 = i;
        float f3 = i4;
        float f4 = i3;
        return (i5 == 1 || i5 == 3) ? new RectF(f, f2, f3, f4) : new RectF(f2, f, f4, f3);
    }

    public final void a(float f) {
        this.w = f;
        if (getVisibility() == 0) {
            ValueAnimator valueAnimator = this.e;
            if (valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), f);
            valueAnimator.setDuration(b.toMillis());
            valueAnimator.start();
        }
    }

    public final void b(int i, int i2, int i3, int i4) {
        Display display = getDisplay();
        this.v = display != null ? display.getRotation() : 0;
        Matrix matrix = this.o;
        matrix.reset();
        matrix.postRotate((-r0) * 90, 0.5f, 0.5f);
        matrix.postTranslate((i3 - i) * 0.5f, (i4 - i2) * 0.5f);
        RectF rectFC = c(i, i2, i3, i4, this.v);
        RectF rectF = this.t;
        float f = -rectFC.height();
        float f2 = this.i;
        rectF.top = (f * 0.5f) + f2;
        rectF.bottom = rectF.top + this.h;
        rectF.left = ((-rectFC.width()) * 0.5f) + f2;
        rectF.right = -rectF.left;
        RectF rectF2 = this.s;
        rectF2.top = rectF.top;
        rectF2.bottom = rectF.bottom;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        RectF rectFC = c(getLeft(), getTop(), getRight(), getBottom(), this.v);
        float fFloatValue = ((Float) this.e.getAnimatedValue()).floatValue();
        float fWidth = rectFC.width();
        int i = this.i;
        float f = -Math.max(this.j, (int) ((fWidth - (i + i)) * fFloatValue));
        RectF rectF = this.s;
        rectF.left = f * 0.5f;
        rectF.right = -rectF.left;
        Matrix matrix = this.o;
        RectF rectF2 = this.u;
        matrix.mapRect(rectF2, rectF);
        RectF rectF3 = this.r;
        matrix.mapRect(rectF3, this.t);
        int i2 = (int) (((this.w * this.n) + this.m) * 255.0f);
        int i3 = this.g & 16777215;
        Paint paint = this.d;
        paint.setColor((i2 << 24) | i3);
        Paint paint2 = this.p;
        float f2 = this.k;
        canvas.drawRoundRect(rectF3, f2, f2, paint2);
        float f3 = rectF3.left;
        float f4 = this.l;
        canvas.drawRoundRect(f3 - f4, rectF3.top - f4, rectF3.right + f4, rectF3.bottom + f4, f2, f2, this.q);
        canvas.drawRoundRect(rectF2, f2, f2, paint);
    }
}
