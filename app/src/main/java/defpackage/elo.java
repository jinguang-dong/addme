package defpackage;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class elo {
    private final efh a;
    public final Object b;
    public Object c;
    public final Interpolator d;
    public final Interpolator e;
    public final Interpolator f;
    public final float g;
    public Float h;
    public float i;
    public float j;
    public int k;
    public int l;
    public PointF m;
    public PointF n;
    private float o;
    private float p;

    public elo(efh efhVar, Object obj, Object obj2, Interpolator interpolator, float f, Float f2) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.l = 784923401;
        this.o = Float.MIN_VALUE;
        this.p = Float.MIN_VALUE;
        this.m = null;
        this.n = null;
        this.a = efhVar;
        this.b = obj;
        this.c = obj2;
        this.d = interpolator;
        this.e = null;
        this.f = null;
        this.g = f;
        this.h = f2;
    }

    public final float b() {
        efh efhVar = this.a;
        if (efhVar == null) {
            return 1.0f;
        }
        float f = this.p;
        if (f != Float.MIN_VALUE) {
            return f;
        }
        if (this.h == null) {
            this.p = 1.0f;
            return 1.0f;
        }
        float fC = c() + ((this.h.floatValue() - this.g) / efhVar.b());
        this.p = fC;
        return fC;
    }

    public final float c() {
        efh efhVar = this.a;
        if (efhVar == null) {
            return 0.0f;
        }
        float f = this.o;
        if (f != Float.MIN_VALUE) {
            return f;
        }
        float fB = (this.g - efhVar.h) / efhVar.b();
        this.o = fB;
        return fB;
    }

    public final boolean d(float f) {
        return f >= c() && f < b();
    }

    public final boolean e() {
        return this.d == null && this.e == null && this.f == null;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.b);
        String strValueOf2 = String.valueOf(this.c);
        Interpolator interpolator = this.d;
        return "Keyframe{startValue=" + strValueOf + ", endValue=" + strValueOf2 + ", startFrame=" + this.g + ", endFrame=" + this.h + ", interpolator=" + String.valueOf(interpolator) + "}";
    }

    public elo(efh efhVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, float f) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.l = 784923401;
        this.o = Float.MIN_VALUE;
        this.p = Float.MIN_VALUE;
        this.m = null;
        this.n = null;
        this.a = efhVar;
        this.b = obj;
        this.c = obj2;
        this.d = null;
        this.e = interpolator;
        this.f = interpolator2;
        this.g = f;
        this.h = null;
    }

    protected elo(efh efhVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f, Float f2) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.l = 784923401;
        this.o = Float.MIN_VALUE;
        this.p = Float.MIN_VALUE;
        this.m = null;
        this.n = null;
        this.a = efhVar;
        this.b = obj;
        this.c = obj2;
        this.d = interpolator;
        this.e = interpolator2;
        this.f = interpolator3;
        this.g = f;
        this.h = f2;
    }

    public elo(Object obj) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.l = 784923401;
        this.o = Float.MIN_VALUE;
        this.p = Float.MIN_VALUE;
        this.m = null;
        this.n = null;
        this.a = null;
        this.b = obj;
        this.c = obj;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = Float.MIN_VALUE;
        this.h = Float.valueOf(Float.MAX_VALUE);
    }

    public elo(Object obj, Object obj2) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.l = 784923401;
        this.o = Float.MIN_VALUE;
        this.p = Float.MIN_VALUE;
        this.m = null;
        this.n = null;
        this.a = null;
        this.b = obj;
        this.c = obj2;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = Float.MIN_VALUE;
        this.h = Float.valueOf(Float.MAX_VALUE);
    }
}
