package defpackage;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hvn {
    public static final int[] a = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 0, 12326, 0, 12344};
    public EGLConfig b;
    public EGLDisplay c;
    public EGLContext d;
    public EGLSurface e;
    public EGL10 f;
    public GL10 g;
    public final Handler i;
    public final jxa l;
    public volatile boolean h = false;
    public final Object j = new Object();
    public final Runnable k = new hvm(this, 1);

    public hvn(SurfaceTexture surfaceTexture, Handler handler, jxa jxaVar) {
        this.i = handler;
        this.l = jxaVar;
        handler.post(new hdk(this, surfaceTexture, 17));
        Object obj = new Object();
        synchronized (obj) {
            handler.post(new hvm(obj, 2));
            try {
                obj.wait();
            } catch (InterruptedException unused) {
            }
        }
    }
}
