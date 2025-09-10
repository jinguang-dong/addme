package com.google.googlex.gcam;

import android.graphics.Bitmap;
import android.hardware.HardwareBuffer;
import android.view.Surface;
import com.google.googlex.gcam.base.OwningNativePointer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AndroidJniUtils {
    private AndroidJniUtils() {
    }

    public static native OwningNativePointer getAHardwareBufferPtr(HardwareBuffer hardwareBuffer);

    static native String invokeRunnableAndCatch(Runnable runnable, boolean z);

    public static native long lockBitmap(Bitmap bitmap);

    static native long lockSurface(Surface surface);

    public static native void unlockBitmap(Bitmap bitmap);

    static native void unlockSurface(long j);
}
