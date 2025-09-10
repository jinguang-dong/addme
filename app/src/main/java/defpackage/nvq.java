package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import com.google.android.camera.experimental2025.ExperimentalKeys;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nvq {
    public static final CaptureResult.Key A;
    public static final CaptureResult.Key B;
    public static final CaptureRequest.Key C;
    public static final CaptureResult.Key D;
    public static final CaptureResult.Key E;
    public static final CaptureRequest.Key F;
    public static final CaptureResult.Key G;
    private static final boolean H = nvr.b(13);
    public static final CaptureResult.Key a;
    public static final CaptureResult.Key b;
    public static final CaptureRequest.Key c;
    public static final CaptureResult.Key d;
    public static final CaptureResult.Key e;
    public static final CaptureResult.Key f;
    public static final CaptureResult.Key g;
    public static final CaptureRequest.Key h;
    public static final CaptureResult.Key i;
    public static final CaptureResult.Key j;
    public static final CaptureResult.Key k;
    public static final CaptureResult.Key l;
    public static final CaptureResult.Key m;
    public static final CaptureRequest.Key n;
    public static final CaptureResult.Key o;
    public static final CaptureResult.Key p;
    public static final CaptureResult.Key q;
    public static final CaptureResult.Key r;
    public static final CaptureResult.Key s;
    public static final CaptureResult.Key t;
    public static final CaptureResult.Key u;
    public static final CaptureResult.Key v;
    public static final CaptureResult.Key w;
    public static final CaptureRequest.Key x;
    public static final CaptureResult.Key y;
    public static final CaptureResult.Key z;

    static {
        if (a(5)) {
            CaptureResult.Key key = ExperimentalKeys.RESULT_TRUELIGHT_FACE_ID;
        }
        if (a(5)) {
            CaptureResult.Key key2 = ExperimentalKeys.RESULT_TRUELIGHT_MONK_SKIN_TONE;
        }
        a = a(7) ? ExperimentalKeys.RESULT_AE_DEBUG_SALIENCY_HEAT_MAP : null;
        if (a(7)) {
            CaptureResult.Key key3 = ExperimentalKeys.RESULT_AE_DEBUG_BGFG_SEGMENTATION_MASK;
        }
        b = a(19) ? ExperimentalKeys.RESULT_AE_SALIENCY_CROPPED_REGION : null;
        c = a(8) ? ExperimentalKeys.REQUEST_POST_PROC_ZOOM_TARGET_ZOOM_RATIO : null;
        d = a(8) ? ExperimentalKeys.RESULT_POST_PROC_ZOOM_TARGET_ZOOM_RATIO : null;
        if (a(10)) {
            CameraCharacteristics.Key key4 = ExperimentalKeys.CHARACTERISTICS_BASE_ISO;
        }
        e = (!ojl.aH() && a(11)) ? ExperimentalKeys.RESULT_PD_PHOTO_DEBUG_BLOB : null;
        f = (!ojl.aH() && a(11)) ? ExperimentalKeys.RESULT_PD_VIDEO_DEBUG_BLOB : null;
        g = (!ojl.aH() && a(11)) ? ExperimentalKeys.RESULT_PD_VIDEO_EXTENDED_DEBUG_BLOB : null;
        h = a(12) ? ExperimentalKeys.REQUEST_FREESIA_ENABLED : null;
        i = a(12) ? ExperimentalKeys.RESULT_FREESIA_ENABLED : null;
        j = a(12) ? ExperimentalKeys.RESULT_FREESIA_IDS : null;
        k = a(12) ? ExperimentalKeys.RESULT_FREESIA_GAINS : null;
        l = a(12) ? ExperimentalKeys.RESULT_FREESIA_CCMS : null;
        if (a(13)) {
            CaptureResult.Key key5 = ExperimentalKeys.RESULT_FACE_AUTH_ISP_TUNING_VERSION;
        }
        m = a(14) ? ExperimentalKeys.RESULT_ZINNIA_DATA : null;
        n = a(15) ? ExperimentalKeys.REQUEST_STELLA_ENABLED : null;
        o = a(15) ? ExperimentalKeys.RESULT_STELLA_ENABLED : null;
        p = a(16) ? ExperimentalKeys.RESULT_AWB_CCM_TUNING_TRUST_LEVEL_ENABLED : null;
        if (a(17)) {
            CameraCharacteristics.Key key6 = ExperimentalKeys.CHARACTERISTICS_EXTENDED_FACE_AVAILABLE_TYPES;
        }
        q = a(17) ? ExperimentalKeys.RESULT_EXTENDED_FACE_RECTANGLES : null;
        r = a(17) ? ExperimentalKeys.RESULT_EXTENDED_FACE_COUNT : null;
        s = a(17) ? ExperimentalKeys.RESULT_EXTENDED_FACE_IDS : null;
        t = a(17) ? ExperimentalKeys.RESULT_EXTENDED_FACE_IS_BOH : null;
        u = a(17) ? ExperimentalKeys.RESULT_EXTENDED_FACE_TYPES : null;
        v = a(17) ? ExperimentalKeys.RESULT_EXTENDED_FACE_SCORES : null;
        w = a(18) ? ExperimentalKeys.RESULT_EIS_CROP_ROI_FROM_TRACKED_POINT : null;
        x = a(20) ? ExperimentalKeys.REQUEST_ACTUATOR_READOUTS_ENABLED : null;
        y = a(20) ? ExperimentalKeys.RESULT_ACTUATOR_READOUTS_ENABLED : null;
        z = a(20) ? ExperimentalKeys.RESULT_ACTUATOR_READOUTS_TIMESTAMPS : null;
        A = a(20) ? ExperimentalKeys.RESULT_ACTUATOR_READOUTS_DAC : null;
        B = a(20) ? ExperimentalKeys.RESULT_ACTUATOR_READOUTS_DIOPTERS : null;
        C = a(21) ? ExperimentalKeys.REQUEST_PEONY_ENABLED : null;
        D = a(21) ? ExperimentalKeys.RESULT_PEONY_ENABLED : null;
        E = a(21) ? ExperimentalKeys.RESULT_PEONY_DATA : null;
        if (a(22)) {
            CaptureResult.Key key7 = ExperimentalKeys.RESULT_SENSOR_BINNING_FACTOR;
        }
        F = a(23) ? ExperimentalKeys.REQUEST_LONG_AE_BRIGHTNESS_BIAS : null;
        G = a(23) ? ExperimentalKeys.RESULT_LONG_AE_BRIGHTNESS_BIAS : null;
    }

    public static boolean a(int i2) {
        if (H) {
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
