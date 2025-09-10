package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rml extends rmp {
    public static final /* synthetic */ int h = 0;
    private static final ctm q = new rmk();
    public final rms a;
    public final rmq b;
    public float c;
    public ValueAnimator d;
    public TimeInterpolator e;
    public TimeInterpolator f;
    public TimeInterpolator g;
    private final ctp r;
    private final cto s;
    private boolean t;
    private final ValueAnimator u;

    public rml(Context context, rlx rlxVar, rms rmsVar) {
        super(context, rlxVar);
        this.t = false;
        this.a = rmsVar;
        rmq rmqVar = new rmq();
        this.b = rmqVar;
        rmqVar.h = true;
        ctp ctpVar = new ctp();
        this.r = ctpVar;
        ctpVar.c(1.0f);
        ctpVar.e(50.0f);
        cto ctoVar = new cto(this, q);
        this.s = ctoVar;
        ctoVar.s = ctpVar;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.u = valueAnimator;
        valueAnimator.setDuration(1000L);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(new rhu(this, rlxVar, 2));
        if (rlxVar.c(true) && rlxVar.m != 0) {
            valueAnimator.start();
        }
        i(1.0f);
    }

    public final float a(int i) {
        float f = i;
        return (f < 1000.0f || f > 9000.0f) ? 0.0f : 1.0f;
    }

    public final float b() {
        return this.b.b;
    }

    public final void c(float f) {
        this.b.e = f;
        invalidateSelf();
    }

    public final void d(float f) {
        this.b.b = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.o)) {
            canvas.save();
            rms rmsVar = this.a;
            rmsVar.h(canvas, getBounds(), f(), k(), j());
            rmq rmqVar = this.b;
            rmqVar.f = g();
            Paint paint = this.m;
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            rlx rlxVar = this.j;
            rmqVar.c = rlxVar.e[0];
            int iC = rlxVar.i;
            if (iC > 0) {
                if (!(rmsVar instanceof rmv)) {
                    iC = (int) ((iC * clc.C(b(), 0.0f, 0.01f)) / 0.01f);
                }
                rmsVar.f(canvas, paint, b(), 1.0f, rlxVar.f, this.n, iC);
            } else {
                rmsVar.f(canvas, paint, 0.0f, 1.0f, rlxVar.f, this.n, 0);
            }
            rmsVar.e(canvas, paint, rmqVar, this.n);
            rmsVar.d(canvas, paint, rlxVar.e[0], this.n);
            canvas.restore();
        }
    }

    @Override // defpackage.rmp
    public final boolean e(boolean z, boolean z2, boolean z3) {
        Context context = this.i;
        boolean zE = super.e(z, z2, z3);
        float fN = qsy.n(context.getContentResolver());
        if (fN == 0.0f) {
            this.t = true;
            return zE;
        }
        this.t = false;
        this.r.e(50.0f / fN);
        return zE;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.a();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.b();
    }

    @Override // defpackage.rmp, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.s.n();
        d(getLevel() / 10000.0f);
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int i) {
        float f = i;
        if (!this.t) {
            cto ctoVar = this.s;
            ctoVar.l(b() * 10000.0f);
            ctoVar.m(f);
            return true;
        }
        float fA = a(i);
        this.s.n();
        d(f / 10000.0f);
        c(fA);
        return true;
    }
}
