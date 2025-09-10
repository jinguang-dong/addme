package defpackage;

import android.hardware.Camera;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.ui.gridlines.gBW.mNLbzhCxd;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class emt extends ens {
    private static final eny a = new eny("AndCamSet");

    public emt(emt emtVar) {
        super(emtVar);
    }

    @Override // defpackage.ens
    public final ens a() {
        return new emt(this);
    }

    public emt(enl enlVar, Camera.Parameters parameters) {
        enh enhVar;
        eni eniVar;
        enj enjVar;
        if (parameters == null) {
            enz.c(a, mNLbzhCxd.bnkhNnPNzuQ);
            return;
        }
        AmbientMode.AmbientCallback ambientCallback = enlVar.w;
        this.g = false;
        Camera.Size previewSize = parameters.getPreviewSize();
        l(new enx(previewSize.width, previewSize.height));
        int previewFrameRate = parameters.getPreviewFrameRate();
        if (previewFrameRate > 0) {
            this.j = previewFrameRate;
            this.i = previewFrameRate;
            this.h = previewFrameRate;
        }
        int[] iArr = new int[2];
        parameters.getPreviewFpsRange(iArr);
        j(iArr[0], iArr[1]);
        this.l = parameters.getPreviewFormat();
        if (enlVar.d(eng.ZOOM)) {
            this.p = parameters.getZoomRatios().get(parameters.getZoom()).intValue() / 100.0f;
        } else {
            this.p = 1.0f;
        }
        this.q = parameters.getExposureCompensation();
        String flashMode = parameters.getFlashMode();
        if (flashMode == null) {
            enhVar = enh.values()[0];
        } else {
            try {
                enhVar = (enh) Enum.valueOf(enh.class, AmbientMode.AmbientCallback.s(flashMode));
            } catch (IllegalArgumentException unused) {
                enhVar = enh.values()[0];
            }
        }
        this.r = enhVar;
        String focusMode = parameters.getFocusMode();
        if (focusMode == null) {
            eniVar = eni.values()[0];
        } else {
            try {
                eniVar = (eni) Enum.valueOf(eni.class, AmbientMode.AmbientCallback.s(focusMode));
            } catch (IllegalArgumentException unused2) {
                eniVar = eni.values()[0];
            }
        }
        this.s = eniVar;
        String sceneMode = parameters.getSceneMode();
        if (sceneMode == null) {
            enjVar = enj.values()[0];
        } else {
            try {
                enjVar = (enj) Enum.valueOf(enj.class, AmbientMode.AmbientCallback.s(sceneMode));
            } catch (IllegalArgumentException unused3) {
                enjVar = enj.values()[0];
            }
        }
        this.t = enjVar;
        enlVar.d(eng.VIDEO_STABILIZATION);
        this.y = "true".equals(parameters.get("recording-hint"));
        i(parameters.getJpegQuality());
        Camera.Size pictureSize = parameters.getPictureSize();
        k(new enx(pictureSize.width, pictureSize.height));
        this.o = parameters.getPictureFormat();
    }
}
