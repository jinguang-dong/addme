package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fnd {
    public int a;
    public Object b;
    public Object c;
    public Object d;

    public fnd() {
        throw null;
    }

    public final fne a() {
        if (this.a == 0) {
            throw new IllegalStateException();
        }
        int i = this.a;
        Object obj = this.b;
        return new fne(i, (Optional) obj, (Optional) this.c, (Optional) this.d);
    }

    public final float b() {
        return ((Paint) this.d).getAlpha() / 255.0f;
    }

    public final float c() {
        return ((Paint) this.d).getStrokeMiter();
    }

    public final float d() {
        return ((Paint) this.d).getStrokeWidth();
    }

    public final int e() {
        return !((Paint) this.d).isFilterBitmap() ? 0 : 1;
    }

    public final int f() {
        int i;
        Paint.Cap strokeCap = ((Paint) this.d).getStrokeCap();
        if (strokeCap == null || (i = bkm.a[strokeCap.ordinal()]) == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    public final int g() {
        int i;
        Paint.Join strokeJoin = ((Paint) this.d).getStrokeJoin();
        if (strokeJoin == null || (i = bkm.b[strokeJoin.ordinal()]) == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    public final long h() {
        return bko.i(((Paint) this.d).getColor());
    }

    public final void i(float f) {
        ((Paint) this.d).setAlpha((int) Math.rint(f * 255.0f));
    }

    public final void j(int i) {
        if (a.p(this.a, i)) {
            return;
        }
        this.a = i;
        ((Paint) this.d).setBlendMode(bko.p(i));
    }

    public final void k(long j) {
        ((Paint) this.d).setColor(bko.h(j));
    }

    public final void l(bkw bkwVar) {
        this.b = bkwVar;
        ((Paint) this.d).setColorFilter(bkwVar != null ? bkwVar.b : null);
    }

    public final void m(int i) {
        ((Paint) this.d).setFilterBitmap(!a.p(i, 0));
    }

    public final void n(Shader shader) {
        this.c = shader;
        ((Paint) this.d).setShader(shader);
    }

    public final void o(int i) {
        Paint.Cap cap;
        Object obj = this.d;
        if (a.p(i, 2)) {
            cap = Paint.Cap.SQUARE;
        } else if (a.p(i, 1)) {
            cap = Paint.Cap.ROUND;
        } else {
            a.p(i, 0);
            cap = Paint.Cap.BUTT;
        }
        ((Paint) obj).setStrokeCap(cap);
    }

    public final void p(int i) {
        ((Paint) this.d).setStrokeJoin(a.p(i, 0) ? Paint.Join.MITER : a.p(i, 2) ? Paint.Join.BEVEL : a.p(i, 1) ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public final void q(float f) {
        ((Paint) this.d).setStrokeMiter(f);
    }

    public final void r(float f) {
        ((Paint) this.d).setStrokeWidth(f);
    }

    public final void s(int i) {
        ((Paint) this.d).setStyle(a.p(i, 1) ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public final void t() {
        ((Paint) this.d).setPathEffect(null);
    }

    public fnd(Paint paint) {
        this.d = paint;
        this.a = 3;
    }

    public fnd(byte[] bArr) {
        this.b = Optional.empty();
        this.c = Optional.empty();
        this.d = Optional.empty();
    }

    public fnd(char[] cArr) {
        this(new Paint(7));
    }
}
