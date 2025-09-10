package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class OisPositionVector {
    public transient long a;
    protected transient boolean b;

    public OisPositionVector(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_OisPositionVector(j);
            }
            this.a = 0L;
        }
    }

    public final void b(long j, float f, float f2) {
        GcamModuleJNI.OisPositionVector_emplace_back(this.a, this, j, f, f2);
    }

    protected final void finalize() {
        a();
    }

    public OisPositionVector() {
        this(GcamModuleJNI.new_OisPositionVector__SWIG_0(), true);
    }
}
