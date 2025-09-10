package com.google.googlex.gcam;

import defpackage.tbi;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AeResults {
    public transient long a;
    protected transient boolean b;

    public AeResults(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public final float a(tbi tbiVar) {
        return GcamModuleJNI.AeResults_FinalTet(this.a, this, tbiVar.c);
    }

    public final AeModeResult b() {
        long jAeResults_portrait_result_get = GcamModuleJNI.AeResults_portrait_result_get(this.a, this);
        if (jAeResults_portrait_result_get == 0) {
            return null;
        }
        return new AeModeResult(jAeResults_portrait_result_get, false);
    }

    public final synchronized void c() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_AeResults(j);
            }
            this.a = 0L;
        }
    }

    public final void d(float f) {
        GcamModuleJNI.AeResults_fraction_pixels_clipped_at_final_short_tet_set(this.a, this, f);
    }

    public final void e(AeModeResult[] aeModeResultArr) {
        long j = this.a;
        long[] jArr = new long[2];
        for (int i = 0; i < 2; i++) {
            AeModeResult aeModeResult = aeModeResultArr[i];
            jArr[i] = aeModeResult == null ? 0L : aeModeResult.a;
        }
        GcamModuleJNI.AeResults_mode_result_set(j, this, jArr);
    }

    public final void f(float f) {
        GcamModuleJNI.AeResults_predicted_image_brightness_set(this.a, this, f);
    }

    protected final void finalize() {
        c();
    }

    public final void g(boolean z) {
        GcamModuleJNI.AeResults_process_ae_stats_executed_set(this.a, this, z);
    }

    public final void h(float f) {
        GcamModuleJNI.AeResults_pure_fraction_of_pixels_from_long_exposure_set(this.a, this, f);
    }

    public final void i(float f) {
        GcamModuleJNI.AeResults_safe_underexposure_set(this.a, this, f);
    }

    public final void j(float f) {
        GcamModuleJNI.AeResults_weighted_fraction_of_pixels_from_long_exposure_set(this.a, this, f);
    }

    public AeResults() {
        this(GcamModuleJNI.new_AeResults(), true);
    }
}
