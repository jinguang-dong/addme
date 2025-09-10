package defpackage;

import com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle$LightCycleProgressCallback;
import com.google.android.apps.lightcycle.panorama.LightCycleNative;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jeb {
    public static final Object a = new Object();
    public static Boolean b = false;
    public static final Map c = new HashMap();
    public static final LightCycle$LightCycleProgressCallback d = new LightCycle$LightCycleProgressCallback(null);

    public static int a() {
        int iDeviceOrientationStatus;
        synchronized (a) {
            if (!b.booleanValue()) {
                throw new IllegalStateException("State is not ready.");
            }
            iDeviceOrientationStatus = LightCycleNative.DeviceOrientationStatus();
        }
        return iDeviceOrientationStatus;
    }

    public static void b(String str, float f) {
        synchronized (a) {
            LightCycleNative.ResetForPhotoSphereCapture(str, f);
            b = true;
        }
    }
}
