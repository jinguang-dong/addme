package com.google.babelfish.device.avenh.l2l.apps.common;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class VideoProcessorUtils {
    static {
        System.loadLibrary("l2l_video_processor_utils_jni");
    }

    public static native void nativeRotateFrame(ByteBuffer byteBuffer, int i, int i2, int i3, ByteBuffer byteBuffer2);
}
