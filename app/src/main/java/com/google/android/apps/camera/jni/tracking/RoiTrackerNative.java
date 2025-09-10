package com.google.android.apps.camera.jni.tracking;

import android.content.Context;
import android.hardware.HardwareBuffer;
import defpackage.paw;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class RoiTrackerNative {
    static {
        paw.a(RoiTrackerNative.class, "gcastartup");
    }

    private RoiTrackerNative() {
    }

    public static native long createHandle(Context context, String str, int i, boolean z, int i2, long j, long j2, int i3, long j3, long j4, boolean z2);

    public static native int getCurrentTrackerIndex(long j);

    public static native boolean getIsRefresherCalled(long j);

    public static native void releaseHandle(long j);

    public static native int startTracking(long j, boolean z, int i, int i2, float f, int i3, int i4, ByteBuffer byteBuffer, int i5, int i6, ByteBuffer byteBuffer2, int i7, int i8, ByteBuffer byteBuffer3, int i9, int i10, HardwareBuffer hardwareBuffer, float[] fArr, boolean z2, int i11);

    public static native void stopTracking(long j);

    public static native int updateRoi(long j, int i, float f, int i2, int i3, ByteBuffer byteBuffer, int i4, int i5, ByteBuffer byteBuffer2, int i6, int i7, ByteBuffer byteBuffer3, int i8, int i9, float[] fArr, HardwareBuffer hardwareBuffer, float[] fArr2, boolean z, int i10);
}
