package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ClutWeights {
    protected transient boolean a;
    private transient long b;

    public ClutWeights(long j, boolean z) {
        this.a = z;
        this.b = j;
    }

    public final ClutWeightVector a() {
        long jClutWeights_clut_weights_get = GcamModuleJNI.ClutWeights_clut_weights_get(this.b, this);
        if (jClutWeights_clut_weights_get == 0) {
            return null;
        }
        return new ClutWeightVector(jClutWeights_clut_weights_get, false);
    }

    public final synchronized void b() {
        long j = this.b;
        if (j != 0) {
            if (this.a) {
                this.a = false;
                GcamModuleJNI.delete_ClutWeights(j);
            }
            this.b = 0L;
        }
    }

    protected final void finalize() {
        b();
    }

    public ClutWeights() {
        this(GcamModuleJNI.new_ClutWeights(), true);
    }
}
