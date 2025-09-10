package com.google.googlex.gcam.imageio;

import com.google.googlex.gcam.InterleavedReadViewU8;
import com.google.googlex.gcam.JpgEncodeOptions;
import defpackage.rwc;
import defpackage.tcd;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class JpgHelper {
    private JpgHelper() {
    }

    public static rwc a(InterleavedReadViewU8 interleavedReadViewU8, JpgEncodeOptions jpgEncodeOptions, tcd tcdVar) {
        return rwc.i(encodeRgbToJpegAsByteArrayImpl(interleavedReadViewU8.a, jpgEncodeOptions.a, tcdVar.j, -1.0f, -1.0f, -1.0f, 0));
    }

    public static native byte[] encodeRgbToJpegAsByteArrayImpl(long j, long j2, int i, float f, float f2, float f3, int i2);

    public static native byte[] encodeYuvToJpegAsByteArrayImpl(long j, long j2, int i, float f, float f2, float f3, int i2);

    public static native byte[] remapAndEncodeGrayS16ToJpegAsByteArrayImpl(long j, long j2, int i, float f, float f2, float f3, int i2);
}
