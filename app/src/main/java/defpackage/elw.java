package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class elw extends CameraCaptureSession.CaptureCallback {
    final /* synthetic */ emc a;
    final /* synthetic */ emb b;
    private boolean c = false;

    public elw(emb embVar, emc emcVar) {
        this.b = embVar;
        this.a = emcVar;
    }

    private final void a(CaptureResult captureResult) {
        if (captureResult.get(CaptureResult.CONTROL_AE_STATE) == null || this.c) {
            return;
        }
        this.c = true;
        emb embVar = this.b;
        embVar.l = this.a;
        embVar.o.a(captureResult);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        a(totalCaptureResult);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        enz.a(emd.a, "Autoexposure and capture failed with reason " + captureFailure.getReason());
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        a(captureResult);
    }
}
