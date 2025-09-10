package defpackage;

import android.hardware.camera2.CameraManager;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sg extends CameraManager.AvailabilityCallback {
    final /* synthetic */ String a;
    final /* synthetic */ umk b;
    private final uly c = new uly(false, umc.a);

    public sg(String str, umk umkVar) {
        this.a = str;
        this.b = umkVar;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAccessPrioritiesChanged() {
        if (this.c.b()) {
            this.b.fW(true);
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        str.getClass();
        String str2 = this.a;
        if (a.ao(str, str2)) {
            Objects.toString(pp.a(str2));
            if (this.c.b()) {
                this.b.fW(true);
            }
        }
    }
}
