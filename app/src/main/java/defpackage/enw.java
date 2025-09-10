package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class enw {
    public static final int a;

    static {
        int i = -1;
        try {
            try {
                i = Class.forName("android.hardware.camera2.CameraCharacteristics").getField("CONTROL_SCENE_MODE_HDR").getInt(null);
            } catch (Exception e) {
                Log.e("LegacyVendorTags", "Error while reflecting on SCENE_MODE_HDR enum, HDR will not be available: " + e);
            }
        } finally {
            a = i;
        }
    }
}
