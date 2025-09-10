package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AccelSample {
    public transient long a;
    protected transient boolean b;

    public AccelSample() {
        long jNew_AccelSample = GcamModuleJNI.new_AccelSample();
        this.b = true;
        this.a = jNew_AccelSample;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_AccelSample(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        a();
    }
}
