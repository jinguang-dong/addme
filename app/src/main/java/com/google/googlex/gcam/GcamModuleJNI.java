package com.google.googlex.gcam;

import com.google.googlex.gcam.FaceInfo;
import com.google.googlex.gcam.QcColorCalibration;

/* compiled from: PG */
/* loaded from: classes.dex */
public class GcamModuleJNI {
    public static final native void AccelSampleVector_add(long j, AccelSampleVector accelSampleVector, long j2, AccelSample accelSample);

    public static final native long AccelSampleVector_size(long j, AccelSampleVector accelSampleVector);

    public static final native void AccelSample_timestamp_ns_set(long j, AccelSample accelSample, long j2);

    public static final native void AccelSample_x_set(long j, AccelSample accelSample, float f);

    public static final native void AccelSample_y_set(long j, AccelSample accelSample, float f);

    public static final native void AccelSample_z_set(long j, AccelSample accelSample, float f);

    public static final native void ActuatorSampleVector_add(long j, ActuatorSampleVector actuatorSampleVector, long j2, ActuatorSample actuatorSample);

    public static final native long ActuatorSampleVector_get(long j, ActuatorSampleVector actuatorSampleVector, int i);

    public static final native long ActuatorSampleVector_size(long j, ActuatorSampleVector actuatorSampleVector);

    public static final native void ActuatorSample_dac_set(long j, ActuatorSample actuatorSample, int i);

    public static final native void ActuatorSample_diopter_set(long j, ActuatorSample actuatorSample, float f);

    public static final native void ActuatorSample_timestamp_ns_set(long j, ActuatorSample actuatorSample, long j2);

    public static final native void AddG3aMetadata__SWIG_1(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, long j, ShotMetadata shotMetadata);

    public static final native void AddPortraitMapMetadata(byte[] bArr, long j, FrameMetadata frameMetadata);

    public static final native void AeMetadata_exposure_compensation_set(long j, AeMetadata aeMetadata, float f);

    public static final native void AeMetadata_lock_set(long j, AeMetadata aeMetadata, boolean z);

    public static final native long AeMetadata_metering_rectangles_get(long j, AeMetadata aeMetadata);

    public static final native void AeMetadata_mode_set(long j, AeMetadata aeMetadata, int i);

    public static final native void AeMetadata_precapture_trigger_set(long j, AeMetadata aeMetadata, int i);

    public static final native void AeMetadata_state_set(long j, AeMetadata aeMetadata, int i);

    public static final native int AeMetadata_touch_roi_type_get(long j, AeMetadata aeMetadata);

    public static final native void AeMetadata_touch_roi_type_set(long j, AeMetadata aeMetadata, int i);

    public static final native void AeModeResult_final_tet_set(long j, AeModeResult aeModeResult, float f);

    public static final native void AeModeResult_ideal_tet_set(long j, AeModeResult aeModeResult, float f);

    public static final native void AeModeResult_log_scene_brightness_set(long j, AeModeResult aeModeResult, float f);

    public static final native void AeModeResult_touch_area_linear_value_set(long j, AeModeResult aeModeResult, float f);

    public static final native void AeModeResult_touch_roi_clip_protection_tripped_set(long j, AeModeResult aeModeResult, boolean z);

    public static final native boolean AeResults_Check(long j, AeResults aeResults);

    public static final native float AeResults_FinalHdrRatio(long j, AeResults aeResults);

    public static final native float AeResults_FinalPortraitTetGain(long j, AeResults aeResults);

    public static final native float AeResults_FinalTet(long j, AeResults aeResults, int i);

    public static final native float AeResults_LogSceneBrightness(long j, AeResults aeResults);

    public static final native void AeResults_fraction_pixels_clipped_at_final_short_tet_set(long j, AeResults aeResults, float f);

    public static final native void AeResults_mode_result_set(long j, AeResults aeResults, long[] jArr);

    public static final native long AeResults_portrait_result_get(long j, AeResults aeResults);

    public static final native void AeResults_predicted_image_brightness_set(long j, AeResults aeResults, float f);

    public static final native void AeResults_process_ae_stats_executed_set(long j, AeResults aeResults, boolean z);

    public static final native void AeResults_pure_fraction_of_pixels_from_long_exposure_set(long j, AeResults aeResults, float f);

    public static final native void AeResults_safe_underexposure_set(long j, AeResults aeResults, float f);

    public static final native void AeResults_weighted_fraction_of_pixels_from_long_exposure_set(long j, AeResults aeResults, float f);

    public static final native void AeShotParams_ark_priority_set(long j, AeShotParams aeShotParams, boolean z);

    public static final native int AeShotParams_auto_night_sight_get(long j, AeShotParams aeShotParams);

    public static final native void AeShotParams_auto_night_sight_set(long j, AeShotParams aeShotParams, int i);

    public static final native long AeShotParams_crop_get(long j, AeShotParams aeShotParams);

    public static final native void AeShotParams_crop_set(long j, AeShotParams aeShotParams, long j2, NormalizedRect normalizedRect);

    public static final native void AeShotParams_exposure_compensation_set(long j, AeShotParams aeShotParams, float f);

    public static final native void AeShotParams_general_brightness_preference_set(long j, AeShotParams aeShotParams, float f);

    public static final native void AeShotParams_legacy_pre_slm_processing_set(long j, AeShotParams aeShotParams, boolean z);

    public static final native void AeShotParams_long_ae_brightness_bias_set(long j, AeShotParams aeShotParams, float f);

    public static final native void AeShotParams_manual_tet_from_manual_control_set(long j, AeShotParams aeShotParams, boolean z);

    public static final native long AeShotParams_merged_crop_get(long j, AeShotParams aeShotParams);

    public static final native void AeShotParams_merged_crop_set(long j, AeShotParams aeShotParams, long j2, NormalizedRect normalizedRect);

    public static final native void AeShotParams_people_brightness_preference_set(long j, AeShotParams aeShotParams, float f);

    public static final native void AeShotParams_relighting_expected_set(long j, AeShotParams aeShotParams, boolean z);

    public static final native void AeShotParams_target_height_set(long j, AeShotParams aeShotParams, int i);

    public static final native void AeShotParams_target_width_set(long j, AeShotParams aeShotParams, int i);

    public static final native int AeShotParams_touch_roi_type_get(long j, AeShotParams aeShotParams);

    public static final native void AeShotParams_touch_roi_type_set(long j, AeShotParams aeShotParams, int i);

    public static final native void AeShotParams_use_eclipse_set(long j, AeShotParams aeShotParams, boolean z);

    public static final native void AeShotParams_ux_mode_set(long j, AeShotParams aeShotParams, int i);

    public static final native long AeShotParams_weighted_metering_areas_get(long j, AeShotParams aeShotParams);

    public static final native long AfMetadata_metering_rectangles_get(long j, AfMetadata afMetadata);

    public static final native void AfMetadata_mode_set(long j, AfMetadata afMetadata, int i);

    public static final native int AfMetadata_state_get(long j, AfMetadata afMetadata);

    public static final native void AfMetadata_state_set(long j, AfMetadata afMetadata, int i);

    public static final native void AfMetadata_trigger_set(long j, AfMetadata afMetadata, int i);

    public static final native void ApplySensorBinning__SWIG_0(int i, boolean z, boolean z2, long j, FrameMetadata frameMetadata);

    public static final native boolean ApplySensorBinning__SWIG_1(int i, long j, StaticMetadata staticMetadata);

    public static final native void ApplySensorCropping(long j, PixelRect pixelRect, long j2, FrameMetadata frameMetadata);

    public static final native float ArkInfo_brightness_factor_get(long j, ArkInfo arkInfo);

    public static final native void ArkInfo_brightness_factor_set(long j, ArkInfo arkInfo, float f);

    public static final native int ArkInfo_exposure_mode_get(long j, ArkInfo arkInfo);

    public static final native void ArkInfo_exposure_mode_set(long j, ArkInfo arkInfo, int i);

    public static final native float ArkInfo_exposure_time_ms_get(long j, ArkInfo arkInfo);

    public static final native void ArkInfo_exposure_time_ms_set(long j, ArkInfo arkInfo, float f);

    public static final native void ArkInfo_focus_distance_set(long j, ArkInfo arkInfo, float f);

    public static final native int ArkInfo_focus_mode_get(long j, ArkInfo arkInfo);

    public static final native void ArkInfo_focus_mode_set(long j, ArkInfo arkInfo, int i);

    public static final native float ArkInfo_gain_get(long j, ArkInfo arkInfo);

    public static final native void ArkInfo_gain_set(long j, ArkInfo arkInfo, float f);

    public static final native float ArkInfo_shadow_factor_get(long j, ArkInfo arkInfo);

    public static final native void ArkInfo_shadow_factor_set(long j, ArkInfo arkInfo, float f);

    public static final native float ArkInfo_white_balance_factor_get(long j, ArkInfo arkInfo);

    public static final native void ArkInfo_white_balance_factor_set(long j, ArkInfo arkInfo, float f);

    public static final native int AssetData_fd_get(long j, AssetData assetData);

    public static final native void AssetData_fd_set(long j, AssetData assetData, int i);

    public static final native int AssetData_length_get(long j, AssetData assetData);

    public static final native void AssetData_length_set(long j, AssetData assetData, int i);

    public static final native void AssetData_name_set(long j, AssetData assetData, String str);

    public static final native int AssetData_offset_get(long j, AssetData assetData);

    public static final native void AssetData_offset_set(long j, AssetData assetData, int i);

    public static final native void AwbInfoTableMap_set(long j, AwbInfoTableMap awbInfoTableMap, short s, long j2, AwbInfo awbInfo);

    public static final native void AwbInfoTable_awb_infos_set(long j, AwbInfoTable awbInfoTable, long j2, AwbInfoTableMap awbInfoTableMap);

    public static final native boolean AwbInfo_IsValid(long j, AwbInfo awbInfo);

    public static final native long AwbInfo_rgb2rgb_get(long j, AwbInfo awbInfo);

    public static final native void AwbInfo_rgb2rgb_set(long j, AwbInfo awbInfo, long j2, FloatArray9 floatArray9);

    public static final native long AwbInfo_rggb_gains_get(long j, AwbInfo awbInfo);

    public static final native void AwbInfo_rggb_gains_set(long j, AwbInfo awbInfo, long j2, FloatArray4 floatArray4);

    public static final native void AwbMetadata_lock_set(long j, AwbMetadata awbMetadata, boolean z);

    public static final native long AwbMetadata_metering_rectangles_get(long j, AwbMetadata awbMetadata);

    public static final native void AwbMetadata_mode_set(long j, AwbMetadata awbMetadata, int i);

    public static final native void AwbMetadata_state_set(long j, AwbMetadata awbMetadata, int i);

    public static final native void BuildPayloadBurstSpecOptions_bento_max_shot_capture_time_ms_set(long j, BuildPayloadBurstSpecOptions buildPayloadBurstSpecOptions, float f);

    public static final native void BuildPayloadBurstSpecOptions_cyclops_enable_full_frame_set(long j, BuildPayloadBurstSpecOptions buildPayloadBurstSpecOptions, boolean z);

    public static final native void BuildPayloadBurstSpecOptions_cyclops_enabled_set(long j, BuildPayloadBurstSpecOptions buildPayloadBurstSpecOptions, boolean z);

    public static final native void BuildPayloadBurstSpecOptions_cyclops_f_number_scale_set(long j, BuildPayloadBurstSpecOptions buildPayloadBurstSpecOptions, float f);

    public static final native void BuildPayloadBurstSpecOptions_cyclops_force_trigger_face_set(long j, BuildPayloadBurstSpecOptions buildPayloadBurstSpecOptions, boolean z);

    public static final native void BuildPayloadBurstSpecOptions_cyclops_force_trigger_full_frame_set(long j, BuildPayloadBurstSpecOptions buildPayloadBurstSpecOptions, boolean z);

    public static final native void BuildPayloadBurstSpecOptions_cyclops_max_shot_capture_time_ms_set(long j, BuildPayloadBurstSpecOptions buildPayloadBurstSpecOptions, float f);

    public static final native void BuildPayloadBurstSpecOptions_cyclops_preferred_set(long j, BuildPayloadBurstSpecOptions buildPayloadBurstSpecOptions, boolean z);

    public static final native void BuildPayloadBurstSpecOptions_default_max_bracketing_frames_set(long j, BuildPayloadBurstSpecOptions buildPayloadBurstSpecOptions, int i);

    public static final native void BuildPayloadBurstSpecOptions_exposure_time_override_ms_set(long j, BuildPayloadBurstSpecOptions buildPayloadBurstSpecOptions, float f);

    public static final native void BuildPayloadBurstSpecOptions_gain_override_set(long j, BuildPayloadBurstSpecOptions buildPayloadBurstSpecOptions, float f);

    public static final native void BuildPayloadBurstSpecOptions_include_dropped_bracketing_frame_set(long j, BuildPayloadBurstSpecOptions buildPayloadBurstSpecOptions, boolean z);

    public static final native void BuildPayloadBurstSpecOptions_include_ultra_short_frame_set(long j, BuildPayloadBurstSpecOptions buildPayloadBurstSpecOptions, boolean z);

    public static final native void BuildPayloadBurstSpecOptions_leading_short_exp_requests_set(long j, BuildPayloadBurstSpecOptions buildPayloadBurstSpecOptions, int i);

    public static final native void BuildPayloadBurstSpecOptions_max_exposure_time_ms_set(long j, BuildPayloadBurstSpecOptions buildPayloadBurstSpecOptions, float f);

    public static final native void BuildPayloadBurstSpecOptions_max_frame_count_set(long j, BuildPayloadBurstSpecOptions buildPayloadBurstSpecOptions, int i);

    public static final native void BuildPayloadBurstSpecOptions_max_total_capture_time_ms_set(long j, BuildPayloadBurstSpecOptions buildPayloadBurstSpecOptions, float f);

    public static final native void BuildPayloadBurstSpecOptions_recompute_ae_set(long j, BuildPayloadBurstSpecOptions buildPayloadBurstSpecOptions, boolean z);

    public static final native void BuildPayloadBurstSpecOptions_shasta_zsl_set(long j, BuildPayloadBurstSpecOptions buildPayloadBurstSpecOptions, boolean z);

    public static final native void BuildPayloadBurstSpecOptions_ultra_short_first_set(long j, BuildPayloadBurstSpecOptions buildPayloadBurstSpecOptions, boolean z);

    public static final native void BuildPayloadBurstSpecOptions_ultrashort_tet_factor_set(long j, BuildPayloadBurstSpecOptions buildPayloadBurstSpecOptions, float f);

    public static final native float BurstSpec_TotalCaptureTimeMs(long j, BurstSpec burstSpec, float f);

    public static final native long BurstSpec_frame_requests_get(long j, BurstSpec burstSpec);

    public static final native void BurstSpec_frame_requests_set(long j, BurstSpec burstSpec, long j2, FrameRequestVector frameRequestVector);

    public static final native void ClientShotMetadata_location_set(long j, ClientShotMetadata clientShotMetadata, long j2, LocationData locationData);

    public static final native void ClutWeightVector_emplace_back(long j, ClutWeightVector clutWeightVector, int i, float f);

    public static final native long ClutWeights_clut_weights_get(long j, ClutWeights clutWeights);

    public static final native long ConvertImageToCroppedGrayMap(long j, GrayReadViewU8 grayReadViewU8, long j2, NormalizedRect normalizedRect);

    public static final native long CroppedGrayMap_crop_get(long j, CroppedGrayMap croppedGrayMap);

    public static final native boolean CyclopsParameters_apply_isp_tonemapping_get(long j, CyclopsParameters cyclopsParameters);

    public static final native long CyclopsParameters_face_ids_get(long j, CyclopsParameters cyclopsParameters);

    public static final native long CyclopsParameters_trigger_roi_get(long j, CyclopsParameters cyclopsParameters);

    public static final native long DEBUG_SAVE_INPUT_METERING_get();

    public static final native long DEBUG_SAVE_INPUT_PAYLOAD_get();

    public static final native long DEBUG_SAVE_METADATA_get();

    public static final native boolean DarkShadingData_SetDarkShadingDataFromBytes(long j, DarkShadingData darkShadingData, long j2, long j3);

    public static final native void DebugParams_image_saver_params_set(long j, DebugParams debugParams, long j2, ImageSaverParams imageSaverParams);

    public static final native void DebugParams_save_bitmask_set(long j, DebugParams debugParams, long j2);

    public static final native int DegreesToImageRotation(int i);

    public static final native boolean DirtyLensHistory_AddRawScore(long j, DirtyLensHistory dirtyLensHistory, float f);

    public static final native void DirtyLensHistory_Reset(long j, DirtyLensHistory dirtyLensHistory);

    public static final native void DirtyLensHistory_frame_influence_decay_rate__set(long j, DirtyLensHistory dirtyLensHistory, float f);

    public static final native void DirtyLensHistory_initial_score__set(long j, DirtyLensHistory dirtyLensHistory, float f);

    public static final native void DirtyLensHistory_max_photo_count__set(long j, DirtyLensHistory dirtyLensHistory, int i);

    public static final native long DirtyLensHistory_raw_score_history__get(long j, DirtyLensHistory dirtyLensHistory);

    public static final native void DirtyLensHistory_raw_score_history__set(long j, DirtyLensHistory dirtyLensHistory, long j2, FloatDeque floatDeque);

    public static final native void DirtyLensHistory_weighted_score_threshold__set(long j, DirtyLensHistory dirtyLensHistory, float f);

    public static final native void DngColorCalibrationVector_add(long j, DngColorCalibrationVector dngColorCalibrationVector, long j2, DngColorCalibration dngColorCalibration);

    public static final native void DngColorCalibration_illuminant_set(long j, DngColorCalibration dngColorCalibration, int i);

    public static final native void DngColorCalibration_model_rgb_to_device_rgb_set(long j, DngColorCalibration dngColorCalibration, long j2, FloatArray9 floatArray9);

    public static final native void DngColorCalibration_xyz_to_model_rgb_set(long j, DngColorCalibration dngColorCalibration, long j2, FloatArray9 floatArray9);

    public static final native void FaceInfoVector_add(long j, FaceInfoVector faceInfoVector, long j2, FaceInfo faceInfo);

    public static final native long FaceInfoVector_get(long j, FaceInfoVector faceInfoVector, int i);

    public static final native long FaceInfoVector_size(long j, FaceInfoVector faceInfoVector);

    public static final native void FaceInfo_Landmark_x_set(long j, FaceInfo.Landmark landmark, float f);

    public static final native void FaceInfo_Landmark_y_set(long j, FaceInfo.Landmark landmark, float f);

    public static final native void FaceInfo_confidence_set(long j, FaceInfo faceInfo, float f);

    public static final native void FaceInfo_face_type_set(long j, FaceInfo faceInfo, int i);

    public static final native void FaceInfo_familiarity_set(long j, FaceInfo faceInfo, float f);

    public static final native void FaceInfo_id_set(long j, FaceInfo faceInfo, int i);

    public static final native long FaceInfo_landmarks_get(long j, FaceInfo faceInfo);

    public static final native void FaceInfo_monk_skin_type_set(long j, FaceInfo faceInfo, float f);

    public static final native void FaceInfo_pan_angle_set(long j, FaceInfo faceInfo, float f);

    public static final native void FaceInfo_pos_x_set(long j, FaceInfo faceInfo, float f);

    public static final native void FaceInfo_pos_y_set(long j, FaceInfo faceInfo, float f);

    public static final native void FaceInfo_roll_angle_set(long j, FaceInfo faceInfo, float f);

    public static final native void FaceInfo_size_set(long j, FaceInfo faceInfo, float f);

    public static final native void FaceInfo_tilt_angle_set(long j, FaceInfo faceInfo, float f);

    public static final native boolean FlipHdrGainMapHorizontal(long j, ShotMetadata shotMetadata);

    public static final native float FloatArray2_get(long j, FloatArray2 floatArray2, int i);

    public static final native void FloatArray2_set(long j, FloatArray2 floatArray2, int i, float f);

    public static final native long FloatArray2_size(long j, FloatArray2 floatArray2);

    public static final native float FloatArray4_get(long j, FloatArray4 floatArray4, int i);

    public static final native void FloatArray4_set(long j, FloatArray4 floatArray4, int i, float f);

    public static final native long FloatArray4_size(long j, FloatArray4 floatArray4);

    public static final native float FloatArray9_get(long j, FloatArray9 floatArray9, int i);

    public static final native void FloatArray9_set(long j, FloatArray9 floatArray9, int i, float f);

    public static final native long FloatArray9_size(long j, FloatArray9 floatArray9);

    public static final native float FloatDeque_getitem(long j, FloatDeque floatDeque, int i);

    public static final native void FloatDeque_push_back(long j, FloatDeque floatDeque, float f);

    public static final native long FloatDeque_size(long j, FloatDeque floatDeque);

    public static final native void FloatVector_add(long j, FloatVector floatVector, float f);

    public static final native float FloatVector_get(long j, FloatVector floatVector, int i);

    public static final native boolean FloatVector_isEmpty(long j, FloatVector floatVector);

    public static final native void FrameMetadata_accel_samples_set(long j, FrameMetadata frameMetadata, long j2, AccelSampleVector accelSampleVector);

    public static final native float FrameMetadata_actual_analog_gain_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_actual_analog_gain_set(long j, FrameMetadata frameMetadata, float f);

    public static final native float FrameMetadata_actual_exposure_time_ms_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_actual_exposure_time_ms_set(long j, FrameMetadata frameMetadata, float f);

    public static final native long FrameMetadata_actuator_samples_get(long j, FrameMetadata frameMetadata);

    public static final native long FrameMetadata_ae_get(long j, FrameMetadata frameMetadata);

    public static final native long FrameMetadata_ae_results_get(long j, FrameMetadata frameMetadata);

    public static final native long FrameMetadata_af_get(long j, FrameMetadata frameMetadata);

    public static final native float FrameMetadata_applied_digital_gain_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_applied_digital_gain_set(long j, FrameMetadata frameMetadata, float f);

    public static final native long FrameMetadata_awb_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_black_levels_bayer_set(long j, FrameMetadata frameMetadata, long j2, FloatArray4 floatArray4);

    public static final native void FrameMetadata_burst_frame_type_set(long j, FrameMetadata frameMetadata, int i);

    public static final native long FrameMetadata_clut_weights_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_control_mode_set(long j, FrameMetadata frameMetadata, int i);

    public static final native void FrameMetadata_dng_noise_model_bayer_set(long j, FrameMetadata frameMetadata, long j2, NoiseModel noiseModel);

    public static final native void FrameMetadata_f_number_set(long j, FrameMetadata frameMetadata, float f);

    public static final native void FrameMetadata_face_category_map_set(long j, FrameMetadata frameMetadata, long j2, CroppedGrayMap croppedGrayMap);

    public static final native long FrameMetadata_face_id_to_instance_id_get(long j, FrameMetadata frameMetadata);

    public static final native long FrameMetadata_faces_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_flash_set(long j, FrameMetadata frameMetadata, int i);

    public static final native void FrameMetadata_focal_length_mm_set(long j, FrameMetadata frameMetadata, float f);

    public static final native void FrameMetadata_focus_distance_diopters_set(long j, FrameMetadata frameMetadata, float f);

    public static final native void FrameMetadata_frame_duration_ms_set(long j, FrameMetadata frameMetadata, float f);

    public static final native long FrameMetadata_geometric_calibration_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_geometric_calibration_set(long j, FrameMetadata frameMetadata, long j2, GeometricCalibrationVector geometricCalibrationVector);

    public static final native long FrameMetadata_gyro_samples_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_gyro_samples_set(long j, FrameMetadata frameMetadata, long j2, GyroSampleVector gyroSampleVector);

    public static final native long FrameMetadata_hal_af_metadata_get(long j, FrameMetadata frameMetadata);

    public static final native long FrameMetadata_hot_pixel_metadata_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_lens_state_set(long j, FrameMetadata frameMetadata, int i);

    public static final native long FrameMetadata_live_hdr_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_live_hdr_set(long j, FrameMetadata frameMetadata, long j2, LiveHdrMetadata liveHdrMetadata);

    public static final native long FrameMetadata_mesh_warp_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_mesh_warp_set(long j, FrameMetadata frameMetadata, long j2, MeshWarp meshWarp);

    public static final native void FrameMetadata_multiclass_probability_map_set(long j, FrameMetadata frameMetadata, long j2, CroppedGrayMap croppedGrayMap);

    public static final native void FrameMetadata_multiclass_segmentation_map_set(long j, FrameMetadata frameMetadata, long j2, CroppedGrayMap croppedGrayMap);

    public static final native long FrameMetadata_ois_metadata_get(long j, FrameMetadata frameMetadata);

    public static final native long FrameMetadata_per_person_awb_get(long j, FrameMetadata frameMetadata);

    public static final native long FrameMetadata_person_instance_probability_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_person_instance_segmentation_map_set(long j, FrameMetadata frameMetadata, long j2, CroppedGrayMap croppedGrayMap);

    public static final native long FrameMetadata_pet_faces_get(long j, FrameMetadata frameMetadata);

    public static final native long FrameMetadata_portrait_map_get(long j, FrameMetadata frameMetadata);

    public static final native float FrameMetadata_post_raw_digital_gain_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_post_raw_digital_gain_set(long j, FrameMetadata frameMetadata, float f);

    public static final native long FrameMetadata_saliency_map_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_scene_flicker_set(long j, FrameMetadata frameMetadata, long j2, SceneFlicker sceneFlicker);

    public static final native long FrameMetadata_semantic_awb_get(long j, FrameMetadata frameMetadata);

    public static final native int FrameMetadata_sensor_id_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_sensor_id_set(long j, FrameMetadata frameMetadata, int i);

    public static final native void FrameMetadata_sensor_temp_set(long j, FrameMetadata frameMetadata, int i);

    public static final native long FrameMetadata_skin_area_faces_get(long j, FrameMetadata frameMetadata);

    public static final native long FrameMetadata_spatial_awb_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_timestamp_faces_ns_set(long j, FrameMetadata frameMetadata, long j2);

    public static final native long FrameMetadata_timestamp_ns_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_timestamp_ns_set(long j, FrameMetadata frameMetadata, long j2);

    public static final native void FrameMetadata_was_black_level_locked_set(long j, FrameMetadata frameMetadata, boolean z);

    public static final native long FrameMetadata_wb_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_wb_set(long j, FrameMetadata frameMetadata, long j2, AwbInfo awbInfo);

    public static final native void FrameRequestVector_add(long j, FrameRequestVector frameRequestVector, long j2, FrameRequest frameRequest);

    public static final native void FrameRequestVector_clear(long j, FrameRequestVector frameRequestVector);

    public static final native long FrameRequestVector_get(long j, FrameRequestVector frameRequestVector, int i);

    public static final native boolean FrameRequestVector_isEmpty(long j, FrameRequestVector frameRequestVector);

    public static final native long FrameRequestVector_size(long j, FrameRequestVector frameRequestVector);

    public static final native boolean FrameRequest_Equals(long j, FrameRequest frameRequest, long j2, FrameRequest frameRequest2);

    public static final native boolean FrameRequest_android_statistics_hot_pixel_map_mode_get(long j, FrameRequest frameRequest);

    public static final native long FrameRequest_awb_get(long j, FrameRequest frameRequest);

    public static final native long FrameRequest_cyclops_params_get(long j, FrameRequest frameRequest);

    public static final native float FrameRequest_desired_additional_sensor_frame_duration_ms_get(long j, FrameRequest frameRequest);

    public static final native float FrameRequest_desired_analog_gain_get(long j, FrameRequest frameRequest);

    public static final native float FrameRequest_desired_digital_gain_get(long j, FrameRequest frameRequest);

    public static final native float FrameRequest_desired_exposure_time_ms_get(long j, FrameRequest frameRequest);

    public static final native float FrameRequest_desired_focus_distance_diopters_get(long j, FrameRequest frameRequest);

    public static final native float FrameRequest_long_tet_get(long j, FrameRequest frameRequest);

    public static final native float FrameRequest_portrait_tet_get(long j, FrameRequest frameRequest);

    public static final native float FrameRequest_short_tet_get(long j, FrameRequest frameRequest);

    public static final native boolean FrameRequest_try_to_lock_black_level_get(long j, FrameRequest frameRequest);

    public static final native int FrameRequest_type_get(long j, FrameRequest frameRequest);

    public static final native void Gcam_AbortShot(long j, Gcam gcam, int i);

    public static final native boolean Gcam_AllSensorIdsUnique(long j, Gcam gcam);

    public static final native void Gcam_BeginPayloadFrames(long j, Gcam gcam, int i, long j2, BurstSpec burstSpec);

    public static final native long Gcam_BuildAfBurstSpec(long j, Gcam gcam, int i, long j2, RawReadView rawReadView, long j3, FrameMetadata frameMetadata, long j4, SpatialGainMap spatialGainMap, float f);

    public static final native long Gcam_BuildPayloadBurstSpec__SWIG_0(long j, Gcam gcam, int i, long j2, RawReadView rawReadView, long j3, FrameMetadata frameMetadata, long j4, SpatialGainMap spatialGainMap, long j5, BuildPayloadBurstSpecOptions buildPayloadBurstSpecOptions);

    public static final native long Gcam_BuildPayloadBurstSpec__SWIG_1(long j, Gcam gcam, int i, long j2, FrameMetadata frameMetadata, long j3, BuildPayloadBurstSpecOptions buildPayloadBurstSpecOptions);

    public static final native boolean Gcam_ClaimFrameForBinning(long j, Gcam gcam, long j2, FrameMetadataKey frameMetadataKey);

    public static final native long Gcam_ComputeAeResults(long j, StaticMetadata staticMetadata, long j2, Tuning tuning, long j3, AeShotParams aeShotParams, long j4, RawReadView rawReadView, long j5, FrameMetadata frameMetadata, long j6, SpatialGainMap spatialGainMap, boolean z);

    public static final native void Gcam_ConfigureViewfinderProcessing(long j, Gcam gcam, long j2, ViewfinderProcessingOptions viewfinderProcessingOptions);

    public static final native long Gcam_Create(long j, InitParams initParams, long j2, StaticMetadataVector staticMetadataVector);

    public static final native boolean Gcam_EndPayloadFrames(long j, Gcam gcam, int i, long j2, BurstSpec burstSpec, long j3, ClientShotMetadata clientShotMetadata, boolean z);

    public static final native boolean Gcam_EndShotCapture(long j, Gcam gcam, int i);

    public static final native void Gcam_EndZslPayloadFrames(long j, Gcam gcam, int i);

    public static final native int Gcam_FindFirstCamera(long j, Gcam gcam, int i);

    public static final native void Gcam_FlushTemporalBinning(long j, Gcam gcam, int i);

    public static final native void Gcam_FlushViewfinder(long j, Gcam gcam, int i);

    public static final native long Gcam_GenerateRgbImage(long j, Gcam gcam, long j2, StaticMetadata staticMetadata, long j3, ShotParams shotParams, long j4, FrameMetadata frameMetadata, long j5, SpatialGainMap spatialGainMap, long j6, RawWriteView rawWriteView, int i, long j7, GenerateRgbImageOptions generateRgbImageOptions);

    public static final native long Gcam_GetLancetRunner(long j, Gcam gcam);

    public static final native long Gcam_GetLatestViewfinderResults(long j, Gcam gcam, int i);

    public static final native int Gcam_GetNumCameras(long j, Gcam gcam);

    public static final native long Gcam_GetPortraitBrighteningProcessor(long j, Gcam gcam);

    public static final native long Gcam_GetStaticMetadata(long j, Gcam gcam, int i);

    public static final native long Gcam_GetTuning(long j, Gcam gcam, int i);

    public static final native long Gcam_GetWalnutRunner(long j, Gcam gcam);

    public static final native boolean Gcam_LimitShotCpuUsage(long j, Gcam gcam, int i, float f);

    public static final native boolean Gcam_LockFrameFromFutureBinning(long j, Gcam gcam, long j2, FrameMetadataKey frameMetadataKey);

    public static final native boolean Gcam_OverrideFrameMetadata(long j, Gcam gcam, long j2, FrameMetadataKey frameMetadataKey, long j3, FrameMetadata frameMetadata);

    public static final native void Gcam_ResetThreadPriority(long j, Gcam gcam);

    public static final native void Gcam_SetThreadPriority(long j, Gcam gcam, int i);

    public static final native int Gcam_StartShotCapture(long j, Gcam gcam, int i, long j2, ShotParams shotParams, long j3, ShotCallbacks shotCallbacks, long j4, DebugParams debugParams);

    public static final native void GenerateRgbImageOptions_actual_number_of_frames_set(long j, GenerateRgbImageOptions generateRgbImageOptions, int i);

    public static final native void GenerateRgbImageOptions_debug_params_set(long j, GenerateRgbImageOptions generateRgbImageOptions, long j2, DebugParams debugParams);

    public static final native void GenerateRgbImageOptions_expected_number_of_frames_set(long j, GenerateRgbImageOptions generateRgbImageOptions, int i);

    public static final native void GenerateRgbImageOptions_verbose_set(long j, GenerateRgbImageOptions generateRgbImageOptions, boolean z);

    public static final native void GeometricCalibrationVector_add(long j, GeometricCalibrationVector geometricCalibrationVector, long j2, GeometricCalibration geometricCalibration);

    public static final native boolean GeometricCalibrationVector_isEmpty(long j, GeometricCalibrationVector geometricCalibrationVector);

    public static final native void GeometricCalibration_active_rectangle_set(long j, GeometricCalibration geometricCalibration, long j2, PixelRect pixelRect);

    public static final native float[] GeometricCalibration_lens_distortion_extended_get(long j, GeometricCalibration geometricCalibration);

    public static final native void GeometricCalibration_lens_distortion_extended_set(long j, GeometricCalibration geometricCalibration, float[] fArr);

    public static final native float[] GeometricCalibration_lens_distortion_get(long j, GeometricCalibration geometricCalibration);

    public static final native void GeometricCalibration_lens_distortion_set(long j, GeometricCalibration geometricCalibration, float[] fArr);

    public static final native float[] GeometricCalibration_lens_intrinsic_calibration_get(long j, GeometricCalibration geometricCalibration);

    public static final native void GeometricCalibration_lens_intrinsic_calibration_set(long j, GeometricCalibration geometricCalibration, float[] fArr);

    public static final native void GeometricCalibration_lens_pose_rotation_set(long j, GeometricCalibration geometricCalibration, float[] fArr);

    public static final native void GeometricCalibration_lens_pose_translation_set(long j, GeometricCalibration geometricCalibration, float[] fArr);

    public static final native void GeometricCalibration_quality_set(long j, GeometricCalibration geometricCalibration, int i);

    public static final native void GeometricCalibration_valid_rectangle_set(long j, GeometricCalibration geometricCalibration, long j2, PixelRect pixelRect);

    public static final native String GetVersion();

    public static final native boolean GrayImageS16_empty(long j, GrayImageS16 grayImageS16);

    public static final native long GrayImageS16_read_view(long j, GrayImageS16 grayImageS16);

    public static final native int GrayImageS16_size_in_bytes(long j, GrayImageS16 grayImageS16);

    public static final native long GrayImageS16_write_view(long j, GrayImageS16 grayImageS16);

    public static final native long GrayReadViewU8_data(long j, GrayReadViewU8 grayReadViewU8);

    public static final native int GrayReadViewU8_height(long j, GrayReadViewU8 grayReadViewU8);

    public static final native int GrayReadViewU8_width(long j, GrayReadViewU8 grayReadViewU8);

    public static final native int GrayReadViewU8_x_stride(long j, GrayReadViewU8 grayReadViewU8);

    public static final native int GrayReadViewU8_y_stride(long j, GrayReadViewU8 grayReadViewU8);

    public static final native void GyroSampleVector_emplace_back(long j, GyroSampleVector gyroSampleVector, long j2, float f, float f2, float f3);

    public static final native boolean HalAfMetadata_SetAfTargetFocusInfoFromBytes(long j, HalAfMetadata halAfMetadata, long j2, long j3);

    public static final native boolean HalAfMetadata_SetFaceDeblurInfoFromBytes(long j, HalAfMetadata halAfMetadata, long j2, long j3);

    public static final native void HotPixelMetadataVector_emplace_back(long j, HotPixelMetadataVector hotPixelMetadataVector, int i, int i2);

    public static final native long HotPixelMetadata_hot_pixel_coordinates_get(long j, HotPixelMetadata hotPixelMetadata);

    public static final native long HotPixelMetadata_hot_pixel_image_size_get(long j, HotPixelMetadata hotPixelMetadata);

    public static final native int ImageRotationToDegrees(int i);

    public static final native void ImageSaverParams_dest_folder_set(long j, ImageSaverParams imageSaverParams, String str);

    public static final native void InitParams_allow_unknown_devices_set(long j, InitParams initParams, boolean z);

    public static final native void InitParams_eager_simultaneous_merge_and_finish_set(long j, InitParams initParams, boolean z);

    public static final native int InitParams_execute_finish_on_get(long j, InitParams initParams);

    public static final native void InitParams_execute_finish_on_set(long j, InitParams initParams, int i);

    public static final native int InitParams_execute_postview_on_get(long j, InitParams initParams);

    public static final native void InitParams_execute_postview_on_set(long j, InitParams initParams, int i);

    public static final native void InitParams_finish_almond_enabled_set(long j, InitParams initParams, boolean z);

    public static final native void InitParams_finish_almond_initialize_on_gcam_creation_set(long j, InitParams initParams, boolean z);

    public static final native void InitParams_finish_kepler_gan_enabled_set(long j, InitParams initParams, boolean z);

    public static final native void InitParams_finish_kepler_gan_initialize_on_gcam_creation_set(long j, InitParams initParams, boolean z);

    public static final native void InitParams_finish_lancet_enabled_set(long j, InitParams initParams, boolean z);

    public static final native void InitParams_finish_lancet_initialize_on_gcam_creation_set(long j, InitParams initParams, boolean z);

    public static final native void InitParams_finish_ml_walnut_enabled_set(long j, InitParams initParams, boolean z);

    public static final native void InitParams_finish_ml_walnut_initialize_on_gcam_creation_set(long j, InitParams initParams, boolean z);

    public static final native void InitParams_finish_mst_based_contrast_enhancement_enabled_set(long j, InitParams initParams, boolean z);

    public static final native void InitParams_finish_pecan_enabled_set(long j, InitParams initParams, boolean z);

    public static final native void InitParams_finish_pecan_initialize_on_gcam_creation_set(long j, InitParams initParams, boolean z);

    public static final native void InitParams_finish_pecan_light_model_enabled_set(long j, InitParams initParams, boolean z);

    public static final native void InitParams_finish_pecan_pie_enabled_set(long j, InitParams initParams, boolean z);

    public static final native void InitParams_finish_pecan_wait_until_ready_set(long j, InitParams initParams, boolean z);

    public static final native void InitParams_finish_pipeline_type_set(long j, InitParams initParams, int i);

    public static final native void InitParams_portrait_brightening_enabled_set(long j, InitParams initParams, boolean z);

    public static final native void InitParams_reference_focal_length_35mm_set(long j, InitParams initParams, long j2, FloatArray2 floatArray2);

    public static final native void InitParams_serialized_cache_dir_set(long j, InitParams initParams, String str);

    public static final native void InitParams_simultaneous_merge_and_finish_set(long j, InitParams initParams, boolean z);

    public static final native void InitParams_spatial_merge_processor_error_fallback_set(long j, InitParams initParams, boolean z);

    public static final native void InitParams_spatial_merge_processor_type_set(long j, InitParams initParams, int i);

    public static final native void InitParams_standard_bayer_separable_rgb_merge_set(long j, InitParams initParams, boolean z);

    public static final native void InitParams_wait_for_portrait_brightening_init_set(long j, InitParams initParams, boolean z);

    public static final native void Int16ToFloatMap_set(long j, Int16ToFloatMap int16ToFloatMap, short s, float f);

    public static final native void Int16ToInt16Map_set(long j, Int16ToInt16Map int16ToInt16Map, short s, short s2);

    public static final native int IntVector_get(long j, IntVector intVector, int i);

    public static final native long IntVector_size(long j, IntVector intVector);

    public static final native long InterleavedImageS16_read_view(long j, InterleavedImageS16 interleavedImageS16);

    public static final native int InterleavedImageS16_size_in_bytes(long j, InterleavedImageS16 interleavedImageS16);

    public static final native long InterleavedImageS16_write_view(long j, InterleavedImageS16 interleavedImageS16);

    public static final native int InterleavedImageU16_height(long j, InterleavedImageU16 interleavedImageU16);

    public static final native long InterleavedImageU16_read_view(long j, InterleavedImageU16 interleavedImageU16);

    public static final native int InterleavedImageU16_size_in_bytes(long j, InterleavedImageU16 interleavedImageU16);

    public static final native int InterleavedImageU16_width(long j, InterleavedImageU16 interleavedImageU16);

    public static final native long InterleavedImageU16_write_view(long j, InterleavedImageU16 interleavedImageU16);

    public static final native int InterleavedImageU8_channels(long j, InterleavedImageU8 interleavedImageU8);

    public static final native boolean InterleavedImageU8_empty(long j, InterleavedImageU8 interleavedImageU8);

    public static final native int InterleavedImageU8_height(long j, InterleavedImageU8 interleavedImageU8);

    public static final native long InterleavedImageU8_read_view(long j, InterleavedImageU8 interleavedImageU8);

    public static final native int InterleavedImageU8_size_in_bytes(long j, InterleavedImageU8 interleavedImageU8);

    public static final native int InterleavedImageU8_width(long j, InterleavedImageU8 interleavedImageU8);

    public static final native long InterleavedImageU8_write_view(long j, InterleavedImageU8 interleavedImageU8);

    public static final native int InterleavedReadViewU8_c_stride(long j, InterleavedReadViewU8 interleavedReadViewU8);

    public static final native int InterleavedReadViewU8_channels(long j, InterleavedReadViewU8 interleavedReadViewU8);

    public static final native long InterleavedReadViewU8_data(long j, InterleavedReadViewU8 interleavedReadViewU8);

    public static final native int InterleavedReadViewU8_height(long j, InterleavedReadViewU8 interleavedReadViewU8);

    public static final native int InterleavedReadViewU8_width(long j, InterleavedReadViewU8 interleavedReadViewU8);

    public static final native int InterleavedReadViewU8_x_stride(long j, InterleavedReadViewU8 interleavedReadViewU8);

    public static final native int InterleavedReadViewU8_y_stride(long j, InterleavedReadViewU8 interleavedReadViewU8);

    public static final native int InterleavedWriteViewU8_channels(long j, InterleavedWriteViewU8 interleavedWriteViewU8);

    public static final native int InterleavedWriteViewU8_height(long j, InterleavedWriteViewU8 interleavedWriteViewU8);

    public static final native long InterleavedWriteViewU8_read_view(long j, InterleavedWriteViewU8 interleavedWriteViewU8);

    public static final native int InterleavedWriteViewU8_width(long j, InterleavedWriteViewU8 interleavedWriteViewU8);

    public static final native long Intersect(long j, NormalizedRect normalizedRect, long j2, NormalizedRect normalizedRect2);

    public static final native boolean IsLogical(int i);

    public static final native boolean IsQuadBayer(int i);

    public static final native boolean IsRgb(int i);

    public static final native boolean IsRgb8(int i);

    public static final native void JpgEncodeOptions_jpg_encoder_metadata_set(long j, JpgEncodeOptions jpgEncodeOptions, long j2, JpgEncoderMetadata jpgEncoderMetadata);

    public static final native void JpgEncodeOptions_quality_set(long j, JpgEncodeOptions jpgEncodeOptions, int i);

    public static final native void JpgEncodeOptions_shot_metadata_set(long j, JpgEncodeOptions jpgEncodeOptions, long j2, ShotMetadata shotMetadata);

    public static final native boolean JpgEncoderMetadata_hardware_jpg_encoder_requested_get(long j, JpgEncoderMetadata jpgEncoderMetadata);

    public static final native void JpgEncoderMetadata_hardware_jpg_encoder_requested_set(long j, JpgEncoderMetadata jpgEncoderMetadata, boolean z);

    public static final native boolean JpgEncoderMetadata_hardware_jpg_encoder_used_get(long j, JpgEncoderMetadata jpgEncoderMetadata);

    public static final native void LandmarkMap_set(long j, LandmarkMap landmarkMap, int i, long j2, FaceInfo.Landmark landmark);

    public static final native void LiveHdrMetadata_filtered_motion_speed_pix_per_ms_set(long j, LiveHdrMetadata liveHdrMetadata, float f);

    public static final native void LiveHdrMetadata_hdr_ratio_factor_set(long j, LiveHdrMetadata liveHdrMetadata, float f);

    public static final native float LiveHdrMetadata_manual_long_tet_override_get(long j, LiveHdrMetadata liveHdrMetadata);

    public static final native void LiveHdrMetadata_manual_long_tet_override_set(long j, LiveHdrMetadata liveHdrMetadata, float f);

    public static final native float LiveHdrMetadata_manual_portrait_tet_override_get(long j, LiveHdrMetadata liveHdrMetadata);

    public static final native void LiveHdrMetadata_manual_portrait_tet_override_set(long j, LiveHdrMetadata liveHdrMetadata, float f);

    public static final native float LiveHdrMetadata_manual_short_tet_override_get(long j, LiveHdrMetadata liveHdrMetadata);

    public static final native void LiveHdrMetadata_manual_short_tet_override_set(long j, LiveHdrMetadata liveHdrMetadata, float f);

    public static final native void LiveHdrMetadata_max_hdr_ratio_override_set(long j, LiveHdrMetadata liveHdrMetadata, float f);

    public static final native void LiveHdrMetadata_metering_interval_ms_set(long j, LiveHdrMetadata liveHdrMetadata, float f);

    public static final native void LiveHdrMetadata_motion_magnitude_pix_set(long j, LiveHdrMetadata liveHdrMetadata, float f);

    public static final native float LiveHdrMetadata_night_factor_get(long j, LiveHdrMetadata liveHdrMetadata);

    public static final native void LiveHdrMetadata_night_factor_set(long j, LiveHdrMetadata liveHdrMetadata, float f);

    public static final native void LiveHdrMetadata_viewfinder_long_tet_set(long j, LiveHdrMetadata liveHdrMetadata, float f);

    public static final native void LiveHdrMetadata_viewfinder_portrait_tet_set(long j, LiveHdrMetadata liveHdrMetadata, float f);

    public static final native void LiveHdrMetadata_viewfinder_short_tet_set(long j, LiveHdrMetadata liveHdrMetadata, float f);

    public static final native void LocationData_altitude_set(long j, LocationData locationData, double d);

    public static final native void LocationData_degree_of_precision_set(long j, LocationData locationData, double d);

    public static final native void LocationData_latitude_set(long j, LocationData locationData, double d);

    public static final native void LocationData_longitude_set(long j, LocationData locationData, double d);

    public static final native void LocationData_processing_method_set(long j, LocationData locationData, String str);

    public static final native void LocationData_timestamp_unix_set(long j, LocationData locationData, long j2);

    public static final native long MakeGrayReadViewU8__SWIG_1(int i, int i2, int i3, long j, int i4);

    public static final native int MeshTranslation_x_get(long j, MeshTranslation meshTranslation);

    public static final native int MeshTranslation_y_get(long j, MeshTranslation meshTranslation);

    public static final native long MeshWarp_TranslationHint(long j, MeshWarp meshWarp);

    public static final native int MeshWarp_grid_cols_get(long j, MeshWarp meshWarp);

    public static final native void MeshWarp_grid_cols_set(long j, MeshWarp meshWarp, int i);

    public static final native int MeshWarp_grid_rows_get(long j, MeshWarp meshWarp);

    public static final native void MeshWarp_grid_rows_set(long j, MeshWarp meshWarp, int i);

    public static final native boolean MeshWarp_is_forward_mesh_get(long j, MeshWarp meshWarp);

    public static final native void MeshWarp_is_forward_mesh_set(long j, MeshWarp meshWarp, boolean z);

    public static final native long MeshWarp_mesh_warp_crop_region_get(long j, MeshWarp meshWarp);

    public static final native long MeshWarp_mesh_warp_data_get(long j, MeshWarp meshWarp);

    public static final native long MeshWarp_mesh_warp_dst_region_get(long j, MeshWarp meshWarp);

    public static final native long NoiseModel_FromShotReadNoiseVector(long j, FloatVector floatVector, long j2, FloatVector floatVector2);

    public static final native boolean NormalizedRect_Equals(long j, NormalizedRect normalizedRect, long j2, NormalizedRect normalizedRect2);

    public static final native boolean NormalizedRect_IsEmpty(long j, NormalizedRect normalizedRect);

    public static final native String NormalizedRect_ToCompactString(long j, NormalizedRect normalizedRect);

    public static final native void NormalizedRect_x0_set(long j, NormalizedRect normalizedRect, float f);

    public static final native void NormalizedRect_x1_set(long j, NormalizedRect normalizedRect, float f);

    public static final native void NormalizedRect_y0_set(long j, NormalizedRect normalizedRect, float f);

    public static final native void NormalizedRect_y1_set(long j, NormalizedRect normalizedRect, float f);

    public static final native void OisMetadata_lens_optical_stabilization_mode_set(long j, OisMetadata oisMetadata, int i);

    public static final native long OisMetadata_ois_positions_get(long j, OisMetadata oisMetadata);

    public static final native long OisMetadata_ois_positions_raw_get(long j, OisMetadata oisMetadata);

    public static final native void OisMetadata_timestamp_ois_clock_ns_set(long j, OisMetadata oisMetadata, long j2);

    public static final native void OisPositionRawVector_emplace_back(long j, OisPositionRawVector oisPositionRawVector, long j2, int i, int i2);

    public static final native void OisPositionVector_emplace_back(long j, OisPositionVector oisPositionVector, long j2, float f, float f2);

    public static final native boolean OisPositionVector_isEmpty(long j, OisPositionVector oisPositionVector);

    public static final native long PhysicalStabilityParams_thresholds_get(long j, PhysicalStabilityParams physicalStabilityParams);

    public static final native float PhysicalStabilityThresholds_braced_speed_rad_per_sec_get(long j, PhysicalStabilityThresholds physicalStabilityThresholds);

    public static final native float PhysicalStabilityThresholds_tripod_speed_rad_per_sec_get(long j, PhysicalStabilityThresholds physicalStabilityThresholds);

    public static final native void PixelRectVector_add(long j, PixelRectVector pixelRectVector, long j2, PixelRect pixelRect);

    public static final native long PixelRectVector_size(long j, PixelRectVector pixelRectVector);

    public static final native int PixelRect_height(long j, PixelRect pixelRect);

    public static final native int PixelRect_width(long j, PixelRect pixelRect);

    public static final native int PixelRect_x0_get(long j, PixelRect pixelRect);

    public static final native void PixelRect_x0_set(long j, PixelRect pixelRect, int i);

    public static final native int PixelRect_x1_get(long j, PixelRect pixelRect);

    public static final native void PixelRect_x1_set(long j, PixelRect pixelRect, int i);

    public static final native int PixelRect_y0_get(long j, PixelRect pixelRect);

    public static final native void PixelRect_y0_set(long j, PixelRect pixelRect, int i);

    public static final native int PixelRect_y1_get(long j, PixelRect pixelRect);

    public static final native void PixelRect_y1_set(long j, PixelRect pixelRect, int i);

    public static final native void PortraitOutputs_dynamic_depth_result_ptr_set(long j, PortraitOutputs portraitOutputs, long j2);

    public static final native void PortraitOutputs_hdr_gain_map_info_ptr_set(long j, PortraitOutputs portraitOutputs, long j2);

    public static final native long PortraitRequest_ae_results_get(long j, PortraitRequest portraitRequest);

    public static final native void PortraitRequest_apply_portrait_matting_set(long j, PortraitRequest portraitRequest, boolean z);

    public static final native void PortraitRequest_cache_directory_set(long j, PortraitRequest portraitRequest, String str);

    public static final native void PortraitRequest_crop_set(long j, PortraitRequest portraitRequest, long j2, NormalizedRect normalizedRect);

    public static final native void PortraitRequest_depth_postprocessor_model_set(long j, PortraitRequest portraitRequest, long j2, AssetData assetData);

    public static final native int PortraitRequest_depth_processing_get(long j, PortraitRequest portraitRequest);

    public static final native void PortraitRequest_depth_processing_set(long j, PortraitRequest portraitRequest, int i);

    public static final native void PortraitRequest_embed_gdepth_metadata_set(long j, PortraitRequest portraitRequest, boolean z);

    public static final native void PortraitRequest_enable_arcore_feature_set(long j, PortraitRequest portraitRequest, boolean z);

    public static final native void PortraitRequest_enable_freesia_set(long j, PortraitRequest portraitRequest, boolean z);

    public static final native void PortraitRequest_enable_gpu_boost_set(long j, PortraitRequest portraitRequest, boolean z);

    public static final native void PortraitRequest_enable_lancet_upscaler_set(long j, PortraitRequest portraitRequest, boolean z);

    public static final native void PortraitRequest_enable_mermaid_set(long j, PortraitRequest portraitRequest, boolean z);

    public static final native void PortraitRequest_enable_mst_based_contrast_enhancement_set(long j, PortraitRequest portraitRequest, boolean z);

    public static final native void PortraitRequest_enable_pd_disparity_model_set(long j, PortraitRequest portraitRequest, boolean z);

    public static final native void PortraitRequest_enable_peony_awb_set(long j, PortraitRequest portraitRequest, boolean z);

    public static final native void PortraitRequest_enable_peony_ccm_set(long j, PortraitRequest portraitRequest, boolean z);

    public static final native void PortraitRequest_enable_peperomia_set(long j, PortraitRequest portraitRequest, boolean z);

    public static final native void PortraitRequest_enable_portrait_brightening_set(long j, PortraitRequest portraitRequest, boolean z);

    public static final native void PortraitRequest_enable_rgbpd_v2_set(long j, PortraitRequest portraitRequest, boolean z);

    public static final native void PortraitRequest_execute_finish_on_set(long j, PortraitRequest portraitRequest, int i);

    public static final native void PortraitRequest_face_detection_method_set(long j, PortraitRequest portraitRequest, int i);

    public static final native void PortraitRequest_face_infos_set(long j, PortraitRequest portraitRequest, long j2, FaceInfoVector faceInfoVector);

    public static final native long PortraitRequest_faces_get(long j, PortraitRequest portraitRequest);

    public static final native void PortraitRequest_faces_set(long j, PortraitRequest portraitRequest, long j2, PixelRectVector pixelRectVector);

    public static final native void PortraitRequest_force_run_stereo_depth_set(long j, PortraitRequest portraitRequest, boolean z);

    public static final native long PortraitRequest_frame_metadata_get(long j, PortraitRequest portraitRequest);

    public static final native void PortraitRequest_frame_metadata_set(long j, PortraitRequest portraitRequest, long j2, StringFrameMetadataMap stringFrameMetadataMap);

    public static final native long PortraitRequest_gain_map_get(long j, PortraitRequest portraitRequest);

    public static final native void PortraitRequest_hair_matting_model_set(long j, PortraitRequest portraitRequest, long j2, AssetData assetData);

    public static final native void PortraitRequest_hdr_gain_map_original_set(long j, PortraitRequest portraitRequest, long j2, HdrGainMapInfo hdrGainMapInfo);

    public static final native void PortraitRequest_horizontal_flip_set(long j, PortraitRequest portraitRequest, boolean z);

    public static final native void PortraitRequest_image_rotation_set(long j, PortraitRequest portraitRequest, int i);

    public static final native boolean PortraitRequest_manually_rotate_xmp_jpg_get(long j, PortraitRequest portraitRequest);

    public static final native void PortraitRequest_manually_rotate_xmp_jpg_set(long j, PortraitRequest portraitRequest, boolean z);

    public static final native void PortraitRequest_merged_crop_set(long j, PortraitRequest portraitRequest, long j2, NormalizedRect normalizedRect);

    public static final native void PortraitRequest_monocular_depth_model_set(long j, PortraitRequest portraitRequest, long j2, AssetData assetData);

    public static final native void PortraitRequest_output_color_space_set(long j, PortraitRequest portraitRequest, int i);

    public static final native void PortraitRequest_output_format_primary_set(long j, PortraitRequest portraitRequest, int i);

    public static final native void PortraitRequest_output_height_set(long j, PortraitRequest portraitRequest, int i);

    public static final native void PortraitRequest_output_width_set(long j, PortraitRequest portraitRequest, int i);

    public static final native void PortraitRequest_pd_disparity_model_set(long j, PortraitRequest portraitRequest, long j2, AssetData assetData);

    public static final native void PortraitRequest_pdlearned_depth_model_set(long j, PortraitRequest portraitRequest, long j2, AssetData assetData);

    public static final native void PortraitRequest_pdstereo_depth_model_set(long j, PortraitRequest portraitRequest, long j2, AssetData assetData);

    public static final native void PortraitRequest_portrait_matting_model_set(long j, PortraitRequest portraitRequest, long j2, AssetData assetData);

    public static final native void PortraitRequest_portrait_multiclass_segmenter_set(long j, PortraitRequest portraitRequest, long j2, AssetData assetData);

    public static final native void PortraitRequest_portrait_raw_path_set(long j, PortraitRequest portraitRequest, String str);

    public static final native void PortraitRequest_post_resample_sharpening_set(long j, PortraitRequest portraitRequest, float f);

    public static final native void PortraitRequest_relighting_option_set(long j, PortraitRequest portraitRequest, int i);

    public static final native void PortraitRequest_shot_prefix_set(long j, PortraitRequest portraitRequest, String str);

    public static final native long PortraitRequest_static_metadata_get(long j, PortraitRequest portraitRequest);

    public static final native void PortraitRequest_static_metadata_set(long j, PortraitRequest portraitRequest, long j2, StringStaticMetadataMap stringStaticMetadataMap);

    public static final native void PortraitRequest_stereo_rgb_depth_model_set(long j, PortraitRequest portraitRequest, long j2, AssetData assetData);

    public static final native void PortraitRequest_use_internal_rectiface_set(long j, PortraitRequest portraitRequest, boolean z);

    public static final native void PortraitRequest_use_opencl_depth_set(long j, PortraitRequest portraitRequest, boolean z);

    public static final native void PortraitRequest_use_spotlight_enhance_set(long j, PortraitRequest portraitRequest, boolean z);

    public static final native void PortraitRequest_use_spotlight_enhance_v2_set(long j, PortraitRequest portraitRequest, boolean z);

    public static final native float PostShutterAfParams_max_handheld_exposure_time_ms_get(long j, PostShutterAfParams postShutterAfParams);

    public static final native void PostviewParams_pixel_format_set(long j, PostviewParams postviewParams, int i);

    public static final native void PostviewParams_target_height_set(long j, PostviewParams postviewParams, int i);

    public static final native void PostviewParams_target_width_set(long j, PostviewParams postviewParams, int i);

    public static final native void QcColorCalibration_IlluminantData_bg_ratio_set(long j, QcColorCalibration.IlluminantData illuminantData, float f);

    public static final native void QcColorCalibration_IlluminantData_rg_ratio_set(long j, QcColorCalibration.IlluminantData illuminantData, float f);

    public static final native void QcColorCalibration_grgb_ratio_set(long j, QcColorCalibration qcColorCalibration, float f);

    public static final native void QcColorCalibration_illuminant_data_set(long j, QcColorCalibration qcColorCalibration, long j2, QcIlluminantVector qcIlluminantVector);

    public static final native void QcIlluminantVector_add(long j, QcIlluminantVector qcIlluminantVector, long j2, QcColorCalibration.IlluminantData illuminantData);

    public static final native long RawImage_SWIGUpcast(long j);

    public static final native boolean RawReadView_empty(long j, RawReadView rawReadView);

    public static final native int RawReadView_size_in_bytes(long j, RawReadView rawReadView);

    public static final native long RawWriteView_SWIGUpcast(long j);

    public static final native int ReverseRotation(int i);

    public static final native boolean RotateShotMetadata__SWIG_1(long j, ShotMetadata shotMetadata, int i);

    public static final native boolean SaliencyMapFromVendorTagBytes(long j, long j2, long j3, CroppedGrayMap croppedGrayMap);

    public static final native void SceneFlicker_confidence_set(long j, SceneFlicker sceneFlicker, float f);

    public static final native void SceneFlicker_frequency_set(long j, SceneFlicker sceneFlicker, float f);

    public static final native void SetGcaDebugMetadata(byte[] bArr, long j, ShotMetadata shotMetadata);

    public static final native void SetKolaEnabled(long j, ShotParams shotParams, boolean z);

    public static final native void SetThermalState(long j, ShotMetadata shotMetadata, int i);

    public static final native void ShotCallbacks_final_image_pixel_format_set(long j, ShotCallbacks shotCallbacks, int i);

    public static final native void ShotCallbacks_postview_params_set(long j, ShotCallbacks shotCallbacks, long j2, PostviewParams postviewParams);

    public static final native long ShotMetadata_ae_results_get(long j, ShotMetadata shotMetadata);

    public static final native void ShotMetadata_client_shot_metadata_set(long j, ShotMetadata shotMetadata, long j2, ClientShotMetadata clientShotMetadata);

    public static final native void ShotMetadata_exposure_compensation_set(long j, ShotMetadata shotMetadata, float f);

    public static final native long ShotMetadata_final_crop_get(long j, ShotMetadata shotMetadata);

    public static final native void ShotMetadata_flash_mode_set(long j, ShotMetadata shotMetadata, int i);

    public static final native long ShotMetadata_frame_metadata_get(long j, ShotMetadata shotMetadata);

    public static final native void ShotMetadata_frame_metadata_set(long j, ShotMetadata shotMetadata, long j2, FrameMetadata frameMetadata);

    public static final native boolean ShotMetadata_freesia_enabled_get(long j, ShotMetadata shotMetadata);

    public static final native long ShotMetadata_gain_map_rggb_get(long j, ShotMetadata shotMetadata);

    public static final native void ShotMetadata_gain_map_rggb_set(long j, ShotMetadata shotMetadata, long j2, InterleavedImageF interleavedImageF);

    public static final native long ShotMetadata_hdr_gain_map_get(long j, ShotMetadata shotMetadata);

    public static final native void ShotMetadata_hdr_gain_map_set(long j, ShotMetadata shotMetadata, long j2, HdrGainMapInfo hdrGainMapInfo);

    public static final native int ShotMetadata_image_rotation_get(long j, ShotMetadata shotMetadata);

    public static final native void ShotMetadata_image_rotation_set(long j, ShotMetadata shotMetadata, int i);

    public static final native boolean ShotMetadata_mst_based_contrast_enhancement_applied_get(long j, ShotMetadata shotMetadata);

    public static final native boolean ShotMetadata_peony_awb_enabled_get(long j, ShotMetadata shotMetadata);

    public static final native boolean ShotMetadata_peony_ccm_enabled_get(long j, ShotMetadata shotMetadata);

    public static final native boolean ShotMetadata_peperomia_applied_get(long j, ShotMetadata shotMetadata);

    public static final native boolean ShotMetadata_portrait_brightening_applied_get(long j, ShotMetadata shotMetadata);

    public static final native boolean ShotMetadata_should_apply_deblur_badge_get(long j, ShotMetadata shotMetadata);

    public static final native void ShotMetadata_should_apply_deblur_badge_set(long j, ShotMetadata shotMetadata, boolean z);

    public static final native void ShotMetadata_slowraw_path_set(long j, ShotMetadata shotMetadata, String str);

    public static final native String ShotMetadata_software_suffix_get(long j, ShotMetadata shotMetadata);

    public static final native void ShotMetadata_software_suffix_set(long j, ShotMetadata shotMetadata, String str);

    public static final native long ShotMetadata_static_metadata_get(long j, ShotMetadata shotMetadata);

    public static final native void ShotMetadata_static_metadata_set(long j, ShotMetadata shotMetadata, long j2, StaticMetadata staticMetadata);

    public static final native long ShotMetadata_timestamp_unix_us_get(long j, ShotMetadata shotMetadata);

    public static final native void ShotMetadata_wb_mode_set(long j, ShotMetadata shotMetadata, int i);

    public static final native String ShotMetadata_xmp_metadata_extended_get(long j, ShotMetadata shotMetadata);

    public static final native String ShotMetadata_xmp_metadata_main_get(long j, ShotMetadata shotMetadata);

    public static final native boolean ShotParams_GcamAwbDesired(long j, ShotParams shotParams);

    public static final native long ShotParams_ae_get(long j, ShotParams shotParams);

    public static final native void ShotParams_ae_set(long j, ShotParams shotParams, long j2, AeShotParams aeShotParams);

    public static final native void ShotParams_af_roi_sharpness_enabled_set(long j, ShotParams shotParams, boolean z);

    public static final native void ShotParams_allow_base_frame_reuse_set(long j, ShotParams shotParams, boolean z);

    public static final native boolean ShotParams_allow_spatial_rgb_get(long j, ShotParams shotParams);

    public static final native void ShotParams_allow_spatial_rgb_set(long j, ShotParams shotParams, boolean z);

    public static final native void ShotParams_almond_enabled_set(long j, ShotParams shotParams, boolean z);

    public static final native void ShotParams_almond_force_apply_limited_by_times_set(long j, ShotParams shotParams, boolean z);

    public static final native void ShotParams_apply_sgm_in_raw_to_yuv_set(long j, ShotParams shotParams, boolean z);

    public static final native void ShotParams_apply_sgm_spatially_varying_set(long j, ShotParams shotParams, boolean z);

    public static final native long ShotParams_ark_info_get(long j, ShotParams shotParams);

    public static final native void ShotParams_ark_info_set(long j, ShotParams shotParams, long j2, ArkInfo arkInfo);

    public static final native void ShotParams_base_frame_override_index_set(long j, ShotParams shotParams, int i);

    public static final native void ShotParams_bento_annotate_final_image_set(long j, ShotParams shotParams, boolean z);

    public static final native void ShotParams_bento_enabled_set(long j, ShotParams shotParams, boolean z);

    public static final native void ShotParams_bento_force_apply_set(long j, ShotParams shotParams, boolean z);

    public static final native void ShotParams_bento_use_separable_merge_set(long j, ShotParams shotParams, boolean z);

    public static final native void ShotParams_big_cpu_freq_option_set(long j, ShotParams shotParams, float f);

    public static final native void ShotParams_compress_merged_dng_set(long j, ShotParams shotParams, boolean z);

    public static final native void ShotParams_crop_merged_output_set(long j, ShotParams shotParams, boolean z);

    public static final native boolean ShotParams_cyclops_enabled_get(long j, ShotParams shotParams);

    public static final native void ShotParams_cyclops_enabled_set(long j, ShotParams shotParams, boolean z);

    public static final native boolean ShotParams_cyclops_use_most_recent_frame_for_base_frame_get(long j, ShotParams shotParams);

    public static final native void ShotParams_cyclops_use_most_recent_frame_for_base_frame_set(long j, ShotParams shotParams, boolean z);

    public static final native void ShotParams_delay_merge_when_finishing_set(long j, ShotParams shotParams, boolean z);

    public static final native boolean ShotParams_device_is_on_tripod_get(long j, ShotParams shotParams);

    public static final native void ShotParams_device_is_on_tripod_set(long j, ShotParams shotParams, boolean z);

    public static final native void ShotParams_downsample1to2x_set(long j, ShotParams shotParams, boolean z);

    public static final native void ShotParams_downsample_by_2_before_merge_set(long j, ShotParams shotParams, boolean z);

    public static final native void ShotParams_dual_stage_merge_enabled_set(long j, ShotParams shotParams, boolean z);

    public static final native void ShotParams_eevee_enabled_set(long j, ShotParams shotParams, boolean z);

    public static final native void ShotParams_extra_finish_vignetting_enabled_set(long j, ShotParams shotParams, boolean z);

    public static final native void ShotParams_flash_mode_set(long j, ShotParams shotParams, int i);

    public static final native void ShotParams_force_pecan_set(long j, ShotParams shotParams, boolean z);

    public static final native void ShotParams_force_wb_set(long j, ShotParams shotParams, long j2, AwbInfo awbInfo);

    public static final native void ShotParams_freesia_ccm_enabled_set(long j, ShotParams shotParams, boolean z);

    public static final native void ShotParams_gpu_power_boost_set(long j, ShotParams shotParams, boolean z);

    public static final native void ShotParams_hazelnut_enabled_set(long j, ShotParams shotParams, boolean z);

    public static final native void ShotParams_image_rotation_set(long j, ShotParams shotParams, int i);

    public static final native void ShotParams_layla_active_set(long j, ShotParams shotParams, boolean z);

    public static final native void ShotParams_little_cpu_freq_option_set(long j, ShotParams shotParams, float f);

    public static final native void ShotParams_merge_method_override_set(long j, ShotParams shotParams, int i);

    public static final native void ShotParams_metering_frame_night_factor_set(long j, ShotParams shotParams, float f);

    public static final native void ShotParams_metering_frame_timestamp_ns_set(long j, ShotParams shotParams, long j2);

    public static final native void ShotParams_mid_cpu_freq_option_set(long j, ShotParams shotParams, float f);

    public static final native void ShotParams_mochi_enabled_set(long j, ShotParams shotParams, boolean z);

    public static final native void ShotParams_mochi_force_apply_set(long j, ShotParams shotParams, boolean z);

    public static final native void ShotParams_motion_ef_enabled_set(long j, ShotParams shotParams, boolean z);

    public static final native void ShotParams_nonzsl_extended_base_frame_selection_set(long j, ShotParams shotParams, boolean z);

    public static final native void ShotParams_optimize_sky_set(long j, ShotParams shotParams, boolean z);

    public static final native int ShotParams_output_color_space_override_get(long j, ShotParams shotParams);

    public static final native void ShotParams_output_color_space_override_set(long j, ShotParams shotParams, int i);

    public static final native void ShotParams_pecan_model_type_set(long j, ShotParams shotParams, int i);

    public static final native void ShotParams_peony_awb_enabled_set(long j, ShotParams shotParams, boolean z);

    public static final native void ShotParams_peony_ccm_enabled_set(long j, ShotParams shotParams, boolean z);

    public static final native void ShotParams_psaf_frame_count_set(long j, ShotParams shotParams, int i);

    public static final native void ShotParams_psaf_log_scene_brightness_threshold_override_set(long j, ShotParams shotParams, float f);

    public static final native void ShotParams_psaf_max_exposure_time_ms_set(long j, ShotParams shotParams, float f);

    public static final native void ShotParams_recompute_wb_on_base_frame_set(long j, ShotParams shotParams, boolean z);

    public static final native void ShotParams_remosaic_merged_output_set(long j, ShotParams shotParams, boolean z);

    public static final native void ShotParams_rerun_face_detection_set(long j, ShotParams shotParams, boolean z);

    public static final native void ShotParams_resampling_method_override_set(long j, ShotParams shotParams, int i);

    public static final native void ShotParams_save_merged_dng_set(long j, ShotParams shotParams, boolean z);

    public static final native void ShotParams_shasta_enabled_set(long j, ShotParams shotParams, boolean z);

    public static final native void ShotParams_shasta_factor_set(long j, ShotParams shotParams, float f);

    public static final native void ShotParams_shasta_force_set(long j, ShotParams shotParams, boolean z);

    public static final native void ShotParams_shutter_press_down_timestamp_ns_set(long j, ShotParams shotParams, long j2);

    public static final native void ShotParams_shutter_press_up_timestamp_ns_set(long j, ShotParams shotParams, long j2);

    public static final native void ShotParams_software_suffix_set(long j, ShotParams shotParams, String str);

    public static final native boolean ShotParams_use_binned_metering_frame_get(long j, ShotParams shotParams);

    public static final native void ShotParams_use_binned_metering_frame_set(long j, ShotParams shotParams, boolean z);

    public static final native void ShotParams_walnut_enabled_set(long j, ShotParams shotParams, boolean z);

    public static final native void ShotParams_walnut_option_set(long j, ShotParams shotParams, int i);

    public static final native void ShotParams_wb_mode_set(long j, ShotParams shotParams, int i);

    public static final native void ShotParams_zsl_base_frame_index_hint_set(long j, ShotParams shotParams, int i);

    public static final native void ShotParams_zsl_set(long j, ShotParams shotParams, boolean z);

    public static final native void Size_height_set(long j, Size size, int i);

    public static final native void Size_width_set(long j, Size size, int i);

    public static final native void SpatialAwb_background_awb_set(long j, SpatialAwb spatialAwb, long j2, AwbInfo awbInfo);

    public static final native void SpatialAwb_subject_awb_set(long j, SpatialAwb spatialAwb, long j2, AwbInfo awbInfo);

    public static final native void SpatialGainMap_WriteRggb(long j, SpatialGainMap spatialGainMap, int i, int i2, int i3, float f);

    public static final native long SpatialGainMap_gain_map(long j, SpatialGainMap spatialGainMap);

    public static final native int StandardToQuadBayerPattern(int i);

    public static final native void StaticMetadataVector_add(long j, StaticMetadataVector staticMetadataVector, long j2, StaticMetadata staticMetadata);

    public static final native long StaticMetadataVector_get(long j, StaticMetadataVector staticMetadataVector, int i);

    public static final native long StaticMetadataVector_size(long j, StaticMetadataVector staticMetadataVector);

    public static final native float StaticMetadata_FocalLength35mm(long j, StaticMetadata staticMetadata);

    public static final native long StaticMetadata_active_area_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_active_area_set(long j, StaticMetadata staticMetadata, long j2, PixelRect pixelRect);

    public static final native void StaticMetadata_available_f_numbers_set(long j, StaticMetadata staticMetadata, long j2, FloatVector floatVector);

    public static final native void StaticMetadata_available_focal_lengths_mm_set(long j, StaticMetadata staticMetadata, long j2, FloatVector floatVector);

    public static final native int StaticMetadata_bayer_pattern_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_bayer_pattern_set(long j, StaticMetadata staticMetadata, int i);

    public static final native long StaticMetadata_dark_shading_data_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_device_os_unix_ms_set(long j, StaticMetadata staticMetadata, long j2);

    public static final native void StaticMetadata_device_os_version_set(long j, StaticMetadata staticMetadata, String str);

    public static final native void StaticMetadata_device_set(long j, StaticMetadata staticMetadata, String str);

    public static final native void StaticMetadata_dng_color_calibration_set(long j, StaticMetadata staticMetadata, long j2, DngColorCalibrationVector dngColorCalibrationVector);

    public static final native void StaticMetadata_exposure_time_range_ms_set(long j, StaticMetadata staticMetadata, float[] fArr);

    public static final native int StaticMetadata_frame_raw_max_height_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_frame_raw_max_height_set(long j, StaticMetadata staticMetadata, int i);

    public static final native int StaticMetadata_frame_raw_max_width_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_frame_raw_max_width_set(long j, StaticMetadata staticMetadata, int i);

    public static final native void StaticMetadata_frame_readout_time_ms_set(long j, StaticMetadata staticMetadata, float f);

    public static final native void StaticMetadata_ghawb_clut_control_enabled_set(long j, StaticMetadata staticMetadata, boolean z);

    public static final native void StaticMetadata_hardware_revision_set(long j, StaticMetadata staticMetadata, String str);

    public static final native void StaticMetadata_has_flash_set(long j, StaticMetadata staticMetadata, boolean z);

    public static final native void StaticMetadata_has_ois_set(long j, StaticMetadata staticMetadata, boolean z);

    public static final native void StaticMetadata_iso_range_set(long j, StaticMetadata staticMetadata, long j2, FloatArray2 floatArray2);

    public static final native int StaticMetadata_lens_facing_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_lens_facing_set(long j, StaticMetadata staticMetadata, int i);

    public static final native void StaticMetadata_make_set(long j, StaticMetadata staticMetadata, String str);

    public static final native void StaticMetadata_max_analog_iso_set(long j, StaticMetadata staticMetadata, float f);

    public static final native void StaticMetadata_model_set(long j, StaticMetadata staticMetadata, String str);

    public static final native void StaticMetadata_optically_black_regions_set(long j, StaticMetadata staticMetadata, long j2, PixelRectVector pixelRectVector);

    public static final native void StaticMetadata_package_name_set(long j, StaticMetadata staticMetadata, String str);

    public static final native void StaticMetadata_package_version_set(long j, StaticMetadata staticMetadata, String str);

    public static final native int StaticMetadata_pixel_array_height_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_pixel_array_height_set(long j, StaticMetadata staticMetadata, int i);

    public static final native int StaticMetadata_pixel_array_width_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_pixel_array_width_set(long j, StaticMetadata staticMetadata, int i);

    public static final native void StaticMetadata_qc_color_calibration_set(long j, StaticMetadata staticMetadata, long j2, QcColorCalibration qcColorCalibration);

    public static final native int StaticMetadata_sensor_id_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_sensor_id_set(long j, StaticMetadata staticMetadata, int i);

    public static final native float StaticMetadata_sensor_physical_height_mm_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_sensor_physical_height_mm_set(long j, StaticMetadata staticMetadata, float f);

    public static final native float StaticMetadata_sensor_physical_width_mm_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_sensor_physical_width_mm_set(long j, StaticMetadata staticMetadata, float f);

    public static final native void StaticMetadata_software_set(long j, StaticMetadata staticMetadata, String str);

    public static final native void StaticMetadata_white_level_set(long j, StaticMetadata staticMetadata, int i);

    public static final native void StringAeResultsMap_set(long j, StringAeResultsMap stringAeResultsMap, String str, long j2, AeResults aeResults);

    public static final native void StringFrameMetadataMap_set(long j, StringFrameMetadataMap stringFrameMetadataMap, String str, long j2, FrameMetadata frameMetadata);

    public static final native void StringRawReadViewMap_set(long j, StringRawReadViewMap stringRawReadViewMap, String str, long j2, RawReadView rawReadView);

    public static final native void StringSpatialGainMap_set(long j, StringSpatialGainMap stringSpatialGainMap, String str, long j2, SpatialGainMap spatialGainMap);

    public static final native long StringStaticMetadataMap_get(long j, StringStaticMetadataMap stringStaticMetadataMap, String str);

    public static final native void StringStaticMetadataMap_set(long j, StringStaticMetadataMap stringStaticMetadataMap, String str, long j2, StaticMetadata staticMetadata);

    public static final native int TfliteFileData_fd_get(long j, TfliteFileData tfliteFileData);

    public static final native long Tuning_physical_stability_params_get(long j, Tuning tuning);

    public static final native long Tuning_post_shutter_af_params_get(long j, Tuning tuning);

    public static final native float Tuning_sensitivity_get(long j, Tuning tuning);

    public static final native void ViewfinderProcessingOptions_burst_spec_options_set(long j, ViewfinderProcessingOptions viewfinderProcessingOptions, long j2, BuildPayloadBurstSpecOptions buildPayloadBurstSpecOptions);

    public static final native void ViewfinderProcessingOptions_compute_payload_capture_time_set(long j, ViewfinderProcessingOptions viewfinderProcessingOptions, boolean z);

    public static final native void ViewfinderProcessingOptions_compute_psaf_capture_time_set(long j, ViewfinderProcessingOptions viewfinderProcessingOptions, boolean z);

    public static final native void ViewfinderProcessingOptions_motion_processing_method_set(long j, ViewfinderProcessingOptions viewfinderProcessingOptions, int i);

    public static final native void ViewfinderProcessingOptions_process_gyro_set(long j, ViewfinderProcessingOptions viewfinderProcessingOptions, boolean z);

    public static final native void ViewfinderProcessingOptions_save_motion_trace_set(long j, ViewfinderProcessingOptions viewfinderProcessingOptions, boolean z);

    public static final native void ViewfinderProcessingOptions_verbose_set(long j, ViewfinderProcessingOptions viewfinderProcessingOptions, boolean z);

    public static final native void ViewfinderProcessingOptions_will_capture_max_res_set(long j, ViewfinderProcessingOptions viewfinderProcessingOptions, boolean z);

    public static final native float ViewfinderResults_gyro_speed_rad_per_sec_get(long j, ViewfinderResults viewfinderResults);

    public static final native float ViewfinderResults_payload_capture_time_ms_get(long j, ViewfinderResults viewfinderResults);

    public static final native float ViewfinderResults_psaf_capture_time_ms_get(long j, ViewfinderResults viewfinderResults);

    public static final native void WeightedNormalizedRectVector_add(long j, WeightedNormalizedRectVector weightedNormalizedRectVector, long j2, WeightedNormalizedRect weightedNormalizedRect);

    public static final native long WeightedNormalizedRectVector_size(long j, WeightedNormalizedRectVector weightedNormalizedRectVector);

    public static final native long WeightedNormalizedRect_rect_get(long j, WeightedNormalizedRect weightedNormalizedRect);

    public static final native void WeightedNormalizedRect_rect_set(long j, WeightedNormalizedRect weightedNormalizedRect, long j2, NormalizedRect normalizedRect);

    public static final native void WeightedNormalizedRect_weight_set(long j, WeightedNormalizedRect weightedNormalizedRect, float f);

    public static final native void WeightedPixelRectVector_add(long j, WeightedPixelRectVector weightedPixelRectVector, long j2, WeightedPixelRect weightedPixelRect);

    public static final native long WeightedPixelRect_rect_get(long j, WeightedPixelRect weightedPixelRect);

    public static final native void WeightedPixelRect_weight_set(long j, WeightedPixelRect weightedPixelRect, float f);

    public static final native long YuvImage_cref(long j, YuvImage yuvImage);

    public static final native int YuvImage_height(long j, YuvImage yuvImage);

    public static final native long YuvImage_ref(long j, YuvImage yuvImage);

    public static final native int YuvImage_size_in_bytes(long j, YuvImage yuvImage);

    public static final native int YuvImage_width(long j, YuvImage yuvImage);

    public static final native int YuvImage_yuv_format(long j, YuvImage yuvImage);

    public static final native long YuvReadView_chroma(long j, YuvReadView yuvReadView);

    public static final native int YuvReadView_height(long j, YuvReadView yuvReadView);

    public static final native long YuvReadView_luma(long j, YuvReadView yuvReadView);

    public static final native int YuvReadView_width(long j, YuvReadView yuvReadView);

    public static final native int YuvReadView_yuv_format(long j, YuvReadView yuvReadView);

    public static final native void YuvWriteView_FastCrop(long j, YuvWriteView yuvWriteView, int i, int i2, int i3, int i4);

    public static final native long YuvWriteView_cref(long j, YuvWriteView yuvWriteView);

    public static final native int YuvWriteView_height(long j, YuvWriteView yuvWriteView);

    public static final native int YuvWriteView_width(long j, YuvWriteView yuvWriteView);

    public static final native int YuvWriteView_yuv_format(long j, YuvWriteView yuvWriteView);

    public static final native void delete_AccelSample(long j);

    public static final native void delete_AccelSampleVector(long j);

    public static final native void delete_ActuatorSample(long j);

    public static final native void delete_ActuatorSampleVector(long j);

    public static final native void delete_AeMetadata(long j);

    public static final native void delete_AeModeResult(long j);

    public static final native void delete_AeResults(long j);

    public static final native void delete_AeShotParams(long j);

    public static final native void delete_AfMetadata(long j);

    public static final native void delete_ArkInfo(long j);

    public static final native void delete_AssetData(long j);

    public static final native void delete_AwbInfo(long j);

    public static final native void delete_AwbInfoTable(long j);

    public static final native void delete_AwbInfoTableMap(long j);

    public static final native void delete_AwbMetadata(long j);

    public static final native void delete_BuildPayloadBurstSpecOptions(long j);

    public static final native void delete_BurstSpec(long j);

    public static final native void delete_ClientShotMetadata(long j);

    public static final native void delete_ClutWeightVector(long j);

    public static final native void delete_ClutWeights(long j);

    public static final native void delete_CroppedGrayMap(long j);

    public static final native void delete_CyclopsParameters(long j);

    public static final native void delete_DarkShadingData(long j);

    public static final native void delete_DebugParams(long j);

    public static final native void delete_DirtyLensHistory(long j);

    public static final native void delete_DngColorCalibration(long j);

    public static final native void delete_DngColorCalibrationVector(long j);

    public static final native void delete_FaceInfo(long j);

    public static final native void delete_FaceInfoVector(long j);

    public static final native void delete_FaceInfo_Landmark(long j);

    public static final native void delete_FloatArray2(long j);

    public static final native void delete_FloatArray4(long j);

    public static final native void delete_FloatArray9(long j);

    public static final native void delete_FloatDeque(long j);

    public static final native void delete_FloatVector(long j);

    public static final native void delete_FrameMetadata(long j);

    public static final native void delete_FrameMetadataKey(long j);

    public static final native void delete_FrameRequest(long j);

    public static final native void delete_FrameRequestVector(long j);

    public static final native void delete_Gcam(long j);

    public static final native void delete_GenerateRgbImageOptions(long j);

    public static final native void delete_GeometricCalibration(long j);

    public static final native void delete_GeometricCalibrationVector(long j);

    public static final native void delete_GrayImageS16(long j);

    public static final native void delete_GrayReadViewS16(long j);

    public static final native void delete_GrayReadViewU8(long j);

    public static final native void delete_GrayWriteViewS16(long j);

    public static final native void delete_GrayWriteViewU16(long j);

    public static final native void delete_GyroSampleVector(long j);

    public static final native void delete_HalAfMetadata(long j);

    public static final native void delete_HdrGainMapInfo(long j);

    public static final native void delete_HotPixelMetadata(long j);

    public static final native void delete_HotPixelMetadataVector(long j);

    public static final native void delete_ImageSaverParams(long j);

    public static final native void delete_InitParams(long j);

    public static final native void delete_Int16ToFloatMap(long j);

    public static final native void delete_Int16ToInt16Map(long j);

    public static final native void delete_IntVector(long j);

    public static final native void delete_InterleavedImageF(long j);

    public static final native void delete_InterleavedImageS16(long j);

    public static final native void delete_InterleavedImageU16(long j);

    public static final native void delete_InterleavedImageU8(long j);

    public static final native void delete_InterleavedReadViewS16(long j);

    public static final native void delete_InterleavedReadViewU16(long j);

    public static final native void delete_InterleavedReadViewU8(long j);

    public static final native void delete_InterleavedWriteViewS16(long j);

    public static final native void delete_InterleavedWriteViewU16(long j);

    public static final native void delete_InterleavedWriteViewU8(long j);

    public static final native void delete_JpgEncodeOptions(long j);

    public static final native void delete_JpgEncoderMetadata(long j);

    public static final native void delete_LandmarkMap(long j);

    public static final native void delete_LiveHdrMetadata(long j);

    public static final native void delete_LocationData(long j);

    public static final native void delete_MeshTranslation(long j);

    public static final native void delete_MeshWarp(long j);

    public static final native void delete_NoiseModel(long j);

    public static final native void delete_NormalizedRect(long j);

    public static final native void delete_OisMetadata(long j);

    public static final native void delete_OisPositionRawVector(long j);

    public static final native void delete_OisPositionVector(long j);

    public static final native void delete_PhysicalStabilityParams(long j);

    public static final native void delete_PhysicalStabilityThresholds(long j);

    public static final native void delete_PixelRect(long j);

    public static final native void delete_PixelRectVector(long j);

    public static final native void delete_PortraitBrighteningProcessor(long j);

    public static final native void delete_PortraitDepthArguments(long j);

    public static final native void delete_PortraitOutputs(long j);

    public static final native void delete_PortraitRequest(long j);

    public static final native void delete_PostShutterAfParams(long j);

    public static final native void delete_PostviewParams(long j);

    public static final native void delete_QcColorCalibration(long j);

    public static final native void delete_QcColorCalibration_IlluminantData(long j);

    public static final native void delete_QcIlluminantVector(long j);

    public static final native void delete_RawImage(long j);

    public static final native void delete_RawReadView(long j);

    public static final native void delete_RawWriteView(long j);

    public static final native void delete_SceneFlicker(long j);

    public static final native void delete_ShotCallbacks(long j);

    public static final native void delete_ShotMetadata(long j);

    public static final native void delete_ShotParams(long j);

    public static final native void delete_Size(long j);

    public static final native void delete_SpatialAwb(long j);

    public static final native void delete_SpatialGainMap(long j);

    public static final native void delete_StaticMetadata(long j);

    public static final native void delete_StaticMetadataVector(long j);

    public static final native void delete_StringAeResultsMap(long j);

    public static final native void delete_StringFrameMetadataMap(long j);

    public static final native void delete_StringRawReadViewMap(long j);

    public static final native void delete_StringSpatialGainMap(long j);

    public static final native void delete_StringStaticMetadataMap(long j);

    public static final native void delete_TfliteFileData(long j);

    public static final native void delete_ViewfinderProcessingOptions(long j);

    public static final native void delete_ViewfinderResults(long j);

    public static final native void delete_WeightedNormalizedRect(long j);

    public static final native void delete_WeightedNormalizedRectVector(long j);

    public static final native void delete_WeightedPixelRect(long j);

    public static final native void delete_WeightedPixelRectVector(long j);

    public static final native void delete_YuvImage(long j);

    public static final native void delete_YuvReadView(long j);

    public static final native void delete_YuvWriteView(long j);

    public static final native long kInvalidAllocationId_get();

    public static final native int kInvalidShotId_get();

    public static final native String kRequestCameraPrimary_get();

    public static final native String kRequestCameraSecondaryTele_get();

    public static final native String kRequestCameraSecondaryWide_get();

    public static final native long new_AccelSample();

    public static final native long new_AccelSampleVector__SWIG_0();

    public static final native long new_ActuatorSample();

    public static final native long new_ActuatorSampleVector__SWIG_0();

    public static final native long new_AeMetadata();

    public static final native long new_AeModeResult();

    public static final native long new_AeResults();

    public static final native long new_AeShotParams__SWIG_0();

    public static final native long new_AeShotParams__SWIG_1(long j, AeShotParams aeShotParams);

    public static final native long new_AfMetadata();

    public static final native long new_ArkInfo__SWIG_0();

    public static final native long new_AssetData();

    public static final native long new_AwbInfoTableMap__SWIG_0();

    public static final native long new_AwbInfoTable__SWIG_0();

    public static final native long new_AwbInfo__SWIG_0();

    public static final native long new_AwbInfo__SWIG_1(long j, AwbInfo awbInfo);

    public static final native long new_AwbMetadata();

    public static final native long new_BuildPayloadBurstSpecOptions__SWIG_0();

    public static final native long new_BurstSpec();

    public static final native long new_ClientShotMetadata();

    public static final native long new_ClutWeightVector__SWIG_0();

    public static final native long new_ClutWeights();

    public static final native long new_CroppedGrayMap();

    public static final native long new_CyclopsParameters__SWIG_0();

    public static final native long new_CyclopsParameters__SWIG_1(long j, CyclopsParameters cyclopsParameters);

    public static final native long new_DarkShadingData();

    public static final native long new_DebugParams();

    public static final native long new_DirtyLensHistory();

    public static final native long new_DngColorCalibration();

    public static final native long new_DngColorCalibrationVector__SWIG_0();

    public static final native long new_FaceInfoVector__SWIG_0();

    public static final native long new_FaceInfo_Landmark();

    public static final native long new_FaceInfo__SWIG_0();

    public static final native long new_FaceInfo__SWIG_1(long j, FaceInfo faceInfo);

    public static final native long new_FloatArray2__SWIG_0();

    public static final native long new_FloatArray4__SWIG_0();

    public static final native long new_FloatArray9__SWIG_0();

    public static final native long new_FloatDeque__SWIG_0();

    public static final native long new_FloatVector__SWIG_0();

    public static final native long new_FrameMetadata();

    public static final native long new_FrameMetadataKey(long j, int i);

    public static final native long new_FrameRequestVector__SWIG_0();

    public static final native long new_FrameRequest__SWIG_0();

    public static final native long new_FrameRequest__SWIG_1(long j, FrameRequest frameRequest);

    public static final native long new_GenerateRgbImageOptions();

    public static final native long new_GeometricCalibration();

    public static final native long new_GeometricCalibrationVector__SWIG_0();

    public static final native long new_GrayImageS16__SWIG_0();

    public static final native long new_GrayImageS16__SWIG_1(int i, int i2, int i3);

    public static final native long new_GrayReadViewS16__SWIG_0();

    public static final native long new_GrayReadViewU8__SWIG_0();

    public static final native long new_GrayWriteViewS16__SWIG_0();

    public static final native long new_GrayWriteViewU16__SWIG_0();

    public static final native long new_GrayWriteViewU16__SWIG_1(int i, int i2, int i3, long j, int i4);

    public static final native long new_GyroSampleVector__SWIG_0();

    public static final native long new_HalAfMetadata();

    public static final native long new_HdrGainMapInfo();

    public static final native long new_HotPixelMetadata();

    public static final native long new_HotPixelMetadataVector__SWIG_0();

    public static final native long new_ImageSaverParams();

    public static final native long new_InitParams();

    public static final native long new_Int16ToFloatMap__SWIG_0();

    public static final native long new_Int16ToInt16Map__SWIG_0();

    public static final native long new_IntVector__SWIG_0();

    public static final native long new_InterleavedImageF();

    public static final native long new_InterleavedImageS16__SWIG_0();

    public static final native long new_InterleavedImageS16__SWIG_1(int i, int i2, int i3);

    public static final native long new_InterleavedImageU16__SWIG_0();

    public static final native long new_InterleavedImageU16__SWIG_1(int i, int i2, int i3);

    public static final native long new_InterleavedImageU8__SWIG_0();

    public static final native long new_InterleavedImageU8__SWIG_1(int i, int i2, int i3);

    public static final native long new_InterleavedReadViewS16__SWIG_0();

    public static final native long new_InterleavedReadViewU16__SWIG_0();

    public static final native long new_InterleavedReadViewU8__SWIG_0();

    public static final native long new_InterleavedWriteViewS16__SWIG_0();

    public static final native long new_InterleavedWriteViewU16__SWIG_0();

    public static final native long new_InterleavedWriteViewU8__SWIG_0();

    public static final native long new_InterleavedWriteViewU8__SWIG_1(int i, int i2, int i3, long j, int i4);

    public static final native long new_JpgEncodeOptions();

    public static final native long new_JpgEncoderMetadata();

    public static final native long new_LandmarkMap__SWIG_0();

    public static final native long new_LiveHdrMetadata();

    public static final native long new_LocationData();

    public static final native long new_MeshTranslation();

    public static final native long new_MeshWarp();

    public static final native long new_NormalizedRect();

    public static final native long new_OisMetadata();

    public static final native long new_OisPositionRawVector__SWIG_0();

    public static final native long new_OisPositionVector__SWIG_0();

    public static final native long new_PhysicalStabilityParams();

    public static final native long new_PhysicalStabilityThresholds();

    public static final native long new_PixelRect();

    public static final native long new_PixelRectVector__SWIG_0();

    public static final native long new_PortraitBrighteningProcessor();

    public static final native long new_PortraitDepthArguments(long j, InterleavedReadViewU16 interleavedReadViewU16, long j2, StringRawReadViewMap stringRawReadViewMap);

    public static final native long new_PortraitOutputs();

    public static final native long new_PortraitRequest();

    public static final native long new_PostShutterAfParams();

    public static final native long new_PostviewParams();

    public static final native long new_QcColorCalibration();

    public static final native long new_QcColorCalibration_IlluminantData();

    public static final native long new_QcIlluminantVector__SWIG_0();

    public static final native long new_RawImage__SWIG_0();

    public static final native long new_RawImage__SWIG_1(int i, int i2, int i3);

    public static final native long new_RawReadView__SWIG_0();

    public static final native long new_RawWriteView__SWIG_0();

    public static final native long new_RawWriteView__SWIG_1(int i, int i2, int i3, int i4, long j);

    public static final native long new_SceneFlicker();

    public static final native long new_ShotCallbacks();

    public static final native long new_ShotMetadata__SWIG_0();

    public static final native long new_ShotMetadata__SWIG_1(long j, ShotMetadata shotMetadata);

    public static final native long new_ShotParams__SWIG_0();

    public static final native long new_ShotParams__SWIG_1(long j, ShotParams shotParams);

    public static final native long new_Size();

    public static final native long new_SpatialAwb();

    public static final native long new_SpatialGainMap__SWIG_0();

    public static final native long new_SpatialGainMap__SWIG_1(long j, InterleavedImageF interleavedImageF);

    public static final native long new_SpatialGainMap__SWIG_2(int i, int i2);

    public static final native long new_StaticMetadataVector__SWIG_0();

    public static final native long new_StaticMetadata__SWIG_0();

    public static final native long new_StaticMetadata__SWIG_1(long j, StaticMetadata staticMetadata);

    public static final native long new_StringAeResultsMap__SWIG_0();

    public static final native long new_StringFrameMetadataMap__SWIG_0();

    public static final native long new_StringRawReadViewMap__SWIG_0();

    public static final native long new_StringSpatialGainMap__SWIG_0();

    public static final native long new_StringStaticMetadataMap__SWIG_0();

    public static final native long new_TfliteFileData(int i, long j, long j2);

    public static final native long new_ViewfinderProcessingOptions__SWIG_0();

    public static final native long new_ViewfinderResults();

    public static final native long new_WeightedNormalizedRect();

    public static final native long new_WeightedNormalizedRectVector__SWIG_0();

    public static final native long new_WeightedPixelRect();

    public static final native long new_WeightedPixelRectVector__SWIG_0();

    public static final native long new_YuvImageBase__SWIG_0(int i, int i2, int i3);

    public static final native long new_YuvReadView(int i, int i2, int i3, long j, int i4, int i5, int i6, long j2, int i7);

    public static final native long new_YuvReadViewBase__SWIG_0();

    public static final native long new_YuvReadViewBase__SWIG_1(long j, YuvReadView yuvReadView);

    public static final native long new_YuvWriteView(int i, int i2, int i3, long j, int i4, int i5, int i6, long j2, int i7);

    public static final native long new_YuvWriteViewBase__SWIG_0();

    public static final native long new_YuvWriteViewBase__SWIG_1(long j, YuvWriteView yuvWriteView);
}
