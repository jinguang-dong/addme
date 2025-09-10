package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Handler;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hks {
    public final nmu a;
    public final nmu b;
    public final nmu c;
    public final Handler d;
    public final int e;
    public float f;
    public int g;
    public boolean h;
    public ValueAnimator i;
    public ValueAnimator j;
    public boolean k;
    public float l;
    public float m;
    public float n;
    public float o;
    public final Runnable p;
    private Matrix q;

    public hks(pnu pnuVar, Matrix matrix, int i) {
        new eia("ring_object 4", "main", "Rectangle Path 1");
        new eia("ring_object 4", "temp", "Rectangle Path 1");
        new eia("ring_object 4", "temp", "Stroke 1");
        new eia("star_2");
        this.a = new nmu(4);
        this.b = new nmu(4);
        this.c = new nmu(4);
        this.k = false;
        this.l = 0.0f;
        this.m = 0.0f;
        this.n = 0.0f;
        this.o = 0.0f;
        int i2 = 3;
        this.p = new hjp(this, i2);
        this.e = i;
        this.d = new Handler();
        c(pnuVar, matrix);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.3f, 1.0f);
        this.i = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(new cvn());
        this.i.setDuration(250L);
        this.i.addUpdateListener(new fve(this, i2));
        this.i.addListener(new hkq(this));
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(204, 0);
        this.j = valueAnimatorOfInt;
        valueAnimatorOfInt.setInterpolator(new cvn());
        this.j.setDuration(500L);
        this.j.addUpdateListener(new fve(this, 4));
        this.j.addListener(new hkr(this));
    }

    public final void a() {
        if (this.i.isStarted()) {
            return;
        }
        this.f = this.c.a;
        this.g = 204;
        this.i.start();
        this.h = true;
        this.k = false;
    }

    public final void b(boolean z) {
        long j;
        if (this.h) {
            Handler handler = this.d;
            Runnable runnable = this.p;
            handler.removeCallbacks(runnable);
            if (z) {
                this.j.setDuration(500L);
                j = 0;
            } else {
                j = this.e;
            }
            handler.postDelayed(runnable, j);
        }
    }

    public final void c(pnu pnuVar, Matrix matrix) {
        RectF rectF = new RectF(pnuVar.c);
        if (matrix != null) {
            this.q = matrix;
        }
        Matrix matrix2 = this.q;
        if (matrix2 != null) {
            matrix2.mapRect(rectF);
        }
        this.n = Math.abs(rectF.centerX() - this.l);
        this.o = Math.abs(rectF.centerY() - this.m);
        this.l = rectF.centerX();
        this.m = rectF.centerY();
        this.a.a(this.l);
        this.b.a(this.m);
        float fMax = Math.max(rectF.width(), rectF.height()) * 0.5f;
        nmu nmuVar = this.c;
        nmuVar.a(fMax);
        float f = nmuVar.a;
        float f2 = 0.5f * fMax;
        if (fMax < f - f2 || fMax > f + f2) {
            if (!this.h) {
                a();
                return;
            }
            Handler handler = this.d;
            Runnable runnable = this.p;
            handler.removeCallbacks(runnable);
            handler.postDelayed(runnable, this.e);
        }
    }

    public final String toString() {
        return String.format(Locale.getDefault(), "ViewfinderFace: Center: %f,%f / Radius: %f", Float.valueOf(this.a.a), Float.valueOf(this.b.a), Float.valueOf(this.c.a));
    }
}
