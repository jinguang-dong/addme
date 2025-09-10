package defpackage;

import android.app.Activity;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class inp {
    public static final sgv a = sgv.g("inp");
    public final Activity b;
    public final rww c;
    public final pfw d;
    public final luj e;
    public final hbj f;

    public inp(final boolean z, final boolean z2, final boolean z3, final boolean z4, Activity activity, pfw pfwVar, luj lujVar, hbj hbjVar) {
        this.b = activity;
        this.d = pfwVar;
        this.c = rnt.y(new rww() { // from class: ino
            @Override // defpackage.rww
            public final Object fr() {
                sbr sbrVar = new sbr();
                sbrVar.f(nkw.PORTRAIT, Boolean.valueOf(z));
                sbrVar.f(nkw.NIGHT_SIGHT, Boolean.valueOf(z2));
                sbrVar.f(nkw.TIME_LAPSE, Boolean.valueOf(z3));
                sbrVar.f(nkw.COTTAGE, Boolean.valueOf(z4));
                return sbrVar.b();
            }
        });
        this.e = lujVar;
        this.f = hbjVar;
    }

    public static final void d(Intent intent) {
        intent.removeExtra("com.google.assistant.extra.CAMERA_MODE");
        intent.removeExtra("com.google.assistant.extra.USE_FRONT_CAMERA");
        intent.removeExtra("com.google.assistant.extra.TIMER_DURATION_SECONDS");
        intent.removeExtra("com.google.assistant.extra.CAMERA_OPEN_ONLY");
        intent.removeExtra("com.google.assistant.extra.CAMERA_FLASH_MODE");
        intent.removeExtra("android.intent.extra.STILL_IMAGE_MODE");
        intent.removeExtra("android.intent.extra.FRONT_CAMERA");
        intent.removeExtra("android.intent.extra.USE_FRONT_CAMERA");
        intent.removeExtra("android.intent.extra.TIMER_DURATION_SECONDS");
    }

    public static final void e(Intent intent, boolean z) {
        if (intent.hasExtra("com.google.assistant.extra.CAMERA_OPEN_ONLY")) {
            return;
        }
        fdo.f(intent, "com.google.assistant.extra.CAMERA_OPEN_ONLY", Boolean.valueOf(z));
    }

    public final void a(Intent intent) {
        Activity activity = this.b;
        if (activity.isVoiceInteractionRoot() && activity.getIntent().hasExtra("com.google.assistant.extra.CAMERA_FLASH_MODE")) {
            String stringExtra = activity.getIntent().getStringExtra("com.google.assistant.extra.CAMERA_FLASH_MODE");
            Intent intent2 = activity.getIntent();
            int i = fdo.a;
            if (intent2 == null || !intent2.hasExtra("com.google.assistant.extra.CAMERA_FLASH_MODE") || !fdp.c.containsKey(intent2.getStringExtra("com.google.assistant.extra.CAMERA_FLASH_MODE"))) {
                fdo.f(intent, "launch_unknown_mode", true);
            } else {
                stringExtra.getClass();
                fdo.f(intent, "com.google.assistant.extra.CAMERA_FLASH_MODE", stringExtra);
            }
        }
    }

    public final void b(Intent intent) {
        Activity activity = this.b;
        if (activity.isVoiceInteractionRoot()) {
            fdo.f(intent, "com.google.assistant.extra.TIMER_DURATION_SECONDS", Integer.valueOf(fdo.b(activity.getIntent())));
        }
    }

    public final void c(Intent intent, boolean z) {
        if (this.b.isVoiceInteractionRoot()) {
            fdo.f(intent, "com.google.assistant.extra.USE_FRONT_CAMERA", Boolean.valueOf(z));
            return;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        fdo.f(intent, "android.intent.extra.FRONT_CAMERA", boolValueOf);
        fdo.f(intent, "android.intent.extra.USE_FRONT_CAMERA", boolValueOf);
    }
}
