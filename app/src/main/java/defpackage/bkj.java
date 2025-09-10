package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bkj implements bku {
    public Canvas a = bkk.a;
    private Rect b;
    private Rect c;

    public static final Region.Op l() {
        return a.p(1, 0) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT;
    }

    @Override // defpackage.bku
    public final void a(float[] fArr) {
        if (byi.Z(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        bko.n(matrix, fArr);
        this.a.concat(matrix);
    }

    @Override // defpackage.bku
    public final void b() {
        blb.j(this.a, false);
    }

    @Override // defpackage.bku
    public final void c() {
        blb.j(this.a, true);
    }

    @Override // defpackage.bku
    public final void d() {
        this.a.restore();
    }

    @Override // defpackage.bku
    public final void e(float f) {
        this.a.rotate(f);
    }

    @Override // defpackage.bku
    public final void f() {
        this.a.save();
    }

    @Override // defpackage.bku
    public final void g(float f, float f2) {
        this.a.scale(f, f2);
    }

    @Override // defpackage.bku
    public final void h(float f, float f2) {
        this.a.translate(f, f2);
    }

    @Override // defpackage.bku
    public final void i(bkn bknVar) {
        this.a.clipPath(bknVar.a, l());
    }

    @Override // defpackage.bku
    public final void j(float f, float f2, float f3, float f4) {
        this.a.clipRect(f, f2, f3, f4, l());
    }

    @Override // defpackage.bku
    public final /* synthetic */ void k(bkg bkgVar) {
        blb.m(this, bkgVar);
    }

    @Override // defpackage.bku
    public final void m(long j, float f, fnd fndVar) {
        this.a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)), f, (Paint) fndVar.d);
    }

    @Override // defpackage.bku
    public final void n(long j, long j2, fnd fndVar) {
        int i = (int) (4294967295L & j);
        this.a.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), (Paint) fndVar.d);
    }

    @Override // defpackage.bku
    public final void o(float f, float f2, float f3, float f4, fnd fndVar) {
        this.a.drawRect(f, f2, f3, f4, (Paint) fndVar.d);
    }

    @Override // defpackage.bku
    public final void p(float f, float f2, float f3, float f4, float f5, float f6, fnd fndVar) {
        this.a.drawRoundRect(f, f2, f3, f4, f5, f6, (Paint) fndVar.d);
    }

    @Override // defpackage.bku
    public final void q(bkg bkgVar, fnd fndVar) {
        float f = bkgVar.e;
        this.a.saveLayer(bkgVar.b, bkgVar.c, bkgVar.d, f, (Paint) fndVar.d, 31);
    }

    @Override // defpackage.bku
    public final void r(float f, float f2, float f3, float f4, float f5, float f6, fnd fndVar) {
        this.a.drawArc(f, f2, f3, f4, f5, f6, false, (Paint) fndVar.d);
    }

    @Override // defpackage.bku
    public final void s(bkn bknVar, fnd fndVar) {
        boolean z = bknVar instanceof bkn;
        Canvas canvas = this.a;
        if (!z) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(bknVar.a, (Paint) fndVar.d);
    }

    @Override // defpackage.bku
    public final void t(bkl bklVar, long j, long j2, fnd fndVar) {
        if (this.b == null) {
            this.b = new Rect();
            this.c = new Rect();
        }
        Canvas canvas = this.a;
        Bitmap bitmapO = bko.o(bklVar);
        Rect rect = this.b;
        rect.getClass();
        rect.left = chy.a(0L);
        rect.top = chy.b(0L);
        rect.right = chy.a(0L) + ((int) (j >> 32));
        rect.bottom = chy.b(0L) + ((int) (j & 4294967295L));
        Rect rect2 = this.c;
        rect2.getClass();
        rect2.left = chy.a(0L);
        rect2.top = chy.b(0L);
        rect2.right = chy.a(0L) + ((int) (j2 >> 32));
        rect2.bottom = chy.b(0L) + ((int) (j2 & 4294967295L));
        canvas.drawBitmap(bitmapO, rect, rect2, (Paint) fndVar.d);
    }
}
