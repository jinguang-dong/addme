package com.google.android.libraries.camera.jni.graphics;

import android.hardware.HardwareBuffer;
import defpackage.paw;

/* compiled from: PG */
/* loaded from: classes.dex */
public class HardwareBuffers {
    static {
        paw.a(HardwareBuffers.class, "graphics-jni");
    }

    private HardwareBuffers() {
    }

    public static native HardwareBuffer fork(HardwareBuffer hardwareBuffer);

    public static native boolean lockingIsSupported();
}
