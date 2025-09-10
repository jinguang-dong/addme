package com.google.googlex.gcam.lasagna;

import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.RawWriteView;
import defpackage.rnt;
import defpackage.tht;
import defpackage.thv;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class LasagnaInputParamsImpl implements thv {
    private static final AtomicBoolean a = new AtomicBoolean();
    private long b;

    public LasagnaInputParamsImpl(long j, long j2, long j3, long j4, List list, int i) {
        if (!a.getAndSet(true)) {
            init();
        }
        rnt.B(j != 0, "staticMetadataPtr is 0.");
        rnt.B(j2 != 0, "shotParamsPtr is 0.");
        rnt.B(j3 != 0, "shotMetadataPtr is 0.");
        rnt.B(j4 != 0, "rawImagePlanarReadView16Ptr is 0.");
        int size = list.size();
        long[] jArr = new long[size];
        long[] jArr2 = new long[size];
        long[] jArr3 = new long[size];
        Runnable[] runnableArr = new Runnable[size];
        for (int i2 = 0; i2 < size; i2++) {
            tht thtVar = (tht) list.get(i2);
            jArr[i2] = thtVar.c.a;
            jArr2[i2] = FrameMetadata.c(thtVar.b);
            jArr3[i2] = RawWriteView.e(thtVar.a);
            runnableArr[i2] = thtVar.d;
        }
        long jAlloc = alloc(j, j2, j3, j4, jArr3, jArr2, jArr, runnableArr, i);
        rnt.M(jAlloc != 0, "alloc() failed!");
        this.b = jAlloc;
    }

    private static native long alloc(long j, long j2, long j3, long j4, long[] jArr, long[] jArr2, long[] jArr3, Runnable[] runnableArr, int i);

    private static native void dealloc(long j);

    private static native void init();

    @Override // defpackage.thv
    public final synchronized long a() {
        return this.b;
    }

    @Override // defpackage.thv
    public final synchronized void b() {
        dealloc(this.b);
        this.b = 0L;
    }
}
