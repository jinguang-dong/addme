package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import com.google.android.camera.experimental2020.ExperimentalKeys;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nvl {
    public static final CaptureRequest.Key a;
    public static final CaptureRequest.Key b;
    public static final CaptureResult.Key c;
    public static final CaptureRequest.Key d;
    public static final CameraCharacteristics.Key e;
    public static final CaptureRequest.Key f;
    public static final CaptureResult.Key g;
    public static final CaptureResult.Key h;
    public static final CaptureResult.Key i;
    public static final CaptureRequest.Key j;
    public static final CaptureResult.Key k;
    public static final CaptureResult.Key l;
    public static final CaptureResult.Key m;
    public static final CaptureRequest.Key n;
    public static final CaptureResult.Key o;
    public static final CaptureResult.Key p;
    public static final CaptureResult.Key q;
    public static final CaptureRequest.Key r;
    public static final CaptureRequest.Key s;
    public static final CaptureResult.Key t;
    private static final boolean u;
    private static final boolean v;
    private static final boolean w;
    private static final boolean x;
    private static final boolean y;
    private static final boolean z;

    static {
        nvr.b(5);
        u = nvr.b(6);
        boolean zB = nvr.b(7);
        v = zB;
        boolean zB2 = nvr.b(8);
        w = zB2;
        boolean zB3 = nvr.b(10);
        x = zB3;
        boolean zB4 = nvr.b(11);
        y = zB4;
        boolean zB5 = nvr.b(13);
        z = zB5;
        if (a(1)) {
            CaptureRequest.Key key = ExperimentalKeys.REQUEST_FAMILIAR_FACE;
        } else if (zB) {
            CaptureRequest.Key key2 = com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_FAMILIAR_FACE;
        } else if (zB2) {
            CaptureRequest.Key key3 = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_FAMILIAR_FACE;
        } else if (zB3) {
            CaptureRequest.Key key4 = com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_FAMILIAR_FACE;
        } else if (zB4) {
            CaptureRequest.Key key5 = com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_FAMILIAR_FACE;
        } else if (zB5) {
            CaptureRequest.Key key6 = com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_FAMILIAR_FACE;
        }
        if (a(1)) {
            CaptureResult.Key key7 = ExperimentalKeys.RESULT_FAMILIAR_FACE;
        } else if (zB) {
            CaptureResult.Key key8 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FAMILIAR_FACE;
        } else if (zB2) {
            CaptureResult.Key key9 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_FAMILIAR_FACE;
        } else if (zB3) {
            CaptureResult.Key key10 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_FAMILIAR_FACE;
        } else if (zB4) {
            CaptureResult.Key key11 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_FAMILIAR_FACE;
        } else if (zB5) {
            CaptureResult.Key key12 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_FAMILIAR_FACE;
        }
        CaptureResult.Key key13 = null;
        a = a(1) ? ExperimentalKeys.REQUEST_FAMILIAR_FACE_ENABLED : zB ? com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_FAMILIAR_FACE_ENABLED : zB2 ? com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_FAMILIAR_FACE_ENABLED : zB3 ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_FAMILIAR_FACE_ENABLED : zB4 ? com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_FAMILIAR_FACE_ENABLED : zB5 ? com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_FAMILIAR_FACE_ENABLED : null;
        if (a(1)) {
            CaptureResult.Key key14 = ExperimentalKeys.RESULT_FAMILIAR_FACE_ENABLED;
        } else if (zB) {
            CaptureResult.Key key15 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FAMILIAR_FACE_ENABLED;
        } else if (zB2) {
            CaptureResult.Key key16 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_FAMILIAR_FACE_ENABLED;
        } else if (zB3) {
            CaptureResult.Key key17 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_FAMILIAR_FACE_ENABLED;
        } else if (zB4) {
            CaptureResult.Key key18 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_FAMILIAR_FACE_ENABLED;
        } else if (zB5) {
            CaptureResult.Key key19 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_FAMILIAR_FACE_ENABLED;
        }
        b = a(2) ? ExperimentalKeys.REQUEST_FLASHLIGHT_BRIGHTNESS : zB ? com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_FLASHLIGHT_BRIGHTNESS : zB2 ? com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_FLASHLIGHT_BRIGHTNESS : zB3 ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_FLASHLIGHT_BRIGHTNESS : zB4 ? com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_FLASHLIGHT_BRIGHTNESS : zB5 ? com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_FLASHLIGHT_BRIGHTNESS : null;
        c = a(2) ? ExperimentalKeys.RESULT_FLASHLIGHT_BRIGHTNESS : zB ? com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FLASHLIGHT_BRIGHTNESS : zB2 ? com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_FLASHLIGHT_BRIGHTNESS : zB3 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_FLASHLIGHT_BRIGHTNESS : zB4 ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_FLASHLIGHT_BRIGHTNESS : zB5 ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_FLASHLIGHT_BRIGHTNESS : null;
        d = a(2) ? ExperimentalKeys.REQUEST_FLASHLIGHT_BRIGHTNESS_ENABLED : zB ? com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_FLASHLIGHT_BRIGHTNESS_ENABLED : zB2 ? com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_FLASHLIGHT_BRIGHTNESS_ENABLED : zB3 ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_FLASHLIGHT_BRIGHTNESS_ENABLED : zB4 ? com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_FLASHLIGHT_BRIGHTNESS_ENABLED : zB5 ? com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_FLASHLIGHT_BRIGHTNESS_ENABLED : null;
        if (a(2)) {
            CaptureResult.Key key20 = ExperimentalKeys.RESULT_FLASHLIGHT_BRIGHTNESS_ENABLED;
        } else if (zB) {
            CaptureResult.Key key21 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FLASHLIGHT_BRIGHTNESS_ENABLED;
        } else if (zB2) {
            CaptureResult.Key key22 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_FLASHLIGHT_BRIGHTNESS_ENABLED;
        } else if (zB3) {
            CaptureResult.Key key23 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_FLASHLIGHT_BRIGHTNESS_ENABLED;
        } else if (zB4) {
            CaptureResult.Key key24 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_FLASHLIGHT_BRIGHTNESS_ENABLED;
        } else if (zB5) {
            CaptureResult.Key key25 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_FLASHLIGHT_BRIGHTNESS_ENABLED;
        }
        e = a(2) ? ExperimentalKeys.CHARACTERISTICS_FLASHLIGHT_BRIGHTNESS_LEVEL_MAX : zB ? com.google.android.camera.experimental2021.ExperimentalKeys.CHARACTERISTICS_FLASHLIGHT_BRIGHTNESS_LEVEL_MAX : zB2 ? com.google.android.camera.experimental2022.ExperimentalKeys.CHARACTERISTICS_FLASHLIGHT_BRIGHTNESS_LEVEL_MAX : zB3 ? com.google.android.camera.experimental2023.ExperimentalKeys.CHARACTERISTICS_FLASHLIGHT_BRIGHTNESS_LEVEL_MAX : zB4 ? com.google.android.camera.experimental2024.ExperimentalKeys.CHARACTERISTICS_FLASHLIGHT_BRIGHTNESS_LEVEL_MAX : zB5 ? com.google.android.camera.experimental2025.ExperimentalKeys.CHARACTERISTICS_FLASHLIGHT_BRIGHTNESS_LEVEL_MAX : null;
        f = a(4) ? ExperimentalKeys.REQUEST_SMOOTHY_MODE : zB ? com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_SMOOTHY_MODE : zB2 ? com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_SMOOTHY_MODE : zB3 ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_SMOOTHY_MODE : zB4 ? com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_SMOOTHY_MODE : zB5 ? com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_SMOOTHY_MODE : null;
        if (a(4)) {
            CaptureResult.Key key26 = ExperimentalKeys.RESULT_SMOOTHY_MODE;
        } else if (zB) {
            CaptureResult.Key key27 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_SMOOTHY_MODE;
        } else if (zB2) {
            CaptureResult.Key key28 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_SMOOTHY_MODE;
        } else if (zB3) {
            CaptureResult.Key key29 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_SMOOTHY_MODE;
        } else if (zB4) {
            CaptureResult.Key key30 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_SMOOTHY_MODE;
        } else if (zB5) {
            CaptureResult.Key key31 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_SMOOTHY_MODE;
        }
        g = a(5) ? ExperimentalKeys.RESULT_FACE_DETECTION_TIMESTAMP : zB ? com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FACE_DETECTION_TIMESTAMP : zB2 ? com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_FACE_DETECTION_TIMESTAMP : zB3 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_FACE_DETECTION_TIMESTAMP : zB4 ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_FACE_DETECTION_TIMESTAMP : zB5 ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_FACE_DETECTION_TIMESTAMP : null;
        if (a(7)) {
            CameraCharacteristics.Key key32 = ExperimentalKeys.CHARACTERISTICS_FACE_ATTRIBUTE_AVAILABLE_IDS;
        } else if (zB) {
            CameraCharacteristics.Key key33 = com.google.android.camera.experimental2021.ExperimentalKeys.CHARACTERISTICS_FACE_ATTRIBUTE_AVAILABLE_IDS;
        } else if (zB2) {
            CameraCharacteristics.Key key34 = com.google.android.camera.experimental2022.ExperimentalKeys.CHARACTERISTICS_FACE_ATTRIBUTE_AVAILABLE_IDS;
        } else if (zB3) {
            CameraCharacteristics.Key key35 = com.google.android.camera.experimental2023.ExperimentalKeys.CHARACTERISTICS_FACE_ATTRIBUTE_AVAILABLE_IDS;
        } else if (zB4) {
            CameraCharacteristics.Key key36 = com.google.android.camera.experimental2024.ExperimentalKeys.CHARACTERISTICS_FACE_ATTRIBUTE_AVAILABLE_IDS;
        } else if (zB5) {
            CameraCharacteristics.Key key37 = com.google.android.camera.experimental2025.ExperimentalKeys.CHARACTERISTICS_FACE_ATTRIBUTE_AVAILABLE_IDS;
        }
        if (a(7)) {
            CaptureResult.Key key38 = ExperimentalKeys.RESULT_FACE_ATTRIBUTE_COUNT;
        } else if (zB) {
            CaptureResult.Key key39 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FACE_ATTRIBUTE_COUNT;
        } else if (zB2) {
            CaptureResult.Key key40 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_FACE_ATTRIBUTE_COUNT;
        } else if (zB3) {
            CaptureResult.Key key41 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_FACE_ATTRIBUTE_COUNT;
        } else if (zB4) {
            CaptureResult.Key key42 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_FACE_ATTRIBUTE_COUNT;
        } else if (zB5) {
            CaptureResult.Key key43 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_FACE_ATTRIBUTE_COUNT;
        }
        if (a(7)) {
            CaptureResult.Key key44 = ExperimentalKeys.RESULT_FACE_ATTRIBUTE_IDS;
        } else if (zB) {
            CaptureResult.Key key45 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FACE_ATTRIBUTE_IDS;
        } else if (zB2) {
            CaptureResult.Key key46 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_FACE_ATTRIBUTE_IDS;
        } else if (zB3) {
            CaptureResult.Key key47 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_FACE_ATTRIBUTE_IDS;
        } else if (zB4) {
            CaptureResult.Key key48 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_FACE_ATTRIBUTE_IDS;
        } else if (zB5) {
            CaptureResult.Key key49 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_FACE_ATTRIBUTE_IDS;
        }
        if (a(7)) {
            CaptureResult.Key key50 = ExperimentalKeys.RESULT_FACE_ATTRIBUTE_SCORES;
        } else if (zB) {
            CaptureResult.Key key51 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FACE_ATTRIBUTE_SCORES;
        } else if (zB2) {
            CaptureResult.Key key52 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_FACE_ATTRIBUTE_SCORES;
        } else if (zB3) {
            CaptureResult.Key key53 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_FACE_ATTRIBUTE_SCORES;
        } else if (zB4) {
            CaptureResult.Key key54 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_FACE_ATTRIBUTE_SCORES;
        } else if (zB5) {
            CaptureResult.Key key55 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_FACE_ATTRIBUTE_SCORES;
        }
        if (a(7)) {
            CaptureResult.Key key56 = ExperimentalKeys.RESULT_FACE_ATTRIBUTE_VALUE;
        } else if (zB) {
            CaptureResult.Key key57 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FACE_ATTRIBUTE_VALUE;
        } else if (zB2) {
            CaptureResult.Key key58 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_FACE_ATTRIBUTE_VALUE;
        } else if (zB3) {
            CaptureResult.Key key59 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_FACE_ATTRIBUTE_VALUE;
        } else if (zB4) {
            CaptureResult.Key key60 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_FACE_ATTRIBUTE_VALUE;
        } else if (zB5) {
            CaptureResult.Key key61 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_FACE_ATTRIBUTE_VALUE;
        }
        if (a(6)) {
            CaptureResult.Key key62 = ExperimentalKeys.RESULT_LENS_DISTORTION_COEFFICIENTS_HIGH_QUALITY;
        } else if (zB) {
            CaptureResult.Key key63 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_LENS_DISTORTION_COEFFICIENTS_HIGH_QUALITY;
        } else if (zB2) {
            CaptureResult.Key key64 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_LENS_DISTORTION_COEFFICIENTS_HIGH_QUALITY;
        } else if (zB3) {
            CaptureResult.Key key65 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_LENS_DISTORTION_COEFFICIENTS_HIGH_QUALITY;
        } else if (zB4) {
            CaptureResult.Key key66 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_LENS_DISTORTION_COEFFICIENTS_HIGH_QUALITY;
        } else if (zB5) {
            CaptureResult.Key key67 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_LENS_DISTORTION_COEFFICIENTS_HIGH_QUALITY;
        }
        if (a(6)) {
            CaptureResult.Key key68 = ExperimentalKeys.RESULT_LENS_DISTORTION_OPTICAL_CENTER_HIGH_QUALITY;
        } else if (zB) {
            CaptureResult.Key key69 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_LENS_DISTORTION_OPTICAL_CENTER_HIGH_QUALITY;
        } else if (zB2) {
            CaptureResult.Key key70 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_LENS_DISTORTION_OPTICAL_CENTER_HIGH_QUALITY;
        } else if (zB3) {
            CaptureResult.Key key71 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_LENS_DISTORTION_OPTICAL_CENTER_HIGH_QUALITY;
        } else if (zB4) {
            CaptureResult.Key key72 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_LENS_DISTORTION_OPTICAL_CENTER_HIGH_QUALITY;
        } else if (zB5) {
            CaptureResult.Key key73 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_LENS_DISTORTION_OPTICAL_CENTER_HIGH_QUALITY;
        }
        if (a(6)) {
            CaptureResult.Key key74 = ExperimentalKeys.RESULT_LENS_DISTORTION_NORMALIZATION_HIGH_QUALITY;
        } else if (zB) {
            CaptureResult.Key key75 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_LENS_DISTORTION_NORMALIZATION_HIGH_QUALITY;
        } else if (zB2) {
            CaptureResult.Key key76 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_LENS_DISTORTION_NORMALIZATION_HIGH_QUALITY;
        } else if (zB3) {
            CaptureResult.Key key77 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_LENS_DISTORTION_NORMALIZATION_HIGH_QUALITY;
        } else if (zB4) {
            CaptureResult.Key key78 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_LENS_DISTORTION_NORMALIZATION_HIGH_QUALITY;
        } else if (zB5) {
            CaptureResult.Key key79 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_LENS_DISTORTION_NORMALIZATION_HIGH_QUALITY;
        }
        if (a(6)) {
            CaptureResult.Key key80 = ExperimentalKeys.RESULT_LENS_DISTORTION_ACTIVE_RECTANGLE_HIGH_QUALITY;
        } else if (zB) {
            CaptureResult.Key key81 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_LENS_DISTORTION_ACTIVE_RECTANGLE_HIGH_QUALITY;
        } else if (zB2) {
            CaptureResult.Key key82 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_LENS_DISTORTION_ACTIVE_RECTANGLE_HIGH_QUALITY;
        } else if (zB3) {
            CaptureResult.Key key83 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_LENS_DISTORTION_ACTIVE_RECTANGLE_HIGH_QUALITY;
        } else if (zB4) {
            CaptureResult.Key key84 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_LENS_DISTORTION_ACTIVE_RECTANGLE_HIGH_QUALITY;
        } else if (zB5) {
            CaptureResult.Key key85 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_LENS_DISTORTION_ACTIVE_RECTANGLE_HIGH_QUALITY;
        }
        if (a(6)) {
            CaptureResult.Key key86 = ExperimentalKeys.RESULT_LENS_DISTORTION_VALID_RECTANGLE_HIGH_QUALITY;
        } else if (zB) {
            CaptureResult.Key key87 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_LENS_DISTORTION_VALID_RECTANGLE_HIGH_QUALITY;
        } else if (zB2) {
            CaptureResult.Key key88 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_LENS_DISTORTION_VALID_RECTANGLE_HIGH_QUALITY;
        } else if (zB3) {
            CaptureResult.Key key89 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_LENS_DISTORTION_VALID_RECTANGLE_HIGH_QUALITY;
        } else if (zB4) {
            CaptureResult.Key key90 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_LENS_DISTORTION_VALID_RECTANGLE_HIGH_QUALITY;
        } else if (zB5) {
            CaptureResult.Key key91 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_LENS_DISTORTION_VALID_RECTANGLE_HIGH_QUALITY;
        }
        h = a(8) ? ExperimentalKeys.RESULT_FLICKER_FREQ_HIGH_RES : zB ? com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FLICKER_FREQ_HIGH_RES : zB2 ? com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_FLICKER_FREQ_HIGH_RES : zB3 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_FLICKER_FREQ_HIGH_RES : zB4 ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_FLICKER_FREQ_HIGH_RES : zB5 ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_FLICKER_FREQ_HIGH_RES : null;
        i = a(8) ? ExperimentalKeys.RESULT_FLICKER_CONF_HIGH_RES : zB ? com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FLICKER_CONF_HIGH_RES : zB2 ? com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_FLICKER_CONF_HIGH_RES : zB3 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_FLICKER_CONF_HIGH_RES : zB4 ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_FLICKER_CONF_HIGH_RES : zB5 ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_FLICKER_CONF_HIGH_RES : null;
        j = a(9) ? ExperimentalKeys.REQUEST_3A_LOGGING_STATS_ENABLED : zB ? com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_3A_LOGGING_STATS_ENABLED : zB2 ? com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_3A_LOGGING_STATS_ENABLED : zB3 ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_3A_LOGGING_STATS_ENABLED : zB4 ? com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_3A_LOGGING_STATS_ENABLED : zB5 ? com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_3A_LOGGING_STATS_ENABLED : null;
        if (a(9)) {
            CaptureResult.Key key92 = ExperimentalKeys.RESULT_3A_LOGGING_STATS_ENABLED;
        } else if (zB) {
            CaptureResult.Key key93 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_3A_LOGGING_STATS_ENABLED;
        } else if (zB2) {
            CaptureResult.Key key94 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_3A_LOGGING_STATS_ENABLED;
        } else if (zB3) {
            CaptureResult.Key key95 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_3A_LOGGING_STATS_ENABLED;
        } else if (zB4) {
            CaptureResult.Key key96 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_3A_LOGGING_STATS_ENABLED;
        } else if (zB5) {
            CaptureResult.Key key97 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_3A_LOGGING_STATS_ENABLED;
        }
        k = a(9) ? ExperimentalKeys.RESULT_AEC_LOGGING_STATS_BLOB : zB ? com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_AEC_LOGGING_STATS_BLOB : zB2 ? com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_AEC_LOGGING_STATS_BLOB : zB3 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_AEC_LOGGING_STATS_BLOB : zB4 ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_AEC_LOGGING_STATS_BLOB : zB5 ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_AEC_LOGGING_STATS_BLOB : null;
        l = a(9) ? ExperimentalKeys.RESULT_AF_LOGGING_STATS_BLOB : zB ? com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_AF_LOGGING_STATS_BLOB : zB2 ? com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_AF_LOGGING_STATS_BLOB : zB3 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_AF_LOGGING_STATS_BLOB : zB4 ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_AF_LOGGING_STATS_BLOB : zB5 ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_AF_LOGGING_STATS_BLOB : null;
        m = a(9) ? ExperimentalKeys.RESULT_AWB_LOGGING_STATS_BLOB : zB ? com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_AWB_LOGGING_STATS_BLOB : zB2 ? com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_AWB_LOGGING_STATS_BLOB : zB3 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_AWB_LOGGING_STATS_BLOB : zB4 ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_AWB_LOGGING_STATS_BLOB : zB5 ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_AWB_LOGGING_STATS_BLOB : null;
        n = a(9) ? ExperimentalKeys.REQUEST_3A_VIDEO_METADATA_ENABLED : zB ? com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_3A_VIDEO_METADATA_ENABLED : zB2 ? com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_3A_VIDEO_METADATA_ENABLED : zB3 ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_3A_VIDEO_METADATA_ENABLED : zB4 ? com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_3A_VIDEO_METADATA_ENABLED : zB5 ? com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_3A_VIDEO_METADATA_ENABLED : null;
        if (a(9)) {
            CaptureResult.Key key98 = ExperimentalKeys.RESULT_3A_VIDEO_METADATA_ENABLED;
        } else if (zB) {
            CaptureResult.Key key99 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_3A_VIDEO_METADATA_ENABLED;
        } else if (zB2) {
            CaptureResult.Key key100 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_3A_VIDEO_METADATA_ENABLED;
        } else if (zB3) {
            CaptureResult.Key key101 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_3A_VIDEO_METADATA_ENABLED;
        } else if (zB4) {
            CaptureResult.Key key102 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_3A_VIDEO_METADATA_ENABLED;
        } else if (zB5) {
            CaptureResult.Key key103 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_3A_VIDEO_METADATA_ENABLED;
        }
        o = a(9) ? ExperimentalKeys.RESULT_AEC_VIDEO_DEBUG_BLOB : zB ? com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_AEC_VIDEO_DEBUG_BLOB : zB2 ? com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_AEC_VIDEO_DEBUG_BLOB : zB3 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_AEC_VIDEO_DEBUG_BLOB : zB4 ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_AEC_VIDEO_DEBUG_BLOB : zB5 ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_AEC_VIDEO_DEBUG_BLOB : null;
        p = a(9) ? ExperimentalKeys.RESULT_AF_VIDEO_DEBUG_BLOB : zB ? com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_AF_VIDEO_DEBUG_BLOB : zB2 ? com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_AF_VIDEO_DEBUG_BLOB : zB3 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_AF_VIDEO_DEBUG_BLOB : zB4 ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_AF_VIDEO_DEBUG_BLOB : zB5 ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_AF_VIDEO_DEBUG_BLOB : null;
        q = a(9) ? ExperimentalKeys.RESULT_AWB_VIDEO_DEBUG_BLOB : zB ? com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_AWB_VIDEO_DEBUG_BLOB : zB2 ? com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_AWB_VIDEO_DEBUG_BLOB : zB3 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_AWB_VIDEO_DEBUG_BLOB : zB4 ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_AWB_VIDEO_DEBUG_BLOB : zB5 ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_AWB_VIDEO_DEBUG_BLOB : null;
        if (a(10)) {
            CaptureResult.Key key104 = ExperimentalKeys.RESULT_STOKES_THERMAL_STATUS;
        } else if (zB) {
            CaptureResult.Key key105 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_STOKES_THERMAL_STATUS;
        } else if (zB2) {
            CaptureResult.Key key106 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_STOKES_THERMAL_STATUS;
        } else if (zB3) {
            CaptureResult.Key key107 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_STOKES_THERMAL_STATUS;
        } else if (zB4) {
            CaptureResult.Key key108 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_STOKES_THERMAL_STATUS;
        } else if (zB5) {
            CaptureResult.Key key109 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_STOKES_THERMAL_STATUS;
        }
        r = a(11) ? ExperimentalKeys.REQUEST_EIS_MODE : zB ? com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_EIS_MODE : zB2 ? com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_EIS_MODE : zB3 ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_EIS_MODE : zB4 ? com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_EIS_MODE : zB5 ? com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_EIS_MODE : null;
        if (a(11)) {
            CaptureResult.Key key110 = ExperimentalKeys.RESULT_EIS_MODE;
        } else if (zB) {
            CaptureResult.Key key111 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_EIS_MODE;
        } else if (zB2) {
            CaptureResult.Key key112 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_EIS_MODE;
        } else if (zB3) {
            CaptureResult.Key key113 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_EIS_MODE;
        } else if (zB4) {
            CaptureResult.Key key114 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_EIS_MODE;
        } else if (zB5) {
            CaptureResult.Key key115 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_EIS_MODE;
        }
        s = a(12) ? ExperimentalKeys.REQUEST_SKIP_3A_PROCESS : zB ? com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_SKIP_3A_PROCESS : zB2 ? com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_SKIP_3A_PROCESS : zB3 ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_SKIP_3A_PROCESS : zB4 ? com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_SKIP_3A_PROCESS : zB5 ? com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_SKIP_3A_PROCESS : null;
        if (a(12)) {
            CaptureResult.Key key116 = ExperimentalKeys.RESULT_SKIP_3A_PROCESS;
        } else if (zB) {
            CaptureResult.Key key117 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_SKIP_3A_PROCESS;
        } else if (zB2) {
            CaptureResult.Key key118 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_SKIP_3A_PROCESS;
        } else if (zB3) {
            CaptureResult.Key key119 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_SKIP_3A_PROCESS;
        } else if (zB4) {
            CaptureResult.Key key120 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_SKIP_3A_PROCESS;
        } else if (zB5) {
            CaptureResult.Key key121 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_SKIP_3A_PROCESS;
        }
        if (a(13)) {
            key13 = ExperimentalKeys.RESULT_FLOAT_SENSOR_SENSITIVITY;
        } else if (zB) {
            key13 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FLOAT_SENSOR_SENSITIVITY;
        } else if (zB2) {
            key13 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_FLOAT_SENSOR_SENSITIVITY;
        } else if (zB3) {
            key13 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_FLOAT_SENSOR_SENSITIVITY;
        } else if (zB4) {
            key13 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_FLOAT_SENSOR_SENSITIVITY;
        } else if (zB5) {
            key13 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_FLOAT_SENSOR_SENSITIVITY;
        }
        t = key13;
    }

    public static boolean a(int i2) {
        if (u) {
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
