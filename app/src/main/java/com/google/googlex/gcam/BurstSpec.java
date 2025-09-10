package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class BurstSpec {
    protected transient boolean a;
    private transient long b;

    public BurstSpec(long j) {
        this.a = true;
        this.b = j;
    }

    public static long b(BurstSpec burstSpec) {
        if (burstSpec == null) {
            return 0L;
        }
        return burstSpec.b;
    }

    public final float a(float f) {
        return GcamModuleJNI.BurstSpec_TotalCaptureTimeMs(this.b, this, f);
    }

    public final FrameRequestVector c() {
        long jBurstSpec_frame_requests_get = GcamModuleJNI.BurstSpec_frame_requests_get(this.b, this);
        if (jBurstSpec_frame_requests_get == 0) {
            return null;
        }
        return new FrameRequestVector(jBurstSpec_frame_requests_get, false);
    }

    public final synchronized void d() {
        long j = this.b;
        if (j != 0) {
            if (this.a) {
                this.a = false;
                GcamModuleJNI.delete_BurstSpec(j);
            }
            this.b = 0L;
        }
    }

    public final void e(FrameRequestVector frameRequestVector) {
        GcamModuleJNI.BurstSpec_frame_requests_set(this.b, this, frameRequestVector.a, frameRequestVector);
    }

    protected final void finalize() {
        d();
    }

    public BurstSpec() {
        this(GcamModuleJNI.new_BurstSpec());
    }
}
