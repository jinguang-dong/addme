package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dzt extends ConnectivityManager.NetworkCallback {
    public static final dzt a = new dzt();
    public static final Object b = new Object();
    public static final Map c = new LinkedHashMap();

    private dzt() {
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        List<Map.Entry> listBN;
        network.getClass();
        networkCapabilities.getClass();
        dwj.b();
        int i = dzx.a;
        synchronized (b) {
            listBN = ske.bN(c.entrySet());
        }
        for (Map.Entry entry : listBN) {
            ((uiq) entry.getValue()).a(((NetworkRequest) entry.getKey()).canBeSatisfiedBy(networkCapabilities) ? dzn.a : new dzo(7));
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        List listBN;
        network.getClass();
        dwj.b();
        int i = dzx.a;
        synchronized (b) {
            listBN = ske.bN(c.values());
        }
        Iterator it = listBN.iterator();
        while (it.hasNext()) {
            ((uiq) it.next()).a(new dzo(7));
        }
    }
}
