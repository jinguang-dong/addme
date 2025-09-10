package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FloatArray2 {
    public transient long a;
    protected transient boolean b;

    public FloatArray2() {
        long jNew_FloatArray2__SWIG_0 = GcamModuleJNI.new_FloatArray2__SWIG_0();
        this.b = true;
        this.a = jNew_FloatArray2__SWIG_0;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_FloatArray2(j);
            }
            this.a = 0L;
        }
    }

    public final void b(int i, float f) {
        GcamModuleJNI.FloatArray2_set(this.a, this, i, f);
    }

    public final float c() {
        return GcamModuleJNI.FloatArray2_get(this.a, this, 0);
    }

    protected final void finalize() {
        a();
    }
}
