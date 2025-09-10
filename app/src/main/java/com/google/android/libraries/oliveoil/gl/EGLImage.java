package com.google.android.libraries.oliveoil.gl;

import android.hardware.HardwareBuffer;
import android.opengl.EGL14;
import com.google.android.libraries.oliveoil.util.JniUtil;
import defpackage.qfo;
import defpackage.qfq;
import defpackage.qid;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class EGLImage implements qfo {
    public final long b;
    public final HardwareBuffer c;

    public EGLImage(HardwareBuffer hardwareBuffer) {
        int i = JniUtil.a;
        this.c = hardwareBuffer;
        long jCreateImage = createImage(hardwareBuffer);
        this.b = jCreateImage;
        if (jCreateImage >= 0 || jCreateImage < -15) {
        } else {
            throw new qid(String.format("Could not create EGLImage: %s (EGL error %d).", jCreateImage != -1 ? jCreateImage != -2 ? jCreateImage == -3 ? "eglCreateImageKHR failed" : "unknown error" : "eglGetNativeClientBufferANDROID failed" : "unsupported Android version", Integer.valueOf(EGL14.eglGetError())));
        }
    }

    public static native void attachToRbo(long j);

    public static native void attachToTexture(long j);

    private static native void close(long j);

    private static native long createImage(HardwareBuffer hardwareBuffer);

    public final qfq a() {
        HardwareBuffer hardwareBuffer = this.c;
        return new qfq(hardwareBuffer.getWidth(), hardwareBuffer.getHeight());
    }

    @Override // defpackage.qfo, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        close(this.b);
    }
}
