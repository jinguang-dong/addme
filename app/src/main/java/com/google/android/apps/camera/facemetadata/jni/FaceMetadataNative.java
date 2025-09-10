package com.google.android.apps.camera.facemetadata.jni;

import com.google.android.apps.camera.facemetadata.conversions.FaceToBeautify;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class FaceMetadataNative {
    public static final AtomicBoolean a = new AtomicBoolean();

    private FaceMetadataNative() {
    }

    public static native long createHandle();

    public static native long[] generateFaceInfos(FaceToBeautify[] faceToBeautifyArr);

    public static native long[] generateFaceThumbnails(int i, int i2, long[] jArr, long j);

    public static native int getThumbnailSize(long j);

    public static native void releaseFaceInfos(long[] jArr);

    public static native void releaseFaceThumbnails(long[] jArr);

    public static native void releaseHandle(long j);
}
