package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rtw extends BroadcastReceiver {
    final /* synthetic */ rtr a;

    public rtw(rtr rtrVar) {
        this.a = rtrVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        Bundle extras = intent.getExtras();
        if ("com.google.android.play.core.install.ACTION_INSTALL_STATUS".equals(action) && extras != null && extras.containsKey("install.status")) {
            int i = extras.getInt("install.status");
            if (i == 1 || i == 2 || i == 3) {
                this.a.a(rts.ACCEPTED);
            } else if (i == 4) {
                this.a.a(rts.COMPLETED);
            } else {
                if (i != 6) {
                    return;
                }
                this.a.a(rts.CANCELLED);
            }
        }
    }
}
