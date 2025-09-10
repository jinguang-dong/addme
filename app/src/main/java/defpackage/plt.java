package defpackage;

import android.hardware.camera2.CameraManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class plt implements tzt {
    private final tzx a;
    private final /* synthetic */ int b;

    public plt(tzx tzxVar, int i) {
        this.b = i;
        this.a = tzxVar;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        return this.b != 0 ? b() : b();
    }

    public final CameraManager b() {
        if (this.b != 0) {
            CameraManager cameraManager = (CameraManager) ((imx) this.a.a()).a(imx.d);
            cameraManager.getClass();
            return cameraManager;
        }
        Object systemService = ((imm) this.a).b().getSystemService("camera");
        systemService.getClass();
        return (CameraManager) systemService;
    }
}
