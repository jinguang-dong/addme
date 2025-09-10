package defpackage;

import android.graphics.drawable.GradientDrawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hno implements hnn {
    private final GradientDrawable a;
    private final GradientDrawable b;
    private final GradientDrawable c;

    public hno() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        this.a = gradientDrawable;
        this.b = gradientDrawable2;
        this.c = gradientDrawable3;
        gradientDrawable.setShape(0);
    }

    @Override // defpackage.hnn
    public final void a(int i, int i2) {
        int i3 = (int) (i2 * 1.33f);
        this.a.setBounds(0, 0, i, i3);
        this.c.setBounds(0, 0, i, i3);
        this.b.setBounds(0, 0, i, i3);
    }

    @Override // defpackage.hnn
    public final void b(float f) {
        this.a.setStroke((int) f, -1);
    }

    @Override // defpackage.hnn
    public final void c(float f) {
        a.I(f > 0.0f);
    }

    @Override // defpackage.hnn
    public final void d(float f) {
        int i = (int) (f * 255.0f);
        this.a.setAlpha(i);
        this.c.setAlpha(i);
        this.b.setAlpha(i);
    }
}
