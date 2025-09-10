package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.util.Pair;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rly extends rms {
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private int l;
    private float m;
    private boolean n;
    private float o;
    private final RectF p;
    private final Pair q;

    public rly(rmj rmjVar) {
        super(rmjVar);
        this.p = new RectF();
        this.q = new Pair(new rmr(), new rmr());
    }

    private final int j() {
        rmj rmjVar = (rmj) this.a;
        int i = rmjVar.p;
        int i2 = rmjVar.q;
        return i + i2 + i2;
    }

    private final void k(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3, float f3, float f4, boolean z) {
        float f5;
        Canvas canvas2;
        float f6 = f2 >= f ? f2 - f : (f2 + 1.0f) - f;
        float f7 = f % 1.0f;
        if (f7 < 0.0f) {
            f7 += 1.0f;
        }
        if (this.o < 1.0f) {
            float f8 = f7 + f6;
            if (f8 > 1.0f) {
                k(canvas, paint, f7, 1.0f, i, i2, 0, f3, f4, z);
                k(canvas, paint, 1.0f, f8, i, 0, i3, f3, f4, z);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.g / this.i);
        float f9 = (-0.99f) + f6;
        if (f9 >= 0.0f) {
            float f10 = ((f9 * degrees) / 180.0f) / 0.01f;
            f6 += f10;
            if (!z) {
                f7 -= f10 / 2.0f;
            }
        }
        float f11 = this.o;
        float fO = qsy.o(1.0f - f11, 1.0f, f7);
        float fO2 = qsy.o(0.0f, f11, f6);
        float degrees2 = (float) Math.toDegrees(i2 / this.i);
        float degrees3 = ((fO2 * 360.0f) - degrees2) - ((float) Math.toDegrees(i3 / this.i));
        if (degrees3 <= 0.0f) {
            return;
        }
        rmj rmjVar = (rmj) this.a;
        boolean z2 = false;
        if (rmjVar.c(this.n) && z && f3 > 0.0f) {
            z2 = true;
        }
        float f12 = (fO * 360.0f) + degrees2;
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(this.f);
        float f13 = this.g;
        float f14 = f13 + f13;
        float f15 = degrees + degrees;
        if (degrees3 < f15) {
            float f16 = degrees3 / f15;
            float f17 = f12 + (degrees * f16);
            rmr rmrVar = new rmr();
            if (z2) {
                PathMeasure pathMeasure = this.d;
                float length = ((f17 / 360.0f) * pathMeasure.getLength()) / 2.0f;
                float f18 = this.h * f3;
                float f19 = this.i;
                if (f19 != this.m || f18 != this.k) {
                    this.k = f18;
                    this.m = f19;
                    g();
                }
                pathMeasure.getPosTan(length, (float[]) rmrVar.a, (float[]) rmrVar.b);
            } else {
                rmrVar.d(f17 + 90.0f);
                rmrVar.a(-this.i);
            }
            paint.setStyle(Paint.Style.FILL);
            m(canvas, paint, rmrVar, f14, this.f, f16);
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(rmjVar.f() ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        float f20 = f12 + degrees;
        float f21 = degrees3 - f15;
        Pair pair = this.q;
        ((rmr) pair.first).c();
        ((rmr) pair.second).c();
        if (z2) {
            PathMeasure pathMeasure2 = this.d;
            Path path = this.c;
            float f22 = f20 / 360.0f;
            float f23 = f21 / 360.0f;
            float f24 = this.h * f3;
            int i4 = this.n ? rmjVar.j : rmjVar.k;
            float f25 = this.i;
            if (f25 != this.m || f24 != this.k || i4 != this.l) {
                this.k = f24;
                this.l = i4;
                this.m = f25;
                g();
            }
            path.rewind();
            float fC = clc.C(f23, 0.0f, 1.0f);
            if (rmjVar.c(this.n)) {
                float f26 = f4 / ((float) ((this.i * 6.283185307179586d) / this.j));
                f22 += f26;
                f5 = -(f26 * 360.0f);
            } else {
                f5 = 0.0f;
            }
            float f27 = f22 % 1.0f;
            float length2 = (pathMeasure2.getLength() * f27) / 2.0f;
            float length3 = ((f27 + fC) * pathMeasure2.getLength()) / 2.0f;
            pathMeasure2.getSegment(length2, length3, path, true);
            rmr rmrVar2 = (rmr) pair.first;
            rmrVar2.c();
            pathMeasure2.getPosTan(length2, (float[]) rmrVar2.a, (float[]) rmrVar2.b);
            rmr rmrVar3 = (rmr) pair.second;
            rmrVar3.c();
            pathMeasure2.getPosTan(length3, (float[]) rmrVar3.a, (float[]) rmrVar3.b);
            Matrix matrix = this.e;
            matrix.reset();
            matrix.setRotate(f5);
            rmrVar2.d(f5);
            rmrVar3.d(f5);
            path.transform(matrix);
            canvas2 = canvas;
            canvas2.drawPath(path, paint);
        } else {
            ((rmr) pair.first).d(f20 + 90.0f);
            ((rmr) pair.first).a(-this.i);
            ((rmr) pair.second).d(f20 + f21 + 90.0f);
            ((rmr) pair.second).a(-this.i);
            RectF rectF = this.p;
            float f28 = this.i;
            float f29 = -f28;
            rectF.set(f29, f29, f28, f28);
            canvas.drawArc(rectF, f20, f21, false, paint);
            canvas2 = canvas;
        }
        if (rmjVar.f() || this.g <= 0.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        l(canvas2, paint, (rmr) pair.first, f14, this.f);
        l(canvas, paint, (rmr) pair.second, f14, this.f);
    }

    private final void l(Canvas canvas, Paint paint, rmr rmrVar, float f, float f2) {
        m(canvas, paint, rmrVar, f, f2, 1.0f);
    }

    private final void m(Canvas canvas, Paint paint, rmr rmrVar, float f, float f2, float f3) {
        float fMin = Math.min(f2, this.f);
        float f4 = (this.g * fMin) / this.f;
        float f5 = -f;
        float f6 = f / 2.0f;
        float fMin2 = Math.min(f6, f4);
        RectF rectF = new RectF(f5 / 2.0f, (-fMin) / 2.0f, f6, fMin / 2.0f);
        canvas.save();
        float[] fArr = (float[]) rmrVar.a;
        canvas.translate(fArr[0], fArr[1]);
        canvas.rotate(i((float[]) rmrVar.b));
        canvas.scale(f3, f3);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }

    @Override // defpackage.rms
    public final int a() {
        return j();
    }

    @Override // defpackage.rms
    public final int b() {
        return j();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0094  */
    @Override // defpackage.rms
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(android.graphics.Canvas r10, android.graphics.Rect r11, float r12, boolean r13, boolean r14) {
        /*
            r9 = this;
            int r0 = r11.width()
            float r0 = (float) r0
            int r1 = r9.j()
            float r1 = (float) r1
            int r2 = r11.height()
            float r2 = (float) r2
            int r3 = r9.j()
            float r3 = (float) r3
            rlx r4 = r9.a
            rmj r4 = (defpackage.rmj) r4
            int r5 = r4.p
            float r5 = (float) r5
            int r6 = r4.q
            float r6 = (float) r6
            int r7 = r11.left
            float r7 = (float) r7
            int r11 = r11.top
            float r11 = (float) r11
            r8 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r8
            float r5 = r5 + r6
            float r0 = r0 / r1
            float r2 = r2 / r3
            float r1 = r5 * r2
            float r3 = r5 * r0
            float r3 = r3 + r7
            float r1 = r1 + r11
            r10.translate(r3, r1)
            r11 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r10.rotate(r11)
            r10.scale(r0, r2)
            int r11 = r4.r
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r11 == 0) goto L46
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            r10.scale(r0, r11)
        L46:
            float r11 = -r5
            r10.clipRect(r11, r11, r5, r5)
            int r10 = r4.a
            float r11 = (float) r10
            float r11 = r11 * r12
            r9.f = r11
            r11 = 2
            int r10 = r10 / r11
            int r1 = r4.a()
            int r10 = java.lang.Math.min(r10, r1)
            float r10 = (float) r10
            float r10 = r10 * r12
            r9.g = r10
            int r10 = r4.l
            float r10 = (float) r10
            float r10 = r10 * r12
            r9.h = r10
            int r10 = r4.p
            int r1 = r4.a
            int r10 = r10 - r1
            float r10 = (float) r10
            float r10 = r10 / r8
            r9.i = r10
            r2 = 1
            if (r13 != 0) goto L76
            if (r14 == 0) goto L74
            r14 = r2
            goto L76
        L74:
            r12 = r0
            goto La6
        L76:
            float r3 = r0 - r12
            float r1 = (float) r1
            float r3 = r3 * r1
            float r3 = r3 / r8
            if (r13 == 0) goto L81
            int r1 = r4.g
            if (r1 == r11) goto L87
        L81:
            if (r14 == 0) goto L8b
            int r1 = r4.h
            if (r1 != r2) goto L8b
        L87:
            float r10 = r10 + r3
            r9.i = r10
            goto L9e
        L8b:
            if (r13 == 0) goto L94
            int r13 = r4.g
            if (r13 == r2) goto L92
            goto L94
        L92:
            r2 = r14
            goto L9a
        L94:
            if (r14 == 0) goto L9e
            int r13 = r4.h
            if (r13 != r11) goto L9e
        L9a:
            float r10 = r10 - r3
            r9.i = r10
            r14 = r2
        L9e:
            if (r14 == 0) goto L74
            int r10 = r4.h
            r11 = 3
            if (r10 == r11) goto La6
            goto L74
        La6:
            r9.o = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rly.c(android.graphics.Canvas, android.graphics.Rect, float, boolean, boolean):void");
    }

    @Override // defpackage.rms
    public final void e(Canvas canvas, Paint paint, rmq rmqVar, int i) {
        int iO = qpt.O(rmqVar.c, i);
        canvas.save();
        canvas.rotate(rmqVar.g);
        this.n = rmqVar.h;
        float f = rmqVar.a;
        float f2 = rmqVar.b;
        int i2 = rmqVar.d;
        k(canvas, paint, f, f2, iO, i2, i2, rmqVar.e, rmqVar.f, true);
        canvas.restore();
    }

    @Override // defpackage.rms
    public final void f(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3) {
        int iO = qpt.O(i, i2);
        this.n = false;
        k(canvas, paint, f, f2, iO, i3, i3, 0.0f, 0.0f, false);
    }

    @Override // defpackage.rms
    public final void g() {
        Path path = this.b;
        path.rewind();
        path.moveTo(1.0f, 0.0f);
        for (int i = 0; i < 2; i++) {
            path.cubicTo(1.0f, 0.5522848f, 0.5522848f, 1.0f, 0.0f, 1.0f);
            path.cubicTo(-0.5522848f, 1.0f, -1.0f, 0.5522848f, -1.0f, 0.0f);
            path.cubicTo(-1.0f, -0.5522848f, -0.5522848f, -1.0f, 0.0f, -1.0f);
            path.cubicTo(0.5522848f, -1.0f, 1.0f, -0.5522848f, 1.0f, 0.0f);
        }
        Matrix matrix = this.e;
        matrix.reset();
        float f = this.i;
        matrix.setScale(f, f);
        path.transform(matrix);
        if (((rmj) this.a).c(this.n)) {
            PathMeasure pathMeasure = this.d;
            pathMeasure.setPath(path, false);
            float f2 = this.k;
            path.rewind();
            float length = pathMeasure.getLength();
            int iMax = Math.max(3, (int) ((length / (this.n ? r1.j : r1.k)) / 2.0f));
            int i2 = iMax + iMax;
            this.j = length / i2;
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < i2; i3++) {
                rmr rmrVar = new rmr();
                float f3 = i3;
                pathMeasure.getPosTan(this.j * f3, (float[]) rmrVar.a, (float[]) rmrVar.b);
                rmr rmrVar2 = new rmr();
                float f4 = this.j;
                pathMeasure.getPosTan((f3 * f4) + (f4 / 2.0f), (float[]) rmrVar2.a, (float[]) rmrVar2.b);
                arrayList.add(rmrVar);
                rmrVar2.a(f2 + f2);
                arrayList.add(rmrVar2);
            }
            arrayList.add((rmr) arrayList.get(0));
            rmr rmrVar3 = (rmr) arrayList.get(0);
            float[] fArr = (float[]) rmrVar3.a;
            path.moveTo(fArr[0], fArr[1]);
            int i4 = 1;
            while (i4 < arrayList.size()) {
                rmr rmrVar4 = (rmr) arrayList.get(i4);
                float f5 = this.j / 2.0f;
                rmr rmrVar5 = new rmr(rmrVar3);
                rmr rmrVar6 = new rmr(rmrVar4);
                float f6 = f5 * 0.48f;
                rmrVar5.b(f6);
                rmrVar6.b(-f6);
                float[] fArr2 = (float[]) rmrVar5.a;
                float f7 = fArr2[0];
                float f8 = fArr2[1];
                float[] fArr3 = (float[]) rmrVar6.a;
                float f9 = fArr3[0];
                float f10 = fArr3[1];
                float[] fArr4 = (float[]) rmrVar4.a;
                path.cubicTo(f7, f8, f9, f10, fArr4[0], fArr4[1]);
                i4++;
                rmrVar3 = rmrVar4;
            }
        }
        this.d.setPath(path, false);
    }

    @Override // defpackage.rms
    public final void d(Canvas canvas, Paint paint, int i, int i2) {
    }
}
