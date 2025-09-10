package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AccelSampleVector {
    public transient long a;
    protected transient boolean b;

    public AccelSampleVector() {
        long jNew_AccelSampleVector__SWIG_0 = GcamModuleJNI.new_AccelSampleVector__SWIG_0();
        this.b = true;
        this.a = jNew_AccelSampleVector__SWIG_0;
    }

    public final long a() {
        return GcamModuleJNI.AccelSampleVector_size(this.a, this);
    }

    public final synchronized void b() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_AccelSampleVector(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        b();
    }
}
