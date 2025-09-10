package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class WeightedNormalizedRectVector {
    public transient long a;
    protected transient boolean b;

    public WeightedNormalizedRectVector(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public final void a(WeightedNormalizedRect weightedNormalizedRect) {
        GcamModuleJNI.WeightedNormalizedRectVector_add(this.a, this, weightedNormalizedRect.a, weightedNormalizedRect);
    }

    public final synchronized void b() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_WeightedNormalizedRectVector(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        b();
    }

    public WeightedNormalizedRectVector() {
        this(GcamModuleJNI.new_WeightedNormalizedRectVector__SWIG_0(), true);
    }
}
