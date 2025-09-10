package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class BuildPayloadBurstSpecOptions {
    public transient long a;
    protected transient boolean b;

    public BuildPayloadBurstSpecOptions() {
        long jNew_BuildPayloadBurstSpecOptions__SWIG_0 = GcamModuleJNI.new_BuildPayloadBurstSpecOptions__SWIG_0();
        this.b = true;
        this.a = jNew_BuildPayloadBurstSpecOptions__SWIG_0;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_BuildPayloadBurstSpecOptions(j);
            }
            this.a = 0L;
        }
    }

    public final void b(float f) {
        GcamModuleJNI.BuildPayloadBurstSpecOptions_max_exposure_time_ms_set(this.a, this, f);
    }

    public final void c(float f) {
        GcamModuleJNI.BuildPayloadBurstSpecOptions_max_total_capture_time_ms_set(this.a, this, f);
    }

    protected final void finalize() {
        a();
    }
}
