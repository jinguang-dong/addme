package com.google.android.apps.camera.jni.gyro;

import defpackage.paw;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class GyroQueueNative {
    static {
        paw.a(GyroQueueNative.class, "gcastartup");
    }

    public static native long createHandle(int[] iArr, int[] iArr2);

    public static native boolean getProjectionMatrix(long j, long j2, float f, float f2, float f3, long j3, float[] fArr);

    public static native boolean getTransformBetweenTime(long j, long j2, float f, float f2, float f3, long j3, float f4, float f5, float f6, long j4, float[] fArr);

    public static native boolean processAndEnqueueGyro(long j, float f, float f2, float f3, long j2);

    public static native void releaseHandle(long j);
}
