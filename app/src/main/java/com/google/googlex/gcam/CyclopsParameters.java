package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CyclopsParameters {
    public transient long a;
    protected transient boolean b;

    public CyclopsParameters(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public static long a(CyclopsParameters cyclopsParameters) {
        if (cyclopsParameters == null) {
            return 0L;
        }
        return cyclopsParameters.a;
    }

    public final IntVector b() {
        long jCyclopsParameters_face_ids_get = GcamModuleJNI.CyclopsParameters_face_ids_get(this.a, this);
        if (jCyclopsParameters_face_ids_get == 0) {
            return null;
        }
        return new IntVector(jCyclopsParameters_face_ids_get, false);
    }

    public final synchronized void c() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_CyclopsParameters(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        c();
    }

    public CyclopsParameters() {
        this(GcamModuleJNI.new_CyclopsParameters__SWIG_0(), true);
    }
}
