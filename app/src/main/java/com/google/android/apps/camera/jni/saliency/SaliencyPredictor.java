package com.google.android.apps.camera.jni.saliency;

import com.bumptech.glide.qd.MyBPCgKwEjJI;
import java.nio.Buffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SaliencyPredictor {
    public long a;
    public final AtomicBoolean b = new AtomicBoolean(true);

    private native void nativeClose(long j);

    public static native long nativeLoad(Boolean bool);

    public final void a() {
        if (this.b.getAndSet(true)) {
            return;
        }
        nativeClose(this.a);
    }

    protected final void finalize() throws Throwable {
        try {
            a();
        } finally {
            super.finalize();
        }
    }

    public native float[] nativeGetSaliencyHeatMap(long j, int i, int i2, Buffer buffer, int i3, int i4, Buffer buffer2, int i5, int i6, Buffer buffer3, int i7, int i8, float f, float f2, float[] fArr);

    static {
        try {
            System.loadLibrary("saliency_predictor_jni");
        } catch (UnsatisfiedLinkError e) {
            if (MyBPCgKwEjJI.CPtBWO.equals(System.getProperty("java.vm.name"))) {
                throw e;
            }
        }
    }
}
