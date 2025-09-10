package com.google.googlex.gcam.hdrplus;

import android.hardware.camera2.TotalCaptureResult;
import com.google.googlex.gcam.base.OwningNativePointer;
import defpackage.tgn;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class NativeHdrPlusAndroidInterface extends NativeHdrPlusInterface implements tgn {
    public static final AtomicBoolean a = new AtomicBoolean();
    public final CharacteristicsCache b;

    public NativeHdrPlusAndroidInterface(CharacteristicsCache characteristicsCache) {
        this.b = characteristicsCache;
    }

    public static native void staticInitializeNative();

    public native boolean nativeAddPayloadFrame(CharacteristicsCache characteristicsCache, long j, int i, String str, TotalCaptureResult totalCaptureResult, long j2, long j3, Runnable runnable, long j4, Runnable runnable2, long j5, Runnable runnable3, OwningNativePointer owningNativePointer, Runnable runnable4);
}
