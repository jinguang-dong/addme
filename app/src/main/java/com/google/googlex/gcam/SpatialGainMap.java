package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SpatialGainMap {
    public transient long a;
    protected transient boolean b;

    public SpatialGainMap(long j) {
        this.b = true;
        this.a = j;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_SpatialGainMap(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        a();
    }

    public SpatialGainMap() {
        this(GcamModuleJNI.new_SpatialGainMap__SWIG_0());
    }
}
