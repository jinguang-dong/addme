package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.ui.hotshot.yElM.PNlJufQ;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qzz extends BroadcastReceiver {
    public static volatile rnu a;
    public static volatile AmbientModeSupport.AmbientController b;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra == null) {
            return;
        }
        if (stringExtra.contains(PNlJufQ.yWTscEinXnrK) || stringExtra.contains("/..")) {
            Log.w("PhUpdateBroadcastRecv", a.bw(stringExtra, "Got an invalid config package for P/H that includes '..': ", ". Exiting."));
            return;
        }
        rnu rnuVar = a;
        if (rnuVar == null) {
            Log.w("PhUpdateBroadcastRecv", "No callback registered for P/H UPDATE broadcast. Exiting.");
            return;
        }
        qzm[] qzmVarArrA = ((qzl) rnuVar.a).a(stringExtra);
        if (qzmVarArrA != null) {
            for (qzm qzmVar : qzmVarArrA) {
                qzl qzlVar = qzm.a;
                qzmVar.a();
            }
        }
    }
}
