package defpackage;

import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.InterleavedWriteViewU8;
import com.google.googlex.gcam.base.LongPair;
import com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tdp implements InterleavedU8ClientAllocator {
    public InterleavedImageU8 a;
    public boolean b = false;
    private InterleavedWriteViewU8 c;

    public tdp() {
        a.I(GcamModuleJNI.kInvalidAllocationId_get() != 0);
    }

    @Override // com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator
    public final LongPair allocate(int i, int i2, int i3) {
        rnt.M(this.a == null, "allocate() should be called at most once.");
        InterleavedImageU8 interleavedImageU8 = new InterleavedImageU8(i, i2, i3);
        this.a = interleavedImageU8;
        this.c = interleavedImageU8.g();
        return new LongPair(0L, InterleavedWriteViewU8.a(this.c));
    }

    @Override // com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator
    public final void doneWriting(long j) {
        a.I(j == 0);
        rnt.M(this.a != null, "doneWriting() was called before allocate().");
        rnt.M(!this.b, "doneWriting() should be called at most once.");
        this.b = true;
    }
}
