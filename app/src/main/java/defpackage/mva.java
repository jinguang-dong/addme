package defpackage;

import android.content.Context;
import android.provider.Settings;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mva {
    private static final sgv b = sgv.g("mva");
    public final Context a;

    public mva(Context context) {
        this.a = context;
    }

    private final boolean c(String str) {
        try {
            String string = Settings.Secure.getString(this.a.getContentResolver(), "accessibility_button_targets");
            if (string == null) {
                return false;
            }
            return string.contains(str);
        } catch (RuntimeException unused) {
            ((sgt) b.c().M(5061)).s("button service not found.");
            return false;
        }
    }

    private final boolean d(String str) {
        try {
            String string = Settings.Secure.getString(this.a.getContentResolver(), "accessibility_shortcut_target_service");
            if (string == null) {
                return false;
            }
            return string.contains(str);
        } catch (RuntimeException unused) {
            ((sgt) b.c().M(5062)).s("volume service not found.");
            return false;
        }
    }

    public final boolean a() {
        if (!d("com.android.server.accessibility.MagnificationController") && !c("com.android.server.accessibility.MagnificationController")) {
            try {
                if (Settings.Secure.getInt(this.a.getContentResolver(), "accessibility_display_magnification_enabled") != 1) {
                    return false;
                }
            } catch (Exception unused) {
                ((sgt) b.c().M(5060)).s("magnification triple tap not found.");
                return false;
            }
        }
        return true;
    }

    public final boolean b() {
        return d("com.google.android.marvin.talkback") || c("com.google.android.marvin.talkback");
    }
}
