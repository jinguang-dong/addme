package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nyz extends BroadcastReceiver {
    final /* synthetic */ nza a;
    private final nzh b;
    private final Runnable c;

    public nyz(nza nzaVar, nzh nzhVar, Runnable runnable) {
        this.a = nzaVar;
        this.b = nzhVar;
        this.c = runnable;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            ((sgt) nza.a.b().M(5600)).v("NetworkBroadcastReceiver received an unexpected intent action: %s", intent.getAction());
            return;
        }
        if (intent.getBooleanExtra("noConnectivity", false)) {
            return;
        }
        intent.getAction();
        intent.getExtras();
        if (this.a.a(this.b)) {
            this.c.run();
        }
    }
}
