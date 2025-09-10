package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class myd {
    protected final cku c;
    protected final Context d;
    protected final pnq e;
    protected final Resources f;
    protected final nkw g;
    protected final RectF h;
    public final mxm i;
    public final Size j;
    public final Size k;
    public Size l;
    protected final boolean m;
    protected final hbj n;

    /* JADX WARN: Multi-variable type inference failed */
    public myd(mxt mxtVar, cku ckuVar, Context context, pnq pnqVar) {
        this.g = mxtVar.i;
        this.i = mxtVar.h;
        this.j = mxtVar.e;
        this.k = mxtVar.b;
        this.l = mxtVar.c;
        this.h = mxtVar.g;
        this.c = ckuVar;
        this.d = context;
        this.e = pnqVar;
        hbj hbjVarB = ((fdi) context).b();
        this.n = hbjVarB;
        this.f = context.getResources();
        this.m = hbjVarB.p(gzo.bv);
    }

    private final float a() {
        return gys.a(this.n).b;
    }

    private final RectF c(RectF rectF) {
        RectF rectF2 = new RectF();
        RectF rectF3 = this.h;
        if (!rectF3.isEmpty() && RectF.intersects(rectF3, rectF)) {
            rectF2.set(Math.max(rectF3.left, rectF.left), Math.max(rectF3.top, rectF.top), Math.min(rectF3.right, rectF.right), Math.min(rectF3.bottom, rectF.bottom));
        }
        return rectF2;
    }

    public abstract void A(View view);

    public abstract void B(View view);

    public abstract void C(View view);

    public abstract void D(View view);

    public abstract void E(View view);

    public abstract void F();

    public abstract void G(View view);

    public abstract void H(View view);

    public abstract void I(View view);

    public abstract void J(View view);

    public void K(View view) {
        if (this.m && view.getRotation() != 0.0f) {
            int id = view.getId();
            cku ckuVar = this.c;
            ckuVar.t(id, 0.0f);
            ckuVar.u(id, 0.0f);
            ckuVar.v(id, 0.0f);
        }
        C(view);
    }

    public abstract void L(int i);

    public abstract void M(View view);

    public abstract void N(View view);

    public abstract void O(View view);

    public abstract boolean P();

    protected final int R(RectF rectF) {
        RectF rectFC = c(rectF);
        if (rectFC.isEmpty() || rectFC.right >= rectF.left + (rectF.width() / 2.0f)) {
            return 0;
        }
        return (int) ((this.h.centerX() + a()) - rectF.left);
    }

    protected final int S(RectF rectF) {
        RectF rectFC = c(rectF);
        if (rectFC.isEmpty() || rectFC.left <= rectF.left + (rectF.width() / 2.0f)) {
            return 0;
        }
        return (int) (rectF.right - (this.h.centerX() - a()));
    }

    public final int T(float f) {
        if (this.k == null) {
            return 0;
        }
        return (int) (b(r0) * f);
    }

    protected final void U(int i, int i2, int i3, int i4) {
        cku ckuVar = this.c;
        ckuVar.j(i, 6, i2, 6, i3);
        ckuVar.j(i, 7, i2, 7, i4);
    }

    protected final void V(int i, int i2, int i3, int i4) {
        cku ckuVar = this.c;
        ckuVar.j(i, 3, i2, 3, i3);
        ckuVar.j(i, 4, i2, 4, i4);
    }

    protected final void W(int i, int i2, int i3, int i4, int i5) {
        cku ckuVar = this.c;
        ckuVar.k(i, i3);
        ckuVar.l(i, i2);
        ckuVar.j(i, 4, i4, 3, i5);
        U(i, i4, 0, 0);
    }

    protected final void X(int i, int i2, int i3, int i4, int i5) {
        cku ckuVar = this.c;
        ckuVar.k(i, i3);
        ckuVar.l(i, i2);
        ckuVar.j(i, 3, 0, 3, i5);
        ckuVar.j(i, 6, 0, 6, i4);
    }

    protected final void Y(int i, int i2, int i3, int i4, int i5) {
        U(i, 0, i2, i3);
        V(i, 0, i4, i5);
        cku ckuVar = this.c;
        ckuVar.k(i, 0);
        ckuVar.l(i, 0);
    }

    protected final boolean Z() {
        hbj hbjVar = this.n;
        boolean zP = hbjVar.p(gzo.bx);
        boolean zP2 = hbjVar.p(gzo.by);
        nkw nkwVar = this.g;
        if (nkwVar == nkw.VIDEO && !zP) {
            return true;
        }
        if (nkwVar == nkw.SLOW_MOTION) {
            if (!zP2) {
                return true;
            }
            zP2 = true;
        }
        return nkwVar == nkw.TIME_LAPSE && !zP2;
    }

    protected final boolean aa() {
        return ((Activity) this.d).isInMultiWindowMode();
    }

    protected int b(Size size) {
        return size.getHeight();
    }

    public Rect h(Size size, Size size2) {
        int height;
        int width;
        int height2;
        if (size.getWidth() / size.getHeight() < size2.getWidth() / size2.getHeight()) {
            width = size.getWidth();
            height = (int) ((size2.getHeight() / size2.getWidth()) * width);
        } else {
            height = size.getHeight();
            width = (int) ((size2.getWidth() / size2.getHeight()) * height);
        }
        int width2 = 0;
        if (size.getWidth() / size.getHeight() < size2.getWidth() / size2.getHeight()) {
            height2 = (int) ((size.getHeight() - height) / 2.0d);
        } else {
            width2 = (int) ((size.getWidth() - width) / 2.0d);
            height2 = 0;
        }
        return new Rect(width2, height2, width + width2, height + height2);
    }

    public abstract void o(View view);

    public abstract void p(View view);

    public abstract void q(View view);

    public void r(View view) {
        Size size = this.k;
        if (size == null) {
            return;
        }
        X(view.getId(), size.getWidth(), size.getHeight(), 0, 0);
    }

    public abstract void s(View view);

    public abstract void t(View view);

    public abstract void u(int i);

    public abstract void v(View view);

    public abstract void w(View view);

    public abstract void x(int i);

    public abstract void y(View view);

    public abstract void z(View view);

    public void n() {
    }
}
