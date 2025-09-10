package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.os.Handler;
import com.google.ar.core.SharedCamera;
import defpackage.rud;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rud extends CameraCaptureSession.StateCallback {
    public static final /* synthetic */ int d = 0;
    final /* synthetic */ Handler a;
    final /* synthetic */ CameraCaptureSession.StateCallback b;
    final /* synthetic */ SharedCamera c;

    public rud(SharedCamera sharedCamera, Handler handler, CameraCaptureSession.StateCallback stateCallback) {
        this.a = handler;
        this.b = stateCallback;
        this.c = sharedCamera;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(final CameraCaptureSession cameraCaptureSession) {
        final CameraCaptureSession.StateCallback stateCallback = this.b;
        this.a.post(new Runnable() { // from class: com.google.ar.core.SharedCamera$2$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                CameraCaptureSession.StateCallback stateCallback2 = stateCallback;
                CameraCaptureSession cameraCaptureSession2 = cameraCaptureSession;
                int i = rud.d;
                stateCallback2.onActive(cameraCaptureSession2);
            }
        });
        this.c.onCaptureSessionActive(cameraCaptureSession);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(final CameraCaptureSession cameraCaptureSession) {
        final CameraCaptureSession.StateCallback stateCallback = this.b;
        this.a.post(new Runnable() { // from class: com.google.ar.core.SharedCamera$2$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                CameraCaptureSession.StateCallback stateCallback2 = stateCallback;
                CameraCaptureSession cameraCaptureSession2 = cameraCaptureSession;
                int i = rud.d;
                stateCallback2.onClosed(cameraCaptureSession2);
            }
        });
        this.c.onCaptureSessionClosed(cameraCaptureSession);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(final CameraCaptureSession cameraCaptureSession) {
        final CameraCaptureSession.StateCallback stateCallback = this.b;
        this.a.post(new Runnable() { // from class: com.google.ar.core.SharedCamera$2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CameraCaptureSession.StateCallback stateCallback2 = stateCallback;
                CameraCaptureSession cameraCaptureSession2 = cameraCaptureSession;
                int i = rud.d;
                stateCallback2.onConfigureFailed(cameraCaptureSession2);
            }
        });
        this.c.onCaptureSessionConfigureFailed(cameraCaptureSession);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(final CameraCaptureSession cameraCaptureSession) {
        SharedCamera sharedCamera = this.c;
        rue unused = sharedCamera.sharedCameraInfo;
        final CameraCaptureSession.StateCallback stateCallback = this.b;
        this.a.post(new Runnable() { // from class: com.google.ar.core.SharedCamera$2$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                CameraCaptureSession.StateCallback stateCallback2 = stateCallback;
                CameraCaptureSession cameraCaptureSession2 = cameraCaptureSession;
                int i = rud.d;
                stateCallback2.onConfigured(cameraCaptureSession2);
            }
        });
        sharedCamera.onCaptureSessionConfigured(cameraCaptureSession);
        if (sharedCamera.sharedCameraInfo.a != null) {
            sharedCamera.setDummyListenerToAvoidImageBufferStarvation();
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(final CameraCaptureSession cameraCaptureSession) {
        final CameraCaptureSession.StateCallback stateCallback = this.b;
        this.a.post(new Runnable() { // from class: com.google.ar.core.SharedCamera$2$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                CameraCaptureSession.StateCallback stateCallback2 = stateCallback;
                CameraCaptureSession cameraCaptureSession2 = cameraCaptureSession;
                int i = rud.d;
                stateCallback2.onReady(cameraCaptureSession2);
            }
        });
        this.c.onCaptureSessionReady(cameraCaptureSession);
    }
}
