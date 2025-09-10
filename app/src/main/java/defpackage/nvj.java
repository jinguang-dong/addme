package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import com.google.android.camera.experimental2018.ExperimentalKeys;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nvj {
    private static final boolean A;
    private static final boolean B;
    private static final boolean C;
    public static final CaptureResult.Key a;
    public static final CameraCharacteristics.Key b;
    public static final CameraCharacteristics.Key c;
    public static final CameraCharacteristics.Key d;
    public static final CameraCharacteristics.Key e;
    public static final CameraCharacteristics.Key f;
    public static final CaptureRequest.Key g;
    public static final CaptureResult.Key h;
    public static final CaptureResult.Key i;
    public static final CaptureResult.Key j;
    public static final CameraCharacteristics.Key k;
    public static final CaptureResult.Key l;
    public static final CaptureResult.Key m;
    public static final CaptureResult.Key n;
    public static final CaptureResult.Key o;
    public static final CaptureResult.Key p;
    public static final CaptureResult.Key q;
    public static final CaptureRequest.Key r;
    public static final CaptureRequest.Key s;
    public static final CaptureResult.Key t;
    private static final boolean u = nvr.b(3);
    private static final boolean v;
    private static final boolean w;
    private static final boolean x;
    private static final boolean y;
    private static final boolean z;

    static {
        boolean zB = nvr.b(4);
        v = zB;
        boolean zB2 = nvr.b(5);
        w = zB2;
        boolean zB3 = nvr.b(6);
        x = zB3;
        boolean zB4 = nvr.b(7);
        y = zB4;
        boolean zB5 = nvr.b(8);
        z = zB5;
        boolean zB6 = nvr.b(10);
        A = zB6;
        boolean zB7 = nvr.b(11);
        B = zB7;
        boolean zB8 = nvr.b(13);
        C = zB8;
        CaptureResult.Key key = null;
        a = a(2) ? ExperimentalKeys.EXPERIMENTAL_FOCUS_OBJ_TOO_CLOSE : zB ? com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_FOCUS_OBJ_TOO_CLOSE : zB2 ? com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_FOCUS_OBJ_TOO_CLOSE : zB3 ? com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_FOCUS_OBJ_TOO_CLOSE : zB4 ? com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FOCUS_OBJ_TOO_CLOSE : zB5 ? com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_FOCUS_OBJ_TOO_CLOSE : zB6 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_FOCUS_OBJ_TOO_CLOSE : zB7 ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_FOCUS_OBJ_TOO_CLOSE : zB8 ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_FOCUS_OBJ_TOO_CLOSE : null;
        if (a(5)) {
            CaptureResult.Key key2 = ExperimentalKeys.EXPERIMENTAL_3A_SPECTRAL_DATA;
        }
        b = a(6) ? ExperimentalKeys.EXPERIMENTAL_LENS_DISTORTION_COEFFICIENTS_HIGH_QUALITY : nvl.a(6) ? com.google.android.camera.experimental2020.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_COEFFICIENTS_HIGH_QUALITY : zB4 ? com.google.android.camera.experimental2021.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_COEFFICIENTS_HIGH_QUALITY : zB5 ? com.google.android.camera.experimental2022.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_COEFFICIENTS_HIGH_QUALITY : zB6 ? com.google.android.camera.experimental2023.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_COEFFICIENTS_HIGH_QUALITY : zB7 ? com.google.android.camera.experimental2024.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_COEFFICIENTS_HIGH_QUALITY : zB8 ? com.google.android.camera.experimental2025.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_COEFFICIENTS_HIGH_QUALITY : null;
        c = a(6) ? ExperimentalKeys.EXPERIMENTAL_LENS_DISTORTION_OPTICAL_CENTER_HIGH_QUALITY : nvl.a(6) ? com.google.android.camera.experimental2020.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_OPTICAL_CENTER_HIGH_QUALITY : zB4 ? com.google.android.camera.experimental2021.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_OPTICAL_CENTER_HIGH_QUALITY : zB5 ? com.google.android.camera.experimental2022.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_OPTICAL_CENTER_HIGH_QUALITY : zB6 ? com.google.android.camera.experimental2023.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_OPTICAL_CENTER_HIGH_QUALITY : zB7 ? com.google.android.camera.experimental2024.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_OPTICAL_CENTER_HIGH_QUALITY : zB8 ? com.google.android.camera.experimental2025.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_OPTICAL_CENTER_HIGH_QUALITY : null;
        d = a(6) ? ExperimentalKeys.EXPERIMENTAL_LENS_DISTORTION_NORMALIZATION_HIGH_QUALITY : nvl.a(6) ? com.google.android.camera.experimental2020.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_NORMALIZATION_HIGH_QUALITY : zB4 ? com.google.android.camera.experimental2021.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_NORMALIZATION_HIGH_QUALITY : zB5 ? com.google.android.camera.experimental2022.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_NORMALIZATION_HIGH_QUALITY : zB6 ? com.google.android.camera.experimental2023.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_NORMALIZATION_HIGH_QUALITY : zB7 ? com.google.android.camera.experimental2024.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_NORMALIZATION_HIGH_QUALITY : zB8 ? com.google.android.camera.experimental2025.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_NORMALIZATION_HIGH_QUALITY : null;
        e = a(6) ? ExperimentalKeys.EXPERIMENTAL_LENS_DISTORTION_ACTIVE_RECTANGLE_HIGH_QUALITY : nvl.a(6) ? com.google.android.camera.experimental2020.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_ACTIVE_RECTANGLE_HIGH_QUALITY : zB4 ? com.google.android.camera.experimental2021.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_ACTIVE_RECTANGLE_HIGH_QUALITY : zB5 ? com.google.android.camera.experimental2022.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_ACTIVE_RECTANGLE_HIGH_QUALITY : zB6 ? com.google.android.camera.experimental2023.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_ACTIVE_RECTANGLE_HIGH_QUALITY : zB7 ? com.google.android.camera.experimental2024.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_ACTIVE_RECTANGLE_HIGH_QUALITY : zB8 ? com.google.android.camera.experimental2025.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_ACTIVE_RECTANGLE_HIGH_QUALITY : null;
        f = a(6) ? ExperimentalKeys.EXPERIMENTAL_LENS_DISTORTION_VALID_RECTANGLE_HIGH_QUALITY : nvl.a(6) ? com.google.android.camera.experimental2020.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_VALID_RECTANGLE_HIGH_QUALITY : zB4 ? com.google.android.camera.experimental2021.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_VALID_RECTANGLE_HIGH_QUALITY : zB5 ? com.google.android.camera.experimental2022.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_VALID_RECTANGLE_HIGH_QUALITY : zB6 ? com.google.android.camera.experimental2023.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_VALID_RECTANGLE_HIGH_QUALITY : zB7 ? com.google.android.camera.experimental2024.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_VALID_RECTANGLE_HIGH_QUALITY : zB8 ? com.google.android.camera.experimental2025.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_VALID_RECTANGLE_HIGH_QUALITY : null;
        if (a(13)) {
            CameraCharacteristics.Key key3 = ExperimentalKeys.NEXUS_EXPERIMENTAL_FRONT_STEREO_CAL;
        }
        if (a(7)) {
            CaptureRequest.Key key4 = ExperimentalKeys.EXPERIMENTAL_REQUEST_BAYER_GRID_STATS;
        }
        if (a(7)) {
            CaptureResult.Key key5 = ExperimentalKeys.EXPERIMENTAL_BAYER_GRID_STATS;
        }
        if (a(8)) {
            CaptureResult.Key key6 = ExperimentalKeys.EXPERIMENTAL_THERMAL_INFO;
        }
        g = a(9) ? ExperimentalKeys.EXPERIMENTAL_3A_METADATA_ENABLED : zB ? com.google.android.camera.experimental2019.ExperimentalKeys.REQUEST_3A_METADATA_ENABLED : zB2 ? com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_3A_METADATA_ENABLED : zB3 ? com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_3A_METADATA_ENABLED : zB4 ? com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_3A_METADATA_ENABLED : zB5 ? com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_3A_METADATA_ENABLED : zB6 ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_3A_METADATA_ENABLED : zB7 ? com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_3A_METADATA_ENABLED : zB8 ? com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_3A_METADATA_ENABLED : null;
        h = a(9) ? ExperimentalKeys.EXPERIMENTAL_3A_METADATA_AEC : zB ? com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_3A_METADATA_AEC : zB2 ? com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_3A_METADATA_AEC : zB3 ? com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_3A_METADATA_AEC : zB4 ? com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_3A_METADATA_AEC : zB5 ? com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_3A_METADATA_AEC : zB6 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_3A_METADATA_AEC : zB7 ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_3A_METADATA_AEC : zB8 ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_3A_METADATA_AEC : null;
        i = a(9) ? ExperimentalKeys.EXPERIMENTAL_3A_METADATA_AF : zB ? com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_3A_METADATA_AF : zB2 ? com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_3A_METADATA_AF : zB3 ? com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_3A_METADATA_AF : zB4 ? com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_3A_METADATA_AF : zB5 ? com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_3A_METADATA_AF : zB6 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_3A_METADATA_AF : zB7 ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_3A_METADATA_AF : zB8 ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_3A_METADATA_AF : null;
        j = a(9) ? ExperimentalKeys.EXPERIMENTAL_3A_METADATA_AWB : zB ? com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_3A_METADATA_AWB : zB2 ? com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_3A_METADATA_AWB : zB3 ? com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_3A_METADATA_AWB : zB4 ? com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_3A_METADATA_AWB : zB5 ? com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_3A_METADATA_AWB : zB6 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_3A_METADATA_AWB : zB7 ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_3A_METADATA_AWB : zB8 ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_3A_METADATA_AWB : null;
        k = a(12) ? ExperimentalKeys.EXPERIMENTAL_FACE_LANDMARK_AVAILABLE_IDS : zB ? com.google.android.camera.experimental2019.ExperimentalKeys.CHARACTERISTICS_FACE_LANDMARK_AVAILABLE_IDS : zB2 ? com.google.android.camera.experimental2020_midyear.ExperimentalKeys.CHARACTERISTICS_FACE_LANDMARK_AVAILABLE_IDS : zB3 ? com.google.android.camera.experimental2020.ExperimentalKeys.CHARACTERISTICS_FACE_LANDMARK_AVAILABLE_IDS : zB4 ? com.google.android.camera.experimental2021.ExperimentalKeys.CHARACTERISTICS_FACE_LANDMARK_AVAILABLE_IDS : zB5 ? com.google.android.camera.experimental2022.ExperimentalKeys.CHARACTERISTICS_FACE_LANDMARK_AVAILABLE_IDS : zB6 ? com.google.android.camera.experimental2023.ExperimentalKeys.CHARACTERISTICS_FACE_LANDMARK_AVAILABLE_IDS : zB7 ? com.google.android.camera.experimental2024.ExperimentalKeys.CHARACTERISTICS_FACE_LANDMARK_AVAILABLE_IDS : zB8 ? com.google.android.camera.experimental2025.ExperimentalKeys.CHARACTERISTICS_FACE_LANDMARK_AVAILABLE_IDS : null;
        l = a(12) ? ExperimentalKeys.EXPERIMENTAL_FACE_SKIPFRAME : zB ? com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_FACE_SKIPFRAME : zB2 ? com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_FACE_SKIPFRAME : zB3 ? com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_FACE_SKIPFRAME : zB4 ? com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FACE_SKIPFRAME : zB5 ? com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_FACE_SKIPFRAME : zB6 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_FACE_SKIPFRAME : zB7 ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_FACE_SKIPFRAME : zB8 ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_FACE_SKIPFRAME : null;
        m = a(12) ? ExperimentalKeys.EXPERIMENTAL_FACE_LANDMARK_COUNT : zB ? com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_FACE_LANDMARK_COUNT : zB2 ? com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_FACE_LANDMARK_COUNT : zB3 ? com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_FACE_LANDMARK_COUNT : zB4 ? com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FACE_LANDMARK_COUNT : zB5 ? com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_FACE_LANDMARK_COUNT : zB6 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_FACE_LANDMARK_COUNT : zB7 ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_FACE_LANDMARK_COUNT : zB8 ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_FACE_LANDMARK_COUNT : null;
        n = a(12) ? ExperimentalKeys.EXPERIMENTAL_FACE_LANDMARK_IDS : zB ? com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_FACE_LANDMARK_IDS : zB2 ? com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_FACE_LANDMARK_IDS : zB3 ? com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_FACE_LANDMARK_IDS : zB4 ? com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FACE_LANDMARK_IDS : zB5 ? com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_FACE_LANDMARK_IDS : zB6 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_FACE_LANDMARK_IDS : zB7 ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_FACE_LANDMARK_IDS : zB8 ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_FACE_LANDMARK_IDS : null;
        o = a(12) ? ExperimentalKeys.EXPERIMENTAL_FACE_LANDMARK_XY : zB ? com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_FACE_LANDMARK_XY : zB2 ? com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_FACE_LANDMARK_XY : zB3 ? com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_FACE_LANDMARK_XY : zB4 ? com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FACE_LANDMARK_XY : zB5 ? com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_FACE_LANDMARK_XY : zB6 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_FACE_LANDMARK_XY : zB7 ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_FACE_LANDMARK_XY : zB8 ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_FACE_LANDMARK_XY : null;
        p = a(12) ? ExperimentalKeys.EXPERIMENTAL_FACE_LANDMARK_DEPTH : zB ? com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_FACE_LANDMARK_DEPTH : zB2 ? com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_FACE_LANDMARK_DEPTH : zB3 ? com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_FACE_LANDMARK_DEPTH : zB4 ? com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FACE_LANDMARK_DEPTH : zB5 ? com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_FACE_LANDMARK_DEPTH : zB6 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_FACE_LANDMARK_DEPTH : zB7 ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_FACE_LANDMARK_DEPTH : zB8 ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_FACE_LANDMARK_DEPTH : null;
        q = a(12) ? ExperimentalKeys.EXPERIMENTAL_FACE_ORIENTATION : zB ? com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_FACE_ORIENTATION : zB2 ? com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_FACE_ORIENTATION : zB3 ? com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_FACE_ORIENTATION : zB4 ? com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FACE_ORIENTATION : zB5 ? com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_FACE_ORIENTATION : zB6 ? com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_FACE_ORIENTATION : zB7 ? com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_FACE_ORIENTATION : zB8 ? com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_FACE_ORIENTATION : null;
        r = a(11) ? ExperimentalKeys.EXPERIMENTAL_PD_BACK_CAL_INDEX : null;
        if (a(11)) {
            CaptureResult.Key key7 = ExperimentalKeys.EXPERIMENTAL_PD_BACK_CAL_DATA;
        }
        s = a(16) ? ExperimentalKeys.EXPERIMENTAL_BGSTATS_AWB_ENABLED : zB ? com.google.android.camera.experimental2019.ExperimentalKeys.REQUEST_BGSTATS_AWB_ENABLED : zB2 ? com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_BGSTATS_AWB_ENABLED : zB3 ? com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_BGSTATS_AWB_ENABLED : zB4 ? com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_BGSTATS_AWB_ENABLED : zB5 ? com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_BGSTATS_AWB_ENABLED : zB6 ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_BGSTATS_AWB_ENABLED : zB7 ? com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_BGSTATS_AWB_ENABLED : zB8 ? com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_BGSTATS_AWB_ENABLED : null;
        if (a(16)) {
            key = ExperimentalKeys.EXPERIMENTAL_BGSTATS_AWB;
        } else if (zB) {
            key = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_BGSTATS_AWB;
        } else if (zB2) {
            key = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_BGSTATS_AWB;
        } else if (zB3) {
            key = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_BGSTATS_AWB;
        } else if (zB4) {
            key = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_BGSTATS_AWB;
        } else if (zB5) {
            key = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_BGSTATS_AWB;
        } else if (zB6) {
            key = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_BGSTATS_AWB;
        } else if (zB7) {
            key = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_BGSTATS_AWB;
        } else if (zB8) {
            key = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_BGSTATS_AWB;
        }
        t = key;
        if (a(16)) {
            CaptureRequest.Key key8 = ExperimentalKeys.EXPERIMENTAL_BGSTATS_AE_ENABLED;
        } else if (zB) {
            CaptureRequest.Key key9 = com.google.android.camera.experimental2019.ExperimentalKeys.REQUEST_BGSTATS_AE_ENABLED;
        } else if (zB2) {
            CaptureRequest.Key key10 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_BGSTATS_AE_ENABLED;
        } else if (zB3) {
            CaptureRequest.Key key11 = com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_BGSTATS_AE_ENABLED;
        } else if (zB4) {
            CaptureRequest.Key key12 = com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_BGSTATS_AE_ENABLED;
        } else if (zB5) {
            CaptureRequest.Key key13 = com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_BGSTATS_AE_ENABLED;
        } else if (zB6) {
            CaptureRequest.Key key14 = com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_BGSTATS_AE_ENABLED;
        } else if (zB7) {
            CaptureRequest.Key key15 = com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_BGSTATS_AE_ENABLED;
        } else if (zB8) {
            CaptureRequest.Key key16 = com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_BGSTATS_AE_ENABLED;
        }
        if (a(16)) {
            CaptureResult.Key key17 = ExperimentalKeys.EXPERIMENTAL_BGSTATS_AE;
            return;
        }
        if (zB) {
            CaptureResult.Key key18 = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_BGSTATS_AE;
            return;
        }
        if (zB2) {
            CaptureResult.Key key19 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_BGSTATS_AE;
            return;
        }
        if (zB3) {
            CaptureResult.Key key20 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_BGSTATS_AE;
            return;
        }
        if (zB4) {
            CaptureResult.Key key21 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_BGSTATS_AE;
            return;
        }
        if (zB5) {
            CaptureResult.Key key22 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_BGSTATS_AE;
            return;
        }
        if (zB6) {
            CaptureResult.Key key23 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_BGSTATS_AE;
        } else if (zB7) {
            CaptureResult.Key key24 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_BGSTATS_AE;
        } else if (zB8) {
            CaptureResult.Key key25 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_BGSTATS_AE;
        }
    }

    private static boolean a(int i2) {
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
