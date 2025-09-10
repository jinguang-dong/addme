package defpackage;

import android.hardware.camera2.CameraManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hfu extends CameraManager.AvailabilityCallback {
    final /* synthetic */ AtomicBoolean a;

    public hfu(AtomicBoolean atomicBoolean) {
        this.a = atomicBoolean;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        this.a.set(true);
    }
}
