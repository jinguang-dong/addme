package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import com.google.android.camera.experimental2021.ExperimentalKeys;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nvm {
    public static final CaptureRequest.Key a;
    public static final CaptureRequest.Key b;
    public static final CaptureResult.Key c;
    public static final CaptureResult.Key d;
    public static final CaptureRequest.Key e;
    public static final CaptureResult.Key f;
    public static final CaptureRequest.Key g;
    public static final CaptureRequest.Key h;
    public static final CaptureRequest.Key i;
    public static final CaptureRequest.Key j;
    public static final CaptureRequest.Key k;
    public static final CaptureResult.Key l;
    public static final CameraCharacteristics.Key m;
    public static final CameraCharacteristics.Key n;
    public static final CaptureRequest.Key o;
    public static final CaptureRequest.Key p;
    public static final CaptureResult.Key q;
    public static final CaptureResult.Key r;
    public static final CaptureResult.Key s;
    public static final CaptureResult.Key t;
    public static final CaptureRequest.Key u;
    private static final boolean v = nvr.b(7);
    private static final boolean w;
    private static final boolean x;
    private static final boolean y;
    private static final boolean z;

    static {
        boolean zB = nvr.b(8);
        w = zB;
        boolean zB2 = nvr.b(10);
        x = zB2;
        boolean zB3 = nvr.b(11);
        y = zB3;
        boolean zB4 = nvr.b(13);
        z = zB4;
        CaptureRequest.Key key = null;
        a = a(1) ? ExperimentalKeys.REQUEST_MANUAL_AWB_CONTROL_MODE : zB ? com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_MANUAL_AWB_CONTROL_MODE : zB2 ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_MANUAL_AWB_CONTROL_MODE : zB3 ? com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_MANUAL_AWB_CONTROL_MODE : zB4 ? com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_MANUAL_AWB_CONTROL_MODE : null;
        if (a(1)) {
            CaptureResult.Key key2 = ExperimentalKeys.RESULT_MANUAL_AWB_CONTROL_MODE;
        } else if (zB) {
            CaptureResult.Key key3 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_MANUAL_AWB_CONTROL_MODE;
        } else if (zB2) {
            CaptureResult.Key key4 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_MANUAL_AWB_CONTROL_MODE;
        } else if (zB3) {
            CaptureResult.Key key5 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_MANUAL_AWB_CONTROL_MODE;
        } else if (zB4) {
            CaptureResult.Key key6 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_MANUAL_AWB_CONTROL_MODE;
        }
        b = a(1) ? ExperimentalKeys.REQUEST_MANUAL_AWB_CONTROL_FACTORS : zB ? com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_MANUAL_AWB_CONTROL_FACTORS : zB2 ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_MANUAL_AWB_CONTROL_FACTORS : zB3 ? com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_MANUAL_AWB_CONTROL_FACTORS : zB4 ? com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_MANUAL_AWB_CONTROL_FACTORS : null;
        c = a(1) ? ExperimentalKeys.RESULT_MANUAL_AWB_CONTROL_FACTORS : zB ? com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_MANUAL_AWB_CONTROL_FACTORS : zB2 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_MANUAL_AWB_CONTROL_FACTORS : zB3 ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_MANUAL_AWB_CONTROL_FACTORS : zB4 ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_MANUAL_AWB_CONTROL_FACTORS : null;
        if (a(2)) {
            CaptureResult.Key key7 = ExperimentalKeys.RESULT_BABY_MODE_ENABLED;
        } else if (zB) {
            CaptureResult.Key key8 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_BABY_MODE_ENABLED;
        } else if (zB2) {
            CaptureResult.Key key9 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_BABY_MODE_ENABLED;
        } else if (zB3) {
            CaptureResult.Key key10 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_BABY_MODE_ENABLED;
        } else if (zB4) {
            CaptureResult.Key key11 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_BABY_MODE_ENABLED;
        }
        if (a(3)) {
            CaptureRequest.Key key12 = ExperimentalKeys.REQUEST_DYNAMIC_PROFILING_ENABLED;
        } else if (zB) {
            CaptureRequest.Key key13 = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_DYNAMIC_PROFILING_ENABLED;
        } else if (zB2) {
            CaptureRequest.Key key14 = com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_DYNAMIC_PROFILING_ENABLED;
        } else if (zB3) {
            CaptureRequest.Key key15 = com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_DYNAMIC_PROFILING_ENABLED;
        } else if (zB4) {
            CaptureRequest.Key key16 = com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_DYNAMIC_PROFILING_ENABLED;
        }
        if (a(3)) {
            CaptureResult.Key key17 = ExperimentalKeys.RESULT_DYNAMIC_PROFILING_ENABLED;
        } else if (zB) {
            CaptureResult.Key key18 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_DYNAMIC_PROFILING_ENABLED;
        } else if (zB2) {
            CaptureResult.Key key19 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_DYNAMIC_PROFILING_ENABLED;
        } else if (zB3) {
            CaptureResult.Key key20 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_DYNAMIC_PROFILING_ENABLED;
        } else if (zB4) {
            CaptureResult.Key key21 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_DYNAMIC_PROFILING_ENABLED;
        }
        if (!a(19)) {
            if (a(4)) {
                CaptureRequest.Key key22 = ExperimentalKeys.REQUEST_MOTION_DEBLUR_ENABLED;
            } else if (zB) {
                CaptureRequest.Key key23 = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_MOTION_DEBLUR_ENABLED;
            } else if (zB2) {
                CaptureRequest.Key key24 = com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_MOTION_DEBLUR_ENABLED;
            } else if (zB3) {
                CaptureRequest.Key key25 = com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_MOTION_DEBLUR_ENABLED;
            } else if (zB4) {
                CaptureRequest.Key key26 = com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_MOTION_DEBLUR_ENABLED;
            }
        }
        if (!a(19)) {
            if (a(4)) {
                CaptureResult.Key key27 = ExperimentalKeys.RESULT_MOTION_DEBLUR_ENABLED;
            } else if (zB) {
                CaptureResult.Key key28 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_MOTION_DEBLUR_ENABLED;
            } else if (zB2) {
                CaptureResult.Key key29 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_MOTION_DEBLUR_ENABLED;
            } else if (zB3) {
                CaptureResult.Key key30 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_MOTION_DEBLUR_ENABLED;
            } else if (zB4) {
                CaptureResult.Key key31 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_MOTION_DEBLUR_ENABLED;
            }
        }
        d = a(4) ? ExperimentalKeys.RESULT_MOTION_DEBLUR_VALID_PHYSICAL_RESULT : zB ? com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_MOTION_DEBLUR_VALID_PHYSICAL_RESULT : zB2 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_MOTION_DEBLUR_VALID_PHYSICAL_RESULT : zB3 ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_MOTION_DEBLUR_VALID_PHYSICAL_RESULT : zB4 ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_MOTION_DEBLUR_VALID_PHYSICAL_RESULT : null;
        if (a(5)) {
            CaptureRequest.Key key32 = ExperimentalKeys.REQUEST_SIMPLE_COMPUTER_VISION_MODE_ENABLE;
        } else if (zB) {
            CaptureRequest.Key key33 = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_SIMPLE_COMPUTER_VISION_MODE_ENABLE;
        } else if (zB2) {
            CaptureRequest.Key key34 = com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_SIMPLE_COMPUTER_VISION_MODE_ENABLE;
        } else if (zB3) {
            CaptureRequest.Key key35 = com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_SIMPLE_COMPUTER_VISION_MODE_ENABLE;
        } else if (zB4) {
            CaptureRequest.Key key36 = com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_SIMPLE_COMPUTER_VISION_MODE_ENABLE;
        }
        if (a(6)) {
            CaptureResult.Key key37 = ExperimentalKeys.RESULT_SIMPLE_COMPUTER_VISION_MODE_ENABLE;
        } else if (zB) {
            CaptureResult.Key key38 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_SIMPLE_COMPUTER_VISION_MODE_ENABLE;
        } else if (zB2) {
            CaptureResult.Key key39 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_SIMPLE_COMPUTER_VISION_MODE_ENABLE;
        } else if (zB3) {
            CaptureResult.Key key40 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_SIMPLE_COMPUTER_VISION_MODE_ENABLE;
        } else if (zB4) {
            CaptureResult.Key key41 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_SIMPLE_COMPUTER_VISION_MODE_ENABLE;
        }
        if (a(7)) {
            CaptureRequest.Key key42 = ExperimentalKeys.REQUEST_FACE_AUTH_USE_CASE;
        } else if (zB) {
            CaptureRequest.Key key43 = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_FACE_AUTH_USE_CASE;
        } else if (zB2) {
            CaptureRequest.Key key44 = com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_FACE_AUTH_USE_CASE;
        } else if (zB3) {
            CaptureRequest.Key key45 = com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_FACE_AUTH_USE_CASE;
        } else if (zB4) {
            CaptureRequest.Key key46 = com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_FACE_AUTH_USE_CASE;
        }
        if (a(7)) {
            CaptureResult.Key key47 = ExperimentalKeys.RESULT_FACE_AUTH_USE_CASE;
        } else if (zB) {
            CaptureResult.Key key48 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_FACE_AUTH_USE_CASE;
        } else if (zB2) {
            CaptureResult.Key key49 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_FACE_AUTH_USE_CASE;
        } else if (zB3) {
            CaptureResult.Key key50 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_FACE_AUTH_USE_CASE;
        } else if (zB4) {
            CaptureResult.Key key51 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_FACE_AUTH_USE_CASE;
        }
        if (a(7)) {
            CaptureRequest.Key key52 = ExperimentalKeys.REQUEST_FACEAUTH_FACE_REGIONS;
        } else if (zB) {
            CaptureRequest.Key key53 = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_FACEAUTH_FACE_REGIONS;
        } else if (zB2) {
            CaptureRequest.Key key54 = com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_FACEAUTH_FACE_REGIONS;
        } else if (zB3) {
            CaptureRequest.Key key55 = com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_FACEAUTH_FACE_REGIONS;
        } else if (zB4) {
            CaptureRequest.Key key56 = com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_FACEAUTH_FACE_REGIONS;
        }
        if (a(7)) {
            CaptureResult.Key key57 = ExperimentalKeys.RESULT_FACEAUTH_FACE_REGIONS;
        } else if (zB) {
            CaptureResult.Key key58 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_FACEAUTH_FACE_REGIONS;
        } else if (zB2) {
            CaptureResult.Key key59 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_FACEAUTH_FACE_REGIONS;
        } else if (zB3) {
            CaptureResult.Key key60 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_FACEAUTH_FACE_REGIONS;
        } else if (zB4) {
            CaptureResult.Key key61 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_FACEAUTH_FACE_REGIONS;
        }
        e = a(8) ? ExperimentalKeys.REQUEST_FAMILIAR_FACE_TRUETONE : zB ? com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_FAMILIAR_FACE_TRUETONE : zB2 ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_FAMILIAR_FACE_TRUETONE : zB3 ? com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_FAMILIAR_FACE_TRUETONE : zB4 ? com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_FAMILIAR_FACE_TRUETONE : null;
        f = a(8) ? ExperimentalKeys.RESULT_FAMILIAR_FACE_TRUETONE : zB ? com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_FAMILIAR_FACE_TRUETONE : zB2 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_FAMILIAR_FACE_TRUETONE : zB3 ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_FAMILIAR_FACE_TRUETONE : zB4 ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_FAMILIAR_FACE_TRUETONE : null;
        g = a(9) ? ExperimentalKeys.REQUEST_LOOKAHEAD_EIS_MODE_ENABLED : zB ? com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_LOOKAHEAD_EIS_MODE_ENABLED : zB2 ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_LOOKAHEAD_EIS_MODE_ENABLED : zB3 ? com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_LOOKAHEAD_EIS_MODE_ENABLED : zB4 ? com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_LOOKAHEAD_EIS_MODE_ENABLED : null;
        if (a(9)) {
            CaptureResult.Key key62 = ExperimentalKeys.RESULT_LOOKAHEAD_EIS_MODE_ENABLED;
        } else if (zB) {
            CaptureResult.Key key63 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_LOOKAHEAD_EIS_MODE_ENABLED;
        } else if (zB2) {
            CaptureResult.Key key64 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_LOOKAHEAD_EIS_MODE_ENABLED;
        } else if (zB3) {
            CaptureResult.Key key65 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_LOOKAHEAD_EIS_MODE_ENABLED;
        } else if (zB4) {
            CaptureResult.Key key66 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_LOOKAHEAD_EIS_MODE_ENABLED;
        }
        h = a(10) ? ExperimentalKeys.REQUEST_DISTANCE_WATER_LEVEL : zB ? com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_DISTANCE_WATER_LEVEL : zB2 ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_DISTANCE_WATER_LEVEL : zB3 ? com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_DISTANCE_WATER_LEVEL : zB4 ? com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_DISTANCE_WATER_LEVEL : null;
        if (a(10)) {
            CaptureResult.Key key67 = ExperimentalKeys.RESULT_DISTANCE_WATER_LEVEL;
        } else if (zB) {
            CaptureResult.Key key68 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_DISTANCE_WATER_LEVEL;
        } else if (zB2) {
            CaptureResult.Key key69 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_DISTANCE_WATER_LEVEL;
        } else if (zB3) {
            CaptureResult.Key key70 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_DISTANCE_WATER_LEVEL;
        } else if (zB4) {
            CaptureResult.Key key71 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_DISTANCE_WATER_LEVEL;
        }
        if (!ojl.aH()) {
            if (a(11)) {
                CaptureRequest.Key key72 = ExperimentalKeys.REQUEST_DEBUG_UI_ENABLED;
            } else if (zB) {
                CaptureRequest.Key key73 = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_DEBUG_UI_ENABLED;
            } else if (zB2) {
                CaptureRequest.Key key74 = com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_DEBUG_UI_ENABLED;
            } else if (zB3) {
                CaptureRequest.Key key75 = com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_DEBUG_UI_ENABLED;
            } else if (zB4) {
                CaptureRequest.Key key76 = com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_DEBUG_UI_ENABLED;
            }
        }
        if (!ojl.aH()) {
            if (a(11)) {
                CaptureResult.Key key77 = ExperimentalKeys.RESULT_DEBUG_UI_ENABLED;
            } else if (zB) {
                CaptureResult.Key key78 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_DEBUG_UI_ENABLED;
            } else if (zB2) {
                CaptureResult.Key key79 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_DEBUG_UI_ENABLED;
            } else if (zB3) {
                CaptureResult.Key key80 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_DEBUG_UI_ENABLED;
            } else if (zB4) {
                CaptureResult.Key key81 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_DEBUG_UI_ENABLED;
            }
        }
        if (!ojl.aH()) {
            if (a(11)) {
                CaptureResult.Key key82 = ExperimentalKeys.RESULT_AF_DEBUG_UI_BLOB;
            } else if (zB) {
                CaptureResult.Key key83 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_AF_DEBUG_UI_BLOB;
            } else if (zB2) {
                CaptureResult.Key key84 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_AF_DEBUG_UI_BLOB;
            } else if (zB3) {
                CaptureResult.Key key85 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_AF_DEBUG_UI_BLOB;
            } else if (zB4) {
                CaptureResult.Key key86 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_AF_DEBUG_UI_BLOB;
            }
        }
        i = a(12) ? ExperimentalKeys.REQUEST_OIS_JITTER_MODE_ENABLED : zB ? com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_OIS_JITTER_MODE_ENABLED : zB2 ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_OIS_JITTER_MODE_ENABLED : zB3 ? com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_OIS_JITTER_MODE_ENABLED : zB4 ? com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_OIS_JITTER_MODE_ENABLED : null;
        if (a(12)) {
            CaptureResult.Key key87 = ExperimentalKeys.RESULT_OIS_JITTER_MODE_ENABLED;
        } else if (zB) {
            CaptureResult.Key key88 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_OIS_JITTER_MODE_ENABLED;
        } else if (zB2) {
            CaptureResult.Key key89 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_OIS_JITTER_MODE_ENABLED;
        } else if (zB3) {
            CaptureResult.Key key90 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_OIS_JITTER_MODE_ENABLED;
        } else if (zB4) {
            CaptureResult.Key key91 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_OIS_JITTER_MODE_ENABLED;
        }
        j = a(13) ? ExperimentalKeys.REQUEST_GCAM_AE_MOTION_METERING_OPTIONS : zB ? com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_GCAM_AE_MOTION_METERING_OPTIONS : zB2 ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_GCAM_AE_MOTION_METERING_OPTIONS : zB3 ? com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_GCAM_AE_MOTION_METERING_OPTIONS : zB4 ? com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_GCAM_AE_MOTION_METERING_OPTIONS : null;
        if (a(13)) {
            CaptureResult.Key key92 = ExperimentalKeys.RESULT_GCAM_AE_MOTION_METERING_OPTIONS;
        } else if (zB) {
            CaptureResult.Key key93 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_GCAM_AE_MOTION_METERING_OPTIONS;
        } else if (zB2) {
            CaptureResult.Key key94 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_GCAM_AE_MOTION_METERING_OPTIONS;
        } else if (zB3) {
            CaptureResult.Key key95 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_GCAM_AE_MOTION_METERING_OPTIONS;
        } else if (zB4) {
            CaptureResult.Key key96 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_GCAM_AE_MOTION_METERING_OPTIONS;
        }
        k = a(14) ? ExperimentalKeys.REQUEST_SEGMENTATION_MASK_PORTRAIT_REQUESTED : zB ? com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_SEGMENTATION_MASK_PORTRAIT_REQUESTED : zB2 ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_SEGMENTATION_MASK_PORTRAIT_REQUESTED : zB3 ? com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_SEGMENTATION_MASK_PORTRAIT_REQUESTED : zB4 ? com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_SEGMENTATION_MASK_PORTRAIT_REQUESTED : null;
        if (a(14)) {
            CaptureResult.Key key97 = ExperimentalKeys.RESULT_SEGMENTATION_MASK_PORTRAIT_REQUESTED;
        } else if (zB) {
            CaptureResult.Key key98 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_SEGMENTATION_MASK_PORTRAIT_REQUESTED;
        } else if (zB2) {
            CaptureResult.Key key99 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_SEGMENTATION_MASK_PORTRAIT_REQUESTED;
        } else if (zB3) {
            CaptureResult.Key key100 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_SEGMENTATION_MASK_PORTRAIT_REQUESTED;
        } else if (zB4) {
            CaptureResult.Key key101 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_SEGMENTATION_MASK_PORTRAIT_REQUESTED;
        }
        l = a(14) ? ExperimentalKeys.RESULT_SEGMENTATION_MASK_PORTRAIT : zB ? com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_SEGMENTATION_MASK_PORTRAIT : zB2 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_SEGMENTATION_MASK_PORTRAIT : zB3 ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_SEGMENTATION_MASK_PORTRAIT : zB4 ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_SEGMENTATION_MASK_PORTRAIT : null;
        m = a(15) ? ExperimentalKeys.CHARACTERISTICS_FLOAT_SENSOR_INFO_SENSITIVITY_RANGE : zB ? com.google.android.camera.experimental2022.ExperimentalKeys.CHARACTERISTICS_FLOAT_SENSOR_INFO_SENSITIVITY_RANGE : zB2 ? com.google.android.camera.experimental2023.ExperimentalKeys.CHARACTERISTICS_FLOAT_SENSOR_INFO_SENSITIVITY_RANGE : zB3 ? com.google.android.camera.experimental2024.ExperimentalKeys.CHARACTERISTICS_FLOAT_SENSOR_INFO_SENSITIVITY_RANGE : zB4 ? com.google.android.camera.experimental2025.ExperimentalKeys.CHARACTERISTICS_FLOAT_SENSOR_INFO_SENSITIVITY_RANGE : null;
        n = a(15) ? ExperimentalKeys.CHARACTERISTICS_FLOAT_SENSOR_MAX_ANALOG_SENSITIVITY : zB ? com.google.android.camera.experimental2022.ExperimentalKeys.CHARACTERISTICS_FLOAT_SENSOR_MAX_ANALOG_SENSITIVITY : zB2 ? com.google.android.camera.experimental2023.ExperimentalKeys.CHARACTERISTICS_FLOAT_SENSOR_MAX_ANALOG_SENSITIVITY : zB3 ? com.google.android.camera.experimental2024.ExperimentalKeys.CHARACTERISTICS_FLOAT_SENSOR_MAX_ANALOG_SENSITIVITY : zB4 ? com.google.android.camera.experimental2025.ExperimentalKeys.CHARACTERISTICS_FLOAT_SENSOR_MAX_ANALOG_SENSITIVITY : null;
        o = a(16) ? ExperimentalKeys.REQUEST_MOTION_DEBLUR_FOLLOWER_ENABLED : zB ? com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_MOTION_DEBLUR_FOLLOWER_ENABLED : zB2 ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_MOTION_DEBLUR_FOLLOWER_ENABLED : zB3 ? com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_MOTION_DEBLUR_FOLLOWER_ENABLED : zB4 ? com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_MOTION_DEBLUR_FOLLOWER_ENABLED : null;
        if (a(16)) {
            CaptureResult.Key key102 = ExperimentalKeys.RESULT_MOTION_DEBLUR_FOLLOWER_ENABLED;
        } else if (zB) {
            CaptureResult.Key key103 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_MOTION_DEBLUR_FOLLOWER_ENABLED;
        } else if (zB2) {
            CaptureResult.Key key104 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_MOTION_DEBLUR_FOLLOWER_ENABLED;
        } else if (zB3) {
            CaptureResult.Key key105 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_MOTION_DEBLUR_FOLLOWER_ENABLED;
        } else if (zB4) {
            CaptureResult.Key key106 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_MOTION_DEBLUR_FOLLOWER_ENABLED;
        }
        if (a(17)) {
            CaptureRequest.Key key107 = ExperimentalKeys.REQUEST_HIGH_FREQUENCY_LENS_INFO_ENABLED;
        } else if (zB) {
            CaptureRequest.Key key108 = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_HIGH_FREQUENCY_LENS_INFO_ENABLED;
        } else if (zB2) {
            CaptureRequest.Key key109 = com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_HIGH_FREQUENCY_LENS_INFO_ENABLED;
        } else if (zB3) {
            CaptureRequest.Key key110 = com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_HIGH_FREQUENCY_LENS_INFO_ENABLED;
        } else if (zB4) {
            CaptureRequest.Key key111 = com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_HIGH_FREQUENCY_LENS_INFO_ENABLED;
        }
        if (a(17)) {
            CaptureResult.Key key112 = ExperimentalKeys.RESULT_HIGH_FREQUENCY_LENS_INFO_ENABLED;
        } else if (zB) {
            CaptureResult.Key key113 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_HIGH_FREQUENCY_LENS_INFO_ENABLED;
        } else if (zB2) {
            CaptureResult.Key key114 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_HIGH_FREQUENCY_LENS_INFO_ENABLED;
        } else if (zB3) {
            CaptureResult.Key key115 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_HIGH_FREQUENCY_LENS_INFO_ENABLED;
        } else if (zB4) {
            CaptureResult.Key key116 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_HIGH_FREQUENCY_LENS_INFO_ENABLED;
        }
        if (a(17)) {
            CaptureResult.Key key117 = ExperimentalKeys.RESULT_HIGH_FREQUENCY_LENS_INTRINSIC_CALIBRATION;
        } else if (zB) {
            CaptureResult.Key key118 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_HIGH_FREQUENCY_LENS_INTRINSIC_CALIBRATION;
        } else if (zB2) {
            CaptureResult.Key key119 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_HIGH_FREQUENCY_LENS_INTRINSIC_CALIBRATION;
        } else if (zB3) {
            CaptureResult.Key key120 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_HIGH_FREQUENCY_LENS_INTRINSIC_CALIBRATION;
        } else if (zB4) {
            CaptureResult.Key key121 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_HIGH_FREQUENCY_LENS_INTRINSIC_CALIBRATION;
        }
        if (a(17)) {
            CaptureResult.Key key122 = ExperimentalKeys.RESULT_HIGH_FREQUENCY_LENS_POSE_ROTATION;
        } else if (zB) {
            CaptureResult.Key key123 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_HIGH_FREQUENCY_LENS_POSE_ROTATION;
        } else if (zB2) {
            CaptureResult.Key key124 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_HIGH_FREQUENCY_LENS_POSE_ROTATION;
        } else if (zB3) {
            CaptureResult.Key key125 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_HIGH_FREQUENCY_LENS_POSE_ROTATION;
        } else if (zB4) {
            CaptureResult.Key key126 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_HIGH_FREQUENCY_LENS_POSE_ROTATION;
        }
        if (a(17)) {
            CaptureResult.Key key127 = ExperimentalKeys.RESULT_HIGH_FREQUENCY_LENS_POSE_TRANSLATION;
        } else if (zB) {
            CaptureResult.Key key128 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_HIGH_FREQUENCY_LENS_POSE_TRANSLATION;
        } else if (zB2) {
            CaptureResult.Key key129 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_HIGH_FREQUENCY_LENS_POSE_TRANSLATION;
        } else if (zB3) {
            CaptureResult.Key key130 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_HIGH_FREQUENCY_LENS_POSE_TRANSLATION;
        } else if (zB4) {
            CaptureResult.Key key131 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_HIGH_FREQUENCY_LENS_POSE_TRANSLATION;
        }
        if (a(20)) {
            CaptureResult.Key key132 = ExperimentalKeys.RESULT_HIGH_FREQUENCY_LENS_INFO_TIMESTAMP;
        } else if (zB) {
            CaptureResult.Key key133 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_HIGH_FREQUENCY_LENS_INFO_TIMESTAMP;
        } else if (zB2) {
            CaptureResult.Key key134 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_HIGH_FREQUENCY_LENS_INFO_TIMESTAMP;
        } else if (zB3) {
            CaptureResult.Key key135 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_HIGH_FREQUENCY_LENS_INFO_TIMESTAMP;
        } else if (zB4) {
            CaptureResult.Key key136 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_HIGH_FREQUENCY_LENS_INFO_TIMESTAMP;
        }
        if (a(18)) {
            CaptureResult.Key key137 = ExperimentalKeys.RESULT_RANGE_SENSOR_ENABLED;
        } else if (zB) {
            CaptureResult.Key key138 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_RANGE_SENSOR_ENABLED;
        } else if (zB2) {
            CaptureResult.Key key139 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_RANGE_SENSOR_ENABLED;
        } else if (zB3) {
            CaptureResult.Key key140 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_RANGE_SENSOR_ENABLED;
        } else if (zB4) {
            CaptureResult.Key key141 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_RANGE_SENSOR_ENABLED;
        }
        p = a(19) ? ExperimentalKeys.REQUEST_MOTION_DEBLUR_MODE : zB ? com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_MOTION_DEBLUR_MODE : zB2 ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_MOTION_DEBLUR_MODE : zB3 ? com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_MOTION_DEBLUR_MODE : zB4 ? com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_MOTION_DEBLUR_MODE : null;
        q = a(19) ? ExperimentalKeys.RESULT_MOTION_DEBLUR_MODE : zB ? com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_MOTION_DEBLUR_MODE : zB2 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_MOTION_DEBLUR_MODE : zB3 ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_MOTION_DEBLUR_MODE : zB4 ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_MOTION_DEBLUR_MODE : null;
        if (!ojl.aH()) {
            if (a(21)) {
                CaptureRequest.Key key142 = ExperimentalKeys.REQUEST_PD_DUMP_START;
            } else if (zB) {
                CaptureRequest.Key key143 = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_PD_DUMP_START;
            } else if (zB2) {
                CaptureRequest.Key key144 = com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_PD_DUMP_START;
            } else if (zB3) {
                CaptureRequest.Key key145 = com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_PD_DUMP_START;
            } else if (zB4) {
                CaptureRequest.Key key146 = com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_PD_DUMP_START;
            }
        }
        if (!ojl.aH()) {
            if (a(21)) {
                CaptureResult.Key key147 = ExperimentalKeys.RESULT_PD_DUMP_START;
            } else if (zB) {
                CaptureResult.Key key148 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_PD_DUMP_START;
            } else if (zB2) {
                CaptureResult.Key key149 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_PD_DUMP_START;
            } else if (zB3) {
                CaptureResult.Key key150 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_PD_DUMP_START;
            } else if (zB4) {
                CaptureResult.Key key151 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_PD_DUMP_START;
            }
        }
        r = a(22) ? ExperimentalKeys.RESULT_OIS_TIMESTAMPS : zB ? com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_OIS_TIMESTAMPS : zB2 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_OIS_TIMESTAMPS : zB3 ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_OIS_TIMESTAMPS : zB4 ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_OIS_TIMESTAMPS : null;
        s = a(22) ? ExperimentalKeys.RESULT_OIS_SHIFT_DAC_X : zB ? com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_OIS_SHIFT_DAC_X : zB2 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_OIS_SHIFT_DAC_X : zB3 ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_OIS_SHIFT_DAC_X : zB4 ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_OIS_SHIFT_DAC_X : null;
        t = a(22) ? ExperimentalKeys.RESULT_OIS_SHIFT_DAC_Y : zB ? com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_OIS_SHIFT_DAC_Y : zB2 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_OIS_SHIFT_DAC_Y : zB3 ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_OIS_SHIFT_DAC_Y : zB4 ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_OIS_SHIFT_DAC_Y : null;
        if (a(23)) {
            key = ExperimentalKeys.REQUEST_CAPTURE_STATUS;
        } else if (zB) {
            key = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_CAPTURE_STATUS;
        } else if (zB2) {
            key = com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_CAPTURE_STATUS;
        } else if (zB3) {
            key = com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_CAPTURE_STATUS;
        } else if (zB4) {
            key = com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_CAPTURE_STATUS;
        }
        u = key;
        if (a(23)) {
            CaptureResult.Key key152 = ExperimentalKeys.RESULT_CAPTURE_STATUS;
        } else if (zB) {
            CaptureResult.Key key153 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_CAPTURE_STATUS;
        } else if (zB2) {
            CaptureResult.Key key154 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_CAPTURE_STATUS;
        } else if (zB3) {
            CaptureResult.Key key155 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_CAPTURE_STATUS;
        } else if (zB4) {
            CaptureResult.Key key156 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_CAPTURE_STATUS;
        }
        if (a(24)) {
            CaptureRequest.Key key157 = ExperimentalKeys.REQUEST_LYRIC_EXIF_MAKER_NOTE;
        } else if (zB) {
            CaptureRequest.Key key158 = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_LYRIC_EXIF_MAKER_NOTE;
        } else if (zB2) {
            CaptureRequest.Key key159 = com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_LYRIC_EXIF_MAKER_NOTE;
        } else if (zB3) {
            CaptureRequest.Key key160 = com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_LYRIC_EXIF_MAKER_NOTE;
        } else if (zB4) {
            CaptureRequest.Key key161 = com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_LYRIC_EXIF_MAKER_NOTE;
        }
        if (a(24)) {
            CaptureResult.Key key162 = ExperimentalKeys.RESULT_REQUEST_LYRIC_EXIF_MAKER_NOTE;
        } else if (zB) {
            CaptureResult.Key key163 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_REQUEST_LYRIC_EXIF_MAKER_NOTE;
        } else if (zB2) {
            CaptureResult.Key key164 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_REQUEST_LYRIC_EXIF_MAKER_NOTE;
        } else if (zB3) {
            CaptureResult.Key key165 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_REQUEST_LYRIC_EXIF_MAKER_NOTE;
        } else if (zB4) {
            CaptureResult.Key key166 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_REQUEST_LYRIC_EXIF_MAKER_NOTE;
        }
        if (a(24)) {
            CaptureResult.Key key167 = ExperimentalKeys.RESULT_LYRIC_EXIF_MAKER_NOTE;
            return;
        }
        if (zB) {
            CaptureResult.Key key168 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_LYRIC_EXIF_MAKER_NOTE;
            return;
        }
        if (zB2) {
            CaptureResult.Key key169 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_LYRIC_EXIF_MAKER_NOTE;
        } else if (zB3) {
            CaptureResult.Key key170 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_LYRIC_EXIF_MAKER_NOTE;
        } else if (zB4) {
            CaptureResult.Key key171 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_LYRIC_EXIF_MAKER_NOTE;
        }
    }

    public static boolean a(int i2) {
        if (v) {
            try {
                if (i2 <= ExperimentalKeys.getLibraryVersion()) {
                    return true;
                }
            } catch (NoSuchFieldError | NoSuchMethodError unused) {
            }
        }
        return false;
    }
}
