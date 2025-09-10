package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FloatArray9 {
    public transient long a;
    protected transient boolean b;

    public FloatArray9(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public final float a(int i) {
        return GcamModuleJNI.FloatArray9_get(this.a, this, i);
    }

    public final synchronized void b() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_FloatArray9(j);
            }
            this.a = 0L;
        }
    }

    public final void c(int i, float f) {
        GcamModuleJNI.FloatArray9_set(this.a, this, i, f);
    }

    protected final void finalize() {
        b();
    }

    public FloatArray9() {
        this(GcamModuleJNI.new_FloatArray9__SWIG_0(), true);
    }
}
