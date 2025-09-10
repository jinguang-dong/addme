package defpackage;

import com.google.android.apps.camera.facemetadata.conversions.jni.HM.oUZhwRhE;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.YuvImage;
import com.google.googlex.gcam.YuvWriteView;
import com.google.googlex.gcam.base.LongPair;
import com.google.googlex.gcam.clientallocator.YuvClientAllocator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tdr implements YuvClientAllocator {
    private YuvImage a;
    private YuvWriteView b;
    private boolean c = false;

    public tdr() {
        a.I(GcamModuleJNI.kInvalidAllocationId_get() != 0);
    }

    @Override // com.google.googlex.gcam.clientallocator.YuvClientAllocator
    public final LongPair allocate(int i, int i2, int i3) {
        rnt.M(this.a == null, "allocate() should be called at most once.");
        YuvImage yuvImage = new YuvImage(i, i2, tdd.a(i3));
        this.a = yuvImage;
        this.b = rup.t(yuvImage);
        return new LongPair(0L, YuvWriteView.c(this.b));
    }

    @Override // com.google.googlex.gcam.clientallocator.YuvClientAllocator
    public final void doneWriting(long j) {
        a.I(j == 0);
        rnt.M(this.a != null, "doneWriting() was called before allocate().");
        rnt.M(!this.c, "doneWriting() should be called at most once.");
        this.c = true;
    }

    public final YuvImage a() {
        rnt.M(this.c, oUZhwRhE.swObMeevAW);
        return this.a;
    }
}
