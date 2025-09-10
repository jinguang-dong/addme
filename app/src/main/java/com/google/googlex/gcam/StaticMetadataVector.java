package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class StaticMetadataVector {
    public transient long a;
    protected transient boolean b;

    public StaticMetadataVector() {
        long jNew_StaticMetadataVector__SWIG_0 = GcamModuleJNI.new_StaticMetadataVector__SWIG_0();
        this.b = true;
        this.a = jNew_StaticMetadataVector__SWIG_0;
    }

    public final long a() {
        return GcamModuleJNI.StaticMetadataVector_size(this.a, this);
    }

    public final StaticMetadata b(int i) {
        return new StaticMetadata(GcamModuleJNI.StaticMetadataVector_get(this.a, this, i), false);
    }

    public final void c(StaticMetadata staticMetadata) {
        GcamModuleJNI.StaticMetadataVector_add(this.a, this, StaticMetadata.c(staticMetadata), staticMetadata);
    }

    public final synchronized void d() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_StaticMetadataVector(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        d();
    }
}
