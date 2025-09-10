package org.brotli.wrapper.dec;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class DecoderJNI {
    public static native ByteBuffer nativeCreate(long[] jArr);

    public static native void nativeDestroy(long[] jArr);

    public static native ByteBuffer nativePull(long[] jArr);

    public static native void nativePush(long[] jArr, int i);
}
