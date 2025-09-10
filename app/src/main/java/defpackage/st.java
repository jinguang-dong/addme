package defpackage;

import android.hardware.camera2.CameraManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class st extends CameraManager.AvailabilityCallback {
    final /* synthetic */ sv a;
    final /* synthetic */ uqx b;

    public st(sv svVar, uqx uqxVar) {
        this.a = svVar;
        this.b = uqxVar;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        str.getClass();
        this.a.b(this.b, str, true);
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
        str.getClass();
        this.a.b(this.b, str, false);
    }
}
