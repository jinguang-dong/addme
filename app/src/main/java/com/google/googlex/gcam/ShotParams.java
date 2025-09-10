package com.google.googlex.gcam;

import defpackage.tcm;
import defpackage.tco;
import defpackage.tcw;
import defpackage.tdb;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ShotParams {
    public transient long a;
    protected transient boolean b;

    public ShotParams(long j) {
        this.b = true;
        this.a = j;
    }

    public final AeShotParams a() {
        long jShotParams_ae_get = GcamModuleJNI.ShotParams_ae_get(this.a, this);
        if (jShotParams_ae_get == 0) {
            return null;
        }
        return new AeShotParams(jShotParams_ae_get, false);
    }

    public final ArkInfo b() {
        long jShotParams_ark_info_get = GcamModuleJNI.ShotParams_ark_info_get(this.a, this);
        if (jShotParams_ark_info_get == 0) {
            return null;
        }
        return new ArkInfo(jShotParams_ark_info_get, false);
    }

    public final synchronized void c() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_ShotParams(j);
            }
            this.a = 0L;
        }
    }

    public final void d(AwbInfo awbInfo) {
        GcamModuleJNI.ShotParams_force_wb_set(this.a, this, AwbInfo.a(awbInfo), awbInfo);
    }

    public final void e(tcm tcmVar) {
        GcamModuleJNI.ShotParams_merge_method_override_set(this.a, this, tcmVar.c);
    }

    public final void f(tco tcoVar) {
        GcamModuleJNI.ShotParams_output_color_space_override_set(this.a, this, tcoVar.e);
    }

    protected final void finalize() {
        c();
    }

    public final void g(boolean z) {
        GcamModuleJNI.ShotParams_recompute_wb_on_base_frame_set(this.a, this, z);
    }

    public final void h(tcw tcwVar) {
        GcamModuleJNI.ShotParams_resampling_method_override_set(this.a, this, tcwVar.e);
    }

    public final void i(boolean z) {
        GcamModuleJNI.ShotParams_shasta_enabled_set(this.a, this, z);
    }

    public final void j(tdb tdbVar) {
        GcamModuleJNI.ShotParams_walnut_option_set(this.a, this, tdbVar.c);
    }

    public final boolean k() {
        return GcamModuleJNI.ShotParams_cyclops_enabled_get(this.a, this);
    }

    public final boolean l() {
        return GcamModuleJNI.ShotParams_device_is_on_tripod_get(this.a, this);
    }

    public final void m() {
        GcamModuleJNI.ShotParams_remosaic_merged_output_set(this.a, this, false);
    }

    public ShotParams() {
        this(GcamModuleJNI.new_ShotParams__SWIG_0());
    }

    public ShotParams(ShotParams shotParams) {
        this(GcamModuleJNI.new_ShotParams__SWIG_1(shotParams.a, shotParams));
    }
}
