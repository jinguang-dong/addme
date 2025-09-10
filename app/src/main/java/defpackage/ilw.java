package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ilw extends Handler {
    private final WeakReference a;

    public ilw(ilx ilxVar, Looper looper) {
        super(looper);
        this.a = new WeakReference(ilxVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        ilx ilxVar = (ilx) this.a.get();
        if (ilxVar == null) {
            return;
        }
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                ilxVar.c.a();
                return;
            } else {
                if (i != 3) {
                    return;
                }
                getLooper().quitSafely();
                return;
            }
        }
        long j = message.arg1;
        long j2 = message.arg2;
        float[] fArr = (float[]) message.obj;
        ilu iluVar = ilxVar.b;
        if (!iluVar.f) {
            ((sgt) ilu.a.b().M(2150)).s("Received a frame to process, but the encoder either hasn't started or has already stopped. This should not happen.");
            iluVar.f();
            return;
        }
        iluVar.g.b();
        iluVar.h.g(fArr);
        iluVar.f();
        rue rueVar = iluVar.g;
        EGLExt.eglPresentationTimeANDROID((EGLDisplay) rueVar.a, (EGLSurface) rueVar.d, (4294967295L & j2) | (j << 32));
        rue rueVar2 = iluVar.g;
        EGL14.eglSwapBuffers((EGLDisplay) rueVar2.a, (EGLSurface) rueVar2.d);
        iluVar.e++;
    }
}
