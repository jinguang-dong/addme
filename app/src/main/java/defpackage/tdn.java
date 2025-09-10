package defpackage;

import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.InterleavedImageS16;
import com.google.googlex.gcam.InterleavedWriteViewS16;
import com.google.googlex.gcam.base.LongPair;
import com.google.googlex.gcam.clientallocator.InterleavedS16ClientAllocator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tdn implements InterleavedS16ClientAllocator {
    public InterleavedImageS16 a;
    public boolean b = false;
    private InterleavedWriteViewS16 c;

    public tdn() {
        a.I(GcamModuleJNI.kInvalidAllocationId_get() != 0);
    }

    @Override // com.google.googlex.gcam.clientallocator.InterleavedS16ClientAllocator
    public final LongPair allocate(int i, int i2, int i3) {
        rnt.M(this.a == null, "allocate() should be called at most once.");
        InterleavedImageS16 interleavedImageS16 = new InterleavedImageS16(i, i2, i3);
        this.a = interleavedImageS16;
        this.c = new InterleavedWriteViewS16(GcamModuleJNI.InterleavedImageS16_write_view(interleavedImageS16.a, interleavedImageS16));
        InterleavedWriteViewS16 interleavedWriteViewS16 = this.c;
        return new LongPair(0L, interleavedWriteViewS16 == null ? 0L : interleavedWriteViewS16.a);
    }

    @Override // com.google.googlex.gcam.clientallocator.InterleavedS16ClientAllocator
    public final void doneWriting(long j) {
        a.I(j == 0);
        rnt.M(this.a != null, "doneWriting() was called before allocate().");
        rnt.M(!this.b, "doneWriting() should be called at most once.");
        this.b = true;
    }
}
