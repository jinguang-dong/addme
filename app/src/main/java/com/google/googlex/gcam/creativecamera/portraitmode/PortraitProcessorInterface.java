package com.google.googlex.gcam.creativecamera.portraitmode;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class PortraitProcessorInterface implements AutoCloseable {
    private static final AtomicBoolean b = new AtomicBoolean();
    public long a;

    public PortraitProcessorInterface(long j, long j2, long j3, long j4, long j5, boolean z, boolean z2) {
        this.a = 0L;
        if (b.compareAndSet(false, true)) {
            init();
        }
        this.a = create(j, j2, j3, j4, j5, z, z2, false, false);
    }

    private native long create(long j, long j2, long j3, long j4, long j5, boolean z, boolean z2, boolean z3, boolean z4);

    private native long createWithLevels(long j, long j2, long j3, long j4, long j5, int i, int i2, boolean z);

    private native void delete(long j);

    private static native void init();

    @Override // java.lang.AutoCloseable
    public final void close() {
        delete(this.a);
        this.a = 0L;
    }

    public native boolean processImpl(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z);
}
