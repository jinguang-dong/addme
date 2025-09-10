package com.google.android.apps.camera.ui.hotshot.jni;

import defpackage.paw;
import defpackage.sgt;
import defpackage.sgv;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class HotshotObjectDetector {
    public static final sgv a = sgv.g("com.google.android.apps.camera.ui.hotshot.jni.HotshotObjectDetector");
    public static final boolean b;
    public long c = 0;

    static {
        boolean z;
        try {
            paw.a(HotshotObjectDetector.class, "hotshot_object_detector_jni");
            z = true;
        } catch (IllegalStateException | UnsatisfiedLinkError e) {
            ((sgt) ((sgt) a.b().i(e)).M(5143)).v("Failed to load hotshot object detector. ex:%s", e);
            z = false;
        }
        b = z;
    }

    public static native long createHandle();

    public static native byte[] getProcessDetectionResult(long j, ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4, ByteBuffer byteBuffer3, int i5, int i6, byte[] bArr);

    public static native void releaseHandle(long j);

    public static native void setMode(long j, int i);
}
