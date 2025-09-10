package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dft extends Drawable implements Animatable {
    private static final Interpolator d = new LinearInterpolator();
    private static final Interpolator e = new cvn();
    private static final int[] f = {-16777216};
    public final dfs a;
    public float b;
    public boolean c;
    private float g;
    private final Animator h;

    public dft(Context context) {
        coe.d(context);
        context.getResources();
        dfs dfsVar = new dfs();
        this.a = dfsVar;
        dfsVar.e(f);
        c(2.5f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new rhu(this, dfsVar, 1));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(d);
        valueAnimatorOfFloat.addListener(new jfi(this, dfsVar, 1));
        this.h = valueAnimatorOfFloat;
    }

    public static final void d(float f2, dfs dfsVar) {
        if (f2 <= 0.75f) {
            dfsVar.q = dfsVar.b();
            return;
        }
        int iB = dfsVar.b();
        int i = dfsVar.i[dfsVar.a()];
        int i2 = iB >> 24;
        int i3 = iB >> 16;
        int i4 = iB >> 8;
        int i5 = i >> 16;
        int i6 = i >> 8;
        float f3 = (f2 - 0.75f) / 0.25f;
        int i7 = (i4 & 255) + ((int) (((i6 & 255) - r4) * f3));
        int i8 = (i3 & 255) + ((int) (((i5 & 255) - r3) * f3));
        int i9 = i2 & 255;
        dfsVar.q = ((i9 + ((int) (f3 * (((i >> 24) & 255) - i9)))) << 24) | (i8 << 16) | (i7 << 8) | ((iB & 255) + ((int) (((i & 255) - r0) * f3)));
    }

    public final void a(float f2, dfs dfsVar, boolean z) {
        float interpolation;
        float interpolation2;
        if (this.c) {
            d(f2, dfsVar);
            double dFloor = Math.floor(dfsVar.m / 0.8f) + 1.0d;
            float f3 = dfsVar.k;
            float f4 = dfsVar.l;
            dfsVar.e = f3 + ((((-0.01f) + f4) - f3) * f2);
            dfsVar.f = f4;
            float f5 = dfsVar.m;
            dfsVar.g = f5 + ((((float) dFloor) - f5) * f2);
            return;
        }
        if (f2 != 1.0f || z) {
            float f6 = dfsVar.m;
            if (f2 < 0.5f) {
                interpolation = dfsVar.k;
                interpolation2 = (e.getInterpolation(f2 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f7 = dfsVar.k + 0.79f;
                interpolation = f7 - (((1.0f - e.getInterpolation(((-0.5f) + f2) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = f7;
            }
            float f8 = f6 + (0.20999998f * f2);
            float f9 = f2 + this.b;
            dfsVar.e = interpolation;
            dfsVar.f = interpolation2;
            dfsVar.g = f8;
            this.g = f9 * 216.0f;
        }
    }

    public final void b(float f2) {
        this.a.o = f2;
        invalidateSelf();
    }

    public final void c(float f2) {
        dfs dfsVar = this.a;
        dfsVar.h = f2;
        dfsVar.b.setStrokeWidth(f2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.g, bounds.exactCenterX(), bounds.exactCenterY());
        dfs dfsVar = this.a;
        float f2 = dfsVar.o;
        float fMin = (dfsVar.h / 2.0f) + f2;
        if (f2 <= 0.0f) {
            float f3 = dfsVar.n;
            fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max(0.0f, dfsVar.h / 2.0f);
        }
        RectF rectF = dfsVar.a;
        rectF.set(bounds.centerX() - fMin, bounds.centerY() - fMin, bounds.centerX() + fMin, bounds.centerY() + fMin);
        float f4 = dfsVar.e;
        float f5 = dfsVar.g;
        float f6 = f4 + f5;
        float f7 = dfsVar.f + f5;
        Paint paint = dfsVar.b;
        paint.setColor(dfsVar.q);
        paint.setAlpha(dfsVar.p);
        float f8 = dfsVar.h / 2.0f;
        rectF.inset(f8, f8);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, dfsVar.d);
        float f9 = -f8;
        rectF.inset(f9, f9);
        float f10 = f6 * 360.0f;
        canvas.drawArc(rectF, f10, (f7 * 360.0f) - f10, false, paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.a.p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.h.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.p = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Animator animator = this.h;
        animator.cancel();
        dfs dfsVar = this.a;
        dfsVar.f();
        if (dfsVar.f != dfsVar.e) {
            this.c = true;
            animator.setDuration(666L);
            animator.start();
        } else {
            dfsVar.d(0);
            dfsVar.c();
            animator.setDuration(1332L);
            animator.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.h.cancel();
        this.g = 0.0f;
        dfs dfsVar = this.a;
        dfsVar.d(0);
        dfsVar.c();
        invalidateSelf();
    }
}
