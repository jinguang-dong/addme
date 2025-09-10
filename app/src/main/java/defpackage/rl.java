package defpackage;

import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.os.Trace;
import android.util.Log;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rl extends rk implements sz {
    private final CameraConstrainedHighSpeedCaptureSession b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl(ta taVar, CameraConstrainedHighSpeedCaptureSession cameraConstrainedHighSpeedCaptureSession, byz byzVar, Handler handler) {
        super(taVar, cameraConstrainedHighSpeedCaptureSession, byzVar, handler);
        taVar.getClass();
        byzVar.getClass();
        handler.getClass();
        this.b = cameraConstrainedHighSpeedCaptureSession;
    }

    @Override // defpackage.rk, defpackage.ri
    public final Object c(ukx ukxVar) {
        int i = ukb.a;
        return a.ao(ukxVar, new uji(CameraConstrainedHighSpeedCaptureSession.class)) ? this.b : super.c(ukxVar);
    }

    public final List k(CaptureRequest captureRequest) {
        try {
            try {
                Trace.beginSection("CXCP#createHighSpeedRequestList");
                return this.b.createHighSpeedRequestList(captureRequest);
            } finally {
                Trace.endSection();
            }
        } catch (IllegalArgumentException unused) {
            Log.w("CXCP", "Failed to createHighSpeedRequestList from " + this.a + " because the output surface was destroyed before calling createHighSpeedRequestList.");
            return null;
        } catch (IllegalStateException unused2) {
            Log.w("CXCP", "Failed to createHighSpeedRequestList. " + this.a + " may be closed.");
            return null;
        } catch (UnsupportedOperationException unused3) {
            Log.w("CXCP", "Failed to createHighSpeedRequestList from " + this.a + " because the output surface was not available.");
            return null;
        }
    }
}
