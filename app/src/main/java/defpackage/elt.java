package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class elt implements enn {
    private final CameraManager a;
    private final String[] b;
    private final int c;

    public elt(CameraManager cameraManager, String[] strArr) {
        this.a = cameraManager;
        this.b = strArr;
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < strArr.length; i3++) {
            try {
                int iIntValue = ((Integer) cameraManager.getCameraCharacteristics(strArr[i3]).get(CameraCharacteristics.LENS_FACING)).intValue();
                if (i == -1) {
                    if (iIntValue == 1) {
                        iIntValue = 1;
                        i = i3;
                    } else {
                        i = -1;
                    }
                }
                if (i2 == -1) {
                    i2 = iIntValue == 0 ? i3 : -1;
                }
            } catch (CameraAccessException e) {
                enz.d(emd.a, a.bE(i3, "Couldn't get characteristics of camera '", "'"), e);
            }
        }
        this.c = i;
    }

    @Override // defpackage.enn
    public final int a() {
        return this.c;
    }

    @Override // defpackage.enn
    public final enm b(int i) {
        try {
            return new els(this.a.getCameraCharacteristics(this.b[i]));
        } catch (CameraAccessException unused) {
            return null;
        }
    }
}
