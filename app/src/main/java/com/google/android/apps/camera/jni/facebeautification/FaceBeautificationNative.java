package com.google.android.apps.camera.jni.facebeautification;

import com.google.android.apps.camera.facemetadata.conversions.FaceToBeautify;
import defpackage.paw;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class FaceBeautificationNative {
    static {
        paw.a(FaceBeautificationNative.class, "gcastartup");
    }

    private FaceBeautificationNative() {
    }

    public static native long createHandle(int i, int i2, boolean z, boolean z2, boolean z3, boolean z4);

    public static native byte[] doFaceBeautification(long j, int i, int i2, int i3, ByteBuffer byteBuffer, int i4, int i5, ByteBuffer byteBuffer2, int i6, int i7, ByteBuffer byteBuffer3, int i8, int i9, FaceToBeautify[] faceToBeautifyArr, int i10, int i11, long j2);

    public static native void releaseHandle(long j);
}
