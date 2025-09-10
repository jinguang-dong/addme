package com.google.android.apps.camera.jni.eisutil;

import defpackage.paw;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class FrameUtilNative {
    static {
        paw.a(FrameUtilNative.class, "gcastartup");
    }

    public static native void mirrorYUV420888(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, ByteBuffer byteBuffer6, int i6, int i7, int i8, boolean z);
}
