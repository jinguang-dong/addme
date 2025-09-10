package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import com.google.android.camera.experimental2023.ExperimentalKeys;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nvp {
    public static final CaptureResult.Key A;
    public static final CaptureResult.Key B;
    public static final CaptureRequest.Key C;
    public static final CaptureResult.Key D;
    public static final CaptureResult.Key E;
    public static final CaptureResult.Key F;
    public static final CaptureResult.Key G;
    private static final boolean H = nvr.b(7);
    private static final boolean I = nvr.b(8);
    private static final boolean J = nvr.b(10);
    private static final boolean K = nvr.b(11);
    private static final boolean L;
    public static final CaptureRequest.Key a;
    public static final CaptureRequest.Key b;
    public static final CaptureRequest.Key c;
    public static final CaptureResult.Key d;
    public static final CameraCharacteristics.Key e;
    public static final CaptureResult.Key f;
    public static final CaptureRequest.Key g;
    public static final CaptureResult.Key h;
    public static final CaptureRequest.Key i;
    public static final CaptureResult.Key j;
    public static final CaptureResult.Key k;
    public static final CaptureResult.Key l;
    public static final CaptureRequest.Key m;
    public static final CameraCharacteristics.Key n;
    public static final CaptureResult.Key o;
    public static final CaptureResult.Key p;
    public static final CaptureResult.Key q;
    public static final CaptureResult.Key r;
    public static final CameraCharacteristics.Key s;
    public static final CaptureResult.Key t;
    public static final CaptureResult.Key u;
    public static final CaptureResult.Key v;
    public static final CaptureResult.Key w;
    public static final CameraCharacteristics.Key x;
    public static final CaptureResult.Key y;
    public static final CaptureResult.Key z;

    static {
        boolean zB = nvr.b(13);
        L = zB;
        if (a(37)) {
            CaptureResult.Key key = ExperimentalKeys.RESULT_LEDINFO_STATUS;
        } else if (b(1)) {
            CaptureResult.Key key2 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_LEDINFO_STATUS;
        } else if (zB) {
            CaptureResult.Key key3 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_LEDINFO_STATUS;
        }
        if (b(2)) {
            CaptureResult.Key key4 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_FUSION_DEBLUR_LOGS;
        } else if (zB) {
            CaptureResult.Key key5 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_FUSION_DEBLUR_LOGS;
        }
        if (b(4)) {
            CaptureResult.Key key6 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_FLOAT_CIS_TEMPERATURE;
        } else if (zB) {
            CaptureResult.Key key7 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_FLOAT_CIS_TEMPERATURE;
        }
        if (b(5)) {
            CaptureRequest.Key key8 = com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_OPTIMAL_ML_OUTPUT_ENABLED;
        } else if (zB) {
            CaptureRequest.Key key9 = com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_OPTIMAL_ML_OUTPUT_ENABLED;
        }
        if (b(5)) {
            CaptureResult.Key key10 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_OPTIMAL_ML_OUTPUT_ENABLED;
        } else if (zB) {
            CaptureResult.Key key11 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_OPTIMAL_ML_OUTPUT_ENABLED;
        }
        CaptureResult.Key key12 = null;
        a = b(7) ? com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_ROI_TRACK_TRIGGER_AF : zB ? com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_ROI_TRACK_TRIGGER_AF : null;
        if (b(7)) {
            CaptureResult.Key key13 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_ROI_TRACK_TRIGGER_AF;
        } else if (zB) {
            CaptureResult.Key key14 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_ROI_TRACK_TRIGGER_AF;
        }
        b = b(7) ? com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_ROI_TRACK_TRIGGER_AE : zB ? com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_ROI_TRACK_TRIGGER_AE : null;
        if (b(7)) {
            CaptureResult.Key key15 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_ROI_TRACK_TRIGGER_AE;
        } else if (zB) {
            CaptureResult.Key key16 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_ROI_TRACK_TRIGGER_AE;
        }
        if (b(7)) {
            CaptureRequest.Key key17 = com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_ROI_TRACK_TRIGGER_AWB;
        } else if (zB) {
            CaptureRequest.Key key18 = com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_ROI_TRACK_TRIGGER_AWB;
        }
        if (b(7)) {
            CaptureResult.Key key19 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_ROI_TRACK_TRIGGER_AWB;
        } else if (zB) {
            CaptureResult.Key key20 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_ROI_TRACK_TRIGGER_AWB;
        }
        c = b(10) ? com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_SKYLA_ENABLED : zB ? com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_SKYLA_ENABLED : null;
        d = b(10) ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_SKYLA_ENABLED : zB ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_SKYLA_ENABLED : null;
        e = b(10) ? com.google.android.camera.experimental2024.ExperimentalKeys.CHARACTERISTICS_INITIAL_DISPLAY_BRIGHTNESS : zB ? com.google.android.camera.experimental2025.ExperimentalKeys.CHARACTERISTICS_INITIAL_DISPLAY_BRIGHTNESS : null;
        f = b(10) ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_PROPOSED_DISPLAY_BRIGHTNESS : zB ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_PROPOSED_DISPLAY_BRIGHTNESS : null;
        g = b(10) ? com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_LATEST_DISPLAY_BRIGHTNESS : zB ? com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_LATEST_DISPLAY_BRIGHTNESS : null;
        h = b(10) ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_LATEST_DISPLAY_BRIGHTNESS : zB ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_LATEST_DISPLAY_BRIGHTNESS : null;
        i = b(10) ? com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_LAST_DISPLAY_BRIGHTNESS_MODIFICATION_TIMESTAMP : zB ? com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_LAST_DISPLAY_BRIGHTNESS_MODIFICATION_TIMESTAMP : null;
        j = b(10) ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_LAST_DISPLAY_BRIGHTNESS_MODIFICATION_TIMESTAMP : zB ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_LAST_DISPLAY_BRIGHTNESS_MODIFICATION_TIMESTAMP : null;
        if (b(11)) {
            CaptureRequest.Key key21 = com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_CLUT_CONTROL_ENABLED;
        } else if (zB) {
            CaptureRequest.Key key22 = com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_CLUT_CONTROL_ENABLED;
        }
        if (b(11)) {
            CaptureResult.Key key23 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_CLUT_CONTROL_ENABLED;
        } else if (zB) {
            CaptureResult.Key key24 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_CLUT_CONTROL_ENABLED;
        }
        k = b(11) ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_CLUT_IDS : zB ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_CLUT_IDS : null;
        l = b(11) ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_CLUT_WEIGHTS : zB ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_CLUT_WEIGHTS : null;
        if (b(12)) {
            CaptureRequest.Key key25 = com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_PANO_LINEAR_IMAGE_BIT_DEPTH;
        } else if (zB) {
            CaptureRequest.Key key26 = com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_PANO_LINEAR_IMAGE_BIT_DEPTH;
        } else if (d()) {
            CaptureRequest.Key key27 = com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_PANO_LINEAR_IMAGE_BIT_DEPTH;
        } else if (e()) {
            CaptureRequest.Key key28 = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_PANO_LINEAR_IMAGE_BIT_DEPTH;
        } else if (a(39)) {
            CaptureRequest.Key key29 = ExperimentalKeys.REQUEST_PANO_LINEAR_IMAGE_BIT_DEPTH;
        }
        if (b(12)) {
            CaptureResult.Key key30 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_PANO_LINEAR_IMAGE_BIT_DEPTH;
        } else if (zB) {
            CaptureResult.Key key31 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_PANO_LINEAR_IMAGE_BIT_DEPTH;
        } else if (d()) {
            CaptureResult.Key key32 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_PANO_LINEAR_IMAGE_BIT_DEPTH;
        } else if (e()) {
            CaptureResult.Key key33 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_PANO_LINEAR_IMAGE_BIT_DEPTH;
        } else if (a(39)) {
            CaptureResult.Key key34 = ExperimentalKeys.RESULT_PANO_LINEAR_IMAGE_BIT_DEPTH;
        }
        m = b(13) ? com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_PANO_CAPTURE_INTENT : zB ? com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_PANO_CAPTURE_INTENT : d() ? com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_PANO_CAPTURE_INTENT : e() ? com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_PANO_CAPTURE_INTENT : a(39) ? ExperimentalKeys.REQUEST_PANO_CAPTURE_INTENT : null;
        if (b(13)) {
            CaptureResult.Key key35 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_PANO_CAPTURE_INTENT;
        } else if (zB) {
            CaptureResult.Key key36 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_PANO_CAPTURE_INTENT;
        } else if (d()) {
            CaptureResult.Key key37 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_PANO_CAPTURE_INTENT;
        } else if (e()) {
            CaptureResult.Key key38 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_PANO_CAPTURE_INTENT;
        } else if (a(39)) {
            CaptureResult.Key key39 = ExperimentalKeys.RESULT_PANO_CAPTURE_INTENT;
        }
        n = b(14) ? com.google.android.camera.experimental2024.ExperimentalKeys.CHARACTERISTICS_ENABLE_HAL_TOUCH_ROI_TRACKING : zB ? com.google.android.camera.experimental2025.ExperimentalKeys.CHARACTERISTICS_ENABLE_HAL_TOUCH_ROI_TRACKING : null;
        if (b(15)) {
            CaptureResult.Key key40 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_HAL_ROI_TRACKING_DATA;
        } else if (zB) {
            CaptureResult.Key key41 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_HAL_ROI_TRACKING_DATA;
        }
        o = b(22) ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_AWB_ALGORITHM_DECISION : zB ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_AWB_ALGORITHM_DECISION : null;
        p = b(22) ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_AWB_MAPPED_DECISION : zB ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_AWB_MAPPED_DECISION : null;
        q = b(22) ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_AWB_ILLUMINATION_CHANGE_DETECTOR_RESULT : zB ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_AWB_ILLUMINATION_CHANGE_DETECTOR_RESULT : null;
        r = b(22) ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_AWB_SPECTRAL_SENSOR_INITIAL_CCT : zB ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_AWB_SPECTRAL_SENSOR_INITIAL_CCT : null;
        s = b(17) ? com.google.android.camera.experimental2024.ExperimentalKeys.CHARACTERISTICS_GEOMETRIC_CALIBRATION : zB ? com.google.android.camera.experimental2025.ExperimentalKeys.CHARACTERISTICS_GEOMETRIC_CALIBRATION : null;
        t = b(17) ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_OIS_ANGLE_TIMESTAMPS : zB ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_OIS_ANGLE_TIMESTAMPS : null;
        u = b(17) ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_OIS_X_ANGLES_DEGREE : zB ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_OIS_X_ANGLES_DEGREE : null;
        v = b(17) ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_OIS_Y_ANGLES_DEGREE : zB ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_OIS_Y_ANGLES_DEGREE : null;
        w = b(17) ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_CONTIZOOM_HOMOGRAPHY : zB ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_CONTIZOOM_HOMOGRAPHY : null;
        x = b(17) ? com.google.android.camera.experimental2024.ExperimentalKeys.CHARACTERISTICS_MULTICAM_SENSITIVITY_RATIOS : zB ? com.google.android.camera.experimental2025.ExperimentalKeys.CHARACTERISTICS_MULTICAM_SENSITIVITY_RATIOS : null;
        y = a(38) ? ExperimentalKeys.RESULT_REQUEST_ZOOM_RATIO : b(18) ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_REQUEST_ZOOM_RATIO : zB ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_REQUEST_ZOOM_RATIO : null;
        z = b(19) ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_HAL_METERING_RECTANGLE_MOON_ROI_DATA : zB ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_HAL_METERING_RECTANGLE_MOON_ROI_DATA : null;
        if (b(19)) {
            CaptureResult.Key key42 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_HAL_METERING_RECTANGLE_MOON_ROI_FRAME_NUMBER;
        } else if (zB) {
            CaptureResult.Key key43 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_HAL_METERING_RECTANGLE_MOON_ROI_FRAME_NUMBER;
        }
        A = b(24) ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_AF_TOF_TARGET_DISTANCES_METER : zB ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_AF_TOF_TARGET_DISTANCES_METER : null;
        B = b(24) ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_AF_TARGET_DISTANCES_DIOPTER : zB ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_AF_TARGET_DISTANCES_DIOPTER : null;
        if (b(23)) {
            CameraCharacteristics.Key key44 = com.google.android.camera.experimental2024.ExperimentalKeys.CHARACTERISTICS_FACE_AUTH_RAW_STREAMS;
        }
        if (b(25)) {
            CaptureRequest.Key key45 = com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_IS_CAMERA_LAUNCH;
        } else if (zB) {
            CaptureRequest.Key key46 = com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_IS_CAMERA_LAUNCH;
        }
        if (b(26)) {
            CaptureRequest.Key key47 = com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_IS_CAMERA_EXTENSIONS;
        } else if (zB) {
            CaptureRequest.Key key48 = com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_IS_CAMERA_EXTENSIONS;
        }
        C = a(40) ? ExperimentalKeys.REQUEST_ACINETA_ENABLED : b(28) ? com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_ACINETA_ENABLED : zB ? com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_ACINETA_ENABLED : null;
        D = a(40) ? ExperimentalKeys.RESULT_ACINETA_ENABLED : b(28) ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_ACINETA_ENABLED : zB ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_ACINETA_ENABLED : null;
        if (b(30)) {
            CaptureRequest.Key key49 = com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_SEQUOIA_IDCG_ENABLED;
        } else if (zB) {
            CaptureRequest.Key key50 = com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_SEQUOIA_IDCG_ENABLED;
        }
        if (b(30)) {
            CaptureResult.Key key51 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_SEQUOIA_IDCG_ENABLED;
        } else if (zB) {
            CaptureResult.Key key52 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_SEQUOIA_IDCG_ENABLED;
        }
        if (b(31)) {
            CaptureRequest.Key key53 = com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_HAL_TOUCH_REQUEST_TIMESTAMP;
        } else if (c(1)) {
            CaptureRequest.Key key54 = com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_HAL_TOUCH_REQUEST_TIMESTAMP;
        }
        if (b(31)) {
            CaptureResult.Key key55 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_HAL_TOUCH_REQUEST_TIMESTAMP;
        } else if (c(1)) {
            CaptureResult.Key key56 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_HAL_TOUCH_REQUEST_TIMESTAMP;
        }
        E = b(32) ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_ROI_TRACK_CONFIDENCE : c(2) ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_ROI_TRACK_CONFIDENCE : null;
        if (!ojl.aH()) {
            if (b(33)) {
                CaptureRequest.Key key57 = com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_FATP_ADV_SCENE_MODE;
            } else if (c(3)) {
                CaptureRequest.Key key58 = com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_FATP_ADV_SCENE_MODE;
            }
        }
        if (!ojl.aH()) {
            if (b(33)) {
                CaptureResult.Key key59 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_FATP_ADV_SCENE_MODE;
            } else if (c(3)) {
                CaptureResult.Key key60 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_FATP_ADV_SCENE_MODE;
            }
        }
        if (!ojl.aH()) {
            if (b(34)) {
                CaptureRequest.Key key61 = com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_FATP_ADV_LUMINANCE_TARGET;
            } else if (c(4)) {
                CaptureRequest.Key key62 = com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_FATP_ADV_LUMINANCE_TARGET;
            }
        }
        if (!ojl.aH()) {
            if (b(34)) {
                CaptureRequest.Key key63 = com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_FATP_ADV_LUMINANCE_TOLERANCE;
            } else if (c(4)) {
                CaptureRequest.Key key64 = com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_FATP_ADV_LUMINANCE_TOLERANCE;
            }
        }
        F = b(35) ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_TRUELIGHT_FACE_ID : c(5) ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_TRUELIGHT_FACE_ID : null;
        if (b(35)) {
            key12 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_TRUELIGHT_MONK_SKIN_TONE;
        } else if (c(5)) {
            key12 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_TRUELIGHT_MONK_SKIN_TONE;
        }
        G = key12;
        if (!ojl.aH()) {
            if (b(36)) {
                CaptureRequest.Key key65 = com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_CAM_DATA_DUMP_MODE;
            } else if (c(6)) {
                CaptureRequest.Key key66 = com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_CAM_DATA_DUMP_MODE;
            }
        }
        if (!ojl.aH()) {
            if (b(36)) {
                CaptureResult.Key key67 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_CAM_DATA_DUMP_MODE;
            } else if (c(6)) {
                CaptureResult.Key key68 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_CAM_DATA_DUMP_MODE;
            }
        }
        if (!ojl.aH()) {
            if (b(36)) {
                CaptureRequest.Key key69 = com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_CAM_DATA_DUMP_INTENT;
            } else if (c(9)) {
                CaptureRequest.Key key70 = com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_CAM_DATA_DUMP_INTENT;
            }
        }
        if (!ojl.aH()) {
            if (b(36)) {
                CaptureResult.Key key71 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_CAM_DATA_DUMP_INTENT;
            } else if (c(9)) {
                CaptureResult.Key key72 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_CAM_DATA_DUMP_INTENT;
            }
        }
        if (!ojl.aH()) {
            if (b(36)) {
                CaptureRequest.Key key73 = com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_CAM_DATA_DUMP_LIMIT;
            } else if (c(9)) {
                CaptureRequest.Key key74 = com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_CAM_DATA_DUMP_LIMIT;
            }
        }
        if (ojl.aH()) {
            return;
        }
        if (b(36)) {
            CaptureResult.Key key75 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_CAM_DATA_DUMP_LIMIT;
        } else if (c(9)) {
            CaptureResult.Key key76 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_CAM_DATA_DUMP_LIMIT;
        }
    }

    public static boolean a(int i2) {
        if (J) {
            return ExperimentalKeys.getLibraryVersion() >= i2;
        }
        return false;
    }

    public static boolean b(int i2) {
        if (K) {
            return com.google.android.camera.experimental2024.ExperimentalKeys.getLibraryVersion() >= i2;
        }
        return false;
    }

    public static boolean c(int i2) {
        if (L) {
            return com.google.android.camera.experimental2025.ExperimentalKeys.getLibraryVersion() >= i2;
        }
        return false;
    }

    public static boolean d() {
        if (H) {
            return com.google.android.camera.experimental2021.ExperimentalKeys.getLibraryVersion() >= 26;
        }
        return false;
    }

    public static boolean e() {
        if (I) {
            return com.google.android.camera.experimental2022.ExperimentalKeys.getLibraryVersion() >= 18;
        }
        return false;
    }
}
