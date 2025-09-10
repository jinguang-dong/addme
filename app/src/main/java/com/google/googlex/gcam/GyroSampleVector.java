package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class GyroSampleVector {
    public transient long a;
    protected transient boolean b;

    public GyroSampleVector(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_GyroSampleVector(j);
            }
            this.a = 0L;
        }
    }

    public final void b(long j, float f, float f2, float f3) {
        GcamModuleJNI.GyroSampleVector_emplace_back(this.a, this, j, f, f2, f3);
    }

    protected final void finalize() {
        a();
    }

    public GyroSampleVector() {
        this(GcamModuleJNI.new_GyroSampleVector__SWIG_0(), true);
    }
}
