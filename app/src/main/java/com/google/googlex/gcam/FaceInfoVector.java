package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FaceInfoVector {
    public transient long a;
    protected transient boolean b;

    public FaceInfoVector(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public static long a(FaceInfoVector faceInfoVector) {
        if (faceInfoVector == null) {
            return 0L;
        }
        return faceInfoVector.a;
    }

    public final long b() {
        return GcamModuleJNI.FaceInfoVector_size(this.a, this);
    }

    public final void c(FaceInfo faceInfo) {
        GcamModuleJNI.FaceInfoVector_add(this.a, this, faceInfo.a, faceInfo);
    }

    public final synchronized void d() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_FaceInfoVector(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        d();
    }

    public FaceInfoVector() {
        this(GcamModuleJNI.new_FaceInfoVector__SWIG_0(), true);
    }
}
