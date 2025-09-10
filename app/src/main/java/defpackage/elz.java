package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class elz extends ema {
    public int a = -1;
    public long b = -1;
    public long c = -1;
    final /* synthetic */ emb d;

    public elz(emb embVar) {
        this.d = embVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    @Override // defpackage.ema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.hardware.camera2.CaptureResult r10) {
        /*
            r9 = this;
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AF_STATE
            java.lang.Object r0 = r10.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r1 = 4
            r2 = 2
            r3 = 0
            if (r0 == 0) goto L50
            int r0 = r0.intValue()
            long r4 = r10.getFrameNumber()
            long r6 = r9.b
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L50
            int r4 = r9.a
            r9.a = r0
            long r5 = r10.getFrameNumber()
            r9.b = r5
            r5 = 1
            if (r0 == r5) goto L45
            if (r0 == r2) goto L45
            if (r0 == r1) goto L33
            r6 = 5
            if (r0 == r6) goto L33
            r5 = 6
            if (r0 == r5) goto L45
            goto L50
        L33:
            emb r4 = r9.d
            emu r6 = r4.k
            if (r6 == 0) goto L50
            if (r0 != r1) goto L3c
            goto L3d
        L3c:
            r5 = 0
        L3d:
            elu r0 = r4.e
            r6.a(r5, r0)
            r4.k = r3
            goto L50
        L45:
            if (r0 == r4) goto L50
            emb r0 = r9.d
            emv r0 = r0.m
            if (r0 == 0) goto L50
            r0.a()
        L50:
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE
            java.lang.Object r0 = r10.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto Lb9
            int r4 = r0.intValue()
            long r5 = r10.getFrameNumber()
            long r7 = r9.c
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto Lb9
            emb r5 = r9.d
            int r0 = r0.intValue()
            r5.n = r0
            long r6 = r10.getFrameNumber()
            r9.c = r6
            if (r4 == r2) goto L7e
            r10 = 3
            if (r4 == r10) goto L7e
            if (r4 == r1) goto L7e
            goto Lb9
        L7e:
            emc r10 = r5.l
            if (r10 == 0) goto Lb9
            android.media.ImageReader r0 = r5.i
            r0.setOnImageAvailableListener(r10, r5)
            android.hardware.camera2.CameraCaptureSession r10 = r5.h     // Catch: java.lang.Throwable -> La5 android.hardware.camera2.CameraAccessException -> La7
            oyw r0 = r5.q     // Catch: java.lang.Throwable -> La5 android.hardware.camera2.CameraAccessException -> La7
            android.hardware.camera2.CameraDevice r1 = r5.d     // Catch: java.lang.Throwable -> La5 android.hardware.camera2.CameraAccessException -> La7
            android.media.ImageReader r4 = r5.i     // Catch: java.lang.Throwable -> La5 android.hardware.camera2.CameraAccessException -> La7
            android.view.Surface r4 = r4.getSurface()     // Catch: java.lang.Throwable -> La5 android.hardware.camera2.CameraAccessException -> La7
            android.view.Surface[] r4 = new android.view.Surface[]{r4}     // Catch: java.lang.Throwable -> La5 android.hardware.camera2.CameraAccessException -> La7
            android.hardware.camera2.CaptureRequest r0 = r0.e(r1, r2, r4)     // Catch: java.lang.Throwable -> La5 android.hardware.camera2.CameraAccessException -> La7
            emc r1 = r5.l     // Catch: java.lang.Throwable -> La5 android.hardware.camera2.CameraAccessException -> La7
            r10.capture(r0, r1, r5)     // Catch: java.lang.Throwable -> La5 android.hardware.camera2.CameraAccessException -> La7
            emb r9 = r9.d
            r9.l = r3
            return
        La5:
            r10 = move-exception
            goto Lb4
        La7:
            r10 = move-exception
            eny r0 = defpackage.emd.a     // Catch: java.lang.Throwable -> La5
            java.lang.String r1 = "Unable to initiate capture"
            defpackage.enz.b(r0, r1, r10)     // Catch: java.lang.Throwable -> La5
            emb r9 = r9.d
            r9.l = r3
            return
        Lb4:
            emb r9 = r9.d
            r9.l = r3
            throw r10
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.elz.a(android.hardware.camera2.CaptureResult):void");
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        a(totalCaptureResult);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        enz.a(emd.a, "Capture attempt failed with reason " + captureFailure.getReason());
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        a(captureResult);
    }
}
