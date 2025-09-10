package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class roe {
    private final rok[] a = new rok[4];
    private final Matrix[] b = new Matrix[4];
    private final Matrix[] c = new Matrix[4];
    private final PointF d = new PointF();
    private final Path e = new Path();
    private final Path f = new Path();
    private final rok g = new rok();
    private final float[] h = new float[2];
    private final float[] i = new float[2];
    private final Path j = new Path();
    private final Path k = new Path();
    private boolean l = true;

    public roe() {
        for (int i = 0; i < 4; i++) {
            this.a[i] = new rok();
            this.b[i] = new Matrix();
            this.c[i] = new Matrix();
        }
    }

    static final rnr b(int i, roc rocVar) {
        return i != 1 ? i != 2 ? i != 3 ? rocVar.c : rocVar.b : rocVar.e : rocVar.d;
    }

    private final boolean c(Path path, int i) {
        Path path2 = this.k;
        path2.reset();
        this.a[i].c(this.b[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    private static final float d(int i) {
        return ((i + 1) % 4) * 90;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(roc rocVar, float[] fArr, float f, RectF rectF, rnu rnuVar, Path path) {
        int i;
        int i2;
        int i3;
        float f2;
        char c;
        char c2;
        char c3;
        int i4;
        char c4;
        path.rewind();
        Path path2 = this.e;
        path2.rewind();
        Path path3 = this.f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i5 = 0;
        while (true) {
            i2 = 1;
            if (i5 >= 4) {
                break;
            }
            rnr rnrVarB = fArr == null ? b(i5, rocVar) : new rnq(fArr[i5]);
            rnt rntVar = i5 != 1 ? i5 != 2 ? i5 != 3 ? rocVar.k : rocVar.j : rocVar.m : rocVar.l;
            rok[] rokVarArr = this.a;
            rntVar.a(rokVarArr[i5], f, rnrVarB.a(rectF));
            float fD = d(i5);
            Matrix[] matrixArr = this.b;
            matrixArr[i5].reset();
            PointF pointF = this.d;
            if (i5 == 1) {
                pointF.set(rectF.right, rectF.bottom);
            } else if (i5 == 2) {
                pointF.set(rectF.left, rectF.bottom);
            } else if (i5 != 3) {
                pointF.set(rectF.right, rectF.top);
            } else {
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr[i5].setTranslate(pointF.x, pointF.y);
            matrixArr[i5].preRotate(fD);
            float[] fArr2 = this.h;
            rok rokVar = rokVarArr[i5];
            fArr2[0] = rokVar.b;
            fArr2[1] = rokVar.c;
            matrixArr[i5].mapPoints(fArr2);
            float fD2 = d(i5);
            Matrix[] matrixArr2 = this.c;
            matrixArr2[i5].reset();
            matrixArr2[i5].setTranslate(fArr2[0], fArr2[1]);
            matrixArr2[i5].preRotate(fD2);
            i5++;
        }
        char c5 = 0;
        int i6 = 0;
        for (i = 4; i6 < i; i = 4) {
            float[] fArr3 = this.h;
            rok[] rokVarArr2 = this.a;
            rok rokVar2 = rokVarArr2[i6];
            fArr3[c5] = 0.0f;
            fArr3[i2] = rokVar2.a;
            Matrix[] matrixArr3 = this.b;
            matrixArr3[i6].mapPoints(fArr3);
            if (i6 == 0) {
                path.moveTo(fArr3[c5], fArr3[i2]);
            } else {
                path.lineTo(fArr3[c5], fArr3[i2]);
            }
            rokVarArr2[i6].c(matrixArr3[i6], path);
            if (rnuVar != null) {
                rok rokVar3 = rokVarArr2[i6];
                Matrix matrix = matrixArr3[i6];
                rnx rnxVar = (rnx) rnuVar.a;
                i3 = i2;
                f2 = 0.0f;
                boolean z = c5;
                rnxVar.d.set(i6, z);
                rnxVar.b[i6] = rokVar3.a(matrix);
                c = z;
            } else {
                i3 = i2;
                f2 = 0.0f;
                c = c5;
            }
            int i7 = i6 + 1;
            rok rokVar4 = rokVarArr2[i6];
            fArr3[c] = rokVar4.b;
            fArr3[i3] = rokVar4.c;
            matrixArr3[i6].mapPoints(fArr3);
            float[] fArr4 = this.i;
            int i8 = i7 % 4;
            rok rokVar5 = rokVarArr2[i8];
            fArr4[c] = f2;
            fArr4[i3] = rokVar5.a;
            matrixArr3[i8].mapPoints(fArr4);
            float fMax = Math.max(((float) Math.hypot(fArr3[c] - fArr4[c], fArr3[i3] - fArr4[i3])) - 0.001f, f2);
            rok rokVar6 = rokVarArr2[i6];
            fArr3[0] = rokVar6.b;
            fArr3[i3] = rokVar6.c;
            matrixArr3[i6].mapPoints(fArr3);
            int i9 = i3;
            if (i6 == i9 || i6 == 3) {
                Math.abs(rectF.centerX() - fArr3[0]);
            } else {
                Math.abs(rectF.centerY() - fArr3[i9]);
            }
            rok rokVar7 = this.g;
            rokVar7.e();
            if (i6 != 1) {
                c2 = 2;
                if (i6 != 2) {
                    c3 = 3;
                    if (i6 != 3) {
                        rnt rntVar2 = rocVar.g;
                    } else {
                        rnt rntVar3 = rocVar.f;
                    }
                } else {
                    c3 = 3;
                    rnt rntVar4 = rocVar.i;
                }
            } else {
                c2 = 2;
                c3 = 3;
                rnt rntVar5 = rocVar.h;
            }
            rokVar7.d(fMax, 0.0f);
            Path path4 = this.j;
            path4.reset();
            Matrix[] matrixArr4 = this.c;
            rokVar7.c(matrixArr4[i6], path4);
            if (this.l && (c(path4, i6) || c(path4, i8))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr3[0] = 0.0f;
                i4 = 1;
                fArr3[1] = rokVar7.a;
                matrixArr4[i6].mapPoints(fArr3);
                path2.moveTo(fArr3[0], fArr3[1]);
                rokVar7.c(matrixArr4[i6], path2);
            } else {
                i4 = 1;
                rokVar7.c(matrixArr4[i6], path);
            }
            if (rnuVar != null) {
                Matrix matrix2 = matrixArr4[i6];
                rnx rnxVar2 = (rnx) rnuVar.a;
                c4 = 0;
                rnxVar2.d.set(i6 + 4, false);
                rnxVar2.c[i6] = rokVar7.a(matrix2);
            } else {
                c4 = 0;
            }
            i6 = i7;
            c5 = c4;
            i2 = i4;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }
}
