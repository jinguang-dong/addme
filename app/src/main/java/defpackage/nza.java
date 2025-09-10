package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class nza {
    public static final sgv a = sgv.g("nza");
    public final Context b;
    public final ScheduledExecutorService c;
    public final long d;
    private final ConnectivityManager e;

    public nza(Context context, ScheduledExecutorService scheduledExecutorService, long j) {
        if (clu.a(context, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            throw new IllegalStateException("AndroidConnectivityHandler requires the ACCESS_NETWORK_STATE permission.");
        }
        this.b = context;
        this.c = scheduledExecutorService;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
        connectivityManager.getClass();
        this.e = connectivityManager;
        this.d = j;
    }

    public final boolean a(nzh nzhVar) {
        NetworkCapabilities networkCapabilities;
        if (nzhVar == nzh.a) {
            return true;
        }
        ConnectivityManager connectivityManager = this.e;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasCapability(12)) {
            return false;
        }
        if (nzhVar.c && connectivityManager.isActiveNetworkMetered()) {
            return false;
        }
        scn scnVar = nzhVar.d;
        if (scnVar.contains(nzg.ANY)) {
            return true;
        }
        nzg nzgVar = networkCapabilities.hasTransport(0) ? nzg.CELLULAR : networkCapabilities.hasTransport(1) ? nzg.WIFI : networkCapabilities.hasTransport(2) ? nzg.BLUETOOTH : networkCapabilities.hasTransport(3) ? nzg.ETHERNET : networkCapabilities.hasTransport(4) ? nzg.CELLULAR : null;
        if (nzgVar == null) {
            return false;
        }
        return scnVar.contains(nzgVar);
    }
}
