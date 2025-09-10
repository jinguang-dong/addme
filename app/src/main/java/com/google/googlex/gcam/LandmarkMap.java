package com.google.googlex.gcam;

import com.google.googlex.gcam.FaceInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LandmarkMap {
    protected transient boolean a;
    private transient long b;

    public LandmarkMap(long j, boolean z) {
        this.a = z;
        this.b = j;
    }

    public final synchronized void a() {
        long j = this.b;
        if (j != 0) {
            if (this.a) {
                this.a = false;
                GcamModuleJNI.delete_LandmarkMap(j);
            }
            this.b = 0L;
        }
    }

    public final void b(int i, FaceInfo.Landmark landmark) {
        GcamModuleJNI.LandmarkMap_set(this.b, this, i, landmark.a, landmark);
    }

    protected final void finalize() {
        a();
    }

    public LandmarkMap() {
        this(GcamModuleJNI.new_LandmarkMap__SWIG_0(), true);
    }
}
