package com.google.googlex.gcam.clientallocator;

import com.google.googlex.gcam.base.LongPair;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface InterleavedU16ClientAllocator {
    LongPair allocate(int i, int i2, int i3);

    void doneWriting(long j);
}
