package defpackage;

import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rw implements qc {
    public final CaptureResult a;
    public final String b;

    public rw(CaptureResult captureResult, String str) {
        captureResult.getClass();
        str.getClass();
        this.a = captureResult;
        this.b = str;
    }

    @Override // defpackage.qc
    public final long a() {
        return this.a.getFrameNumber();
    }

    @Override // defpackage.qc
    public final Object b(CaptureResult.Key key) {
        return this.a.get(key);
    }

    @Override // defpackage.ri
    public final Object c(ukx ukxVar) {
        throw null;
    }

    public final String toString() {
        return "FrameMetadata(camera: " + ((Object) pp.a(this.b)) + ", frameNumber: " + this.a.getFrameNumber() + ')';
    }
}
