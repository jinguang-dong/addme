package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Range;
import android.util.Size;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class emf extends ens {
    public static final eny a = new eny("AndCam2Set");
    private final CaptureRequest.Builder A;
    private final Rect B;
    public final Rect b;
    public final oyw c;

    public emf(CameraDevice cameraDevice, Rect rect, enx enxVar, enx enxVar2) throws CameraAccessException {
        if (cameraDevice == null) {
            throw new NullPointerException("camera must not be null");
        }
        if (rect == null) {
            throw new NullPointerException("activeArray must not be null");
        }
        CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(1);
        this.A = builderCreateCaptureRequest;
        enh enhVar = null;
        this.c = new oyw((byte[]) null);
        this.B = rect;
        this.b = new Rect(0, 0, rect.width(), rect.height());
        this.g = false;
        Range range = (Range) builderCreateCaptureRequest.get(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE);
        if (range != null) {
            j(((Integer) range.getLower()).intValue(), ((Integer) range.getUpper()).intValue());
        }
        l(enxVar);
        k(enxVar2);
        this.n = ((Byte) m(CaptureRequest.JPEG_QUALITY, (byte) 0)).byteValue();
        this.p = 1.0f;
        this.q = ((Integer) m(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, 0)).intValue();
        Integer num = (Integer) builderCreateCaptureRequest.get(CaptureRequest.CONTROL_AE_MODE);
        if (num != null) {
            int iIntValue = num.intValue();
            if (iIntValue == 1) {
                enhVar = enh.OFF;
            } else if (iIntValue == 2) {
                enhVar = enh.AUTO;
            } else if (iIntValue == 3) {
                enhVar = ((Integer) builderCreateCaptureRequest.get(CaptureRequest.FLASH_MODE)).intValue() == 2 ? enh.TORCH : enh.ON;
            } else if (iIntValue == 4) {
                enhVar = enh.RED_EYE;
            }
        }
        this.r = enhVar;
        Integer num2 = (Integer) builderCreateCaptureRequest.get(CaptureRequest.CONTROL_AF_MODE);
        if (num2 != null) {
            this.s = eme.a(num2.intValue());
        }
        Integer num3 = (Integer) builderCreateCaptureRequest.get(CaptureRequest.CONTROL_SCENE_MODE);
        if (num3 != null) {
            this.t = eme.b(num3.intValue());
        }
        Integer num4 = (Integer) builderCreateCaptureRequest.get(CaptureRequest.CONTROL_AWB_MODE);
        if (num4 != null) {
            this.u = eme.c(num4.intValue());
        }
        this.v = ((Integer) m(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0)).intValue() == 1;
        this.w = ((Boolean) m(CaptureRequest.CONTROL_AE_LOCK, false)).booleanValue();
        this.x = ((Boolean) m(CaptureRequest.CONTROL_AWB_LOCK, false)).booleanValue();
        Size size = (Size) builderCreateCaptureRequest.get(CaptureRequest.JPEG_THUMBNAIL_SIZE);
        if (size != null) {
            this.z = new enx(size.getWidth(), size.getHeight());
        }
    }

    private final Object m(CaptureRequest.Key key, Object obj) {
        CaptureRequest.Builder builder = this.A;
        Object obj2 = builder.get(key);
        if (obj2 != null) {
            return obj2;
        }
        builder.set(key, obj);
        return obj;
    }

    private static final int n(double d, int i) {
        return (int) Math.min(Math.max(d, 0.0d), i);
    }

    @Override // defpackage.ens
    public final ens a() {
        return new emf(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.hardware.camera2.CaptureRequest.Key r6, java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.emf.b(android.hardware.camera2.CaptureRequest$Key, java.lang.Object):void");
    }

    public final MeteringRectangle[] c(List list) {
        if (list.size() <= 0) {
            return null;
        }
        MeteringRectangle[] meteringRectangleArr = new MeteringRectangle[list.size()];
        for (int i = 0; i < list.size(); i++) {
            Camera.Area area = (Camera.Area) list.get(i);
            Rect rect = area.rect;
            int i2 = rect.left + 1000;
            int i3 = rect.top + 1000;
            int i4 = rect.right + 1000;
            int i5 = rect.bottom + 1000;
            Rect rect2 = this.b;
            int iN = rect2.left + n(rect2.width() * (i2 / 2000.0d), rect2.width() - 1);
            int iN2 = rect2.top + n(rect2.height() * (i3 / 2000.0d), rect2.height() - 1);
            meteringRectangleArr[i] = new MeteringRectangle(iN, iN2, (rect2.left + n(rect2.width() * (i4 / 2000.0d), rect2.width() - 1)) - iN, (rect2.top + n(rect2.height() * (i5 / 2000.0d), rect2.height() - 1)) - iN2, area.weight);
        }
        return meteringRectangleArr;
    }

    @Override // defpackage.ens
    public final void d() {
        float f;
        float fHeight;
        this.p = 1.0f;
        Rect rect = this.B;
        int iN = n(rect.width() / this.p, rect.width());
        int iN2 = n(rect.height() / this.p, rect.height());
        Rect rect2 = this.b;
        rect2.set(0, 0, iN, iN2);
        rect2.offsetTo((rect.width() - rect2.width()) / 2, (rect.height() - rect2.height()) / 2);
        enx enxVar = this.k;
        float fB = enxVar.b() / enxVar.a();
        if (fB < rect2.width() / rect2.height()) {
            fHeight = rect2.height();
            f = fB * fHeight;
        } else {
            float fWidth = rect2.width();
            float f2 = fWidth / fB;
            f = fWidth;
            fHeight = f2;
        }
        Matrix matrix = new Matrix();
        RectF rectF = new RectF(0.0f, 0.0f, f, fHeight);
        matrix.setTranslate(rect2.exactCenterX(), rect2.exactCenterY());
        matrix.postTranslate(-rectF.centerX(), -rectF.centerY());
        matrix.mapRect(rectF);
        rectF.roundOut(new Rect());
    }

    public emf(emf emfVar) {
        super(emfVar);
        this.A = emfVar.A;
        this.c = new oyw(emfVar.c);
        this.B = emfVar.B;
        this.b = new Rect(emfVar.b);
    }
}
