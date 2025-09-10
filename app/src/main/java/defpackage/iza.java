package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Trace;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iza {
    public final Context a;

    public iza(Context context) {
        this.a = context;
    }

    public final void a() throws CameraAccessException {
        Trace.beginSection("prewarmCameraService");
        try {
            ((CameraManager) this.a.getSystemService("camera")).getCameraIdList();
        } catch (CameraAccessException unused) {
        }
        Trace.endSection();
    }
}
