package defpackage;

import com.google.ar.core.ImageFormat;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum ssc implements tpk {
    UNKNOWN_MODE(0),
    PHOTO_CAPTURE(1),
    FILMSTRIP(2),
    PHOTO_SPHERE(5),
    LENS_BLUR(6),
    HDR_PLUS(7),
    VIDEO_CAPTURE(8),
    VIDEO_STILL(9),
    TIMELAPSE(10),
    PANORAMA(11),
    SETTINGS(12),
    GALLERY(13),
    PHOTO_SPHERE_VIEWER(14),
    LENS_BLUR_VIEWER(15),
    SMART_BURST(17),
    SMART_BURST_ARTIFACT(18),
    PHOTO_CAPTURE_INTENT(19),
    VIDEO_CAPTURE_INTENT(20),
    PORTRAIT(21),
    IMAX_PANO(22),
    SLOW_MOTION(23),
    ORNAMENT(24),
    LENS(25),
    PHOTOBOOTH(26),
    MORE_MODES(27),
    LONG_EXPOSURE(28),
    WIDE_ANGLE(29),
    MEASURE(30),
    C(31),
    SLOW_MOTION_STILL(32),
    TIMELAPSE_STILL(33),
    VIDEO_SNAPSHOT(34),
    MOTION_BLUR(35),
    VIDEO_PORTRAIT(36),
    VIDEO_PORTRAIT_STILL(37),
    TAXI(38),
    CINEMATIC_PAN(39),
    CINEMATIC_PAN_STILL(40),
    MOTION_LANDSCAPE(41),
    MOTION_ACTION_PAN(42),
    NIGHT_SIGHT(43),
    SERENGETI(44),
    COTTAGE(45),
    VEGA(46),
    VEGA_STILL(47);

    public final int T;

    ssc(int i) {
        this.T = i;
    }

    public static ssc b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_MODE;
            case 1:
                return PHOTO_CAPTURE;
            case 2:
                return FILMSTRIP;
            case 3:
            case 4:
            case 16:
            default:
                return null;
            case 5:
                return PHOTO_SPHERE;
            case 6:
                return LENS_BLUR;
            case 7:
                return HDR_PLUS;
            case 8:
                return VIDEO_CAPTURE;
            case 9:
                return VIDEO_STILL;
            case 10:
                return TIMELAPSE;
            case 11:
                return PANORAMA;
            case 12:
                return SETTINGS;
            case 13:
                return GALLERY;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return PHOTO_SPHERE_VIEWER;
            case 15:
                return LENS_BLUR_VIEWER;
            case 17:
                return SMART_BURST;
            case 18:
                return SMART_BURST_ARTIFACT;
            case 19:
                return PHOTO_CAPTURE_INTENT;
            case 20:
                return VIDEO_CAPTURE_INTENT;
            case 21:
                return PORTRAIT;
            case ImageFormat.RGBA_FP16 /* 22 */:
                return IMAX_PANO;
            case 23:
                return SLOW_MOTION;
            case 24:
                return ORNAMENT;
            case 25:
                return LENS;
            case 26:
                return PHOTOBOOTH;
            case 27:
                return MORE_MODES;
            case 28:
                return LONG_EXPOSURE;
            case 29:
                return WIDE_ANGLE;
            case 30:
                return MEASURE;
            case 31:
                return C;
            case 32:
                return SLOW_MOTION_STILL;
            case 33:
                return TIMELAPSE_STILL;
            case 34:
                return VIDEO_SNAPSHOT;
            case ImageFormat.YUV_420_888 /* 35 */:
                return MOTION_BLUR;
            case 36:
                return VIDEO_PORTRAIT;
            case 37:
                return VIDEO_PORTRAIT_STILL;
            case 38:
                return TAXI;
            case 39:
                return CINEMATIC_PAN;
            case 40:
                return CINEMATIC_PAN_STILL;
            case 41:
                return MOTION_LANDSCAPE;
            case 42:
                return MOTION_ACTION_PAN;
            case 43:
                return NIGHT_SIGHT;
            case 44:
                return SERENGETI;
            case 45:
                return COTTAGE;
            case 46:
                return VEGA;
            case 47:
                return VEGA_STILL;
        }
    }

    @Override // defpackage.tpk
    public final int a() {
        return this.T;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.T);
    }
}
