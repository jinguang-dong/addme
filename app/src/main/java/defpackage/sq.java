package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Trace;
import android.view.Surface;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sq extends CameraCaptureSession.CaptureCallback {
    public final boolean a;
    public final List b;
    public final List c;
    public final List d;
    public volatile Integer e;
    private final String g;
    private final Map h;
    private final rnu j;
    private final long i = ss.b.c();
    public final umr f = new umr();

    public sq(String str, boolean z, List list, List list2, List list3, rnu rnuVar, Map map) {
        this.g = str;
        this.a = z;
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.j = rnuVar;
        this.h = map;
        if (list.size() != list2.size()) {
            throw new IllegalStateException("CaptureRequestList and CaptureMetadataList must have a 1:1 mapping.");
        }
    }

    public final int a() {
        int iIntValue;
        if (this.e != null) {
            Integer num = this.e;
            if (num != null) {
                return num.intValue();
            }
            throw new IllegalStateException("SequenceNumber has not been set for " + this + '!');
        }
        synchronized (this) {
            Integer num2 = this.e;
            if (num2 == null) {
                throw new IllegalStateException("SequenceNumber has not been set for " + this + '!');
            }
            iIntValue = num2.intValue();
        }
        return iIntValue;
    }

    public final void b(CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult, long j) {
        Trace.beginSection("onCaptureCompleted");
        Trace.beginSection("onCaptureSequenceComplete");
        this.j.q(this);
        Trace.endSection();
        String str = this.g;
        sy syVarF = f(captureRequest);
        rv rvVar = new rv(totalCaptureResult, str, syVarF);
        Trace.beginSection("onTotalCaptureResult");
        Trace.beginSection("InvokeInternalListeners");
        List list = this.d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((ra) list.get(i)).m(syVarF);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = syVarF.a().c.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((ra) syVarF.a().c.get(i2)).m(syVarF);
        }
        Trace.endSection();
        Trace.endSection();
        Trace.beginSection("onComplete");
        Trace.beginSection("InvokeInternalListeners");
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            ((ra) list.get(i3)).c(syVarF, j, rvVar);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size4 = syVarF.a().c.size();
        for (int i4 = 0; i4 < size4; i4++) {
            ((ra) syVarF.a().c.get(i4)).c(syVarF, j, rvVar);
        }
        Trace.endSection();
        Trace.endSection();
        Trace.endSection();
    }

    public final void c(int i) {
        Trace.beginSection("onCaptureSequenceAborted");
        this.f.O(ufg.a);
        this.j.q(this);
        if (a() != i) {
            throw new IllegalStateException("onCaptureSequenceAborted was invoked on " + a() + ", but expected " + i + '!');
        }
        Trace.beginSection("InvokeInternalListeners");
        List list = this.c;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            sy syVar = (sy) list.get(i2);
            List list2 = this.d;
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((ra) list2.get(i3)).e(syVar);
            }
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size3 = list.size();
        for (int i4 = 0; i4 < size3; i4++) {
            sy syVar2 = (sy) list.get(i4);
            int size4 = syVar2.a().c.size();
            for (int i5 = 0; i5 < size4; i5++) {
                ((ra) syVar2.a().c.get(i5)).e(syVar2);
            }
        }
        Trace.endSection();
        Trace.endSection();
    }

    public final void d(int i, long j) {
        Trace.beginSection("onCaptureSequenceCompleted");
        this.f.O(ufg.a);
        this.j.q(this);
        if (a() != i) {
            throw new IllegalStateException("onCaptureSequenceCompleted was invoked on " + a() + ", but expected " + i + '!');
        }
        Trace.beginSection("InvokeInternalListeners");
        List list = this.c;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            sy syVar = (sy) list.get(i2);
            List list2 = this.d;
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((ra) list2.get(i3)).f(syVar, j);
            }
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size3 = list.size();
        for (int i4 = 0; i4 < size3; i4++) {
            sy syVar2 = (sy) list.get(i4);
            int size4 = syVar2.a().c.size();
            for (int i5 = 0; i5 < size4; i5++) {
                ((ra) syVar2.a().c.get(i5)).f(syVar2, j);
            }
        }
        Trace.endSection();
        Trace.endSection();
    }

    public final void e(CaptureRequest captureRequest, long j, long j2) {
        Trace.beginSection("onCaptureStarted");
        this.f.O(ufg.a);
        sy syVarF = f(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((ra) list.get(i)).i(syVarF, j, j2);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = syVarF.a().c.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((ra) syVarF.a().c.get(i2)).i(syVarF, j, j2);
        }
        Trace.endSection();
        Trace.endSection();
    }

    public final sy f(CaptureRequest captureRequest) {
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) == captureRequest) {
                return (sy) this.c.get(i);
            }
        }
        throw new IllegalArgumentException(a.bC(list, captureRequest, "Failed to find CaptureRequest ", " in "));
    }

    public final void g(sy syVar, long j, rc rcVar) {
        this.j.q(this);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((ra) list.get(i)).d(syVar, j, rcVar);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = syVar.a().c.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((ra) syVar.a().c.get(i2)).d(syVar, j, rcVar);
        }
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        surface.getClass();
        Trace.beginSection("onCaptureBufferLost");
        Object obj = this.h.get(surface);
        if (obj == null) {
            throw new IllegalStateException("Unable to find the streamId for " + surface + " on frame " + ((Object) qd.a(j)));
        }
        int i = ((rh) obj).a;
        sy syVarF = f(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.d;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ra) list.get(i2)).b(syVarF, j, i);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = syVarF.a().c.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((ra) syVarF.a().c.get(i3)).b(syVarF, j, i);
        }
        Trace.endSection();
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        totalCaptureResult.getClass();
        b(captureRequest, totalCaptureResult, totalCaptureResult.getFrameNumber());
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        captureFailure.getClass();
        Trace.beginSection("onCaptureFailed");
        this.f.O(ufg.a);
        sy syVarF = f(captureRequest);
        g(syVarF, captureFailure.getFrameNumber(), new rr(syVarF, captureFailure));
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        captureResult.getClass();
        Trace.beginSection("onCaptureProgressed");
        captureResult.getFrameNumber();
        rw rwVar = new rw(captureResult, this.g);
        sy syVarF = f(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((ra) list.get(i)).k(syVarF, rwVar);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = syVarF.a().c.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((ra) syVarF.a().c.get(i2)).k(syVarF, rwVar);
        }
        Trace.endSection();
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        cameraCaptureSession.getClass();
        c(i);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
        cameraCaptureSession.getClass();
        d(i, j);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        e(captureRequest, j2, j);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onReadoutStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        Trace.beginSection("onReadoutStarted");
        sy syVarF = f(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((ra) list.get(i)).l(syVarF);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = syVarF.a().c.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((ra) syVarF.a().c.get(i2)).l(syVarF);
        }
        Trace.endSection();
        Trace.endSection();
    }

    public final String toString() {
        return "Camera2CaptureSequence-" + this.i;
    }
}
