package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lqe {
    public static final sgv a = sgv.g("lqe");

    public static boolean a(Intent intent) {
        if (intent == null) {
            return false;
        }
        String action = intent.getAction();
        return "android.media.action.STILL_IMAGE_CAMERA_SECURE".equals(action) || "android.media.action.IMAGE_CAPTURE_SECURE".equals(action) || intent.getBooleanExtra("secure_camera", false);
    }
}
