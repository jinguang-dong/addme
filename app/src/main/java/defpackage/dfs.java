package defpackage;

import android.graphics.Paint;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dfs {
    final RectF a = new RectF();
    public final Paint b;
    final Paint c;
    public final Paint d;
    public float e;
    public float f;
    public float g;
    float h;
    int[] i;
    int j;
    float k;
    float l;
    float m;
    final float n;
    float o;
    int p;
    int q;

    public dfs() {
        Paint paint = new Paint();
        this.b = paint;
        Paint paint2 = new Paint();
        this.c = paint2;
        Paint paint3 = new Paint();
        this.d = paint3;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 5.0f;
        this.n = 1.0f;
        this.p = 255;
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint3.setColor(0);
    }

    public final int a() {
        return (this.j + 1) % this.i.length;
    }

    final int b() {
        return this.i[this.j];
    }

    final void c() {
        this.k = 0.0f;
        this.l = 0.0f;
        this.m = 0.0f;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
    }

    public final void d(int i) {
        this.j = i;
        this.q = this.i[i];
    }

    public final void e(int[] iArr) {
        this.i = iArr;
        d(0);
    }

    public final void f() {
        this.k = this.e;
        this.l = this.f;
        this.m = this.g;
    }
}
