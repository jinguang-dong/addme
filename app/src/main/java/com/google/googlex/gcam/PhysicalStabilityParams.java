package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PhysicalStabilityParams {
    protected transient boolean a;
    private transient long b;

    public PhysicalStabilityParams(long j, boolean z) {
        this.a = z;
        this.b = j;
    }

    public final PhysicalStabilityThresholds a() {
        long jPhysicalStabilityParams_thresholds_get = GcamModuleJNI.PhysicalStabilityParams_thresholds_get(this.b, this);
        if (jPhysicalStabilityParams_thresholds_get == 0) {
            return null;
        }
        return new PhysicalStabilityThresholds(jPhysicalStabilityParams_thresholds_get, false);
    }

    public final synchronized void b() {
        long j = this.b;
        if (j != 0) {
            if (this.a) {
                this.a = false;
                GcamModuleJNI.delete_PhysicalStabilityParams(j);
            }
            this.b = 0L;
        }
    }

    protected final void finalize() {
        b();
    }

    public PhysicalStabilityParams() {
        this(GcamModuleJNI.new_PhysicalStabilityParams(), true);
    }
}
