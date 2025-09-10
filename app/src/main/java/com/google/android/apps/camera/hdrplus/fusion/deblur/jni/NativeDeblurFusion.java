package com.google.android.apps.camera.hdrplus.fusion.deblur.jni;

import com.google.android.apps.camera.hdrplus.fusion.api.FusionProgressCallback;
import com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator;
import defpackage.ifa;

/* compiled from: PG */
/* loaded from: classes.dex */
public class NativeDeblurFusion {
    public static final boolean a(ifa ifaVar) {
        return nativeLoadModelIntoCache(ifaVar.h());
    }

    public static native long nativeDeblurFace(byte[] bArr, InterleavedU8ClientAllocator interleavedU8ClientAllocator, InterleavedU8ClientAllocator interleavedU8ClientAllocator2, FusionProgressCallback fusionProgressCallback);

    public static native boolean nativeInitialize(String str, String str2, boolean z, boolean z2);

    private static native boolean nativeLoadModelIntoCache(byte[] bArr);

    public static native int nativeRetrieveFusionType(long j);

    public static native long nativeRetrieveReferenceDebugImage(long j);

    public static native boolean nativeRetrieveReferenceFlowRoi(long j, float f, float f2, long j2, float f3, float f4, long j3, long j4, boolean z, String str, long j5, int i, boolean z2, boolean z3);

    public static native long nativeRetrieveResultImage(long j);

    public static native int nativeRetrieveResultStatus(long j);

    public static native long nativeRetrieveSourceDebugImage(long j);

    public static native long nativeRetrieveWarpedReferenceDebugImage(long j);
}
