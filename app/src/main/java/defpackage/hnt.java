package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hnt implements hns {
    private final ShapeDrawable a;
    private float b;

    public hnt(ShapeDrawable shapeDrawable) {
        this.a = shapeDrawable;
    }

    @Override // defpackage.hns
    public final void a(Canvas canvas) {
        float f = this.b;
        if (f > 0.0f) {
            hgc.c(canvas, this.a, true, f, 0.0f, -1);
        }
    }

    @Override // defpackage.hns
    public final void b(int i, int i2) {
        this.a.setBounds(0, 0, i, i2);
    }

    @Override // defpackage.hns
    public final void c(float f) {
        a.I(f > 0.0f);
        this.b = f;
    }

    @Override // defpackage.hns
    public final void d(float f) {
        this.a.setAlpha((int) (f * 255.0f));
    }
}
