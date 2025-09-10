package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.view.Surface;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rue {
    public Object a;
    public final Object b;
    public Object c;
    public Object d;

    public rue(byte[] bArr) {
        this.b = null;
        EGLDisplay eGLDisplayE = e();
        this.a = eGLDisplayE;
        EGLConfig eGLConfigC = c(eGLDisplayE, false, true);
        this.c = d((EGLDisplay) this.a, EGL14.EGL_NO_CONTEXT, eGLConfigC);
        this.d = EGL14.eglCreatePbufferSurface((EGLDisplay) this.a, eGLConfigC, new int[]{12375, 1, 12374, 1, 12344}, 0);
    }

    private static EGLConfig c(EGLDisplay eGLDisplay, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4));
        if (z) {
            arrayList.addAll(Arrays.asList(12610, 1));
        }
        if (z2) {
            arrayList.addAll(Arrays.asList(12339, 1));
        }
        arrayList.add(12344);
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = ((Integer) arrayList.get(i)).intValue();
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, iArr2, 0);
        if (iArr2[0] != 0) {
            return eGLConfigArr[0];
        }
        throw new RuntimeException("Could not find a valid EGL configuration");
    }

    private static EGLContext d(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLConfig eGLConfig) {
        return EGL14.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, new int[]{12440, 2, 12344}, 0);
    }

    private static EGLDisplay e() {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        if (Objects.equals(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            throw new RuntimeException("unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            return eGLDisplayEglGetDisplay;
        }
        throw new RuntimeException("unable to initialize EGL14");
    }

    public final void a() {
        if (!Objects.equals(this.a, EGL14.EGL_NO_DISPLAY)) {
            EGL14.eglMakeCurrent((EGLDisplay) this.a, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroySurface((EGLDisplay) this.a, (EGLSurface) this.d);
            EGL14.eglDestroyContext((EGLDisplay) this.a, (EGLContext) this.c);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate((EGLDisplay) this.a);
        }
        this.a = EGL14.EGL_NO_DISPLAY;
        this.c = EGL14.EGL_NO_CONTEXT;
        this.d = EGL14.EGL_NO_SURFACE;
        Object obj = this.b;
        if (obj != null) {
            ((Surface) obj).release();
        }
    }

    public final void b() {
        Object obj = this.a;
        EGLSurface eGLSurface = (EGLSurface) this.d;
        EGL14.eglMakeCurrent((EGLDisplay) obj, eGLSurface, eGLSurface, (EGLContext) this.c);
    }

    public rue(EGLContext eGLContext, Surface surface) {
        this.b = surface;
        EGLDisplay eGLDisplayE = e();
        this.a = eGLDisplayE;
        EGLConfig eGLConfigC = c(eGLDisplayE, true, false);
        this.c = d((EGLDisplay) this.a, eGLContext == null ? EGL14.EGL_NO_CONTEXT : eGLContext, eGLConfigC);
        this.d = EGL14.eglCreateWindowSurface((EGLDisplay) this.a, eGLConfigC, surface, new int[]{12344}, 0);
    }

    public rue() {
        this.a = null;
        this.b = new HashMap();
        this.c = null;
        this.d = null;
    }
}
