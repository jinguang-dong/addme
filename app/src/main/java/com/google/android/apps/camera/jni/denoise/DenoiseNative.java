package com.google.android.apps.camera.jni.denoise;

import defpackage.paw;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DenoiseNative {
    static {
        paw.a(DenoiseNative.class, "gcastartup");
    }

    private DenoiseNative() {
    }

    public static native boolean denoiseImage(int i, int i2, ByteBuffer byteBuffer, int i3, int i4, ByteBuffer byteBuffer2, int i5, int i6, ByteBuffer byteBuffer3, int i7, int i8);
}
