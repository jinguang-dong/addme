package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class JpgEncoderMetadata {
    public transient long a;
    protected transient boolean b;

    public JpgEncoderMetadata() {
        long jNew_JpgEncoderMetadata = GcamModuleJNI.new_JpgEncoderMetadata();
        this.b = true;
        this.a = jNew_JpgEncoderMetadata;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_JpgEncoderMetadata(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        a();
    }
}
