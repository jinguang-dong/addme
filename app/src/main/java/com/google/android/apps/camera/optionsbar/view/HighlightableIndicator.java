package com.google.android.apps.camera.optionsbar.view;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.ar.core.R;
import defpackage.fve;
import defpackage.kts;

/* compiled from: PG */
/* loaded from: classes.dex */
public class HighlightableIndicator extends View {
    public final Paint a;
    public final Drawable b;
    public boolean c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private final AnimatorSet i;
    private int j;
    private int k;

    public HighlightableIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kts.a);
        try {
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
            drawable.getClass();
            this.b = drawable;
            typedArrayObtainStyledAttributes.recycle();
            this.a = new Paint();
            this.i = new AnimatorSet();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void a(boolean z) {
        if (this.c) {
            return;
        }
        this.c = true;
        if (z) {
            this.i.start();
            return;
        }
        this.a.setColor(this.e);
        this.b.setTint(this.g);
        invalidate();
    }

    public final void b(boolean z) {
        if (this.c) {
            this.c = false;
            if (z) {
                this.i.reverse();
                return;
            }
            this.a.setColor(this.d);
            this.b.setTint(this.f);
            invalidate();
        }
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawOval(0.0f, 0.0f, this.j, this.k, this.a);
        canvas.scale(0.5f, 0.5f, this.j / 2.0f, this.k / 2.0f);
        this.b.draw(canvas);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.d = getContext().getColor(R.color.transparent);
        this.e = getContext().getColor(R.color.highlighted_indicator_background);
        this.f = -1;
        this.g = getContext().getColor(R.color.camera_protection_background);
        this.h = getResources().getDimensionPixelSize(R.dimen.highlightable_indicator_padding);
        this.a.setColor(this.d);
        this.b.setTint(this.f);
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(this.d, this.e);
        valueAnimatorOfArgb.addUpdateListener(new fve(this, 14));
        ValueAnimator valueAnimatorOfArgb2 = ValueAnimator.ofArgb(this.f, this.g);
        valueAnimatorOfArgb2.addUpdateListener(new fve(this, 15));
        this.i.setDuration(167L).playTogether(valueAnimatorOfArgb, valueAnimatorOfArgb2);
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.j = i;
        this.k = i2;
        int i5 = this.h;
        this.b.setBounds(i5, i5, i - i5, i2 - i5);
    }
}
