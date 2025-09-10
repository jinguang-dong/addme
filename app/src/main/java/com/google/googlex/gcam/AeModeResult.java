package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AeModeResult {
    public transient long a;
    protected transient boolean b;

    public AeModeResult(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_AeModeResult(j);
            }
            this.a = 0L;
        }
    }

    public final void b(float f) {
        GcamModuleJNI.AeModeResult_final_tet_set(this.a, this, f);
    }

    public final void c(float f) {
        GcamModuleJNI.AeModeResult_ideal_tet_set(this.a, this, f);
    }

    public final void d(float f) {
        GcamModuleJNI.AeModeResult_log_scene_brightness_set(this.a, this, f);
    }

    public final void e(float f) {
        GcamModuleJNI.AeModeResult_touch_area_linear_value_set(this.a, this, f);
    }

    public final void f(boolean z) {
        GcamModuleJNI.AeModeResult_touch_roi_clip_protection_tripped_set(this.a, this, z);
    }

    protected final void finalize() {
        a();
    }

    public AeModeResult() {
        this(GcamModuleJNI.new_AeModeResult(), true);
    }
}
