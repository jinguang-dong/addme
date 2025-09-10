package com.google.googlex.gcam.image;

import com.google.android.gms.common.internal.oQFY.clFzVRcygwbq;
import com.google.googlex.gcam.InterleavedWriteViewU8;
import com.google.googlex.gcam.YuvImage;
import defpackage.rnt;
import defpackage.rup;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class YuvUtils {
    public static native boolean rgbToYuvImpl(long j, long j2);

    public static native boolean rgbaToYuvImpl(long j, long j2);

    private static native boolean yuvToRgbImpl(long j, long j2);

    public static native boolean yuvToYuvImpl(long j, long j2);

    public static boolean a(YuvImage yuvImage, InterleavedWriteViewU8 interleavedWriteViewU8) {
        boolean z;
        long j = rup.r(yuvImage).a;
        long jA = InterleavedWriteViewU8.a(interleavedWriteViewU8);
        boolean z2 = true;
        if (j != 0) {
            z = true;
        } else {
            z = false;
        }
        rnt.B(z, clFzVRcygwbq.fuahOHusM);
        if (jA == 0) {
            z2 = false;
        }
        rnt.B(z2, "dst view is null");
        return yuvToRgbImpl(j, jA);
    }
}
