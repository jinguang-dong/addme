package defpackage;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lqc {
    public final Context a;
    public final uem b;
    public final Class c;
    public lpz d;
    public final luj e;
    private final boolean f;
    private final Activity g;
    private final KeyguardManager h;
    private final cxb i;

    public lqc(cxb cxbVar, Activity activity, uem uemVar, boolean z, Class cls, KeyguardManager keyguardManager, luj lujVar) {
        this.i = cxbVar;
        this.a = activity.getApplicationContext();
        this.f = z;
        this.g = activity;
        this.c = cls;
        this.b = uemVar;
        this.h = keyguardManager;
        this.e = lujVar;
    }

    private final void d(Activity activity, KeyguardManager.KeyguardDismissCallback keyguardDismissCallback) {
        if (this.f) {
            lpz lpzVar = this.d;
            if (lpzVar != null) {
                lpzVar.p();
            }
            KeyguardManager keyguardManager = this.h;
            if (keyguardManager.isDeviceLocked()) {
                uem uemVar = this.b;
                int i = ((itl) uemVar.a()).h;
                ((itl) uemVar.a()).k(3);
                keyguardManager.requestDismissKeyguard(activity, new lqa(this, i, keyguardDismissCallback));
                return;
            }
            lpz lpzVar2 = this.d;
            if (lpzVar2 != null) {
                lpzVar2.q();
            }
            keyguardDismissCallback.onDismissSucceeded();
        }
    }

    public final void a(KeyguardManager.KeyguardDismissCallback keyguardDismissCallback) {
        if (this.f) {
            d(this.g, keyguardDismissCallback);
        } else {
            keyguardDismissCallback.onDismissSucceeded();
        }
    }

    public final void b(Intent intent, boolean z) {
        if (!this.f) {
            this.i.h(intent);
        } else {
            d(this.g, new lqb(this, z, intent));
        }
    }

    public final void c(Intent intent) {
        b(intent, true);
    }
}
