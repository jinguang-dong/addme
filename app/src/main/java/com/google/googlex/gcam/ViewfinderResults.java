package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ViewfinderResults {
    public transient long a;
    protected transient boolean b;

    public ViewfinderResults(long j) {
        this.b = true;
        this.a = j;
    }

    public final float a() {
        return GcamModuleJNI.ViewfinderResults_psaf_capture_time_ms_get(this.a, this);
    }

    public final synchronized void b() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_ViewfinderResults(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        b();
    }

    public ViewfinderResults() {
        this(GcamModuleJNI.new_ViewfinderResults());
    }
}
