package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.os.Handler;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rs extends CameraCaptureSession.StateCallback {
    private final ta a;
    private final Handler b;
    private final umb c;
    private final umb d;
    private final tm e;
    private final byz f;

    public rs(ta taVar, tm tmVar, up upVar, byz byzVar, Handler handler) {
        handler.getClass();
        this.a = taVar;
        this.e = tmVar;
        this.f = byzVar;
        this.b = handler;
        umc umcVar = umc.a;
        this.c = new umb(upVar, umcVar);
        this.d = new umb(null, umcVar);
    }

    private final void a() {
        up upVar = (up) this.c.a(null);
        if (upVar != null) {
            upVar.g();
        }
    }

    private final void b() throws Exception {
        a();
        this.e.g();
    }

    private final sz c(CameraCaptureSession cameraCaptureSession, byz byzVar) {
        umb umbVar = this.d;
        sz szVar = (sz) umbVar.a;
        if (szVar != null) {
            return szVar;
        }
        sz rlVar = cameraCaptureSession instanceof CameraConstrainedHighSpeedCaptureSession ? new rl(this.a, (CameraConstrainedHighSpeedCaptureSession) cameraCaptureSession, byzVar, this.b) : new rk(this.a, cameraCaptureSession, byzVar, this.b);
        if (umbVar.d(null, rlVar)) {
            return rlVar;
        }
        Object obj = umbVar.a;
        obj.getClass();
        return (sz) obj;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.getClass();
        c(cameraCaptureSession, this.f);
        Objects.toString(this.e);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.getClass();
        c(cameraCaptureSession, this.f);
        Objects.toString(this.e);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(CameraCaptureSession cameraCaptureSession) throws Exception {
        cameraCaptureSession.getClass();
        c(cameraCaptureSession, this.f);
        this.e.j();
        b();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) throws Exception {
        cameraCaptureSession.getClass();
        c(cameraCaptureSession, this.f);
        this.e.k();
        b();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.getClass();
        this.e.e(c(cameraCaptureSession, this.f));
        a();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.getClass();
        c(cameraCaptureSession, this.f);
        Objects.toString(this.e);
    }
}
