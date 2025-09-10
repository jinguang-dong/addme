package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES30;
import java.nio.Buffer;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class qjr extends qfn implements qjy {
    public final qkq a;
    public final EGLDisplay b;
    public final EGLSurface c;
    public final EGLContext d;
    private final EGLConfig e;
    private final int f;
    private final qhv g;

    public qjr(qkq qkqVar, EGLDisplay eGLDisplay, EGLSurface eGLSurface, EGLContext eGLContext, EGLConfig eGLConfig, int i, qhv qhvVar) {
        this.a = qkqVar;
        this.b = eGLDisplay;
        this.c = eGLSurface;
        this.d = eGLContext;
        this.e = eGLConfig;
        this.f = i;
        this.g = qhvVar;
    }

    @Override // defpackage.qjy
    public final EGLConfig d() {
        return this.e;
    }

    @Override // defpackage.qjy
    public final EGLContext e() {
        return this.d;
    }

    @Override // defpackage.qjy
    public final EGLDisplay f() {
        return this.b;
    }

    @Override // defpackage.qfn
    public final void fl() {
        qpt.am(b());
    }

    @Override // defpackage.qjy
    public final EGLSurface g() {
        return this.c;
    }

    @Override // defpackage.qjy
    public final qkq h() {
        return this.a;
    }

    @Override // defpackage.qjy
    public final void i() {
        EGLContext eGLContext = this.d;
        EGLDisplay eGLDisplay = this.b;
        EGLSurface eGLSurface = this.c;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext)) {
            GLES30.glBindFramebuffer(36160, this.f);
            qfq qfqVar = this.g.a;
            GLES30.glViewport(0, 0, qfqVar.b(), qfqVar.a());
        }
    }

    @Override // defpackage.qjy
    public final void j(Buffer buffer) {
        qhv qhvVar = this.g;
        qjs qjsVarD = qjs.d(qhvVar);
        int iA = qjsVarD.a();
        int iB = qjsVarD.b();
        if (this.a.b(qkq.a)) {
            GLES30.glReadBuffer(36064);
        }
        qfq qfqVar = qhvVar.a;
        GLES30.glReadPixels(0, 0, qfqVar.b(), qfqVar.a(), iA, iB, buffer);
    }

    @Override // defpackage.qjy
    public final void k() {
        if (this.f == 0) {
            EGL14.eglSwapBuffers(this.b, this.c);
        }
    }

    @Override // defpackage.qjy
    public final qhv l() {
        return this.g;
    }
}
