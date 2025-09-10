package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class WeightedNormalizedRect {
    public transient long a;
    protected transient boolean b;

    public WeightedNormalizedRect() {
        long jNew_WeightedNormalizedRect = GcamModuleJNI.new_WeightedNormalizedRect();
        this.b = true;
        this.a = jNew_WeightedNormalizedRect;
    }

    public final NormalizedRect a() {
        long jWeightedNormalizedRect_rect_get = GcamModuleJNI.WeightedNormalizedRect_rect_get(this.a, this);
        if (jWeightedNormalizedRect_rect_get == 0) {
            return null;
        }
        return new NormalizedRect(jWeightedNormalizedRect_rect_get, false);
    }

    public final synchronized void b() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_WeightedNormalizedRect(j);
            }
            this.a = 0L;
        }
    }

    public final void c(float f) {
        GcamModuleJNI.WeightedNormalizedRect_weight_set(this.a, this, f);
    }

    protected final void finalize() {
        b();
    }
}
