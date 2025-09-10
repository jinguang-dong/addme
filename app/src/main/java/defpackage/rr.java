package defpackage;

import android.hardware.camera2.CaptureFailure;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rr implements rc {
    private final CaptureFailure a;
    private final boolean b;

    public rr(sy syVar, CaptureFailure captureFailure) {
        syVar.getClass();
        this.a = captureFailure;
        captureFailure.getFrameNumber();
        captureFailure.getReason();
        this.b = captureFailure.wasImageCaptured();
    }

    @Override // defpackage.rc
    public final boolean a() {
        return this.b;
    }

    @Override // defpackage.ri
    public final Object c(ukx ukxVar) {
        int i = ukb.a;
        if (a.ao(ukxVar, new uji(CaptureFailure.class))) {
            return this.a;
        }
        return null;
    }
}
