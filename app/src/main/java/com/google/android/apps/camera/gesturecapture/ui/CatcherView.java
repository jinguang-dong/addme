package com.google.android.apps.camera.gesturecapture.ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.animation.DecelerateInterpolator;
import com.google.ar.core.R;
import defpackage.cot;
import defpackage.hfo;
import defpackage.hse;
import defpackage.hsf;
import defpackage.pmg;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CatcherView extends hfo {
    public final Paint a;
    public final Paint b;
    public final Path c;
    public final Path d;
    public final PathMeasure f;
    public final Context g;
    public final Rect h;
    public final Rect i;
    public final RectF j;
    public final Set k;
    public float l;
    public float m;
    public float n;
    public int o;
    public int p;
    public AnimatorSet q;
    public int r;
    public pmg s;
    private final Paint t;
    private final Paint u;
    private final Paint v;

    public CatcherView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k = DesugarCollections.synchronizedSet(new HashSet());
        this.o = 0;
        this.p = 0;
        this.r = 4;
        this.g = context;
        this.j = new RectF();
        this.h = new Rect();
        this.u = new Paint(1);
        this.a = new Paint(1);
        this.c = new Path();
        this.f = new PathMeasure();
        this.t = new Paint();
        this.b = new Paint(1);
        this.d = new Path();
        Paint paint = new Paint(1);
        this.v = paint;
        paint.setColor(-65536);
        this.i = new Rect();
    }

    public final ValueAnimator b(float f, float f2, long j) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        valueAnimatorOfFloat.addUpdateListener(new cot(this, 8));
        valueAnimatorOfFloat.addListener(new hse(this, f));
        valueAnimatorOfFloat.addListener(new hsf(this, f));
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        return valueAnimatorOfFloat;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int i = this.p;
        if (i != 0) {
            this.a.setStrokeWidth(i);
            this.t.setStrokeWidth(this.p);
            this.u.setStrokeWidth(this.p);
            this.b.setStrokeWidth(this.p);
            this.v.setStrokeWidth(this.p);
        }
        int i2 = this.r;
        if (i2 == 0) {
            throw null;
        }
        if (i2 == 1) {
            return;
        }
        if (this.q == null) {
            pmg pmgVar = this.s;
            Paint paint = this.t;
            Paint paint2 = this.u;
            int i3 = ((CatcherView) pmgVar.c).r;
            if (i3 == 0) {
                throw null;
            }
            if (i3 != 1) {
                if (i3 == 6) {
                    RectF rectF = (RectF) pmgVar.a;
                    canvas.scale(0.0f, 0.0f, rectF.left + ((rectF.right - rectF.left) / 2.0f), rectF.top + ((rectF.bottom - rectF.top) / 2.0f));
                    canvas.drawRoundRect(rectF, 30.0f, 30.0f, paint);
                }
                if (((CatcherView) pmgVar.c).r == 2) {
                    RectF rectF2 = (RectF) pmgVar.a;
                    canvas.scale(0.0f, 0.0f, rectF2.left + ((rectF2.right - rectF2.left) / 2.0f), rectF2.top + ((rectF2.bottom - rectF2.top) / 2.0f));
                    canvas.drawRoundRect(rectF2, 30.0f, 30.0f, paint2);
                    return;
                }
                return;
            }
            return;
        }
        Path path = this.d;
        path.reset();
        Rect rect = this.i;
        if (rect.right - rect.left > 0 && rect.bottom - rect.top > 0) {
            canvas.drawRect(rect, this.v);
        }
        if (this.r == 6) {
            this.f.getSegment(0.0f, this.m * this.l, path, true);
            canvas.drawRoundRect(this.j, 30.0f, 30.0f, this.a);
            canvas.drawPath(path, this.b);
        }
        if (this.r == 2) {
            this.f.getSegment(0.0f, this.m * this.l, path, true);
            RectF rectF3 = new RectF();
            path.computeBounds(rectF3, false);
            float f = this.n;
            canvas.scale(f, f, rectF3.left + ((rectF3.right - rectF3.left) / 2.0f), rectF3.top + ((rectF3.bottom - rectF3.top) / 2.0f));
            canvas.drawPath(path, this.b);
        }
        if (this.r == 3) {
            this.f.getSegment(0.0f, 0.0f, path, true);
            canvas.drawPath(path, this.b);
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        Paint paint = this.a;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setAlpha(76);
        paint.setStrokeWidth(8.0f);
        Paint paint2 = this.t;
        paint2.setColor(-1);
        paint2.setStrokeWidth(8.0f);
        paint2.setStyle(Paint.Style.STROKE);
        Paint paint3 = this.u;
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(8.0f);
        paint3.setColor(this.g.getColor(R.color.gesture_confirm_state_color));
        Paint paint4 = this.b;
        paint4.setStyle(Paint.Style.STROKE);
        paint4.setStrokeWidth(8.0f);
        paint4.setColor(-1);
        Paint paint5 = this.v;
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setStrokeWidth(8.0f);
    }
}
