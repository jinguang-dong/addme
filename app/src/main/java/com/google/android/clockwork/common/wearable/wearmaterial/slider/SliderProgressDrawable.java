package com.google.android.clockwork.common.wearable.wearmaterial.slider;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
class SliderProgressDrawable extends Drawable {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public float d;
    private final RectF e;
    private float f;

    public SliderProgressDrawable() {
        Paint paint = new Paint();
        this.a = paint;
        this.e = new RectF();
        Paint paint2 = new Paint();
        this.b = paint2;
        Paint paint3 = new Paint();
        this.c = paint3;
        paint2.setStrokeWidth(1.0f);
        paint.setAntiAlias(true);
        paint2.setAntiAlias(true);
        paint3.setAntiAlias(true);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.save();
        Rect bounds = getBounds();
        float fWidth = bounds.width();
        float fHeight = bounds.height();
        if (fWidth == 0.0f || fHeight == 0.0f) {
            canvas.restore();
            return;
        }
        if (getLayoutDirection() == 1) {
            canvas.scale(-1.0f, 1.0f, fWidth / 2.0f, fHeight / 2.0f);
        }
        canvas.drawPaint(this.c);
        RectF rectF = this.e;
        rectF.right = this.f * fWidth;
        rectF.bottom = fHeight;
        canvas.drawRect(rectF, this.a);
        float f = this.d;
        if (f > 0.0f) {
            float f2 = fWidth / f;
            float f3 = f2;
            for (int i = 0; i < this.d; i++) {
                canvas.drawLine(f3, 0.0f, f3, fHeight, this.b);
                f3 += f2;
            }
        }
        canvas.restore();
    }

    public float getFillAmount() {
        return this.f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    public void setFillAmount(float f) {
        this.f = Math.max(0.0f, Math.min(1.0f, f));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
