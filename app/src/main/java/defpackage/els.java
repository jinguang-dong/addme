package defpackage;

import android.hardware.camera2.CameraCharacteristics;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class els extends enm {
    private final CameraCharacteristics a;

    public els(CameraCharacteristics cameraCharacteristics) {
        this.a = cameraCharacteristics;
    }

    @Override // defpackage.enm
    public final int a() {
        return ((Integer) this.a.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
    }

    @Override // defpackage.enm
    public final boolean b() {
        return ((Integer) this.a.get(CameraCharacteristics.LENS_FACING)).equals(1);
    }

    @Override // defpackage.enm
    public final boolean c() {
        return ((Integer) this.a.get(CameraCharacteristics.LENS_FACING)).equals(0);
    }
}
