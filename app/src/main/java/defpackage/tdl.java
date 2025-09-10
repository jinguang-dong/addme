package defpackage;

import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.GrayImageS16;
import com.google.googlex.gcam.GrayWriteViewS16;
import com.google.googlex.gcam.base.LongPair;
import com.google.googlex.gcam.clientallocator.GrayS16ClientAllocator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tdl implements GrayS16ClientAllocator {
    public GrayImageS16 a;
    public boolean b = false;
    private GrayWriteViewS16 c;

    public tdl() {
        a.I(GcamModuleJNI.kInvalidAllocationId_get() != 0);
    }

    @Override // com.google.googlex.gcam.clientallocator.GrayS16ClientAllocator
    public final LongPair allocate(int i, int i2) {
        rnt.M(this.a == null, "allocate() should be called at most once.");
        GrayImageS16 grayImageS16 = new GrayImageS16(i, i2);
        this.a = grayImageS16;
        this.c = new GrayWriteViewS16(GcamModuleJNI.GrayImageS16_write_view(grayImageS16.a, grayImageS16));
        GrayWriteViewS16 grayWriteViewS16 = this.c;
        return new LongPair(0L, grayWriteViewS16 == null ? 0L : grayWriteViewS16.a);
    }

    @Override // com.google.googlex.gcam.clientallocator.GrayS16ClientAllocator
    public final void doneWriting(long j) {
        a.I(j == 0);
        rnt.M(this.a != null, "doneWriting() was called before allocate().");
        rnt.M(!this.b, "doneWriting() should be called at most once.");
        this.b = true;
    }
}
