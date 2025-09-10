package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class HotPixelMetadataVector {
    public transient long a;
    protected transient boolean b;

    public HotPixelMetadataVector(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_HotPixelMetadataVector(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        a();
    }

    public HotPixelMetadataVector() {
        this(GcamModuleJNI.new_HotPixelMetadataVector__SWIG_0(), true);
    }
}
