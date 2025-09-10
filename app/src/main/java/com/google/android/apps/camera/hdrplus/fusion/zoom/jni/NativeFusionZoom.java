package com.google.android.apps.camera.hdrplus.fusion.zoom.jni;

import com.google.android.apps.camera.hdrplus.fusion.api.FusionProgressCallback;
import com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator;
import defpackage.igb;

/* compiled from: PG */
/* loaded from: classes.dex */
public class NativeFusionZoom {
    public static final boolean a(igb igbVar) {
        return nativeLoadModelIntoCache(igbVar.h());
    }

    public static native long nativeClone(long j, long j2);

    public static native boolean nativeInitialize(String str, String str2, boolean z);

    private static native boolean nativeLoadModelIntoCache(byte[] bArr);

    public static native long nativeProcess(byte[] bArr, byte[] bArr2, InterleavedU8ClientAllocator interleavedU8ClientAllocator, FusionProgressCallback fusionProgressCallback);

    public static native long nativeRetrieveMoreDebugImage(long j, long j2);

    public static native int nativeRetrieveResultStatus(long j);
}
