package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class StringFrameMetadataMap {
    public transient long a;
    protected transient boolean b;

    public StringFrameMetadataMap(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_StringFrameMetadataMap(j);
            }
            this.a = 0L;
        }
    }

    public final void b(String str, FrameMetadata frameMetadata) {
        GcamModuleJNI.StringFrameMetadataMap_set(this.a, this, str, FrameMetadata.c(frameMetadata), frameMetadata);
    }

    protected final void finalize() {
        a();
    }

    public StringFrameMetadataMap() {
        this(GcamModuleJNI.new_StringFrameMetadataMap__SWIG_0(), true);
    }
}
