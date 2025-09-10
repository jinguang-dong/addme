package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lpy implements jhh, jgz, jhf, jhg, jgw {
    public final pbc a;
    private final Context d;
    private final feb e;
    public boolean b = false;
    boolean c = false;
    private final BroadcastReceiver g = new lpw(this);
    private final BroadcastReceiver h = new lpx(this);
    private boolean f = false;

    public lpy(Context context, feb febVar, pbb pbbVar) {
        this.d = context;
        this.e = febVar;
        this.a = pbbVar.a("ActivityCloseSec");
    }

    public final void b() {
        if (this.f) {
            this.a.b("Detaching secure activity shutdown receivers.");
            try {
                this.d.unregisterReceiver(this.h);
            } catch (IllegalArgumentException e) {
                this.a.f("unregisterReceiver screenOffReceiver fail".concat(String.valueOf(e.getMessage())));
            }
            try {
                this.d.unregisterReceiver(this.g);
            } catch (IllegalArgumentException e2) {
                this.a.f("unregisterReceiver screenOnReceiver fail".concat(String.valueOf(e2.getMessage())));
            }
            this.f = false;
        }
    }

    public final void c(String str) {
        b();
        this.e.a(str);
    }

    @Override // defpackage.jhf
    public final void ej() {
        this.b = true;
    }

    @Override // defpackage.jgz
    public final void et() {
        b();
    }

    @Override // defpackage.jhg
    public final void eu() {
        this.b = false;
        if (this.c) {
            c("Already received ScreenOff broadcast so closing the activity.");
        }
    }

    @Override // defpackage.jgw
    public final void w() {
        if (this.f) {
            return;
        }
        this.a.f("Attaching secure activity shutdown receivers.");
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        Context context = this.d;
        context.registerReceiver(this.h, intentFilter);
        context.registerReceiver(this.g, new IntentFilter("android.intent.action.SCREEN_ON"));
        this.f = true;
    }
}
