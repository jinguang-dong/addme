package com.google.googlex.gcam.imageproc;

import com.google.googlex.gcam.InterleavedReadViewU8;
import com.google.googlex.gcam.InterleavedWriteViewU8;
import com.google.googlex.gcam.YuvReadView;
import com.google.googlex.gcam.YuvWriteView;
import defpackage.rnt;
import defpackage.scn;
import defpackage.tcd;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class Resample {
    public static final /* synthetic */ int a = 0;
    private static final scn b = scn.J(tcd.f, tcd.g, tcd.h, tcd.i);

    private Resample() {
    }

    public static int[] a(int i, int i2, tcd tcdVar) {
        boolean zContains = b.contains(tcdVar);
        int i3 = true != zContains ? i : i2;
        if (true != zContains) {
            i = i2;
        }
        return new int[]{i3, i};
    }

    public static void b(InterleavedReadViewU8 interleavedReadViewU8, tcd tcdVar, InterleavedWriteViewU8 interleavedWriteViewU8) {
        long j = interleavedReadViewU8.a;
        long jA = InterleavedWriteViewU8.a(interleavedWriteViewU8);
        rnt.B(j != 0, "src is null");
        rnt.B(jA != 0, "dst is null");
        rotateInterleavedU8Impl(j, tcdVar.j, jA);
    }

    public static void c(YuvReadView yuvReadView, tcd tcdVar, YuvWriteView yuvWriteView) {
        long j = yuvReadView.a;
        long jC = YuvWriteView.c(yuvWriteView);
        rnt.B(j != 0, "src is null");
        rnt.B(jC != 0, "dst is null");
        rotateYuvImpl(j, tcdVar.j, jC);
    }

    public static native boolean downsampleImpl(long j, int i, long j2);

    public static native boolean resampleLanczosYuvImpl(long j, float f, long j2);

    private static native boolean rotateInterleavedU8Impl(long j, int i, long j2);

    private static native boolean rotateYuvImpl(long j, int i, long j2);
}
