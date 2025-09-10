package defpackage;

import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rmr {
    public Object a;
    public Object b;
    public final Object c;

    public rmr(izm izmVar) {
        this.c = izmVar;
    }

    final void a(float f) {
        float[] fArr = (float[]) this.b;
        double dAtan2 = Math.atan2(fArr[1], fArr[0]) + 1.5707963267948966d;
        double d = (float) dAtan2;
        double d2 = f;
        ((float[]) this.a)[0] = (float) (r0[0] + (Math.cos(d) * d2));
        ((float[]) this.a)[1] = (float) (r11[1] + (d2 * Math.sin(d)));
    }

    final void b(float f) {
        float[] fArr = (float[]) this.b;
        float fAtan2 = (float) Math.atan2(fArr[1], fArr[0]);
        double d = fAtan2;
        double d2 = f;
        ((float[]) this.a)[0] = (float) (r2[0] + (Math.cos(d) * d2));
        ((float[]) this.a)[1] = (float) (r13[1] + (d2 * Math.sin(d)));
    }

    public final void c() {
        Arrays.fill((float[]) this.a, 0.0f);
        Arrays.fill((float[]) this.b, 0.0f);
        ((float[]) this.b)[0] = 1.0f;
        ((Matrix) this.c).reset();
    }

    public final void d(float f) {
        Matrix matrix = (Matrix) this.c;
        matrix.reset();
        matrix.setRotate(f);
        matrix.mapPoints((float[]) this.a);
        matrix.mapPoints((float[]) this.b);
    }

    final void e(float f) {
        float[] fArr = (float[]) this.a;
        float f2 = fArr[0];
        fArr[1] = fArr[1] * f;
        float[] fArr2 = (float[]) this.b;
        float f3 = fArr2[0];
        fArr2[1] = fArr2[1] * f;
    }

    final void f(float f) {
        float[] fArr = (float[]) this.a;
        fArr[0] = fArr[0] + f;
        fArr[1] = fArr[1] + 0.0f;
    }

    public rmr() {
        this.a = new float[2];
        this.b = new float[]{1.0f, 0.0f};
        this.c = new Matrix();
    }

    public rmr(byte[] bArr) {
        this.b = new Object();
        this.c = new ArrayList();
    }

    public rmr(rmr rmrVar) {
        this((float[]) rmrVar.a, (float[]) rmrVar.b);
    }

    public rmr(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[2];
        this.a = fArr3;
        this.b = new float[2];
        System.arraycopy(fArr, 0, fArr3, 0, 2);
        System.arraycopy(fArr2, 0, this.b, 0, 2);
        this.c = new Matrix();
    }
}
