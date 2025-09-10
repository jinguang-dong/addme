package defpackage;

import android.content.Intent;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class grz implements grx {
    public static final sgv a = sgv.g("grz");
    public final WifiConfiguration b;
    private final WifiManager c;
    private final jod d;
    private final iso e;

    public grz(WifiManager wifiManager, iso isoVar, WifiConfiguration wifiConfiguration, jod jodVar) {
        this.c = wifiManager;
        this.e = isoVar;
        this.b = wifiConfiguration;
        this.d = jodVar;
    }

    @Override // defpackage.grx
    public final void b() {
        WifiManager wifiManager = this.c;
        wifiManager.setWifiEnabled(true);
        WifiConfiguration wifiConfiguration = this.b;
        int iAddNetwork = wifiManager.addNetwork(wifiConfiguration);
        if (iAddNetwork != -1 && wifiManager.enableNetwork(iAddNetwork, true)) {
            this.e.s(R.string.qr_wifi_successfully_connecting, wifiConfiguration.SSID);
        } else {
            this.e.s(R.string.qr_wifi_error_could_not_connect, wifiConfiguration.SSID);
        }
        this.d.d(new Intent("android.settings.WIFI_SETTINGS"));
    }
}
