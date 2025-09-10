package com.google.android.apps.camera.ui.shutterbutton;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import defpackage.cot;
import defpackage.fdi;
import defpackage.gzo;
import defpackage.mxj;
import defpackage.ndq;
import defpackage.ndr;
import defpackage.nhi;
import defpackage.ojl;
import defpackage.rlx;
import defpackage.rmj;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ShutterButtonProgressOverlay extends FrameLayout {
    private int A;
    private AnimatorSet B;
    public int a;
    public float b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public final boolean g;
    public mxj h;
    public boolean i;
    public boolean j;
    public Optional k;
    public AnimatorSet l;
    public ValueAnimator m;
    public CircularProgressIndicator n;
    public int o;
    private int p;
    private final Paint q;
    private final Paint r;
    private final Interpolator s;
    private final Interpolator t;
    private final int u;
    private float v;
    private int w;
    private int x;
    private int y;
    private final RectF z;

    public ShutterButtonProgressOverlay(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        this.o = 1;
        this.c = 0;
        this.w = 0;
        this.z = new RectF();
        this.A = 20;
        this.f = true;
        this.h = mxj.PHONE_LAYOUT;
        this.i = true;
        this.j = false;
        this.k = Optional.empty();
        this.l = null;
        this.B = null;
        this.m = null;
        this.n = null;
        setVisibility(4);
        boolean zI = i();
        this.g = zI;
        this.s = new LinearInterpolator();
        this.t = AnimationUtils.loadInterpolator(getContext(), R.interpolator.fast_out_slow_in);
        Paint paint = new Paint();
        this.q = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setAlpha(51);
        Paint paint2 = new Paint(paint);
        this.r = paint2;
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(-1);
        this.u = b();
        this.f = true;
        this.v = a();
        if (zI) {
            c(context);
            return;
        }
        this.p = getResources().getDimensionPixelSize(com.google.ar.core.R.dimen.pie_progress_radius_max);
        this.d = getResources().getDimensionPixelSize(com.google.ar.core.R.dimen.pie_progress_radius);
        this.e = getResources().getDimensionPixelSize(com.google.ar.core.R.dimen.pie_progress_width);
        paint2.setAlpha(255);
    }

    private final void j(int i, long j, boolean z) {
        CircularProgressIndicator circularProgressIndicator;
        this.o = 4;
        if (j <= 0 && !z) {
            g((int) ((i / 100.0f) * 360.0f));
            invalidate();
            return;
        }
        ValueAnimator valueAnimator = this.m;
        boolean z2 = valueAnimator != null && valueAnimator.isRunning();
        if (i >= 100 || z2) {
            return;
        }
        boolean z3 = j <= 0 || j >= 3000;
        if (z && z3) {
            j = 3000;
        }
        int i2 = true != z ? 0 : -1;
        ValueAnimator valueAnimator2 = this.m;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.m.cancel();
        }
        if (i2 == -1 && (circularProgressIndicator = this.n) != null) {
            circularProgressIndicator.setIndeterminate(true);
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 360);
        this.m = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(j);
        this.m.setInterpolator(this.t);
        this.m.addUpdateListener(new nhi(this, 1));
        this.m.setRepeatCount(i2);
        this.m.start();
    }

    protected float a() {
        return (this.g && this.h == mxj.TABLET_LAYOUT) ? 0.861f : 1.0f;
    }

    protected int b() {
        return ojl.aP(this);
    }

    public final void c(Context context) throws Resources.NotFoundException {
        this.v = a();
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.google.ar.core.R.dimen.freeway_shutter_button_radius);
        float f = (dimensionPixelSize + dimensionPixelSize) * this.v;
        this.e = (int) (getResources().getDimensionPixelSize(com.google.ar.core.R.dimen.freeway_progress_ring_stroke_width) * this.v);
        if (this.n == null) {
            this.n = new CircularProgressIndicator(context);
        }
        CircularProgressIndicator circularProgressIndicator = this.n;
        int[] iArr = {-1};
        rlx rlxVar = circularProgressIndicator.a;
        if (!Arrays.equals(rlxVar.e, iArr)) {
            rlxVar.e = iArr;
            circularProgressIndicator.getIndeterminateDrawable().b.b();
            circularProgressIndicator.invalidate();
        }
        CircularProgressIndicator circularProgressIndicator2 = this.n;
        int i = circularProgressIndicator2.a.a;
        int iMax = Math.max((int) f, i + i);
        rmj rmjVar = (rmj) circularProgressIndicator2.a;
        if (rmjVar.p != iMax) {
            rmjVar.p = iMax;
            rmjVar.b();
            circularProgressIndicator2.requestLayout();
            circularProgressIndicator2.invalidate();
        }
        CircularProgressIndicator circularProgressIndicator3 = this.n;
        rmj rmjVar2 = (rmj) circularProgressIndicator3.a;
        if (rmjVar2.q != 0) {
            rmjVar2.q = 0;
            circularProgressIndicator3.invalidate();
        }
        CircularProgressIndicator circularProgressIndicator4 = this.n;
        int color = context.getColor(com.google.ar.core.R.color.freeway_shutter_background_on_black);
        rlx rlxVar2 = circularProgressIndicator4.a;
        if (rlxVar2.f != color) {
            rlxVar2.f = color;
            circularProgressIndicator4.invalidate();
        }
        this.n.h(0);
        CircularProgressIndicator circularProgressIndicator5 = this.n;
        rlx rlxVar3 = circularProgressIndicator5.a;
        if (rlxVar3.i != 0) {
            rlxVar3.i = 0;
            rlxVar3.b();
            circularProgressIndicator5.invalidate();
        }
        this.n.setVisibility(0);
        this.n.setMin(0);
        this.n.setMax(360);
        CircularProgressIndicator circularProgressIndicator6 = this.n;
        circularProgressIndicator6.a.h = 0;
        circularProgressIndicator6.invalidate();
        CircularProgressIndicator circularProgressIndicator7 = this.n;
        circularProgressIndicator7.a.g = 0;
        circularProgressIndicator7.invalidate();
        if (this.n.getParent() == null) {
            addView(this.n, new FrameLayout.LayoutParams(-1, -1, 17));
        }
    }

    public final void d() {
        AnimatorSet animatorSet = this.l;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.l.cancel();
        }
        AnimatorSet animatorSet2 = this.B;
        if (animatorSet2 == null || !animatorSet2.isRunning()) {
            ArrayList arrayList = new ArrayList(2);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.e, 0.0f);
            valueAnimatorOfFloat.setDuration(133L);
            Interpolator interpolator = this.s;
            valueAnimatorOfFloat.setInterpolator(interpolator);
            byte[] bArr = null;
            valueAnimatorOfFloat.addUpdateListener(new cot(this, 16, bArr));
            arrayList.add(valueAnimatorOfFloat);
            if (this.n != null) {
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                valueAnimatorOfFloat2.setDuration(133L);
                valueAnimatorOfFloat2.setInterpolator(interpolator);
                valueAnimatorOfFloat2.addUpdateListener(new cot(this, 17, bArr));
                arrayList.add(valueAnimatorOfFloat2);
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.B = animatorSet3;
            animatorSet3.playTogether(arrayList);
            this.B.addListener(new ndr(this));
            this.B.start();
        }
    }

    public final void e(int i, long j, boolean z) {
        f(i, j, z, false, false, Optional.empty(), Optional.empty());
    }

    public final void f(int i, long j, boolean z, boolean z2, boolean z3, Optional optional, Optional optional2) {
        this.r.setColor(z2 ? this.u : -1);
        int iMin = Math.min(100, Math.max(i, 0));
        this.k = optional;
        this.j = z3;
        this.A = ((Integer) optional2.orElse(20)).intValue();
        if (iMin != 0) {
            j(iMin, j, z);
            if (iMin == 100) {
                ValueAnimator valueAnimator = this.m;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.m.cancel();
                }
                CircularProgressIndicator circularProgressIndicator = this.n;
                if (circularProgressIndicator != null) {
                    circularProgressIndicator.g(360);
                }
                d();
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.B;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.B.cancel();
        }
        if (this.f) {
            g(0);
            this.w = 0;
            this.f = false;
            this.i = true;
            AnimatorSet animatorSet2 = this.B;
            if (animatorSet2 != null && animatorSet2.isRunning()) {
                this.B.cancel();
            }
            AnimatorSet animatorSet3 = this.l;
            if (animatorSet3 == null || !animatorSet3.isRunning()) {
                ArrayList arrayList = new ArrayList(3);
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.p, this.d);
                valueAnimatorOfInt.setDuration(167L);
                Interpolator interpolator = this.t;
                valueAnimatorOfInt.setInterpolator(interpolator);
                byte[] bArr = null;
                valueAnimatorOfInt.addUpdateListener(new cot(this, 18, bArr));
                arrayList.add(valueAnimatorOfInt);
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, this.e);
                valueAnimatorOfFloat.setDuration(167L);
                valueAnimatorOfFloat.setInterpolator(interpolator);
                valueAnimatorOfFloat.addUpdateListener(new cot(this, 19, bArr));
                arrayList.add(valueAnimatorOfFloat);
                CircularProgressIndicator circularProgressIndicator2 = this.n;
                if (circularProgressIndicator2 != null) {
                    circularProgressIndicator2.setAlpha(0.0f);
                    this.n.setIndeterminate(false);
                    this.n.g(0);
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat2.setDuration(167L);
                    valueAnimatorOfFloat2.setInterpolator(interpolator);
                    valueAnimatorOfFloat2.addUpdateListener(new cot(this, 20, bArr));
                    arrayList.add(valueAnimatorOfFloat2);
                }
                AnimatorSet animatorSet4 = new AnimatorSet();
                this.l = animatorSet4;
                animatorSet4.playTogether(arrayList);
                this.l.addListener(new ndq(this));
                this.l.start();
            }
            if (z || z3) {
                j(0, j, z);
            }
        }
    }

    public final void g(int i) {
        this.c = i;
        CircularProgressIndicator circularProgressIndicator = this.n;
        if (circularProgressIndicator != null) {
            circularProgressIndicator.g(i);
        }
    }

    public final void h(float f) {
        this.b = f;
        this.q.setStrokeWidth(f);
        CircularProgressIndicator circularProgressIndicator = this.n;
        if (circularProgressIndicator != null) {
            circularProgressIndicator.h((int) this.b);
        }
    }

    protected boolean i() {
        Object context = getContext();
        return (context instanceof fdi) && ((fdi) context).b().p(gzo.bw);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.n == null && this.o != 1) {
            if (this.i) {
                canvas.drawCircle(this.x, this.y, this.a * this.v, this.q);
            }
            int i = this.o;
            if (i == 4 || i == 3) {
                this.q.setStrokeWidth(this.b);
                Paint paint = this.r;
                paint.setStrokeWidth(this.b);
                RectF rectF = this.z;
                float f = this.x;
                float f2 = this.a * this.v;
                float f3 = this.y;
                rectF.set(f - f2, f3 - f2, f + f2, f3 + f2);
                int i2 = this.w - 90;
                canvas.drawArc(rectF, i2 - (r1 / 2), this.A, false, paint);
                this.w = this.c;
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            this.x = (i3 - i) / 2;
            this.y = (i4 - i2) / 2;
        }
    }
}
