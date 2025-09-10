package defpackage;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hcb {
    private static final sgv b = sgv.g("hcb");
    private static pas c;
    public final int a;
    private final Context d;

    public hcb(Context context, hbj hbjVar) {
        this.d = context;
        ((Integer) hbjVar.a(gzo.d).get()).intValue();
        this.a = ((Integer) hbjVar.a(gzo.e).get()).intValue();
    }

    public final epj a() {
        return eox.c(this.d).b();
    }

    public final ezs b(eqi eqiVar, pas pasVar) {
        Integer numValueOf;
        if (c == null) {
            EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
            int[] iArr = new int[2];
            EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1);
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, new int[]{12351, 12430, 12329, 0, 12352, 4, 12339, 1, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0);
            if (iArr2[0] == 0) {
                ((sgt) b.c().M(1148)).s("No EGL configurations found!");
                numValueOf = null;
            } else {
                EGLConfig eGLConfig = eGLConfigArr[0];
                EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplayEglGetDisplay, eGLConfig, new int[]{12375, 64, 12374, 64, 12344}, 0);
                EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplayEglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext);
                int[] iArr3 = new int[1];
                GLES20.glGetIntegerv(3379, iArr3, 0);
                int i = iArr3[0];
                EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
                EGL14.eglDestroySurface(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface);
                EGL14.eglDestroyContext(eGLDisplayEglGetDisplay, eGLContextEglCreateContext);
                numValueOf = Integer.valueOf(i);
            }
            if (numValueOf == null) {
                c = new pas(2048, 2048);
            } else if (numValueOf.intValue() > 4096) {
                c = new pas(4096, 4096);
            } else {
                c = new pas(numValueOf.intValue(), numValueOf.intValue());
            }
        }
        int i2 = this.a;
        int i3 = pasVar.b;
        int i4 = pasVar.a;
        double d = i4 * i3;
        double d2 = i2;
        pas pasVar2 = c;
        if (d >= d2 || i4 >= pasVar2.a || i3 >= pasVar2.b) {
            double dMin = Math.min(Math.sqrt(d2 / pasVar.b()), 1.0d);
            double d3 = i4;
            int iRound = (int) Math.round(d3 * dMin);
            double d4 = i3;
            int iRound2 = (int) Math.round(dMin * d4);
            int i5 = pasVar2.a;
            if (iRound > i5 || iRound2 > pasVar2.b) {
                int i6 = pasVar2.b;
                double d5 = i6 / d4;
                double d6 = i5 / d3;
                if (d6 <= d5) {
                    d5 = d6;
                }
                pasVar = new pas(Math.min((int) Math.round(d3 * d5), i5), Math.min((int) Math.round(d4 * d5), i6));
            } else {
                pasVar = new pas(iRound, iRound2);
            }
        }
        return (ezs) ((ezs) ((ezs) ((ezs) new ezs().v(eqiVar)).H()).n()).r(pasVar.a, pasVar.b);
    }
}
