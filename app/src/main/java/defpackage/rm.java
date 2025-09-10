package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rm implements ta {
    public final String a;
    private final CameraDevice b;
    private final uly c;
    private final umb d;
    private final sm e;
    private final qrh f;
    private final byz g;

    public rm(sm smVar, CameraDevice cameraDevice, String str, byz byzVar, qrh qrhVar) {
        smVar.getClass();
        str.getClass();
        byzVar.getClass();
        qrhVar.getClass();
        this.e = smVar;
        this.b = cameraDevice;
        this.a = str;
        this.g = byzVar;
        this.f = qrhVar;
        umc umcVar = umc.a;
        this.c = new uly(false, umcVar);
        this.d = new umb(null, umcVar);
    }

    private final uev n(up upVar) {
        if (!this.c.a()) {
            return new uev(true, this.d.a(upVar));
        }
        upVar.g();
        return new uev(false, null);
    }

    private final void o(up upVar) {
        toString();
        try {
            Trace.beginSection(toString().concat("#onSessionDisconnected"));
            upVar.f();
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.ta
    public final CaptureRequest.Builder a(int i) {
        CaptureRequest.Builder builderCreateCaptureRequest;
        String str = this.a;
        String strConcat = "CXCP#createCaptureRequest-".concat(str);
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(strConcat);
            byz byzVar = this.g;
            try {
                builderCreateCaptureRequest = this.b.createCaptureRequest(i);
            } catch (Exception e) {
                Log.w("CXCP", rj.e(e));
                if (e instanceof CameraAccessException) {
                    byzVar.s(str, e.c((CameraAccessException) e), true);
                } else {
                    if (!(e instanceof IllegalArgumentException) && !(e instanceof IllegalStateException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                        throw e;
                    }
                    byzVar.s(str, 9, false);
                }
                builderCreateCaptureRequest = null;
            }
            return builderCreateCaptureRequest;
        } finally {
            Trace.endSection();
            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf((SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos) / 1000000.0d)}, 1)).getClass();
        }
    }

    @Override // defpackage.ta
    public final CaptureRequest.Builder b(TotalCaptureResult totalCaptureResult) {
        CaptureRequest.Builder builderCreateReprocessCaptureRequest;
        String str = this.a;
        String strConcat = "CXCP#createReprocessCaptureRequest-".concat(str);
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(strConcat);
            byz byzVar = this.g;
            try {
                builderCreateReprocessCaptureRequest = this.b.createReprocessCaptureRequest(totalCaptureResult);
                builderCreateReprocessCaptureRequest.getClass();
            } catch (Exception e) {
                Log.w("CXCP", rj.e(e));
                if (e instanceof CameraAccessException) {
                    byzVar.s(str, e.c((CameraAccessException) e), true);
                } else {
                    if (!(e instanceof IllegalArgumentException) && !(e instanceof IllegalStateException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                        throw e;
                    }
                    byzVar.s(str, 9, false);
                }
                builderCreateReprocessCaptureRequest = null;
            }
            return builderCreateReprocessCaptureRequest;
        } finally {
            Trace.endSection();
            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf((SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos) / 1000000.0d)}, 1)).getClass();
        }
    }

    @Override // defpackage.ri
    public final Object c(ukx ukxVar) {
        int i = ukb.a;
        if (a.ao(ukxVar, new uji(CameraDevice.class))) {
            return this.b;
        }
        return null;
    }

    @Override // defpackage.ta
    public final String d() {
        return this.a;
    }

    @Override // defpackage.sc
    public final void e(int i) {
        try {
            Trace.beginSection("setCameraAudioRestriction");
            String str = this.a;
            byz byzVar = this.g;
            try {
                this.b.setCameraAudioRestriction(i);
            } catch (Exception e) {
                Log.w("CXCP", rj.e(e));
                if (e instanceof CameraAccessException) {
                    byzVar.s(str, e.c((CameraAccessException) e), true);
                } else {
                    if (!(e instanceof IllegalArgumentException) && !(e instanceof IllegalStateException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                        throw e;
                    }
                    byzVar.s(str, 9, false);
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.ta
    public final void f() {
        up upVar;
        if (!this.c.b() || (upVar = (up) this.d.a(null)) == null) {
            return;
        }
        upVar.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01fd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0200 A[RETURN] */
    @Override // defpackage.ta
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(defpackage.uo r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rm.g(uo):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d2 A[RETURN] */
    @Override // defpackage.ta
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(java.util.List r19, defpackage.tm r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rm.i(java.util.List, tm):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ff A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0100 A[RETURN] */
    @Override // defpackage.ta
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j(java.util.List r20, defpackage.tm r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rm.j(java.util.List, tm):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d2 A[RETURN] */
    @Override // defpackage.ta
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k(java.util.List r19, defpackage.tm r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rm.k(java.util.List, tm):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d4 A[RETURN] */
    @Override // defpackage.ta
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean l(android.hardware.camera2.params.InputConfiguration r19, java.util.List r20, defpackage.tm r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rm.l(android.hardware.camera2.params.InputConfiguration, java.util.List, tm):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010d A[RETURN] */
    @Override // defpackage.ta
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m(defpackage.tr r21, java.util.List r22, defpackage.tm r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rm.m(tr, java.util.List, tm):boolean");
    }

    public final String toString() {
        return "AndroidCameraDevice(camera=" + ((Object) pp.a(this.a)) + ')';
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0105 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0108 A[RETURN] */
    @Override // defpackage.ta
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(defpackage.tp r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rm.h(tp):boolean");
    }
}
