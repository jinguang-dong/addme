package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class DebugParams {
    protected transient boolean a;
    private transient long b;

    public DebugParams() {
        long jNew_DebugParams = GcamModuleJNI.new_DebugParams();
        this.a = true;
        this.b = jNew_DebugParams;
    }

    public static long a(DebugParams debugParams) {
        if (debugParams == null) {
            return 0L;
        }
        return debugParams.b;
    }

    public final synchronized void b() {
        long j = this.b;
        if (j != 0) {
            if (this.a) {
                this.a = false;
                GcamModuleJNI.delete_DebugParams(j);
            }
            this.b = 0L;
        }
    }

    public final void c(ImageSaverParams imageSaverParams) {
        GcamModuleJNI.DebugParams_image_saver_params_set(this.b, this, imageSaverParams.a, imageSaverParams);
    }

    public final void d(long j) {
        GcamModuleJNI.DebugParams_save_bitmask_set(this.b, this, j);
    }

    protected final void finalize() {
        b();
    }
}
