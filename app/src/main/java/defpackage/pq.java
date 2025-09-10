package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pq {
    private final CameraDevice.StateCallback a = null;
    private final CameraCaptureSession.StateCallback b = null;
    private final uz c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pq)) {
            return false;
        }
        pq pqVar = (pq) obj;
        CameraDevice.StateCallback stateCallback = pqVar.a;
        if (!a.ao(null, null)) {
            return false;
        }
        CameraCaptureSession.StateCallback stateCallback2 = pqVar.b;
        if (!a.ao(null, null)) {
            return false;
        }
        uz uzVar = pqVar.c;
        return a.ao(null, null);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "CameraInteropConfig(cameraDeviceStateCallback=null, cameraSessionStateCallback=null, cameraOpenRetryMaxTimeoutNs=null)";
    }
}
