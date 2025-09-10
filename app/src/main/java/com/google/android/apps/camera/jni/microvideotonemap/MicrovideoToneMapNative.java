package com.google.android.apps.camera.jni.microvideotonemap;

import android.graphics.Bitmap;
import defpackage.paw;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MicrovideoToneMapNative {
    static {
        paw.a(MicrovideoToneMapNative.class, "gcastartup");
    }

    public static native int argbToYuv(Bitmap bitmap, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3);

    public static native byte[] extractMeanVarianceMappingNative(int i, int i2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i3, int i4, ByteBuffer byteBuffer4, ByteBuffer byteBuffer5, ByteBuffer byteBuffer6, int i5, int i6);
}
