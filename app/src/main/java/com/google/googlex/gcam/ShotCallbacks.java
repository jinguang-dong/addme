package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ShotCallbacks {
    public transient long a;
    protected transient boolean b;

    public ShotCallbacks() {
        long jNew_ShotCallbacks = GcamModuleJNI.new_ShotCallbacks();
        this.b = true;
        this.a = jNew_ShotCallbacks;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_ShotCallbacks(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        a();
    }
}
