package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hnr implements hnq {
    private final GradientDrawable a;
    private final GradientDrawable b;
    private final GradientDrawable c;
    private final Set d;
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;
    private int j;
    private int k;
    private boolean l;
    private boolean m;

    public hnr() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        this.d = new HashSet();
        this.j = -1;
        this.a = gradientDrawable;
        this.b = gradientDrawable2;
        this.c = gradientDrawable3;
        gradientDrawable.setShape(1);
    }

    @Override // defpackage.hnq
    public final int a() {
        return this.j;
    }

    @Override // defpackage.hnq
    public final void b(Canvas canvas) {
        Canvas canvas2;
        float f = this.e;
        if (f > 0.0f) {
            hgc.c(canvas, this.a, true, f, this.f, this.j);
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
        }
        if (this.l) {
            hgc.c(canvas2, this.c, false, this.e + this.h, this.g, this.k);
        }
        if (this.m) {
            hgc.c(canvas2, this.b, false, this.e + this.i, this.g, this.k);
        }
    }

    @Override // defpackage.hnq
    public final void c(scn scnVar) {
        this.d.addAll(scnVar);
    }

    @Override // defpackage.hnq
    public final void d(scn scnVar) {
        this.d.removeAll(scnVar);
    }

    @Override // defpackage.hnq
    public final void e(int i) {
        if (this.d.contains(hnp.b)) {
            return;
        }
        this.k = i;
    }

    @Override // defpackage.hnq
    public final void f(float f, float f2) {
        if (this.d.contains(hnp.BOUNDARY_CORNER_RADIUS)) {
            return;
        }
        this.c.setCornerRadius(f);
        this.b.setCornerRadius(f2);
    }

    @Override // defpackage.hnq
    public final void g(float f, float f2) {
        if (this.d.contains(hnp.BOUNDARY_DIAMETER)) {
            return;
        }
        this.l = f > 0.0f;
        this.m = f2 > 0.0f;
        float f3 = this.e;
        this.h = f - f3;
        this.i = f2 - f3;
    }

    @Override // defpackage.hnq
    public final void h(float f) {
        if (this.d.contains(hnp.BOUNDARY_THICKNESS)) {
            return;
        }
        this.g = f;
        int i = (int) f;
        this.c.setStroke(i, this.k);
        this.b.setStroke(i, this.k);
    }

    @Override // defpackage.hnq
    public final void i(int i, int i2) {
        if (this.d.contains(hnp.BOUNDS)) {
            return;
        }
        this.a.setBounds(0, 0, i, i2);
        this.c.setBounds(0, 0, i, i2);
        this.b.setBounds(0, 0, i, i2);
    }

    @Override // defpackage.hnq
    public final void j(int i) {
        if (this.d.contains(hnp.COLOR)) {
            return;
        }
        this.j = i;
    }

    @Override // defpackage.hnq
    public final void k(float f) {
        if (this.d.contains(hnp.CORNER_RADIUS)) {
            return;
        }
        this.a.setCornerRadius(f);
    }

    @Override // defpackage.hnq
    public final void l(float f) {
        if (this.d.contains(hnp.h)) {
            return;
        }
        a.I(f > 0.0f);
        this.e = f;
    }

    @Override // defpackage.hnq
    public final void m(float f) {
        if (this.d.contains(hnp.OPACITY)) {
            return;
        }
        int i = (int) (f * 255.0f);
        this.a.setAlpha(i);
        this.c.setAlpha(i);
        this.b.setAlpha(i);
    }

    @Override // defpackage.hnq
    public final void n(float f) {
        if (this.d.contains(hnp.THICKNESS)) {
            return;
        }
        this.f = f;
        this.a.setStroke((int) f, this.j);
    }

    @Override // defpackage.hnq
    public final void o(int i) {
        if (this.d.contains(hnp.SHAPE)) {
            return;
        }
        this.a.setShape(i);
        this.c.setShape(i);
        this.b.setShape(i);
    }
}
