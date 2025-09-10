package com.google.googlex.gcam;

import android.hardware.HardwareBuffer;
import defpackage.rnt;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class LockedHardwareBuffer implements AutoCloseable {
    private long a;

    public LockedHardwareBuffer(HardwareBuffer hardwareBuffer, long j) {
        hardwareBuffer.getClass();
        long jLockHardwareBuffer = lockHardwareBuffer(hardwareBuffer, j);
        this.a = jLockHardwareBuffer;
        rnt.B(jLockHardwareBuffer != 0, "Failed to lock HardwareBuffer.");
    }

    private static native long getInterleavedReadViewU8Impl(long j);

    private static native long getInterleavedWriteViewU8Impl(long j);

    private static native long lockHardwareBuffer(HardwareBuffer hardwareBuffer, long j);

    private static native void unlockHardwareBuffer(long j);

    public final InterleavedReadViewU8 a() {
        return new InterleavedReadViewU8(getInterleavedReadViewU8Impl(this.a));
    }

    public final InterleavedWriteViewU8 b() {
        return new InterleavedWriteViewU8(getInterleavedWriteViewU8Impl(this.a));
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        long j = this.a;
        if (j != 0) {
            unlockHardwareBuffer(j);
            this.a = 0L;
        }
    }
}
