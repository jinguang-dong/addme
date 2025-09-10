package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ClutWeightVector {
    protected transient boolean a;
    private transient long b;

    public ClutWeightVector(long j, boolean z) {
        this.a = z;
        this.b = j;
    }

    public final synchronized void a() {
        long j = this.b;
        if (j != 0) {
            if (this.a) {
                this.a = false;
                GcamModuleJNI.delete_ClutWeightVector(j);
            }
            this.b = 0L;
        }
    }

    public final void b(int i, float f) {
        GcamModuleJNI.ClutWeightVector_emplace_back(this.b, this, i, f);
    }

    protected final void finalize() {
        a();
    }

    public ClutWeightVector() {
        this(GcamModuleJNI.new_ClutWeightVector__SWIG_0(), true);
    }
}
