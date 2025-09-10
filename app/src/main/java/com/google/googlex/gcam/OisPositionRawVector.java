package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class OisPositionRawVector {
    public transient long a;
    protected transient boolean b;

    public OisPositionRawVector(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_OisPositionRawVector(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        a();
    }

    public OisPositionRawVector() {
        this(GcamModuleJNI.new_OisPositionRawVector__SWIG_0(), true);
    }
}
