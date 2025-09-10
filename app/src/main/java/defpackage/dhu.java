package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Shader;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dhu {
    public static final Matrix a = new Matrix();
    Paint b;
    Paint c;
    final dhs d;
    float e;
    float f;
    float g;
    float h;
    int i;
    String j;
    Boolean k;
    final yd l;
    private final Path m;
    private final Path n;
    private final Matrix o;
    private PathMeasure p;
    private int q;

    public dhu() {
        this.o = new Matrix();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 255;
        this.j = null;
        this.k = null;
        this.l = new yd();
        this.d = new dhs();
        this.m = new Path();
        this.n = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(dhs dhsVar, Matrix matrix, Canvas canvas, int i, int i2) {
        int i3;
        Matrix matrix2;
        float f;
        Matrix matrix3 = dhsVar.a;
        matrix3.set(matrix);
        matrix3.preConcat(dhsVar.j);
        canvas.save();
        char c = 0;
        int i4 = 0;
        while (true) {
            ArrayList arrayList = dhsVar.b;
            if (i4 >= arrayList.size()) {
                canvas.restore();
                return;
            }
            com comVar = (com) arrayList.get(i4);
            if (comVar instanceof dhs) {
                a((dhs) comVar, matrix3, canvas, i, i2);
            } else if (comVar instanceof dht) {
                dht dhtVar = (dht) comVar;
                float f2 = i / this.g;
                float f3 = i2 / this.h;
                Matrix matrix4 = this.o;
                float fMin = Math.min(f2, f3);
                matrix4.set(matrix3);
                matrix4.postScale(f2, f3);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix3.mapVectors(fArr);
                boolean z = c;
                i3 = i4;
                float fHypot = (float) Math.hypot(fArr[c], fArr[1]);
                float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f4 = fArr[z ? 1 : 0];
                float f5 = fArr[1];
                float f6 = fArr[2];
                float f7 = f4 * fArr[3];
                float f8 = f5 * f6;
                float fMax = Math.max(fHypot, fHypot2);
                float fAbs = fMax > 0.0f ? Math.abs(f7 - f8) / fMax : 0.0f;
                if (fAbs != 0.0f) {
                    Path path = this.m;
                    path.reset();
                    cmi[] cmiVarArr = dhtVar.m;
                    if (cmiVarArr != null) {
                        chx.k(cmiVarArr, path);
                    }
                    Path path2 = this.n;
                    path2.reset();
                    if (dhtVar.z()) {
                        path2.setFillType(dhtVar.o == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                        matrix2 = matrix3;
                    } else {
                        dhr dhrVar = (dhr) dhtVar;
                        float f9 = dhrVar.e;
                        if (f9 == 0.0f && dhrVar.f == 1.0f) {
                            matrix2 = matrix3;
                        } else {
                            float f10 = dhrVar.g;
                            float f11 = (f9 + f10) % 1.0f;
                            float f12 = (dhrVar.f + f10) % 1.0f;
                            if (this.p == null) {
                                this.p = new PathMeasure();
                            }
                            this.p.setPath(path, z);
                            float length = this.p.getLength();
                            float f13 = f11 * length;
                            float f14 = f12 * length;
                            path.reset();
                            if (f13 > f14) {
                                matrix2 = matrix3;
                                this.p.getSegment(f13, length, path, true);
                                f = 0.0f;
                                this.p.getSegment(0.0f, f14, path, true);
                            } else {
                                matrix2 = matrix3;
                                f = 0.0f;
                                this.p.getSegment(f13, f14, path, true);
                            }
                            path.rLineTo(f, f);
                        }
                        path2.addPath(path, matrix4);
                        if (dhrVar.l.j()) {
                            nll nllVar = dhrVar.l;
                            if (this.c == null) {
                                Paint paint = new Paint(1);
                                this.c = paint;
                                paint.setStyle(Paint.Style.FILL);
                            }
                            Paint paint2 = this.c;
                            if (nllVar.g()) {
                                Shader shader = (Shader) nllVar.c;
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(dhrVar.d * 255.0f));
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                paint2.setColor(dhx.a(nllVar.a, dhrVar.d));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(dhrVar.o == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        if (dhrVar.k.j()) {
                            nll nllVar2 = dhrVar.k;
                            if (this.b == null) {
                                Paint paint3 = new Paint(1);
                                this.b = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.b;
                            Paint.Join join = dhrVar.i;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = dhrVar.h;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(dhrVar.j);
                            if (nllVar2.g()) {
                                Shader shader2 = (Shader) nllVar2.c;
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(dhrVar.c * 255.0f));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                paint4.setColor(dhx.a(nllVar2.a, dhrVar.c));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(dhrVar.b * fMin * fAbs);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                } else {
                    matrix2 = matrix3;
                }
                i4 = i3 + 1;
                matrix3 = matrix2;
                c = 0;
            }
            matrix2 = matrix3;
            i3 = i4;
            i4 = i3 + 1;
            matrix3 = matrix2;
            c = 0;
        }
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.i;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.i = i;
    }

    public dhu(dhu dhuVar) {
        this.o = new Matrix();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 255;
        this.j = null;
        this.k = null;
        yd ydVar = new yd();
        this.l = ydVar;
        this.d = new dhs(dhuVar.d, ydVar);
        this.m = new Path(dhuVar.m);
        this.n = new Path(dhuVar.n);
        this.e = dhuVar.e;
        this.f = dhuVar.f;
        this.g = dhuVar.g;
        this.h = dhuVar.h;
        int i = dhuVar.q;
        this.q = 0;
        this.i = dhuVar.i;
        this.j = dhuVar.j;
        String str = dhuVar.j;
        if (str != null) {
            ydVar.put(str, this);
        }
        this.k = dhuVar.k;
    }
}
