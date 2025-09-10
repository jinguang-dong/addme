package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nbx extends BroadcastReceiver {
    final /* synthetic */ nby a;

    public nbx(nby nbyVar) {
        this.a = nbyVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action != null && action.hashCode() == -1538406691 && action.equals("android.intent.action.BATTERY_CHANGED")) {
            this.a.a(intent);
        }
    }
}
