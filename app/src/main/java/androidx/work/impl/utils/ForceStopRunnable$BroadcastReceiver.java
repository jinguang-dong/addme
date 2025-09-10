package androidx.work.impl.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.dwj;
import defpackage.ecx;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ForceStopRunnable$BroadcastReceiver extends BroadcastReceiver {
    static {
        dwj.a("ForceStopRunnable$Rcvr");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
            return;
        }
        dwj.b();
        long j = ecx.a;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent pendingIntentA = ecx.a(context, 167772160);
        long jCurrentTimeMillis = System.currentTimeMillis() + ecx.a;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, pendingIntentA);
        }
    }
}
