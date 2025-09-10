package defpackage;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class obn extends BroadcastReceiver {
    static final String a = "obn";
    public final oar b;
    public boolean c;
    public boolean d;

    public obn(oar oarVar) {
        this.b = oarVar;
    }

    private final oam e() {
        return this.b.b();
    }

    private final obm f() {
        return this.b.d();
    }

    public final Context a() {
        return this.b.a;
    }

    public final void b() {
        f();
        e();
    }

    public final void c() {
        if (this.c) {
            this.b.d().q("Unregistering connectivity change receiver");
            this.c = false;
            this.d = false;
            try {
                a().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                f().o("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    protected final boolean d() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) a().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnected()) {
                    return true;
                }
            }
        } catch (SecurityException unused) {
        }
        return false;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        b();
        oar oarVar = this.b;
        String action = intent.getAction();
        oarVar.d().r("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean zD = d();
            if (this.d != zD) {
                this.d = zD;
                oam oamVarE = e();
                oamVarE.r("Network connectivity status changed", Boolean.valueOf(zD));
                oamVarE.e().b(new ntd(oamVarE, 16, null));
                return;
            }
            return;
        }
        if (!"com.google.analytics.RADIO_POWERED".equals(action)) {
            oarVar.d().u("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        if (intent.hasExtra(a)) {
            return;
        }
        oam oamVarE2 = e();
        oamVarE2.q("Radio powered up");
        oamVarE2.z();
        Context contextD = oamVarE2.d();
        if (!obr.a(contextD) || !obu.d(contextD)) {
            oamVarE2.b(null);
            return;
        }
        Intent intent2 = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
        intent2.setComponent(new ComponentName(contextD, "com.google.android.gms.analytics.AnalyticsService"));
        contextD.startService(intent2);
    }
}
