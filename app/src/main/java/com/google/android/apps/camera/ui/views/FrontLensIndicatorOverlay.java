package com.google.android.apps.camera.ui.views;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import defpackage.fdi;
import defpackage.gyr;
import defpackage.gys;
import defpackage.ojl;
import defpackage.sgv;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FrontLensIndicatorOverlay extends View {
    public static final sgv a = sgv.g("com.google.android.apps.camera.ui.views.FrontLensIndicatorOverlay");
    public ValueAnimator b;
    public final gyr c;
    public final Paint d;
    public final Paint e;
    public final Interpolator f;
    public final Interpolator g;
    public int h;
    public final int i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public int o;
    private final RectF p;

    /* JADX WARN: Multi-variable type inference failed */
    public FrontLensIndicatorOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = null;
        this.p = new RectF();
        this.h = 0;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 0.0f;
        this.m = 1.0f;
        this.o = 1;
        this.c = gys.a(((fdi) context).b());
        this.f = new LinearInterpolator();
        this.g = AnimationUtils.loadInterpolator(getContext(), R.interpolator.fast_out_slow_in);
        this.i = context.getResources().getDimensionPixelSize(com.google.ar.core.R.dimen.pie_progress_front_lens_width);
        Paint paint = new Paint();
        this.d = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(ojl.aL(this));
        paint.setAlpha(51);
        Paint paint2 = new Paint(paint);
        this.e = paint2;
        paint2.setAlpha((int) (this.m * 255.0f));
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        float f = this.j;
        float f2 = this.k;
        float f3 = this.l;
        int i = this.o;
        if (i == 4 || i == 3) {
            this.d.setStrokeWidth(this.n);
            Paint paint = this.e;
            paint.setStrokeWidth(this.n);
            RectF rectF = this.p;
            rectF.set(f - f3, f2 - f3, f + f3, f2 + f3);
            canvas.drawArc(rectF, -99.0f, this.h, false, paint);
        }
    }
}
