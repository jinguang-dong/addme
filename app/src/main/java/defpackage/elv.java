package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import com.google.android.material.button.xlT.JvFFEwFNdCrxf;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class elv extends CameraCaptureSession.CaptureCallback {
    final /* synthetic */ emu a;
    final /* synthetic */ emb b;
    private boolean c = false;

    public elv(emb embVar, emu emuVar) {
        this.b = embVar;
        this.a = emuVar;
    }

    private final void a(CaptureResult captureResult) {
        if (captureResult.get(CaptureResult.CONTROL_AF_STATE) == null || this.c) {
            return;
        }
        this.c = true;
        emb embVar = this.b;
        embVar.k = this.a;
        embVar.o.a(captureResult);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        a(totalCaptureResult);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        a(captureResult);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        enz.a(emd.a, JvFFEwFNdCrxf.VDjfqitpVppTrg + captureFailure.getReason());
        this.a.a(false, this.b.e);
    }
}
