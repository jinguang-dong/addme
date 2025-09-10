package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ActuatorSampleVector {
    protected transient boolean a;
    private transient long b;

    public ActuatorSampleVector(long j, boolean z) {
        this.a = z;
        this.b = j;
    }

    public final long a() {
        return GcamModuleJNI.ActuatorSampleVector_size(this.b, this);
    }

    public final ActuatorSample b(int i) {
        return new ActuatorSample(GcamModuleJNI.ActuatorSampleVector_get(this.b, this, i), false);
    }

    public final void c(ActuatorSample actuatorSample) {
        GcamModuleJNI.ActuatorSampleVector_add(this.b, this, actuatorSample.a, actuatorSample);
    }

    public final synchronized void d() {
        long j = this.b;
        if (j != 0) {
            if (this.a) {
                this.a = false;
                GcamModuleJNI.delete_ActuatorSampleVector(j);
            }
            this.b = 0L;
        }
    }

    protected final void finalize() {
        d();
    }

    public ActuatorSampleVector() {
        this(GcamModuleJNI.new_ActuatorSampleVector__SWIG_0(), true);
    }
}
