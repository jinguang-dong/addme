package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface sz extends AutoCloseable, ri {
    Surface a();

    ta b();

    Integer d(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback);

    Integer e(List list, CameraCaptureSession.CaptureCallback captureCallback);

    Integer f(List list, CameraCaptureSession.CaptureCallback captureCallback);

    Integer g(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback);

    void h();

    void i(List list);

    void j();
}
