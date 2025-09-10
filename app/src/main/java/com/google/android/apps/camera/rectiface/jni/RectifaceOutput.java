package com.google.android.apps.camera.rectiface.jni;

import defpackage.lpa;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class RectifaceOutput {
    public final long a = initializeImpl();

    static {
        lpa.a();
    }

    public static native int getAnglerfishFallbackStatusImpl(long j, int i);

    private static native int getAnglerfishFallbackStatusSizeImpl(long j);

    private static native int getCameraFovInDegreeImpl(long j);

    private static native float getFaceConformalityAfterShapeCorrectionImpl(long j, int i);

    private static native int getFaceConformalityAfterShapeCorrectionSizeImpl(long j);

    private static native float getFaceConformalityBeforeShapeCorrectionImpl(long j, int i);

    private static native int getFaceConformalityBeforeShapeCorrectionSizeImpl(long j);

    private static native int getFaceDistortionCorrectionProcessingTimeMsImpl(long j);

    public static native boolean getIsAnglerfishAppliedImpl(long j);

    private static native int getPortraitRelightingTimeMsImpl(long j);

    private static native int getSegmentationTimeMsImpl(long j);

    private static native int getShapeCorrectionModeImpl(long j);

    private static native long initializeImpl();

    private static native void releaseImpl(long j);

    public final float a(int i) {
        return getFaceConformalityAfterShapeCorrectionImpl(this.a, i);
    }

    public final float b(int i) {
        return getFaceConformalityBeforeShapeCorrectionImpl(this.a, i);
    }

    public final int c() {
        return getAnglerfishFallbackStatusSizeImpl(this.a);
    }

    public final int d() {
        return getCameraFovInDegreeImpl(this.a);
    }

    public final int e() {
        return getFaceConformalityAfterShapeCorrectionSizeImpl(this.a);
    }

    public final int f() {
        return getFaceConformalityBeforeShapeCorrectionSizeImpl(this.a);
    }

    public final int g() {
        return getFaceDistortionCorrectionProcessingTimeMsImpl(this.a);
    }

    public final int h() {
        return getPortraitRelightingTimeMsImpl(this.a);
    }

    public final int i() {
        return getSegmentationTimeMsImpl(this.a);
    }

    public final int j() {
        return getShapeCorrectionModeImpl(this.a);
    }

    public final void k() {
        releaseImpl(this.a);
    }
}
