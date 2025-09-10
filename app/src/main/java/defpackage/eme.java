package defpackage;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.MediaRecorder;
import android.util.Range;
import android.util.Rational;
import androidx.wear.ambient.AmbientMode;
import java.util.Arrays;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eme extends enl {
    private static final eny x = new eny("AndCam2Capabs");

    public eme(CameraCharacteristics cameraCharacteristics) {
        super(new AmbientMode.AmbientCallback((char[]) null));
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        for (Range range : (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES)) {
            this.b.add(new int[]{((Integer) range.getLower()).intValue(), ((Integer) range.getUpper()).intValue()});
        }
        this.c.addAll(enx.c(Arrays.asList(streamConfigurationMap.getOutputSizes(SurfaceTexture.class))));
        for (int i : streamConfigurationMap.getOutputFormats()) {
            this.d.add(Integer.valueOf(i));
        }
        this.e.addAll(enx.c(Arrays.asList(streamConfigurationMap.getOutputSizes(MediaRecorder.class))));
        this.f.addAll(enx.c(Arrays.asList(streamConfigurationMap.getOutputSizes(256))));
        this.g.addAll(this.d);
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_SCENE_MODES);
        if (iArr != null) {
            for (int i2 : iArr) {
                enj enjVarB = b(i2);
                if (enjVarB != null) {
                    this.h.add(enjVarB);
                }
            }
        }
        this.i.add(enh.OFF);
        if (((Boolean) cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE)).booleanValue()) {
            this.i.add(enh.AUTO);
            this.i.add(enh.ON);
            this.i.add(enh.TORCH);
            for (int i3 : (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES)) {
                if (i3 == 4) {
                    this.i.add(enh.RED_EYE);
                }
            }
        }
        int[] iArr2 = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr2 != null) {
            for (int i4 : iArr2) {
                eni eniVarA = a(i4);
                if (eniVarA != null) {
                    this.j.add(eniVarA);
                }
            }
        }
        int[] iArr3 = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr3 != null) {
            for (int i5 : iArr3) {
                enk enkVarC = c(i5);
                if (enkVarC != null) {
                    this.k.add(enkVarC);
                }
            }
        }
        Range range2 = (Range) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
        this.n = ((Integer) range2.getLower()).intValue();
        this.o = ((Integer) range2.getUpper()).intValue();
        Rational rational = (Rational) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP);
        this.p = rational.getNumerator() / rational.getDenominator();
        this.q = ((Integer) cameraCharacteristics.get(CameraCharacteristics.STATISTICS_INFO_MAX_FACE_COUNT)).intValue();
        this.s = ((Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE)).intValue();
        this.t = ((Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue();
        if (f(eni.AUTO)) {
            int iIntValue = ((Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue();
            this.r = iIntValue;
            if (iIntValue > 0) {
                this.l.add(eng.FOCUS_AREA);
            }
        }
        if (this.s > 0) {
            this.l.add(eng.METERING_AREA);
        }
        if (this.t > 1.0f) {
            this.l.add(eng.ZOOM);
        }
    }

    public static eni a(int i) {
        if (i == 0) {
            return eni.FIXED;
        }
        if (i == 1) {
            return eni.AUTO;
        }
        if (i == 2) {
            return eni.MACRO;
        }
        if (i == 3) {
            return eni.CONTINUOUS_VIDEO;
        }
        if (i == 4) {
            return eni.b;
        }
        if (i == 5) {
            return eni.EXTENDED_DOF;
        }
        enz.c(x, a.bv(i, "Unable to convert from API 2 focus mode: "));
        return null;
    }

    public static enj b(int i) {
        switch (i) {
            case 0:
                return enj.AUTO;
            case 1:
            case 6:
            default:
                if (i == enw.a) {
                    return enj.HDR;
                }
                enz.c(x, a.bv(i, "Unable to convert from API 2 scene mode: "));
                return null;
            case 2:
                return enj.ACTION;
            case 3:
                return enj.PORTRAIT;
            case 4:
                return enj.LANDSCAPE;
            case 5:
                return enj.NIGHT;
            case 7:
                return enj.THEATRE;
            case 8:
                return enj.BEACH;
            case 9:
                return enj.SNOW;
            case 10:
                return enj.SUNSET;
            case 11:
                return enj.STEADYPHOTO;
            case 12:
                return enj.FIREWORKS;
            case 13:
                return enj.SPORTS;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return enj.PARTY;
            case 15:
                return enj.CANDLELIGHT;
            case 16:
                return enj.BARCODE;
        }
    }

    public static enk c(int i) {
        switch (i) {
            case 1:
                return enk.AUTO;
            case 2:
                return enk.INCANDESCENT;
            case 3:
                return enk.FLUORESCENT;
            case 4:
                return enk.WARM_FLUORESCENT;
            case 5:
                return enk.DAYLIGHT;
            case 6:
                return enk.CLOUDY_DAYLIGHT;
            case 7:
                return enk.TWILIGHT;
            case 8:
                return enk.SHADE;
            default:
                enz.c(x, a.bv(i, "Unable to convert from API 2 white balance: "));
                return null;
        }
    }
}
