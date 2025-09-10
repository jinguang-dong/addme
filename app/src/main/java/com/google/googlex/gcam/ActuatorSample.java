package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ActuatorSample {
    public transient long a;
    protected transient boolean b;

    public ActuatorSample(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_ActuatorSample(j);
            }
            this.a = 0L;
        }
    }

    public final void b(int i) {
        GcamModuleJNI.ActuatorSample_dac_set(this.a, this, i);
    }

    public final void c(float f) {
        GcamModuleJNI.ActuatorSample_diopter_set(this.a, this, f);
    }

    public final void d(long j) {
        GcamModuleJNI.ActuatorSample_timestamp_ns_set(this.a, this, j);
    }

    protected final void finalize() {
        a();
    }

    public ActuatorSample() {
        this(GcamModuleJNI.new_ActuatorSample(), true);
    }
}
