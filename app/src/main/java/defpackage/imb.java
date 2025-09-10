package defpackage;

import android.opengl.GLES20;
import android.opengl.Matrix;
import androidx.compose.foundation.text.modifiers.Yk.LmJPKwPBa;
import java.nio.FloatBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class imb {
    private static final sgv b = sgv.g("imb");
    private final float[] d;
    private rft f;
    private rfv g;
    private rfv h;
    private rfv i;
    private rfv k;
    private FloatBuffer c = null;
    private final float[] e = new float[16];
    public final float[] a = {1.0f, 1.0f, 1.0f, 1.0f};
    private float j = 1.0f;

    public imb() {
        float[] fArr = new float[16];
        this.d = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    public final void a() {
        rft rftVar = this.f;
        if (rftVar != null) {
            rftVar.c();
            this.f = null;
        }
    }

    public final void c(float[] fArr, float f) {
        if (fArr == null || (fArr.length & 3) != 0) {
            ((sgt) b.b().M(2164)).t("Tried to draw a set of lines with %d floats", fArr.length);
            this.c = null;
        } else {
            this.j = f;
            this.c = rkf.g(fArr);
        }
    }

    public final void d(float f, float f2) {
        float f3 = f / f2;
        Matrix.orthoM(this.e, 0, -f3, f3, -1.0f, 1.0f, -1.0f, 1.0f);
    }

    public final void b() {
        if (this.f == null) {
            rft rftVar = new rft("attribute vec2 vertexAttrib;uniform mat4 projectionMatrix;uniform mat4 vertexTransform;void main() {  gl_Position = projectionMatrix * vertexTransform * vec4(vertexAttrib, 0., 1.);}", "precision mediump float;uniform vec4 fillColor;void main() {  gl_FragColor = fillColor;}");
            this.f = rftVar;
            this.g = rftVar.a("vertexTransform");
            this.h = this.f.a("projectionMatrix");
            this.i = this.f.a(LmJPKwPBa.zMctHBkVXaRigDJ);
            this.k = this.f.e("vertexAttrib");
        }
        if (this.c == null) {
            return;
        }
        rft rftVar2 = this.f;
        rftVar2.getClass();
        rftVar2.b();
        this.k.f();
        this.k.g(this.c, 2);
        this.g.b(this.d);
        this.h.b(this.e);
        this.i.c(this.a);
        GLES20.glLineWidth(this.j);
        GLES20.glDrawArrays(1, 0, this.c.capacity() / 2);
        this.k.e();
        rftVar2.d();
    }
}
