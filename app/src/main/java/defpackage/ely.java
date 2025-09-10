package defpackage;

import android.hardware.camera2.CameraCaptureSession;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ely extends CameraCaptureSession.StateCallback {
    final /* synthetic */ emb a;

    public ely(emb embVar) {
        this.a = embVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        emb embVar = this.a;
        enb enbVar = embVar.j;
        if (enbVar != null) {
            enbVar.a();
            embVar.j = null;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        enz.a(emd.a, "Failed to configure the camera for capture");
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        emb embVar = this.a;
        embVar.h = cameraCaptureSession;
        embVar.a(8);
    }
}
