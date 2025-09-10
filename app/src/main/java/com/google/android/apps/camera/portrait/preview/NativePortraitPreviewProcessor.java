package com.google.android.apps.camera.portrait.preview;

import android.hardware.HardwareBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class NativePortraitPreviewProcessor {
    public long a = 0;

    public static native long create(byte[] bArr);

    private static native void destroy(long j);

    public static native boolean nativeProcess(long j, HardwareBuffer hardwareBuffer, HardwareBuffer hardwareBuffer2, byte[] bArr, HardwareBuffer hardwareBuffer3);

    public final void a() {
        destroy(this.a);
        this.a = 0L;
    }
}
