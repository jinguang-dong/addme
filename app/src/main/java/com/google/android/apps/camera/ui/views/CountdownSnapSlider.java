package com.google.android.apps.camera.ui.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.wear.ambient.AmbientMode;
import com.google.ar.core.R;
import defpackage.fdi;
import defpackage.glx;
import defpackage.gzo;
import defpackage.hz;
import defpackage.mth;
import defpackage.mtm;
import defpackage.mtq;
import defpackage.ojl;
import j$.util.Collection;
import j$.util.Comparator$CC;
import j$.util.Map;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class CountdownSnapSlider extends hz {
    public final PointF a;
    public Map b;
    public int c;
    public int d;
    public double e;
    public double f;
    public double g;
    public double h;
    public mth i;
    private final Paint j;
    private final Paint k;
    private final Paint l;
    private final Paint m;
    private int n;
    private final int o;
    private final int p;
    private final int q;
    private final int r;
    private final int s;
    private final int t;
    private final PointF u;
    private boolean v;

    public CountdownSnapSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private final double i(double d) {
        return Math.min(this.f, Math.max(this.e, d));
    }

    private final float j(Canvas canvas, float f, double d) {
        return k(canvas, f, d, false);
    }

    private final float k(Canvas canvas, float f, double d, boolean z) {
        Paint paint = this.k;
        paint.setAlpha((int) (d * 77.0d));
        if (!z) {
            paint.setStrokeWidth(getResources().getDimensionPixelSize(R.dimen.slider_tick_stroke_width));
            float f2 = f;
            for (int i = 0; i < 4; i++) {
                PointF pointF = this.a;
                canvas.drawLine(f2, pointF.y, f2, pointF.y - this.p, paint);
                f2 += this.q;
            }
            return f2;
        }
        paint.setStrokeWidth(getResources().getDimensionPixelSize(R.dimen.slider_line_stroke_width));
        int i2 = this.q;
        float f3 = this.a.y - this.p;
        int i3 = this.s;
        float f4 = this.r;
        float f5 = f - f4;
        float f6 = f + (i2 * 4);
        float f7 = f3 + i3;
        canvas.drawLine(f5, f7, (f6 - i2) + f4, f7, paint);
        return f6;
    }

    private final void l(Canvas canvas, float f, double d, int i) {
        Map map = this.b;
        Integer numValueOf = Integer.valueOf(i);
        boolean z = false;
        if (map.containsKey(numValueOf) && this.b.get(numValueOf) == mtq.INACTIVE) {
            z = true;
        }
        Paint paint = this.j;
        paint.setColor(z ? ojl.aI(this) : ojl.aO(this));
        paint.setAlpha((int) (d * (true != z ? 255 : 77)));
        PointF pointF = this.a;
        canvas.drawLine(f, pointF.y, f, pointF.y - this.o, paint);
    }

    public final double a(double d) {
        return (this.n * d) / d();
    }

    public final double b(double d) {
        double d2 = Double.MAX_VALUE;
        double d3 = d;
        for (int i = 0; i < this.c; i++) {
            double d4 = i;
            double dAbs = Math.abs(d - d4);
            if (this.b.get(Integer.valueOf(i)) == mtq.ENABLED && dAbs < d2) {
                d3 = d4;
                d2 = dAbs;
            }
        }
        return d3;
    }

    public final double c() {
        return b(this.h);
    }

    public final int d() {
        return this.c - 1;
    }

    public final void e(double d) {
        this.h = Math.min(d(), Math.max(0.0d, d));
        invalidate();
    }

    public final boolean f() {
        double d = this.h;
        return d % 1.0d == 0.0d && this.b.get(Integer.valueOf((int) d)) == mtq.ENABLED;
    }

    public final boolean g(int i) {
        Map map = this.b;
        Integer numValueOf = Integer.valueOf(i);
        return map.containsKey(numValueOf) && this.b.get(numValueOf) == mtq.ENABLED;
    }

    public final void h() {
        this.c = 4;
        setMax(d());
        HashMap map = new HashMap();
        for (int i = 0; i < 4; i++) {
            Integer numValueOf = Integer.valueOf(i);
            map.put(numValueOf, (mtq) Map.EL.getOrDefault(this.b, numValueOf, mtq.ENABLED));
        }
        this.b = map;
        this.f = ((Integer) Collection.EL.stream(map.keySet()).filter(new glx(this, 18)).max(Comparator$CC.naturalOrder()).orElse(Integer.valueOf(r1))).intValue();
        this.n = this.t * 3;
    }

    @Override // defpackage.hz, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected final synchronized void onDraw(Canvas canvas) {
        float fJ;
        int i;
        PointF pointF = this.a;
        double dA = pointF.x - a(this.h);
        Object obj = this.b.get(0);
        float f = (float) dA;
        mtq mtqVar = mtq.GONE;
        if (obj == mtqVar) {
            l(canvas, f, this.g, 0);
            fJ = j(canvas, f + this.q, this.g);
        } else {
            l(canvas, f, 1.0d, 0);
            fJ = j(canvas, f + this.q, 1.0d);
        }
        int i2 = 1;
        float fJ2 = fJ;
        while (true) {
            i = this.c - 1;
            if (i2 >= i) {
                break;
            }
            int i3 = i2 + 1;
            if (this.b.get(Integer.valueOf(i2)) != mtqVar) {
                l(canvas, fJ2, 1.0d, i2);
                fJ2 += this.q;
                if (i2 < this.c - 2 && this.b.get(Integer.valueOf(i3)) != mtqVar) {
                    fJ2 = j(canvas, fJ2, 1.0d);
                }
            }
            i2 = i3;
        }
        if (this.b.get(Integer.valueOf(i)) == mtqVar) {
            l(canvas, k(canvas, fJ2, 0.0d, true), 0.0d, this.c - 1);
        } else {
            l(canvas, k(canvas, fJ2, 1.0d, true), 1.0d, this.c - 1);
        }
        Resources resources = getResources();
        float dimensionPixelSize = this.v ? resources.getDimensionPixelSize(R.dimen.slider_center_progress_indicator_height_freeway) : resources.getDimensionPixelSize(R.dimen.slider_center_progress_indicator_height);
        if (!this.v) {
            canvas.drawLine(pointF.x, pointF.y, pointF.x, pointF.y - dimensionPixelSize, this.m);
        }
        float dimensionPixelSize2 = this.v ? resources.getDimensionPixelSize(R.dimen.slider_center_progress_indicator_offset_freeway) : 0;
        canvas.drawLine(pointF.x, pointF.y + dimensionPixelSize2, pointF.x, (pointF.y + dimensionPixelSize2) - dimensionPixelSize, this.l);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        this.e = 0.0d;
        h();
        this.g = 0.0d;
        setBackgroundColor(0);
        int dimensionPixelSize = this.v ? getResources().getDimensionPixelSize(R.dimen.slider_progress_indicator_stroke_width_freeway) : getResources().getDimensionPixelSize(R.dimen.slider_progress_indicator_stroke_width);
        Paint paint = this.m;
        float f = dimensionPixelSize;
        paint.setStrokeWidth(f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(getResources().getColor(R.color.progress_indicator_border_color, null));
        Paint paint2 = this.l;
        paint2.setStrokeWidth(f);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(ojl.aO(this));
        if (this.v) {
            paint2.setStrokeCap(Paint.Cap.ROUND);
        }
        Paint paint3 = this.j;
        paint3.setStrokeWidth(getResources().getDimensionPixelSize(R.dimen.slider_tick_stroke_width));
        paint3.setStyle(Paint.Style.FILL);
        paint3.setFlags(1);
        Paint paint4 = this.k;
        paint4.setColor(ojl.aI(this));
        paint4.setStyle(Paint.Style.FILL);
        paint4.setFlags(1);
        setEnabled(true);
        super.onFinishInflate();
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.a.set(getWidth() / 2.0f, (getHeight() / 2.0f) - this.d);
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            mth mthVar = this.i;
            if (mthVar != null) {
                mtm mtmVar = mthVar.d;
                for (AmbientMode.AmbientController ambientController : mtmVar.a) {
                }
                mthVar.a = mtmVar.k.c();
                mthVar.b = mtmVar.k.f();
                mthVar.c = mtmVar.k.h;
            }
            this.u.set(motionEvent.getX(), motionEvent.getY());
            invalidate();
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                float x = motionEvent.getX();
                PointF pointF = this.u;
                double dI = i(this.h - (((x - pointF.x) * d()) / this.n));
                this.h = dI;
                mth mthVar2 = this.i;
                if (mthVar2 != null) {
                    double dA = a(dI);
                    mtm mtmVar2 = mthVar2.d;
                    mtmVar2.j.n(dA);
                    boolean zF = mtmVar2.k.f();
                    CountdownSnapSlider countdownSnapSlider = mtmVar2.k;
                    double d = countdownSnapSlider.h;
                    double d2 = mthVar2.c;
                    double dC = countdownSnapSlider.c();
                    if ((Math.min(d2, d) < dC && Math.max(d2, d) > dC) || (!mthVar2.b && zF)) {
                        mtmVar2.j();
                    }
                    mthVar2.c = d;
                    mthVar2.b = zF;
                }
                invalidate();
                pointF.set(motionEvent.getX(), motionEvent.getY());
                return true;
            }
            if (actionMasked != 3) {
                return false;
            }
        }
        double dB = b(i(this.h));
        this.h = dB;
        mth mthVar3 = this.i;
        if (mthVar3 != null) {
            mtm mtmVar3 = mthVar3.d;
            mtmVar3.i();
            mtmVar3.j.n(mtmVar3.k.a(dB));
            if (mthVar3.a != dB) {
                mtmVar3.h(mtm.y((int) dB));
            }
            if (!mthVar3.b) {
                mtmVar3.j();
            }
        }
        setProgress((int) this.h);
        invalidate();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CountdownSnapSlider(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        this.a = new PointF();
        this.j = new Paint();
        this.k = new Paint();
        this.l = new Paint();
        this.m = new Paint();
        this.u = new PointF();
        this.v = false;
        if (context instanceof fdi) {
            this.v = ((fdi) context).b().p(gzo.bw);
        }
        this.b = new HashMap();
        Resources resources = getResources();
        this.o = resources.getDimensionPixelSize(R.dimen.slider_primary_tick_height);
        this.p = resources.getDimensionPixelSize(R.dimen.slider_secondary_tick_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.slider_tick_spacing);
        this.q = dimensionPixelSize;
        this.r = resources.getDimensionPixelSize(R.dimen.slider_line_spacing_offset);
        this.s = resources.getDimensionPixelSize(R.dimen.slider_line_top_padding);
        this.d = resources.getDimensionPixelSize(R.dimen.slider_y_offset_default);
        this.t = dimensionPixelSize * 5;
        this.h = 1.0d;
        setProgress(1);
    }
}
