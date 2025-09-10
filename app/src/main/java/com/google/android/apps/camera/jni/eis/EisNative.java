package com.google.android.apps.camera.jni.eis;

import defpackage.paw;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class EisNative {
    static {
        paw.a(EisNative.class, "gcastartup");
    }

    public static native long createHandle(int i, int i2, int i3, float f, boolean z, int i4, String str, int i5, String str2);

    public static native int getNumStrips(long j);

    public static native boolean getTransformBetweenFrames(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, int i, int i2, boolean z, boolean z2, float f, float f2, float f3, float f4, float f5, float f6, int i3, int i4, int i5, float[] fArr);

    public static native long processFrame(long j, byte[] bArr, int i, int i2, long j2, long j3, long j4, long j5, float f, float f2, float f3, boolean z, long j6, float[] fArr, float[] fArr2, float[] fArr3, int i3, boolean z2);

    public static native boolean processGyro(long j, float f, float f2, float f3, long j2);

    public static native boolean processLensOffset(long j, float f, float f2, long j2, int i);

    public static native void releaseHandle(long j);

    public static native void setActiveArraySize(long j, int i, int i2);

    public static native void setCropWindowSize(long j, int i, int i2);

    public static native void setStabilizationStrength(long j, float f);
}
