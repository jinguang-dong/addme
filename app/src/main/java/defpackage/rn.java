package defpackage;

import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Trace;
import java.util.List;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rn extends CameraExtensionSession.ExtensionCaptureCallback {
    final /* synthetic */ ro a;
    private final Queue b;
    private final sq c;

    public rn(ro roVar, sq sqVar, Queue queue) {
        this.a = roVar;
        this.c = sqVar;
        this.b = queue;
    }

    @Override // android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback
    public final void onCaptureFailed(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest) {
        cameraExtensionSession.getClass();
        captureRequest.getClass();
        Long l = (Long) this.b.remove();
        l.getClass();
        long jLongValue = l.longValue();
        Trace.beginSection("onCaptureFailed");
        sq sqVar = this.c;
        sqVar.f.O(ufg.a);
        sy syVarF = sqVar.f(captureRequest);
        sqVar.g(syVarF, jLongValue, new to(syVarF, jLongValue));
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback
    public final void onCaptureProcessProgressed(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest, int i) {
        cameraExtensionSession.getClass();
        captureRequest.getClass();
        Trace.beginSection("onCaptureProcessProgressed");
        sq sqVar = this.c;
        sy syVarF = sqVar.f(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = sqVar.d;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ra) list.get(i2)).j(syVarF);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = syVarF.a().c.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((ra) syVarF.a().c.get(i3)).j(syVarF);
        }
        Trace.endSection();
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback
    public final void onCaptureProcessStarted(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest) {
        cameraExtensionSession.getClass();
        captureRequest.getClass();
    }

    @Override // android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback
    public final void onCaptureResultAvailable(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        cameraExtensionSession.getClass();
        captureRequest.getClass();
        totalCaptureResult.getClass();
        Long l = (Long) this.b.remove();
        l.getClass();
        this.c.b(captureRequest, totalCaptureResult, l.longValue());
    }

    @Override // android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback
    public final void onCaptureSequenceAborted(CameraExtensionSession cameraExtensionSession, int i) {
        cameraExtensionSession.getClass();
        this.c.c(i);
    }

    @Override // android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback
    public final void onCaptureSequenceCompleted(CameraExtensionSession cameraExtensionSession, int i) {
        cameraExtensionSession.getClass();
        Long l = (Long) this.a.b.get(cameraExtensionSession);
        l.getClass();
        this.c.d(i, l.longValue());
    }

    @Override // android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback
    public final void onCaptureStarted(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest, long j) {
        cameraExtensionSession.getClass();
        captureRequest.getClass();
        ro roVar = this.a;
        long jC = roVar.a.c();
        Long lValueOf = Long.valueOf(jC);
        roVar.b.put(cameraExtensionSession, lValueOf);
        this.b.add(lValueOf);
        this.c.e(captureRequest, jC, j);
    }
}
