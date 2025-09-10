package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ViewfinderProcessingOptions {
    public transient long a;
    protected transient boolean b;

    public ViewfinderProcessingOptions() {
        long jNew_ViewfinderProcessingOptions__SWIG_0 = GcamModuleJNI.new_ViewfinderProcessingOptions__SWIG_0();
        this.b = true;
        this.a = jNew_ViewfinderProcessingOptions__SWIG_0;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_ViewfinderProcessingOptions(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        a();
    }
}
