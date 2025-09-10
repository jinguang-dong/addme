package com.google.android.apps.camera.jni.surface;

import android.view.Surface;
import defpackage.paw;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SurfaceNative {
    static {
        paw.a(SurfaceNative.class, "gcastartup");
    }

    public static native int setSurfaceGeometry(Surface surface, int i, int i2, int i3);

    public static native int setSurfaceTransform(Surface surface, int i);

    public static native void tryAllocateBuffers(Surface surface);
}
