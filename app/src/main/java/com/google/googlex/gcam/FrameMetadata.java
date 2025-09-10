package com.google.googlex.gcam;

import defpackage.tbr;
import defpackage.tby;
import defpackage.tck;
import defpackage.tcy;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FrameMetadata {
    public transient long a;
    protected transient boolean b;

    public FrameMetadata(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public static long c(FrameMetadata frameMetadata) {
        if (frameMetadata == null) {
            return 0L;
        }
        return frameMetadata.a;
    }

    public final void A(NoiseModel noiseModel) {
        GcamModuleJNI.FrameMetadata_dng_noise_model_bayer_set(this.a, this, noiseModel.a, noiseModel);
    }

    public final void B(tby tbyVar) {
        GcamModuleJNI.FrameMetadata_flash_set(this.a, this, tbyVar.d);
    }

    public final void C(float f) {
        GcamModuleJNI.FrameMetadata_focus_distance_diopters_set(this.a, this, f);
    }

    public final void D(float f) {
        GcamModuleJNI.FrameMetadata_frame_duration_ms_set(this.a, this, f);
    }

    public final void E(GeometricCalibrationVector geometricCalibrationVector) {
        GcamModuleJNI.FrameMetadata_geometric_calibration_set(this.a, this, geometricCalibrationVector.a, geometricCalibrationVector);
    }

    public final void F(GyroSampleVector gyroSampleVector) {
        GcamModuleJNI.FrameMetadata_gyro_samples_set(this.a, this, gyroSampleVector == null ? 0L : gyroSampleVector.a, gyroSampleVector);
    }

    public final void G(tck tckVar) {
        GcamModuleJNI.FrameMetadata_lens_state_set(this.a, this, tckVar.e);
    }

    public final void H(LiveHdrMetadata liveHdrMetadata) {
        GcamModuleJNI.FrameMetadata_live_hdr_set(this.a, this, liveHdrMetadata.a, liveHdrMetadata);
    }

    public final void I(SceneFlicker sceneFlicker) {
        GcamModuleJNI.FrameMetadata_scene_flicker_set(this.a, this, sceneFlicker.a, sceneFlicker);
    }

    public final void J(tcy tcyVar) {
        GcamModuleJNI.FrameMetadata_sensor_id_set(this.a, this, tcyVar.w);
    }

    public final void K(int i) {
        GcamModuleJNI.FrameMetadata_sensor_temp_set(this.a, this, i);
    }

    public final void L(long j) {
        GcamModuleJNI.FrameMetadata_timestamp_ns_set(this.a, this, j);
    }

    public final void M(boolean z) {
        GcamModuleJNI.FrameMetadata_was_black_level_locked_set(this.a, this, z);
    }

    public final void N(AwbInfo awbInfo) {
        GcamModuleJNI.FrameMetadata_wb_set(this.a, this, AwbInfo.a(awbInfo), awbInfo);
    }

    public final float a() {
        return GcamModuleJNI.FrameMetadata_actual_exposure_time_ms_get(this.a, this);
    }

    public final float b() {
        return GcamModuleJNI.FrameMetadata_applied_digital_gain_get(this.a, this);
    }

    public final long d() {
        return GcamModuleJNI.FrameMetadata_timestamp_ns_get(this.a, this);
    }

    public final ActuatorSampleVector e() {
        long jFrameMetadata_actuator_samples_get = GcamModuleJNI.FrameMetadata_actuator_samples_get(this.a, this);
        if (jFrameMetadata_actuator_samples_get == 0) {
            return null;
        }
        return new ActuatorSampleVector(jFrameMetadata_actuator_samples_get, false);
    }

    public final AeMetadata f() {
        long jFrameMetadata_ae_get = GcamModuleJNI.FrameMetadata_ae_get(this.a, this);
        if (jFrameMetadata_ae_get == 0) {
            return null;
        }
        return new AeMetadata(jFrameMetadata_ae_get, false);
    }

    protected final void finalize() {
        v();
    }

    public final AeResults g() {
        long jFrameMetadata_ae_results_get = GcamModuleJNI.FrameMetadata_ae_results_get(this.a, this);
        if (jFrameMetadata_ae_results_get == 0) {
            return null;
        }
        return new AeResults(jFrameMetadata_ae_results_get, false);
    }

    public final AfMetadata h() {
        long jFrameMetadata_af_get = GcamModuleJNI.FrameMetadata_af_get(this.a, this);
        if (jFrameMetadata_af_get == 0) {
            return null;
        }
        return new AfMetadata(jFrameMetadata_af_get, false);
    }

    public final AwbInfo i() {
        long jFrameMetadata_wb_get = GcamModuleJNI.FrameMetadata_wb_get(this.a, this);
        if (jFrameMetadata_wb_get == 0) {
            return null;
        }
        return new AwbInfo(jFrameMetadata_wb_get, false);
    }

    public final AwbInfoTable j() {
        long jFrameMetadata_per_person_awb_get = GcamModuleJNI.FrameMetadata_per_person_awb_get(this.a, this);
        if (jFrameMetadata_per_person_awb_get == 0) {
            return null;
        }
        return new AwbInfoTable(jFrameMetadata_per_person_awb_get, false);
    }

    public final AwbInfoTable k() {
        long jFrameMetadata_semantic_awb_get = GcamModuleJNI.FrameMetadata_semantic_awb_get(this.a, this);
        if (jFrameMetadata_semantic_awb_get == 0) {
            return null;
        }
        return new AwbInfoTable(jFrameMetadata_semantic_awb_get, false);
    }

    public final AwbMetadata l() {
        long jFrameMetadata_awb_get = GcamModuleJNI.FrameMetadata_awb_get(this.a, this);
        if (jFrameMetadata_awb_get == 0) {
            return null;
        }
        return new AwbMetadata(jFrameMetadata_awb_get, false);
    }

    public final ClutWeights m() {
        long jFrameMetadata_clut_weights_get = GcamModuleJNI.FrameMetadata_clut_weights_get(this.a, this);
        if (jFrameMetadata_clut_weights_get == 0) {
            return null;
        }
        return new ClutWeights(jFrameMetadata_clut_weights_get, false);
    }

    public final CroppedGrayMap n() {
        long jFrameMetadata_saliency_map_get = GcamModuleJNI.FrameMetadata_saliency_map_get(this.a, this);
        if (jFrameMetadata_saliency_map_get == 0) {
            return null;
        }
        return new CroppedGrayMap(jFrameMetadata_saliency_map_get, false);
    }

    public final FaceInfoVector o() {
        long jFrameMetadata_faces_get = GcamModuleJNI.FrameMetadata_faces_get(this.a, this);
        if (jFrameMetadata_faces_get == 0) {
            return null;
        }
        return new FaceInfoVector(jFrameMetadata_faces_get, false);
    }

    public final HalAfMetadata p() {
        long jFrameMetadata_hal_af_metadata_get = GcamModuleJNI.FrameMetadata_hal_af_metadata_get(this.a, this);
        if (jFrameMetadata_hal_af_metadata_get == 0) {
            return null;
        }
        return new HalAfMetadata(jFrameMetadata_hal_af_metadata_get, false);
    }

    public final HotPixelMetadata q() {
        long jFrameMetadata_hot_pixel_metadata_get = GcamModuleJNI.FrameMetadata_hot_pixel_metadata_get(this.a, this);
        if (jFrameMetadata_hot_pixel_metadata_get == 0) {
            return null;
        }
        return new HotPixelMetadata(jFrameMetadata_hot_pixel_metadata_get, false);
    }

    public final LiveHdrMetadata r() {
        long jFrameMetadata_live_hdr_get = GcamModuleJNI.FrameMetadata_live_hdr_get(this.a, this);
        if (jFrameMetadata_live_hdr_get == 0) {
            return null;
        }
        return new LiveHdrMetadata(jFrameMetadata_live_hdr_get, false);
    }

    public final MeshWarp s() {
        long jFrameMetadata_mesh_warp_get = GcamModuleJNI.FrameMetadata_mesh_warp_get(this.a, this);
        if (jFrameMetadata_mesh_warp_get == 0) {
            return null;
        }
        return new MeshWarp(jFrameMetadata_mesh_warp_get, false);
    }

    public final tcy t() {
        return tcy.a(GcamModuleJNI.FrameMetadata_sensor_id_get(this.a, this));
    }

    public final SpatialAwb u() {
        long jFrameMetadata_spatial_awb_get = GcamModuleJNI.FrameMetadata_spatial_awb_get(this.a, this);
        if (jFrameMetadata_spatial_awb_get == 0) {
            return null;
        }
        return new SpatialAwb(jFrameMetadata_spatial_awb_get, false);
    }

    public final synchronized void v() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_FrameMetadata(j);
            }
            this.a = 0L;
        }
    }

    public final void w(AccelSampleVector accelSampleVector) {
        GcamModuleJNI.FrameMetadata_accel_samples_set(this.a, this, accelSampleVector.a, accelSampleVector);
    }

    public final void x(float f) {
        GcamModuleJNI.FrameMetadata_applied_digital_gain_set(this.a, this, f);
    }

    public final void y(FloatArray4 floatArray4) {
        GcamModuleJNI.FrameMetadata_black_levels_bayer_set(this.a, this, floatArray4.a, floatArray4);
    }

    public final void z(tbr tbrVar) {
        GcamModuleJNI.FrameMetadata_control_mode_set(this.a, this, tbrVar.g);
    }

    public FrameMetadata() {
        this(GcamModuleJNI.new_FrameMetadata(), true);
    }
}
