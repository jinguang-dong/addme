package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qkw extends qmm {
    private final EGLDisplay a;

    public qkw(EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
        super(eGLSurface);
        this.a = eGLDisplay;
    }

    @Override // defpackage.qmm
    protected final /* bridge */ /* synthetic */ void b(Object obj) {
        EGL14.eglDestroySurface(this.a, (EGLSurface) obj);
    }
}
