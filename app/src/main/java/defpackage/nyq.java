package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.wear.ambient.AmbientModeSupport;
import java.util.Calendar;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nyq extends BroadcastReceiver {
    final /* synthetic */ nyr a;

    public nyq(nyr nyrVar) {
        this.a = nyrVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.TIMEZONE_CHANGED".equals(intent.getAction())) {
            Object obj = ((AmbientModeSupport.AmbientController) this.a.d).a;
            Calendar.getInstance();
        }
    }
}
