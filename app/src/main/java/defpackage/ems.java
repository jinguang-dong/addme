package defpackage;

import android.hardware.Camera;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.imax.cyclops.audio.xcIh.cdVQ;
import com.google.android.apps.camera.rectiface.Iqz.mPfBwqXsnpXI;
import com.google.android.gms.analytics.EQvQ.UvOvSgfD;
import com.google.android.libraries.oliveoil.natives.TtaZ.VnmwoBe;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ems extends enl {
    private cbi x;
    private cbi y;

    public ems(Camera.Parameters parameters) {
        super(new AmbientMode.AmbientCallback((char[]) null));
        this.x = new cbi(6);
        this.y = new cbi(7);
        this.o = parameters.getMaxExposureCompensation();
        this.n = parameters.getMinExposureCompensation();
        this.p = parameters.getExposureCompensationStep();
        this.q = parameters.getMaxNumDetectedFaces();
        this.s = parameters.getMaxNumMeteringAreas();
        this.m = new enx(parameters.getPreferredPreviewSizeForVideo());
        this.d.addAll(parameters.getSupportedPreviewFormats());
        this.g.addAll(parameters.getSupportedPictureFormats());
        this.u = parameters.getHorizontalViewAngle();
        this.v = parameters.getVerticalViewAngle();
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        if (supportedPreviewFpsRange != null) {
            this.b.addAll(supportedPreviewFpsRange);
        }
        Collections.sort(this.b, this.x);
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        if (supportedPreviewSizes != null) {
            for (Camera.Size size : supportedPreviewSizes) {
                this.c.add(new enx(size.width, size.height));
            }
        }
        Collections.sort(this.c, this.y);
        List<Camera.Size> supportedVideoSizes = parameters.getSupportedVideoSizes();
        if (supportedVideoSizes != null) {
            for (Camera.Size size2 : supportedVideoSizes) {
                this.e.add(new enx(size2.width, size2.height));
            }
        }
        Collections.sort(this.e, this.y);
        List<Camera.Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
        if (supportedPictureSizes != null) {
            for (Camera.Size size3 : supportedPictureSizes) {
                this.f.add(new enx(size3.width, size3.height));
            }
        }
        Collections.sort(this.f, this.y);
        List<String> supportedSceneModes = parameters.getSupportedSceneModes();
        if (supportedSceneModes != null) {
            for (String str : supportedSceneModes) {
                if ("auto".equals(str)) {
                    this.h.add(enj.AUTO);
                } else if ("action".equals(str)) {
                    this.h.add(enj.ACTION);
                } else if ("barcode".equals(str)) {
                    this.h.add(enj.BARCODE);
                } else if ("beach".equals(str)) {
                    this.h.add(enj.BEACH);
                } else if ("candlelight".equals(str)) {
                    this.h.add(enj.CANDLELIGHT);
                } else if ("fireworks".equals(str)) {
                    this.h.add(enj.FIREWORKS);
                } else if ("hdr".equals(str)) {
                    this.h.add(enj.HDR);
                } else if ("landscape".equals(str)) {
                    this.h.add(enj.LANDSCAPE);
                } else if ("night".equals(str)) {
                    this.h.add(enj.NIGHT);
                } else if ("night-portrait".equals(str)) {
                    this.h.add(enj.NIGHT_PORTRAIT);
                } else if (VnmwoBe.CRQFcyqCbb.equals(str)) {
                    this.h.add(enj.PARTY);
                } else if ("portrait".equals(str)) {
                    this.h.add(enj.PORTRAIT);
                } else if ("snow".equals(str)) {
                    this.h.add(enj.SNOW);
                } else if ("sports".equals(str)) {
                    this.h.add(enj.SPORTS);
                } else if ("steadyphoto".equals(str)) {
                    this.h.add(enj.STEADYPHOTO);
                } else if ("sunset".equals(str)) {
                    this.h.add(enj.SUNSET);
                } else if ("theatre".equals(str)) {
                    this.h.add(enj.THEATRE);
                }
            }
        }
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        if (supportedFlashModes == null) {
            this.i.add(enh.NO_FLASH);
        } else {
            for (String str2 : supportedFlashModes) {
                if ("auto".equals(str2)) {
                    this.i.add(enh.AUTO);
                } else if ("off".equals(str2)) {
                    this.i.add(enh.OFF);
                } else if ("on".equals(str2)) {
                    this.i.add(enh.ON);
                } else if ("red-eye".equals(str2)) {
                    this.i.add(enh.RED_EYE);
                } else if ("torch".equals(str2)) {
                    this.i.add(enh.TORCH);
                }
            }
        }
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (supportedFocusModes != null) {
            for (String str3 : supportedFocusModes) {
                if ("auto".equals(str3)) {
                    this.j.add(eni.AUTO);
                } else if ("continuous-picture".equals(str3)) {
                    this.j.add(eni.b);
                } else if ("continuous-video".equals(str3)) {
                    this.j.add(eni.CONTINUOUS_VIDEO);
                } else if ("edof".equals(str3)) {
                    this.j.add(eni.EXTENDED_DOF);
                } else if ("fixed".equals(str3)) {
                    this.j.add(eni.FIXED);
                } else if ("infinity".equals(str3)) {
                    this.j.add(eni.INFINITY);
                } else if (cdVQ.xhOwJqlUHV.equals(str3)) {
                    this.j.add(eni.MACRO);
                }
            }
        }
        List<String> supportedFocusModes2 = parameters.getSupportedFocusModes();
        if (supportedFocusModes2 != null) {
            for (String str4 : supportedFocusModes2) {
                if ("auto".equals(str4)) {
                    this.k.add(enk.AUTO);
                } else if ("cloudy-daylight".equals(str4)) {
                    this.k.add(enk.CLOUDY_DAYLIGHT);
                } else if ("daylight".equals(str4)) {
                    this.k.add(enk.DAYLIGHT);
                } else if (mPfBwqXsnpXI.pNADwuMqeEk.equals(str4)) {
                    this.k.add(enk.FLUORESCENT);
                } else if ("incandescent".equals(str4)) {
                    this.k.add(enk.INCANDESCENT);
                } else if ("shade".equals(str4)) {
                    this.k.add(enk.SHADE);
                } else if ("twilight".equals(str4)) {
                    this.k.add(enk.TWILIGHT);
                } else if ("warm-fluorescent".equals(str4)) {
                    this.k.add(enk.WARM_FLUORESCENT);
                }
            }
        }
        if (parameters.isZoomSupported()) {
            this.t = parameters.getZoomRatios().get(parameters.getMaxZoom()).intValue() / 100.0f;
            this.l.add(eng.ZOOM);
        }
        if (parameters.isVideoSnapshotSupported()) {
            this.l.add(eng.VIDEO_SNAPSHOT);
        }
        if (parameters.isAutoExposureLockSupported()) {
            this.l.add(eng.AUTO_EXPOSURE_LOCK);
        }
        if (parameters.isAutoWhiteBalanceLockSupported()) {
            this.l.add(eng.AUTO_WHITE_BALANCE_LOCK);
        }
        if (f(eni.AUTO)) {
            int maxNumFocusAreas = parameters.getMaxNumFocusAreas();
            this.r = maxNumFocusAreas;
            if (maxNumFocusAreas > 0) {
                this.l.add(eng.FOCUS_AREA);
            }
        }
        if (this.s > 0) {
            this.l.add(eng.METERING_AREA);
        }
    }

    static {
        new eny(UvOvSgfD.SMussUicdi);
    }

    public ems(ems emsVar) {
        super(emsVar);
        this.x = new cbi(6);
        this.y = new cbi(7);
    }
}
