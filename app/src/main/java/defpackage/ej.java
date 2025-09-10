package defpackage;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class ej {
    private BroadcastReceiver a;
    final /* synthetic */ eo c;

    public ej(eo eoVar) {
        this.c = eoVar;
    }

    public abstract IntentFilter a();

    public abstract void b();

    final void c() {
        BroadcastReceiver broadcastReceiver = this.a;
        if (broadcastReceiver != null) {
            try {
                this.c.h.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException unused) {
            }
            this.a = null;
        }
    }

    final void d() {
        c();
        IntentFilter intentFilterA = a();
        if (intentFilterA.countActions() == 0) {
            return;
        }
        if (this.a == null) {
            this.a = new ei(this);
        }
        eo eoVar = this.c;
        eoVar.h.registerReceiver(this.a, intentFilterA);
    }
}
