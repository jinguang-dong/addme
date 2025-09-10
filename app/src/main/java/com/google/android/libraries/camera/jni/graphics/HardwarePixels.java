package com.google.android.libraries.camera.jni.graphics;

import android.hardware.HardwareBuffer;
import defpackage.paq;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class HardwarePixels implements paq {
    public final HardwareBuffer a;
    public final long b;
    public final AtomicBoolean c = new AtomicBoolean(false);

    public HardwarePixels(HardwareBuffer hardwareBuffer) {
        this.a = HardwareBuffers.fork(hardwareBuffer);
        this.b = nativeLockPlanes(hardwareBuffer, 3L);
    }

    public static native ByteBuffer nativeGetData(long j, int i, int i2, int i3);

    private static native long nativeLockPlanes(HardwareBuffer hardwareBuffer, long j);

    public static native int nativePixelStride(long j, int i);

    public static native int nativePlaneCount(long j);

    public static native int nativeRowStride(long j, int i);

    private static native void nativeUnlockBuffer(HardwareBuffer hardwareBuffer);

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        if (this.c.compareAndSet(false, true)) {
            HardwareBuffer hardwareBuffer = this.a;
            nativeUnlockBuffer(hardwareBuffer);
            hardwareBuffer.close();
        }
    }
}
