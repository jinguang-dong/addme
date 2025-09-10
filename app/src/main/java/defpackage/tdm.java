package defpackage;

import android.hardware.HardwareBuffer;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.InterleavedWriteViewU8;
import com.google.googlex.gcam.LockedHardwareBuffer;
import com.google.googlex.gcam.base.LongPair;
import com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tdm implements InterleavedU8ClientAllocator {
    private final long a;
    private final long b;
    private HardwareBuffer c;
    private LockedHardwareBuffer d;

    public tdm(long j, long j2) {
        a.I(GcamModuleJNI.kInvalidAllocationId_get() != 0);
        rnt.B(true, "allocateUsage must contain USAGE_CPU_WRITE_RARELY.");
        rnt.B(true, "lockUsage must contain USAGE_CPU_WRITE_RARELY.");
        this.a = j;
        this.b = j2;
    }

    public final HardwareBuffer a() {
        boolean z = false;
        if (this.c != null && this.d == null) {
            z = true;
        }
        rnt.M(z, "doneWriting() must be called before getImage.");
        return this.c;
    }

    @Override // com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator
    public final LongPair allocate(int i, int i2, int i3) {
        rnt.G(i3 == 4, "Server requested an InterleavedImageU8 of %s channels, but UniqueHardwareBufferInterleavedU8ClientAllocator only supports %s.", i3, 4);
        rnt.M(this.c == null, "allocate() should be called at most once.");
        HardwareBuffer hardwareBufferCreate = HardwareBuffer.create(i, i2, 1, 1, this.a);
        this.c = hardwareBufferCreate;
        this.d = new LockedHardwareBuffer(hardwareBufferCreate, this.b);
        return new LongPair(0L, InterleavedWriteViewU8.a(this.d.b()));
    }

    @Override // com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator
    public final void doneWriting(long j) {
        a.I(j == 0);
        rnt.M(this.c != null, "doneWriting() was called before allocate().");
        rnt.M(this.d != null, "doneWriting() was called more than once.");
        this.d.close();
        this.d = null;
    }
}
