package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.google.android.apps.camera.debug.metrics.CYLp.GdpuLBytnYW;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eaj extends eam {
    public eaj(Context context, gga ggaVar) {
        super(context, ggaVar);
    }

    @Override // defpackage.eam
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // defpackage.eam
    public final void c(Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        dwj.b();
        String str = eak.a;
        intent.getAction();
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode == -1980154005) {
                if (action.equals("android.intent.action.BATTERY_OKAY")) {
                    f(true);
                }
            } else if (iHashCode == 490310653 && action.equals("android.intent.action.BATTERY_LOW")) {
                f(false);
            }
        }
    }

    @Override // defpackage.eap
    public final /* bridge */ /* synthetic */ Object b() {
        Intent intentRegisterReceiver = this.a.registerReceiver(null, new IntentFilter(GdpuLBytnYW.dMJVeWRiBUNeIDl));
        if (intentRegisterReceiver != null) {
            return Boolean.valueOf(intentRegisterReceiver.getIntExtra("status", -1) == 1 || ((float) intentRegisterReceiver.getIntExtra("level", -1)) / ((float) intentRegisterReceiver.getIntExtra("scale", -1)) > 0.15f);
        }
        dwj.b();
        Log.e(eak.a, "getInitialState - null intent received");
        return false;
    }
}
