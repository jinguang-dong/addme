package defpackage;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.google.googlex.gcam.dirtylens.PrCd.SHXc;
import java.nio.FloatBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class imc {
    public final float[] a;
    private final float[] b;
    private FloatBuffer c;
    private final float[] d;
    private FloatBuffer e;
    private final float[] f = new float[16];
    private rft g;
    private rfv h;
    private rfv i;
    private rfv j;
    private rfv k;

    public imc() {
        float[] fArr = {-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f};
        this.b = fArr;
        this.c = rkf.g(fArr);
        float[] fArr2 = {0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.5f};
        this.d = fArr2;
        this.e = rkf.g(fArr2);
        float[] fArr3 = new float[16];
        this.a = fArr3;
        Matrix.setIdentityM(fArr3, 0);
    }

    public final void a() {
        rft rftVar = this.g;
        if (rftVar != null) {
            rftVar.c();
            this.g = null;
        }
    }

    public final void c(float f, float f2) {
        float f3 = f / f2;
        Matrix.orthoM(this.f, 0, -f3, f3, -1.0f, 1.0f, -1.0f, 1.0f);
    }

    public final void d(float f, float f2, float f3, float f4) {
        float[] fArr = this.b;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f;
        fArr[3] = f4;
        fArr[4] = f3;
        fArr[5] = f2;
        fArr[6] = f3;
        fArr[7] = f4;
        this.c = rkf.g(fArr);
    }

    public final void e(float[] fArr) {
        this.e = rkf.g(fArr);
    }

    public final void b() {
        if (this.g == null) {
            rft rftVar = new rft("attribute vec2 vertexAttrib;attribute vec4 vertexColorAttrib;varying vec4 vertexColor;uniform mat4 projectionMatrix;uniform mat4 vertexTransform;void main() {  vertexColor = vertexColorAttrib;  gl_Position = projectionMatrix * vertexTransform * vec4(vertexAttrib, 0., 1.);}", "precision mediump float;varying vec4 vertexColor;void main() {  gl_FragColor = vertexColor;}");
            this.g = rftVar;
            this.h = rftVar.a(SHXc.cMqvShw);
            this.i = this.g.a("projectionMatrix");
            this.j = this.g.e("vertexAttrib");
            this.k = this.g.e("vertexColorAttrib");
        }
        rft rftVar2 = this.g;
        rftVar2.getClass();
        rftVar2.b();
        this.j.f();
        this.j.g(this.c, 2);
        this.k.f();
        this.k.g(this.e, 4);
        this.h.b(this.a);
        this.i.b(this.f);
        GLES20.glDrawArrays(5, 0, this.c.capacity() / 2);
        this.k.e();
        this.j.e();
        rftVar2.d();
    }
}
