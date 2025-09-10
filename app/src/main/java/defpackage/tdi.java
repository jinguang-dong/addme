package defpackage;

import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.InterleavedWriteViewU8;
import com.google.googlex.gcam.base.LongPair;
import com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tdi implements InterleavedU8ClientAllocator {
    private final Object a = new Object();
    private final Object b = new Object();
    private long c = 0;
    private final Map d = new HashMap();
    private final Map e = new HashMap();
    private final Map f = new HashMap();

    public final rwc a(long j) {
        rwc rwcVarI;
        synchronized (this.b) {
            rwcVarI = rwc.i((InterleavedImageU8) this.f.remove(Long.valueOf(j)));
        }
        return rwcVarI;
    }

    @Override // com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator
    public final LongPair allocate(int i, int i2, int i3) {
        LongPair longPair;
        InterleavedImageU8 interleavedImageU8 = new InterleavedImageU8(i, i2, i3);
        InterleavedWriteViewU8 interleavedWriteViewU8G = interleavedImageU8.g();
        synchronized (this.a) {
            long j = this.c;
            this.c = 1 + j;
            Map map = this.d;
            Long lValueOf = Long.valueOf(j);
            map.put(lValueOf, interleavedImageU8);
            this.e.put(lValueOf, interleavedWriteViewU8G);
            longPair = new LongPair(j, InterleavedWriteViewU8.a(interleavedWriteViewU8G));
        }
        return longPair;
    }

    @Override // com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator
    public final void doneWriting(long j) {
        Long lValueOf;
        InterleavedImageU8 interleavedImageU8;
        synchronized (this.a) {
            Map map = this.d;
            lValueOf = Long.valueOf(j);
            interleavedImageU8 = (InterleavedImageU8) map.remove(lValueOf);
            this.e.remove(lValueOf);
        }
        interleavedImageU8.getClass();
        synchronized (this.b) {
            this.f.put(lValueOf, interleavedImageU8);
        }
    }
}
