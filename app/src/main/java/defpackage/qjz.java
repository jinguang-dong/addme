package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qjz extends qjr {
    final /* synthetic */ EGLDisplay e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qjz(qkq qkqVar, EGLDisplay eGLDisplay, EGLSurface eGLSurface, EGLContext eGLContext, EGLConfig eGLConfig, qhv qhvVar, EGLDisplay eGLDisplay2) {
        super(qkqVar, eGLDisplay, eGLSurface, eGLContext, eGLConfig, 0, qhvVar);
        this.e = eGLDisplay2;
    }

    @Override // defpackage.qfn
    public final qgi b() {
        EGL14.eglMakeCurrent(this.e, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
        EGLDisplay eGLDisplay = ((qjr) this).b;
        EGL14.eglDestroyContext(eGLDisplay, this.d);
        EGL14.eglDestroySurface(eGLDisplay, this.c);
        return qgh.a;
    }
}
