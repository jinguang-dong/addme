package com.google.android.apps.camera.jni.libyuv;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class LibyuvJni {
    public static native int nativeRotateBitmap(Bitmap bitmap, Bitmap bitmap2, int i);

    public static native int nativeYUV420ToBitmap(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, Bitmap bitmap, int i5, int i6, int i7, boolean z);
}
