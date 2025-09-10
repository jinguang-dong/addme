package defpackage;

import android.hardware.Camera;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class emi implements enn {
    private final Camera.CameraInfo[] a;
    private final int b;

    private emi(Camera.CameraInfo[] cameraInfoArr, int i) {
        this.a = cameraInfoArr;
        this.b = i;
    }

    public static emi c() {
        try {
            int numberOfCameras = Camera.getNumberOfCameras();
            Camera.CameraInfo[] cameraInfoArr = new Camera.CameraInfo[numberOfCameras];
            for (int i = 0; i < numberOfCameras; i++) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                cameraInfoArr[i] = cameraInfo;
                Camera.getCameraInfo(i, cameraInfo);
            }
            int i2 = -1;
            for (int i3 = numberOfCameras - 1; i3 >= 0; i3--) {
                if (cameraInfoArr[i3].facing == 0) {
                    i2 = i3;
                } else {
                    int i4 = cameraInfoArr[i3].facing;
                }
            }
            return new emi(cameraInfoArr, i2);
        } catch (RuntimeException e) {
            enz.b(emr.a, "Exception while creating CameraDeviceInfo", e);
            return null;
        }
    }

    @Override // defpackage.enn
    public final int a() {
        return this.b;
    }

    @Override // defpackage.enn
    public final enm b(int i) {
        Camera.CameraInfo cameraInfo = this.a[i];
        if (cameraInfo != null) {
            return new emh(cameraInfo);
        }
        return null;
    }
}
