package com.google.android.apps.camera.facedeblur.deeprestore.jni;

import defpackage.paw;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class DeepRestoreNative {
    static {
        paw.a(DeepRestoreNative.class, "gcastartup");
    }

    private DeepRestoreNative() {
    }

    public static native long createHandle(String str, ByteBuffer byteBuffer, String str2, boolean z, boolean z2, boolean z3, boolean z4);

    public static native int deepRestoreFaceDeblurRgb(long j, long j2, long j3, float f, long[] jArr, long[] jArr2, boolean z, boolean z2, long j4, int i);

    public static native void releaseHandle(long j);
}
