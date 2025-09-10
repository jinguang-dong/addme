package defpackage;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import com.google.android.apps.camera.jni.gxp.Caan.yoGAhrpjU;
import com.google.android.apps.camera.modeldownloader.uD.uCzt;
import com.google.android.libraries.vision.opengl.Texture;
import com.google.ar.core.R;
import j$.io.BufferedReaderRetargetClass;
import j$.util.stream.Collectors;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fjf implements GLSurfaceView.Renderer {
    public int b;
    public int c;
    public int d;
    public int e;
    public fjh f;
    public ByteBuffer g;
    public ByteBuffer h;
    public ByteBuffer i;
    public float j;
    public tcd l;
    private rft o;
    private Texture p;
    private Texture q;
    private Texture r;
    private rfv s;
    private rfv u;
    private rfv v;
    private final Context w;
    private rfv x;
    private rfv y;
    public boolean a = false;
    private final FloatBuffer m = rkf.g(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});
    private final FloatBuffer n = rkf.g(new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    public boolean k = false;
    private final float[] t = new float[16];

    public fjf(Context context) {
        this.w = context;
    }

    private final void b() {
        this.p = new Texture(this.d, this.e);
        this.q = new Texture(this.d / 2, this.e / 2);
        this.r = new Texture(this.d / 2, this.e / 2);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        int i;
        synchronized (this) {
            if (this.g != null && this.h != null && this.i != null) {
                if (this.o == null) {
                    a();
                }
                Texture texture = this.p;
                if (texture != null && this.q != null && this.r != null) {
                    if (texture.getHeight() != this.e || texture.getWidth() != this.d) {
                        b();
                    }
                    GLES20.glViewport(0, 0, this.b, this.c);
                    GLES20.glClear(16384);
                    rft rftVar = this.o;
                    rftVar.getClass();
                    rftVar.b();
                    int i2 = this.d;
                    float f = (i2 <= 0 || (i = this.e) <= 0) ? 1.0f : i2 / i;
                    if (this.l == tcd.b) {
                        Matrix.setRotateEulerM(this.t, 0, 0.0f, 0.0f, -90.0f);
                    } else {
                        if (this.l != tcd.d) {
                            Matrix.setIdentityM(this.t, 0);
                            rfv rfvVar = this.u;
                            rfvVar.getClass();
                            rfvVar.b(this.t);
                            rfv rfvVar2 = this.v;
                            rfvVar2.getClass();
                            rfvVar2.a(f);
                            rfv rfvVar3 = this.x;
                            rfvVar3.getClass();
                            rfvVar3.f();
                            rfv rfvVar4 = this.x;
                            rfvVar4.getClass();
                            FloatBuffer floatBuffer = this.m;
                            rfvVar4.g(floatBuffer, 2);
                            rfv rfvVar5 = this.y;
                            rfvVar5.getClass();
                            rfvVar5.f();
                            rfv rfvVar6 = this.y;
                            rfvVar6.getClass();
                            rfvVar6.g(this.n, 2);
                            int iGlGetUniformLocation = GLES20.glGetUniformLocation(rftVar.a, "uYTexture");
                            int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(rftVar.a, "uUTexture");
                            int iGlGetUniformLocation3 = GLES20.glGetUniformLocation(rftVar.a, "uVTexture");
                            GLES20.glUniform1i(iGlGetUniformLocation, 0);
                            GLES20.glUniform1i(iGlGetUniformLocation2, 1);
                            GLES20.glUniform1i(iGlGetUniformLocation3, 2);
                            rfv rfvVar7 = this.s;
                            rfvVar7.getClass();
                            rfvVar7.a(this.j);
                            GLES20.glActiveTexture(33984);
                            this.p.bind();
                            GLES20.glTexImage2D(3553, 0, 6409, this.p.getWidth(), this.p.getHeight(), 0, 6409, 5121, this.g);
                            GLES20.glTexParameterf(3553, 10241, 9729.0f);
                            GLES20.glTexParameterf(3553, 10240, 9729.0f);
                            GLES20.glTexParameterf(3553, 10242, 33071.0f);
                            GLES20.glTexParameterf(3553, 10243, 33071.0f);
                            GLES20.glActiveTexture(33985);
                            this.q.bind();
                            GLES20.glTexImage2D(3553, 0, 6410, this.q.getWidth(), this.q.getHeight(), 0, 6410, 5121, this.h);
                            GLES20.glTexParameterf(3553, 10241, 9729.0f);
                            GLES20.glTexParameterf(3553, 10240, 9729.0f);
                            GLES20.glTexParameterf(3553, 10242, 33071.0f);
                            GLES20.glTexParameterf(3553, 10243, 33071.0f);
                            GLES20.glActiveTexture(33986);
                            this.r.bind();
                            GLES20.glTexImage2D(3553, 0, 6410, this.r.getWidth(), this.r.getHeight(), 0, 6410, 5121, this.i);
                            GLES20.glTexParameterf(3553, 10241, 9729.0f);
                            GLES20.glTexParameterf(3553, 10240, 9729.0f);
                            GLES20.glTexParameteri(3553, 10242, 33071);
                            GLES20.glTexParameteri(3553, 10243, 33071);
                            GLES20.glDrawArrays(5, 0, floatBuffer.capacity() / 2);
                            this.p.unbind();
                            this.q.unbind();
                            this.r.unbind();
                            rfv rfvVar8 = this.y;
                            rfvVar8.getClass();
                            rfvVar8.e();
                            rfv rfvVar9 = this.x;
                            rfvVar9.getClass();
                            rfvVar9.e();
                            rftVar.d();
                        }
                        Matrix.setRotateEulerM(this.t, 0, 0.0f, 0.0f, 90.0f);
                    }
                    f = 1.0f / f;
                    rfv rfvVar10 = this.u;
                    rfvVar10.getClass();
                    rfvVar10.b(this.t);
                    rfv rfvVar22 = this.v;
                    rfvVar22.getClass();
                    rfvVar22.a(f);
                    rfv rfvVar32 = this.x;
                    rfvVar32.getClass();
                    rfvVar32.f();
                    rfv rfvVar42 = this.x;
                    rfvVar42.getClass();
                    FloatBuffer floatBuffer2 = this.m;
                    rfvVar42.g(floatBuffer2, 2);
                    rfv rfvVar52 = this.y;
                    rfvVar52.getClass();
                    rfvVar52.f();
                    rfv rfvVar62 = this.y;
                    rfvVar62.getClass();
                    rfvVar62.g(this.n, 2);
                    int iGlGetUniformLocation4 = GLES20.glGetUniformLocation(rftVar.a, "uYTexture");
                    int iGlGetUniformLocation22 = GLES20.glGetUniformLocation(rftVar.a, "uUTexture");
                    int iGlGetUniformLocation32 = GLES20.glGetUniformLocation(rftVar.a, "uVTexture");
                    GLES20.glUniform1i(iGlGetUniformLocation4, 0);
                    GLES20.glUniform1i(iGlGetUniformLocation22, 1);
                    GLES20.glUniform1i(iGlGetUniformLocation32, 2);
                    rfv rfvVar72 = this.s;
                    rfvVar72.getClass();
                    rfvVar72.a(this.j);
                    GLES20.glActiveTexture(33984);
                    this.p.bind();
                    GLES20.glTexImage2D(3553, 0, 6409, this.p.getWidth(), this.p.getHeight(), 0, 6409, 5121, this.g);
                    GLES20.glTexParameterf(3553, 10241, 9729.0f);
                    GLES20.glTexParameterf(3553, 10240, 9729.0f);
                    GLES20.glTexParameterf(3553, 10242, 33071.0f);
                    GLES20.glTexParameterf(3553, 10243, 33071.0f);
                    GLES20.glActiveTexture(33985);
                    this.q.bind();
                    GLES20.glTexImage2D(3553, 0, 6410, this.q.getWidth(), this.q.getHeight(), 0, 6410, 5121, this.h);
                    GLES20.glTexParameterf(3553, 10241, 9729.0f);
                    GLES20.glTexParameterf(3553, 10240, 9729.0f);
                    GLES20.glTexParameterf(3553, 10242, 33071.0f);
                    GLES20.glTexParameterf(3553, 10243, 33071.0f);
                    GLES20.glActiveTexture(33986);
                    this.r.bind();
                    GLES20.glTexImage2D(3553, 0, 6410, this.r.getWidth(), this.r.getHeight(), 0, 6410, 5121, this.i);
                    GLES20.glTexParameterf(3553, 10241, 9729.0f);
                    GLES20.glTexParameterf(3553, 10240, 9729.0f);
                    GLES20.glTexParameteri(3553, 10242, 33071);
                    GLES20.glTexParameteri(3553, 10243, 33071);
                    GLES20.glDrawArrays(5, 0, floatBuffer2.capacity() / 2);
                    this.p.unbind();
                    this.q.unbind();
                    this.r.unbind();
                    rfv rfvVar82 = this.y;
                    rfvVar82.getClass();
                    rfvVar82.e();
                    rfv rfvVar92 = this.x;
                    rfvVar92.getClass();
                    rfvVar92.e();
                    rftVar.d();
                }
            }
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        a();
    }

    private final void a() {
        Context context = this.w;
        rft rftVar = new rft((String) BufferedReaderRetargetClass.lines(new BufferedReader(new InputStreamReader(context.getResources().openRawResource(R.raw.preview_vert)))).collect(Collectors.joining("\n")), (String) BufferedReaderRetargetClass.lines(new BufferedReader(new InputStreamReader(context.getResources().openRawResource(R.raw.preview_frag)))).collect(Collectors.joining("\n")));
        this.o = rftVar;
        this.x = rftVar.e("aVertex");
        this.y = this.o.e("aTexCoord");
        this.u = this.o.a(uCzt.dELNsnZgMnSIlwJ);
        this.s = this.o.a("uCornerRadius");
        this.v = this.o.a(yoGAhrpjU.treYSgKjZD);
        Matrix.setIdentityM(this.t, 0);
        b();
    }
}
