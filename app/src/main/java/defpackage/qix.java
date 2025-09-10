package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES30;
import android.opengl.GLException;
import android.util.Log;
import com.google.acmi.gldebug.GLDebug;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qix implements Callable {
    private final qis a;
    private final qkq b;
    private final boolean c;
    private final rnu d;

    public qix(qis qisVar, qkq qkqVar, rnu rnuVar, boolean z) {
        this.a = qisVar;
        this.b = qkqVar;
        this.d = rnuVar;
        this.c = z;
    }

    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object, qhh] */
    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final qjy call() {
        try {
            try {
                qkq qkqVar = this.b;
                rnu rnuVar = this.d;
                qfq qfqVar = new qfq(1, 1);
                boolean z = this.c;
                EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
                if (eGLDisplayEglGetDisplay == EGL14.EGL_NO_DISPLAY) {
                    throw new qic("EGL Error: Bad display: ".concat(String.valueOf(qkd.c())));
                }
                int[] iArr = qkd.a;
                synchronized (iArr) {
                    if (iArr[0] == 0 && !EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
                        throw new qic("EGL Error: eglInitialize failed: " + qkd.c());
                    }
                }
                int[] iArr2 = new int[1];
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int length = ((qhv) rnuVar.a).b.length;
                if (!EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, new int[]{12352, 4, 12324, 8, 12323, length >= 2 ? 8 : 0, 12322, length >= 3 ? 8 : 0, 12321, length >= 4 ? 8 : 0, 12325, 0, 12326, 0, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0)) {
                    throw new IllegalArgumentException("EGL Error: eglChooseConfig failed!");
                }
                if (iArr2[0] == 0) {
                    throw new IllegalArgumentException("Could not find suitable EGLConfig!");
                }
                EGLConfig eGLConfig = eGLConfigArr[0];
                int[] iArr3 = {12440, qkqVar.b, 12344};
                EGLContext eGLContext = EGL14.EGL_NO_CONTEXT;
                if (z) {
                    int i = GLDebug.a;
                    int[] iArr4 = {12540, 1, 0, 0, 0};
                    System.arraycopy(iArr3, 0, iArr4, 2, 3);
                    iArr3 = iArr4;
                }
                EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplayEglGetDisplay, eGLConfig, eGLContext, iArr3, 0);
                if (eGLContextEglCreateContext == null || eGLContextEglCreateContext == EGL14.EGL_NO_CONTEXT) {
                    throw qic.a(qkqVar);
                }
                EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplayEglGetDisplay, eGLConfig, new int[]{12375, qfqVar.b(), 12374, qfqVar.a(), 12344}, 0);
                if (eGLSurfaceEglCreatePbufferSurface == EGL14.EGL_NO_SURFACE) {
                    throw new qic("EGL Error: Bad surface: ".concat(String.valueOf(qkd.c())));
                }
                EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext);
                if (z) {
                    int i2 = GLDebug.a;
                    GLDebug.nativeEnableGLDebugInfos(new GLDebug.OnGLDebugMessageJNIListener() { // from class: fbg
                    });
                }
                String strGlGetString = GLES30.glGetString(7938);
                String[] strArrSplit = strGlGetString.split("\\s");
                if (strArrSplit.length < 3 || !strArrSplit[0].equals("OpenGL") || !strArrSplit[1].equals("ES")) {
                    throw new qic(a.bw(strGlGetString, "Unexpected GL version string '", "'!"));
                }
                String str = strArrSplit[2];
                String[] strArrSplit2 = str.split("\\.");
                if (strArrSplit2.length == 1) {
                    strArrSplit2 = new String[]{strArrSplit2[0], "0"};
                }
                int length2 = strArrSplit2.length;
                if (length2 != 2 && length2 != 3) {
                    throw new qic(a.bw(str, "Unexpected GL version format '", "'!"));
                }
                try {
                    qjz qjzVar = new qjz(new qkq(Integer.parseInt(strArrSplit2[0]), Integer.parseInt(strArrSplit2[1])), eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext, eGLConfig, (qhv) qpt.E(rnuVar.a, qfqVar), eGLDisplayEglGetDisplay);
                    qkq qkqVar2 = ((qjr) qjzVar).a;
                    if (qkqVar2.compareTo(qkqVar) >= 0) {
                        return qjzVar;
                    }
                    Log.e("GLRootCanvasCore", "Wanted " + qkqVar.toString() + " but got: " + qkqVar2.toString());
                    qjzVar.close();
                    throw qic.a(qkqVar);
                } catch (NumberFormatException unused) {
                    throw new qic(a.bw(str, "Unexpected numerical GL version format '", "'!"));
                }
            } catch (RuntimeException e) {
                Log.e("GLContexts", "Unexpected error while creating GLRoot: ".concat(String.valueOf(e.getMessage())));
                throw e;
            }
        } catch (GLException | IllegalArgumentException | qic e2) {
            Log.e("GLContexts", "Failed to create GLRoot: ".concat(String.valueOf(e2.getMessage())));
            qis qisVar = this.a;
            qkq qkqVar3 = this.b;
            Log.e("GLContexts", "Context: " + qisVar.toString() + ", Min Version: " + qkqVar3.toString());
            return null;
        }
    }
}
