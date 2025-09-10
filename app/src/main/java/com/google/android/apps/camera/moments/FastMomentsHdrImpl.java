package com.google.android.apps.camera.moments;

import android.hardware.HardwareBuffer;
import com.google.googlex.gcam.Gcam;
import defpackage.fto;
import defpackage.ins;
import defpackage.pbc;
import defpackage.tgp;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FastMomentsHdrImpl {
    public final pbc a;
    public final long b;
    public final Gcam c;
    public final Executor d;
    public final tgp e;
    public final fto f;

    public FastMomentsHdrImpl(pbc pbcVar, Gcam gcam, Executor executor, tgp tgpVar, fto ftoVar) {
        this.a = pbcVar.a("FastMomentsHdr");
        this.c = gcam;
        this.d = executor;
        this.e = tgpVar;
        this.f = ftoVar;
        ins.b();
        this.b = createImpl();
    }

    private static native long createImpl();

    private static native void releaseImpl(long j);

    public final void finalize() {
        long j = this.b;
        if (j != 0) {
            releaseImpl(j);
        }
    }

    public native void initializeProcessingQueueNative(long j, long j2);

    public native HardwareBuffer processRaw10ToRgbaHardwareBufferNative(long j, long j2, int i, long j3, HardwareBuffer hardwareBuffer, long j4, long j5, long j6, int i2, int i3, int i4, long j7, int i5);

    public native HardwareBuffer processRaw10ToYuvHardwareBufferNative(long j, long j2, int i, long j3, HardwareBuffer hardwareBuffer, long j4, long j5, long j6, int i2, int i3, int i4, long j7, int i5);

    public native long processRaw10ToYuvImageNative(long j, long j2, int i, HardwareBuffer hardwareBuffer, long j3, long j4, long j5, int i2, int i3, int i4, long j6, int i5);
}
