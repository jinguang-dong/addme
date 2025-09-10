package defpackage;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.opengl.EGL14;
import android.opengl.EGL15;
import android.opengl.EGLDisplay;
import android.opengl.EGLSync;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hvk implements paq {
    public final AutoCloseable a;
    final /* synthetic */ hvl b;

    public hvk(hvl hvlVar, AutoCloseable autoCloseable) {
        this.b = hvlVar;
        this.a = autoCloseable;
    }

    public final AutoCloseable a() {
        AutoCloseable autoCloseable = this.a;
        autoCloseable.getClass();
        return autoCloseable;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        if (this.a == null) {
            return;
        }
        final szh szhVar = new szh();
        final szh szhVar2 = new szh();
        hvl hvlVar = this.b;
        hvlVar.c.execute(new Runnable() { // from class: hvi
            @Override // java.lang.Runnable
            public final void run() {
                szh szhVar3 = szhVar2;
                EGLDisplay eGLDisplayEglGetCurrentDisplay = EGL14.eglGetCurrentDisplay();
                szhVar3.e(eGLDisplayEglGetCurrentDisplay);
                EGLSync eGLSyncEglCreateSync = EGL15.eglCreateSync(eGLDisplayEglGetCurrentDisplay, 12537, new long[]{12344}, 0);
                boolean z = qia.a;
                szhVar.e(eGLSyncEglCreateSync);
            }
        });
        hvlVar.d.execute(new Runnable() { // from class: hvj
            @Override // java.lang.Runnable
            public final void run() throws Exception {
                EGLSync eGLSync = (EGLSync) ske.V(szhVar);
                EGLDisplay eGLDisplay = (EGLDisplay) ske.V(szhVar2);
                EGL15.eglClientWaitSync(eGLDisplay, eGLSync, 1, -1L);
                boolean z = qia.a;
                EGL15.eglDestroySync(eGLDisplay, eGLSync);
                hvk hvkVar = this.a;
                try {
                    AutoCloseable autoCloseable = hvkVar.a;
                    if (autoCloseable instanceof AutoCloseable) {
                        autoCloseable.close();
                        return;
                    }
                    if (autoCloseable instanceof ExecutorService) {
                        a.s((ExecutorService) autoCloseable);
                        return;
                    }
                    if (autoCloseable instanceof TypedArray) {
                        ((TypedArray) autoCloseable).recycle();
                        return;
                    }
                    if (autoCloseable instanceof MediaMetadataRetriever) {
                        ((MediaMetadataRetriever) autoCloseable).release();
                        return;
                    }
                    if (autoCloseable instanceof MediaDrm) {
                        ((MediaDrm) autoCloseable).release();
                    } else if (autoCloseable instanceof DrmManagerClient) {
                        ((DrmManagerClient) autoCloseable).release();
                    } else {
                        if (!(autoCloseable instanceof ContentProviderClient)) {
                            throw new IllegalArgumentException();
                        }
                        ((ContentProviderClient) autoCloseable).release();
                    }
                } catch (Exception e) {
                    ((sgt) ((sgt) hvl.a.b().i(e)).M(1604)).E("Error while closing resource %s: %s", hvkVar.a, e);
                }
            }
        });
    }

    public final String toString() {
        return "GLFenceGuarded[" + String.valueOf(this.a) + "]";
    }
}
