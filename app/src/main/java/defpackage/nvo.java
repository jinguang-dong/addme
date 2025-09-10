package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import com.google.android.camera.experimental2023.ExperimentalKeys;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nvo {
    public static final CaptureResult.Key A;
    public static final CaptureResult.Key B;
    public static final CaptureResult.Key C;
    public static final CaptureResult.Key D;
    private static final boolean E = nvr.b(10);
    private static final boolean F;
    private static final boolean G;
    public static final CaptureRequest.Key a;
    public static final CaptureRequest.Key b;
    public static final CaptureRequest.Key c;
    public static final CaptureRequest.Key d;
    public static final CaptureResult.Key e;
    public static final CaptureRequest.Key f;
    public static final CaptureResult.Key g;
    public static final int h;
    public static final CameraCharacteristics.Key i;
    public static final CaptureRequest.Key j;
    public static final CaptureRequest.Key k;
    public static final CaptureRequest.Key l;
    public static final CaptureResult.Key m;
    public static final CaptureResult.Key n;
    public static final CaptureResult.Key o;
    public static final CaptureResult.Key p;
    public static final CaptureResult.Key q;
    public static final CaptureRequest.Key r;
    public static final CaptureRequest.Key s;
    public static final CaptureRequest.Key t;
    public static final CaptureRequest.Key u;
    public static final CaptureResult.Key v;
    public static final CaptureResult.Key w;
    public static final CaptureRequest.Key x;
    public static final CaptureResult.Key y;
    public static final CaptureResult.Key z;

    static {
        boolean zB = nvr.b(11);
        F = zB;
        boolean zB2 = nvr.b(13);
        G = zB2;
        CaptureResult.Key key = null;
        a = a(1) ? ExperimentalKeys.REQUEST_DEBUG_BASE_FRAME_NUMBER : zB ? com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_DEBUG_BASE_FRAME_NUMBER : zB2 ? com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_DEBUG_BASE_FRAME_NUMBER : null;
        b = a(2) ? ExperimentalKeys.REQUEST_STAGGERED_HDR_MODE : zB ? com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_STAGGERED_HDR_MODE : zB2 ? com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_STAGGERED_HDR_MODE : null;
        if (a(2)) {
            CaptureResult.Key key2 = ExperimentalKeys.RESULT_STAGGERED_HDR_MODE;
        } else if (zB) {
            CaptureResult.Key key3 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_STAGGERED_HDR_MODE;
        } else if (zB2) {
            CaptureResult.Key key4 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_STAGGERED_HDR_MODE;
        }
        c = a(3) ? ExperimentalKeys.REQUEST_VIDEO_BOKEH_BLUR_LEVEL : zB ? com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_VIDEO_BOKEH_BLUR_LEVEL : zB2 ? com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_VIDEO_BOKEH_BLUR_LEVEL : null;
        if (a(3)) {
            CaptureResult.Key key5 = ExperimentalKeys.RESULT_VIDEO_BOKEH_BLUR_LEVEL;
        } else if (zB) {
            CaptureResult.Key key6 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_VIDEO_BOKEH_BLUR_LEVEL;
        } else if (zB2) {
            CaptureResult.Key key7 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_VIDEO_BOKEH_BLUR_LEVEL;
        }
        d = a(4) ? ExperimentalKeys.REQUEST_PROJECT11 : zB ? com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_PROJECT11 : zB2 ? com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_PROJECT11 : null;
        if (a(4)) {
            CaptureResult.Key key8 = ExperimentalKeys.RESULT_PROJECT11;
        } else if (zB) {
            CaptureResult.Key key9 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_PROJECT11;
        } else if (zB2) {
            CaptureResult.Key key10 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_PROJECT11;
        }
        if (!ojl.aH()) {
            if (a(5)) {
                CaptureRequest.Key key11 = ExperimentalKeys.REQUEST_AF_ACTUATOR_DAC_ENABLED;
            } else if (zB) {
                CaptureRequest.Key key12 = com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_AF_ACTUATOR_DAC_ENABLED;
            } else if (zB2) {
                CaptureRequest.Key key13 = com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_AF_ACTUATOR_DAC_ENABLED;
            }
        }
        if (!ojl.aH()) {
            if (a(5)) {
                CaptureResult.Key key14 = ExperimentalKeys.RESULT_AF_ACTUATOR_DAC_ENABLED;
            } else if (zB) {
                CaptureResult.Key key15 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_AF_ACTUATOR_DAC_ENABLED;
            } else if (zB2) {
                CaptureResult.Key key16 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_AF_ACTUATOR_DAC_ENABLED;
            }
        }
        if (!ojl.aH()) {
            if (a(5)) {
                CaptureResult.Key key17 = ExperimentalKeys.RESULT_AF_ACTUATOR_DAC_TIMESTAMPS;
            } else if (zB) {
                CaptureResult.Key key18 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_AF_ACTUATOR_DAC_TIMESTAMPS;
            } else if (zB2) {
                CaptureResult.Key key19 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_AF_ACTUATOR_DAC_TIMESTAMPS;
            }
        }
        if (!ojl.aH()) {
            if (a(5)) {
                CaptureResult.Key key20 = ExperimentalKeys.RESULT_AF_ACTUATOR_DAC_READOUTS;
            } else if (zB) {
                CaptureResult.Key key21 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_AF_ACTUATOR_DAC_READOUTS;
            } else if (zB2) {
                CaptureResult.Key key22 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_AF_ACTUATOR_DAC_READOUTS;
            }
        }
        if (a(6)) {
            CameraCharacteristics.Key key23 = ExperimentalKeys.CHARACTERISTICS_FACE_AUTH_PD_STREAMS;
        } else if (zB) {
            CameraCharacteristics.Key key24 = com.google.android.camera.experimental2024.ExperimentalKeys.CHARACTERISTICS_FACE_AUTH_PD_STREAMS;
        } else if (zB2) {
            CameraCharacteristics.Key key25 = com.google.android.camera.experimental2025.ExperimentalKeys.CHARACTERISTICS_FACE_AUTH_PD_STREAMS;
        }
        if (a(9)) {
            CaptureRequest.Key key26 = ExperimentalKeys.REQUEST_RANGING_DISTANCE_ENABLED;
        } else if (zB) {
            CaptureRequest.Key key27 = com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_RANGING_DISTANCE_ENABLED;
        } else if (zB2) {
            CaptureRequest.Key key28 = com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_RANGING_DISTANCE_ENABLED;
        }
        if (a(9)) {
            CaptureResult.Key key29 = ExperimentalKeys.RESULT_RANGING_DISTANCE_ENABLED;
        } else if (zB) {
            CaptureResult.Key key30 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_RANGING_DISTANCE_ENABLED;
        } else if (zB2) {
            CaptureResult.Key key31 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_RANGING_DISTANCE_ENABLED;
        }
        if (a(9)) {
            CaptureRequest.Key key32 = ExperimentalKeys.REQUEST_TOF_INTEGRATION_TIME;
        } else if (zB) {
            CaptureRequest.Key key33 = com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_TOF_INTEGRATION_TIME;
        } else if (zB2) {
            CaptureRequest.Key key34 = com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_TOF_INTEGRATION_TIME;
        }
        if (a(9)) {
            CaptureResult.Key key35 = ExperimentalKeys.RESULT_TOF_INTEGRATION_TIME;
        } else if (zB) {
            CaptureResult.Key key36 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_TOF_INTEGRATION_TIME;
        } else if (zB2) {
            CaptureResult.Key key37 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_TOF_INTEGRATION_TIME;
        }
        if (a(9)) {
            CaptureRequest.Key key38 = ExperimentalKeys.REQUEST_TOF_SAMPLE_RATE;
        } else if (zB) {
            CaptureRequest.Key key39 = com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_TOF_SAMPLE_RATE;
        } else if (zB2) {
            CaptureRequest.Key key40 = com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_TOF_SAMPLE_RATE;
        }
        if (a(9)) {
            CaptureResult.Key key41 = ExperimentalKeys.RESULT_TOF_SAMPLE_RATE;
        } else if (zB) {
            CaptureResult.Key key42 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_TOF_SAMPLE_RATE;
        } else if (zB2) {
            CaptureResult.Key key43 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_TOF_SAMPLE_RATE;
        }
        if (a(9)) {
            CaptureRequest.Key key44 = ExperimentalKeys.REQUEST_TOF_ZONE_MODE;
        } else if (zB) {
            CaptureRequest.Key key45 = com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_TOF_ZONE_MODE;
        } else if (zB2) {
            CaptureRequest.Key key46 = com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_TOF_ZONE_MODE;
        }
        if (a(9)) {
            CaptureResult.Key key47 = ExperimentalKeys.RESULT_TOF_ZONE_MODE;
        } else if (zB) {
            CaptureResult.Key key48 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_TOF_ZONE_MODE;
        } else if (zB2) {
            CaptureResult.Key key49 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_TOF_ZONE_MODE;
        }
        if (a(9)) {
            CaptureResult.Key key50 = ExperimentalKeys.RESULT_RANGING_DISTANCE;
        } else if (zB) {
            CaptureResult.Key key51 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_RANGING_DISTANCE;
        } else if (zB2) {
            CaptureResult.Key key52 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_RANGING_DISTANCE;
        }
        e = a(10) ? ExperimentalKeys.RESULT_SEGMENTATION_AWB_PARAMS : zB ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_SEGMENTATION_AWB_PARAMS : zB2 ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_SEGMENTATION_AWB_PARAMS : null;
        f = a(10) ? ExperimentalKeys.REQUEST_SEGMENTATION_AWB_ENABLED : zB ? com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_SEGMENTATION_AWB_ENABLED : zB2 ? com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_SEGMENTATION_AWB_ENABLED : null;
        if (a(10)) {
            CaptureResult.Key key53 = ExperimentalKeys.RESULT_SEGMENTATION_AWB_ENABLED;
        } else if (zB) {
            CaptureResult.Key key54 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_SEGMENTATION_AWB_ENABLED;
        } else if (zB2) {
            CaptureResult.Key key55 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_SEGMENTATION_AWB_ENABLED;
        }
        g = a(11) ? ExperimentalKeys.RESULT_FLASH_CAPTURE_HINT : zB ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_FLASH_CAPTURE_HINT : zB2 ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_FLASH_CAPTURE_HINT : null;
        h = 1;
        i = a(12) ? ExperimentalKeys.CHARACTERISTICS_RESTRICTED_AVAILABLE_STREAM_CONFIGURATIONS : zB ? com.google.android.camera.experimental2024.ExperimentalKeys.CHARACTERISTICS_RESTRICTED_AVAILABLE_STREAM_CONFIGURATIONS : zB2 ? com.google.android.camera.experimental2025.ExperimentalKeys.CHARACTERISTICS_RESTRICTED_AVAILABLE_STREAM_CONFIGURATIONS : null;
        if (a(23)) {
            CaptureRequest.Key key56 = ExperimentalKeys.REQUEST_IS_CAMERA_APP_SEQUOIA;
        } else if (zB) {
            CaptureRequest.Key key57 = com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_IS_CAMERA_APP_SEQUOIA;
        } else if (zB2) {
            CaptureRequest.Key key58 = com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_IS_CAMERA_APP_SEQUOIA;
        }
        if (a(23)) {
            CaptureResult.Key key59 = ExperimentalKeys.RESULT_IS_CAMERA_APP_SEQUOIA;
        } else if (zB) {
            CaptureResult.Key key60 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_IS_CAMERA_APP_SEQUOIA;
        } else if (zB2) {
            CaptureResult.Key key61 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_IS_CAMERA_APP_SEQUOIA;
        }
        j = a(14) ? ExperimentalKeys.REQUEST_FUSION_DEBLUR_LOWLIGHT_LUX_THRESHOLD : zB ? com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_FUSION_DEBLUR_LOWLIGHT_LUX_THRESHOLD : zB2 ? com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_FUSION_DEBLUR_LOWLIGHT_LUX_THRESHOLD : null;
        if (a(14)) {
            CaptureResult.Key key62 = ExperimentalKeys.RESULT_FUSION_DEBLUR_LOWLIGHT_LUX_THRESHOLD;
        } else if (zB) {
            CaptureResult.Key key63 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_FUSION_DEBLUR_LOWLIGHT_LUX_THRESHOLD;
        } else if (zB2) {
            CaptureResult.Key key64 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_FUSION_DEBLUR_LOWLIGHT_LUX_THRESHOLD;
        }
        k = a(14) ? ExperimentalKeys.REQUEST_FUSION_DEBLUR_MIN_EXPOSURE_TIME_US : zB ? com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_FUSION_DEBLUR_MIN_EXPOSURE_TIME_US : zB2 ? com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_FUSION_DEBLUR_MIN_EXPOSURE_TIME_US : null;
        if (a(14)) {
            CaptureResult.Key key65 = ExperimentalKeys.RESULT_FUSION_DEBLUR_MIN_EXPOSURE_TIME_US;
        } else if (zB) {
            CaptureResult.Key key66 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_FUSION_DEBLUR_MIN_EXPOSURE_TIME_US;
        } else if (zB2) {
            CaptureResult.Key key67 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_FUSION_DEBLUR_MIN_EXPOSURE_TIME_US;
        }
        l = a(15) ? ExperimentalKeys.REQUEST_CONTROL_AE_PRIORITY_MODE : zB ? com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_CONTROL_AE_PRIORITY_MODE : zB2 ? com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_CONTROL_AE_PRIORITY_MODE : null;
        m = a(15) ? ExperimentalKeys.RESULT_CONTROL_AE_PRIORITY_MODE : zB ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_CONTROL_AE_PRIORITY_MODE : zB2 ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_CONTROL_AE_PRIORITY_MODE : null;
        if (!ojl.aH()) {
            if (a(16)) {
                CaptureRequest.Key key68 = ExperimentalKeys.REQUEST_CAM_DATA_DUMP_BIT_MAP;
            } else if (zB) {
                CaptureRequest.Key key69 = com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_CAM_DATA_DUMP_BIT_MAP;
            } else if (zB2) {
                CaptureRequest.Key key70 = com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_CAM_DATA_DUMP_BIT_MAP;
            }
        }
        if (!ojl.aH()) {
            if (a(16)) {
                CaptureResult.Key key71 = ExperimentalKeys.RESULT_CAM_DATA_DUMP_BIT_MAP;
            } else if (zB) {
                CaptureResult.Key key72 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_CAM_DATA_DUMP_BIT_MAP;
            } else if (zB2) {
                CaptureResult.Key key73 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_CAM_DATA_DUMP_BIT_MAP;
            }
        }
        if (!ojl.aH()) {
            if (a(16)) {
                CaptureResult.Key key74 = ExperimentalKeys.RESULT_CAM_DATA_DUMP_METADATA;
            } else if (zB) {
                CaptureResult.Key key75 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_CAM_DATA_DUMP_METADATA;
            } else if (zB2) {
                CaptureResult.Key key76 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_CAM_DATA_DUMP_METADATA;
            }
        }
        n = a(18) ? ExperimentalKeys.RESULT_RAWISH_CROP : zB ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_RAWISH_CROP : zB2 ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_RAWISH_CROP : null;
        o = a(18) ? ExperimentalKeys.RESULT_LENS_POSITION_VCM : zB ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_LENS_POSITION_VCM : zB2 ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_LENS_POSITION_VCM : null;
        p = a(18) ? ExperimentalKeys.RESULT_CORRECTED_COLOR_TEMPERATURE : zB ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_CORRECTED_COLOR_TEMPERATURE : zB2 ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_CORRECTED_COLOR_TEMPERATURE : null;
        q = a(18) ? ExperimentalKeys.RESULT_ASD_INFO : zB ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_ASD_INFO : zB2 ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_ASD_INFO : null;
        r = a(19) ? ExperimentalKeys.REQUEST_HORIZONTAL_ACCURACY_RADIUS : zB ? com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_HORIZONTAL_ACCURACY_RADIUS : zB2 ? com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_HORIZONTAL_ACCURACY_RADIUS : null;
        if (a(19)) {
            CaptureResult.Key key77 = ExperimentalKeys.RESULT_HORIZONTAL_ACCURACY_RADIUS;
        } else if (zB) {
            CaptureResult.Key key78 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_HORIZONTAL_ACCURACY_RADIUS;
        } else if (zB2) {
            CaptureResult.Key key79 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_HORIZONTAL_ACCURACY_RADIUS;
        }
        s = a(19) ? ExperimentalKeys.REQUEST_LATITUDE_AND_LONGITUDE : zB ? com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_LATITUDE_AND_LONGITUDE : zB2 ? com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_LATITUDE_AND_LONGITUDE : null;
        if (a(19)) {
            CaptureResult.Key key80 = ExperimentalKeys.RESULT_LATITUDE_AND_LONGITUDE;
        } else if (zB) {
            CaptureResult.Key key81 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_LATITUDE_AND_LONGITUDE;
        } else if (zB2) {
            CaptureResult.Key key82 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_LATITUDE_AND_LONGITUDE;
        }
        t = a(19) ? ExperimentalKeys.REQUEST_MEAN_SEA_LEVEL_ALTITUDE_ACCURACY : zB ? com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_MEAN_SEA_LEVEL_ALTITUDE_ACCURACY : zB2 ? com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_MEAN_SEA_LEVEL_ALTITUDE_ACCURACY : null;
        if (a(19)) {
            CaptureResult.Key key83 = ExperimentalKeys.RESULT_MEAN_SEA_LEVEL_ALTITUDE_ACCURACY;
        } else if (zB) {
            CaptureResult.Key key84 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_MEAN_SEA_LEVEL_ALTITUDE_ACCURACY;
        } else if (zB2) {
            CaptureResult.Key key85 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_MEAN_SEA_LEVEL_ALTITUDE_ACCURACY;
        }
        u = a(19) ? ExperimentalKeys.REQUEST_MEAN_SEA_LEVEL_ALTITUDE : zB ? com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_MEAN_SEA_LEVEL_ALTITUDE : zB2 ? com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_MEAN_SEA_LEVEL_ALTITUDE : null;
        if (a(19)) {
            CaptureResult.Key key86 = ExperimentalKeys.RESULT_MEAN_SEA_LEVEL_ALTITUDE;
        } else if (zB) {
            CaptureResult.Key key87 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_MEAN_SEA_LEVEL_ALTITUDE;
        } else if (zB2) {
            CaptureResult.Key key88 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_MEAN_SEA_LEVEL_ALTITUDE;
        }
        if (a(20)) {
            CameraCharacteristics.Key key89 = ExperimentalKeys.CHARACTERISTICS_OPTIMAL_YUV_RESOLUTIONS;
        } else if (zB) {
            CameraCharacteristics.Key key90 = com.google.android.camera.experimental2024.ExperimentalKeys.CHARACTERISTICS_OPTIMAL_YUV_RESOLUTIONS;
        } else if (zB2) {
            CameraCharacteristics.Key key91 = com.google.android.camera.experimental2025.ExperimentalKeys.CHARACTERISTICS_OPTIMAL_YUV_RESOLUTIONS;
        }
        v = a(21) ? ExperimentalKeys.RESULT_AWB_TRUETONE : zB ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_AWB_TRUETONE : zB2 ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_AWB_TRUETONE : null;
        w = a(22) ? ExperimentalKeys.RESULT_AWB_SPECTRAL_SENSOR : zB ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_AWB_SPECTRAL_SENSOR : zB2 ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_AWB_SPECTRAL_SENSOR : null;
        x = a(27) ? ExperimentalKeys.REQUEST_GCAM_AE_BIAS_SETTINGS : zB ? com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_GCAM_AE_BIAS_SETTINGS : zB2 ? com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_GCAM_AE_BIAS_SETTINGS : null;
        y = a(27) ? ExperimentalKeys.RESULT_GCAM_AE_BIAS_SETTINGS : zB ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_GCAM_AE_BIAS_SETTINGS : zB2 ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_GCAM_AE_BIAS_SETTINGS : null;
        z = a(28) ? ExperimentalKeys.RESULT_GCAM_AE_SKIPPED : zB ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_GCAM_AE_SKIPPED : zB2 ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_GCAM_AE_SKIPPED : null;
        A = a(29) ? ExperimentalKeys.RESULT_NORMALIZED_BRIGHTNESS_VALUE : zB ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_NORMALIZED_BRIGHTNESS_VALUE : zB2 ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_NORMALIZED_BRIGHTNESS_VALUE : null;
        B = a(33) ? ExperimentalKeys.RESULT_IDCG_ENABLED : b(8) ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_IDCG_ENABLED : zB2 ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_IDCG_ENABLED : null;
        if (a(30)) {
            CameraCharacteristics.Key key92 = ExperimentalKeys.CHARACTERISTICS_VERTICAL_DEPTH_STREAM_CONFIGURATIONS;
        } else if (zB) {
            CameraCharacteristics.Key key93 = com.google.android.camera.experimental2024.ExperimentalKeys.CHARACTERISTICS_VERTICAL_DEPTH_STREAM_CONFIGURATIONS;
        } else if (zB2) {
            CameraCharacteristics.Key key94 = com.google.android.camera.experimental2025.ExperimentalKeys.CHARACTERISTICS_VERTICAL_DEPTH_STREAM_CONFIGURATIONS;
        }
        C = a(31) ? ExperimentalKeys.RESULT_FAST_ZOOM_MODE : b(20) ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_FAST_ZOOM_MODE : zB2 ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_FAST_ZOOM_MODE : null;
        if (a(34)) {
            key = ExperimentalKeys.RESULT_FUSION_DEBLUR_LOGS;
        } else if (b(2)) {
            key = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_FUSION_DEBLUR_LOGS;
        } else if (zB2) {
            key = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_FUSION_DEBLUR_LOGS;
        }
        D = key;
        if (a(36)) {
            CaptureRequest.Key key95 = ExperimentalKeys.REQUEST_OPTIMAL_ML_OUTPUT_ENABLED;
        }
        if (a(36)) {
            CaptureResult.Key key96 = ExperimentalKeys.RESULT_OPTIMAL_ML_OUTPUT_ENABLED;
        }
    }

    public static boolean a(int i2) {
        if (E) {
            return ExperimentalKeys.getLibraryVersion() >= i2;
        }
        return false;
    }

    public static boolean b(int i2) {
        if (F) {
            return com.google.android.camera.experimental2024.ExperimentalKeys.getLibraryVersion() >= i2;
        }
        return false;
    }
}
