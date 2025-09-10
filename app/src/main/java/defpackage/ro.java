package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CaptureRequest;
import android.util.Log;
import android.view.Surface;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ro implements AutoCloseable, sz, ri {
    public final uma a;
    public final Map b;
    private final ta c;
    private final CameraExtensionSession d;
    private final Executor e;
    private final byz f;

    public ro(ta taVar, CameraExtensionSession cameraExtensionSession, byz byzVar, Executor executor) {
        taVar.getClass();
        byzVar.getClass();
        executor.getClass();
        this.c = taVar;
        this.d = cameraExtensionSession;
        this.f = byzVar;
        this.e = executor;
        this.a = new uma(0L, umc.a);
        this.b = new HashMap();
    }

    @Override // defpackage.sz
    public final Surface a() {
        return null;
    }

    @Override // defpackage.sz
    public final ta b() {
        return this.c;
    }

    @Override // defpackage.ri
    public final Object c(ukx ukxVar) {
        int i = ukb.a;
        if (a.ao(ukxVar, new uji(CameraExtensionSession.class))) {
            return this.d;
        }
        return null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws CameraAccessException {
        this.d.close();
    }

    @Override // defpackage.sz
    public final Integer d(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws Exception {
        captureRequest.getClass();
        try {
            return Integer.valueOf(this.d.capture(captureRequest, this.e, new rn(this, (sq) captureCallback, new LinkedList())));
        } catch (Exception e) {
            ta taVar = this.c;
            byz byzVar = this.f;
            Log.w("CXCP", "Unexpected error: ".concat(String.valueOf(e.getMessage())));
            boolean z = e instanceof CameraAccessException;
            String str = ((rm) taVar).a;
            if (z) {
                byzVar.s(str, e.c((CameraAccessException) e), true);
                return null;
            }
            if (!(e instanceof IllegalArgumentException) && !(e instanceof IllegalStateException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                throw e;
            }
            byzVar.s(str, 9, false);
            return null;
        }
    }

    @Override // defpackage.sz
    public final Integer e(List list, CameraCaptureSession.CaptureCallback captureCallback) throws Exception {
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d((CaptureRequest) it.next(), captureCallback);
        }
        return null;
    }

    @Override // defpackage.sz
    public final Integer f(List list, CameraCaptureSession.CaptureCallback captureCallback) {
        list.getClass();
        if (list.size() == 1) {
            return g((CaptureRequest) ske.bH(list), captureCallback);
        }
        throw new IllegalStateException("CameraExtensionSession does not support setRepeatingBurst for more than oneCaptureRequest");
    }

    @Override // defpackage.sz
    public final Integer g(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws Exception {
        captureRequest.getClass();
        try {
            return Integer.valueOf(this.d.setRepeatingRequest(captureRequest, this.e, new rn(this, (sq) captureCallback, new LinkedList())));
        } catch (Exception e) {
            ta taVar = this.c;
            byz byzVar = this.f;
            Log.w("CXCP", "Unexpected error: ".concat(String.valueOf(e.getMessage())));
            boolean z = e instanceof CameraAccessException;
            String str = ((rm) taVar).a;
            if (z) {
                byzVar.s(str, e.c((CameraAccessException) e), true);
                return null;
            }
            if (!(e instanceof IllegalArgumentException) && !(e instanceof IllegalStateException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                throw e;
            }
            byzVar.s(str, 9, false);
            return null;
        }
    }

    @Override // defpackage.sz
    public final void i(List list) {
        Log.w("CXCP", "CameraExtensionSession does not support finalizeOutputConfigurations()");
    }

    @Override // defpackage.sz
    public final void j() throws Exception {
        try {
            this.d.stopRepeating();
        } catch (Exception e) {
            ta taVar = this.c;
            byz byzVar = this.f;
            Log.w("CXCP", "Unexpected error: ".concat(String.valueOf(e.getMessage())));
            boolean z = e instanceof CameraAccessException;
            String str = ((rm) taVar).a;
            if (z) {
                byzVar.s(str, e.c((CameraAccessException) e), true);
                return;
            }
            if (!(e instanceof IllegalArgumentException) && !(e instanceof IllegalStateException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                throw e;
            }
            byzVar.s(str, 9, false);
        }
    }

    @Override // defpackage.sz
    public final void h() {
    }
}
