package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import defpackage.dwj;
import defpackage.dyj;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    private static final String a = dwj.a("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        dwj.b();
        Objects.toString(intent);
        try {
            dyj dyjVarA = dyj.a(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            synchronized (dyj.a) {
                BroadcastReceiver.PendingResult pendingResult = dyjVarA.h;
                if (pendingResult != null) {
                    pendingResult.finish();
                }
                dyjVarA.h = pendingResultGoAsync;
                if (dyjVarA.g) {
                    dyjVarA.h.finish();
                    dyjVarA.h = null;
                }
            }
        } catch (IllegalStateException e) {
            dwj.b();
            Log.e(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
