package defpackage;

import android.hardware.Camera;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class emh extends enm {
    private final Camera.CameraInfo a;

    public emh(Camera.CameraInfo cameraInfo) {
        this.a = cameraInfo;
    }

    @Override // defpackage.enm
    public final int a() {
        return this.a.orientation;
    }

    @Override // defpackage.enm
    public final boolean b() {
        return this.a.facing == 0;
    }

    @Override // defpackage.enm
    public final boolean c() {
        return this.a.facing == 1;
    }
}
