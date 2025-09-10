package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class JpgEncodeOptions {
    public transient long a;
    protected transient boolean b;

    public JpgEncodeOptions() {
        long jNew_JpgEncodeOptions = GcamModuleJNI.new_JpgEncodeOptions();
        this.b = true;
        this.a = jNew_JpgEncodeOptions;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_JpgEncodeOptions(j);
            }
            this.a = 0L;
        }
    }

    public final void b(ShotMetadata shotMetadata) {
        GcamModuleJNI.JpgEncodeOptions_shot_metadata_set(this.a, this, ShotMetadata.a(shotMetadata), shotMetadata);
    }

    protected final void finalize() {
        a();
    }
}
