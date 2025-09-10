package defpackage;

import android.opengl.EGL15;
import android.opengl.EGLDisplay;
import android.opengl.EGLSync;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qjo implements qjq {
    final /* synthetic */ EGLDisplay a;
    final /* synthetic */ EGLSync b;

    public qjo(EGLDisplay eGLDisplay, EGLSync eGLSync) {
        this.a = eGLDisplay;
        this.b = eGLSync;
    }

    @Override // defpackage.qjq
    public final void a() {
        EGL15.eglClientWaitSync(this.a, this.b, 1, -1L);
    }

    @Override // defpackage.qfo, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        EGL15.eglDestroySync(this.a, this.b);
    }
}
