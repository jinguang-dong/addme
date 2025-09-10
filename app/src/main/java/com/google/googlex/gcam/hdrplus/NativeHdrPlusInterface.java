package com.google.googlex.gcam.hdrplus;

import com.google.googlex.gcam.base.OwningNativePointer;
import com.google.googlex.gcam.base.function.IntByteArrayConsumer;
import com.google.googlex.gcam.base.function.IntConsumer;
import com.google.googlex.gcam.base.function.IntFloatConsumer;
import com.google.googlex.gcam.base.function.IntLongConsumer;
import com.google.googlex.gcam.base.function.IntStringConsumer;
import com.google.googlex.gcam.clientallocator.GrayS16ClientAllocator;
import com.google.googlex.gcam.clientallocator.InterleavedF16ClientAllocator;
import com.google.googlex.gcam.clientallocator.InterleavedS16ClientAllocator;
import com.google.googlex.gcam.clientallocator.InterleavedU16ClientAllocator;
import com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator;
import com.google.googlex.gcam.clientallocator.RawClientAllocator;
import com.google.googlex.gcam.clientallocator.YuvClientAllocator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public class NativeHdrPlusInterface {
    private static final Object a = new Object();
    private static final AtomicBoolean b = new AtomicBoolean();

    public NativeHdrPlusInterface() {
        synchronized (a) {
            AtomicBoolean atomicBoolean = b;
            if (atomicBoolean.get()) {
                return;
            }
            init();
            atomicBoolean.set(true);
        }
    }

    private static native void init();

    private native void nativeInitializeClutMapFromOpenFile(int i, long j, long j2, int i2, long j3);

    private native void nativeSetFinalImageRgb16Allocator(long j, InterleavedU16ClientAllocator interleavedU16ClientAllocator);

    public native boolean nativeAddPayloadFrame(long j, int i, long j2, long j3, long j4, Runnable runnable, long j5, Runnable runnable2, long j6, Runnable runnable3, OwningNativePointer owningNativePointer, Runnable runnable4);

    public native void nativeAddViewfinderFrame(long j, int i, long j2, long j3, long j4, long j5, Runnable runnable);

    public native void nativeAddViewfinderMetadataOnly(long j, int i, long j2, long j3);

    public native float nativeGetPostZoomSharpenStrength(long j, float f);

    public native void nativeInitializeAlmondFromOpenFile(int i, long j, long j2, long j3);

    public native void nativeInitializeKeplerV1FromOpenFile(long j, long j2);

    public native void nativeInitializeLancetFromOpenFile(int i, long j, long j2, boolean z, long j3);

    public native void nativeInitializePecanFromOpenFile(long j, long j2, long j3, long j4);

    public native void nativeInitializeWalnutFromOpenFile(int i, long j, long j2, long j3);

    public native void nativeSetBaseFrameAeCallback(long j, BaseFrameAeCallback baseFrameAeCallback);

    public native void nativeSetBaseFrameCallback(long j, BaseFrameCallback baseFrameCallback);

    public native void nativeSetFinalImageCallback(long j, ManagedImageCallback managedImageCallback);

    public native void nativeSetFinalImageRgbAllocator(long j, InterleavedU8ClientAllocator interleavedU8ClientAllocator);

    public native void nativeSetFinalImageYuvAllocator(long j, YuvClientAllocator yuvClientAllocator);

    public native void nativeSetFrameRescorerCallback(long j, FrameRescorerCallback frameRescorerCallback);

    public native void nativeSetMergedChromaDenoisedAllocator(long j, InterleavedS16ClientAllocator interleavedS16ClientAllocator);

    public native void nativeSetMergedChromaDenoisedAllocatorF16(long j, InterleavedF16ClientAllocator interleavedF16ClientAllocator);

    public native void nativeSetMergedChromaDenoisedCallback(long j, MergedChromaDenoisedCallback mergedChromaDenoisedCallback);

    public native void nativeSetMergedDngCallback(long j, EncodedBlobCallback encodedBlobCallback);

    public native void nativeSetMergedLumaDenoisedAllocator(long j, GrayS16ClientAllocator grayS16ClientAllocator);

    public native void nativeSetMergedLumaDenoisedCallback(long j, MergedLumaDenoisedCallback mergedLumaDenoisedCallback);

    public native void nativeSetMergedPdAllocator(long j, InterleavedU16ClientAllocator interleavedU16ClientAllocator);

    public native void nativeSetMergedPdCallback(long j, IntLongConsumer intLongConsumer);

    public native void nativeSetMergedRawImageAllocator(long j, RawClientAllocator rawClientAllocator);

    public native void nativeSetMergedRawImageCallback(long j, MergedRawCallback mergedRawCallback);

    public native void nativeSetPlanarMergedRawCallback(long j, PlanarMergedRawCallback planarMergedRawCallback);

    public native void nativeSetPostviewCallback(long j, ManagedImageCallback managedImageCallback);

    public native void nativeSetPostviewRgbAllocator(long j, InterleavedU8ClientAllocator interleavedU8ClientAllocator);

    public native void nativeSetPostviewYuvAllocator(long j, YuvClientAllocator yuvClientAllocator);

    public native void nativeSetProgressCallback(long j, IntFloatConsumer intFloatConsumer);

    public native void nativeSetShotStatusCallbacks(long j, IntByteArrayConsumer intByteArrayConsumer, IntStringConsumer intStringConsumer, IntConsumer intConsumer);

    public native boolean nativeTemporallyBinViewfinderFrame(long j, int i, long j2, long j3, Runnable runnable, long j4, Runnable runnable2, long j5, long j6, Runnable runnable3, boolean z, int i2);
}
