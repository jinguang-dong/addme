package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pbu {
    public RectF a;
    private int b;
    private pao c;
    private boolean d;
    private Matrix e;
    private Rect f;
    private pas g;

    private final void h() {
        int iWidth;
        int iWidth2;
        Rect rect = this.f;
        if (rect == null || this.g == null || this.c == null || this.a == null) {
            return;
        }
        Matrix matrix = new Matrix();
        this.e = matrix;
        matrix.postTranslate(-rect.centerX(), -rect.centerY());
        if (rect.width() / rect.height() > this.g.a()) {
            float fHeight = rect.height() * this.g.a();
            iWidth2 = rect.height();
            iWidth = (int) fHeight;
        } else {
            iWidth = rect.width();
            iWidth2 = (int) (rect.width() / this.g.a());
        }
        this.e.postRotate(this.b - this.c.a());
        pao paoVar = this.c;
        if (paoVar == pao.CLOCKWISE_0 || paoVar == pao.c) {
            this.e.postScale(true != this.d ? 1.0f : -1.0f, 1.0f);
        } else {
            this.e.postScale(1.0f, true != this.d ? 1.0f : -1.0f);
        }
        RectF rectF = new RectF(0.0f, 0.0f, iWidth, iWidth2);
        this.e.mapRect(rectF);
        this.e.postScale(this.a.width() / rectF.width(), this.a.height() / rectF.height());
        this.e.postTranslate(this.a.width() / 2.0f, this.a.height() / 2.0f);
    }

    public final Matrix a() {
        Matrix matrix = this.e;
        matrix.getClass();
        return matrix;
    }

    public final void b(pas pasVar) {
        if (!pasVar.equals(this.g) || this.e == null) {
            String.valueOf(pasVar);
            this.g = pasVar;
            h();
        }
    }

    public final void c(boolean z) {
        this.d = z;
        h();
    }

    public final void d(int i) {
        if (this.b != i || this.e == null) {
            this.b = i;
            h();
        }
    }

    public final void e(int i, int i2, int i3, int i4, pao paoVar) {
        this.a = new RectF(i, i2, i3, i4);
        this.c = paoVar;
        h();
        this.f = null;
        h();
    }

    public final boolean f() {
        return this.e != null;
    }

    public final void g(Rect rect) {
        Rect rect2 = this.f;
        if (rect2 == null || !rect.equals(rect2) || this.e == null) {
            rect.toString();
            this.f = rect;
            h();
        }
    }
}
