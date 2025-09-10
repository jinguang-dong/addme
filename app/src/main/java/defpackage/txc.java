package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class txc implements Runnable {
    final /* synthetic */ Activity a;
    final /* synthetic */ PendingIntent b;
    final /* synthetic */ int c;

    public txc(Activity activity, PendingIntent pendingIntent, int i) {
        this.a = activity;
        this.b = pendingIntent;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() throws IntentSender.SendIntentException {
        try {
            this.a.startIntentSenderForResult(this.b.getIntentSender(), this.c, null, 0, 0, 0);
        } catch (IntentSender.SendIntentException e) {
            Log.e("DaydreamApi", "Exception while starting next VR activity: ".concat(e.toString()));
        }
    }
}
