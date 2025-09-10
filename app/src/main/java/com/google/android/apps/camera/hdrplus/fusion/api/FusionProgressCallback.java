package com.google.android.apps.camera.hdrplus.fusion.api;

import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.ShotMetadata;
import defpackage.obu;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface FusionProgressCallback {
    void a(long j, InterleavedImageU8 interleavedImageU8, ShotMetadata shotMetadata, String str);

    void b(long j, int i, int i2, boolean z);

    void d(long j, InterleavedImageU8 interleavedImageU8, ShotMetadata shotMetadata);

    void e(long j, obu obuVar, ShotMetadata shotMetadata, int i);

    void onProgress(long j, float f);
}
