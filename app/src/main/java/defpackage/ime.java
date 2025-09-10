package defpackage;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.google.android.libraries.vision.opengl.Texture;
import java.nio.FloatBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ime {
    public FloatBuffer a;
    public Texture b = null;
    public int c = 33071;
    public boolean d = false;
    public final float[] e = {1.0f, 1.0f, 1.0f, 1.0f};
    private final float[] f;
    private FloatBuffer g;
    private final float[] h;
    private final float[] i;
    private final float[] j;
    private final float[] k;
    private rft l;
    private rfv m;
    private rfv n;
    private rfv o;
    private rfv p;
    private rfv q;
    private rfv r;
    private rfv s;
    private rfv t;

    public ime() {
        float[] fArr = {-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f};
        this.f = fArr;
        this.g = rkf.g(fArr);
        float[] fArr2 = {0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f};
        this.h = fArr2;
        this.a = rkf.g(fArr2);
        float[] fArr3 = new float[16];
        this.i = fArr3;
        float[] fArr4 = new float[16];
        this.j = fArr4;
        float[] fArr5 = new float[16];
        this.k = fArr5;
        Matrix.setIdentityM(fArr3, 0);
        Matrix.setIdentityM(fArr4, 0);
        Matrix.setIdentityM(fArr5, 0);
    }

    public final void a() {
        rft rftVar = this.l;
        if (rftVar != null) {
            rftVar.c();
            this.l = null;
        }
    }

    public final void b() {
        Texture texture = this.b;
        if (texture == null) {
            return;
        }
        if (this.l == null) {
            rft rftVar = new rft("attribute vec2 vertexAttrib;attribute vec2 texCoordAttrib;varying vec2 texCoord;uniform mat4 projectionMatrix;uniform mat4 vertexTransform;uniform mat4 textureTransform;void main() {  texCoord = (textureTransform * vec4(texCoordAttrib, 0., 1.)).xy;  gl_Position = projectionMatrix * vertexTransform * vec4(vertexAttrib, 0., 1.);}", texture.getType() == 36197 ? "#extension GL_OES_EGL_image_external : require \nprecision mediump float;uniform samplerExternalOES texture;uniform bool overrideColorActive;uniform vec4 overrideColor;varying vec2 texCoord;void main() {  vec4 texColor = texture2D(texture, texCoord);  gl_FragColor = (overrideColorActive && texColor.a > 0.01) ? overrideColor : texColor;}" : "precision mediump float;uniform sampler2D texture;uniform bool overrideColorActive;uniform vec4 overrideColor;varying vec2 texCoord;void main() {  vec4 texColor = texture2D(texture, texCoord);  gl_FragColor = (overrideColorActive && texColor.a > 0.01) ? overrideColor : texColor;}");
            this.l = rftVar;
            this.o = rftVar.a("texture");
            this.m = this.l.a("vertexTransform");
            this.n = this.l.a("textureTransform");
            this.p = this.l.a("projectionMatrix");
            this.q = this.l.a("overrideColor");
            this.r = this.l.a("overrideColorActive");
            this.s = this.l.e("vertexAttrib");
            this.t = this.l.e("texCoordAttrib");
        }
        rft rftVar2 = this.l;
        rftVar2.getClass();
        rftVar2.b();
        this.s.f();
        this.s.g(this.g, 2);
        this.t.f();
        this.t.g(this.a, 2);
        rfv rfvVar = this.o;
        Texture texture2 = this.b;
        texture2.getClass();
        rfvVar.d(texture2);
        this.m.b(this.i);
        this.p.b(this.k);
        this.n.b(this.j);
        GLES20.glUniform1i(this.r.a, this.d ? 1 : 0);
        this.q.c(this.e);
        GLES20.glTexParameteri(3553, 10242, this.c);
        GLES20.glTexParameteri(3553, 10243, this.c);
        GLES20.glDrawArrays(5, 0, this.g.capacity() / 2);
        this.t.e();
        this.s.e();
        rftVar2.d();
    }

    public final void c(float f, float f2) {
        float f3 = f / f2;
        Matrix.orthoM(this.k, 0, -f3, f3, -1.0f, 1.0f, -1.0f, 1.0f);
    }

    public final void d(float f, float f2) {
        float f3 = f / 2.0f;
        float f4 = -f3;
        float[] fArr = this.f;
        fArr[0] = f4;
        float f5 = f2 / 2.0f;
        fArr[1] = f5;
        fArr[2] = f4;
        float f6 = -f5;
        fArr[3] = f6;
        fArr[4] = f3;
        fArr[5] = f5;
        fArr[6] = f3;
        fArr[7] = f6;
        this.g = rkf.g(fArr);
    }

    public final void e(float[] fArr) {
        System.arraycopy(fArr, 0, this.j, 0, 16);
    }

    public final void f(float[] fArr) {
        System.arraycopy(fArr, 0, this.i, 0, 16);
    }
}
