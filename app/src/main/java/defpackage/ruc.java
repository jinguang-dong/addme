package defpackage;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import com.google.ar.core.SharedCamera;
import defpackage.ruc;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ruc extends CameraDevice.StateCallback {
    public static final /* synthetic */ int d = 0;
    final /* synthetic */ Handler a;
    final /* synthetic */ CameraDevice.StateCallback b;
    final /* synthetic */ SharedCamera c;

    public ruc(SharedCamera sharedCamera, Handler handler, CameraDevice.StateCallback stateCallback) {
        this.a = handler;
        this.b = stateCallback;
        this.c = sharedCamera;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(final CameraDevice cameraDevice) {
        final CameraDevice.StateCallback stateCallback = this.b;
        this.a.post(new Runnable() { // from class: com.google.ar.core.SharedCamera$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CameraDevice.StateCallback stateCallback2 = stateCallback;
                CameraDevice cameraDevice2 = cameraDevice;
                int i = ruc.d;
                stateCallback2.onClosed(cameraDevice2);
            }
        });
        this.c.onDeviceClosed(cameraDevice);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(final CameraDevice cameraDevice) {
        final CameraDevice.StateCallback stateCallback = this.b;
        this.a.post(new Runnable() { // from class: com.google.ar.core.SharedCamera$1$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                CameraDevice.StateCallback stateCallback2 = stateCallback;
                CameraDevice cameraDevice2 = cameraDevice;
                int i = ruc.d;
                stateCallback2.onDisconnected(cameraDevice2);
            }
        });
        this.c.onDeviceDisconnected(cameraDevice);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(final CameraDevice cameraDevice, final int i) {
        final CameraDevice.StateCallback stateCallback = this.b;
        this.a.post(new Runnable() { // from class: com.google.ar.core.SharedCamera$1$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                CameraDevice.StateCallback stateCallback2 = stateCallback;
                CameraDevice cameraDevice2 = cameraDevice;
                int i2 = i;
                int i3 = ruc.d;
                stateCallback2.onError(cameraDevice2, i2);
            }
        });
        this.c.close();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(final CameraDevice cameraDevice) {
        SharedCamera sharedCamera = this.c;
        sharedCamera.sharedCameraInfo.a = cameraDevice;
        final CameraDevice.StateCallback stateCallback = this.b;
        this.a.post(new Runnable() { // from class: com.google.ar.core.SharedCamera$1$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                CameraDevice.StateCallback stateCallback2 = stateCallback;
                CameraDevice cameraDevice2 = cameraDevice;
                int i = ruc.d;
                stateCallback2.onOpened(cameraDevice2);
            }
        });
        sharedCamera.onDeviceOpened(cameraDevice);
        sharedCamera.sharedCameraInfo.c = sharedCamera.getGpuSurfaceTexture();
        sharedCamera.sharedCameraInfo.d = sharedCamera.getGpuSurface();
    }
}
