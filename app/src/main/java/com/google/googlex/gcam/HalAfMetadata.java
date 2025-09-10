package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class HalAfMetadata {
    public transient long a;
    protected transient boolean b;

    public HalAfMetadata(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_HalAfMetadata(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        a();
    }

    public HalAfMetadata() {
        this(GcamModuleJNI.new_HalAfMetadata(), true);
    }
}
