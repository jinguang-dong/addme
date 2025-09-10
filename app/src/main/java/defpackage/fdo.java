package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.build.data.JKx.wzgaYJqO;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdo {
    public static final /* synthetic */ int a = 0;
    private static final nkw b = nkw.PHOTO;

    public static float a(Intent intent) {
        return intent.getFloatExtra("override_screen_brightness", -1.0f);
    }

    public static int b(Intent intent) {
        int intExtra = intent.hasExtra("com.google.assistant.extra.TIMER_DURATION_SECONDS") ? intent.getIntExtra("com.google.assistant.extra.TIMER_DURATION_SECONDS", 0) : intent.getIntExtra("android.intent.extra.TIMER_DURATION_SECONDS", 0);
        if (intExtra < 3) {
            return 3;
        }
        if (intExtra > 30) {
            return 30;
        }
        return intExtra;
    }

    public static kox c(Intent intent) {
        kox koxVar = kox.OFF;
        if (intent.hasExtra("com.google.assistant.extra.CAMERA_FLASH_MODE")) {
            String stringExtra = intent.getStringExtra("com.google.assistant.extra.CAMERA_FLASH_MODE");
            sbv sbvVar = fdp.c;
            if (sbvVar.containsKey(stringExtra)) {
                return (kox) sbvVar.get(stringExtra);
            }
        }
        return koxVar;
    }

    public static rwc d(Intent intent) {
        Bundle extras = intent == null ? null : intent.getExtras();
        return extras == null ? rvk.a : rwc.i((Uri) extras.getParcelable("output"));
    }

    public static void e(Intent intent) {
        intent.putExtra("com.google.assistant.extra.CAMERA_OPEN_ONLY", true);
    }

    public static void f(Intent intent, String str, Object obj) {
        intent.getClass();
        if (obj instanceof String) {
            intent.putExtra(str, (String) obj);
        } else if (obj instanceof Integer) {
            intent.putExtra(str, ((Integer) obj).intValue());
        } else {
            if (!(obj instanceof Boolean)) {
                throw new IllegalArgumentException("Not found corresponding type.");
            }
            intent.putExtra(str, ((Boolean) obj).booleanValue());
        }
    }

    public static boolean g(Intent intent) {
        return intent.hasExtra("android.intent.extra.USE_FRONT_CAMERA") || intent.hasExtra("android.intent.extra.FRONT_CAMERA") || intent.hasExtra("com.google.assistant.extra.USE_FRONT_CAMERA");
    }

    public static boolean h(Intent intent) {
        return "power_double_tap".equals(intent.getStringExtra("com.android.systemui.camera_launch_source")) || intent.getIntExtra("com.android.systemui.camera_launch_source", -1) == 1;
    }

    public static boolean j(Intent intent) {
        return intent.getBooleanExtra("com.google.assistant.extra.CAMERA_OPEN_ONLY", false);
    }

    public static boolean k(Intent intent) {
        if (intent != null) {
            return intent.getBooleanExtra("launch_from_remote_control", false);
        }
        return false;
    }

    public static boolean l(String str) {
        return "android.media.action.STILL_IMAGE_CAMERA".equals(str) || "android.media.action.STILL_IMAGE_CAMERA_SECURE".equals(str);
    }

    public static boolean m(Intent intent) {
        return intent.getAction() != null && "android.media.action.STILL_IMAGE_CAMERA_SECURE".equals(intent.getAction()) && intent.hasExtra("com.google.assistant.extra.OPEN_IN_VIDEO_MODE");
    }

    public static boolean n(Intent intent) {
        if (intent == null) {
            return false;
        }
        if (intent.hasExtra("com.google.assistant.extra.CAMERA_MODE")) {
            return "WIDE_ANGLE".equals(intent.getStringExtra("com.google.assistant.extra.CAMERA_MODE"));
        }
        if (intent.hasExtra("android.intent.extra.STILL_IMAGE_MODE")) {
            return "WIDE_ANGLE".equals(intent.getStringExtra("android.intent.extra.STILL_IMAGE_MODE"));
        }
        return false;
    }

    public static nkw o(Intent intent, hbj hbjVar) {
        nkw nkwVarS = b;
        if (intent != null) {
            String action = intent.getAction();
            nkwVarS = ("android.media.action.VIDEO_CAMERA".equals(action) || m(intent)) ? s(nkw.VIDEO, intent) : "android.media.action.VIDEO_CAPTURE".equals(action) ? nkw.VIDEO_INTENT : ("android.media.action.IMAGE_CAPTURE".equals(action) || "android.media.action.IMAGE_CAPTURE_SECURE".equals(action)) ? nkw.IMAGE_INTENT : s(nkwVarS, intent);
        }
        return (hbjVar.p(gzp.k) && nkwVarS == nkw.IMAX) ? nkw.SERENGETI : nkwVarS;
    }

    public static boolean p(cxb cxbVar) {
        Intent intentG = cxbVar.g();
        if (intentG == null) {
            return false;
        }
        String action = intentG.getAction();
        return "android.media.action.VIDEO_CAPTURE".equals(action) || "android.media.action.IMAGE_CAPTURE".equals(action) || "android.media.action.IMAGE_CAPTURE_SECURE".equals(action);
    }

    public static boolean q(cxb cxbVar) {
        Intent intentG = cxbVar.g();
        return intentG != null && l(intentG.getAction()) && (intentG.hasExtra("android.intent.extra.TIMER_DURATION_SECONDS") || intentG.hasExtra("com.google.assistant.extra.TIMER_DURATION_SECONDS")) && !j(intentG);
    }

    public static boolean r(cxb cxbVar) {
        String action;
        Intent intentG = cxbVar.g();
        if (intentG == null || (action = intentG.getAction()) == null || j(intentG)) {
            return false;
        }
        return action.equals("android.media.action.VIDEO_CAMERA") || m(intentG);
    }

    private static nkw s(nkw nkwVar, Intent intent) {
        if (intent.hasExtra("com.google.assistant.extra.CAMERA_MODE")) {
            String stringExtra = intent.getStringExtra("com.google.assistant.extra.CAMERA_MODE");
            sbv sbvVar = fdp.a;
            return sbvVar.containsKey(stringExtra) ? (nkw) sbvVar.get(stringExtra) : nkwVar;
        }
        if (!intent.hasExtra("android.intent.extra.STILL_IMAGE_MODE")) {
            return nkwVar;
        }
        String stringExtra2 = intent.getStringExtra("android.intent.extra.STILL_IMAGE_MODE");
        sbv sbvVar2 = fdp.b;
        return sbvVar2.containsKey(stringExtra2) ? (nkw) sbvVar2.get(stringExtra2) : nkwVar;
    }

    public static boolean i(Intent intent) {
        return intent.getBooleanExtra("android.intent.extra.USE_FRONT_CAMERA", false) || intent.getBooleanExtra("android.intent.extra.FRONT_CAMERA", false) || intent.getBooleanExtra(wzgaYJqO.Nqs, false);
    }
}
